/**
 * 
 */
package org.dimigo.inheritance;

/**asd
 * <pre>
 * org.dimigo.inheritance
 *   |_PersonTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 26.
 * </pre>
 *
 * @author 		: 이태근
 * @version		: 1.0
 */
public class PersonTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person[] persons={
				new Person("Tom"),
				new Korean("홍길동"),
				new Japanese("다나카"),
				new Chinese("왕밍")
		};
		for(Person p:persons){
			greeting(p);
			System.out.println();
			}
		}
	private static void greeting(Person p){
		System.out.println(p);
		p.sayHello();
		p.sayBye();
	}

}
