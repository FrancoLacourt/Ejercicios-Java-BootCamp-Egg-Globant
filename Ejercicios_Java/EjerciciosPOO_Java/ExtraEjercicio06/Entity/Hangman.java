package Entity;

public class Hangman {
    
    private String [] word;
    private String secretWord;
    private int foundLetter;
    private int tries;

    public Hangman() {
    }

    public Hangman(int foundLetter, int tries) {
        this.foundLetter = foundLetter;
        this.tries = tries;
    }

    public String[] getWord() {
        return word;
    }

    public int getFoundLetter() {
        return foundLetter;
    }

    public int getTries() {
        return tries;
    }

    public String getSecretWord() {
        return secretWord;
    }
    
    

    public void setWord(String[] word) {
        this.word = word;
    }

    public void setFoundLetter(int foundLetter) {
        this.foundLetter = foundLetter;
    }

    public void setTries(int tries) {
        this.tries = tries;
    }

    public void setSecretWord(String secretWord) {
        this.secretWord = secretWord;
    }
}