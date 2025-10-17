package com.example;

import java.util.Scanner;

public class EmployeeSalaryCalculator 
{
	//Variable Declaration
	final static int standardWorkingHours = 40;
	static String employeeID;
	static String employeeName;
	static int hoursWorked;
	static int  hourlyRate;
	static int basicPay;
	static int overTime;
	static int overTimeRate;
	static int overTimePay;
	static int grossSalary;
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Input
		System.out.println("Enter an Employee ID: ");
		employeeID = sc.nextLine();
		
		System.out.println("Enter an Employee Name: ");
		employeeName = sc.nextLine();
		
		System.out.println("Enter the no. of Hours Worked: ");
		hoursWorked = sc.nextInt();
		
		System.out.println("Enter the Hourly Rate: ");
		hourlyRate = sc.nextInt();
		
		salaryCalculator(hoursWorked,hourlyRate);
		displayPaySlip();
	}

	static int salaryCalculator(int HW,int HR)
	{
		hourlyRate = HR;
		hoursWorked = HW;
		
		/*
		All new code must be added between the commented lines below.
			YOUR CODE STARTS HERE
			YOUR CODE ENDS HERE
		Test cases execute automatically each time you commit code.
		You must follow these rules:
			1. Do not change any code outside the new code placeholders.
			2. Your own code must be inside the new code placeholders.
			3. Do not change existing class names, interface names, method signatures, or attributes.
			4. Follow standard Java naming conventions for all code that you write.
		*/


				if(HW <= standardWorkingHours)
				{
					//YOUR CODE STARTS HERE
                    // No overtime hours clocked:
                    // update overTime Rate

					// update overtime and overtimePay to 0
                    overTime = 0;
                    overTimePay = 0;
                    // update overTime Rate:
                    overTimeRate = 2 * hourlyRate;

                    // Calculate basicPay = hourlyRate * hoursWorked
                    basicPay = hourlyRate * hoursWorked;
                    // No overtime hours worked, therefore grossSalary = basicPay
                    grossSalary = basicPay;
					//YOUR CODE ENDS HERE
				}
				else
				{
					//YOUR CODE STARTS HERE
                    // overtime hours >
                    // calculate overtime hours
                    overTime = hoursWorked - standardWorkingHours;
                    // update overTime Rate:
                    overTimeRate = 2 * hourlyRate;

                    // calculate overtime pay
                    overTimePay = (2 * hourlyRate) * overTime;

                    // calculate basic pay
                    basicPay = hourlyRate * (hoursWorked - overTime);

                    // calculate grossSalary as sum of basicPay and OverTimePay
                    grossSalary = overTimePay + basicPay;

                    /*
                     * (Note) there is some repetition of code due to being restricted between two if/else blocks.
                     * e.g. grossSalary = overTimePay + basicPay in both cases, so could be moved outside the if statement.
                     * OverTimeRate is also 2*basicPay in either case, so doesn't need to be updated in each block.
                     *
                     * Also note that tests only make calls to salaryCalculator
                     * therefore updates to static variables other than grossSalary aren't necessary - but have been included
                     * here so that EmployeeSalaryCalculator.main() runs as expected.
                     */
                    // final implementation
					//YOUR CODE ENDS HERE
				}
				return grossSalary;
	}
	
	static void displayPaySlip()
	{
		
		System.out.println("===========================================");
		System.out.println("                                     ");
		System.out.println("================PAYSLIP==============");
		System.out.println("                                     ");

		System.out.println("Employee ID    :       " + employeeID);
		System.out.println("Employee Name  :       " + employeeName);
		System.out.println("Hours Worked   :       " + hoursWorked);
		System.out.println("Hourly Rate    :       " + hourlyRate);
		System.out.println("Overtime       :       " + overTime);
		System.out.println("Overtime Rate  :       " + overTimeRate);
		System.out.println("Overtime Pay   :       " + overTimePay);
		System.out.println("Basic Pay      :       " + basicPay);
		System.out.println("                                     ");
		System.out.println("Gross Salary   :       " + grossSalary);
		
	}
}
