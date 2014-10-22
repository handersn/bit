package java01.test51;



class MyStack{
  Object[] list = new Object[100];
  int top;

  public void push(Object value){
      list[top++] = value;
  }
  
// 마지막에 입력한 값을 꺼낸다. 목록에서 제거됨.
  public Object pop(){
    Object value= list[top-1];
    
    list[top]=null;    
      top--;
      
      return value;

  }

}//class

class MyQueue{
  class Bucket{
    Object value;
    Bucket next;
  }

  Bucket start;
  Bucket end;
  
  public MyQueue(){
    start = new Bucket();
    end = start;
  }

  public void add(Object value){
    
    end.value = value;
    end.next = new Bucket();
    end = end.next;

  }
  
  //첫 번째 입력 값 을 꺼낸다 , 목록에서 제거됨..
  public Object poll(){
    Bucket temp = new Bucket();
    temp = start;
    
    start = start.next;
    
    return temp.value;
      
    
    
  }
}
public class CollectionTest08 {

  public static void main(String[] args) {
    MyStack stack = new MyStack();
    stack.push("00000");
    stack.push("11111");
    stack.push("22222");
    stack.push("33333");
    
    for(int i=0;i<4;i++){
      System.out.println(stack.pop());
      
    }//end for
    /* 예상 출력결과
     * 33333
     * 22222
     * 11111
     * 00000
     * 
     * */
    
    System.out.println("-----------------------------");
    
    MyQueue queue = new MyQueue();
    queue.add("AAAA");
    queue.add("BBBB");
    queue.add("CCCC");
    queue.add("DDDD");
    
    for(int i=0;i<4;i++){
      System.out.println(queue.poll());      
    }
    
    /* 예상 출력결과
     * AAAA
     * BBBB
     * CCCC
     * DDDD
     * 
     * */

  }//end main

}//end class
