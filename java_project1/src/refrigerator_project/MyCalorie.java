package refrigerator_project;

import java.util.ArrayList;
import java.util.Scanner;

public class MyCalorie {
	//���̵𺰷� ��Ƴ��� ���ĵ� �޸��忡 �� ����ϱ�

	private ArrayList<Food> foodArr = null;
	private User user = null;
	private Scanner scanner;


	public User getUser() {
		return user;
	}

	public boolean calculator(User user, ArrayList<Food> foodArr) {

		this.foodArr = foodArr;
		this.user = user;
		float myCalorie = 0;
		float standard  = 600;

		System.out.println("<���� Į�θ� ���� ����Ʈ>");

		for(int i = 0; i < user.getFoodList().size(); i++) {
			System.out.printf("%d. %s \n", i+1, user.getFoodList().get(i).getFoodName());
		}

		for(Food food : user.getFoodList()) {
			myCalorie += food.getCalorie();
		}

		System.out.println("���� Į�θ� : " + myCalorie + "cal");
		System.out.println();

		if(  myCalorie - standard < 0 ) {
			//���ϸ�������
			System.out.println("(x_x)"+" �����װ���" );
		}else if( 0 <= myCalorie - standard &&  myCalorie - standard < 200  ) {
			System.out.println("(;_;)"+"����ļ� ������"); //������
		}else if( 201 <= myCalorie - standard &&  myCalorie - standard < 400  ) {
			System.out.println("( +_+)"+"�����.."); //������
		}else if( 401 <= myCalorie - standard &&  myCalorie - standard < 600  ) {
			System.out.println("( o_o)"+"������?"); //����
		}else if( 601 <= myCalorie - standard &&  myCalorie - standard < 800  ) {
			System.out.println(" ( o _o)"+"����Ű���"); //���ݶ׶�
		}else if( 801 <= myCalorie - standard &&  myCalorie - standard < 1000  ) {
			System.out.println("  ( ' ��  ')"+"Į�θ��ʰ� �׶�"); //�׶�
		}else if( 1001 <= myCalorie - standard &&  myCalorie - standard < 1200  ) {
			System.out.println("  ( -  ��   - )"+"�ʹ����̸���"); //���̶׶�
		}else if( 1201 <= myCalorie - standard &&  myCalorie - standard < 1400  ) {
			System.out.println("( ; -  �Ѥ�    -  )"+"���𼱼�����"); //�ɰ��Ѷ׶�
		}else if( 1401 <= myCalorie - standard &&  myCalorie - standard < 1600  ) {
			System.out.println("( ; -    X    -)"+"����");//�ն׶�
		}

		System.out.println("------------------------------");

		if(myCalorie == 0) {
			return false;
		} 
		return true;
	}

	public boolean DeleteMyfood(User user) {
		this.user = user;
		int count;
		scanner = new Scanner(System.in);

		outer : while(true) {
			count = 0;
			System.out.print("���� Į�θ� ���Ͽ��� '����'�ϰ� ���� ������ '�̸�'�� �Է����ּ���(�޴�����:m) : ");
			String input = scanner.nextLine();

			if(input.equalsIgnoreCase("m")) {
				return true;
			}

			for(int i = 0; i < user.getFoodList().size(); i++) {

				if(user.getFoodList().get(i).getFoodName().equals(input)) {
					user.deleteFoodList(i);
					System.out.println("���� �Ϸ�!");
					continue outer;
				} else {
					count++;
				}
			}
			if(count == user.getFoodList().size()) {
				System.out.println("�Է��� �ùٸ��� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
				continue outer;
			}
		} //while
	}
}
