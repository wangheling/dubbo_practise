package com.dubbo.study.service;

import org.apache.dubbo.config.annotation.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author whl
 * @description
 * @date 2019/08/20 21:42
 */
/*
 *org.apache.dubbo.config.annotation.Service
 *注意是dubbo的@Service
 */
@Service(loadbalance = "random", timeout = 50000, cluster = "failfast")
public class TestDubboService implements ITestDubboService {

    @Override
    public String testDubbo(String str) {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "dubbo test success:" + str;
    }
}
