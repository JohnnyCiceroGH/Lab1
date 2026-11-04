package edu.monmouth.employee;

public class SalesEmployee implements Employee{
private int comission;
private int yearlyBase;

public SalesEmployee(int yearlyBase)
{
	this.yearlyBase = yearlyBase;
}

public int getMonthlyPay()
{
	return yearlyBase/12 + comission;
}

public void setCommission(int c)
{
	comission = c;
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
	SalesEmployee e = (SalesEmployee) o;
	 return comission == e.comission && yearlyBase == e.yearlyBase;
	}

@Override
public String toString() 
{
    return "YearlyBase: " + yearlyBase + " Comission: " + comission + "";
}
}
