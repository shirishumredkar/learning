public class FinalVariable {
	
	final private int num;
	
	FinalVariable(int num)
	{
		this.num =num;
	}
	
	public int getNum()
	{
		return num;
	}
	
	/*
	 * public void setNum(int num) // If we try to use Setter it gives error for
	 * final variable { this.num = num; }
	 */

}
