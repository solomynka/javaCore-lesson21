package lesson21;

import java.io.Serializable;

public class Car implements Serializable{

	@CarAnnotation("its great")
	private String model;
	@CarAnnotation("the turtle is faster")
	private int speed;
	private int yearOfModel;
	
	
	public Car(String model, int yearOfModel, int speed) {
		super();
		this.model = model;
		this.yearOfModel = yearOfModel;
		this.speed = speed;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYearOfModel() {
		return yearOfModel;
	}
	public void setYearOfModel(int yearOfModel) {
		this.yearOfModel = yearOfModel;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", yearOfModel=" + yearOfModel + ", speed=" + speed + "]";
	}
	
	
}
