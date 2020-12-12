package AbstractFactory;
import Data.*;
import Operation.*;

public abstract class AF {
    //abstract factory
    StorePrices s;
    DisplayMenu menu;
    PayMsg payMsg=new PayMsg();
    setInitialValue siv;
    sW sw;
    ReturnCash rc;
    StoreCash sc;
    RejectMsg rjtm=new RejectMsg();
    EjectC ejectC=new EjectC();
    CancelMsg clm=new CancelMsg();
    GasPumpMsg gpm;
    Receipt receipt;
    StorePin sp;
    EnterPinMsg epm;
    WrongPinMsg wpm;
    setPrice setp;
    public abstract void setPrice(int g);
    public abstract void wrongPinMsg();
    public abstract void EnterPinMsg();
    public abstract void StorePin();
    public abstract DataStore getDataObj();
    public abstract void StorePrices();
    public abstract void displaymenu();
    public abstract void setInitialValue();
    public void paymsg(){
        payMsg.DisplayPayMsg();
    }
    public abstract void setW(int w);
    public abstract void returnCash();
    public void rejectmsg(){rjtm.DisplayRejectMsg(); }
    public void ejectcard(){ejectC.EjectCard();}
    public void cancelMsg(){clm.printCancelMsg();}
    public abstract void StoreCash();
    public abstract void gasPumpMsg();
    public abstract void printReceipt();
}
