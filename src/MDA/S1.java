package MDA;

public class S1 extends MDA_State {
    private int id=1;

    @Override
    public int getId() {
        return id;
    }

    public void PayCash(){
        af.StoreCash();
        af.setW(0);
    }

    public void StorePin(){
        af.StorePin();
    }

    public void enterPinMsg(){
        af.EnterPinMsg();
    }
    public void displayMenu(){af.displaymenu();}

}
