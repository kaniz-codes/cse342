class MetroTicket {
    String name, source, destination, seatClass, discountCode;
    boolean roundTrip;

    // Constructor 1: name, source, destination
    MetroTicket(String name, String source, String destination) {
        this(name, source, destination, false, "Regular", "");
    }

    // Constructor 2: name, source, destination, roundTrip
    MetroTicket(String name, String source, String destination, boolean roundTrip) {
        this(name, source, destination, roundTrip, "Regular", "");
    }

    // Constructor 3: name, source, destination, roundTrip, seatClass
    MetroTicket(String name, String source, String destination, boolean roundTrip, String seatClass) {
        this(name, source, destination, roundTrip, seatClass, "");
    }

    // Constructor 4: name, source, destination, roundTrip, seatClass, discountCode
    MetroTicket(String name, String source, String destination, boolean roundTrip, String seatClass, String discountCode) {
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.roundTrip = roundTrip;

        // Validate seat class (default to Regular if invalid)
        this.seatClass = "Premium".equalsIgnoreCase(seatClass) ? "Premium" : "Regular";

        // Handle null discount code
        this.discountCode = (discountCode == null) ? "" : discountCode;
    }

    double calculateFare() {
        double fare;

        if (roundTrip) {
            fare = seatClass.equals("Premium") ? 270 : 180;
        } else {
            fare = seatClass.equals("Premium") ? 150 : 100;
        }

        // Apply discount if code is DIS10
        if ("DIS10".equalsIgnoreCase(discountCode)) {
            fare *= 0.9; // 10% off
        }

        return fare;
    }

    void displayTicketDetails() {
        System.out.println("Passenger Name: " + name);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Trip Type: " + (roundTrip ? "Round Trip" : "One-way"));
        System.out.println("Seat Class: " + seatClass);
        System.out.println("Discount Code: " + (discountCode.isEmpty() ? "None" : discountCode));
        System.out.println("Fare: " + calculateFare());
        System.out.println("--------------------------------");
    }
}

public class Task3 {
    public static void main(String[] args) {
        MetroTicket ticket1 = new MetroTicket("Kaniz", "Station A", "Station B");
        MetroTicket ticket2 = new MetroTicket("Fatema", "Station C", "Station D", true);
        MetroTicket ticket3 = new MetroTicket("Kobita", "Station E", "Station F", false, "Premium");
        MetroTicket ticket4 = new MetroTicket("Dalia", "Station G", "Station H", true, "Premium", "DIS10");

        ticket1.displayTicketDetails();
        ticket2.displayTicketDetails();
        ticket3.displayTicketDetails();
        ticket4.displayTicketDetails();
    }
}
