package Star;

import java.util.List;

public class Rows {
    private String id;
    private int rowNumber;
    private String siblingId;
    private List<Cells> cellsList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public String getSiblingId() {
        return siblingId;
    }

    public void setSiblingId(String siblingId) {
        this.siblingId = siblingId;
    }

    public List<Cells> getCellsList() {
        return cellsList;
    }

    public void setCellsList(List<Cells> cellsList) {
        this.cellsList = cellsList;
    }
}
