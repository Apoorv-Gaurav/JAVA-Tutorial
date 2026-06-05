import java.util.ArrayDeque;
import java.util.Deque;

public class DS_Deque {
    public static void main(String[] args)
    {

        // Create a Deque of Strings
        Deque<String> d = new ArrayDeque<>();

        d.addFirst("1");
        d.addLast("2");

        String f = d.removeFirst();
        String l = d.removeLast();

        // Displaying the Deque
        System.out.println("First: " + f + ", Last: " + l);
    }

    //.addFirst();   //.offerFirst()
    //.addLast();    //.offerLast()
    //.removeFirst();   //.pollFirst()
    //.removeLast();    //.pollLast()
    //.getFirst()   //.peekFirst()

    //Deque<Integer> dq = new ArrayDeque<>();

// ---------- INSERT ----------

// dq.addFirst(x);   // Insert at front, throws exception if fails
// dq.addLast(x);    // Insert at rear, throws exception if fails

// dq.offerFirst(x); // Insert at front, returns true/false
// dq.offerLast(x);  // Insert at rear, returns true/false

// dq.push(x);       // Stack-style push (same as addFirst)


// ---------- REMOVE ----------

// dq.removeFirst(); // Remove and return front element, exception if empty
// dq.removeLast();  // Remove and return rear element, exception if empty

// dq.pollFirst();   // Remove and return front element, null if empty
// dq.pollLast();    // Remove and return rear element, null if empty

// dq.pop();         // Stack-style pop (same as removeFirst)


// ---------- PEEK / ACCESS ----------

// dq.getFirst();    // Return front element, exception if empty
// dq.getLast();     // Return rear element, exception if empty

// dq.peekFirst();   // Return front element, null if empty
// dq.peekLast();    // Return rear element, null if empty

// dq.peek();        // Same as peekFirst()

// dq.element();     // Same as getFirst()


// ---------- SEARCH ----------

// dq.contains(x);   // Check if x exists


// ---------- SIZE / STATE ----------

// dq.size();        // Number of elements
// dq.isEmpty();     // Check if deque is empty
// dq.clear();       // Remove all elements


// ---------- ITERATION ----------

// dq.iterator();              // Front -> Rear iterator
// dq.descendingIterator();    // Rear -> Front iterator
    
}
