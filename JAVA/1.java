package com.company;



public class Main {

    public static void main(String[] args) {
        People.get_info();
        People Boris = new People(1222);
        Boris.get_info();
        People Kurva = new People(0000);
        Boris.get_info();
        Kurva.get_info();
        System.out.println(People.max_wen);
    }
}

class People{
    static int max_wen = 122;
    int mm;
    People(int x){
        max_wen = x;
    }
    public static void get_info(){
        System.out.println(max_wen);
    }
}
