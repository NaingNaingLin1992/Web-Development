package com.jdc.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NonNull
	private String name;	
	@Enumerated(EnumType.STRING)
	@Column(columnDefinition = "varchar(10) default 'MEDIUM'")
	private Size size;
	@NonNull
	private Double price;
	@NonNull
	@ManyToOne
	private Category category;
	@NonNull
	private LocalDate createdDate;
	
	public enum Size{
		SMALL, MEDIUM, LARGE
	}
}
