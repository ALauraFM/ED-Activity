package StaticList;

public class List {
    private int data[];
    private int currentSize;
    private int maxSize;

    //create the list
    public void SeqList(){
        maxSize = 100;
        currentSize = 0;
        data = new int[maxSize];
    }

    public boolean Empty(){
        if (maxSize == 0 ) return true;
        else return false;
    }

    public boolean Full(){
        if (currentSize == maxSize) return true;
        else return false;
    }

    public int Size(){
        return currentSize;
    }

    public int Element(int pos){
        int dado;

        if ((pos > currentSize) || (pos <= 0))
            return -1;
        dado = data[pos-1];
        return dado;
    }

    public boolean Insert (int pos, int dado){
        if (Full() || (pos > currentSize+1) || (pos<=0)){
            return false;
        }
        for (int i = currentSize; i >= pos; i--){
            data[i] = data[i-1];
        }
        data[pos - 1] = dado;
        currentSize++;
        return true;
    }

    public int Remove(int pos){
        int dado;
        if ((pos > currentSize) || (pos < 1 ))
            return -1;
        dado = data[pos-1];
        for (int i = pos - 1; i < currentSize - 1; i++){
            data[i] = data[i+1];
        }
        currentSize--;
        return dado;
    }



}
