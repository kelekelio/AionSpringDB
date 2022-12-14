package com.aionpowerbook.aionspringdb.item.controller;

import com.aionpowerbook.aionspringdb.item.entity.Item;
import com.aionpowerbook.aionspringdb.item.service.ItemService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/items")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @GetMapping()
    public List<Item> getAllItems() {
        log.info("All items requested");
        return itemService.findAll();
    }

    @GetMapping("/{id}")
    public Item getItemById(@PathVariable("id") Long id) {
        log.info("Item with ID {} requested", id);
        return itemService.findById(id);
    }
}
