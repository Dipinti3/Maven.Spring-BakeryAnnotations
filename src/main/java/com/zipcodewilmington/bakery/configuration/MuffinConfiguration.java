package com.zipcodewilmington.bakery.configuration;

import com.zipcodewilmington.bakery.models.Baker;
import com.zipcodewilmington.bakery.models.Muffin;
import com.zipcodewilmington.bakery.services.BakerService;
import com.zipcodewilmington.bakery.services.MuffinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

    @Configuration
    public class MuffinConfiguration {
        @Autowired
        private MuffinService service;
        @PostConstruct
        public void setup(){
            service.create(new Muffin());
            service.create(new Muffin());
            service.create(new Muffin());
        }
    }
