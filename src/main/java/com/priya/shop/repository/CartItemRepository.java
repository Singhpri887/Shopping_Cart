package com.priya.shop.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priya.shop.entity.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Integer> {
    Optional<CartItem> findByInventoryItemId(Integer inventoryItemId);
}
