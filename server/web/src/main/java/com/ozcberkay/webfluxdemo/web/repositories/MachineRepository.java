package com.ozcberkay.webfluxdemo.web.repositories;

import com.ozcberkay.webfluxdemo.web.models.Machine;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.Tailable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MachineRepository extends ReactiveMongoRepository<Machine, String> {

    @Override
    Flux<Machine> findAll();

    @Override
    <S extends Machine> Mono<S> insert(S s);


}
