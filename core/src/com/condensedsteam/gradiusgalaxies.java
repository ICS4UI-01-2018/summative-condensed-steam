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
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapRenderer;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.TimeUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;
import java.util.ArrayList;
import com.badlogic.gdx.utils.viewport.FitViewport;

public class gradiusgalaxies extends ApplicationAdapter implements InputProcessor {

    SpriteBatch batch;
    private ShapeRenderer shapeBatch;
    TiledMap tiledMap;
    private OrthographicCamera camera;
    // TiledMapRenderer tiledMapRenderer;
    private Texture spaceshipPic;
    private Player player;
//    ArrayList<Enemy> enemy = new ArrayList<Enemy>(5);
//    ArrayList<Fixed> fixed = new ArrayList<Fixed>(10);
    private Enemy enemy;
    private Fixed fixed;
    private Texture fixedPic;
    private Texture gamemap;
    private FitViewport viewport;

    @Override
    public void create() {
        //start time. 
        batch = new SpriteBatch();
        shapeBatch = new ShapeRenderer();

        float w = Gdx.graphics.getWidth();
        float h = Gdx.graphics.getHeight();

        camera = new OrthographicCamera();
        camera.setToOrtho(false, w, h);
        viewport = new FitViewport(800, 480, camera);
        viewport.apply();
        camera.update();
        gamemap = new Texture("GameMap.png");
        spaceshipPic = new Texture("spaceship.png");
        fixedPic = new Texture("rockfixed.png");
        Gdx.input.setInputProcessor(this);

        player = new Player(100, 100, 20, 20, 2, 0);
        //positionX, positionY, width, height, score, collisionEnemy, collisionPlayer, crashed
        enemy = new Enemy(20, 30, 50, 40, 0, false, false, false);
        fixed = new Fixed(10, 10, 20, 20, 0, false, false, false);
    }

    @Override
    public void render() {

        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        camera.update();

        shapeBatch.setColor(Color.WHITE);
        shapeBatch.begin(ShapeRenderer.ShapeType.Line);
        shapeBatch.setColor(Color.BLUE);
        enemy.draw(shapeBatch);
        shapeBatch.end();

        shapeBatch.setProjectionMatrix(camera.combined);
        batch.begin();
        batch.draw(fixedPic, fixed.getBottomLeft(), enemy.getTopLeft(), 30, 40);
        batch.draw(gamemap, 0, 0, viewport.getWorldWidth(), viewport.getWorldHeight());
        batch.draw(spaceshipPic, player.getBottomLeft(), player.getTopLeft(), 60, 60);
        batch.end();

        if (player.getYPosition() < viewport.getWorldHeight()) {

            if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
                player.moveUp();
                camera.translate(0, 10);
                camera.update();
            }
            if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
                player.moveDown();
                camera.translate(0, -10);
                camera.update();
            }
            if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
                player.moveForward();
                camera.translate(10, 0);
                camera.update();
            }
            if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
                player.moveBack();
                camera.translate(-10, 0);
                camera.update();
            }
        }

//        shapeBatch.setProjectionMatrix(camera.combined);
//        batch.begin();
//        batch.draw(fixedPic, fixed.getBottom(), fixed.getTop());
//        batch.end();
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
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
//        if (keycode == Input.Keys.LEFT) {
//            camera.translate(-16, 0);
//        }
//        if (keycode == Input.Keys.RIGHT) {
//            camera.translate(16, 0);
//        }
//        if (keycode == Input.Keys.UP) {
//            camera.translate(0, 16);
//        }
//        if (keycode == Input.Keys.DOWN) {
//            camera.translate(0, -16);
//        }
        return false;
    }
}
