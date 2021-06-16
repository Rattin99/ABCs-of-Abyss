package sample;

import javafx.scene.Scene;
import javafx.scene.image.Image;

public class Failed extends Level {
    Image Fail = new Image("Lose.png");
    public void render() {
        gc.drawImage(Fail,0,0);

    }

    @Override
    public Scene getScene() {
        return super.getScene();
    }
    @Override
    public void input(Scene scene) {
        super.input(scene);
    }
}
