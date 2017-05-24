package hsbclearn.simpleapp;

import hsbclearn.simpleapp.dataproc.ConsoleInput;
import hsbclearn.simpleapp.dataproc.SortUniqueProcessor;
import hsbclearn.simpleapp.dataproc.ConsoleOutput;
import hsbclearn.simpleapp.datatype.IntegerWrapper;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        ConsoleInput data = new ConsoleInput();
        ArrayList<IntegerWrapper> dataIn = data.getData();
        SortUniqueProcessor dataProc = new SortUniqueProcessor();
        //TreeSet<IntegerWrapper> dataOut = dataProc.processData(dataIn);
        List<IntegerWrapper> dataOut = dataProc.processData(dataIn);
        ConsoleOutput dataPut = new ConsoleOutput();

        System.out.println( "Initial list: " + dataIn );
        dataPut.putData(dataOut);
    }
}
