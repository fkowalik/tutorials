package hsbclearn.simpleapp.dataproc;

import hsbclearn.simpleapp.datatype.IntegerWrapper;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by FIKOWALI on 2017-05-17.
 */
public interface DataProcessor {
    List<IntegerWrapper> processData(List<IntegerWrapper> unprocessedList);
}
