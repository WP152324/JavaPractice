/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * <pre>
 * org.dimigo.collection
 *   |_Melonchart
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 6. 12.
 * </pre>
 *
 * @author : 이태근
 * @version : 1.0
 */
public class MelonChart {
	public static void main(String[] args) {
		List<Music> list = new ArrayList<Music>();
		list.add(new Music("I luv it", "PSY"));
		list.add(new Music("맞지", "언니쓰"));
		System.out.println("--<<멜론 차트>>--");
		printList(list);
		System.out.println();
		list.add(1, new Music("SIGNAL", "TWICE"));
		System.out.println("--<<2위 곡 추가>>--");
		printList(list);
		System.out.println();
		list.set(2, new Music("팔레트", "아이유"));
		System.out.println("--<<3위 곡 변경>>--");
		printList(list);
		System.out.println();
		list.remove(1);
		System.out.println("--<<2위 곡 삭제>>--");
		printList(list);
		System.out.println();
		list.clear();
		printList(list);
		System.out.println("--<<전체 리스트 삭제>>--");
	}

	public static void printList(List<Music> list) {
		for (int i = 0; i < list.size(); i++){
			System.out.println(i + 1 + ". " + list.get(i));
		}
	}
}
