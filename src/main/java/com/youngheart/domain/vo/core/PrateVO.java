package com.youngheart.domain.vo.core;

import lombok.Data;

//准点率VO
@Data
public class PrateVO {
    //航司名称
   private String name;
   //航司准点率
   private String punctuality;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPunctuality() {
        return punctuality;
    }

    public void setPunctuality(String punctuality) {
        this.punctuality = punctuality;
    }
}
