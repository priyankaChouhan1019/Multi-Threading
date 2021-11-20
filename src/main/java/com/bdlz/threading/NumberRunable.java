package com.bdlz.threading;

public class NumberRunable implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (CharacterThread.exit) {
                break;
            } else {
                System.out.println(i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
