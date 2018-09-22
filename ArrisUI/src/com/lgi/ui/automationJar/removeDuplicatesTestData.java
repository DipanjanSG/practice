package com.lgi.ui.automationJar;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;


public class removeDuplicatesTestData 
{
	public int readfile(String path) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream(path);
		
		Workbook wb = null;
		Sheet ws = null;
		
		wb = WorkbookFactory.create(fis);
		ws = wb.getSheetAt(0);
		
		int nRow = ws.getLastRowNum() + 1;
		Row row = null;
		Cell cell, cell0;
		int numberOfDuplicates=0;
		ArrayList<String> duplicateList = new ArrayList<String>();
		ArrayList <Integer>duplicateRows = new ArrayList<Integer>();
		ArrayList <Integer>ChangedRows = new ArrayList<Integer>();
		for(int r=0;r<nRow;r++)
		{
			
			
			row = ws.getRow(r);
			cell0 = row.getCell(0);
			
			

			Row row1 = null;
			Cell check;
			ArrayList <String>keyValueList = new ArrayList<String>();
			
			int found =0;
			for(int findRepeatition=r+1  ;  findRepeatition<nRow  ;  findRepeatition++)
			{
				
				
				row1 = ws.getRow(findRepeatition);
				check = row1.getCell(0);
				int nCol;
				
			if (cell0.getStringCellValue().equalsIgnoreCase(check.getStringCellValue()) && !duplicateList.contains(cell0.getStringCellValue())) 
			{
				found ++;
			
				  duplicateRows.add(findRepeatition);
				  ChangedRows.add(r);
				  numberOfDuplicates++;
				  nCol = ws.getRow(findRepeatition).getLastCellNum();
				 
				  //System.out.println((findRepeatition+1)+ " " +cell0.getStringCellValue()+" \n");
				  Cell duplicates;
				  int keyValue=1 ;
				  duplicates=row1.getCell(keyValue);
				
				do
				  
				{
					
				
					
					if(duplicates.getCellType()==1)
					{	//System.out.println("1");
					  keyValueList.add(duplicates.getStringCellValue());
					}
					else if (duplicates.getCellType()==0)
					{//System.out.println("2");
						keyValueList.add(String.valueOf(duplicates.getNumericCellValue()));
					}
					 duplicates=row1.getCell(++keyValue);
				//System.out.println(keyValue+" "+duplicates.getCellType()+" " +Cell.CELL_TYPE_BLANK+" \n");
					
				if(duplicates==null)
						break;
					
				  }while( duplicates.getCellType() != Cell.CELL_TYPE_BLANK);
			
					
				
			}
		
		}
			
			
			if (found>0)
			{
				duplicateList.add(cell0.getStringCellValue());
				System.out.println(cell0.getStringCellValue());
				found=0;
				int c=0;

				while(row.getCell(++c)!=null && row.getCell(c).getCellType()!=Cell.CELL_TYPE_BLANK);
				cell0 = row.getCell(c);
				//System.out.println("list size"+keyValueList.size()+ "starting of insertion " + c);
				
				for(int i=0;i<keyValueList.size();i++)
				{
					
					
					//System.out.println(i+"          "+keyValueList.get(i));
					cell0 = row.getCell(c);
					//System.out.println("Inserting in cell "+ cell0);
					if (cell0==null)
					{
						//System.out.println("Cell is null");
						cell0 = row.createCell(c);
					}
										
					cell0.setCellValue(keyValueList.get(i));
					c++;
				}
				
				

				keyValueList.clear();
				
				

			}
			int oddCells=1;
			
		
			while(row.getCell(oddCells)!=null && row.getCell(oddCells).getCellType()!=Cell.CELL_TYPE_BLANK)
			{
				Cell cell1=row.getCell(oddCells);
				
				int oddCells2=oddCells+2;
				
				
				while(row.getCell(oddCells2)!=null && row.getCell(oddCells2).getCellType()!=Cell.CELL_TYPE_BLANK)
				{
					//System.out.println(cell1.getStringCellValue()+ " " +row.getCell(oddCells2).getStringCellValue());
					Cell cell2=row.getCell(oddCells2);
					
					if(cell1.getStringCellValue().equals(cell2.getStringCellValue()) )
					{
						
						System.out.println(cell1.getCellType());
						if(cell1.getCellType()==1 && row.getCell(oddCells+1).getStringCellValue().equals(row.getCell(oddCells2+1).getStringCellValue()) )
						{
							System.out.println((r+1)+ " "+cell1.getCellType()+"           "+cell1.getStringCellValue() +" " + cell2.getStringCellValue());
						}
						else if(cell1.getCellType()==0 && row.getCell(oddCells+1).getNumericCellValue()==row.getCell(oddCells2+1).getNumericCellValue())
						{
							System.out.println((r+1)+  cell1.getCellType()+ " "+"           "+cell1.getNumericCellValue() +" "+ cell2.getNumericCellValue());
						}
							
						
						//cell2.setCellValue("");
						//.getCell(oddCells2+1).setCellValue("");
						
					}
					
					
					oddCells2+=2;
				}
				System.out.println();
				oddCells+=2;
			}
			
				
		}
	
		
		Collections.sort(duplicateRows);
		//System.out.println("Size of excel sheet is Before deletion is" +nRow);
		
		
		for(int i=0;i<duplicateRows.size();i++)
		{
			
			row = ws.getRow(duplicateRows.get(i));
			
			
			
			ws.shiftRows(duplicateRows.get(i)-i+1,nRow ,-1 );
			nRow = ws.getLastRowNum() + 1;

			
			//row = ws.getRow(339);

			//System.out.println("Size of excel sheet is " +duplicateRows + row.getCell(0).getStringCellValue());
			//			if(i==2)
			//						break;
			
			//ws.removeRow(row);
			//System.out.println(duplicateRows.get(i)+1);
		
		}
	

//		row = ws.getRow(ws.getLastRowNum());
//	
//		
//		
//		ws.shiftRows(nRow,nRow ,-1 );
		
		
		
		FileOutputStream outputStream = new FileOutputStream(path);
		
		wb.write(outputStream);
		wb.close();
        outputStream.close();
        
        
		return numberOfDuplicates;
	}
	
	
	
}
