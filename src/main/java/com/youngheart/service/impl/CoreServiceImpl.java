package com.youngheart.service.impl;

import com.youngheart.domain.vo.core.CoreResult;
import com.youngheart.domain.vo.core.DelayVO;
import com.youngheart.domain.vo.core.PrateVO;
import com.youngheart.mapper.CoreMapper;
import com.youngheart.service.CoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoreServiceImpl implements CoreService {

    @Autowired
    private CoreMapper coreMapper;

    @Override
    public CoreResult getCoreInfo() {
        List<DelayVO> delay = coreMapper.getAirlineDelay();
        for (DelayVO delayVO : delay){
            delayVO.setType(1);
        }
        List<DelayVO> delay1 = coreMapper.getAirportDelay();
        for (DelayVO delayVO : delay1){
            delayVO.setType(2);
        }
        List<DelayVO> delay2 = coreMapper.getLineDelay();
        for (DelayVO delayVO : delay2){
            delayVO.setType(3);
        }
        delay.addAll(delay1);
        delay.addAll(delay2);
        List<PrateVO> prate = coreMapper.getPrate();
        CoreResult coreResult = new CoreResult(delay, prate);
        return coreResult;
    }
}
