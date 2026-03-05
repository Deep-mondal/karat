package com.fsd.beans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // It indicates that class Employee is an Entity
@Table // make the table name as the class name in sql
//@Table(name="name of the table") // make the table name as delivered in sql
public class Employee {

	@Id // this column is id and id is unique and only indicator
	@GeneratedValue(strategy=GenerationType.IDENTITY)  //Auto increment of id
	@Column // indicate the column in sql
	private int id;

	@Column
	private String name;

	@Column
	private double salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
