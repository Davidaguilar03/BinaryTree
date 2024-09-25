package co.edu.uptc.utilities;

import java.util.ArrayList;
import java.util.Comparator;

public class BinaryTree<T> {
    private Node<T> root;
    private Comparator<T> comparator;
    private ArrayList<T> list;
 
    public BinaryTree(Comparator<T> comparator){
       root = null;
       this.comparator = comparator;
       list = new ArrayList<>();
    }
 
    public void add(T value){
       Node<T> newNode = new Node<T>(value);
       if(root == null){
          root = newNode;
       }else{
          Node<T> foundNode = findNode(value);
          if((comparator.compare(value, foundNode.getInfo())) > 0){
            foundNode.setHigherNode(newNode);
          }else foundNode.setLowerNode(newNode);
       }
    }
 
    private Node<T> findNode(T value){
       Node<T> aux = root;
       boolean found = false;
       while (!found) {
          if((comparator.compare(value, aux.getInfo())) > 0 && aux.getHigherNode()!= null){
             aux = aux.getHigherNode();
          }else{
             if((comparator.compare(value, aux.getInfo())) <= 0 && aux.getLowerNode() != null){
                aux = aux.getLowerNode();
             }else{
                found = true;
             }
          }
       }
       return aux;
    }
 
    public ArrayList<T> showSortData(){
       return recursive(root);
    }
 
    private  ArrayList<T> recursive(Node<T> aux){
       
       if(aux.getLowerNode()!=null)
          recursive(aux.getLowerNode());
 
          list.add(aux.getInfo());
 
       if (aux.getHigherNode()!= null) 
          recursive(aux.getHigherNode());
       
       return list;
    }
}
