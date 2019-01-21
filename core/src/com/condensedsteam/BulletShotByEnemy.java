/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.condensedsteam;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;

/**
 *
 * @author Kalsr8025
 */
public class BulletShotByEnemy {
 private float width = 80;
    private float height = 40;
    private int speed = 5;
    private boolean visible;
    private Enemy enemy;
    private Rectangle bullet;

    public BulletShotByEnemy(float x, float y) {
        bullet = new Rectangle(x, y, width, height);
        visible = false;
    }

    public void movetowardsplayer() {

    }

    public boolean visible() {
        return this.visible = true;
    }

    public float x() {
        return bullet.x;
    }

    public float y() {
        return bullet.y;
    }

    public boolean collisionEnemy(Player player) {
        if (bullet.overlaps(player.getBounds())) {
            return true;
        } else {
            return false;
        }
    }

    public void drawBullet(ShapeRenderer shapeBatch) {
        shapeBatch.rect(bullet.x, bullet.y, bullet.width, bullet.height);
        shapeBatch.setColor(Color.CLEAR);

    }

}

