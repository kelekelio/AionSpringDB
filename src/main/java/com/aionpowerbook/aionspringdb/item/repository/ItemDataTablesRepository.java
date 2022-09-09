package com.aionpowerbook.aionspringdb.item.repository;

import com.aionpowerbook.aionspringdb.item.entity.Item;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemDataTablesRepository extends DataTablesRepository<Item, Long> {
}
