package problem1;

import java.util.*;

public class FloorConstruction {

	//Values hold in descending order from max to minimum
	PriorityQueue<Integer> queue=new PriorityQueue<>(Collections.reverseOrder());
	int []days;
	
	//Taking the input of floor size for each day.
	public void getFloorSize(int floors){
	int size;
	Scanner sc=new Scanner(System.in);
	days=new int[floors];
	
	for(int i=0;i<floors;i++){
		System.out.println("enter the floor size given on day : "+(i+1));
		size=sc.nextInt();
		days[i]=size;
		queue.offer(size);
		}
	
		sc.close();		
	}
	
	public void constructionOrder(){	
		List<Integer> list=new ArrayList<Integer>();
		System.out.println("The order of construction is as follows");
		
		for(int i=0; i<days.length; i++){
			System.out.println("Day:"+(i+1));
			list.add(days[i]);
			
			while(list.contains(queue.peek())){
				System.out.print(queue.poll()+" ");
			}
			System.out.println();
		}
		
	}
	
}
