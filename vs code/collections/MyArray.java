//package collections;

class Array {
    private int size, length;
    private int[] data;
    Array(int size) {
        length = 0;
        this.size = size;
        data = new int[size];
    }
    void pop() {    //  O(1)
        data[length] = 0;
        length--;
    }
    void push(int item) { 
        if(length == size-1) {
            int copy[] = new int[2 * size];
            for(int i=0;i<size;i++)
                copy[i] = data[i];
            data = copy;
        }
        data[length++] = item;
    }
    public String toString() {
        System.out.print("Array is: [");
        for(int i=0;i<length;i++) {
            if(i < length-1)
                System.out.print(data[i] + ", ");
            else
                System.out.print(data[i]);
        }
        return "]";
    }
}
class MyArray {
    public static void main(String[] args) {
        var a = new Array(10);
        for(int i=0;i<20;i++)
            a.push(i);

        System.out.println(a);
    }
}