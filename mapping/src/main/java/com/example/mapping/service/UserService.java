package com.example.mapping.service;

import com.example.mapping.model.request.UserRequest;

public interface UserService {


    Object saveOrUpdate(UserRequest userRequest);

    Object getUserAndProductDetailsByUserId(Long userId) throws Exception;
}
