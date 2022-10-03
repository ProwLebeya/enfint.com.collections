package com.collections;

import java.util.Scanner;
import java.util.ArrayList;

public class QuestionTwo {
    public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Please enter the number of fruits in your shopping busket: ");
			int size = scanner.nextInt();
			for (int i = 0; i < size; i++) {
				System.out.print("Enter name of a fruit:");
				String fruit = scanner.next();
				fruits.add(fruit);
			}
			System.out.print("Enter position of the fruit you want to change");
			int index = scanner.nextInt();
			if (index < 0 || index - 1 > size) {
				System.out.println("There are no fruit in this index!!");
				System.exit(0);
			}
			System.out.print("Enter the  the new fruit");
			String newFruit = scanner.next();
			replaceFruit(fruits, index, newFruit);
		} catch (Exception e) {
			System.out.println("Somehting went wrong: " + e);
			System.exit(0);
		}

	}

	private static void replaceFruit(ArrayList<String> fruits, int index, String newFruit) {
		System.out.println("Old Collection of Fruits"+ fruits.toString());
		System.out.println();
		fruits.set(index - 1, newFruit);
		System.out.println("New Collection of Fruits"+ fruits.toString());
	}
}