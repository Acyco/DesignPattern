package facade;

/**
 * @author Acyco
 * @create 2020-01-13 18:28
 */
public class Client {
    public static void main(String[] args) {
        final HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();
        homeTheaterFacade.pause();
        homeTheaterFacade.end();

    }
}
