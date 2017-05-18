package hsbclearn.simpleapp.dataproc;

import hsbclearn.simpleapp.datatype.IntegerWrapper;

import java.util.List;

/**
 * Created by FIKOWALI on 2017-05-17.
 */
public class DataOutputIntWrap implements DataOutput {

    public void putData(List<IntegerWrapper> list) {
        System.out.println("Processed data:" + list);
    }
}
