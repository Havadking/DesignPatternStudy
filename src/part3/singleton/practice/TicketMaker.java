package part3.singleton.practice;

/**
 * @program: DesignPatternStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-08 09:49
 **/

public class TicketMaker {
    private static TicketMaker ticketMaker = new TicketMaker();
    private int ticket = 1000;

    public TicketMaker() {
    }
    public static TicketMaker getInstance() {
        return ticketMaker;
    }
    public synchronized int getNextTicketNumber() {
        return ticket++;
    }
}
