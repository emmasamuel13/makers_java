/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package game;

import java.util.ArrayList;

public class Game {
    String AnswerString;

    public Game(String Answer) {
        AnswerString = Answer;
    }



    public Integer Counter = 11;
    public ArrayList<String> HangmanArray = new ArrayList<>();

    public String TakeYourTurn(String Letter) {
        String[] AnswerArray = AnswerString.split("");
        Integer AnswerLength = AnswerArray.length;
        if (Counter == 11) {
            HangmanArray.add(AnswerArray[0]);
            for (Integer Times = 0; Times < AnswerLength - 1; Times++) {
                HangmanArray.add("-");
                Counter -= 1;
            }
        } else if (AnswerString.contains(Letter)) {
            for (Integer Index = 0; Index < AnswerLength; Index++) {
                if (AnswerArray[Index].equals(Letter)){
                    HangmanArray.set(Index, Letter);
                }
            }
        } else {
            Counter -= 1;
        }
        String HangmanString = String.join("", HangmanArray);
        return HangmanString;
    }

    public static void main(String[] args) {
    }
}
