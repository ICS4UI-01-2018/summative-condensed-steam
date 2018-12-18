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
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapRenderer;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
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
    private Texture background;
    private FitViewport viewport;
    private BulletShotByPlayer bullet;

    @Override
    public void create() {
        //start time. 
        long time = TimeUtils.millis();
        batch = new SpriteBatch();
        shapeBatch = new ShapeRenderer();

        float w = Gdx.graphics.getWidth();
        float h = Gdx.graphics.getHeight();

        camera = new OrthographicCamera();
        camera.setToOrtho(true);
        viewport = new FitViewport(800, 480, camera);
        viewport.apply();
        camera.update();
        background = new Texture("back.png");
        spaceshipPic = new Texture("spaceship.png");
        fixedPic = new Texture("rockfixed.png");
        Gdx.input.setInputProcessor(this);
        player = new Player(100, 100, 20, 20, 2, 0);
        //positionX, positionY, width, height, score, collisionEnemy, collisionPlayer, crashed
        enemy = new Enemy(20, 30, 50, 40, 0, false, false, false);
        fixed = new Fixed(10, 10, 20, 20, 0, false, false, false);
        bullet = new BulletShotByPlayer();
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
        batch.draw(background, 0, 0, viewport.getWorldWidth(), viewport.getWorldHeight());
        batch.draw(spaceshipPic, player.getBottomLeft(), player.getTopLeft(), 60, 60);
        batch.end();

        //not working
        while (Gdx.input.isKeyJustPressed(Input.Keys.SPACE)) {

            shapeBatch.setProjectionMatrix(camera.combined);
            shapeBatch.begin();
            bullet.BulletShotByPlayer(player.getXPosition(), player.getYPosition(), 3, 3, 3);
            bullet.draw(shapeBatch);
            shapeBatch.end();
        }

        if (player.getYPosition() < viewport.getWorldHeight()) {

            if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
                player.moveUp();
            }
            camera.translate(player.getXPosition() + 50, player.getYPosition() + 50);

        }
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
        if (Gdx.input.isKeyPressed(Input.Keys.UP)){
            fixed.moveup();
        }
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;

    }

}
