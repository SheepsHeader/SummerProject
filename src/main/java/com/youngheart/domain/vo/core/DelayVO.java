package com.youngheart.domain.vo.core;

import lombok.Data;

@Data
public class DelayVO {
    private Integer type;//类型：1表示航司，2表示航线，3表示机场
    private String name;//名称
    private  String avgDelay;//延误的值
    


    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvgDelay() {
        return avgDelay;
    }

    public void setAvgDelay(String avgDelay) {
        this.avgDelay = avgDelay;
    }

}
