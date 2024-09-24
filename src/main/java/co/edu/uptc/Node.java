package co.edu.uptc;

import lombok.Data;

@Data
public class Node {
   private int info;
   private Node lower = null;
   private Node higher = null;

   public Node(int value){
    this.info = value;
   }
}
