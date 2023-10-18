package com.telran.org.homeworktwo;

public class HomeworkTwoApp {

    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.setPhoneName("HTC One");
        smartPhone.setOwnNumber(7777);

        ButtonPhone buttonPhone = new ButtonPhone();
        buttonPhone.setPhoneName("Alcatel");
        buttonPhone.setOwnNumber(8888);

        RadioPhone radioPhone = new RadioPhone();
        radioPhone.setPhoneName("Motorolla");
        radioPhone.setOwnNumber(9999);

        smartPhone.call(2222);
        smartPhone.receiveCall(2222);

        buttonPhone.call(3333);
        buttonPhone.receiveCall(3333);

        radioPhone.call(4444);
        radioPhone.receiveCall(4444);

//        Phone[] phones = {smartPhone, buttonPhone, radioPhone};
//        calls(phones);
    }
//
//    private static void calls(Phone[] phones){
//        for (Phone phone : phones){
//            Phone.makeCall(909);
//        }
//    }
//
// В закоменченном коде, в классе родителе и в классе приложения, не смог реализовать идею с массивом
// из задания со *. Упёрся в то, что массив исполняется 3 раза только с radioPhone.
// Объясните пожалуйста, как это можно былло сделать. Извините что поздно сдаю, Но я вас догоню, это точно))

}
