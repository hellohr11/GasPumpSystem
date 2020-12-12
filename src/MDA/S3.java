package MDA;

public class S3 extends MDA_State{
    private int id=3;
    @Override
    public void EjectCard() {
        af.ejectcard();
    }

    @Override
    public int getId() {
        return id;
    }

    public void cancelMsg(){af.cancelMsg();}
    public void returnCash(){af.returnCash();}
    public void setPrice(int g){
        af.setPrice(g);
    }
    public void setInitialV(){af.setInitialValue();}

}
