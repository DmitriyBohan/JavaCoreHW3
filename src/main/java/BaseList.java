import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BaseList implements Iterable<Base>{

    private ArrayList<Base> baseList = new ArrayList<>();



    public void addEmployee(Base base) {
       baseList.add(base);
    }

    @Override
    public Iterator<Base> iterator() {
        return baseList.iterator();
    }


    public ArrayList<Base> getBaseList() {
        return baseList;
    }
}
