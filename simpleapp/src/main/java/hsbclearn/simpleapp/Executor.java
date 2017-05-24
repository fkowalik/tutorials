package hsbclearn.simpleapp;

import hsbclearn.simpleapp.dataproc.ConsoleInput;
import hsbclearn.simpleapp.dataproc.SortUniqueProcessor;
import hsbclearn.simpleapp.datatype.IntegerWrapper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by FIKOWALI on 2017-05-23.
 */
public class Executor {
    public List<IntegerWrapper> execute() {
        ConsoleInput inConsole = new ConsoleInput();
        SortUniqueProcessor dataProc = new SortUniqueProcessor();
        ArrayList<IntegerWrapper> inData = inConsole.getData();
        List<IntegerWrapper> outData = dataProc.processData(inData);
        return outData;
    }
}
