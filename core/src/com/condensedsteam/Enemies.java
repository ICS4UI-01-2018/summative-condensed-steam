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
    private boolean collisionEnemy;
    private boolean collisionPlayer;
    private boolean crashed;

    public Enemies(float positionX, float positionY, int score, boolean collisionEnemy, boolean collisionPlayer, boolean crashed) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.score = score;
        this.collisionEnemy = collisionEnemy;
        this.collisionPlayer = collisionPlayer;
        this.crashed = crashed;
    }

    public void moveup() {
    }

    public void movedown() {
    }

    public void moveright() {
    }

    public void moveleft() {
    }

    public boolean collisionEnemy() {
        return this.collisionEnemy;
    }

    public boolean collisionPlayer() {
        return this.collisionPlayer;
    }

    public boolean crashed() {
        return this.crashed;
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
