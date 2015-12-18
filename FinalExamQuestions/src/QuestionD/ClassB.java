package QuestionD;

public class ClassB extends ClassA {

	int b;	
	
	protected ClassB(int a, int b)
	{
		super(a);
		setB(b);
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	
}
