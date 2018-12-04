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
public class EnemyShootPlayer extends Enemies{
    
    public EnemyShootPlayer(float positionX, float positionY, int score, boolean collisionEnemy, boolean collisionPlayer, boolean crashed) {
        super(positionX, positionY, score, collisionEnemy, collisionPlayer, crashed);
    }
    
    @Override
    public void move() {
        
    }
}

// move up, down, right, left
