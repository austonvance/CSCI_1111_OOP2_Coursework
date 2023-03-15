import java.util.ArrayList;


public class Exercise1903 {


public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
    
        list1.add(1);
        list1.add(1);
        list1.add(1);
    
        list1.add(2);
        list1.add(2);
        list1.add(2);
    
        list1.add(3);
        list1.add(3);
        list1.add(3);
    
    
    
            System.out.println("Original List with Duplicates: \n" + list1);
            System.out.println();
    
            list2 = removeDuplicates(list1);
    
            System.out.println("After removing duplicates: \n" + list2);
    
}
    
public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list2){
    
        ArrayList<E> usedList = new ArrayList<E>();
        ArrayList<E> newList = new ArrayList<E>();
    
        for(int i = 0; i < list2.size(); i++){
            
                E object = list2.get(i);
            
                if(! usedList.contains(object))
                {
                        usedList.add(object);
                        newList.add(object);
                }
        }
    
        return newList;
} 
}