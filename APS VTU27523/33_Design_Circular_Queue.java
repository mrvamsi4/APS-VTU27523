class MyCircularQueue {
    private int[] a; private int head=0, size=0, cap;
    public MyCircularQueue(int k){ a=new int[k]; cap=k; }
    public boolean enQueue(int value){ if(isFull())return false; a[(head+size)%cap]=value; size++; return true; }
    public boolean deQueue(){ if(isEmpty())return false; head=(head+1)%cap; size--; return true; }
    public int Front(){ return isEmpty()?-1:a[head]; }
    public int Rear(){ return isEmpty()?-1:a[(head+size-1)%cap]; }
    public boolean isEmpty(){ return size==0; }
    public boolean isFull(){ return size==cap; }
}
