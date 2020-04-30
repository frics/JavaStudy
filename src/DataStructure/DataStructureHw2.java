package DataStructure;

/******************************************************************************
        * An DataStructure.IntNode provides a node for a linked list with
        * integer data in each node.
        *
        * @note
*   Lists of nodes can be made of any length, limited only by the amount of
        *   free memory in the heap. But beyond Integer.MAX_VALUE (2,147,483,647),
        *   the answer from listLength is incorrect because of arithmetic
        *   overflow.
        *
        ******************************************************************************/
class IntNode
{
    // Invariant of the DataStructure.IntNode class:
    //   1. The node's integer data is in the instance variable data.
    //   2. For the final node of a list, the link part is null.
    //      Otherwise, the link part is a reference to the
    //      next node of the list.
    private int data;
    private IntNode link;


    /**
     * Initialize a node with a specified initial data and link to the next
     * node. Note that the initialLink may be the null reference,
     * which indicates that the new node has nothing after it.
     * @param initialData
     *   the initial data of this new node
     * @param initialLink
     *   a reference to the node after this new node--this reference may be null
     *   to indicate that there is no node after this new node.
     * @postcondition
     *   This node contains the specified data and link to the next node.
     **/
    public IntNode(int initialData, IntNode initialLink)
    {
        data = initialData;
        link = initialLink;
    }


    /**
     * Modification method to add a new node after this node.
     * @param item
     *   the data to place in the new node
     * @postcondition
     *   A new node has been created and placed after this node.
     *   The data for the new node is item. Any other nodes
     *   that used to be after this node are now after the new node.
     * @exception OutOfMemoryError
     *   Indicates that there is insufficient memory for a new
     *   DataStructure.IntNode.
     **/
    public void addNodeAfter(int item)
    {
        link = new IntNode(item, link);
    }


    /**
     * Accessor method to get the data from this node.
     * @param - none
     * @return
     *   the data from this node
     **/
    public int getData( )
    {
        return data;
    }


    /**
     * Accessor method to get a reference to the next node after this node.
     * @param - none
     * @return
     *   a reference to the node after this node (or the null reference if there
     *   is nothing after this node)
     **/
    public IntNode getLink( )
    {
        return link;
    }


    /**
     * Copy a list.
     * @param source
     *   the head of a linked list that will be copied (which may be
     *   an empty list in where source is null)
     * @return
     *   The method has made a copy of the linked list starting at
     *   source. The return value is the head reference for the
     *   copy.
     * @exception OutOfMemoryError
     *   Indicates that there is insufficient memory for the new list.
     **/
    public static IntNode listCopy(IntNode source)
    {
        IntNode copyHead;
        IntNode copyTail;

        // Handle the special case of the empty list.
        if (source == null)
            return null;

        // Make the first node for the newly created list.
        copyHead = new IntNode(source.data, null);
        copyTail = copyHead;

        // Make the rest of the nodes for the newly created list.
        while (source.link != null)
        {
            source = source.link;
            copyTail.addNodeAfter(source.data);
            copyTail = copyTail.link;
        }

        // Return the head reference for the new list.
        return copyHead;
    }


    /**
     * Copy a list, returning both a head and tail reference for the copy.
     * @param source
     *   the head of a linked list that will be copied (which may be
     *   an empty list in where source is null)
     * @return
     *   The method has made a copy of the linked list starting at
     *   source.  The return value is an
     *   array where the [0] element is a head reference for the copy and the [1]
     *   element is a tail reference for the copy.
     * @exception OutOfMemoryError
     *   Indicates that there is insufficient memory for the new list.
     **/
    public static IntNode[ ] listCopyWithTail(IntNode source)
    {
        IntNode copyHead;
        IntNode copyTail;
        IntNode[ ] answer = new IntNode[2];

        // Handle the special case of the empty list.
        if (source == null)
            return answer; // The answer has two null references .

        // Make the first node for the newly created list.
        copyHead = new IntNode(source.data, null);
        copyTail = copyHead;

        // Make the rest of the nodes for the newly created list.
        while (source.link != null)
        {
            source = source.link;
            copyTail.addNodeAfter(source.data);
            copyTail = copyTail.link;
        }

        // Return the head and tail references.
        answer[0] = copyHead;
        answer[1] = copyTail;
        return answer;
    }


