import java.util.List;

public class FactorialTest implements FeedOfIntValues {
    private List<Integer> values;
    private int currIndex;

    public FactorialTest(List<Integer> list) {
        this.values = list;
        currIndex = -1;
    }
    public boolean hasNext() {
        if (currIndex + 1 < values.size()) {
            currIndex++;
            return true;
        }
        return false;
    }

    public int getNextIntValue() {
        return values.get(currIndex);
    }
}
