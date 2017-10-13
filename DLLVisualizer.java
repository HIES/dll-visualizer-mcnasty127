import bridges.connect.Bridges;
import bridges.connect.Bridges;
import bridges.base.DLelement;
/**
 * A class that utilizes the BRIDGES library to visualize a doubly-linked list.
 *
 * @author Mcnasty127
 */
public class DLLVisualizer
{
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception{

        // TO DO: Define credentials
        final String API_KEY = "486075434888";
        final String USER_ID = "mcnasty127";
        
        // No need to modify Bridges constructor
        Bridges bridge = new Bridges(1, API_KEY, USER_ID);

        // TO DO: Build the objects to be added to your DLL
        Track daydream = new Track("Daydream", "Medasin");
        Track rosie = new Track("Rosie", "John Mayer");
        Track sunday = new Track("Sunday Morning", "Maroon 5");
        Track dock = new Track("The Dock Of The Bay", "Otis Redding");

        // TO DO: Build the head 
        DLelement head = new DLelement(daydream.toString(), daydream);
        
        // TO DO: Create the rest of the Nodes/DLelements and link them to form a DLL
        DLelement e2 = new DLelement(rosie.toString(), rosie);
        DLelement e3 = new DLelement(sunday.toString(), sunday);
        DLelement e4 = new DLelement(dock.toString(), dock);
        head.setNext(e2);
        head.setPrev(null);
        e2.setNext(e3);
        e2.setPrev(head);
        e3.setNext(e4);
        e3.setPrev(e2);
        e4.setNext(null);
        e4.setPrev(e3);
        //Prepare for visualization
        bridge.setDataStructure(head);
        bridge.setTitle("A Doubly-Linked List");
        bridge.visualize();

    }
}
