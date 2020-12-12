package Operation;

import Data.DS_2;

public class setPrice2 extends setPrice{//set price for gp2
    DS_2 d;
    public setPrice2(DS_2 d){
        this.d=d;
    }

    @Override
    public void setprice(int g) {
        if(g==1){
            d.price=d.Rprice;
        }else if(g==2){
            d.price=d.Sprice;
        }else if(g==3){
            d.price=d.Dprice;
        }

    }
}
