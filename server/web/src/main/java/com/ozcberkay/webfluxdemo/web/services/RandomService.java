package com.ozcberkay.webfluxdemo.web.services;

import com.ozcberkay.webfluxdemo.web.models.Client;
import org.springframework.stereotype.Service;

import java.nio.charset.Charset;
import java.util.Random;

@Service
public class RandomService implements IRandomService {

    @Override
    public String generateRandomString() {
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        return new String(array, Charset.forName("UTF-8"));
    }

    @Override
    public Client generateClient() {
        Client client = new Client();
        client.setName(this.generateRandomString());
        return client;
    }


}
