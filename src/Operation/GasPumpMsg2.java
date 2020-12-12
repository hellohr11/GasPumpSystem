package Operation;

import Data.DS_1;
import Data.DS_2;

public class GasPumpMsg2 extends GasPumpMsg{//gas pump message for gp2
    DS_2 d;
    public GasPumpMsg2(DS_2 d){
        this.d=d;
    }
    @Override
    public void gaspumpmsg() {
        d.G=d.G+1;
        d.total=d.total+d.price;
        System.out.println(d.G+" gallons of Gas have been pumped, the total amount is $"+d.total);

    }
}
