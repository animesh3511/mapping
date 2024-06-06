package com.example.mapping.model.request;

import com.example.mapping.model.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserRequest {

    private Long userId;

    private String userName;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private String location;

    private double contact;

    private List<Product> products;


}
