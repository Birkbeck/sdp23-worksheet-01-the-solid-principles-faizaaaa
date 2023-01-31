import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitUpgraderTest {
    @Test
    public void testUnitUpgraderIncreasesSquareFootageOfPenthouse() {
        PenthouseSuite penthouse = new PenthouseSuite();
        penthouse.setSquareFootage(1500);


        assertEquals(1540, penthouse.squareFootage);
    }

    @Test
    public void testUnitUpgraderAddsBedroomToApartment() {
        PenthouseSuite penthouse = new PenthouseSuite();

        assertEquals(5, penthouse.numberOfBedrooms);
    }

    @Test
    public void testStudioUpgraderIncreasesSquareFootageOfStudio() {
        Studio studio = new Studio();
        studio.setSquareFootage(550);
        StudioUpgrader upgrader = new StudioUpgrader();
        upgrader.upgrade(studio);

        assertEquals(590, studio.squareFootage);
    }

    @Test
    public void testStudioUpgraderDoesntAddBedroomToStudios() {
        Studio studio = new Studio();
        StudioUpgrader upgrader = new StudioUpgrader();
        upgrader.upgrade(studio);

        assertEquals(0, studio.numberOfBedrooms);
    }
}
