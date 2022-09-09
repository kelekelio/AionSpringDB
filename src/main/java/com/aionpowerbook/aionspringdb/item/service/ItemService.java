package com.aionpowerbook.aionspringdb.item.service;

import com.aionpowerbook.aionspringdb.item.entity.Item;
import com.aionpowerbook.aionspringdb.item.repository.ItemDataTablesRepository;
import com.aionpowerbook.aionspringdb.item.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;
    private final ItemDataTablesRepository itemDataTablesRepository;

    public List<Item> findAll() {
        return itemRepository.findAll();
    }
}
