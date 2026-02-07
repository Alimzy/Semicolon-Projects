package stackClass;

public class Stack {
    static int[] myStack = new int[16];

    public void push(int number){
        for(int count = 0; count < myStack.length; count++){
            myStack[count] = number;
        }
    }

    public void pop(int number){
        for(int count = myStack.length; count < 0; count--){
            myStack[count] = 0;
        }
    }

    public int peek(int number){
        return myStack[0];
    }

    public boolean isEmpty(){
        for(int count = 0; count < myStack.length;count++){
            if(myStack[count] > 0 && myStack[count] < 0){
                return false;
            }
        }
        return true;
    }


}
