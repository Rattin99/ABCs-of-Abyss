package sample;

import javafx.scene.Scene;
import javafx.scene.image.Image;

public class A extends Level {
    Image image2 = new Image("A.png");
    public void render() {
        gc.drawImage(image2,0,0);

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
