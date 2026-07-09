package datastructures;

public class Map {

    private final String [] keys ;

    private final String [] values;

    private int keyCount;
    private int valueCount;

    public Map(int size) {

        keys = new String [size];
        values = new String[size];
    }

    public boolean isEmpty() {return keyCount == 0;}

    public int size(){return keyCount;}

    public boolean containsKey(String mapKey){

        for(String key : keys){

            boolean isElementValid = key != null && key.equals(mapKey);

            if(isElementValid) return true;
        }

        return false;
    }

    public boolean containsValue(String mapValue){

        for(String value : values){

            boolean isElementValid = value != null && value.equals(mapValue);

            if(isElementValid) return true;
        }

        return false;
    }

    public String get(String key){

        if(containsKey(key)){
            return values[valueCount -1];
        }

        return null;
    }

    private int getKeyIndex(String key){

        int count;
        for(count = 0; count < keys.length; count++){

            if(keys[count].equals(key)) return count;

        }
        return count;
    }

    public String put(String key,String value){

        if(containsKey(key)){
            values[getKeyIndex(key)] = value;
            return value;
        }

        keys[keyCount++] = key;
        values[valueCount++] = value;

        return null;
    }

    public String remove(String key){

        if(containsKey(key)){
            int distanceFromTop = getKeyIndex(key)+ 1;
            String value = values[getKeyIndex(key)];
            keyCount-= distanceFromTop;
            valueCount-= distanceFromTop;

            return value;
        }
        return null;
    }
}


