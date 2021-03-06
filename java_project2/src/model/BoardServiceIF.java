/*package model;

import java.util.HashMap;

import model.dto.Board;


 * 강제적인 스펙 : 하위 클래스에서 반드시 재정의 필수 (override)
 * 일단 필요한 메소드들의 반환타입 메소드명 파라미터까지만 정의해놓음 간단히!
 * 필요성 : 개발 코드들의 표준화
 * 참고 : framework 들은 interface들의 조합
 
public interface BoardServiceIF {

	//모든 게시물 검색 (자료실, 사진)
	public HashMap<String, HashMap<String,Board>> getBoardList();

	//게시판 유형에 따른 검색
	//모든 자료실 or 모든 사진자료실 검색
	public HashMap<String, Board> getBoardByKind(String kind);
	
	//글번호에 해당하는 게시물 검색
	public Board getBoardByno(String kind, int no) throws InexistentException;
	
	//글번호에 해당하는 게시물 저장
	public void insertBoard(String kind, Board board) throws DuplicateException;
	
	//글번호에 해당하는 게시물 삭제
	public void deleteBoard(String kind,int no) throws InexistentException;
	
	//게시물 종류 존재여부 체크
	public boolean existBoardByKind(String kind, int no);
	
	
}
*/