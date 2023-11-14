package model.impl;

import java.util.Random;

import model.RandomNumberGenerate;

public class RandomNumberGenerateImpl implements RandomNumberGenerate {

    private final Random rng;
    
    public RandomNumberGenerateImpl(){
      rng = new Random();
    }

    @Override
    public int nextInt(int bound){
      return rng.nextInt(bound);
    }
}
