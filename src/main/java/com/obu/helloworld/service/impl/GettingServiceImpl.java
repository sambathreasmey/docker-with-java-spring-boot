package com.obu.helloworld.service.impl;

import com.obu.helloworld.service.GettingService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GettingServiceImpl implements GettingService {

    @Value("${env.version}")
    String version;

    @Override
    public String getting() {
        return "\uD83C\uDF89 Welcome to OBU Microservices " +
                "| version : " +
                version;
    }
}
