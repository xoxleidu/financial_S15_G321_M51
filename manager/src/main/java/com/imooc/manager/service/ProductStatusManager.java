package com.imooc.manager.service;

import com.imooc.api.events.ProductStatusEvent;
import com.imooc.entity.enums.ProductStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ProductStatusManager {

    private static Logger LOG = LoggerFactory.getLogger(ProductStatusManager.class);

    static final String MQ_DESTINATION = "VirtualTopic.PRODUCT_STATUS";

    @Autowired
    private JmsTemplate jmsTemplate;

    public void changeStatus(String id, ProductStatus status){

        ProductStatusEvent event = new ProductStatusEvent(id, status);

        LOG.info("MANAGER:{}",event);

        jmsTemplate.convertAndSend(MQ_DESTINATION,event);

    }

    /**
    @PostConstruct
    public void testmq(){
        changeStatus("006",ProductStatus.IN_SELL);
    }
    */

}
