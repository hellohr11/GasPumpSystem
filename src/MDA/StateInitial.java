package MDA;

import Operation.StorePrices;

public class StateInitial extends MDA_State {
    private int id=-1;

    @Override
    public int getId() {
        return id;
    }

    public void activate(){
        af.StorePrices();
    }
}
