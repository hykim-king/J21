/**
 * 파일명:Main.java <br/>
 * 생성일:2025-04-15
 */
package com.pcwk.ehr.ex07;

import java.util.List;

public class Main {


	public static void main(String[] args) {
		BoardDao  dao=new BoardDao();
		
		List<Board> list=dao.getBoardList();
		
		for(Board board   :list) {
			System.out.println(board.getTitle()+"-"+board.getContent());
		}

	}

}
