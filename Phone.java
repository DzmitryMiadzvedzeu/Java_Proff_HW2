package com.telran.org.homeworktwo;

public class Phone {

    private String phoneName;

    public void call( int number) {
        System.out.println(" try to make a call to number " + number);
    }

    public void receiveCall(int number) {

        System.out.println(" try to receive a call from number " + number);
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }
//
//    public static void makeCall(int number) {
//        System.out.println("The phone " + phoneName + " " + " make call to " + number);
//    }
//


}
