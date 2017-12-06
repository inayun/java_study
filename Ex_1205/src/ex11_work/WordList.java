package ex11_work;

import java.util.Random;

public class WordList {

	String[] wordArr = {"APPLE","ORANGE","HOPE","VIEW","CHANGE"};
	String word; //�������� ���� �� �ܾ�
	String problem = ""; //�ܾ��� ������ �ٲ㼭 ���� ����
	int ranNum;
	char[] alphabets;
	boolean playing = true;

	//�������� �ܾ� �ϳ� �̱�
	public String PickWord() {

		word = wordArr[new Random().nextInt(wordArr.length)];
		alphabets = new char[word.length()];
		return word;
	}	

	//�ܾ��� ���ĺ� ���� �������� ����
	public String MakeProblem(String word) {

		outer : for(int i = 0; i < word.length();) {
			ranNum = new Random().nextInt(word.length());
			alphabets[i]=word.charAt(ranNum);
			for(int j = 0; j < i; j++) {
				if(alphabets[j]==alphabets[i]) {
					continue outer;
				}
			}
			i++;
		}
	for(char alphabet : alphabets) {
		problem += alphabet;
	}
	return problem;
	}


	//�����
	public void CheckAnswer(String input) {

		if(input.equalsIgnoreCase(word)) {
			System.out.println(input + "��(��)�����Դϴ�.");
		} else {
			System.out.println(input + "��(��)�����Դϴ�.");
		}
	}

}
