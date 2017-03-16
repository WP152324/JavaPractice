/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic |_ Loop 1. 개요 : 2. 작성일 : 2017. 3. 15.
 * 
 * <pre>
 * 
 * @author 이태근
 * @version : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int attack = 100;
		int temp1;
		String cha;
		String[] car = { "마법사", "영주", "기사", "농민" };
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("--------------------");
			System.out.println("<<게임메뉴>>");
			System.out.println("1.공격력 증가");
			System.out.println("2.공격력 감소");
			System.out.println("3.캐릭터 설정");
			System.out.println("9.종료");
			System.out.println("--------------------");
			System.out.printf("메뉴 입력 => ");
			temp1 = scanner.nextInt();
		switch (temp1) {
		case 1:
			attack += 10;
			System.out.println("공격력이 증가되었습니다. 현재 공격력 : " + attack);
			break;
		case 2:
			attack -= 10;
			System.out.println("공격력이 감소되었습니다. 현재 공격력 : " + attack);
		case 3:
			int num = new Random().nextInt(4);
			System.out.println(car[num]+"(으)로 설정되었습니다.");
			break;
		case 9:
			System.out.println("이제 공부하세요!");
			break;
		default:
			System.out.println("없는 메뉴입니다!!");
		}
		} while (temp1 != 9);

	}
}
