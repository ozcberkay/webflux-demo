package com.ozcberkay.webfluxdemo.web.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "clients")
@Data
public class Client {

    @Id
    private String id;

    private String name;

}
