package org.dimigo.oop;

public class Snack {

	String name;
	String company;
	int price;
	int number;
	public Snack(){
		
	}
	public Snack(String name, String company, int price, int number) {
		this.name = name;
		this.company = company;
		this.price = price;
		this.number = number;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int calcPrice(){
		return price*number;
	}
	public String toString(){
		return "이름 : "+this.name+"\n제조사 : "+this.company+"\n"+String.format("가격 : %,d원\n",this.price)+"개수 : "+this.number+"개\n";
		}
	}
	
	
	


