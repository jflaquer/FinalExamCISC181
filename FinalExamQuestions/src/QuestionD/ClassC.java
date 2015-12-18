package QuestionD;

public class ClassC extends ClassB {

	private int c;
	
	public ClassC(int a, int b, int c)	
	{
		super(a,b);
		setC(c);
		
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	
	
	
}
