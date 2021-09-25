
public class FolderiteratorDeemo {
	
	public static void main(String[] args) {  
        CollectionOfDoors doorCollection = new CollectionOfDoors();  
        System.out.println("All The Different Types Of Doors To Consider For Your House.\n");  
        for(Iterator iter = doorCollection.getIterator(); iter.hasNext();){  
            String door = (String)iter.next();  
            System.out.println(door);  
         }      
  }  

}
