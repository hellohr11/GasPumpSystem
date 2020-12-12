package AbstractFactory;

import Data.DS_1;
import Data.DataStore;
import Operation.*;

public class CF_1 extends AF {
    //abstract factory for gaspump1

    private DS_1 d;
    public CF_1(){

        d=new DS_1();
        s=new StorePrices1();
        menu=new DisplayMenu1();
        siv=new setInitialV1(d);
        sw=new W(d);
        rc=new returnc1(d);
        sc=new StoreCash1(d);
        gpm=new GasPumpMsg1(d);
        receipt=new Receipt1(d);
    }

    @Override
    public void setPrice(int g) {

    }

    @Override
    public void wrongPinMsg() {

    }

    @Override
    public void EnterPinMsg() {

    }

    @Override
    public void StorePin() {

    }

    @Override
    public DataStore getDataObj() {
        return d;
    }

    @Override
    public void StorePrices() {

        s.StorePrices(d);
    }

    @Override
    public void displaymenu() {
        menu.displaymenu();

    }

    @Override
    public void setInitialValue() {
        siv.setInitialValue();
    }

    public void setW(int w){
        sw.setW(w);
    }

    @Override
    public void returnCash() {
        if(d.w==0){
            rc.returnCash();
        }
    }

    public void StoreCash(){ sc.storecash(); }

    @Override
    public void gasPumpMsg() {
        gpm.gaspumpmsg();
    }

    @Override
    public void printReceipt() {
        receipt.PrintReceipt();
    }

}
