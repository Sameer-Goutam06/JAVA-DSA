package Trees;

import java.util.*;

class TreeNode
{
    int val,depth;
    TreeNode left,right;
    TreeNode(int val)
    {
        this.val=val;
        this.left=this.right=null;
    }
}

public class TreeBasics {
    public static void inorder(TreeNode root)
    {
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public static void preorder(TreeNode root)
    {
        if(root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(TreeNode root)
    {
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }
    public static TreeNode insertNode(TreeNode root,int val)
    {
        if(root==null) return new TreeNode(val);
        if(val<root.val) root.left=insertNode(root.left,val);
        else root.right=insertNode(root.right,val);
        return root;
    }

    public static int heightOfTree(TreeNode root)
    {
        if(root==null) return -1; 
        return 1+Math.max(heightOfTree(root.left),heightOfTree(root.right));
    }


    //Full Binary Tree is a tree in which every node other than the leaf nodes has two children.
    public static boolean FullBinaryTree(TreeNode root)
    {
        if(root==null) return true;
        return (((root.left==null && root.right==null)||(root.left!=null && root.right!=null)) && FullBinaryTree(root.left) && FullBinaryTree(root.right));
    }

    //Complete Binary Tree is a binary tree in which every level, except possibly the last, is completely filled, and all nodes are as far left as possible.
    public static boolean CBT(TreeNode root)
    {
        if(root==null) return true;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean foundNull=false;
        while(!q.isEmpty())
        {
            TreeNode node=q.poll();
            if(node==null) foundNull=true;
            else
            {
                if(foundNull) return false;
                q.offer(node.left);
                q.offer(node.right);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0)
        {
            int n=sc.nextInt();
            TreeNode root=null;
            int val=sc.nextInt();
            root=insertNode(root,val);
            TreeNode temp=root;
            for(int i=1;i<n;i++)
            {
                val=sc.nextInt();
                temp=insertNode(temp,val);
            }
            System.out.println("Preorder, Inorder and Postorder Traversals are: ");
            preorder(root);
            System.out.println();
            inorder(root);
            System.out.println();
            postorder(root);
            System.out.println();
            System.out.println("Full Binary Tree"+(FullBinaryTree(root)?"True":"False"));
            System.out.println("Complete Binary Tree"+(CBT(root)?"True":"False"));
            System.out.println("Height of the tree is: "+heightOfTree(root));
        }
        sc.close();
    }
}
