package thread;

public class ShopThread extends Thread {
    
    private Item item;

    public ShopThread(Item item) {
        this.item = item;
    }

    public void run() {
        item.order();
    }

}
