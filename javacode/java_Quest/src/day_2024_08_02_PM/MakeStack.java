package day_2024_08_02_PM;

import java.util.Scanner;

interface Stack {
	int length();

	int capacity();

	boolean push(String val);

	String pop();
}

class StringStack implements Stack {
	Scanner sc = new Scanner(System.in);
	private String[] arrStr;
	private int inCount;

	public StringStack() {
		System.out.print("스택의 저장공간 크기 입력 >> ");
		arrStr = new String[sc.nextInt()];
	}

	public int length() {
		return inCount;
	}

	public int capacity() {
		return arrStr.length;
	}

	public boolean push(String val) {
		if (val.equals("그만")) {
			return true;
		} else if (inCount == arrStr.length) {
			System.out.println("스택이 가득 찼습니다!!!");

			String[] arrStrPlus = new String[arrStr.length * 2];
			for (int i = 0; i < arrStr.length; i++) {
				arrStrPlus[i] = arrStr[i];
			}
			arrStr = arrStrPlus;
			System.out.println("저장공간이 두 배가 되었습니다!!");
			System.out.println("현재 저장공간 크기: " + capacity());
			System.out.println("추가로 저장 가능한 문자열: " + (capacity() - length()));

			return false;
		} else {
			arrStr[inCount++] = val;
			return false;
		}
	}

	public String pop() {
		if (inCount == 0) {
			return "스택에 문자열이 없습니다.";
		} else {
			return arrStr[--inCount];
		}
	}
}

public class MakeStack {
	public static void main(String[] args) {
		StringStack stack = new StringStack();
		boolean check;

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("문자열 입력 >> ");
			check = stack.push(sc.nextLine());

			if (check)
				break;
		}

		System.out.print("스택에 저장된 모든 문자열: ");

		for (int i = stack.length(); i > 0; i--) {
			System.out.print(stack.pop() + " ");
		}

	}
}
