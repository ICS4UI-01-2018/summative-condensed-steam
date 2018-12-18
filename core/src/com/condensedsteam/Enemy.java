/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.condensedsteam;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import java.util.ArrayList;

/**
 *
 * @author Kalsr8025
 */
public class Enemy extends Enemies {

    private Rectangle enemy;
    private BulletShotByEnemy bullet;
    private ArrayList<BulletShotByEnemy> projectiles = new ArrayList<BulletShotByEnemy>();
    private Player player;

    public Enemy(float positionX, float positionY, int width, int height, int score, boolean collisionEnemy, boolean collisionPlayer, boolean crashed) {
        super(positionX, positionY, width, height, score, collisionEnemy, collisionPlayer, crashed);
        this.enemy = new Rectangle(positionX, positionY, 20, 30);
//        this.target = target;
    }

    @Override
    public void move() {
        enemy.y += 1;
    }
//work on this 

    public void movetowardsplayer() {
        float pX = player.getXPosition();
        float pY = player.getYPosition();
        if (pX > this.enemy.x) {
            this.enemy.x = this.enemy.x + 1;
        } else if (pX < this.enemy.x) {
            this.enemy.x = this.enemy.x - 1;
        }
        if (pY > this.enemy.y) {
            this.enemy.y = this.enemy.y + 1;
        } else if (pY < this.enemy.y) {
            this.enemy.y = this.enemy.y - 1;
        }

    }

    public void draw(ShapeRenderer shapeBatch) {
        shapeBatch.rect(enemy.x, enemy.y, enemy.width, enemy.height);
    }

    public void shoot() {
        BulletShotByEnemy shoot;
        shoot = new BulletShotByEnemy((int) (enemy.x + Math.random()), (int) (enemy.y + Math.random()));
        projectiles.add(shoot);
    }

    public ArrayList getBulletShotByEnemy() {
        return projectiles;
    }

}
