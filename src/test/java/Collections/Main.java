package Collections;

public class Main {
    public static void main(String[] args) {

        ListCollection list = new ListCollection();
        list.addToList(1);
        list.addToList(2);
        list.addToList(3);
        list.searchListItem(66);
        list.deleteListItem(2);

        MapCollection map = new MapCollection();
        map.addToMap(1);
        map.addToMap(2);
        map.addToMap(3);
        map.searchMapItem(0);
        map.deleteMapItem(2);

        SetCollection set = new SetCollection();
        set.addToSet(1);
        set.addToSet(2);
        set.addToSet(3);
        set.searchSetItem(0);
        set.deleteSetItem(2);
    }
}
