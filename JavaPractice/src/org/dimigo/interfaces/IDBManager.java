/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_IDBManager
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 *
 * @author 		: 이태근
 * @version		: 1.0
 */
public interface IDBManager {
	static final String ORACLE_DATABASE = "ORACLE";
	static final String SYBASE_DATABASE = "SYBASE";
	void insert();
	void search();
	void update();
	void delete();
	static IDBManager getDBObject(String database){
		IDBManager idbm = null;
		if(database.equals(ORACLE_DATABASE)){
			idbm = new OracleDB();
		}
		if(database.equals(SYBASE_DATABASE)){
			idbm = new SybaseDB();
		}
		return idbm;
	}
}
