package sand.collection.patternStructural.adapter;

public class AdapterJavaToDatabase extends JavaApp implements Database {
    @java.lang.Override
    public void insert() {
       loadObject();
    }

    @java.lang.Override
    public void update() {
        updateObject();
    }

    @java.lang.Override
    public void select() {
        saveObject();
    }

    @java.lang.Override
    public void remove() {
        deleteObject();
    }
}
