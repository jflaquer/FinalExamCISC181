package QuestionD;

public abstract class ClassA {
	
	private int a;
	
	private ClassA()
	{		
	}
	
	protected ClassA(int a)
	{
		setA(a);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	

}
