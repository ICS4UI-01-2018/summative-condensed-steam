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
public class BulletShotByEnemy {

    private int speed = 3;
    private int x;
    private int y;
    private boolean visible;

    public BulletShotByEnemy(int x, int y) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.visible = true;
    }

    public void update() {
        x += speed;
        if (x > 800) {
            visible = false;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

}
