package hsbclearn.simpleapp;

import hsbclearn.simpleapp.dataproc.DataInputIntWrap;
import hsbclearn.simpleapp.dataproc.DataProcessorIntWrap;
import hsbclearn.simpleapp.dataproc.DataOutputIntWrap;
import hsbclearn.simpleapp.datatype.IntegerWrapper;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class App {

    public static void main(String[] args) {
        DataInputIntWrap data = new DataInputIntWrap();
        ArrayList<IntegerWrapper> dataIn = data.getData();
        DataProcessorIntWrap dataProc = new DataProcessorIntWrap();
        //TreeSet<IntegerWrapper> dataOut = dataProc.processData(dataIn);
        List<IntegerWrapper> dataOut = dataProc.processData(dataIn);
        DataOutputIntWrap dataPut = new DataOutputIntWrap();

        System.out.println( "Initial list: " + dataIn );
        dataPut.putData(dataOut);
    }
}
