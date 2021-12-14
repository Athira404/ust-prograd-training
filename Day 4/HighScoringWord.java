public class Kata {

  public static String high(String s) {
    // Your code here...
  String highscoreWord = "";
        int maxTotal = 0;

        for (String word : s.split(" ")) {
            int totalOfWord = 0;
            for (char c : word.toCharArray()) {
                totalOfWord += c - 96; // the int value of "a" is 97
            }
            if (totalOfWord > maxTotal) {
                maxTotal = totalOfWord;
                highscoreWord = word;
            }
        }
        return highscoreWord;
    }
}