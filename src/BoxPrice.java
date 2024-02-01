public class BoxPrice extends Boxweight{
    public BoxPrice(double l, double h, double w, double weight){
        this.weight = weight;
    }
    public BoxPrice(){
        System.out.println("Default constructor of BoxPrice");
    }

    @Override
    public void showInformation() {
        super.showInformation();
    }

    void generalFunction(){
        System.out.println("This is a generel function from BoxPrice class");
    }
}
