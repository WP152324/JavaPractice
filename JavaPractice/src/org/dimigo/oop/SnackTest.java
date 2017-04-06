package org.dimigo.oop;

public class SnackTest {

	public static void main(String[] args) {
		Snack[] snacks = null;
		snacks = new Snack[3];
		snacks[0]=new Snack("새우깡","농심",1100,2);
		snacks[1]=new Snack("콘칲","크라운",1200,1);
		snacks[2]=new Snack("허니버터칩","해태",1500,4);
		int sum=0;
		for(Snack s:snacks){
		System.out.println(String.format(s.toString()+"\n"));
		sum+=s.calcPrice();
		}
		System.out.println(String.format("총 구매 금액 : %,d원",sum));
		
		

	}
}


