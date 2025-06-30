package com.youngheart.domain.vo.core;

import lombok.Data;

import java.util.List;

@Data
public class CoreResult {

    /**
     * 封装延迟信息，type 1:机场，2:航线，3:航空公司
     * 列表中每两个代表一个延迟信息，最大和最小的信息
     */
    private List<DelayVO> delayVO;
    /**
     * 封每个航司的准点率信息，其中有四个参数
     * 第一二个代表最大的两个准点率信息，第三个和第四个代表最小的两个准点率信息
     */
    private List<PrateVO> prateVO;


    public CoreResult(List<DelayVO> delayVO, List<PrateVO> prateVO) {
        this.delayVO = delayVO;
        this.prateVO = prateVO;
    }

    public CoreResult() {
    }

    public List<DelayVO> getDelayVO() {
        return delayVO;
    }

    public void setDelayVO(List<DelayVO> delayVO) {
        this.delayVO = delayVO;
    }

    public List<PrateVO> getPrateVO() {
        return prateVO;
    }

    public void setPrateVO(List<PrateVO> prateVO) {
        this.prateVO = prateVO;
    }
}
