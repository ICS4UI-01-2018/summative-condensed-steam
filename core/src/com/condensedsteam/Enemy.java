/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.condensedsteam;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;

/**
 *
 * @author Kalsr8025
 */
public class Enemy extends Enemies {

    private Rectangle enemy;

    public Enemy(float positionX, float positionY, int score, boolean collisionEnemy, boolean collisionPlayer, boolean crashed) {
        super(positionX, positionY, score, collisionEnemy, collisionPlayer, crashed);
        this.enemy = new Rectangle(positionX, positionY, 20, 30);
    }

    @Override
    public void moveup() {
        enemy.y += 1;
    }

    @Override
    public void movedown() {
        enemy.y -= 1;
    }

    @Override
    public void moveright() {
        enemy.x += 1;
    }

    public void movetowardsplayer() {

    }

    @Override
    public void moveleft() {
        enemy.x -= 1;
    }

    public void draw(ShapeRenderer shapeBatch) {
        shapeBatch.rect(enemy.x, enemy.y, enemy.width, enemy.height);
    }
}
