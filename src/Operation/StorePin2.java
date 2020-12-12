package Operation;

import Data.DS_2;

public class StorePin2 extends StorePin{//store pin gp2
    DS_2 d;
    public StorePin2(DS_2 d){
        this.d=d;
    }
    @Override
    public void storepin() {
        d.pin=d.temp_p;
    }
}
