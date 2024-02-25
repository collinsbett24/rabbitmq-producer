package com.blins.rabbitmqproducer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AccountBalanceRequest {
    private String requestHeader;
    private  String getRequestBody;
    private String message;
}
