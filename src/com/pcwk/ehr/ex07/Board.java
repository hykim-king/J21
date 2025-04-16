/**
 * 파일명:Board.java <br/>
 * 생성일:2025-04-15
 */
package com.pcwk.ehr.ex07;


public class Board {

	private String title;
	private String content;

	public Board(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	
	
	
}
