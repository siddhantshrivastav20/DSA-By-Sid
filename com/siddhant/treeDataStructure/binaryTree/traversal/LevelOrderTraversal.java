package com.siddhant.treeDataStructure.binaryTree.traversal;

import java.util.Scanner;

public class LevelOrderTraversal {
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

    public Node createTree(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of node");
        int value = scanner.nextInt();
        if(value == -1){
            return null;
        }

        Node root = new Node(value);
        // Inserting left Node..
        System.out.println("Value of left of "+root.value);
        root.left = createTree();
        // Inserting right node..
        System.out.println("Value of right of "+root.value);
        root.right = createTree();
        return root;
    }

    // preorder traversal..
    public void preOrder(Node node){
        if(node == null){
            return;
        }

        System.out.print(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }



    public static void main(String[] args){
        LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
        Node ans = levelOrderTraversal.createTree();
        System.out.println(ans.value);
        levelOrderTraversal.preOrder(ans);

    }
}
