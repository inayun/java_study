/*package controller;

import java.util.HashMap;

import model.BoardServiceImpl;
import model.DuplicateException;
import model.InexistentException;
import model.dto.Board;

public class BoardController {
	private static BoardServiceImpl boardService = BoardServiceImpl.getInstance();
	
		//��� �Խù� �˻� (�ڷ��, ����)
		public static void getAllBoard() {
			HashMap<String, HashMap<String, Board>> allBoard = boardService.getBoardList();
			SuccessView.printBoard(allBoard);
		}
	
		//��� �ڷ�� or ��� �����ڷ�� �˻�
		public static void getBoardByKind(String kind) {
			HashMap<String, Board> allboard = boardService.getBoardByKind(kind);
			
		}
		//�۹�ȣ�� �ش��ϴ� �Խù� �˻�
		public static void getBoardByno(String kind, int no) {
			try {
				Board board = boardService.getBoardByno(kind, no);
				SuccessView.printBoardByno(board);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				FailView.errorMessage("�Խù��� �˻��� �� �����ϴ�.");
			}
			
		}
		
		//�۹�ȣ�� �ش��ϴ� �Խù� ����
		public static void insertBoard(String kind, Board board) {
			try {
				boardService.insertBoard(kind,board);
				SuccessView.successMessage("�Խù��� ����Ǿ����ϴ�.");
			} catch (Exception e) {
				System.out.println(e.getMessage());
				FailView.errorMessage("�Խù��� �˻��� �� �����ϴ�.");
			}
		}
		//�۹�ȣ�� �ش��ϴ� �Խù� ����
		public static void updateBoard(String kind, String subject, String content, int no) {
			try {
				boardService.updateBoard(kind,subject,content,no);
				SuccessView.successMessage("�Խù��� �����Ǿ����ϴ�.");
			} catch (Exception e) {
				System.out.println(e.getMessage());
				FailView.errorMessage("�Խù��� ���� �Ҽ� �����ϴ�.");
			}
		}
		
		
		//�۹�ȣ�� �ش��ϴ� �Խù� ����
		public static void deleteBoard(String kind, int no) {
			try {
				boardService.deleteBoard(kind,no);
				SuccessView.successMessage("�Խù��� �����Ǿ����ϴ�.");
			} catch (Exception e) {
				System.out.println(e.getMessage());
				FailView.errorMessage("�Խù��� ���� �� �� �����ϴ�.");
			}
		}
		
}
*/