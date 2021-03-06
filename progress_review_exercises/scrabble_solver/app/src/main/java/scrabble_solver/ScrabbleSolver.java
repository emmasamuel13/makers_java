/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package scrabble_solver;

public class ScrabbleSolver {
    public Integer score(String ScrabbleInput) {
        String ScrabbleString = ScrabbleInput.toLowerCase();
        Integer ScrabbleScore = 0;
        String[] ScrabbleArray = ScrabbleString.split("");
        Integer ArrayLength = ScrabbleArray.length;
        for (Integer index = 0; index < ArrayLength; index++) {
            switch (ScrabbleArray[index]) {
                case "a": case "e": case "i":
                case "l": case "n": case "o":
                case "r": case "s": case "t":
                case "u":
                    ScrabbleScore += 1;
                    break;
                case "d": case "g":
                    ScrabbleScore += 2;
                    break;
                case "b": case "c": case "m":
                case "p":
                    ScrabbleScore += 3;
                    break;
                case "f": case "h": case "v":
                case "w": case "y":
                    ScrabbleScore += 4;
                    break;
                case "k":
                    ScrabbleScore += 5;
                    break;
                case "j": case "x":
                    ScrabbleScore += 8;
                    break;
                case "q": case "z":
                    ScrabbleScore += 10;
                    break;
                default:
                    ScrabbleScore += 0;
                    return ScrabbleScore;
            }
        }
        return ScrabbleScore;
    }
}
