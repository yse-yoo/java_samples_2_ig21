package sample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionSample {

	public static void main(String[] args) {
		float average = 0;

		average = calculateAverage(100, 5);
		System.out.println(average);

		average = calculateAverage(100, 0);
		System.out.println(average);

		average = calculateAverage(100, -1);
		System.out.println(average);

		// ファイル読み込み
		loadFile("sample.txt");

		try {
			loadFile2("sample.txt");
		} catch (IOException e) {
			System.out.println("ファイルが読み込めませんでした");
		}
	}

	public static float calculateAverage(int score, int count) {
		float average = 0;
		
		// 個数がマイナス		
		if (count < 0) {
			throw new IllegalArgumentException("個数がマイナスです");
		}

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
	 * @throws IOException 
	 */
	public static void loadFile2(String path) throws IOException {
		FileReader reader = new FileReader(path);
		BufferedReader buffer = new BufferedReader(reader);
		String line;
		while ((line = buffer.readLine()) != null) {
			System.out.println(line);
		}
		//バッファーを終了
		buffer.close();
		//ファイルを終了
		reader.close();
		System.out.println("ファイルを読み込みました");
	}

	/**
	 * ファイル読み込み
	 * 
	 * @param path
	 */
	public static void loadFile(String path) {
		try {
			FileReader reader = new FileReader(path);
			BufferedReader buffer = new BufferedReader(reader);
			String line;
			while ((line = buffer.readLine()) != null) {
				System.out.println(line);
			}
			//バッファーを終了
			buffer.close();
			//ファイルを終了
			reader.close();
			System.out.println("ファイルを読み込みました");
			
		} catch (FileNotFoundException e1) {
			System.out.println("ファイルが読み込めませんでした");

		} catch (Exception e) {
			System.out.println("予期せぬエラー(99)");

		} finally {
			System.out.println("ファイル処理を終了します");
		}

	}

}
