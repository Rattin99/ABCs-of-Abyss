package sample;

import javafx.scene.Scene;
import javafx.scene.image.Image;

import java.util.ArrayList;

public class LevelThree  extends Level{
    private ArrayList<Sprite> game_object = super.getGame_objects();

    boolean win;

    private Image fried = new Image("FRIED.png");
    private Image rich = new Image("RICH.png");
    private Image niet = new Image("NIET.png");
    private Image zsc = new Image("ZSC.png");
    private Image he = new Image("HE.png");
    private Image you = new Image("you.png");
    private Image is = new Image("Isblock.png");
    private Image jean = new Image("JEAN.png");
    private Image god = new Image("GOD.png");
    private Image rei = new Image("REI.png");
    private Image sec = new Image("SEC.png");
    private Image u1 = new Image("U1.png");
    private Image u2 = new Image("U2.png");
    private Image u3 = new Image("U3.png");
    private Image BG4   = new Image("BG4.png");
    private Image FN = new Image("FN.png");
    private Image img23 = new Image("win.png");



    Sprite Rich = new Sprite(10*size,10*size,rich,"RICH",super.getLevelmesh());
    Sprite Zsc = new Sprite(13*size,9*size,zsc,"ZSC",super.getLevelmesh());
    Sprite Is = new Sprite(25*size,6*size,is,"IS",super.getLevelmesh());
    Sprite Fried = new Sprite(3*size,14*size,fried,"FRIED",super.getLevelmesh());
    Sprite Niet = new Sprite(2*size,16*size,niet,"NIET",super.getLevelmesh());
    Sprite He = new Sprite(27*size,11*size,he,"HE",super.getLevelmesh());
    Sprite You = new Sprite(5*size,10*size,you,"YOU",super.getLevelmesh());
    Sprite Jean = new Sprite(16*size,8*size,jean,"JEAN",super.getLevelmesh());
    Sprite God = new Sprite(14*size,3*size,god,"GOD",super.getLevelmesh());
    Sprite Rei = new Sprite(23*size,5*size,rei,"REI",super.getLevelmesh());
    Sprite Sec = new Sprite(17*size,9*size,sec,"SEC",super.getLevelmesh());
    Sprite U = new Sprite(5*size,7*size,u1,u2,u3,"BABA",super.getLevelmesh());



    public void add_to_list(Sprite sprite){
        this.game_object.add(sprite);
    }

    public void getlist(){
        add_to_list(Is);
        add_to_list(Fried);
        add_to_list(Niet);
        add_to_list(He);
        add_to_list(Rich);
        add_to_list(Zsc);
        add_to_list(You);
        add_to_list(Jean);
        add_to_list(God);
        add_to_list(Rei);
        add_to_list(Sec);
        add_to_list(U);
    }

    public LevelThree(){
        super();
        getlist();

    }

    @Override
    public void render(double time) {
        String one = Rich.CheckIS();
        String two = Zsc.CheckIS();
        String three = Rich.CheckIS_V();
        String four = Zsc.CheckIS_V();
        input(scene);
        gc.drawImage(BG4,0,0);
        if(!(A||S||D||W)){
            U.render(gc);
        }
        move(U,32);
        if(A||S||D||W){
            U.render(gc,time);
        }
        if((one.equals("FRIEDISNIET") && two.equals("NIETISHE"))||(three.equals("FRIEDISNIET") && four.equals("NIETISHE"))){
            gc.drawImage(FN,405,354);
            if(U.getPx()+32 >=405 && U.getPy()+32>=354){
                win = true;
                gc.drawImage(img23,8*size,6*size);
            }
        }
        Is.render(gc);
        Fried.render(gc);
        Rich.render(gc);
        Niet.render(gc);
        Zsc.render(gc);
        He.render(gc);
        God.render(gc);
        Sec.render(gc);
        Rei.render(gc);
        You.render(gc);
        Jean.render(gc);

    }

    public boolean getwin(){
        return this.win;
    }

    @Override
    public void move(Sprite sprite, double moves) {
        super.move(sprite, moves);
    }

    @Override
    public Scene getScene() {
        return super.getScene();
    }

    @Override
    public void input(Scene scene) {
        super.input(scene);
    }

    @Override
    public Sprite intersend(String name) {
        return super.intersend(name);
    }

    @Override
    public void undo() {
        super.undo();
    }

    @Override
    public ArrayList<Sprite> getGame_objects() {
        return super.getGame_objects();
    }

    @Override
    public String[][] getLevelmesh() {
        return super.getLevelmesh();
    }
}

