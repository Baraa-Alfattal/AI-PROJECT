package Models;
import java.lang.Math;
public class Pair {

    // Fields
    private int row_index;
    private int column_index;

    private int status;

    private int owner;

    // default constructor
    public Pair() {}

    public Pair(int row_index, int column_index, int status, int owner) {
        this.row_index = row_index;
        this.column_index = column_index;
        this.status = status;
        this.owner = owner;
    }

    // copy constructor
    public Pair(Pair pair)
    {
        this.row_index = pair.row_index;
        this.column_index = pair.column_index;
        this.status = pair.status;
        this.owner = pair.owner;
    }
//    public Pair(Pair pair)
//    {
//        this.row_index = pair.row_index;
//        this.column_index = pair.column_index;
//        this.status = pair.status;
//    }

    // Deep Check
    public boolean equals(Pair obj) {
        return obj.row_index == this.row_index
                && obj.column_index == this.column_index;
    }

    public Pair sub(Pair obj) {
        int row = Math.abs(this.row_index - obj.row_index);
        int column = Math.abs(this.column_index - obj.column_index);
        Pair  P = new Pair();
        P.setRow_index(row);
        P.setColumn_index(column);
        return P;
    }

    public boolean lessthan(Pair obj) {
         if(this.row_index < obj.row_index || this.column_index < obj.column_index)
         {
             return true;
         }
         return false;
    }



    public int getRow_index() {
        return row_index;
    }

    public void setRow_index(int row_index) {
        this.row_index = row_index;
    }

    public int getColumn_index() {
        return column_index;
    }

    public void setColumn_index(int column_index) {
        this.column_index = column_index;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    public int getOwner() {
        return owner;
    }
}
