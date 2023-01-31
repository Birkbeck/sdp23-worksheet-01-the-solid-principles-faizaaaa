abstract sealed class Apartment  permits PenthouseSuite {
    int squareFootage;
    int numberOfBedrooms;

    abstract void setSquareFootage(int sqft);
}