    /**
     * Compute the number of nodes in a linked list.
     * @param head
     *   the head reference for a linked list (which may be an empty list
     *   with a null head)
     * @return
     *   the number of nodes in the list with the given head
     * @note
     *   A wrong answer occurs for lists longer than Int.MAX_VALUE.
     **/
    public static int listLength(IntNode head)
    {
        IntNode cursor;
        int answer;

        answer = 0;
        for (cursor = head; cursor != null; cursor = cursor.link)
            answer++;

        return answer;
    }


    /**
     * Copy part of a list, providing a head and tail reference for the new copy.
     * @param start/end
     *   references to two nodes of a linked list
     * @param copyHead/copyTail
     *   the method sets these to refer to the head and tail node of the new
     *   list that is created
     * @precondition
     *   start and end are non-null references to nodes
     *   on the same linked list,
     *   with the start node at or before the end node.
     * @return
     *   The method has made a copy of the part of a linked list, from the
     *   specified start node to the specified end node. The return value is an
     *   array where the [0] component is a head reference for the copy and the
     *   [1] component is a tail reference for the copy.
     * @exception IllegalArgumentException
     *   Indicates that start and end are not references
     *   to nodes on the same list.
     * @exception NullPointerException
     *   Indicates that start is null.
     * @exception OutOfMemoryError
     *   Indicates that there is insufficient memory for the new list.
     **/
    public static IntNode[ ] listPart(IntNode start, IntNode end)
    {
        IntNode copyHead;
        IntNode copyTail;
        IntNode cursor;
        IntNode[ ] answer = new IntNode[2];

        // Make the first node for the newly created list. Notice that this will
        // cause a NullPointerException if start is null.
        copyHead = new IntNode(start.data, null);
        copyTail = copyHead;
        cursor = start;

        // Make the rest of the nodes for the newly created list.
        while (cursor != end)
        {
            cursor = cursor.link;
            if (cursor == null)
                throw new IllegalArgumentException
                        ("end node was not found on the list");
            copyTail.addNodeAfter(cursor.data);
            copyTail = copyTail.link;
        }

        // Return the head and tail references
        answer[0] = copyHead;
        answer[1] = copyTail;
        return answer;
    }


    /**
     * Find a node at a specified position in a linked list.
     * @param head
     *   the head reference for a linked list (which may be an empty list in
     *   which case the head is null)
     * @param position
     *   a node number
     * @precondition
     *   position > 0.
     * @return
     *   The return value is a reference to the node at the specified position in
     *   the list. (The head node is position 1, the next node is position 2, and
     *   so on.) If there is no such position (because the list is too short),
     *   then the null reference is returned.
     * @exception IllegalArgumentException
     *   Indicates that position is not positive.
     **/
    public static IntNode listPosition(IntNode head, int position)
    {
        IntNode cursor;
        int i;

        if (position <= 0)
            throw new IllegalArgumentException("position is not positive");

        cursor = head;
        for (i = 1; (i < position) && (cursor != null); i++)
            cursor = cursor.link;

        return cursor;
    }


    /**
     * Search for a particular piece of data in a linked list.
     * @param head
     *   the head reference for a linked list (which may be an empty list in
     *   which case the head is null)
     * @param target
     *   a piece of data to search for
     * @return
     *   The return value is a reference to the first node that contains the
     *   specified target. If there is no such node, the null reference is
     *   returned.
     **/
    public static IntNode listSearch(IntNode head, int target)
    {
        IntNode cursor;

        for (cursor = head; cursor != null; cursor = cursor.link)
            if (target == cursor.data)
                return cursor;

        return null;
    }


