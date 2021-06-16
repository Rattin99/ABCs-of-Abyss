package sample;

import javafx.scene.Scene;
import javafx.scene.image.Image;

public class End extends Level {
    Image e = new Image("end.png");
    public void render() {
        gc.drawImage(e,0,0);

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
