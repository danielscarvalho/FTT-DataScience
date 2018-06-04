package br.cefsa.ftt.ec;

import java.util.Date;

public class DataScience {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(new Date());
		System.out.println(" - Data Science...");
		
		DataAnalisys da = new DataAnalisys();
		da.loadData();
		
		System.out.println(da.getRaisedCurrencyTotal());
	}

}
