package labreport3_yl;

import java.util.concurrent.ThreadLocalRandom;
import java.util.LinkedHashMap;

public class Money {

	private int amountOfMoney; // Create a class attribute

	// Create a class constructor for the Main class
	public Money() {
		this.amountOfMoney = ThreadLocalRandom.current().nextInt(1000, 100000 + 1);
	}

	public Money(int amount) {
		this.amountOfMoney = amount;
	}

	public Money(int[] amount) {
		for (int item : amount) {
			this.amountOfMoney += item;
		}
	}

	public int getAmountOfMoney() {
		return amountOfMoney;
	}

	public void setAmountOfMoney(int amountOfMoney) {
		this.amountOfMoney = amountOfMoney;
	}

	public void add(Money moneyObj) {
		this.amountOfMoney += moneyObj.amountOfMoney;
	}

	public String toString(int amountOfMoney) {
		String answer = "";
		answer = answer.concat(String.format("Amount = %dcents (RM%.2f)", amountOfMoney, (double) amountOfMoney / 100));
		LinkedHashMap<String, Integer> notesAndCents = new LinkedHashMap<String, Integer>();
		int totalAmount = amountOfMoney;
		notesAndCents.put("RM100", amountOfMoney / 10000);
		totalAmount %= 10000;
		notesAndCents.put("RM50", totalAmount / 5000);
		totalAmount %= 5000;
		notesAndCents.put("RM20", totalAmount / 2000);
		totalAmount %= 2000;
		notesAndCents.put("RM10", totalAmount / 1000);
		totalAmount %= 1000;
		notesAndCents.put("RM5", totalAmount / 500);
		totalAmount %= 500;
		notesAndCents.put("RM1", totalAmount / 100);
		totalAmount %= 100;
		notesAndCents.put("50cents", totalAmount / 50);
		totalAmount %= 50;
		notesAndCents.put("20cents", totalAmount / 20);
		totalAmount %= 20;
		notesAndCents.put("10cents", totalAmount / 10);
		totalAmount %= 10;
		notesAndCents.put("5cents", totalAmount / 5);
		totalAmount %= 5;
		notesAndCents.put("1cents", totalAmount / 1);
		totalAmount %= 1;
		for (String i : notesAndCents.keySet()) {
			answer = answer.concat(String.format("\n%-12s quantity= %5d", i, notesAndCents.get(i)));
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] numbers = { 3, 9, 5, 5 };
		Money m = new Money();
		Money m1 = new Money(112312);
		Money m2 = new Money(numbers);
		System.out.println(m.toString(m.getAmountOfMoney()) + "\n\n");
		System.out.println(m1.toString(m1.getAmountOfMoney()) + "\n\n");
		System.out.println(m2.toString(m2.getAmountOfMoney()));
	}

}
