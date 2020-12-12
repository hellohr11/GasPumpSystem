package MDA;

public class S5 extends MDA_State{
    private int id=5;

    @Override
    public int getId() {
        return id;
    }
    public void EjectCard() {
        af.ejectcard();
    }

    public void wrongPinMsg(){
        af.wrongPinMsg();
    }
    public void displayMenu(){af.displaymenu();}
}
