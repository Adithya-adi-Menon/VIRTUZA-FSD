package com.example.backend.repository;


import com.example.backend.model.CartModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepo extends JpaRepository<CartModel,Long>{

    List<CartModel> findById(long email);
}
