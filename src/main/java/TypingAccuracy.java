public class TypingAccuracy 
{
    private String referenceSentence, typedSentence;
    private int correctChars;
    private double accuracy;

    //Default constructor
    public TypingAccuracy() 
    {
        this.referenceSentence = referenceSentence;
        this.correctChars = 0;
        this.accuracy = 0.0;
    }

    //Setter and getters for constructor
    public void setTypedSentence(String typedSentence) 
    {
        this.typedSentence = typedSentence;
    }

    public String getTypedSentence() 
    {
        return typedSentence;
    }

    public void setRefenceSentence(String referenceSentence) 
    {
        this.referenceSentence = referenceSentence;
    }

    public String getRefenceSentence() 
    {
        return referenceSentence;
    }

    public double getAccuracy() 
    {
        return accuracy;
    }

    //Recursive method adds one per correct characters
    private int countCorrectChars(String reference, String typed, int index) 
    {
        //base case checks if index is out of bounds
        if (index >= reference.length() || index >= typed.length()) 
        {
            return 0;
        }
        if (reference.charAt(index) == typed.charAt(index)) 
        {
            return 1 + countCorrectChars(reference, typed, index + 1);
        } 
        else 
        {
            return countCorrectChars(reference, typed, index + 1);
        }
    }

    //Grabs correct count and calculates percentage based on number of characters.
    public void calculateAccuracy() 
    {
        correctChars = countCorrectChars(referenceSentence, typedSentence, 0);
        accuracy = ((double) correctChars / referenceSentence.length()) * 100;
    }
}
