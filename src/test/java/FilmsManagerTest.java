import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {

    @Test
    public void addFiveFilms() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Movie I");
        manager.addFilm("Movie II");
        manager.addFilm("Movie III");
        manager.addFilm("Movie IV");
        manager.addFilm("Movie V");

        String[] actual = manager.findAll();
        String[] expected = { "Movie I", "Movie II", "Movie III", "Movie IV", "Movie V" };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addOneFilms() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Movie I");

        String[] actual = manager.findAll();
        String[] expected = { "Movie I" };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addZeroFilms() {
        FilmsManager manager = new FilmsManager();

        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void returnReversFive() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Movie I");
        manager.addFilm("Movie II");
        manager.addFilm("Movie III");
        manager.addFilm("Movie IV");
        manager.addFilm("Movie V");

        String[] actual = manager.findLast();
        String[] expected = { "Movie V", "Movie IV", "Movie III", "Movie II", "Movie I" };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void returnReversThree() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Movie I");
        manager.addFilm("Movie II");
        manager.addFilm("Movie III");

        String[] actual = manager.findLast();
        String[] expected = { "Movie III", "Movie II", "Movie I" };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void returnReversSeven() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Movie I");
        manager.addFilm("Movie II");
        manager.addFilm("Movie III");
        manager.addFilm("Movie IV");
        manager.addFilm("Movie V");
        manager.addFilm("Movie VI");
        manager.addFilm("Movie VII");

        String[] actual = manager.findLast();
        String[] expected = { "Movie VII", "Movie VI", "Movie V", "Movie IV", "Movie III" };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void returnReversZero() {
        FilmsManager manager = new FilmsManager();

        String[] actual = manager.findLast();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFiveFilmsFromTheLimit() {
        FilmsManager manager = new FilmsManager(5);

        manager.addFilm("Movie I");
        manager.addFilm("Movie II");
        manager.addFilm("Movie III");
        manager.addFilm("Movie IV");
        manager.addFilm("Movie V");

        String[] actual = manager.findAll();
        String[] expected = { "Movie I", "Movie II", "Movie III", "Movie IV", "Movie V" };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addOneFilmsFromTheLimit() {
        FilmsManager manager = new FilmsManager(5);

        manager.addFilm("Movie I");

        String[] actual = manager.findAll();
        String[] expected = { "Movie I" };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addZeroFilmsFromTheLimit() {
        FilmsManager manager = new FilmsManager(5);

        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void returnReversFiveFromTheLimit() {
        FilmsManager manager = new FilmsManager(5);

        manager.addFilm("Movie I");
        manager.addFilm("Movie II");
        manager.addFilm("Movie III");
        manager.addFilm("Movie IV");
        manager.addFilm("Movie V");

        String[] actual = manager.findLast();
        String[] expected = { "Movie V", "Movie IV", "Movie III", "Movie II", "Movie I" };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void returnReversThreeFromTheLimit() {
        FilmsManager manager = new FilmsManager(5);

        manager.addFilm("Movie I");
        manager.addFilm("Movie II");
        manager.addFilm("Movie III");

        String[] actual = manager.findLast();
        String[] expected = { "Movie III", "Movie II", "Movie I" };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void returnReversSevenFromTheLimit() {
        FilmsManager manager = new FilmsManager(5);

        manager.addFilm("Movie I");
        manager.addFilm("Movie II");
        manager.addFilm("Movie III");
        manager.addFilm("Movie IV");
        manager.addFilm("Movie V");
        manager.addFilm("Movie VI");
        manager.addFilm("Movie VII");

        String[] actual = manager.findLast();
        String[] expected = { "Movie VII", "Movie VI", "Movie V", "Movie IV", "Movie III" };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void returnReversZeroFromTheLimit() {
        FilmsManager manager = new FilmsManager(5);

        String[] actual = manager.findLast();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }
}
