public class WorldFrequency {

    int index;
    Integer frequency;
    String word;
    static Integer nextIndex = 1000;

    public WorldFrequency(String word, Integer frequency){
        this.word = word;
        this.frequency = frequency;
        this.index = nextIndex++;
    }

    public String getWord()
    {
        return word;
    }

    public void setWord(String newWord)
    {
        this.word = newWord;
    }

    @Override
    public String toString() {
        return "Word = " + this.word + " Frequency = " + frequency;
    }
}
