class Solution {
    public Node sortedArrayToBST(int[] nums) {
        // Code here
 
        if (nums == null || nums.length == 0) {
            return null;
        }
        return convert(nums, 0, nums.length - 1);
    }

    private Node convert(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        Node node = new Node(nums[mid]);
        node.left = convert(nums, left, mid - 1);
        node.right = convert(nums, mid + 1, right);
        return node;
    

    }
}
