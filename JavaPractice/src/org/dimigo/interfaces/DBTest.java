/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_DBTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 *
 * @author : 이태근
 * @version : 1.0
 */
public class DBTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("<<변경 전>>");
		crud(IDBManager.getDBObject("SYBASE"));
		System.out.println("<<변경 후>>");
		crud(IDBManager.getDBObject("ORACLE"));
	}
	private static void crud(IDBManager db){ 
		db.insert();
		db.search();
		db.update();
		db.delete();
		System.out.println();
	}
	
}
