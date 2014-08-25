
import java.util.List;

import au.edu.uow.Collection.*;
import au.edu.uow.UserInterface.*;

/**
 * This is the application that manages a CD/DVD collection.
 * This program is provided for the CSCI213 Assignment. 
 * Note: You should not modify this program. 
 * 
 * @author Lei Ye
 *
 */
public class MyCollection {
	/**
	 * This is the entry point of the application
	 * @param args Command line options.
	 */
	public static void main(String[] args) {
		if(args.length == 1){
			List<Album> myCollection =  CollectionFactory.loadCollection(args[0]);
			if (myCollection !=null){
				UserInterface ui = new UserInterface(myCollection);
				ui.start();
			}else{
				System.out.println("Error: Failed to load collection. Exit!");
				System.exit(0);
			}
		}else{
			System.out.println("Usage: MyCollection collectionFilename");
		}
	}
}
