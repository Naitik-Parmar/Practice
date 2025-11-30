public class Q7FindRightMostBit {
    public static void main(String[] args) {
        int n = 10;
        int pos = 1;

        // Loop through each bit until we find a set bit
        while ((n & 1) == 0) {
            // If the current bit is not set, shift n to the right

            n = n >> 1;
            System.out.println(n);
            // Increment the position
            pos++;
        }

        // Print the position of the rightmost set bit
        System.out.println(pos);
    }
}