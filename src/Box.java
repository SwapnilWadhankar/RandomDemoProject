public class Box {
    double l;
    double h;
    double w;

    double weight;

    public Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }
    void generalFunction(){
        System.out.println("This is a generel function from Box class");
    }
    public Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }

    public Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
    public Box(Box something){
        this.l = this.l;
        this.h = this.h;
        this.w = this.w;

        
    }
    public void showInformation(){
        System.out.println(" The Box is running !!!");
    }
}
