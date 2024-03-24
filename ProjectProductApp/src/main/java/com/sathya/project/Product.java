package com.sathya.project;

import java.io.InputStream;
import java.sql.Date;

public class Product {

	private String ProId;
	private String ProName;
	private double ProPrice;
	private String ProBrand;
	private String ProMadeIn;
	private Date ProMfgDate;
	private Date ProExpDate;
	private InputStream ProImage;
	public String getProId() {
		return ProId;
	}
	public void setProId(String proId) {
		ProId = proId;
	}
	public String getProName() {
		return ProName;
	}
	public void setProName(String proName) {
		ProName = proName;
	}
	public double getProPrice() {
		return ProPrice;
	}
	public void setProPrice(double proPrice) {
		ProPrice = proPrice;
	}
	public String getProBrand() {
		return ProBrand;
	}
	public void setProBrand(String proBrand) {
		ProBrand = proBrand;
	}
	public String getProMadeIn() {
		return ProMadeIn;
	}
	public void setProMadeIn(String proMadeIn) {
		ProMadeIn = proMadeIn;
	}
	public Date getProMfgDate() {
		return ProMfgDate;
	}
	public void setProMfgDate(Date proMfgDate) {
		ProMfgDate = proMfgDate;
	}
	public Date getProExpDate() {
		return ProExpDate;
	}
	public void setProExpDate(Date proExpDate) {
		ProExpDate = proExpDate;
	}
	public InputStream getProImage() {
		return ProImage;
	}
	public void setProImage(InputStream proImage) {
		ProImage = proImage;
	}
}
