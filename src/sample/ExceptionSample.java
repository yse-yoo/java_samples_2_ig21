package sample;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionSample {

	public static void main(String[] args) {
		float average = 0;
		
		average = calculateAverage(100, 5);
		System.out.println(average);

		average = calculateAverage(100, 0);
		System.out.println(average);
	}

	public static float calculateAverage(int score, int count) {
		float average = 0;
		
		if (count > 0) {
			average = score / count;
		} else {
			System.out.println("個数が間違っています。");
		}
		return average;
	}
	
	/**
	 * ファイル読み込み
	 * 
	 * @param path
	 */
	public static void loadFile(String path) {
		try {
			FileReader reader = new FileReader(path);
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが読み込めませんでした");
		}
		
	}
	
}
