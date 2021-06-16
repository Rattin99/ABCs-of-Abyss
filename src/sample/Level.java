package sample;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;

import java.util.ArrayList;
import java.util.LinkedList;

public class Level {
    public   int size= Main.size;
    public   static int X_SIZE = Main.X_SIZE;
    public   static int Y_SIZE = Main.Y_SIZE;
    public   boolean W;
    public   boolean A;
    public   boolean D;
    public   boolean S;
    public   boolean R;
    public   boolean ENTER;
    private  String[][] levelmesh = new String[X_SIZE][Y_SIZE];
    private  LinkedList<Track> tracks = new LinkedList<Track>();
    private  ArrayList<Sprite> game_objects = new ArrayList<Sprite>();



       Group root = new Group();
       Scene scene = new Scene(root);

       Canvas canvas = new Canvas(Main.X_SIZE,Main.Y_SIZE);
       GraphicsContext gc = canvas.getGraphicsContext2D();





    public void render(double time){


    }
    public void move(Sprite sprite, double moves) {
        double x = sprite.getPx();
        double y = sprite.getPy();
        String dane = sprite.ifdane();
        String upore = sprite.ifupore();
        String niche= sprite.ifniche();
        String bame = sprite.ifbame();

        if(A) {
            if(sprite.bame){
                sprite.translateX(-moves);
                Track track = new Track(sprite,sprite.getPx()-x,0,-moves/moves);
                tracks.add(track);
                Sprite other =  intersend(bame);
                move(other,moves);
            }else {
                sprite.translateX(-moves);
                Track track = new Track(sprite,sprite.getPx()-x,0,-moves/moves);
                tracks.add(track);
            }
        }
        if(D) {
            if(sprite.dane){
                sprite.translateX(+moves);
                Track track = new Track(sprite,sprite.getPx()-x,0,moves/moves);
                tracks.add(track);
                Sprite other  =  intersend(dane);
                move(other,moves);
            }
            else {
                sprite.translateX(+moves);
                Track track = new Track(sprite,sprite.getPx()-x,0,moves/moves);
                tracks.add(track);
            }
        }
        if(S) {
            if(sprite.niche){
                sprite.translateY(+moves);
                Track track = new Track(sprite,0,sprite.getPy()-y,-moves/moves);
                tracks.add(track);
                Sprite other =  intersend(niche);
                move(other,moves);

            }else {
                sprite.translateY(+moves);
                Track track = new Track(sprite,0,sprite.getPy()-y,-moves/moves);
                tracks.add(track);
            }

        }
        if(W) {
            if(sprite.upore){
                sprite.translateY(-moves);
                Track track = new Track(sprite,0,sprite.getPy()-y,moves/moves);
                tracks.add(track);
                Sprite other =  intersend(upore);
                move(other,moves);

            }
            else {
                sprite.translateY(-moves);
                Track track = new Track(sprite,0,sprite.getPy()-y,moves/moves);
                tracks.add(track);
            }
        }
        if(R){
            undo();
        }
        sprite.bame = false;
        sprite.upore = false;
        sprite.niche = false;
        sprite.dane = false;

    }

 public Sprite intersend(String name){
        Sprite sp=null;
        for(Sprite s: game_objects){
            if(s.getName().equals(name)){
                sp = s;
            }
        }
        return sp;
 }

    public void undo(){
       if(tracks.size() !=0){
           Track T = tracks.getLast();
           tracks.removeLast();
           T.object.undo(T.dpx,T.dpy,T.move);
       }
    }

    public Scene getScene() {
        root.getChildren().add(canvas);
        return scene;
    }


    public void input(Scene scene) {
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                switch (event.getCode()) {
                    case D:
                        D = true;
                        break;
                    case W:
                        W =true;
                        break;
                    case A:
                        A =true;
                        break;
                    case S:
                        S =true;
                        break;
                    case R:
                        R = true;
                        break;
                    case ENTER:
                        ENTER = true;

                }
            }
        });

        scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if(A || S || D || W) {
                    A = S = D = W = false;

                }
                R = false;
                ENTER = false;


            }
        });

    }

    public ArrayList<Sprite> getGame_objects() {
        return game_objects;
    }

    public String[][] getLevelmesh() {
        return levelmesh;
    }
}
