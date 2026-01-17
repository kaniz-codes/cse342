class MetroTicket {
    String name;
    String source;
    String destination;
    boolean roundTrip;
    String seatClass;
    String discountCode;

    //constructor 1: name, source, destination
    MetroTicket(String name, String source, String destination) {
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.roundTrip = false;
        this.seatClass = "Regular";
        this.discountCode = "";
    }

    //constructor 2: name, source, destination, roundTrip
    MetroTicket(String name, String source, String destination, boolean roundTrip) {
        this(name, source, destination); // call constructor 1
        this.roundTrip = roundTrip;
    }

    //constructor 3: name, source, destination, roundTrip, seatClass
    MetroTicket(String name, String source, String destination, boolean roundTrip, String seatClass) {
        this(name, source, destination, roundTrip); // call constructor 2
        if (seatClass != null && seatClass.equalsIgnoreCase("Premium")) {
            this.seatClass = "Premium";
        } else {
            this.seatClass = "Regular";
        }
    }

    //constructor 4: name, source, destination, roundTrip, seatClass, discountCode
    MetroTicket(String name, String source, String destination, boolean roundTrip, String seatClass, String discountCode) {
        this(name, source, destination, roundTrip, seatClass); // call constructor 3
        if (discountCode != null) {
            this.discountCode = discountCode;
        } else {
            this.discountCode = "";
        }
    }

    //constructor 5: name, source, destination, seatClass, discountCode (no roundTrip)
    MetroTicket(String name, String source, String destination, String seatClass, String discountCode) {
        this(name, source, destination); // call constructor 1
        if (seatClass != null && seatClass.equalsIgnoreCase("Premium")) {
            this.seatClass = "Premium";
        } else {
            this.seatClass = "Regular";
        }
        if (discountCode != null) {
            this.discountCode = discountCode;
        } else {
            this.discountCode = "";
        }
        this.roundTrip = false;
    }

    // Calculate fare
    double calculateFare() {
        double fare;
        if (this.roundTrip) {
            if (this.seatClass.equals("Premium")) {
                fare = 270;
            } else {
                fare = 180;
            }
        } else {
            if (this.seatClass.equals("Premium")) {
                fare = 150;
            } else {
                fare = 100;
            }
        }

        if ("DIS10".equalsIgnoreCase(this.discountCode)) {
            fare = fare * 0.9; // 10% discount
        }

        return fare;
    }

    // Display ticket details
    void displayTicketDetails() {
        System.out.println("Passenger Name: " + this.name);
        System.out.println("Source: " + this.source);
        System.out.println("Destination: " + this.destination);
        System.out.println("Trip Type: " + (this.roundTrip ? "Round Trip" : "One Way"));
        System.out.println("Seat Class: " + this.seatClass);
        System.out.println("Discount Code: " + (this.discountCode.isEmpty() ? "None" : this.discountCode));
        System.out.println("Fare: " + this.calculateFare());
        System.out.println("----------------------------");
    }
}

public class task3 {
    public static void main(String[] args) {

        MetroTicket t1 = new MetroTicket("Kaniz", "Station A", "Station B"); //constructor 1
        MetroTicket t2 = new MetroTicket("Fatema", "Station C", "Station D", true); //constructor 2
        MetroTicket t3 = new MetroTicket("Spider Man", "Station G", "Station H", true, "Premium", "DIS10"); //constructor 4
        MetroTicket t4 = new MetroTicket("Mr. Bean", "Station E", "Station F", true, "Premium"); //constructor 3
        MetroTicket t5 = new MetroTicket("Hiro", "Station I", "Station J", "Premium", "DIS10"); //constructor 5

        t1.displayTicketDetails();
        t2.displayTicketDetails();
        t3.displayTicketDetails();
        t4.displayTicketDetails();
        t5.displayTicketDetails();
    }
}
