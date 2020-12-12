package AbstractFactory;

import Data.DS_2;
import Data.DataStore;
import Operation.*;

public class CF_2 extends AF {
    //abstract factory for gaspump2
    private DS_2 d;

    public CF_2(){

        d=new DS_2();
        s=new StorePrices2();
        menu=new DisplayMenu2();
        sp=new StorePin2(d);
        epm=new EnterPMSG2();
        wpm=new WpinMsg2();
        setp=new setPrice2(d);
        gpm=new GasPumpMsg2(d);
        receipt=new Receipt2(d);
        siv=new setInitialV2(d);
    }

    @Override
    public void setPrice(int g) {
        setp.setprice(g);

    }

    @Override
    public void wrongPinMsg() {
        wpm.wrongPinMsg();
    }

    @Override
    public void EnterPinMsg() {
        epm.EnterPinMsg();
    }

    @Override
    public void StorePin() {
        sp.storepin();
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

    @Override
    public void setW(int w) {}

    @Override
    public void returnCash() {

    }

    @Override
    public void StoreCash() {

    }

    @Override
    public void gasPumpMsg() {
        gpm.gaspumpmsg();
    }

    @Override
    public void printReceipt() {
        receipt.PrintReceipt();
    }


}
