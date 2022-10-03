package com.collections;

import java.util.LinkedList;
import java.util.Scanner;

public class QuestionThree {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of elements in your first collection: ");
		Integer size = scanner.nextInt();
		LinkedList<Integer> listOne = createList(size);
		System.out.print("Enter number of elements in your second collection:: ");
		size = scanner.nextInt();
		LinkedList<Integer> secondList = createList(size);
		System.out.print("Enter naumber value to begin merge of your collections:");
		Integer value = scanner.nextInt();
		mergeCollection(listOne, secondList, value);

	}

    public static void mergeCollection(LinkedList<Integer> listOne, LinkedList<Integer> listTwo, int x) {
		System.out.println("Your first Collection of numbers is: "+ listOne.toString());
		System.out.println("Your second Collection of numbers is: "+ listTwo.toString());
		
		listOne.addAll(listOne.indexOf(x) + 1, listTwo);
		System.out.println();
		System.out.println("Your merged collection: "+ listOne.toString());
	}

	public static LinkedList<Integer> createList(int num) {
		Scanner scanner = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int j = 0; j < num; j++) {
			System.out.print("Enter unique numbers:");
			Integer numbers = scanner.nextInt();
			list.add(numbers);
		}
		return list;
	}

}
