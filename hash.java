import java.util.*;

interface hash<K, V>{

}

class hashmap<K,V> implements hash<K,V>{
    
    class Node<K, V>{
        K key;
        V value;

        Node(K get_key, V get_value){
            key = get_key;
            value = get_value;
        }

        K get_key(){
            return key;
        }

        V get_value(){
            return value;
        }
        
    }
    class Link<K, V> {
        Link(K key, V value){
            list.add(new Node(key, value));
        }

        void add(K key, V value){
            list.add(new Node(key, value));
        }

        void remove(int index){
            list.remove(index);
        }

        int size(){
            return list.size();
        }

        V get_value(int index){
            return (V) list.get(index).get_value();
        }

        K get_key(int index){
            return (K) list.get(index).get_key();
        }

        LinkedList<Node> list= new LinkedList<>();
    }

    
    private Link[] array;

    hashmap(){
        array = new Link[20];
    }

    private int get_hash(K key){
        int index = key.hashCode() % 7;

        return index;
    }

    public void add(K key, V value){
        int index = get_hash(key);
        if(array[index]==null){
            array[index]=new Link(key ,value);
        }else{
            array[index].add(key,value);
        }
    }

    public void remove(K key){
        int index = get_hash(key);
        int size = array[index].size();

        if(size == 1){
            array[index] = null;
        }else{
            for(int i=0;i<array[index].size();i++){
                if(((hashmap.Node) array[index].list.get(i)).get_key() == key ){
                    array[index].remove(i);
                }
            }
        }
    }

    public V get(K key) {
        V value;

        int index = get_hash(key);
        int size = array[index].size();
        
        if(size == 1){
            return (V) array[index].get_value(0);
        }else{
            for(int i=0;i<array[index].size();i++){
                if(((hashmap.Node) array[index].list.get(i)).get_key() == key ){
                    return (V) array[index].get_value(i);
                }
            }
        }
        return null;
    }

}