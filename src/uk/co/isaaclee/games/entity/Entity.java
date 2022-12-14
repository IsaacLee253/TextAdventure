package uk.co.isaaclee.games.entity;

import uk.co.isaaclee.games.graphics.Screen;
import uk.co.isaaclee.games.level.Level;

import java.util.Random;

public class Entity {

    public int x, y;
    private boolean removed = false;
    protected Level level;
    protected final Random random = new Random();

    public void update() {

    }

    public void render(Screen screen) {

    }

    public void remove() {
        removed = true;
    }

    public boolean isRemoved() {
        return removed;
    }

}
