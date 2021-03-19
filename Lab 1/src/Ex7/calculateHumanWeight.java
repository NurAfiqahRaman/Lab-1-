package Ex7;

import java.util.Scanner;

public class calculateHumanWeight {
	private static double weightOnEarth;
	private double weightOnMars;
	public static void main(String args[]) {
		//get weigth from user
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter a weight on Earth (kg): ");
		double weigthOnEarth=0.0;
		weigthOnEarth= sc.nextDouble();  
		
		weigthOnEarth=calculateWeightOnMars(weigthOnEarth);
		System.out.print("Weight on Mars= "+weigthOnEarth+" N");
		
	}
	
	public static double calculateWeightOnMars(double weightOnEarth)
	{
		double weightOnMars=0.38*weightOnEarth;
		return weightOnMars;
	}
	
	public double getWeightOnEarth() {
		return weightOnEarth;
	}
	public void setWeightOnEarth(double weightOnEarth) {
		this.weightOnEarth = weightOnEarth;
	}
	public double getWeightOnMars() {
		return weightOnMars;
	}
	public void setWeightOnMars(double weightOnMars) {
		this.weightOnMars = weightOnMars;
	}
	
}
