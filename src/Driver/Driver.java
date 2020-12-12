package Driver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import GasPump.*;
public class Driver {
    //driver

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select type of GasPump: ");
        System.out.println("1. GasPump1");
        System.out.println("2. GasPump2");
        System.out.print("> ");

        char ch='1';
        ch=sc.next().charAt(0);
        if(ch=='1') {

            GasPump_1 gp1 = new GasPump_1();
            gp1.af.displaymenu();
            GP1(gp1);
        }else if(ch=='2'){
            GasPump_2 gp2=new GasPump_2();
            gp2.af.displaymenu();
            GP2(gp2);
        }



    }

    public static void GP1(GasPump_1 gp1){
        Scanner sc = new Scanner(System.in);
        char ch='1';

        while (ch !='q')
        {
            System.out.print("\n");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("  Select Operation: ");
            System.out.print("\n");
            System.out.print("0-Activate,1-Start,2-PayCredit,3-Reject,4-Cancel,5-Approved,6-PayCash,7-StartPump, 8-PumpLiter, 9-StopPump, q-quit");
            System.out.print("\n");
            System.out.println("----------------------------------------------------------------------------");
            ch=sc.next().charAt(0);
            switch (ch)
            {
                case '0':

                { //Activate()
                    System.out.print("  Operation:  Activate(int a)");
                    System.out.print("\n");
                    System.out.print("  Enter value of the parameter a:");
                    System.out.print("\n");
                    int a = sc.nextInt();
                    gp1.Activate(a);
                    break;
                }

                case '1':
                { //Start
                    System.out.print("  Operation:  Start()");
                    System.out.print("\n");
                    gp1.Start();
                    break;
                }

                case '2':
                { //PayCredit
                    System.out.print("  Operation:  PayCredit()");
                    System.out.print("\n");
                    gp1.PayCredit();
                    break;
                }

                case '3':
                { //Reject
                    System.out.print("  Operation:  Reject()");
                    System.out.print("\n");
                    gp1.Reject();
                    break;
                }

                case '4':
                { //Cancel
                    System.out.print("  Operation:  Cancel()");
                    System.out.print("\n");
                    gp1.Cancel();
                    break;
                }

                case '5':
                { //Approved
                    System.out.print("  Operation:  Approved()");
                    System.out.print("\n");
                    gp1.Approved();
                    break;
                }

                case '6':
                { //PayCash
                    System.out.print("  Operation:  PayCash(int c)");
                    System.out.print("\n");
                    System.out.print("  Enter value of the parameter c:");
                    System.out.print("\n");
                    int c =  sc.nextInt();
                    gp1.PayCash(c);
                    break;
                }

                case '7':
                { //StartPump
                    System.out.print("  Operation:  StartPump()");
                    System.out.print("\n");
                    gp1.StartPump();
                    break;
                }


                case '8':
                { //PumpLiter
                    System.out.print("  Operation:  PumpLiter()");
                    System.out.print("\n");
                    gp1.PumpLiter();
                    break;
                }

                case '9':
                { //StopPump
                    System.out.print("  Operation:  StopPump()");
                    System.out.print("\n");
                    gp1.StopPump();
                    break;
                }
            }; // endswitch

        };

    }

    public static void GP2(GasPump_2 gp2){
        Scanner sc = new Scanner(System.in);
        char ch='1';

        while (ch !='q')
        {
            System.out.print("\n");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("  Select Operation: ");
            System.out.print("\n");
            System.out.print("0-Activate,1-Start,2-PayCredit,3-Reject,4-Cancel,5-Approved,6-PayDebit,7-Pin, \n" +
                    "8-Diesel, 9-Regular, a-Super, b-StarPump, c-PumpGallon, d-StopPump, e-FullTank, q-quit");
            System.out.print("\n");
            System.out.println("----------------------------------------------------------------------------");
            ch=sc.next().charAt(0);
            switch (ch)
            {
                case '0':

                { //Activate()
                    System.out.print("  Operation:  Activate(float a, float b, float c)");
                    System.out.print("\n");
                    System.out.print("  Enter value of the parameter a(Regular): ");
                    float a = sc.nextFloat();
                    System.out.print("  Enter value of the parameter b(Diesel): ");
                    float b=sc.nextFloat();
                    System.out.print("  Enter value of the parameter c(Super): ");
                    float c=sc.nextFloat();
                    gp2.Activate(a,b,c);
                    break;
                }

                case '1':
                { //Start
                    System.out.print("  Operation:  Start()");
                    System.out.print("\n");
                    gp2.Start();
                    break;
                }

                case '2':
                { //PayCredit
                    System.out.print("  Operation:  PayCredit()");
                    System.out.print("\n");
                    gp2.PayCredit();
                    break;
                }

                case '3':
                { //Reject
                    System.out.print("  Operation:  Reject()");
                    System.out.print("\n");
                    gp2.Reject();
                    break;
                }

                case '4':
                { //Cancel
                    System.out.print("  Operation:  Cancel()");
                    System.out.print("\n");
                    gp2.Cancel();
                    break;
                }

                case '5':
                { //Approved
                    System.out.print("  Operation:  Approved()");
                    System.out.print("\n");
                    gp2.Approved();
                    break;
                }

                case '6':
                { //PayDebit
                    System.out.print("  Operation:  PayDebit(String p)");
                    System.out.print("\n");
                    System.out.print("  Enter value of the parameter p:");
                    String p =  sc.next();
                    gp2.PayDebit(p);
                    break;
                }

                case '7':
                {//Pin
                    System.out.print("  Operation:  Pin(String p)");
                    System.out.print("\n");
                    System.out.print("  Enter your pin:");
                    String p =  sc.next();
                    gp2.Pin(p);
                    break;

                }

                case '8':
                {//Diesel
                    System.out.print("  Operation:  Diesel()");
                    System.out.print("\n");
                    gp2.Diesel();
                    break;
                }

                case '9':
                {//Regular
                    System.out.print("  Operation:  Regular()");
                    System.out.print("\n");
                    gp2.Regular();
                    break;

                }

                case 'a':
                {//Super
                    System.out.print("  Operation:  Super()");
                    System.out.print("\n");
                    gp2.Super();
                    break;

                }


                case 'b':
                { //StartPump
                    System.out.print("  Operation:  StartPump()");
                    System.out.print("\n");
                    gp2.StartPump();
                    break;
                }


                case 'c':
                { //PumpGallon
                    System.out.print("  Operation:  PumpGallon()");
                    System.out.print("\n");
                    gp2.PumpGallon();
                    break;
                }

                case 'd':
                { //StopPump
                    System.out.print("  Operation:  StopPump()");
                    System.out.print("\n");
                    gp2.StopPump();
                    break;
                }

                case 'e':
                {//FullTank
                    System.out.print("  Operation:  FullTank()");
                    System.out.print("\n");
                    gp2.FullTank();
                    break;
                }


            }; // endswitch

        };

    }


}
