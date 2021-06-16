package sample;

import javafx.scene.Scene;
import javafx.scene.image.Image;

public class C extends Level{
    Image cc = new Image("C.png");
    public void render() {
        gc.drawImage(cc,0,0);

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
