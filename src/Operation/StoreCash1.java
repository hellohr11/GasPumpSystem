package Operation;

import Data.DS_1;

public class StoreCash1 extends StoreCash{//store cash gp1
    DS_1 d;

    public StoreCash1(DS_1 d){
        this.d=d;
    }

    @Override
    public void storecash() {
        System.out.println(d.temp_c+" dollars have been received");
        d.cash=d.temp_c;

    }
}
