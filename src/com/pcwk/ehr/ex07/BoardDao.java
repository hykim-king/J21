/**
 * 파일명:BoardDao.java <br/>
 * 생성일:2025-04-15
 */
package com.pcwk.ehr.ex07;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class BoardDao {

	

	public BoardDao() {
		super();

	}
    /**
     * board 리스트를 돌려 줍니다.
     * @return List<Board>
     */
	public List<Board> getBoardList(){
		List<Board> list =new ArrayList<Board>();
		//내용
		list.add(new Board("제목1", "내용1"));
		list.add(new Board("제목2", "내용2"));
		list.add(new Board("제목3", "내용3"));
		
		return list;
	}
}
