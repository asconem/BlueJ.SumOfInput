/**
 * This program returns the sum of numbers 1 to n, where n is represented by the parameter numberToSum
 *
 * @author (Matthew Ascone)
 * @version (2/5/20)
 */
public class SumOfInput
{
    // instance variables - replace the example below with your own
    private Integer sum;

    /**
     * Constructor for objects of class SumOfInput
     */
    public SumOfInput()
    {
        // initialise instance variables
        sum = 0;
    }

    public Integer oneToNumber(Integer numberToSum){
      sum = 0;
      for (int i = 1; i <= numberToSum; i++) {
        sum += i;
      }
        return sum;
    }

}
