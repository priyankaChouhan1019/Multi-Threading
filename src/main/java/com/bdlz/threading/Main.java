package com.bdlz.threading;

public class Main {
    public static void main(String[] args) {
        CharacterThread characterThread = new CharacterThread();
        NumberRunable numberRunable = new NumberRunable();
       Thread numberThread =new Thread(numberRunable);

       characterThread.start();
       numberThread.start();
    }
}
