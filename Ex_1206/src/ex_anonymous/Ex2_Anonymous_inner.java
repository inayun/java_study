package ex_anonymous;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex2_Anonymous_inner {

	public static void main(String[] args) {
		
		Frame f = new Frame();
		Button btn = new Button("����");
		
		f.setSize(300,300);
		f.add(btn);
		f.setVisible(true);
		
		//����� ���� ���� ��ư�� �̺�Ʈ ���̱�
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//System.exit(0);
				System.out.println("Ŭ����");
			}
		});
	}
}
