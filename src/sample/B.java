package sample;

import javafx.scene.Scene;
import javafx.scene.image.Image;

public class B  extends Level{
    Image image3 = new Image("B.png");
    public void render() {
        gc.drawImage(image3,0,0);

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
