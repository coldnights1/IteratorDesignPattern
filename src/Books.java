public class Books {
    private int price;
    private String bookName;
    Books(int price,String bookName){
        this.price=price;
        this.bookName=bookName;
    }
    public String getName() {
         return this.bookName;
    }
    public int getPrice(){
        return this.price;
    }

}
