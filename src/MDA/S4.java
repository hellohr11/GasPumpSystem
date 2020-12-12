package MDA;

public class S4 extends MDA_State{
    private int id=4;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void gasPumpMsg() {
        af.gasPumpMsg();
    }

    public void StopPump(){
        af.printReceipt();
        af.returnCash();
    }
}
