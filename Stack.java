class Stack {
   public static void main(){
       Custom_Stack cs = new Custom_Stack(5);
       cs.push(1);
       cs.push(15);
       cs.push(13);
       cs.push(145);
       cs.push(145);
        cs.pop();
    }
}
class Custom_Stack{
    private int[] stackArray;
    private int top;
    private int capacity;
    public Custom_Stack(int size){
        capacity = size;
        stackArray = new int[capacity];
        top = -1;

    }
    public void push (int item){
        stackArray[++top]= item;
        System.out.println(item);
    }
    public void pop (){
        int popitem=stackArray[top--];
       // System.out.println(popitem);
    }


}

