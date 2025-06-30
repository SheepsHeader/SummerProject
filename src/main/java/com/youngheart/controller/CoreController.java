package com.youngheart.controller;

import com.youngheart.domain.vo.core.CoreResult;
import com.youngheart.service.CoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/core")
public class CoreController {

    @Autowired
    private CoreService coreService;

    @GetMapping
    public CoreResult core() {
        return coreService.getCoreInfo();
    }

}
