package sample;

import javafx.scene.Scene;
import javafx.scene.image.Image;

public class context extends Level {
    Image image = new Image("Tut.png");

    boolean tut1,tut,A,B,C;

    public context(){
        super();
    }

    public void render() {
        gc.drawImage(image,0,0);

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
