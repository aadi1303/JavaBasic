import java.util.ArrayList;
import java.util.Collections;

class ArrayLists
{
    public static void main(String arg[])
    {

        ArrayList<Integer> list = new ArrayList<Integer>();
        // New element is aded to the last of the list

        list.add(10);
        list.add(90);
        list.add(50);
        list.add(20);

        System.out.println(list);

        int element = list.get(0);
        int element1 = list.get(1);
        int element2 = list.get(2);
        int element3 = list.get(3);

        System.out.println(element+" " +element1+ " "+element2+" "+element3);



        // Adding element in between the arraylist...
        list.add(3, 40);
        System.out.println(list);



        // modifing the element presnt in list
        list.set(0, 15);
        System.out.println(list);




        // Deleting the element in list
        list.remove(0);
        System.out.println(list);



        // Size of the list
        int size = list.size();
        System.out.println(size);


        // Loops on list
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }


        // Sorting
        Collections.sort(list);
        System.out.println(list);
        
    }
    
}