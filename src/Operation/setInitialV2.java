package Operation;

import Data.DS_1;
import Data.DS_2;

public class setInitialV2 extends setInitialValue{//set the intial values gp2

    DS_2 d;
    public setInitialV2(DS_2 d){
        this.d=d;
    }
    public void setInitialValue() {
        d.temp_a=0;
        d.temp_b=0;
        d.temp_c=0;
        d.total=0;
        d.G=0;
        d.temp_p="";
    }
}
