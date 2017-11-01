package edu.luc.cs271.linkedstack;

import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;


public class LinkedStack<E> implements IStack<E> {

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;

  // TODO why don't we need an explicit constructor?

  @Override
  public E push(final E obj)
  {
    // TODO
    // DONE
    top = new Node<>(obj, top);
    return obj;
  }

  @Override
  public E peek()
  {
    // TODO
    // DONE
    if (isEmpty())
    {
      throw new NoSuchElementException();
    }
    return top.data;
  }

  @Override
  public E pop()
  {
    // TODO
    // DONE
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    else {
      E newTop = top.data;
      top = top.next;
      return newTop;
    }
  }

  @Override
  public boolean isEmpty()
  {
    // TODO
    
    //DONE
    if (top == null)
      {return true;}
    else
      {return false;}
  }

  @Override
  public List<E> asList()
  {
    final ArrayList<E> result = new ArrayList<>(size);
    populateList(curr.next, result); //DONE replace null with the right reference
    return result;
  }
  
  private void populateList(final Node<E> curr, final List<E> result) {
    //TODO recursively populate the list in the desired order
    //DONE
    if(curr==null){
      return; 
    }
    else {
      result.add(curr.data);
      populateList(curr.next, result)
    }
  }
  @Override
  public List<E> result = new ArrayList<>(size);
  populateFifoList(curr.next, result); //TODO --> DONE replace null with the right reference
  return result;
  }
  
  private void populateFifoList(final Node<E> curr, final List<E> result) {
    //TODO recursively populate the list in the desired order
    //DONE
    if(curr ==null) {
      return;
    }
    else {
      result.add(0,curr.data);
      populateFifoList(curr.next,result);
    }
    
  }


}
