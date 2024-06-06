package com.example.mapping.serviceimpl;

import com.example.mapping.model.Product;
import com.example.mapping.model.User;
import com.example.mapping.model.request.UserRequest;
import com.example.mapping.repository.UserRepository;
import com.example.mapping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;


    @Override
    public Object saveOrUpdate(UserRequest userRequest) {

        if (userRepository.existsById(userRequest.getUserId()))
        {
            User user = userRepository.findById(userRequest.getUserId()).get();

            user.setUserId(userRequest.getUserId());
            user.setUserName(userRequest.getUserName());
            user.setFirstName(userRequest.getFirstName());
            user.setLastName(userRequest.getLastName());
            user.setEmail(userRequest.getEmail());
            user.setPassword(userRequest.getPassword());
            user.setLocation(userRequest.getLocation());
            user.setContact(userRequest.getContact());
            user.setProducts(userRequest.getProducts());

            for (Product product : user.getProducts()) {
                product.setUser(user);
            }

            userRepository.save(user);
            return "user updated succesfully";
        }
        else
        {

            User user = new User();

            user.setUserId(userRequest.getUserId());
            user.setUserName(userRequest.getUserName());
            user.setFirstName(userRequest.getFirstName());
            user.setLastName(userRequest.getLastName());
            user.setEmail(userRequest.getEmail());
            user.setPassword(userRequest.getPassword());
            user.setLocation(userRequest.getLocation());
            user.setContact(userRequest.getContact());
            user.setProducts(userRequest.getProducts());

            for (Product product : user.getProducts()) {
                product.setUser(user);
            }

            userRepository.save(user);

            return "user saved succesfully";


        }



    }
}
