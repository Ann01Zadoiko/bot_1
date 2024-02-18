package com.example.please.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByChatId(Long chatId);
    boolean existsByChatId(Long chatId);

}
