import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      //next time make it more generalized
        ArrayList<Books>list=new ArrayList();
        for(int i=0;i<10;i++){
            String name="hello";
            int price=100;
            Books book=new Books(price,name);
            list.add(book);
        }
        //make its aggregate
        Library library =new Library(list);
        //create its iterator
        Iterator it=library.createIterator();
        //now iterate using this iterator
        while(it.hasNext()==true){
            Books book=(Books)it.next();
            String name=book.getName();
            int price=book.getPrice();
            System.out.println(name+" "+price);
        }
    }
}