package QuestionC;

public class Rectangle extends Shape {

	public Rectangle(int newx, int newy) {
		super(newx, newy);
	}

	@Override
	void draw() {
	}

	@Override
	public double ComputeArea() throws IllegalRectangle{
		if(this.getX()>0 && this.getY()>0) {
			return this.getX() * this.getY();
		}else{
			throw new IllegalRectangle( -this.getX(), -this.getY());
		}
		
	}
	
	

}
