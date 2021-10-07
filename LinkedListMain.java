package app;

import java.util.Iterator;

public class LinkedListMain {
    public static void main(String[] args) {
        ListInterface<Integer> list = new RecursiveList<Integer>();
        list.insertLast(22);
        list.insertLast(900);
        list.insertLast(143);
        list.insertLast(8);
        
        System.out.println(printList(list));
        list.removeFirst();
        System.out.println(printList(list));
        list.removeLast();
        System.out.println(printList(list));
        list.removeAt(1);
        System.out.println(printList(list));
       
        
       // list.remove(100); // should throw an ItemNotFoundException

        ListInterface<String> list1= new RecursiveList<String>();
        list1.insertFirst("Hello");
		list1.insertLast("World!");
		list1.insertFirst("There");
        System.out.println(list1);
        list1.remove("World!");
        System.out.println(list1);
    }

    public static String printList(ListInterface<Integer> list) {
        StringBuilder sb = new StringBuilder();
        Iterator<Integer> listIter = list.iterator();
        while (listIter.hasNext())
            sb.append(listIter.next()).append(" ");
        return sb.toString();
    }

}
