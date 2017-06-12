/**
 * 
 */
package org.dimigo.collection;

/**
 * <pre>
 * org.dimigo.collection
 *   |_Music
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 6. 12.
 * </pre>
 *
 * @author : 이태근
 * @version : 1.0
 */
public class Music {
	private String title;
	private String singer;

	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		title = this.title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		singer = this.singer;
	}

	public String toString() {
		return title + "(" + singer + ")";
	}

}
