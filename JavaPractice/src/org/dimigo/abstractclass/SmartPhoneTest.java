/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_SmartPhoneTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 12.
 * </pre>
 *
 * @author 		: 이태근
 * @version		: 1.0
 */
public class SmartPhoneTest {
	public static void main(String[]args){
		SmartPhone[] sps={
			new IPhone("IPhone","애플",900000),
			new Galaxy("갤럭시S8","삼성",800000),
		};
		for(SmartPhone phone: sps){
			System.out.println(phone);
			phone.turnOn();
			phone.pay();
			phone.useSpecialFunction();
			phone.turnOff();
			System.out.println();
		}
	}
}
