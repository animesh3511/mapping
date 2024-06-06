package com.example.mapping.repository;

import com.example.mapping.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {



  @Query(value = "SELECT u.user_id, u.contact, u.first_name, u.last_name, p.product_id, p.price, p.product_name, p.quantity " +
          "FROM user u INNER JOIN product p on u.user_id = p.user_id WHERE u.user_id = :userId ",nativeQuery = true)
  List<Map<String,Object>> getUserAndProductDetailsByUserId(Long userId);

}
