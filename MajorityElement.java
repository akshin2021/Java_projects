public class MajorityElement {

    public static int findMajorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        // Find the potential candidate for the majority element
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Check if the potential candidate is the majority element
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        // Return the majority element if it exists, otherwise -1
        if (count > nums.length / 2) {
            return candidate;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 5, 5, 5, 5};
        int result = findMajorityElement(nums);
        System.out.println(result);
    }
}
