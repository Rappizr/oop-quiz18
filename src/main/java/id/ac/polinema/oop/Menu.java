package id.ac.polinema.oop;

public class Menu {

    private MenuItem[] items;
    private int itemCount;

    public Menu() {
        this.items = new MenuItem[10];
        this.itemCount = 0;
    }

    public void addMenuItem(MenuItem item) {
        if (item != null && itemCount < items.length) {
            items[itemCount] = item;
            itemCount++;
        }
    }

    public MenuItem findItem(String name) {
        if (name == null) {
            return null;
        }
        for (int i = 0; i < itemCount; i++) {
            if (items[i] != null && items[i].getName() != null && items[i].getName().equals(name)) {
                return items[i];
            }
        }
        return null;
    }

    public int getItemCount() {
        return itemCount;
    }
}