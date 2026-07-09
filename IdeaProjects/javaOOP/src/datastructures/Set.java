package datastructures;

public class Set {

    private final String [] items ;

    private int count;

    public Set(int size){

        items = new String[size];
    }

    public boolean isEmpty() {return count == 0;}

    private boolean isFull() {

        return (count == items.length);
    }

    public boolean add(String item){

        if(isFull()) throw new IllegalArgumentException("Set is full");

        else{
            for(String element : items){

                boolean isDuplicate = element != null && element.equals(item);

                if(isDuplicate) return false;
            }

            items[count++] = item;
        }
        return true;
    }

    public int size(){return count;}

    public boolean contains(String item){

        for(String element : items){

            boolean isElementValid = element != null && element.equals(item);

            if(isElementValid) return true;
        }

        return false;
    }

    public boolean remove(String item) {

        if(contains(item)){
            --count;
            return true;
        }

        return false;
    }
}