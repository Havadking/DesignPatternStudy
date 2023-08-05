package factorymethod;

/**
 * @program: DesignPatternStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-05 16:17
 **/

public class VolunteerFactory extends IFactory {

    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
