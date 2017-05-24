package hsbclearn.simpleapp.dataproc;

import hsbclearn.simpleapp.datatype.IntegerWrapper;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by FIKOWALI on 2017-05-17.
 */
public class SortUniqueProcessor implements DataProcessor {

    public List<IntegerWrapper> processData(List<IntegerWrapper> unprocessedList) {
        TreeSet<IntegerWrapper> list = new TreeSet<IntegerWrapper>(unprocessedList);

        //TODO should use IntegerWrapper - not Integer
        Integer sum = 0;
        for( IntegerWrapper num : list) {
            sum = sum + num.getNumber();
        }
        list.add(new IntegerWrapper(sum));

        ArrayList<IntegerWrapper> processedList = new ArrayList<IntegerWrapper>(list);
        return  processedList;
    }
}
