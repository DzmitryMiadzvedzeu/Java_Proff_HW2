package com.telran.org.homeworktwo;

public class ButtonPhone extends Phone{
    private int ownNumber;

    public int getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(int ownNumber) {
        this.ownNumber = ownNumber;
    }

    @Override
    public void call(int num) {
        System.out.print("The phone " + getPhoneName() + " " + ownNumber );
        super.call(num);

    }

    @Override
    public void receiveCall(int num) {
        System.out.print("The phone " + getPhoneName() + " " + ownNumber );
        super.receiveCall(num);
    }
}
