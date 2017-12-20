/*package model;

import java.util.HashMap;

import model.dto.Board;


 * �������� ���� : ���� Ŭ�������� �ݵ�� ������ �ʼ� (override)
 * �ϴ� �ʿ��� �޼ҵ���� ��ȯŸ�� �޼ҵ�� �Ķ���ͱ����� �����س��� ������!
 * �ʿ伺 : ���� �ڵ���� ǥ��ȭ
 * ���� : framework ���� interface���� ����
 
public interface BoardServiceIF {

	//��� �Խù� �˻� (�ڷ��, ����)
	public HashMap<String, HashMap<String,Board>> getBoardList();

	//�Խ��� ������ ���� �˻�
	//��� �ڷ�� or ��� �����ڷ�� �˻�
	public HashMap<String, Board> getBoardByKind(String kind);
	
	//�۹�ȣ�� �ش��ϴ� �Խù� �˻�
	public Board getBoardByno(String kind, int no) throws InexistentException;
	
	//�۹�ȣ�� �ش��ϴ� �Խù� ����
	public void insertBoard(String kind, Board board) throws DuplicateException;
	
	//�۹�ȣ�� �ش��ϴ� �Խù� ����
	public void deleteBoard(String kind,int no) throws InexistentException;
	
	//�Խù� ���� ���翩�� üũ
	public boolean existBoardByKind(String kind, int no);
	
	
}
*/