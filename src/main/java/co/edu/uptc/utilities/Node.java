package co.edu.uptc.utilities;

import lombok.Data;

@Data
public class Node<T> {
   private T info;
   private Node<T> lowerNode;
   private Node<T> higherNode;

   public Node(T value){
    this.info = value;
    this.lowerNode=null;
    this.higherNode=null;
   }
}
