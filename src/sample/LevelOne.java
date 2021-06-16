package sample;

import javafx.scene.Scene;
import javafx.scene.image.Image;

import java.util.ArrayList;


public class LevelOne extends Level {
    boolean win = false, lose = false;
    private boolean FLAMEIsgood, FLAGIsgood, BABAIsgood,FLAMEISbad,BABAIsbad, FLAGIsbad;
    private ArrayList<Sprite> game_objects = super.getGame_objects();
    private Image img2 = new Image("BG.png");

    private Image img1 = new Image("U1.png");
    private Image img4 = new Image("U2.png");
    private Image img3 = new Image("U3.png");
    private Image img5 = new Image("fire!.png");
    private Image img6 = new Image("fire2.png");
    private Image img7 = new Image("fire3.png");
    private Image img8 = new Image("Isblock.png");
    private Image img9 = new Image("Good.png");
    private Image img10 = new Image("Bad.png");
    Image img11 = new Image("Flag1.png");
    Image img12 = new Image("Flag2.png");
    Image img13 = new Image("Flag3.png");
    Image img14 = new Image("FL1.png");
    Image img15 = new Image("FL2.png");
    Image img16 = new Image("FL3.png");
    Image img17 = new Image("Baba.png");
    Image img18 = new Image("you.png");
    Image img19 = new Image("FLAME.png");
    Image img20 = new Image("FLAME1.png");
    Image img21 = new Image("FLAME3.png");
    Image img22 = new Image("Exist.png");
    Image img23 = new Image("win.png");


    Sprite U = new Sprite(6 * size, 6 * size, img1, img3, img4, "U",super.getLevelmesh());
    Sprite fire = new Sprite(11 * size, 11 * size, img5, img6, img7, "fire",super.getLevelmesh());
    Sprite good = new Sprite(26 * size,  16* size, img9, "good",super.getLevelmesh());
    Sprite bad = new Sprite(5 * size, 16 * size, img10, "bad",super.getLevelmesh());
    Sprite flag = new Sprite(15 * size, 3 * size, img11, img12, img13, "flag",super.getLevelmesh());
    Sprite FLAG = new Sprite(25 * size, 4 * size, img14, img15, img16, "FLAG",super.getLevelmesh());
    Sprite BABA = new Sprite(13 * size, 8 * size, img17, "BABA",super.getLevelmesh());
    Sprite you = new Sprite(15 * size, 8 * size, img18, "YOU",super.getLevelmesh());
    Sprite FLAME = new Sprite(3* size, 9 * size, img19, img20, img21, "FLAME",super.getLevelmesh());

    Sprite IS1 = new Sprite(14 * size, 8 * size, img8, "IS1",super.getLevelmesh());
    Sprite IS2 = new Sprite(4 * size, 3 * size, img8, "IS2",super.getLevelmesh());
    Sprite IS3 = new Sprite(27 * size, 13 * size, img8, "IS3",super.getLevelmesh());

    public LevelOne(){

        super();
        get_list();
    }

