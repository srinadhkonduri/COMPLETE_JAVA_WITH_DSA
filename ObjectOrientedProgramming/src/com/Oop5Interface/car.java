package com.Oop5Interface;

public class car implements Engine,Break,Media {

    @Override
    public void start() {
        System.out.println("i start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("i stop like a normal car");
    }

    @Override
    public void acc() {
        System.out.println("i accelerate like a normal car");
    }

    @Override
    public void Break() {
        System.out.println("i break like a normal car");
    }
}
