package com.aionpowerbook.aionspringdb.item.service;

import com.aionpowerbook.aionspringdb.item.entity.Item;
import com.aionpowerbook.aionspringdb.item.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    public Item findById(Long id) {
        return itemRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(String.format("Item with ID %s not found.", id)));
    }
}
