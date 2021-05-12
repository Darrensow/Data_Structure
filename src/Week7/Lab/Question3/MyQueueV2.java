package Week7.Lab.Question3;

import Week7.Lab.MyQueue;

public class MyQueueV2<E> extends MyQueue<E> {
    private MyQueue<Integer> sharePrice = new MyQueue<>();
    private int totalProfits = 0;

    /**
     * Queues the shares and price of the share to their separate queues.
     * @param e Number of shares bought
     * @param price Price of the share bought at that time
     */
    public void buyShares(E e, Integer price) {
        if (e == null) {
            throw new IllegalArgumentException("Number of shares bought cannot be 0");
        }
        if (price == null) {
            throw new IllegalArgumentException("Shares cannot be bought at $0");
        }
        super.enqueue(e);
        sharePrice.enqueue(price);
    }

    /**
     * Sells the share
     * @param e Number of share sold at a particular day
     * @param price Price of a share sold on that particular day
     */
    public void sellShares(E e, Integer price) {
        Integer sharesSold = (int) e; //total number of shares to be sold

        while (sharesSold > 0) { //Keeps looping until the number of share to be sold is less than 0
            Integer topSharesCount = (Integer) list.peekFirst();
            if (topSharesCount == null) { //Exits the method when the queue is emptied (Entries in the queue is null)
                return;
            }
            if (sharesSold < topSharesCount) { //in the case that the shares to be sold is lesser than the total number of shares of the first entry in the queue

                int netPrice = price - sharePrice.peek(); //calculate the profits/losses of the price of share sold
                totalProfits += (netPrice * sharesSold); //adding the profits/losses to the total
                Integer newShareCount = topSharesCount - sharesSold; //new value to update the first in queue
                list.set(0, (E) newShareCount); //update the queue after selling the shares
                sharesSold -= topSharesCount; //the number of shares left after selling - will become zero or negative value and this exits the loop

            } else {

                int netPrice = price - sharePrice.peek(); //calculate the profits/losses of the price of share sold
                totalProfits += (netPrice * topSharesCount); //adding the profits/losses to the total
                removeFirst(); //remove the first in line for both share and price queues
                sharesSold -= topSharesCount; //the number of shares left to be sold(for the next entry in the queue)
            }
        }
    }

    /**
     * Method that dequeues the first in both 'shares' and 'price' queues.
     * Aids in the selling of share operation
     */
    private void removeFirst() {
        sharePrice.dequeue();
        list.removeFirst();
    }

    public String showProfits(){
        return "Capital Gain / Loss: " + totalProfits;
    }

    @Override
    public String toString() {
        return "Queue for Share: " + super.toString() + "\nQueue for Price: " + sharePrice.toString();
    }
}
