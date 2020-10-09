/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static int height(Node root) {
        int height=-1;
    
        if(root==null){
            return height++;
        }
        return Math.max(height(root.left), height(root.right)) +1;
    }