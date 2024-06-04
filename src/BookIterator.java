import java.util.*;

public class BookIterator implements Iterator {
    ArrayList<Books> list;
    int idx;
    BookIterator(ArrayList<Books>list){
         this.list=list;
         idx=0;
    }
    public Books next(){
       return this.list.get(idx++);
    }
    public Boolean hasNext(){
          if(list.size()>idx){
              return true;
          }
          return false;
    }
}
