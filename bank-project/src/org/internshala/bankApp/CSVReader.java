package org.internshala.bankApp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader 
{

    //----------------------------------------------------------------------------
    ArrayList<String> ifsc = new ArrayList<>();
    ArrayList<String> bankId = new ArrayList<>();
    ArrayList<String> branch = new ArrayList<>();
    ArrayList<String> address = new ArrayList<>();
    ArrayList<String> city = new ArrayList<>();
    ArrayList<String> district = new ArrayList<>();
    ArrayList<String> state = new ArrayList<>();
    ArrayList<String> bankName = new ArrayList<>();
    //----------------------------------------------------------------------------
    
	@SuppressWarnings("resource")
	public ArrayList<String> getData() throws IOException
	{
		String csvFile = "C:\\Users\\pankaj vaishnav\\Desktop\\bank-db\\bank_branches.csv";
        BufferedReader br = null;
        String line = "";
        String CSVSplitBy = ",";
        br = new BufferedReader(new FileReader(csvFile));
 
        int count=0;
        while ((line = br.readLine()) != null)
        {
        	
        	String[] col = line.split(CSVSplitBy);
        	if(count>0)
        	{
        		ifsc.add(col[0]);
        		bankId.add(col[1]);
        		branch.add(col[2]);
        		address.add(col[3]);
        		city.add(col[4]);
        		district.add(col[5]);
        		state.add(col[6]);
        		bankName.add(col[7]);
        	}
        	count++;
        }
        //System.out.println(bankId);
		return bankId;
	}
}
