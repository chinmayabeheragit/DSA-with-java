import java.util.*;
class DecBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        String bin = "";
        
        // Step 1: Convert to binary
        while (no != 0) {
            bin = (no & 1) + bin; // Append the binary digit
            no = no >> 1; // Right-shift the number
        }

        // Step 2: Toggle bits
        bin = bin.replaceAll("1", "2");
        bin = bin.replaceAll("0", "1");
        bin = bin.replaceAll("2", "0");

        // Step 3: Convert back to decimal
        int res = Integer.parseInt(bin, 2);
        System.out.println(res);
    }
}
