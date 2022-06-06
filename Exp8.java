class Stack {
    int arr[] = new int[10];
    int top;

    Stack(){
        top = -1;
    }
    void push(int x){
        top = top +1;
        arr[top] = x;
    }
    int pop(){
        int val =  arr[top];
        top = top -1;
        return val;
    }


}
class Exp8{
    public static void main(String arg[]){
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        s1.push(11);
        s1.push(22);
        s1.push(33);
        s2.push(44);
        s2.push(55);
        s2.push(66);
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s2.pop());
        System.out.println(s2.pop());
    }
}