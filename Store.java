/**
 * The class Store is used to create objects that can represent a store 
 */
public class Store {
    private static int nextId = 0;
    int id;
    String name;
    String address;
    
    public Store(int id, String name, String address){
        this.id = ++Store.nextId;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public static int getNextId(){
        return Store.nextId;
    }
}