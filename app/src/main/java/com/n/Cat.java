package com.n;

public class Cat extends Thread{
    public static final int DIRECTION_RIGHT = 0;
    public static final int DIRECTION_LEFT = 1;
    public static final int DIRECTION_UP = 2;
    public static final int DIRECTION_DOWN = 3;
    public static final int DIRECTION_NONE = -1;
    private final GameMap gameMap;
    int X =0;
    int Y =0;
    int direction = DIRECTION_NONE;

    public Cat(GameMap gameMap){
        this.gameMap = gameMap;
    }


    @Override
    public void run(){

    }
}
