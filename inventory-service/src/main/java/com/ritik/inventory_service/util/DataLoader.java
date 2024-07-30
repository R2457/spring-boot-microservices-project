package com.ritik.inventory_service.util;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ritik.inventory_service.model.Inventory;
import com.ritik.inventory_service.repository.InventoryRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {
	private final InventoryRepository inventoryRepository;
	
    @Override
    public void run(String... args) throws Exception {
    	Inventory inventory = new Inventory();
		inventory.setSkuCode("iPhone 15");
		inventory.setQuantity(100);
		
		Inventory inventory1 = new Inventory();
		inventory1.setSkuCode("iPhone 15 red");
		inventory1.setQuantity(0);
		
		inventoryRepository.save(inventory);
		inventoryRepository.save(inventory1);
    }
}
