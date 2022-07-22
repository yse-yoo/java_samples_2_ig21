package sample;

public class ExceptionSample {

	public static void main(String[] args) {
		float average = 0;
		
		average = calculateAverage(100, 5);
		System.out.println(average);

		average = calculateAverage(100, 0);
		System.out.println(average);
	}

	public static float calculateAverage(int score, int count) {
		float average = score / count;
		return average;
	}
	
	
}
