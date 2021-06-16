package sample;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import java.util.ArrayList;


public class LevelTwo extends Level {
    private ArrayList<Sprite> game_object = super.getGame_objects();
    private ArrayList<Sprite> firewall = new ArrayList<Sprite>();
    public boolean win,lose;

    private Image img1 = new Image("U1.png");
    private Image img4 = new Image("U2.png");
    private Image img3 = new Image("U3.png");
    private Image img5 = new Image("fire!.png");
    private Image img6 = new Image("fire2.png");
    private Image img7 = new Image("fire3.png");
    private Image img8 = new Image("Isblock.png");
    private Image img9 = new Image("Good.png");
    private Image img10 = new Image("Bad.png");
    private Image BG    = new Image("BG2.png");
    private Image block1 = new Image("Block1.png");
    private Image block2 = new Image("Block2.png");
    private Image block3 = new Image("Block3.png");
    private Image img19 = new Image("FLAME.png");
    private Image img20 = new Image("FLAME1.png");
    private Image img21 = new Image("FLAME3.png");
    private Image img23 = new Image("win.png");


    Sprite U = new Sprite(6 * size, 6 * size, img1, img3, img4, "U",super.getLevelmesh());
    Sprite good = new Sprite(26 * size,  16* size, img9, "good",super.getLevelmesh());
    Sprite bad = new Sprite(25 * size, 7 * size, img10, "bad",super.getLevelmesh());
    Sprite Is = new Sprite(25*size,6*size,img8,"IS",super.getLevelmesh());
    Sprite Flame = new Sprite(25*size,5*size,img19,img20,img21,"FLAME",super.getLevelmesh());

    Sprite b1 = new Sprite(4*size,17*size,block1,"b1",super.getLevelmesh());
    Sprite b2 = new Sprite(4*size,16*size,block2,"b2",super.getLevelmesh());
    Sprite b3 = new Sprite(4*size,15*size,block3,"b3",super.getLevelmesh());
    Sprite b4 = new Sprite(4*size,14*size,block1,"b4",super.getLevelmesh());
    Sprite b5 = new Sprite(4*size,13*size,block2,"b5",super.getLevelmesh());
    Sprite b6 = new Sprite(4*size,12*size,block3,"b6",super.getLevelmesh());
    Sprite b7 = new Sprite(4*size,11*size,block1,"b7",super.getLevelmesh());
    Sprite b8 = new Sprite(5*size,11*size,block2,"b8",super.getLevelmesh());
    Sprite b9 = new Sprite(6*size,11*size,block3,"b9",super.getLevelmesh());
    Sprite b10 = new Sprite(8*size,11*size,block2,"b10",super.getLevelmesh());
    Sprite b11 = new Sprite(9*size,11*size,block1,"b11",super.getLevelmesh());
    Sprite b12 = new Sprite(10*size,11*size,block3,"b12",super.getLevelmesh());
    Sprite b13 = new Sprite(10*size,12*size,block2,"b13",super.getLevelmesh());
    Sprite b14 = new Sprite(10*size,13*size,block1,"b14",super.getLevelmesh());
    Sprite b15 = new Sprite(10*size,14*size,block3,"b15",super.getLevelmesh());
    Sprite b16 = new Sprite(10*size,15*size,block2,"b16",super.getLevelmesh());
    Sprite b17 = new Sprite(10*size,16*size,block1,"b17",super.getLevelmesh());
    Sprite b18 = new Sprite(10*size,17*size,block3,"b18",super.getLevelmesh());
    Sprite fire1 = new Sprite(23 * size, 0 * size, img5, img6, img7, "fire1",super.getLevelmesh());
    Sprite fire2 = new Sprite(23 * size, 1 * size, img5, img6, img7, "fire2",super.getLevelmesh());
    Sprite fire3 = new Sprite(23 * size, 2 * size, img5, img6, img7, "fire3",super.getLevelmesh());
    Sprite fire4 = new Sprite(23 * size, 3 * size, img5, img6, img7, "fire4",super.getLevelmesh());
    Sprite fire5 = new Sprite(23 * size, 4 * size, img5, img6, img7, "fire5",super.getLevelmesh());
    Sprite fire6 = new Sprite(23 * size, 5 * size, img5, img6, img7, "fire6",super.getLevelmesh());
    Sprite fire7 = new Sprite(23 * size, 6 * size, img5, img6, img7, "fire7",super.getLevelmesh());
    Sprite fire8 = new Sprite(23 * size, 7 * size, img5, img6, img7, "fire8",super.getLevelmesh());
    Sprite fire9 = new Sprite(23 * size, 8 * size, img5, img6, img7, "fire9",super.getLevelmesh());
    Sprite fire10 = new Sprite(23 * size, 9 * size, img5, img6, img7, "fire10",super.getLevelmesh());
    Sprite fire11 = new Sprite(23 * size, 10 * size, img5, img6, img7, "fire11",super.getLevelmesh());
    Sprite fire12 = new Sprite(23 * size, 11 * size, img5, img6, img7, "fire12",super.getLevelmesh());
    Sprite fire13 = new Sprite(23 * size, 12 * size, img5, img6, img7, "fire13",super.getLevelmesh());
    Sprite fire14 = new Sprite(23 * size, 13 * size, img5, img6, img7, "fire14",super.getLevelmesh());
    Sprite fire15 = new Sprite(23 * size, 14 * size, img5, img6, img7, "fire15",super.getLevelmesh());
    Sprite fire16 = new Sprite(23 * size, 15 * size, img5, img6, img7, "fire16",super.getLevelmesh());
    Sprite fire17 = new Sprite(23 * size, 16 * size, img5, img6, img7, "fire17",super.getLevelmesh());
    Sprite fire18 = new Sprite(23 * size, 17 * size, img5, img6, img7, "fire18",super.getLevelmesh());




