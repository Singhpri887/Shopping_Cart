package com.priya.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priya.shop.entity.InventoryItem;

public interface InventoryRepository extends JpaRepository<InventoryItem, Integer> {
}
