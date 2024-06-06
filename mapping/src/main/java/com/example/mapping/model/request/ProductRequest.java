package com.example.mapping.model.request;

import com.example.mapping.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductRequest {

 private Long productId;

 private String productName;

 private double price;

 private double quantity;

 private User user;


}
