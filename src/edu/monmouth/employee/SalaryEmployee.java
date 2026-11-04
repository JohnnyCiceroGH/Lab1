package edu.monmouth.employee;
import java.util.Objects;

public class SalaryEmployee implements Employee{
private int yearlySalary;

public SalaryEmployee(int yearlySalary)
{
	this.yearlySalary = yearlySalary;
}

@Override
public int getMonthlyPay()
{
	return yearlySalary/12;
}

@Override
public boolean equals(Object o)
{
	if(this == o)
	{
		return true;
	}
	if(o == null || getClass() != o.getClass())
	{
	return false;
	}
	SalaryEmployee e = (SalaryEmployee) o;
	 return yearlySalary == e.yearlySalary;
	}

@Override
public String toString() 
{
    return "Yearly Salary: " + yearlySalary + "";
}
}
