package br.cefsa.ftt.ec;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataAnalisys {
	
	//Collections - ArrayList
	//Generics
	
	ArrayList<Startup> startups = new ArrayList<Startup>(); 
	
	public void loadData() {
		
        Scanner sc;
		
        try {
        	//Lazy Load:  http://www.javapractices.com/topic/TopicAction.do?Id=34
			File file = new File("TechCrunchcontinentalUSA.csv");
			
			sc = new Scanner(file);
            
			sc.nextLine(); //Pula primeira linha com cabeçalho... 
		    
	        while(sc.hasNextLine()){
	           startups.add(new Startup(sc.nextLine().split(",")));
	        } //while
	        
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //try
   
		
	} //loadData
	
	public float getRaisedCurrencyTotal() {
		
		float soma = 0;
		
		for (Startup strp : startups) {
			soma += strp.getRaisedAmt();
		}
		
		return soma;
	}//getRaisedCurrencyTotal
	
	
}//DataAnalisys


