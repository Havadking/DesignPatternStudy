package factorymethod.others;

/**
 * @program: DesignPatternStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-05 16:22
 **/

public class Main {
    public static void main(String[] args) {
        IFactory factory1 = new UndergraduateFactory();
        IFactory factory2 = new VolunteerFactory();
        LeiFeng student = factory1.createLeiFeng();
        LeiFeng volunteer = factory2.createLeiFeng();

        student.buyRice();
        student.sweep();
        student.wash();

        volunteer.buyRice();
        volunteer.sweep();
        volunteer.wash();
    }
}
