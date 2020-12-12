package Operation;

import Data.DS_1;

public class Receipt1 extends Receipt{//print receipt for gp1
    DS_1 d;
    public Receipt1(DS_1 d){
        this.d=d;
    }
    @Override
    public void PrintReceipt() {
        System.out.println(d.L+" L gas has been pumped.");
        System.out.println("$"+d.total+" is charged.");

    }
}
