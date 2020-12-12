package Operation;

import Data.DS_1;
import Data.DataStore;

public class setInitialV1 extends setInitialValue{//set the intial values gp1
    DS_1 d;
    public setInitialV1(DS_1 d){
        this.d=d;
    }

    public void setInitialValue() {
        d.temp_c=0;
        d.temp_a=0;
        d.L=0;
        d.total=0;
    }
}
