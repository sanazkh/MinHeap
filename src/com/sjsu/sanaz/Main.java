package com.sjsu.sanaz;

public class Main {

    int[] myHeapArray = new int[10];
    int size;

    public int getParentIndex(int childIndex){
        int parentIndex = (childIndex - 1) / 2;
        return parentIndex;
    }

    public void bubbleUp(int itemIndex){

        int parentIndex;
        int tempItem;

        if(itemIndex != 0){
            parentIndex = getParentIndex(itemIndex);
            if(myHeapArray[parentIndex] > myHeapArray[itemIndex]){
                tempItem = myHeapArray[parentIndex];
                myHeapArray[parentIndex] = myHeapArray[itemIndex];
                myHeapArray[itemIndex] = tempItem;
                bubbleUp(parentIndex);
            }
        }
    }

    public void insert(int item){
        if(size == myHeapArray.length){

            System.out.println("The heap is full");

        }else{
            size++;
            myHeapArray[size - 1] = item;
            bubbleUp(size - 1);
            System.out.println("item inserted");
        }

    }

    public static void main(String[] args) {
	// write your code here
        Main m = new Main();
        m.insert(2);
        m.insert(4);
        m.insert(1);
        m.insert(5);

        int i = 0;
        while(i < m.myHeapArray.length){
            if(m.myHeapArray[i] != 0){
                System.out.println(m.myHeapArray[i]);
            }
            i++;
        }
    }
}
