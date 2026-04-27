package com.priya.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priya.shop.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {
}
