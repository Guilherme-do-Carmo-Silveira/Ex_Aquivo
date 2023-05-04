package view;

import java.io.IOException;

import controller.FileController;

public class main {

	public static void main(String[] args) {
		
		FileController control = new FileController();
		
		String path = "C:\\Temp";
		String nome =  "generic_food.csv";	
		
		try {
			control.readFile(path, nome);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
