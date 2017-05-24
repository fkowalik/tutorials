package hsbclearn.simpleapp.dataproc;

import hsbclearn.simpleapp.datatype.IntegerWrapper;

import java.util.ArrayList;

/**
 * Created by FIKOWALI on 2017-05-17.
 */
public class ConsoleInput implements DataInput {

    public ArrayList<IntegerWrapper> getData() {
        ArrayList<IntegerWrapper> list = new ArrayList<IntegerWrapper>();
        list.add(new IntegerWrapper(40));
        list.add(new IntegerWrapper(20));
        list.add(new IntegerWrapper(20));
        list.add(new IntegerWrapper(10));
        return list;
    }

}
