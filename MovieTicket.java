import java.util.Scanner;
class MovieTicket {
    String MovieName;
    double TicketPrice;
    int NumberofTickets;
    public MovieTicket(String MovieName, double TicketPrice, int NumberofTickets) {
        this.MovieName = MovieName;
        this.TicketPrice = TicketPrice;
        this.NumberofTickets = NumberofTickets;
    }
    public double calculateTotal() {
        return TicketPrice * NumberofTickets;
    }
    public double calculateDiscount() {
        if (NumberofTickets >= 5) {
            return calculateTotal() * 0.10; 
        } else {
            return 0.0;
        }
    }
    public double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }
    public void displayBill() {
        System.out.println("BOOKING BILL");
        System.out.println("MOVIE NAME: " + MovieName);
        System.out.printf("TICKET PRICE: %.2f", TicketPrice);
        System.out.println("| NUMBER OF TICKETS: " + NumberofTickets);
        System.out.printf("TOTAL AMOUNT: %.2f", calculateTotal());
        System.out.printf("| DISCOUNT: %.2f", calculateDiscount());
        System.out.printf("| FINAL AMOUNT: %.2f", calculateFinalAmount());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER MOVIE NAME: ");
         String MovieName = sc.nextLine();
        System.out.print("ENTER TICKET PRICE: ");
         double TicketPrice = sc.nextDouble();
        System.out.print("ENTER NUMBER OF TICKETS: ");
         int NumberofTickets = sc.nextInt();
        MovieTicket ticket = new MovieTicket(MovieName, TicketPrice, NumberofTickets);
        ticket.displayBill();
    }
}

