package com.condensedsteam;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Input;
import static com.badlogic.gdx.Input.Keys.F;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.TimeUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;
import java.util.ArrayList;
import com.badlogic.gdx.utils.viewport.FitViewport;

public class gradiusgalaxies extends ApplicationAdapter implements InputProcessor {

    SpriteBatch batch;
    private ShapeRenderer shapeBatch;
    public SpriteBatch showTime;
    private OrthographicCamera camera;
    // TiledMapRenderer tiledMapRenderer;
    private Texture spaceshipPic;
    private Player player;
    private Enemy enemy;
    private Enemy enemy2;
    private Enemy enemy3;
    private Enemy enemy4;
    private Enemy enemy5;
    private Enemy enemy6;
    private Enemy enemy7;
    private Enemy enemy8;
    private Enemy enemy9;
    private Texture fixedPic;
    private Texture background;
    private Texture enemypic;
    private Texture enemypic2;
    private Texture bulletPic;
    private FitViewport viewport;
    private Vector3 offset;
    private Bullet2[] bullets;
    private MainMenu MainMenu;

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

        enemypic = new Texture("enemyspaceship.png");
        enemypic2 = new Texture("enemy1.png");
        Gdx.input.setInputProcessor(this);
        player = new Player(100, 200, 20, 20, 2, 0);
        enemy = new Enemy(900, 400, 5);
        enemy2 = new Enemy(900, 100, 5);
        enemy3 = new Enemy(900, 300, 5);
        enemy4 = new Enemy(900, 500, 5);
        bullets = new Bullet2[200];
        for (int i = 0; i < bullets.length; i++) {
            bullets[i] = new Bullet2(player.getXPosition(), player.getYPosition());

        }

    }

    @Override
    public void render() {

        camera.position.set(player.getXPosition(), 100, 0);
        camera.update();
        batch.setProjectionMatrix(camera.combined);

        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        shapeBatch.setColor(Color.WHITE);
        shapeBatch.begin(ShapeRenderer.ShapeType.Filled);
        batch.begin();
        batch.draw(background, 0, -150);
        batch.draw(background, -450, -150);
        batch.draw(background, -900, -150);
        batch.draw(background, 2000, -150);
        batch.draw(background, 3000, -150);
        batch.draw(background, 4000, -150);
        batch.draw(background, 5000, -150);
        batch.draw(background, 6000, -150);
        batch.draw(background, 7000, -150);
        batch.draw(background, 8000, -150);
        batch.draw(background, 9000, -150);
        batch.draw(background, 10000, -150);
        batch.end();
        shapeBatch.rect(-450, -150, 5, 500);
        shapeBatch.rect(10060, -150, 5, 500);

        shapeBatch.end();

        shapeBatch.setProjectionMatrix(camera.combined);

        batch.begin();
        batch.draw(spaceshipPic, player.getBottomLeft(), player.getTopLeft(), 60, 60);

        if (player.getXPosition() > 500) {
            batch.draw(enemypic, enemy.getBottomLeft(), enemy.getTopLeft(), 40, 40);
            batch.draw(enemypic2, enemy2.getBottomLeft(), enemy2.getTopLeft(), 60, 60);
            batch.draw(enemypic, enemy3.getBottomLeft(), enemy3.getTopLeft(), 40, 40);
            batch.draw(enemypic, enemy4.getBottomLeft(), enemy4.getTopLeft(), 40, 40);

        }

        for (int i = 0; i < 200; i++) {
            if (bullets[i].visible()) {
                batch.draw(bulletPic, bullets[i].x(), bullets[i].y(), 25, 25);

            }

        }
        batch.end();
        enemy.movetowardsplayer(player);
        enemy2.movetowardsplayer(player);
        enemy3.movetowardsplayer(player);
        enemy4.movetowardsplayer(player);

        if (Gdx.input.isKeyPressed(Input.Keys.W)) {
            player.moveUp();
        }
        if (Gdx.input.isKeyPressed(Input.Keys.S)) {
            player.moveDown();
        }
        if (Gdx.input.isKeyPressed(Input.Keys.D)) {
            player.moveForward();
        }
        if (Gdx.input.isKeyPressed(Input.Keys.A)) {
            player.moveBack();
        } else if (player.getYPosition() < -159) {
            player.moveUp();
        } else if (player.getYPosition() > 301) {
            player.moveDown();
        } else if (player.getXPosition() < -450) {
            player.moveForward();
        } else if (player.getXPosition() > 10000) {
            player.moveBack();
        }
        //code to disappear the enemy once clicked
        Gdx.input.isTouched();
        if (Gdx.input.getX() == enemy.getBottomRight() && Gdx.input.getY() == enemy.getTopLeft() || Gdx.input.getX() == enemy.getBottomLeft() && Gdx.input.getY() == enemy.getTopRight()) {

            enemy.setVisible(true);

        }

        //code for bullet to work 
        if (Gdx.input.isKeyJustPressed(F)) {
            for (int i = 0; i < 200; i++) {
                bullets[i].move();
            }
        }

        // if (Gdx.input.isKeyPressed(Input.Keys.A)) {
//            SceneManager.LoadScene(MainMenu);
    }

    @Override
    public void resize(int width, int height
    ) {
        camera.viewportWidth = width;
        camera.viewportHeight = height;
    }

    @Override
    public void dispose() {
        batch.dispose();
    }

    @Override
    public boolean keyTyped(char character
    ) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button
    ) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button
    ) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer
    ) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY
    ) {
        return false;
    }

    @Override
    public boolean scrolled(int amount
    ) {
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
    public boolean keyUp(int keycode
    ) {
        return false;
    }

}
