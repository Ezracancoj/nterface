
public class Quiz implements Measurable {
	   private int testScore;
	
	   public Quiz(int testScore)
	   {
	      this.testScore = testScore;
	   }


	  public double getMeasure()
	   {
	      return testScore;
	   }

}
