package ex11_work;

import java.util.Random;

public class WordList {

	String[] wordArr = {"APPLE","ORANGE","HOPE","VIEW","CHANGE"};
	String word; //랜덤으로 뽑은 한 단어
	String problem = ""; //단어의 순서를 바꿔서 만든 문제
	int ranNum;
	char[] alphabets;
	boolean playing = true;

	//랜덤으로 단어 하나 뽑기
	public String PickWord() {

		word = wordArr[new Random().nextInt(wordArr.length)];
		alphabets = new char[word.length()];
		return word;
	}	

	//단어의 알파벳 순서 무작위로 섞기
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


	//정답비교
	public void CheckAnswer(String input) {

		if(input.equalsIgnoreCase(word)) {
			System.out.println(input + "은(는)정답입니다.");
		} else {
			System.out.println(input + "은(는)오답입니다.");
		}
	}

}
