package sample;
import javafx.geometry.Rectangle2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Sprite {
    private  double px;
    private  double py;
    private  String[][] pos;
    private Image image;
    private Image[] A_Icon;
    private String name;
    private int size= 32;
    private int X_SIZE = 32*size;
    private int Y_SIZE = 18*size;
    public boolean dane,bame,upore,niche;


    public Sprite(double px, double py,Image icon,String name,String[][] mesh) {
        this.image = icon;
        this.px = px;
        this.py = py;
        this.name = name;
        this.pos = mesh;
        pos[(int) px/size][(int) py/size] = name;
    }
    public Sprite(double px, double py,Image icon,Image icon2,Image icon3,String name,String[][] mesh) {
        this.image = icon;
        this.px = px;
        this.py = py;
        this.name = name;
        this.image = icon;
        this.pos = mesh;
        this.A_Icon = new Image[3];
        A_Icon[0] = icon;
        A_Icon[1] = icon2;
        A_Icon[2] = icon3;
        pos[(int) px/size][(int) py/size] = name;
    }

    class AnimatedImage{
        public  Image[] imgArray;
        public double duration;
        public Image GetFrame(double time) {
            int index = (int) ((time %(imgArray.length*duration))/duration);
            return imgArray[index];
        }
    }
    public String CheckIS(){
        if((getPx()/size)+1 >= X_SIZE/size || (getPx()/size)-1<0){
            return "bal";
        }else {
            String befor =  pos[(int)(getPx()/size)-1][(int)(getPy()/size)];
            String after = pos[(int)(getPx()/size)+1][(int)(getPy()/size)];
            return befor + "IS" + after;
        }


    }
    public String CheckIS_V(){
        if((getPy()/size)+1 >= Y_SIZE/size || (getPy()/size)-1<0){
            return "bal";
        }else {
            String upor =  pos[(int)(getPx()/size)][(int)(getPy()/size)-1];
            String nich =  pos[(int)(getPx()/size)][(int)(getPy()/size)+1];
            return upor + "IS" + nich;
        }


    }

    public void render(GraphicsContext gc) {
        gc.drawImage(image,px,py);
        pos[(int) px/size][(int) py/size] = name;
    }
    public void render(GraphicsContext gc,double time) {
       AnimatedImage Ai = new AnimatedImage();
       Ai.imgArray = A_Icon;
       Ai.duration = 0.100;
        gc.drawImage(Ai.GetFrame(time),px,py);
        pos[(int) px/size][(int) py/size] = name;
    }

    public void translateX(double x) {
        pos[(int) px/size][(int) py/size] = null;
        if(!(this.px+size+x >X_SIZE )){
            this.px += x;
        }
        if(this.px <0) {
            this.px -=x;
        }
        pos[(int) px/size][(int) py/size] = name;
    }
    public void translateY(double y){
        pos[(int) px/size][(int) py/size] = null;
        if(!(this.py+size+y >Y_SIZE)){
            this.py += y;
        }
        if(this.py <0) {
            this.py -=y;
        }
        pos[(int) px/size][(int) py/size] = name;

    }

    public void undo(double dpx,double dpy,double move){
        pos[(int) this.px/size][(int) this.py/size] = null;
        this.py -=dpy;
        this.px -=dpx;
        pos[(int) this.px/size][(int) this.py/size] = name;
    }

    public String ifbame(){
        String n = null;
        boolean b = px-5 <=0;
        if(!b){
            n = pos[(int) (this.px/size)-1][(int) this.py/size];
        }
        if(n != null){
            bame = true;
        }
        return n;
    }
    public String ifupore(){
        String n = null;
        boolean b = py-5 <=0;
        if(!b){
            n = pos[(int) (this.px/size)][(int) (this.py/size)-1];
        }
        if(n != null){
            upore = true;
        }
        return n;
    }
    public String ifniche(){
        String n = null;
        boolean b = py+size+32 >= Y_SIZE;
        if(!b){
            n = pos[(int) (this.px/size)][(int) (this.py/size)+1];
        }
        if(n != null){
            niche = true;
        }
        return n;
    }
    public String ifdane(){
        String n = null;
        boolean b = px+size+32 >= X_SIZE;
        if(!b){
            n = pos[(int) (this.px/size)+1][(int) this.py/size];
        }
        if(n != null){
            dane = true;
        }
        return n;
    }
    public Rectangle2D getBoundary()
    {
        return new Rectangle2D(px,py,33,32);
    }

    public boolean intersects(Sprite s)
    {
        return s.getBoundary().intersects( this.getBoundary() );
    }

    public double getPx() {
        return px;
    }

    public double getPy() {
        return py;
    }

    public Image getImage() {
        return image;
    }

    public String getName() {
        return name;
    }


}
