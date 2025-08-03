package task1;

import java.util.HashMap;

public class UserHS <E> {
    private HashMap<E, Object> map;
    private static final Object DEF_OBJ = new Object();

    public UserHS(){
        this.map = new HashMap<>();
    }

    public void add(E obj){
        this.map.put(obj, DEF_OBJ);
    }

    public void remove(Object value){
        this.map.remove(value);
    }

    public void values(){
        System.out.println(this.map);
    }

    public void clear() {
        map.clear();
    }
}
