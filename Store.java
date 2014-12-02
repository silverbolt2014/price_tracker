/**
 * The class Store is used to create objects that can represent a store 
 */
public class Store {
    private static int nextId = 0;
    int id;
    String name;
    String address;
    
    Store(int id, String name, String address){
        this.id = ++Store.nextId;
    }
    
    int getId(){
        return id;
    }
    
    String getName(){
        return name;
    }
    
    String getAddress(){
        return address;
    }
    
    static int getNextId(){
        return Store.nextId;
    }
}