package SOLID.LiskovSubstitution.substitution.notlsp;

public class Square extends Rectangle {

    @Override
    public void setBreadth(int breadth) {
        super.setBreadth(breadth);
        super.setLength(breadth);
    }
}
