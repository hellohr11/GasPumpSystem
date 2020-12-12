package MDA;

import AbstractFactory.AF;

public abstract class MDA_State {
    private int id;
    AF af;

    public void activate(){doNothing();}
    public void Start(){doNothing();}
    public void RejectCard(){doNothing();}
    public void EjectCard(){doNothing();}
    public void cancelMsg(){doNothing();}
    public void returnCash(){doNothing();}
    public void PayCash(){doNothing();}
    public void doNothing(){
        System.out.println("do nothing");
    }
    public void StorePin(){doNothing();}
    public void enterPinMsg(){doNothing();}
    public void wrongPinMsg(){doNothing();}
    public void setPrice(int g){doNothing();}

    public int getId() {
        return id;
    }

    public void setAf(AF af) {
        this.af = af;
    }

    public void gasPumpMsg(){doNothing();}
    public void StopPump(){doNothing();}
    public void setInitialV(){doNothing();}
    public void displayMenu(){doNothing();}
}
