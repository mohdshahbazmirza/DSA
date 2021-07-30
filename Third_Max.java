<<<<<<< HEAD
class Solution {
    public int thirdMax(int[] nums) {
	
		// taking long data type since array can contain Integer.MIN_VALUE
        long max = Long.MIN_VALUE, sMax = Long.MIN_VALUE, tMax = Long.MIN_VALUE;
        for (int i : nums) {
            if (i > max) {
                tMax = sMax;
                sMax = max;
                max = i;
            } else if (i > sMax && i != max) {
                tMax = sMax;
                sMax = i;
            } else if (i > tMax && i != sMax && i != max) {
                tMax = i;
            }
        }
		
		// if thirdMax was not updated, return the first Max
		
        return tMax == Long.MIN_VALUE ? (int) max : (int) tMax;
    }
=======
class Solution {
    public int thirdMax(int[] nums) {
	
		// taking long data type since array can contain Integer.MIN_VALUE
        long max = Long.MIN_VALUE, sMax = Long.MIN_VALUE, tMax = Long.MIN_VALUE;
        for (int i : nums) {
            if (i > max) {
                tMax = sMax;
                sMax = max;
                max = i;
            } else if (i > sMax && i != max) {
                tMax = sMax;
                sMax = i;
            } else if (i > tMax && i != sMax && i != max) {
                tMax = i;
            }
        }
		
		// if thirdMax was not updated, return the first Max
		
        return tMax == Long.MIN_VALUE ? (int) max : (int) tMax;
    }
>>>>>>> 981fe1134243d0fd2572999c650eaa95bcb64655
}