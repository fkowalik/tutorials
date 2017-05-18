package hsbclearn.simpleapp.dataproc;

import hsbclearn.simpleapp.datatype.IntegerWrapper;

import java.util.List;

/**
 * Created by FIKOWALI on 2017-05-17.
 */
public interface DataOutput {
    void putData(List<IntegerWrapper> list);
}