    @Override
    public void render(double time) {
        String Is1 = IS1.CheckIS();
        String Is2 = IS2.CheckIS();
        String Is3 = IS3.CheckIS();
        input(scene);
        gc.drawImage(img2, 0, 0);
        int moves = 32;
        if (!(A || S || D || W)) {
            gc.drawImage(img1, U.getPx(), U.getPy());
            flag.render(gc,time);
            fire.render(gc,time);


        }
        if(Is1.equals("FLAMEISgood") || Is2.equals("FLAMEISgood") || Is3.equals("FLAMEISgood")){
                 FLAMEIsgood = true;
        }else{
            FLAMEIsgood = false;
        }
        if(Is1.equals("FLAGISgood") || Is2.equals("FLAGISgood") || Is3.equals("FLAGISgood")){
            FLAGIsgood = true;
        }else {
            FLAGIsgood = false;
        }
        if(Is1.equals("BABAISgood") || Is2.equals("BABAISgood") || Is3.equals("BABAISgood")){
            BABAIsgood = true;
        }else {
            BABAIsgood = false;
        }
        if(Is1.equals("FLAMEISbad") || Is2.equals("FLAMEISbad") || Is3.equals("FLAMEISbad")){
            FLAMEISbad = true;
        }else {
            FLAMEISbad = false;
        }
        if(Is1.equals("FLAGISbad") || Is2.equals("FLAGISbad") || Is3.equals("FLAGISbad")){
            FLAGIsbad = true;
        }else {
            FLAMEISbad = false;
        }
        if(Is1.equals("BABAISbad") || Is2.equals("BABAISbad") || Is3.equals("BABAISbad")){
            BABAIsbad = true;
        }else {
            BABAIsbad = false;
        }

       try{
           if (Is1.equals("BABAISYOU") || Is2.equals("BABAISYOU") || Is3.equals("BABAISYOU")) {

               move(U, moves);
               if (A || S || D || W) {
                   U.render(gc, time);
                   flag.render(gc,time);
                   fire.render(gc,time);
               }
               if(FLAGIsgood){
                   if(U.intersects(flag)){
                       win =true;
                   }
               }
               if(FLAMEIsgood){
                   if(U.intersects(fire)){
                       win = true;
                   }
               }
               if(FLAGIsbad){
                   if(U.intersects(flag)){
                       lose =true;
                   }
               }
               if(FLAMEISbad){
                   if(U.intersects(fire)){
                       lose = true;
                   }
               }
           }
           else if (Is1.equals("FLAGISYOU") || Is2.equals("FLAGISYOU") || Is3.equals("FLAGISYOU")){
               move(flag, moves);

               if (A || S || D || W) {
                   U.render(gc);
                   flag.render(gc,time);
                   fire.render(gc,time);
               }
               if(BABAIsgood){
                   if(flag.intersects(U)){
                       win =true;
                   }
               }
               if(FLAMEIsgood){
                   if(flag.intersects(fire)){
                       win =true;
                   }
               }
               if(BABAIsbad){
                   if(flag.intersects(U)){
                       win =true;
                   }
               }
               if(FLAMEISbad){
                   if(flag.intersects(fire)){
                       win =true;
                   }
               }
           }
           else if(Is1.equals("FLAMEISYOU") || Is2.equals("FLAMEISYOU") || Is3.equals("FLAMEISYOU")){
               move(fire, moves);

               if (A || S || D || W) {
                   U.render(gc);
                   flag.render(gc,time);
                   fire.render(gc,time);
               }
               if(FLAGIsgood){
                   if(fire.intersects(flag)){
                       win =true;
                   }
               }
               if(BABAIsgood){
                   if(fire.intersects(U)){
                       win = true;
                   }
               }
               if(FLAGIsbad){
                   if(fire.intersects(flag)){
                       win =true;
                   }
               }
               if(BABAIsbad){
                   if(fire.intersects(U)){
                       win = true;
                   }
               }

           }else {
               gc.drawImage(img22,5*size,3*size);
               undo();
               undo();
               undo();
           }
       }catch (NullPointerException e){
           e.printStackTrace();
       }

        FLAME.render(gc, time);
        good.render(gc);
        IS1.render(gc);
        bad.render(gc);
        FLAG.render(gc, time);
        BABA.render(gc);
        you.render(gc);
        IS2.render(gc);
        IS3.render(gc);

       if(win){
           gc.drawImage(img23,8*size,6*size);
       }
        FLAMEIsgood = FLAGIsgood = BABAIsgood = FLAMEISbad = BABAIsbad = FLAGIsbad = false;
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

    public void addtolist(Sprite sprite) {
        this.game_objects.add(sprite);
    }


    public void get_list() {
        addtolist(U);
        addtolist(fire);
        addtolist(FLAG);
        addtolist(FLAME);
        addtolist(IS1);
        addtolist(you);
        addtolist(BABA);
        addtolist(bad);
        addtolist(good);
        addtolist(flag);
        addtolist(IS1);
        addtolist(IS2);
        addtolist(IS3);

    }

    public boolean getLose() {
        return lose;
    }

    public boolean getWin(){
        return win;
    }
}
