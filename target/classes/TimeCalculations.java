import java.time.LocalTime;

/**
 *
 * @author Erik
 */
public class TimeCalculations 
{
   private double start, end, seconds, time;
   int typedChars, wpm;
   
   //Default Constructor
   public TimeCalculations()
   {
       this.start = 0.0;
       this.end = 0.0;
       this.seconds = 0.0;
       this.time = 0.0;
       this.typedChars = 0;
       this.wpm = 0;
   }
   
   //Setters and Getters for contructor
    public void setStart()
    {
        this.start = LocalTime.now().toNanoOfDay();
    }
    
    public double getStart()
    {
        return start;
    }
   
    public void setEnd()
    {
        this.end = LocalTime.now().toNanoOfDay();
    }
    
    public double getEnd()
    {
        return end;
    }
    
    
    //Calculations
    public void calculateSeconds(double seconds)
    {
        this.seconds = time / 1_000_000_000.0;
    }
    
    public double getSeconds()
    {
        return seconds;
    }
    
    public void calculateTime()
    {
        this.time = end - start;
    }
    
    public double getTime()
    {
        return start;
    }
    
    public void calculateTypedChars(String typedSentence)
    {
        this.typedChars = typedSentence.length();
    }
    
    public double getTypedChars()
    {
        return typedChars;
    }
    
    public void calculateWPM()
    {
        this.wpm = (int) (((double) (typedChars / 5) / seconds) * 60) ;
    }
    
    public double getWPM()
    {
        return wpm;
    }
}
