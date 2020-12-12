package Operation;

public class WpinMsg2 extends WrongPinMsg{//wrong pin message for gp2
    @Override
    public void wrongPinMsg() {
        System.out.println("Sorry, the pin is incorrect.");
    }
}
