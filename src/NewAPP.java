class NewAPP {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully.....");
        }catch(ClassNotFoundException ce){
            ce.printStackTrace();
        }
    }
}
