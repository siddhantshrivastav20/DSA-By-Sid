package com.siddhant.treeDataStructure.binaryTree;

import jdk.jshell.EvalException;

import java.util.PrimitiveIterator;
import java.util.Scanner;

public class ImplementBinaryTree {

    public ImplementBinaryTree(){

    }
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

    public void display(){
        display(root,0);
    }

    private void display(Node node, int level){
        if(node == null){
            return;
        }

        display(node.right,level+1);
        if(level != 0){
            for(int i =0;i<level-1; i++){
                System.out.print("|\t\t");
            }
            System.out.println("|-------->"+node.value);
        }else {
            System.out.println(node.value);
        }
        display(node.left,level+1);
    }



    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ImplementBinaryTree binaryTree = new ImplementBinaryTree();
        binaryTree.populate(scanner);
        binaryTree.display();

    }
}
