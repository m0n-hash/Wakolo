package util;

public class Samsung extends Phone {
    private String samsungAccount;

    public String getSamsungAccount() {
        return samsungAccount;
    }

    @Override
    public void sendMessage() {
        System.out.print("samsung - send message");
    }

    @Override
    public void call() {

    }

    public void setSamsungAccount(String samsungAccount) {
        this.samsungAccount = samsungAccount;
    }
}
