package com.cox.assignment;

import java.io.IOException;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class StockPrice {
	
	public Stock getStock(String stockName)throws IOException{
		return YahooFinance.get(stockName);
	}
	public static void main(String[] args) {
		StockPrice coxAssign = new StockPrice();
		try {
			System.out.println(coxAssign.getStock("GOOGL"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
