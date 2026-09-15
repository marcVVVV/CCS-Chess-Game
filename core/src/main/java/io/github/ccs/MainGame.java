package io.github.ccs;

import com.badlogic.gdx.Game;
import io.github.ccs.ui.FirstScreen;

/** Shared LibGDX application entry point. */
public class MainGame extends Game {
    @Override
    public void create() {
        setScreen(new FirstScreen());
    }
}
