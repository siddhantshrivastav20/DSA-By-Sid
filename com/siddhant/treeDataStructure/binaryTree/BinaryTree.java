package com.siddhant.treeDataStructure.binaryTree;

import java.util.Scanner;

public class BinaryTree {
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
        System.out.println("Enter the root node value");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner,root);
    }

    private void populate(Scanner scanner, Node node){

        // Insert left node..
        System.out.println("Do you want enter the left node of "+node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of left node: ");
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner,node.left);
        }

        //Insert right node..

        System.out.println("Do you want to enter the right node of: "+ node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of right node: ");
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner,node.left);
        }

    }
}
