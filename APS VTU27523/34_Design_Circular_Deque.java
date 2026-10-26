class MyCircularDeque {
    private int[] a; private int head=0,size=0,cap;
    public MyCircularDeque(int k){a=new int[k];cap=k;}
    public boolean insertFront(int v){if(isFull())return false;head=(head-1+cap)%cap;a[head]=v;size++;return true;}
    public boolean insertLast(int v){if(isFull())return false;a[(head+size)%cap]=v;size++;return true;}
    public boolean deleteFront(){if(isEmpty())return false;head=(head+1)%cap;size--;return true;}
    public boolean deleteLast(){if(isEmpty())return false;size--;return true;}
    public int getFront(){return isEmpty()?-1:a[head];}
    public int getRear(){return isEmpty()?-1:a[(head+size-1)%cap];}
    public boolean isEmpty(){return size==0;}
    public boolean isFull(){return size==cap;}
}
