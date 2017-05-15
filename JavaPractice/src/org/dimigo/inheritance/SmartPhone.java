/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_SmartPhone
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 12.
 * </pre>
 *
 * @author : 이태근
 * @version : 1.0
 */
public class SmartPhone {
	private String model;
	private String company;
	private int price;

	public SmartPhone() {
		
	}

	public SmartPhone(String model, String company, int price) {
		this.model = model;
		this.company = company;
		this.price = price;
	}

	public void turnOn() {
		System.out.printf("%s의 전원을 켭니다.",model);
		System.out.println();
	}

	public void turnOff() {
		System.out.printf("%s의 전원을 끕니다.",model);
		System.out.println();
	}

	public void pay() {
		System.out.println();
	}

	public void useSpecialFunction(SmartPhone phone){
		if(phone instanceof IPhone){
			((IPhone)phone).useAirDrop();
		}
		if(phone instanceof Galaxy){
			((Galaxy)phone).useWirelessCharging();
		}
	}

	public String toString(){
		return "모델명 : "+model+", 제조사 : "+ company+", 가격 : "+price; 
	}

}
