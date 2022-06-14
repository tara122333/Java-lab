interface Istack{
    void push(Object item);
    Object pop();
}
class StackImpl implements Istack{
    protected Object stackArray[];
    protected int tos;
    public StackImpl(int cap){
        tos= -1;
        stackArray = new Object[cap];
    }
    public void push(Object item){
        stackArray[++tos]=item;
    }
    public Object pop(){
        Object objRef = stackArray[tos];
        stackArray[tos] = null;
        tos--;
        return objRef;
    }
    Object peek(){
        return stackArray[tos];
    }
}
interface IsafeStack extends Istack{
    boolean isEmpty();
    boolean isFull();
}
class SafeStackImpl extends StackImpl implements IsafeStack{
    public SafeStackImpl(int data){
        super(data);
    }
    public boolean isEmpty(){
        return tos<0;
    }
    public boolean isFull(){
        return tos>=stackArray.length-1;
    }
}
public class Exp9 {
    public static void main(String arg[]){
        SafeStackImpl ssRef = new SafeStackImpl(10);
        StackImpl sRef = ssRef;
        IsafeStack isRef = ssRef;
        Istack istRef = ssRef;
        Object objRef = ssRef;
        ssRef.push("Dollars");
        sRef.push("Rupees");
        System.out.println(isRef.pop());
        System.out.println(istRef.pop());
        System.out.println(objRef.getClass());
    }
}
