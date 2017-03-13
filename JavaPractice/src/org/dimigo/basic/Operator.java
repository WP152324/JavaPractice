/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *		|_ Operator
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 13.
 *<pre>
 * 
 * @author 이태근
 * @version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long a1=1700000l;
		long a2=3l;
		long a3=1500l;
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 : "+String.format("%,d",a1)+"원");
		System.out.println("점포 내 직원 수 : "+String.format("%,d",a2)+"명");
		System.out.println("점포 수 : "+String.format("%,d",a3)+"개\n");
		System.out.println("연간 인건비 : "+String.format("%,d",a1*a2*a3*12)+"원");
	}

}
