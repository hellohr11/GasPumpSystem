package Operation;

import Data.DS_2;

public class Receipt2 extends Receipt{//print receipt for gp2
    DS_2 d;
    public Receipt2(DS_2 d){
        this.d=d;
    }
    @Override
    public void PrintReceipt() {
        System.out.println(d.G+" Gallon gas has been pumped.");
        System.out.println("$"+d.total+" is charged.");
    }
}
