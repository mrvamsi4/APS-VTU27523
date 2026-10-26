import java.util.*;
class MinStack {
    private Deque<Integer> values=new ArrayDeque<>(), mins=new ArrayDeque<>();
    public MinStack() {}
    public void push(int val) { values.push(val); if(mins.isEmpty()||val<=mins.peek()) mins.push(val); }
    public void pop() { int x=values.pop(); if(x==mins.peek()) mins.pop(); }
    public int top() { return values.peek(); }
    public int getMin() { return mins.peek(); }
}