    /**
     * Modification method to remove the node after this node.
     * @param - none
     * @precondition
     *   This node must not be the tail node of the list.
     * @postcondition
     *   The node after this node has been removed from the linked list.
     *   If there were further nodes after that one, they are still
     *   present on the list.
     * @exception NullPointerException
     *   Indicates that this was the tail node of the list, so there is nothing
     *   after it to remove.
     **/
    public void removeNodeAfter( )
    {
        link = link.link;
    }


    /**
     * Modification method to set the data in this node.
     * @param newData
     *   the new data to place in this node
     * @postcondition
     *   The data of this node has been set to newData.
     **/
    public void setData(int newData)
    {
        data = newData;
    }


    /**
     * Modification method to set the link to the next node after this node.
     * @param newLink
     *   a reference to the node that should appear after this node in the linked
     *   list (or the null reference if there is no node after this node)
     * @postcondition
     *   The link to the node after this node has been set to newLink.
     *   Any other node (that used to be in this link) is no longer connected to
     *   this node.
     **/
    public void setLink(IntNode newLink)
    {
        link = newLink;
    }
}

/******************************************************************************
 * An DataStructure.IntLinkedBag is a collection of int numbers.
 *
 * @note
 *   (1) Beyond Int.MAX_VALUE elements, countOccurrences,
 *   size, and grab are wrong.
 *   <p>
 *   (2) Because of the slow linear algorithms of this class, large bags will have
 *   poor performance.
 *
 ******************************************************************************/
class IntLinkedBag implements Cloneable
{
    // Invariant of the DataStructure.IntLinkedBag class:
    //   1. The elements in the bag are stored on a linked list.
    //   2. The head reference of the list is in the instance variable
    //      head.
    //   3. The total number of elements in the list is in the instance
    //      variable manyNodes.
    private IntNode head;
    private int manyNodes;


    /**
     * Initialize an empty bag.
     * @param - none
     * @postcondition
     *   This bag is empty.
     **/
    public IntLinkedBag( )
    {
        head = null;
        manyNodes = 0;
    }


    /**
     * Add a new element to this bag.
     * @param element
     *   the new element that is being added
     * @postcondition
     *   A new copy of the element has been added to this bag.
     * @exception OutOfMemoryError
     *   Indicates insufficient memory a new DataStructure.IntNode.
     **/
    public void add(int element)
    {
        head = new IntNode(element, head);
        manyNodes++;
    }


    /**
     * Add the contents of another bag to this bag.
     * @param addend
     *   a bag whose contents will be added to this bag
     * @precondition
     *   The parameter, addend, is not null.
     * @postcondition
     *   The elements from addend have been added to this bag.
     * @exception NullPointerException
     *   Indicates that addend is null.
     * @exception OutOfMemoryError
     *   Indicates insufficient memory to increase the size of the bag.
     **/
    public void addAll(IntLinkedBag addend)
    {
        IntNode[ ] copyInfo;

        // The precondition indicates that addend is not null. If it is null,
        // then a NullPointerException is thrown here.
        if (addend.manyNodes > 0)
        {
            copyInfo = IntNode.listCopyWithTail(addend.head);
            copyInfo[1].setLink(head); // Link the tail of copy to my own head...
            head = copyInfo[0];        // and set my own head to the head of the copy.
            manyNodes += addend.manyNodes;
        }
    }


    /**
     * Add new elements to this bag. If the new elements would take this
     * bag beyond its current capacity, then the capacity is increased
     * before adding the new elements.
     * @param elements
     *   (a variable-arity argument)
     *   one or more new elements that are being inserted
     * @postcondition
     *   A new copy of the element has been added to this bag.
     * @exception OutOfMemoryError
     *   Indicates insufficient memory to increase the size of the bag.
     **/
    public void addMany(int... elements)
    {
        // Activate the ordinary add method for each integer in the
        // elements array.
        for (int i : elements)
            add(i);
    }


