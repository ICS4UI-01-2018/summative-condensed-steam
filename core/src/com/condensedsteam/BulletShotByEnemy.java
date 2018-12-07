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

    private String direction;
    private float speed = 3.0f;
    private int x;
    private int y;

    public BulletShotByEnemy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void launchBullet(String direction) {
        this.direction = direction;
    }

    // direction we want bullet to move
    public void moveInDirectionOfTarget() {
    }
}


