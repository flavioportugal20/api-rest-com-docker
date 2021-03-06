package br.com.uniciv.testapidocker;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MessageRepository extends MongoRepository<Message, UUID> {

}
