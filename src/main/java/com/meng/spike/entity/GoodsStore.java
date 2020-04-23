package com.meng.spike.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name="goods_store", schema = "seckill")
@Getter
@Setter
@ToString
public class GoodsStore implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String code;

    @Column(name="store")
    private int store;



}
