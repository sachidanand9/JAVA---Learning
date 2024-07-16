//Count how many words present in the sentence ?

package String;

public class Count_words {

	public static int countWords(String st) {

		char[] ch = st.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ') {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {

		System.out.println(countWords(" hi java how are you "));
	}
}
