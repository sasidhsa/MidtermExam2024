package status;

public class StatusUser {

    public void printStatusDetail(StatusCode code) {
        System.out.println("User status: " + code.getStatusMessage());
    }
}
