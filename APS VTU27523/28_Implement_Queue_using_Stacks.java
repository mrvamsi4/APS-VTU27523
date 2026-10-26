import java.util.*;
class MyQueue {
    private Deque<Integer> in=new ArrayDeque<>(), out=new ArrayDeque<>();
    public MyQueue() {}
    public void push(int x) { in.push(x); }
    private void move() { if(out.isEmpty()) while(!in.isEmpty()) out.push(in.pop()); }
    public int pop() { move(); return out.pop(); }
    public int peek() { move(); return out.peek(); }
    public boolean empty() { return in.isEmpty()&&out.isEmpty(); }
}
