package Operation;

import Data.DS_1;
import Data.DataStore;

public class returnc1 extends ReturnCash{//return the cash
    DS_1 d;
    public returnc1(DS_1 d){
        this.d=d;

    }
    @Override
    public void returnCash() {
        if(d.w==0){
            System.out.println("Return Cash:"+d.cash);
            d.cash=0;
        }else{
            System.out.println("No cash returned.");
        }
    }
}
