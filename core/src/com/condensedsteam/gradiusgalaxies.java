package com.condensedsteam;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.TimeUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;
import java.util.ArrayList;
import com.badlogic.gdx.utils.viewport.FitViewport;

public class gradiusgalaxies extends ApplicationAdapter implements InputProcessor {

    private SpriteBatch batch;
    private ShapeRenderer shapeBatch;
    public SpriteBatch showTime;
    private OrthographicCamera camera;
    // TiledMapRenderer tiledMapRenderer;
    private Texture spaceshipPic;
    private Player player;
    private Enemy enemy;
    private Fixed fixed;
    private Bullet bullet;
    private Texture fixedPic;
    private Texture background;
    private Texture enemypic;
    private Texture bulletPic;
    private FitViewport viewport;
    private Vector3 offset;
    private ArrayList<Bullet> bullets;
    public static final float PIXEL_PER_METER = 32f;
//    public ArrayList<Enemy> enemyMonster = new ArrayList<Enemy>();
//    boolean summoned = false;

    @Override
    public void create() {
        batch = new SpriteBatch();
        shapeBatch = new ShapeRenderer();


        float w = Gdx.graphics.getWidth();
        float h = Gdx.graphics.getHeight();

        camera = new OrthographicCamera();
        camera.setToOrtho(false);
        viewport = new FitViewport(800, 660, camera);
        viewport.apply();

        background = new Texture("GAME MAP (3).png");
        spaceshipPic = new Texture("spaceship.png");
        bulletPic = new Texture("bullet.png");
        fixedPic = new Texture("asteroid-icon.png");
        enemypic = new Texture("enemyspaceship.png");
        Gdx.input.setInputProcessor(this);
        player = new Player(100, 200, 20, 20, 2, 0);
        enemy = new Enemy(20, 20, 5);
        fixed = new Fixed(100, 100, 2);
        if (Gdx.input.isKeyPressed(Input.Keys.SPACE)) {
            bullet = new Bullet(100, 100, 3, 3, 3);
        }
        //   bullet = new BulletShotByPlayer();
//        showTime = new SpriteBatch();

    }

    @Override
    public void render() {

        fixed.movedown();
        camera.position.set(player.getXPosition(), 100, 0);
        camera.update();
        batch.setProjectionMatrix(camera.combined);

        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        //camera.combined.scl(PIXEL_PER_METER));

        shapeBatch.setColor(Color.WHITE);
        shapeBatch.begin(ShapeRenderer.ShapeType.Line);
        shapeBatch.end();

        shapeBatch.setProjectionMatrix(camera.combined);

        batch.begin();
        batch.draw(background, 0, -150);
        batch.draw(fixedPic, fixed.getBottomLeft(), fixed.getTopLeft(), 120, 120);
        batch.draw(spaceshipPic, player.getBottomLeft(), player.getTopLeft(), 60, 60);
        batch.draw(enemypic, enemy.getBottomLeft(), enemy.getTopLeft(), 40, 40);
        batch.end();

        batch.begin();
        if (Gdx.input.isKeyPressed(Input.Keys.SPACE)) {
            batch.draw(bulletPic, bullet.getLeft(), bullet.getBottom(), 3, 3);
        }
        batch.end();

        enemy.movetowardsplayer(player);
        if (player.getYPosition() < 660) {

            if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
                player.moveUp();
            }
        }
        if (player.getYPosition() > 0) {
            if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
                player.moveDown();
            }
        }
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            player.moveForward();

        }
        if (player.getXPosition() > 0) {
            if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
                player.moveBack();
            }
        }

        batch.begin();
        batch.draw(background, 0, 0);
        batch.draw(fixedPic, fixed.getBottomLeft(), fixed.getTopLeft(), 120, 120);
        batch.draw(spaceshipPic, player.getBottomLeft(), player.getTopLeft(), 60, 60);
//        batch.draw(enemypic, enemy.getBottomLeft(), enemy.getTopLeft(), 40, 40);
//        summonEnemy(showTime);
        batch.end();
    }

//        shapeBatch.setProjectionMatrix(camera.combined);
//        batch.begin();
//        batch.draw(fixedPic, fixed.getBottom(), fixed.getTop());
//        batch.end();
//    public void setUpEnemy() {
//        for (int i = 0; i < enemy.NUMBER_OF_ENEMIES; i++) {
//            Enemy enemy = new Enemy(20);
//            Enemy.add(enemy);
//        }
//    }
//
//    public void summonEnemy(SpriteBatch batch) {
//    //    if (roundTime == 0) {
//            if (summoned == false) {
//                for (int i = 0; i < enemy.NUMBER_OF_ENEMIES; i++) {
//                    batch.draw(enemypic, enemy.getBottomLeft(), enemy.getTopLeft());
//                }
//            }
//            summoned = true;
//        }
  
private void cameraUpdate() {
        Vector3 position = camera.position;
        position.x = player.getXPosition() * PIXEL_PER_METER;
        position.y = player.getYPosition() * PIXEL_PER_METER;
        camera.position.set(position);
        camera.update();
    }

    @Override
    public void resize(int width, int height) {
        camera.viewportWidth = width;
        camera.viewportHeight = height;
    }

    @Override
    public void dispose() {
        batch.dispose();
    }

    @Override
    public boolean keyTyped(char character) {

        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }

    @Override
    public boolean keyDown(int keycode) {

        if (keycode == Input.Keys.UP) {
            camera.translate(0f, 1f);
        }
        if (keycode == Input.Keys.DOWN) {
            camera.translate(0f, -1f);
        }
        if (keycode == Input.Keys.RIGHT) {
            camera.translate(1f, 0f);
        }
        if (keycode == Input.Keys.LEFT) {
            camera.translate(-1f, 0f);
        }
        return true;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

}
