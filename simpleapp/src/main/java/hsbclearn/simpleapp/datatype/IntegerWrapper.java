package hsbclearn.simpleapp.datatype;

/**
 * Created by FIKOWALI on 2017-05-17.
 */
public class IntegerWrapper implements Comparable {
    private Integer number;

    public IntegerWrapper(Integer nr) {
        number = nr;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(Integer nr) {
        number = nr;
    }

    public int compareTo(Object o) {
        if(this.number == ((IntegerWrapper)o).getNumber())
            return 0;
        else if(this.number < ((IntegerWrapper)o).getNumber())
            return -1;
        else
            return 1;
    }

    //TODO implementacja hashcode
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        return result = prime * result + (number == null ? 0 : number.hashCode());
        //return number.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        if( getClass() != obj.getClass() )
            return false;
        if( this.number == ((IntegerWrapper)obj).getNumber())
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return number.toString();
    }

}
