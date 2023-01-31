import java.util.ArrayList;
import java.util.List;

public class Board {
    List<String> spots;

    public Board() {
        this.spots = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            this.spots.add(String.valueOf(i));
        }
    }
}

class StoreBoard{
    Board b;
    StoreBoard(Board b) {
        this.b=b;
    }
    public List<String> firstRow() {
        List<String> firstRow = new ArrayList<>();
        firstRow.add(b.spots.get(0));
        firstRow.add(b.spots.get(1));
        firstRow.add(b.spots.get(2));
        return firstRow;
    }

    public List<String> secondRow() {
        List<String> secondRow = new ArrayList<>();
        secondRow.add(b.spots.get(3));
        secondRow.add(b.spots.get(4));
        secondRow.add(b.spots.get(5));
        return secondRow;
    }

    public List<String> thirdRow() {
        List<String> thirdRow = new ArrayList<>();
        thirdRow.add(b.spots.get(6));
        thirdRow.add(b.spots.get(7));
        thirdRow.add(b.spots.get(8));
        return thirdRow;
    }

}
class DisplayBoard {

    Board b;

    DisplayBoard(Board b){
        this.b = b;
    }

    // Poor code — can you improve this?
    public void display() {
        String formattedFirstRow = b.spots.get(0) + " | " + b.spots.get(1) + " | " + b.spots.get(2) + "\n"
                + b.spots.get(3) + " | " + b.spots.get(4) + " | " + b.spots.get(5) + "\n"
                + b.spots.get(6) + " | " + b.spots.get(7) + " | " + b.spots.get(8);
        System.out.print(formattedFirstRow);
    }
}