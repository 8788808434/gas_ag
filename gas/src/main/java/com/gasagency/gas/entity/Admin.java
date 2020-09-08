package com.gasagency.gas.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name="txn_admin")
public class Admin 
{
	private Integer adminId;
	private String name;
}
