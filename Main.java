import java.util.*;
//standard tree template for insertion
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
public class Main 
{
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
            preorder(root);
            System.out.println();
            inorder(root);
            System.out.println();
            postorder(root);
            System.out.println();
        }
        sc.close();
    }
}