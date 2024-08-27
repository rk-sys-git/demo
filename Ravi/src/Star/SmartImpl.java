package Star;

import java.util.ArrayList;
import java.util.List;

public class SmartImpl implements SmartInterFace {
    @Override
    public Smart create(){
        Smart smart=new Smart();
        smart.setId("952283761449296");
        smart.setName("MY SMARTSHEET");
        smart.setPermaLink("https://app.smartsheet.com/sheets/mC8mcf4M8j37dbnHbBe77fP0bw939PMw96pq961");
        List<Columns> columnsList=new ArrayList();

        Columns columns=new Columns();
        columns.setId("7323702856574852");
        columns.setVersion(0);
        columns.setIndex(0);
        columns.setTitle("projectname");
        columns.setType("Text_Number");


        Columns columns1=new Columns();
        columns1.setId("1694203322361732");
        columns1.setVersion(0);
        columns1.setIndex(1);
        columns1.setTitle("Status");
        columns1.setType("text_Number");
        columnsList.add(columns);
        columnsList.add(columns1);
        smart.setColumns(columnsList);

        List<Rows> rowsList=new ArrayList();

        Rows rows=new Rows();
        rows.setId("2314743682492292");
        rows.setRowNumber(1);
        rowsList.add(rows);
        smart.setRows(rowsList);

        List<Cells> cellsList=new ArrayList();

        Cells cells=new Cells();
        cells.setColumnId("7323702856574852");
        cells.setValue("ERP Vendor Selection");
        cells.setDisplayValue("ERP Vendor Selection");

        Cells cells1=new Cells();
        cells1.setColumnId("1694203322361732");
        cells1.setValue( "Closed");
        cells1.setDisplayValue( "Closed");
        cellsList.add(cells);
        cellsList.add(cells1);
        rows.setCellsList(cellsList);


        Rows rows1=new Rows();
        rows1.setId("6818343309862788");
        rows1.setRowNumber(2);
        rows1.setSiblingId("2314743682492292");
        rowsList.add(rows1);



        List<Cells> cellsList2=new ArrayList();
        Cells cells2=new Cells();
        cells2.setColumnId("7323702856574852");
        cells2.setValue( "IS Dashboard");
        cells2.setDisplayValue("IS Dashboard");

        Cells cells3=new Cells();
        cells3.setColumnId("1694203322361732");
        cells3.setValue("On Hold");
        cells3.setDisplayValue("\"On Hold");
        cellsList2.add(cells2);
        cellsList2.add(cells3);
        rows1.setCellsList(cellsList2);
        rowsList.add(rows1);
        rowsList.add(rows);

        smart.setRows(rowsList);

        return smart;
    }
    @Override
    public void display(Smart smart){
        System.out.println(smart.getId());
        System.out.println(smart.getName());
        System.out.println(smart.getPermaLink());

        List<Columns> columnsList=smart.getColumns();
        for (Columns columns:columnsList){
            System.out.println(columns.getId());
            System.out.println(columns.getIndex());
            System.out.println(columns.getTitle());
            System.out.println(columns.getType());
            System.out.println(columns.getVersion());
        }
        List<Rows> rowsList=smart.getRows();
        for (Rows rows:rowsList){
            System.out.println(rows.getId());
            System.out.println(rows.getRowNumber());
            System.out.println(rows.getSiblingId());
            List<Cells> cellsList=rows.getCellsList();
            for (Cells cells:cellsList){
                System.out.println(cells.getColumnId());
                System.out.println(cells.getValue());
                System.out.println(cells.getDisplayValue());
            }
        }

        
    }
}
