package Week3.Tutorials.Question2;

public interface BidCollectionInterface<T> {

    /**
     * Adds a bid to this collection
     * @param o The bid to be added into the collection
     * @return True if bid is successfully added, false otherwise
     */
    public boolean addBid(T o);

    /**
     * Gets the bid in the collection with the best yearly cost
     * @return The bid itself
     */
    public T getBestCost();

    /**
     * Gets the bid with the best initial cost (Unit cost + installation cost)
     * @return Bid with the best initial cost
     */
    public T getBestInitialCost();

    /**
     * Clears all the items from the colleciton
     * @return True if all is removed successfully, else return false.
     */
    public boolean clearCollection();

    /**
     * Gets the number of items in the collection.
     * @return Return the Integer value of the number of items in the collection
     */
    public int getSize();

    /**
     * Checks to see if the collection is empty
     * @return True if it is empty, else return false
     */
    public boolean isEmpty();
}
