package MDA;

import Operation.StorePrices;

public class S0 extends MDA_State{
    private int id=0;

    public void Start(){
        af.paymsg();
        af.setInitialValue();
        af.setW(1);
    }

    @Override
    public int getId() {
        return id;
    }
}
