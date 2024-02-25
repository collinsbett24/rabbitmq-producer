package com.blins.rabbitmqproducer.controller;

import com.blins.rabbitmqproducer.config.RabbitConfig;
import com.blins.rabbitmqproducer.dto.AccountBalanceResponse;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/balance")
public class AccountBalanceController {

    @Autowired
    private  RabbitTemplate template;

    @GetMapping("/{test}")
    public String message(@PathVariable String test){
        AccountBalanceResponse response=new AccountBalanceResponse("Naomi is", test);
        template.convertAndSend(RabbitConfig.EXCHANGE_NAME,RabbitConfig.ROUTING_KEY_NAME,response.toString());
        return "Message Sent";
    }
}
