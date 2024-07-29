package com.siddhant.treeDataStructure.binaryTree.traversal;

import java.util.Scanner;

public class Traversal {
    private static class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value = value;
        }
    }

    private Node root;

    public void populate(Scanner scanner){
        System.out.println("Enter the root node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    public void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter left of "+node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of the left of "+ node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner,node.left);
        }

        System.out.println("Do you want to enter right of "+node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of the right of "+ node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner,node.right);
        }

    }

    // PreOrder Traversal.
    public void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);

    }

    // Inorder traversal

    public void inOrder(Node node){
        if(node == null){
            return;
        }

        inOrder(node.left);
        System.out.print(node.value+" ");
        inOrder(node.right);

    }

    // PostOrder traversal
    public void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+" ");

    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Traversal traversal = new Traversal();
        traversal.populate(scanner);
        Node rootNode = traversal.root;
        System.out.println("Preorder Traversal");
        traversal.preOrder(rootNode);
        System.out.println("Inorder Traversal");
        traversal.inOrder(rootNode);
        System.out.println("Postorder Traversal");
        traversal.postOrder(rootNode);


    }
}
