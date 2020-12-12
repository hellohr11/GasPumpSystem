package MDA;

public class S2 extends MDA_State{
    private int id=2;
    @Override
    public int getId() {
        return id;
    }
    public void RejectCard(){
        af.rejectmsg();
    }

    @Override
    public void EjectCard() {
        af.ejectcard();
    }

    public void displayMenu(){
        af.displaymenu();
    }
}
