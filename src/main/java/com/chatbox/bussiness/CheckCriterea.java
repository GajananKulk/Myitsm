package com.chatbox.bussiness;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DateUtil;
public class CheckCriterea {
	public String checkCriterea(String post, String degree, String experience,String tool) throws IOException{
		String result= "";
		if(degree.toUpperCase() == "BE" || degree.toUpperCase()=="B.Teck" || degree.toUpperCase()=="ME" || degree.toUpperCase()=="M.Teck" || degree.toUpperCase()=="MCA"){
			int t=Integer.parseInt(experience);
			if(t >= 3 && t <=5){
				if(tool.toUpperCase() == "PPAP"  || tool.toUpperCase() == "PFMEA" || tool.toUpperCase() == "CP" || tool.toUpperCase() == "8D" || tool.toUpperCase() == "ISHIKAWA")
				{
					result = send(post);
					//result ="https://flextronics.wd1.myworkdayjobs.com/en-US/Careers/job/Timisoara-Romania/Customer-Quality-Manager_WD035146?source=Flex_Career_site";//send(post);
				}else{

					result="Sorry..! You are not eligible for this post.Experience and knowledge working with any one quality tools is compelsory.";
				}
			}else{

				result="Sorry..! You are not eligible for this post. Minimum 3 Year Experience is compulsory";
			}
		}else{

			result="Sorry..! You are not eligible for this post. Bachelor Degree is compulsory.";
		}

		return result;
	}
	public static String send(String post)throws IOException
	{
		String excel_post= "";
		String result="";
		HSSFWorkbook wb=null;
		boolean flag = false;
		//FileInputStream stream=null;
		HSSFRow row = null;
		//InputStream stream =null;
		InputStream stream = CheckCriterea.class.getResourceAsStream("FlexRecruiterData.xls");
		try
		{
			/*File excel = new File("D:\\FlexRecruiterData.xls");
			stream = new FileInputStream(excel);*/
			//stream = ConferenceRoomBooking.class.getResourceAsStream("D:\\ConferenceRoomBooking.xls");
			wb = new HSSFWorkbook(stream);
		}catch(Exception e){
			e.printStackTrace();
		}

		HSSFSheet ws = wb.getSheetAt(0);
		int rowNum = ws.getLastRowNum();
		int colNum = ws.getRow(1).getLastCellNum();
		int postHeaderIndex = -1, linkHeaderIndex = -1;
		HSSFRow rowHeader = ws.getRow(0);

		for (int j = 0; j < colNum; j++)
		{
			HSSFCell cell = rowHeader.getCell(j);
			String cellValue = cellToString(cell);

			if ("Post".equalsIgnoreCase(cellValue))
			{
				postHeaderIndex = j;
				System.out.println("post index="+j);
			} else if ("Link".equalsIgnoreCase(cellValue))
			{
				linkHeaderIndex = j;
				System.out.println("Link Index="+j);
			}
		}  

		for (int i = 1; i <=rowNum; i++)
		{
			row = ws.getRow(i);
			excel_post = cellToString(row.getCell(postHeaderIndex));
			if(excel_post.equals(post))
			{
				result =cellToString(row.getCell(linkHeaderIndex));
				break;
			}else if(i >=rowNum)
			{
			    return "Sorry! Job for this post is not available.";
			}
		}




		return result;
	}

	public static String cellToString(HSSFCell cell) {
		int type;
		Object result = null;
		type = cell.getCellType();
		String date="";
		switch (type) {
		case HSSFCell.CELL_TYPE_NUMERIC:
			//if(!cell.getDateCellValue().toString().contains(":")){
			if (DateUtil.isCellDateFormatted(cell)) {
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				date = sdf.format(cell.getDateCellValue());
				System.out.println(date.toString());

			}else {
				result = Integer.valueOf((int) cell.getNumericCellValue())
						.toString();
			}
			break;
		case HSSFCell.CELL_TYPE_STRING:
			result = cell.getStringCellValue();
			break;

		case HSSFCell.CELL_TYPE_BLANK:
			result = "";
			break;

		case HSSFCell.CELL_TYPE_FORMULA:
			result = cell.getCellFormula();
		}
		return result.toString();
	}


}
