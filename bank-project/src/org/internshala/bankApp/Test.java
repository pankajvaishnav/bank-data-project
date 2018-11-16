package org.internshala.bankApp;

import java.io.IOException;
import java.util.Scanner;

public class Test 
{
	static CSVReader reader = new  CSVReader();
	public static void main(String[] args) throws IOException 
	{
		reader.getData();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter IFSC Code: ");
		String ifscCode = sc.next();
		getRecordsByIFSC(ifscCode);
		
		System.out.println("Enter Bank Name: ");
		String bName = sc.next();
		System.out.println("Enter City: ");
		String city = sc.next();
		sc.close();
		getRecordsByBankNameAndCity(bName, city);
	}

	private static void getRecordsByBankNameAndCity(String bName, String city) 
	{
		for(int i=0;i<reader.ifsc.size();i++)
		{
			if(reader.bankName.get(i).equalsIgnoreCase(bName)&&reader.city.get(i).equalsIgnoreCase(city))
			{
				System.out.println("Bank ID: "+reader.bankId.get(i)+"\nBranch: "+reader.branch.get(i)+
						"\nAddress: "+reader.address.get(i)+"\nDistrict: "
						+reader.district.get(i)+"\nState: "+reader.state.get(i));
			}
		}
	}

	private static void getRecordsByIFSC(String ifscCode) 
	{
		for(int i=0;i<reader.ifsc.size();i++)
		{
			if(reader.ifsc.get(i).equalsIgnoreCase(ifscCode))
			{
				System.out.println("Bank ID: "+reader.bankId.get(i)+"\nBranch: "+reader.branch.get(i)+
						"\nAddress: "+reader.address.get(i)+"\nCity: "+reader.city.get(i)+"\nDistrict: "
						+reader.district.get(i)+"\nState: "+reader.state.get(i)+"\nBank Name: "+reader.bankName.get(i));
			}
		}
	}
}
