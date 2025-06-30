package com.youngheart.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Map;

/**
 * Bean工具类，支持下划线命名的JSON字段到驼峰命名的Java属性的映射
 */
public class BeanUtil {

    /**
     * 将Map（下划线命名）转换为JavaBean（驼峰命名）
     */
    public static void copyMapToBean(Map<String, Object> sourceMap, Object targetBean) {
        if (sourceMap == null || targetBean == null) {
            return;
        }
        
        Class<?> clazz = targetBean.getClass();
        Field[] fields = clazz.getDeclaredFields();
        
        for (Field field : fields) {
            // 跳过静态字段和final字段
            if (Modifier.isStatic(field.getModifiers()) || Modifier.isFinal(field.getModifiers())) {
                continue;
            }
            
            try {
                field.setAccessible(true);
                String fieldName = field.getName(); // 获取Java属性名（驼峰式）
                
                // 生成下划线命名的JSON字段名（如departureCity -> departure_city）
                String jsonFieldName = camelToUnderline(fieldName);
                
                if (sourceMap.containsKey(jsonFieldName)) {
                    Object value = sourceMap.get(jsonFieldName);
                    if (value != null) {
                        // 类型转换并设置属性
                        Object convertedValue = convertType(value, field.getType());
                        field.set(targetBean, convertedValue);
                    }
                }
            } catch (Exception e) {
                System.err.println("复制属性 " + field.getName() + " 失败：" + e.getMessage());
            }
        }
    }
    
    /**
     * 驼峰命名转下划线命名（如departureCity -> departure_city）
     */
    private static String camelToUnderline(String camelStr) {
        if (camelStr == null || camelStr.isEmpty()) {
            return "";
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < camelStr.length(); i++) {
            char c = camelStr.charAt(i);
            if (Character.isUpperCase(c)) {
                if (i > 0) {
                    sb.append("_");
                }
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    
    /**
     * 简单的类型转换
     */
    private static Object convertType(Object value, Class<?> targetType) {
        if (targetType == String.class) {
            return value.toString();
        } else if (targetType == Integer.class || targetType == int.class) {
            return Integer.valueOf(value.toString());
        } else if (targetType == Double.class || targetType == double.class) {
            return Double.valueOf(value.toString());
        } else if (targetType == Boolean.class || targetType == boolean.class) {
            return Boolean.valueOf(value.toString());
        }
        return value;
    }
}