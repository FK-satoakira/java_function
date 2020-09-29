package practice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {



    	Date date1 = new Date();
    	long t1 = 0L;
    	t1 = date1.getTime();
    	List<Integer> list = new ArrayList<>();
    	for (int j = 0; j < 100; j++) {
			list.add(j);
		}
//    	list.parallelStream().forEach(i -> System.out.print(i*2));
//    	list.parallelStream().forEach(i -> System.out.print(i*2));
//    	list.parallelStream().forEach(i -> System.out.print(i*2));	この方が早いと書いてあったが、遅かった。
    	for(int i : list) {
    		System.out.println(i*2);
    	}
    	for(int i : list) {
    		System.out.println(i*2);
    	}
    	for(int i : list) {
    		System.out.println(i*2);
    	}
    	Date date2 = new Date();
    	long t2 = 0L;
    	t2 = date2.getTime();
    	long t3 = 0L;
    	t3 = t2-t1;
    	System.out.println("---");
    	System.out.println(t3);



	}

}
