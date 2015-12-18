package QuestionB;

public class Circle extends Shape implements iShape, iCircleRead {
	
	/*
	 * Field - Radius.  Stores the value of the radius for the shape.
	 */
	private int radius;
	final double PI = 3.14159;
			
	// constructor
	public Circle(int newx, int newy, int newradius) {
		super(newx, newy);
		setRadius(newradius);
	}

	/*
	 * {@link Circle#radius}
	 */
	/* (non-Javadoc)
	 * @see QuestionB.iCircleRead#getRadius()
	 */
	@Override
	public int getRadius() {
		return radius;
	}

	/*
	 * {@link Circle#radius}
	 */
	public void setRadius(int newradius) {
		radius = newradius;
	}

	/* (non-Javadoc)
	 * @see QuestionB.iCircleRead#ComputeArea()
	 */
	@Override
	public double ComputeArea()
	{
		return this.radius * this.radius * PI;
	}
	// draw the circle
	/* (non-Javadoc)
	 * @see QuestionB.iCircleRead#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Drawing a Circle at:(" + getX() + ", " + getY()
				+ "), radius " + getRadius());
	}
}