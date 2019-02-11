package com.ozcberkay.webfluxdemo.web.controllers;

import com.ozcberkay.webfluxdemo.web.models.Client;
import com.ozcberkay.webfluxdemo.web.repositories.ClientRepository;
import com.ozcberkay.webfluxdemo.web.services.RandomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/client")
public class ClientController {

    private final ClientRepository clientRepository;

    private final RandomService randomService;

    @Autowired
    public ClientController(ClientRepository clientRepository, RandomService randomService) {
        this.clientRepository = clientRepository;
        this.randomService = randomService;

    }

    @GetMapping(value = "/all", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @GetMapping(value = "/add")
    public Mono<Client> insertClient() {
        return clientRepository.insert(this.randomService.generateClient());
    }


//    @GetMapping(value = "/all", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
//    public Flux<User> getAllUsers() {
//        return Flux.merge(userRepository.findAll(), topicData.publish().autoConnect());
//    }
//
//    @GetMapping(value = "/add")
//    public Mono<User> saveUser() {
//        User user = new User();
//        user.setOnline(true);
//        user.setName("deneme" + new Random().nextInt());
//        sink.next(user);
//
//        return this.userRepository.save(user);
//    }

}
