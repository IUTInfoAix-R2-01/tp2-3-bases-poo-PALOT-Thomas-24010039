package exercice3ClassRectangle;

public class Rectangle {
	float length;
	float width;
	
	public Rectangle () { // Default constructor
		length = 1.0f;
		width = 1.0f;
	}
	
	public Rectangle (float length, float width) { // Second constructor
		this.length = length;
		this.width = width;
	}
	
	/** Returns the length */
	public float getLength () {
		return length;
	}
	
	/** Setter for instance variable length */
	public void setLength (float length) {
		this.length = length;
	}
	
	/** Returns the width */
	public float getWidth() {
		return width;
	}
	
	/** Setter for instance variable length */
	public void setWidth (float width) {
		this.width = width;
	}
	
	/** Returns the area */
	public double getArea () {
		return length * width;
	}
	
	/** Returns the perimeter */
	public double getPerimeter () {
		return 2*width + 2*length;
	}
	
	/** Returns a decriptive string of the instance */
	public String toString () {
		return "Rectangle[length = " + length + ", width = " + width + "]";
	}
}
