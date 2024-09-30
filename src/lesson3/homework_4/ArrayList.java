package lesson3.homework_4;

public class ArrayList <E>{
    private Object[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(E element){
        if(size == elements.length){

        }
    }


    public E get(int index){
        checkIndex(index);
        return (E) elements[index];
    }

    public E remove(int index){
        checkIndex(index);
        E oldElement = (E) elements[index];
        int numMoved = size - index - 1;
        if(numMoved > 0){
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[--size] = null;
        return (E) elements[index];
    }

    private int size(){
        return size;
    }


    private void checkIndex(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

}
