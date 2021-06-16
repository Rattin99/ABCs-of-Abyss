package sample;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
   public final static int size= 32;
   public final static int X_SIZE = 32*size;
   public final static int Y_SIZE = 18*size;
   public boolean HPtoTut,atoL1,btol2,l3toe,ctol3,Home =true;

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) {

        LevelOne level = new LevelOne();
        HP Hp = new HP();
        context con = new context();
        A a = new A();
        B b = new B();
        C c = new C();
        Failed fail = new Failed();
        LevelTwo l2 = new LevelTwo();
        LevelThree l3 = new LevelThree();
        End end = new End();
        Scene scene;
        scene = Hp.getScene();
        Scene scene1 = level.getScene();
        Scene scene2 = con.getScene();
        Scene scene3 = a.getScene();
        Scene scene4 = b.getScene();
        Scene scene5 = l2.getScene();
        Scene scene6 = c.getScene();
        Scene failed_screen = fail.getScene();
        Scene lvl3 = l3.getScene();
        Scene end_screen = end.getScene();

        final long start_time = System.nanoTime();

        new AnimationTimer(){
            @Override
            public void handle(long now) {

                double time = (now-start_time)/(1000000000/23);
               if(Home = true){
                   Hp.render(time);

               }
               if(HPtoTut){
                   con.render();
               }
               if(con.tut1){
                   a.render();
               }
               if(atoL1){
                   level.render(time);
                   if(level.getWin()) {
                       b.render();
                       scene1.setOnKeyPressed(event -> {

                           primaryStage.setScene(scene4);

                       });
                   }
                   if(level.getLose()) {
                       b.render();
                       scene1.setOnKeyPressed(event -> {

                           primaryStage.setScene(scene4);

                       });
                   }

               }
               if(btol2){
                   l2.render(time);
                   if(l2.getwin()){
                       c.render();
                       scene5.setOnKeyPressed(event -> {
                           l2.win = false;
                           l2.lose = false;
                           primaryStage.setScene(scene6);
                       });
                   }
                   if(l2.getLose()){
                       fail.render();
                       scene5.setOnKeyPressed(event -> {
                           l2.win = false;
                           l2.lose = false;
                           primaryStage.setScene(failed_screen);
                       });
                   }
               }

               if(ctol3){
                  if(l3toe){
                      l3.render(time);
                  }
                   if(l3.getwin()){
                       lvl3.setOnKeyPressed(event -> {
                           end.render();
                           primaryStage.setScene(end_screen);
                       });
                   }
               }
            }
        }.start();

        primaryStage.setScene(scene);
        scene.setOnKeyPressed(event -> {

            Home = false;
            HPtoTut = true;
            primaryStage.setScene(scene2);

        });
        scene2.setOnKeyPressed(event -> {
            HPtoTut = false;
            con.tut1 = true;
            primaryStage.setScene(scene3);


        });
        scene3.setOnKeyPressed(event -> {
            con.tut1 = false;
            atoL1 = true;
            primaryStage.setScene(scene1);

        });
        scene4.setOnKeyPressed(event -> {
            level.win = false;
            btol2 = true;
            primaryStage.setScene(scene5);
        });
        scene6.setOnKeyPressed(event -> {
            ctol3 =true;
            btol2 = false;
            l3toe = true;
            primaryStage.setScene(lvl3);
        });


        primaryStage.show();

    }

}
