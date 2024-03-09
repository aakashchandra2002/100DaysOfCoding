import java.util.Scanner;

public class ConcertTicket {
    public static void main(String[] args) {
        // Replace this with the actual 32-bit unsigned integer value
        Scanner sc = new Scanner(System.in);
        long test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            long n = sc.nextLong();

            // Reverse the bits
            long reversedBits = reverseBits(n);

            // Use the reversed bits as the ticket price
            long ticketPrice = reversedBits;

            // Print the result
            System.out.println("Original number: " + n);
            System.out.println("Reversed bits: " + reversedBits);
            System.out.println("Ticket price: " + ticketPrice);
        }
    }

    // Function to reverse the bits of a 32-bit unsigned integer
    public static long reverseBits(long n) {
        long result = 0;
        int bitCount = 32;

        while (bitCount > 0) {
            result = (result << 1) | (n & 1);
            n >>= 1;
            bitCount--;
        }

        return result;
    }
}
