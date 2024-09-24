package co.edu.uptc;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BinaryTree {
    Node root = null;

    public void add(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
        } else {
            Node parent = searchNode(value);
            if (value > parent.getInfo()) {
                parent.setHigher(newNode);
            } else {
                parent.setLower(newNode);
            }
        }
    }

    private Node searchNode(int value) {
        Node auxNode = root;
        while (auxNode != null) {
            if (value > auxNode.getInfo()) {
                if (auxNode.getHigher() == null) {
                    return auxNode; 
                }
                auxNode = auxNode.getHigher();
            } else {
                if (auxNode.getLower() == null) {
                    return auxNode; 
                }
                auxNode = auxNode.getLower();
            }
        }
        return null; 
    }

    public void showOrder() {
        recursive(root);
    }

    private void recursive(Node auxNode) {
        if (auxNode.getHigher() != null) {
            recursive(auxNode.getHigher());
        }
        System.out.println(auxNode.getInfo());
        if (auxNode.getLower() != null) {
            recursive(auxNode.getLower()); 
        }
    }
}
