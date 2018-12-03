/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.condensedsteam;

/**
 *
 * @author Kalsr8025
 */
public class Enemies {
    private float positionX;
    private float positionY;
    private int score;
    
    public Enemies(float positionX, float positionY, int score) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.score = score;
    }
    
    public void move(){
      
    }
    
    public float getPositionX() {
        return this.positionX;
    }

    public float getPositionY() {
        return this.positionY;
    }
    // add something that makes sure we add 10 points when enemy is killed but sub 5
    // points when fixed enemy is killed
    public int getScore() {
       return this.score;
    }
        
}
