package com.aionpowerbook.aionspringdb.item.repository;

import com.aionpowerbook.aionspringdb.item.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
