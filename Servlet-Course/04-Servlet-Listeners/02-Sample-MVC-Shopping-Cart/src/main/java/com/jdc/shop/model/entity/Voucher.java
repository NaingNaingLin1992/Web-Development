package com.jdc.shop.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Voucher implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private LocalDateTime saleDateTime;
	private String customer;
	private List<SaleItem> sales;

	public Voucher() {
		sales = new ArrayList<SaleItem>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getSaleDateTime() {
		return saleDateTime;
	}

	public void setSaleDateTime(LocalDateTime saleDateTime) {
		this.saleDateTime = saleDateTime;
	}

	public List<SaleItem> getSales() {
		return sales;
	}

	public void setSales(List<SaleItem> sales) {
		this.sales = sales;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}
	
	public int getCount() {
		
		var count = 0;
		for(SaleItem item : sales) {
			
			count += item.getCount();
		}
		return count;
	}
	
	public int getTotal() {
		
		var total = 0;
		for(SaleItem item : sales) {
			
			total += item.getTotal();
		}
		
		return total;
	}
	

}
