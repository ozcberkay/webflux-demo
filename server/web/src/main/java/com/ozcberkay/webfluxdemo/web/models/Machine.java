package com.ozcberkay.webfluxdemo.web.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "machines")
@Data
public class Machine {

    @Id
    private String id;

    private String token;


}
