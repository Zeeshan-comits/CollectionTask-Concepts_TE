package EngineeringDigest_CollectionsFrameWork;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
public class CopyOnWriteArrayListDemo {
	
	
	public static void main(String[] args) {
		
		List<String> shoppingList = new CopyOnWriteArrayList<>();
		shoppingList.add("Milk");
		shoppingList.add("paneer");
		shoppingList.add("rajma");
		System.out.println("Initial shopping List " + shoppingList);
		
		for(String item: shoppingList)
		{
			System.out.println(item);
			// try to modify the list while reading.
			if(item.equals("paneer"))
			{
				shoppingList.add("butter");
				System.out.println("added butter while reading");
			}
		}
		System.out.println("updated list is " + shoppingList);
		
		
		//2nd demonstration on CopyOnWriteArrayList.
		
		List<String> sharedList = new CopyOnWriteArrayList<>();
				sharedList.add("item1");
				sharedList.add("item2");
				sharedList.add("item3");
				
				Thread readerThread = new Thread(() -> {
					try {
						while(true)
						{
							// iterate through the list
							for(String item: sharedList)
							{
								System.out.println("Reading item " + item);
								Thread.sleep(100);
							}
						}
					} catch(Exception e){
						System.out.println("Exception in thread reader " + e);
					}
				});
				Thread writerThread = new Thread(()-> {
					try {
							Thread.sleep(500); // delay to allow the reading to start first.
							sharedList.add("item4");
							System.out.println("Item added while writing");
							
							Thread.sleep(500);
							sharedList.remove("item1");
							System.out.println("Item removed while reading");
					}catch(Exception e) {
						e.printStackTrace();
					}
					
				});
				readerThread.start();
				writerThread.start();
	}
}


