package StaticList;

public class List {
    private int data[];
    private int currentSize;
    private int maxSize;

    //create the list
    public void seqList(){
        maxSize = 100;
        currentSize = 0;
        data = new int[maxSize];
    }

    //verificar se a lista está vazia
    public boolean empty(){
        if (currentSize == 0 ) return true;
        else return false;
    }

    //verificar se a lista está cheia
    public boolean full(){
        if (currentSize == maxSize) return true;
        else return false;
    }

    //obtém o tamanho atual da lista
    public int size(){
        return currentSize;
    }

    //Obtém o i-ésimo elemento de uma lista.
      //      Retorna -1 se a posição for inválida
    public int element(int pos){
        int dado;

        if ((pos > currentSize) || (pos <= 0))
            return -1;
        dado = data[pos-1];
        return dado;
    }



    /**Insere um elemento em uma determinada posição.
     Retorna true se a insercao funcionar e
     false caso contrário. */
    public boolean insert (int pos, int dado){
        if (full() || (pos > currentSize+1) || (pos<=0)){
            return false;
        }
        for (int i = currentSize; i >= pos; i--){
            data[i] = data[i-1];
        }
        data[pos - 1] = dado;
        currentSize++;
        return true;
    }

    /** Remove um elemento de uma determinada posição
     Retorna o valor do elemento removido e
     -1 caso a remoção falhe */
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
