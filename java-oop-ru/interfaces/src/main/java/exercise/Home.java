package exercise;

// BEGIN
public interface Home {
    double getArea();
    default int compareTo(Home another) {
        double thisArea = getArea();
        double otherArea = another.getArea();

        if (thisArea == otherArea) {
            return 0;
        } else if (thisArea > otherArea) {
            return 1;
        } else {
            return -1;
        }
    }
}
// END