    /**
     * Generate a copy of this bag.
     * @param - none
     * @return
     *   The return value is a copy of this bag. Subsequent changes to the
     *   copy will not affect the original, nor vice versa. Note that the return
     *   value must be type cast to an DataStructure.IntLinkedBag before it can be used.
     * @exception OutOfMemoryError
     *   Indicates insufficient memory for creating the clone.
     **/
    public Object clone( )
    {  // Clone a nIntLinkedBag object.
        IntLinkedBag answer;

        try
        {
            answer = (IntLinkedBag) super.clone( );
        }
        catch (CloneNotSupportedException e)
        {  // This exception should not occur. But if it does, it would probably
            // indicate a programming error that made super.clone unavailable.
            // The most common error would be forgetting the "Implements Cloneable"
            // clause at the start of this class.
            throw new RuntimeException
                    ("This class does not implement Cloneable");
        }

        answer.head = IntNode.listCopy(head);

        return answer;
    }


    /**
     * Accessor method to count the number of occurrences of a particular element
     * in this bag.
     * @param target
     *   the element that needs to be counted
     * @return
     *   the number of times that target occurs in this bag
     **/
    public int countOccurrences(int target)
    {
        int answer;
        IntNode cursor;

        answer = 0;
        cursor = IntNode.listSearch(head, target);
        while (cursor != null)
        {  // Each time that cursor is not null, we have another occurrence of
            // target, so we add one to answer and then move cursor to the next
            // occurrence of the target.
            answer++;
            cursor = cursor.getLink( );
            cursor = IntNode.listSearch(cursor, target);
        }
        return answer;
    }


    /**
     * Accessor method to retrieve a random element from this bag.
     * @param - none
     * @precondition
     *   This bag is not empty.
     * @return
     *   a randomly selected element from this bag
     * @exception IllegalStateException
     *   Indicates that the bag is empty.
     **/
    public int grab( )
    {
        int i;
        IntNode cursor;

        if (manyNodes == 0)
            throw new IllegalStateException("Bag size is zero");

        i =  (int)(Math.random( ) * manyNodes) + 1;
        cursor = IntNode.listPosition(head, i);
        return cursor.getData( );
    }


    /**
     * Remove one copy of a specified element from this bag.
     * @param target
     *   the element to remove from the bag
     * @postcondition
     *   If target was found in the bag, then one copy of
     *   target has been removed and the method returns true.
     *   Otherwise the bag remains unchanged and the method returns false.
     **/
    public boolean remove(int target)
    {
        IntNode targetNode; // The node that contains the target

        targetNode = IntNode.listSearch(head, target);
        if (targetNode == null)
            // The target was not found, so nothing is removed.
            return false;
        else
        {  // The target was found at targetNode. So copy the head data to targetNode
            // and then remove the extra copy of the head data.
            targetNode.setData(head.getData( ));
            head = head.getLink( );
            manyNodes--;
            return true;
        }
    }


    /**
     * Determine the number of elements in this bag.
     * @param - none
     * @return
     *   the number of elements in this bag
     **/
    public int size( )
    {
        return manyNodes;
    }


    /**
     * Create a new bag that contains all the elements from two other bags.
     * @param b1
     *   the first of two bags
     * @param b2
     *   the second of two bags
     * @precondition
     *   Neither b1 nor b2 is null.
     * @return
     *   the union of b1 and b2
     * @exception IllegalArgumentException
     *   Indicates that one of the arguments is null.
     * @exception OutOfMemoryError
     *   Indicates insufficient memory for the new bag.
     **/
    public static IntLinkedBag union(IntLinkedBag b1, IntLinkedBag b2)
    {
        // The precondition requires that neither b1 nor b2 is null.
        // If one of them is null, then addAll will throw a NullPointerException.
        IntLinkedBag answer = new IntLinkedBag( );

        answer.addAll(b1);
        answer.addAll(b2);
        return answer;
    }

}


public class DataStructureHw2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}