package sample;

public class Track {
    Sprite object;
    double dpx;
    double dpy;
    double move;

    public Track(Sprite object,double dpx,double dpy,double move){

        this.object = object;
        this.dpx = dpx;
        this.dpy = dpy;
        this.move = move;
    }
}
