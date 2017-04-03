/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop |_ Question 1. 개요 : 2. 작성일 : 2017. 3. 31.
 * 
 * <pre>
 * 
 * @author 이태근
 * @version : 1.0
 */
public class Question {
	String answer;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] questions = { "가장 좋아하는 가수는?", "가장 좋아하는 배우는?", "가장 좋아하는 과목은?" };
		String[] answers = { "소녀시대", "임윤아", "물리" };
		for (int i = 1; i <= 3; i++) {
			System.out.println(i+". "+questions[i-1]);
			String answer = scanner.nextLine();
			System.out.println((answer.equals( answers[i-1])) ? "정답입니다!" : "틀렸습니다!");
		}
		System.out.println("<<결과 출력>>");
		StringBuilder sb = new StringBuilder();
		for(int j=0;j<3;j++){
			sb.append(questions[j]+answers[j]+"\n");
		}
		System.out.println(sb.toString());

	}

}
