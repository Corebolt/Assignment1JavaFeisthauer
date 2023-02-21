public class WordFrequency implements Comparable<WordFrequency>{
    // part 8
    int index;
    Integer frequency;
    String word;
    static Integer nextIndex = 1000;

    public WordFrequency(String word, Integer frequency){
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

    @Override
    public int compareTo(WordFrequency otherWordFrequency)
    {
        int compareValue = 0;
        if(this.frequency > otherWordFrequency.frequency)
        {
            compareValue = 1;
        }
        if(this.frequency < otherWordFrequency.frequency)
        {
            compareValue = -1;
        }
        if(this.frequency == otherWordFrequency.frequency)
        {
            compareValue = 0;
        }
        return compareValue;
    }
    
}
