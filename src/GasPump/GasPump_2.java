package GasPump;

import AbstractFactory.AF;
import AbstractFactory.CF_1;
import AbstractFactory.CF_2;
import Data.DS_1;
import Data.DS_2;
import MDA.MDA_EFSM;

public class GasPump_2{
    public AF af;
    public DS_2 d;
    public MDA_EFSM mda;

    public GasPump_2(){
        af=new CF_2();
        d= (DS_2) af.getDataObj();
        mda=new MDA_EFSM(af);
    }
    public void Activate(float a, float b, float c){
        if(a>0 && b>0 && c>0){
            d.temp_a=a;
            d.temp_b=b;
            d.temp_c=c;
            mda.Activate();
        }
    }

    public void Start(){
        mda.Start();
    }

    public void PayCredit(){
        mda.PayCredit();
    }

    public void Reject(){
        mda.Reject();
    }

    public void PayDebit(String p){
        d.temp_p=p;
        mda.PayDebit();
    }

    public void Pin(String x){
        if(d.pin.equals(x)){
            mda.CorrectPin();
        }else{
            mda.InCorrectPin(1);
        }
    }

    public void Cancel(){
        mda.Cancel();
    }

    public void Approved(){
        mda.Approved();
    }

    public void Diesel(){
        mda.SelectGas(3);
    }

    public void Regular(){
        mda.SelectGas(1);
    }

    public void Super(){
        mda.SelectGas(2);
    }

    public void StartPump(){
        if(d.price>0){
            mda.StartPump();
        }
    }

    public void PumpGallon(){
        mda.Pump();
    }

    public void StopPump(){
        mda.StopPump();
    }

    public void FullTank(){
        mda.StopPump();
    }
}
