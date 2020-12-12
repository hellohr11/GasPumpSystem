package MDA;

import AbstractFactory.AF;

import java.util.ArrayList;

public class MDA_EFSM {
    public int k;
    MDA_State s;
    private MDA_State[] sl;
    public MDA_EFSM(AF af){
        k=0;
        //7 states
        sl=new MDA_State[7];
        sl[0]=new StateInitial();
        sl[1]=new S0();
        sl[2]=new S1();
        sl[3]=new S2();
        sl[4]=new S3();
        sl[5]=new S4();
        sl[6]=new S5();


        for(MDA_State st:sl)
        {
            st.setAf(af);
        }
        s=sl[0];
    }

    public void Activate(){
        if(s.getId()==-1){
            s.activate();
            s=sl[1];
        }
    }

    public void Start(){
        if(s.getId()==0){
            s.Start();
            s=sl[2];

        }
    }

    public void PayCredit(){

        if(s.getId()==1){

            s=sl[3];
        }
    }

    public void Reject(){

        if(s.getId()==2){
            s.RejectCard();
            s.EjectCard();
            s=sl[1];
        }
    }

    public void Approved(){
        if(s.getId()==2){
            s.EjectCard();
            s.displayMenu();
            s=sl[4];

        }
    }

    public void Cancel(){
        if(s.getId()==3){
            s.cancelMsg();
            s.returnCash();
            s=sl[1];
        }
    }

    public void PayCash(){
        if(s.getId()==1){
            s.PayCash();
            s.displayMenu();
            s=sl[4];
        }
    }

    public void StartPump(){
        if(s.getId()==3){
            s.setInitialV();
            s=sl[5];
        }
    }

    public void Pump(){
        if(s.getId()==4){
            s.gasPumpMsg();
        }
    }

    public void StopPump(){
        if(s.getId()==4){
            s.StopPump();
            s=sl[1];
        }
    }

    public void PayDebit(){
        if(s.getId()==1){
            k=0;
            s.StorePin();
            s.enterPinMsg();
            s=sl[6];
        }
    }

    public void CorrectPin(){
        if(s.getId()==5){
            s.displayMenu();
            s.EjectCard();
            s=sl[4];
        }
    }

    public void InCorrectPin(int max){
        if(s.getId()==5){
            s.wrongPinMsg();
            if(k<=max){
                k=k+1;
            }else{
                s.EjectCard();
                s=sl[1];
            }
        }

    }

    public void SelectGas(int g){//1 regular, 2 super, 3 diesel
        if(s.getId()==3){
            s.setPrice(g);
        }
    }




}
