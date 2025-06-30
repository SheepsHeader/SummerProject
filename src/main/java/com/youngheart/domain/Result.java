package com.youngheart.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private Boolean success;
    private String errorMsg;
    private T data; // data 字段的类型就是 Result 的泛型 T
    private Long total;

    // 显式添加setter方法确保可用 (Lombok 会自动生成，但如果您不使用Lombok，则需要)
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public static <T> Result<T> ok() {
        Result<T> result = new Result<>();
        result.setSuccess(true);
        return result;
    }

    public static <T> Result<T> ok(T data) {
        Result<T> result = new Result<>();
        result.setSuccess(true);
        result.setData(data); // T 就是 data 的类型
        return result;
    }

    /**
     * 为返回列表数据和总数的成功结果。
     * 注意：这里的 <T> 仍然表示列表中元素的类型。
     * 返回的 Result 泛型为 List<T>，以正确匹配 data 字段的类型。
     */
    public static <T> Result<List<T>> ok(List<T> data, Long total) {
        // Result 的泛型现在是 List<T>，表示它包含一个 T 类型的列表
        Result<List<T>> result = new Result<>();
        result.setSuccess(true);
        result.setData(data); // data 是 List<T>，与 Result 的泛型 List<T> 匹配
        result.setTotal(total);
        return result;
    }

    public static <T> Result<T> fail(String errorMsg) {
        Result<T> result = new Result<>();
        result.setSuccess(false);
        result.setErrorMsg(errorMsg);
        return result;
    }
}