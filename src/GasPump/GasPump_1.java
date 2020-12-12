package GasPump;
import AbstractFactory.AF;
import AbstractFactory.CF_1;
import Data.DS_1;
import Data.DataStore;
import MDA.MDA_EFSM;
import MDA.MDA_State;

public class GasPump_1{

    public AF af;
    public DS_1 d;
    public MDA_EFSM mda;


    public GasPump_1(){
        af=new CF_1();
        d= (DS_1) af.getDataObj();
        mda=new MDA_EFSM(af);
    }

    public void Activate(int a) {
        if(a>0){
            d.temp_a=a;
            mda.Activate();
        }

    }

    public void Start(){
        mda.Start();
    }

    public void PayCash(float c){
        if(c>0){
            d.temp_c=c;
            mda.PayCash();
        }
    }

    public void PayCredit(){
        mda.PayCredit();
    }

    public void Reject(){
        mda.Reject();
    }

    public void Approved(){
        mda.Approved();
    }
    public void Cancel(){
        mda.Cancel();
    }
    public void StartPump(){
        mda.StartPump();
    }

    public void PumpLiter(){
        if(d.w==1){
            mda.Pump();
        }else if(d.cash>0 && d.cash<d.price*d.L){
            mda.StopPump();
        }else{
            mda.Pump();
        }
    }

    public void StopPump(){
        mda.StopPump();
    }
}
