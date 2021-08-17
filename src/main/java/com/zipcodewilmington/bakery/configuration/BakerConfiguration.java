package com.zipcodewilmington.bakery.configuration;

import com.zipcodewilmington.bakery.models.Baker;
import com.zipcodewilmington.bakery.services.BakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
@Configuration
public class BakerConfiguration {
        @Autowired
        private BakerService service;
        @PostConstruct
        public void setup(){
            service.create(new Baker());
            service.create(new Baker());
            service.create(new Baker());
        }
    }
