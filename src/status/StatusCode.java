/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package status;

/**
 *
 * @author SARANYA NAIR SASIDHARAN
 */
public enum StatusCode {
    ZERO("REJECTED"),
    ONE("PENDING"),
    TWO("PROCESSING"),
    THREE("APPROVED");

    private final String statusMessage;

    StatusCode(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getStatusMessage() {
        return statusMessage;
    }
    
}
