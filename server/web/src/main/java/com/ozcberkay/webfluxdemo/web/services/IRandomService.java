package com.ozcberkay.webfluxdemo.web.services;

import com.ozcberkay.webfluxdemo.web.models.Client;

public interface IRandomService {

    String generateRandomString();

    Client generateClient();
}
