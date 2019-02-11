package com.ozcberkay.webfluxdemo.web.repositories;

import com.ozcberkay.webfluxdemo.web.models.Client;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientRepository extends ReactiveMongoRepository<Client, String> {

    @Override
    Flux<Client> findAll();

    @Override
    <S extends Client> Mono<S> insert(S s);
}

