package DSA_LeetCode;

public class sortedArrayToBST {

	public TreeNode sortedArrayToBST(int[] nums) {
		
		TreeNode node = new TreeNode(nums[nums.length / 2]);
		
		int leftNodeIndex = (nums.length / 2) - 1;
		int rightNodeIndex = (nums.length / 2) + 1;
		
		TreeNode leftNode = build(nums, 0, leftNodeIndex);
		TreeNode rightNode = build(nums, rightNodeIndex, nums.length - 1);
		
		node.left = leftNode;
		node.right = rightNode;
		return node;
	}

	private TreeNode build(int[] nums, int left, int right) {

		if (left > right) {
			return null;
		}
		
		int middle = (left + right) / 2;
		
		TreeNode node = new TreeNode(nums[middle]);
		
		node.left = build(nums, left, middle - 1);
		node.right = build(nums, middle + 1, right);
		return node;
	}
	
	public static void main(String[] args) {
	    int[] nums = {-10, -3, 0, 5, 9};
	    sortedArrayToBST solution = new sortedArrayToBST();
	    TreeNode root = solution.sortedArrayToBST(nums);
	    printPreorder(root);
	}

	private static void printPreorder(TreeNode node) {
	    if (node == null) {
	        return;
	    }
	    System.out.print(node.val + " ");
	    printPreorder(node.left);
	    printPreorder(node.right);
	}
	
}