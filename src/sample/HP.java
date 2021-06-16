package sample;

import javafx.scene.Scene;
import javafx.scene.image.Image;

public class HP extends Level {
    Boolean ENTER = super.ENTER;
    Image img1 = new Image("HP1.png");
    Image img2 = new Image("HP2.png");
    Image img3 = new Image("HP3.png");

    Image[] ia = new Image[3];



    class AnimatedImage{
        public  Image[] imgArray;
        public double duration;
        public Image GetFrame(double time) {
            int index = (int) ((time %(imgArray.length*duration))/duration);
            return imgArray[index];
        }
    }

    public void render(double time) {
        ia[0] = img1;
        ia[1] = img2;
        ia[2] = img3;

        AnimatedImage AI = new AnimatedImage();
        AI.duration = 10;
        AI.imgArray = ia;
        gc.drawImage(AI.GetFrame(time),0,0);
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
