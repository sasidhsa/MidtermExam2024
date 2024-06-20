package status;

import java.util.Scanner;

public class Status {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the user status code (ZERO, ONE, TWO, THREE):");
        String codeInput = in.next().toUpperCase();

        try {
            StatusCode statusCode = StatusCode.valueOf(codeInput);
            StatusUser statusUser = new StatusUser();
            statusUser.printStatusDetail(statusCode);
        } catch (IllegalArgumentException e) {
            System.out.println("NOT VALID CODE");
        }
    }
}
