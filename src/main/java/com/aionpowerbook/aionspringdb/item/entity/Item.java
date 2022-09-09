package com.aionpowerbook.aionspringdb.item.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Item {

    @Id
    private Long id;

    private String name;
}
