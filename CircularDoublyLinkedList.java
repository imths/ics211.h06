/**
 * 
 */
package imths.edu.ics211.h06;

import java.util.Iterator;
import java.util.ListIterator;

/**
 * @author isaacsegawa
 *
 */
public class CircularDoublyLinkedList<E> implements IList211<E>, Iterable<E> {

  private DLinkedNode head;
  private DLinkedNode tail;
  private int size;
  
  public CircularDoublyLinkedList(E[] items) {
    this();
    for (E item : items) {
      add(item);
    }
  }
  
  public CircularDoublyLinkedList() {
    this.size = 0;
    this.head = null;
    this.tail = null;
  }
  
  @Override
  public Iterator<E> iterator() {
    // TODO Auto-generated method stub
    return null;
  }
  
  @Override
  public E get(int index) {
    // TODO Auto-generated method stub
    return null;
  }


  @Override
  public E set(int index, E element) {
    // TODO Auto-generated method stub
    return null;
  }


  @Override
  public int indexOf(Object obj) {
    // TODO Auto-generated method stub
    return 0;
  }


  @Override
  public int size() {
    // TODO Auto-generated method stub
    return 0;
  }


  @Override
  public boolean add(E e) {
    // TODO Auto-generated method stub
    return false;
  }


  @Override
  public void add(int index, E element) {
    // TODO Auto-generated method stub

  }


  @Override
  public E remove(int index) {
    // TODO Auto-generated method stub
    return null;
  }
  
  private class DLinkedNode {
    E item;
    DLinkedNode next;
    DLinkedNode prev;
    
    public DLinkedNode(E item, DLinkedNode next, DLinkedNode prev) {
      this.item = item;
      this.next = next;
      this.prev = prev;
    }
  }

  private class MyIterator implements ListIterator {

    private DLinkedNode nextNode;
    private DLinkedNode jumpedOver;
    private int nextIndex;
    
    public MyIterator() {
      //init member var
      nextNode = head;
      nextIndex = 0;
      jumpedOver = null;
    }
    
    @Override
    public boolean hasNext() {
      // return size > 0
      return false;
    }

    @Override
    public Object next() {
      //if hasNext
      // remember the item at nextNode
      // jumpedOver = nextNode
      // update nextNode
      // update nextIndex
      nextIndex = (nextIndex + 1) % size;
      // return remembered item
      //throw new NoSuchElementException
      return null;
    }

    @Override
    public boolean hasPrevious() {
      //same as hasNext
      return false;
    }

    @Override
    public Object previous() {
      //if hasPrev
      // remember the item at nextNode.prev
      // jumpedOver = nextNode
      // update nextNode
      // update nextIndex
      // return remembered item
      //throw new NoSuchElementException
      return null;
    }

    @Override
    public int nextIndex() {
      return this.nextIndex;
    }

    @Override
    public int previousIndex() {
      //if negative, size - 1
      //else return nextIndex - 1
      return 0;
    }

    @Override
    public void remove() {
      //if jumpedOver != null
      // if size == 1 make everything null
      //  if jumpedOver = head
      //   head = jumpedOver.next
      //  if jumpedOver = tail
      //   tail = jumpedOver.prev
      //  remove jumpedOver from the list
      //  jumpedOver.prev.next = jumpedOver.next
      //  jumpedOver.next.prev = jumpedOver.prev
      //decrement size;
      //jumpedOver = null;
    }

    @Override
    public void set(Object e) {
      // TODO Auto-generated method stub
      
    }

    @Override
    public void add(Object e) {
      // TODO Auto-generated method stub
      
    }
    
  }
  
}