    public LevelTwo(){
        super();
       getlist();
    }


    public void addtolist(Sprite sprite){
        this.game_object.add(sprite);
    }
    public void getlist(){
        addtolist(U);
        addtolist(good);
        addtolist(bad);
        addtolist(b1);
        addtolist(b2);
        addtolist(b3);
        addtolist(b4);
        addtolist(b5);
        addtolist(b6);
        addtolist(b7);
        addtolist(b8);
        addtolist(b9);
        addtolist(b10);
        addtolist(b11);
        addtolist(b12);
        addtolist(b13);
        addtolist(b14);
        addtolist(b15);
        addtolist(b16);
        addtolist(b17);
        addtolist(b18);
        addtolist(fire1);
        addtolist(fire2);
        addtolist(fire3);
        addtolist(fire4);
        addtolist(fire5);
        addtolist(fire6);
        addtolist(fire7);
        addtolist(fire8);
        addtolist(fire9);
        addtolist(fire10);
        addtolist(fire11);
        addtolist(fire12);
        addtolist(fire13);
        addtolist(fire14);
        addtolist(fire15);
        addtolist(fire16);
        addtolist(fire17);
        addtolist(fire18);
        addtolist(Is);
        addtolist(Flame);


        add_to_firewall(fire1);
        add_to_firewall(fire2);
        add_to_firewall(fire3);
        add_to_firewall(fire4);
        add_to_firewall(fire5);
        add_to_firewall(fire6);
        add_to_firewall(fire7);
        add_to_firewall(fire8);
        add_to_firewall(fire9);
        add_to_firewall(fire10);
        add_to_firewall(fire11);
        add_to_firewall(fire12);
        add_to_firewall(fire13);
        add_to_firewall(fire14);
        add_to_firewall(fire15);
        add_to_firewall(fire16);
        add_to_firewall(fire17);
        add_to_firewall(fire18);
    }

    public void add_to_firewall(Sprite sprite){
        this.firewall.add(sprite);
    }

    @Override
    public void render(double time) {
        String is = Is.CheckIS_V();
        input(scene);
        gc.drawImage(BG,0,0);
        if(!(A||S||D||W)){
            U.render(gc);
        }
        move(U,32);
        if(A||S||D||W){
            U.render(gc,time);
        }
        if(is.equals("FLAMEISbad")){
            for(Sprite s : firewall) {
               if( U.intersects(s)){
                   lose = true;
               }
            }
        }
        if(is.equals("FLAMEISgood")){
            for(Sprite s : firewall) {
                if( U.intersects(s)){
                    win = true;
                    gc.drawImage(img23,8*size,6*size);
                }
            }
        }
        good.render(gc);
        bad.render(gc);
        b1.render(gc);
        b2.render(gc);
        b3.render(gc);
        b4.render(gc);
        b5.render(gc);
        b6.render(gc);
        b7.render(gc);
        b8.render(gc);
        b9.render(gc);
        b10.render(gc);
        b11.render(gc);
        b12.render(gc);
        b13.render(gc);
        b14.render(gc);
        b15.render(gc);
        b16.render(gc);
        b17.render(gc);
        b18.render(gc);
        fire1.render(gc,time);
        fire2.render(gc,time);
        fire3.render(gc,time);
        fire4.render(gc,time);
        fire5.render(gc,time);
        fire6.render(gc,time);
        fire7.render(gc,time);
        fire8.render(gc,time);
        fire9.render(gc,time);
        fire10.render(gc,time);
        fire11.render(gc,time);
        fire12.render(gc,time);
        fire13.render(gc,time);
        fire14.render(gc,time);
        fire15.render(gc,time);
        fire16.render(gc,time);
        fire17.render(gc,time);
        fire18.render(gc,time);
        Is.render(gc);
        Flame.render(gc,time);
    }


    public boolean getwin(){
      return   this.win;
    }
    public boolean getLose(){
        return  this.lose;
    }
    @Override
    public void move(Sprite sprite, double moves) {
        super.move(sprite, moves);
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
    public Scene getScene() {
        return super.getScene();
    }

    @Override
    public void input(Scene scene) {
        super.input(scene);
    }
}
