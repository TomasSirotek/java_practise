package hashTables;

import java.util.Hashtable;

public class Main
{
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable = new Hashtable<>(10); // initial 11 elements

        hashtable.put(100,"SpongeBob");
        hashtable.put(777,"Patrik");
        hashtable.put(234,"Sandy");
        hashtable.put(567,"Gary");

        for (Integer key : hashtable.keySet()){
            System.out.println("Index in the bucket of the table " + "\t" +
                    key.hashCode() % hashtable.size() + "\t"
                    + key + "\t"
                    + hashtable.get(key));
        }

    }
}
