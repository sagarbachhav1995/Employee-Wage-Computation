package com.blz.employee.wage;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation Program");
		Random random = new Random();
		int randomNum = random.nextInt(2);

		if (randomNum == 1)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");

	}

}
