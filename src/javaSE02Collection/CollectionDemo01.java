package javaSE02Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo01 {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add(1);
        coll.add("sss");
        Iterator iterator = coll.iterator();
        while (iterator.hasNext()){
            System.out.println("出来一个"+iterator.next());
        }
    }
}
