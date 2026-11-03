package org.example;

public class Ticket {
    private String flightNumber;
    private TicketType type;

    public Ticket() {
        this.flightNumber = "Неизвестно";
        this.type = TicketType.ECONOMY;
    }

    public Ticket(String flightNumber, TicketType type) {
        this.flightNumber = flightNumber;
        this.type = type;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public TicketType getType() {
        return type;
    }

    public void setType(TicketType type) {
        this.type = type;
    }

    public static void main(String[] args) {
        Ticket[] tickets = new Ticket[6];
        tickets[0] = new Ticket("SU-100", TicketType.ECONOMY);
        tickets[1] = new Ticket("SU-200", TicketType.BUSINESS);
        tickets[2] = new Ticket("SU-300", TicketType.FIRST_CLASS);
        tickets[3] = new Ticket("SU-400", TicketType.BUSINESS);
        tickets[4] = new Ticket("SU-500", TicketType.ECONOMY);
        tickets[5] = new Ticket("SU-600", TicketType.BUSINESS);

        System.out.println("Билеты бизнес-класса (BUSINESS):");
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i].getType() == TicketType.BUSINESS) {
                System.out.println("Рейс: " + tickets[i].getFlightNumber()
                        + ", тип: " + tickets[i].getType());
            }
        }
    }
}