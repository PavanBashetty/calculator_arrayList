package calculator;

import java.util.ArrayList;
import java.util.Collections;

public class SimpleCal {

private ArrayList<Integer> calculatorList = new ArrayList<Integer>();
	
	public void addNumToList(int num) {
		calculatorList.add(num);
	}
	
	public ArrayList<Integer> getNumFromCalList(){
		return this.calculatorList;
	}
	
	public void printNumFromTheList() {
		for(int i=0; i<calculatorList.size(); i++) {
			System.out.println((i+1)+". "+ calculatorList.get(i));
		}
	}
	
	public int getAdditionOfListNum() {
		int sum = 0;
		for(Integer i:calculatorList) {
			sum = sum + i;
		}
		return sum;
	}
	
	public int getCountOfNumList() {
		int count = 0;
		for(@SuppressWarnings("unused") Integer i:calculatorList) {
			count++;
		}
		return count;
	}
	
	public int getMultiplicationOfListNum() {
		int sum = 1;
		for(Integer i: calculatorList) {
			sum *= i;
		}
		return sum;
	}
	
	public int getSubstractionOfListNum() {
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		tempList.addAll(calculatorList);
		Collections.sort(tempList, Collections.reverseOrder());
		int sum = tempList.get(0);
		for(int i=1; i<tempList.size();i++) {
			sum = sum - tempList.get(i);
		}
		return sum;
	}
	
	private int numPosition(int number) {
		return calculatorList.indexOf(number);
	}
	
	public double getDivisionOfTwoNum(int numerator, int denominator) {
		int numertorPosition = numPosition(numerator);
		int denominatorPosition = numPosition(denominator);
		if((numertorPosition>=0) && (denominatorPosition>=0)) {
			if(denominator != 0) {
				return (double) numerator/ (double) denominator;
			}else {
				System.out.println("Denominator cannot be zero, pick a different number");
				return -1.0d;
			}
		}
		System.out.println("Entered numbers are not in the list, pick different numbers");
		return -1.0d;
	}
}
