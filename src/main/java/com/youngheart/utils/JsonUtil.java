package com.youngheart.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * JSON 工具类，封装 Jackson 的常用操作
 */
public class JsonUtil {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    static {
        // 配置 ObjectMapper
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
    }

    /**
     * 将对象转换为 JSON 字符串
     * @param object 待转换的对象
     * @return JSON 字符串
     */
    public static String toJson(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("对象转JSON失败", e);
        }
    }

    /**
     * 将 JSON 字符串转换为指定类型的对象
     * @param json JSON 字符串
     * @param clazz 目标对象类型
     * @param <T> 泛型
     * @return 转换后的对象
     */
    public static <T> T toObject(String json, Class<T> clazz) {
        try {
            return objectMapper.readValue(json, clazz);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("JSON转对象失败", e);
        }
    }

    /**
     * 将 JSON 字符串转换为 List
     * @param json JSON 字符串
     * @param elementType 列表元素类型
     * @param <T> 泛型
     * @return 对象列表
     */
    public static <T> List<T> toList(String json, Class<T> elementType) {
        try {
            return objectMapper.readValue(json, 
                    objectMapper.getTypeFactory().constructCollectionType(List.class, elementType));
        } catch (JsonProcessingException e) {
            throw new RuntimeException("JSON转List失败", e);
        }
    }

    /**
     * 将 JSON 字符串转换为复杂类型（如 List<Map<String, Object>>）
     * @param json JSON 字符串
     * @param typeReference 类型引用
     * @param <T> 泛型
     * @return 转换后的对象
     */
    public static <T> T toComplexType(String json, TypeReference<T> typeReference) {
        try {
            return objectMapper.readValue(json, typeReference);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("JSON转复杂类型失败", e);
        }
    }

    /**
     * 读取 resources 目录下的 JSON 文件并返回内容
     * @param filePath 文件路径（相对于 resources 目录）
     * @return JSON 字符串
     */
    public static String readJsonFromResource(String filePath) {
        try {
            ClassPathResource resource = new ClassPathResource(filePath);
            return new String(Files.readAllBytes(resource.getFile().toPath()), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException("读取JSON文件失败", e);
        }
    }

    /**
     * 解析 JSON 对象并获取指定路径的值
     * @param json JSON 字符串
     * @param path JSON 路径（如 "data.list[0].name"）
     * @return 路径对应的值
     */
    public static String getJsonPathValue(String json, String path) {
        try {
            JsonNode rootNode = objectMapper.readTree(json);
            JsonNode targetNode = rootNode.at(path);
            return targetNode.isMissingNode() ? null : targetNode.asText();
        } catch (JsonProcessingException e) {
            throw new RuntimeException("解析JSON路径失败", e);
        }
    }

    /**
     * 将 JSON 对象转换为 Map
     * @param json JSON 字符串
     * @return Map 对象
     */
    public static Map<String, Object> toMap(String json) {
        try {
            return objectMapper.readValue(json, new TypeReference<Map<String, Object>>() {});
        } catch (JsonProcessingException e) {
            throw new RuntimeException("JSON转Map失败", e);
        }
    }
}