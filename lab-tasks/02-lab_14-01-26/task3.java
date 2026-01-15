class MetroTicket{
    String name, source, destination, seatClass;
    boolean roundTrip;
    int discount;

    //constructor 1: name, source, destination
    MetroTicket(String name, String source, String destination) {
        this.name = name;
        this.source = source;
        this.destination = destination;
    }

    //constructor 2: name, source, destination, roundTrip
    MetroTicket(String name, String source, String destination, boolean roundTrip) {
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.roundTrip = roundTrip;

    }

    //constructor 3: name, source, destination, roundTrip, seatClass
    MetroTicket(String name, String source, String destination, boolean roundTrip, String seatClass) {
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.roundTrip = roundTrip;
        this.seatClass = "Premium".equals(seatClass) ? "Premium" : "Regular";

    }

    //constructor 4: name, source, destination, roundTrip, seatClass, discound
    MetroTicket(String name, String source, String destination, boolean roundTrip, String seatClass, int discount) {
        this.name = name;
        this.source = source;
        this.destination = destination;

        this.roundTrip = roundTrip;
        this.seatClass = seatClass;
        this.discountCode = (discountCode == null) ? "" : discountCode;
    }

    double calculateFare() {
        double fare = 0.0;

        if (roundTrip) {
            if (seatClass.equalsIgnoreCase("Regular")) {
                fare = 180;
            } else {
                fare = 270;
            }
        } else {
            if (seatClass.equalsIgnoreCase("Regular")) {
                fare = 100;
            } else {
                fare = 150;
            }
        }
        if (discountCode.("DIS10")) {
            fare = fare * 0.9;
        }

        return fare;
    }

    void displayTicketDetails() {
        System.out.println("Passenger Name: " + name);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Trip Type: " + Trip);
        System.out.println("Seat Class: " + seatClass);
        System.out.println("Fare: " + fare);
    }
}


public class task3 {
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
