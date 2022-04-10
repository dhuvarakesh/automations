package excel;

import poi.Xls_Reader;

public class readwritedata {

	private static final String SheetName = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Xls_Reader reader= new Xls_Reader("C:\\Users\\dhuvarakesh\\Desktop\\excel\\Book1.xlsx");
         String sheetName= "Sheet1";
         String data = reader.getCellData(sheetName,0,2); //col nad row
         System.out.println(data);
         int rowCount= reader.getRowCount(sheetName);
         System.out.println("total rows:" +rowCount);
         reader.addColumn(sheetName,"age");
         reader.setCellData(sheetName,"age",2,"24");
        }
}

