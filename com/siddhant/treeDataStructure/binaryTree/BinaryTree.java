package com.siddhant.treeDataStructure.binaryTree;

import java.util.Scanner;

public class BinaryTree {
    public static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
    static int idx = -1;
    static final int COUNT = 5;

    public Node createBinaryTree(int[] arr){
        idx++;
        if(arr[idx] == -1){
            return null;
        }

        Node node = new Node(arr[idx]);
        node.left = createBinaryTree(arr);
        node.right = createBinaryTree(arr);
        return node;


    }


    static void print2DUtil(Node root, int space)
    {
        // Base case
        if (root == null)
            return;

        // Increase distance between levels
        space += COUNT;

        // Process right child first
        print2DUtil(root.right, space);

        // Print current node after space
        // count
        System.out.print("\n");
        for (int i = COUNT; i < space; i++)
            System.out.print(" ");
        System.out.print(root.value + "\n");

        // Process left child
        print2DUtil(root.left, space);
    }

    // Wrapper over print2DUtil()
    static void print2D(Node root)
    {
        // Pass initial space count as 0
        print2DUtil(root, 0);
    }


    public static void main(String[] args){
        BinaryTree binaryTree = new BinaryTree();
        int[] arr = {10,20,40,80,-1,-1,90,-1,-1,50,-1,-1,30,60,-1,-1,70,100,-1,-1,110,-1,-1};
        Node rootNode = binaryTree.createBinaryTree(arr);
        System.out.println(rootNode.value);
        print2D(rootNode);

    }
}
