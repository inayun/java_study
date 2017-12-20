/*package controller;

import java.util.HashMap;

import model.BoardServiceImpl;
import model.DuplicateException;
import model.InexistentException;
import model.dto.Board;

public class BoardController {
	private static BoardServiceImpl boardService = BoardServiceImpl.getInstance();
	
		//모든 게시물 검색 (자료실, 사진)
		public static void getAllBoard() {
			HashMap<String, HashMap<String, Board>> allBoard = boardService.getBoardList();
			SuccessView.printBoard(allBoard);
		}
	
		//모든 자료실 or 모든 사진자료실 검색
		public static void getBoardByKind(String kind) {
			HashMap<String, Board> allboard = boardService.getBoardByKind(kind);
			
		}
		//글번호에 해당하는 게시물 검색
		public static void getBoardByno(String kind, int no) {
			try {
				Board board = boardService.getBoardByno(kind, no);
				SuccessView.printBoardByno(board);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				FailView.errorMessage("게시물을 검색할 수 없습니다.");
			}
			
		}
		
		//글번호에 해당하는 게시물 저장
		public static void insertBoard(String kind, Board board) {
			try {
				boardService.insertBoard(kind,board);
				SuccessView.successMessage("게시물이 저장되었습니다.");
			} catch (Exception e) {
				System.out.println(e.getMessage());
				FailView.errorMessage("게시물을 검색할 수 없습니다.");
			}
		}
		//글번호에 해당하는 게시물 수정
		public static void updateBoard(String kind, String subject, String content, int no) {
			try {
				boardService.updateBoard(kind,subject,content,no);
				SuccessView.successMessage("게시물이 수정되었습니다.");
			} catch (Exception e) {
				System.out.println(e.getMessage());
				FailView.errorMessage("게시물을 수정 할수 없습니다.");
			}
		}
		
		
		//글번호에 해당하는 게시물 삭제
		public static void deleteBoard(String kind, int no) {
			try {
				boardService.deleteBoard(kind,no);
				SuccessView.successMessage("게시물이 삭제되었습니다.");
			} catch (Exception e) {
				System.out.println(e.getMessage());
				FailView.errorMessage("게시물을 삭제 할 수 없습니다.");
			}
		}
		
}
*/