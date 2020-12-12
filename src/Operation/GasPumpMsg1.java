package Operation;


import Data.DS_1;

public class GasPumpMsg1 extends GasPumpMsg{//gas pump message for gp1
    DS_1 d;
    public GasPumpMsg1(DS_1 d){
        this.d=d;
    }
    @Override
    public void gaspumpmsg() {
        d.L=d.L+1;
        d.total=d.total+d.price;
        System.out.println(d.L+" liters of Gas have been pumped, the total amount is $"+d.total);

        if(d.w==0){
            d.cash=d.cash-d.price;
        }

    }
}
