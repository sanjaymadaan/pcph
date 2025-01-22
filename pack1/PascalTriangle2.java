package com.company.flowcontrol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle2 {

	static List<List<Integer>> mtd(int row) {
		if(row == 0) {
			return Arrays.asList();
		}
		
		if(row == 1) {
			List<List<Integer>> list  = new ArrayList<List<Integer>>();
			list.add(Arrays.asList(1));
			return list;
		}
		
        List<List<Integer>> prevRows = mtd(row - 1);

        List<Integer> newRow = new ArrayList<>();
        for(int i =0; i< row; i++){
            newRow.add(1);
        }

        for(int i =1; i<= row-2; i++){
        	System.out.println(prevRows.get(row-2));
        	newRow.set(i, prevRows.get(row-2).get(i-1) + prevRows.get(row-2).get(i));
        }
        prevRows.add(newRow);
		
		return prevRows;
		
	}
	
	public static void main(String[] args) {
			System.out.println(mtd(5));
	}
}
