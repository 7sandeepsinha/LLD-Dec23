package advancedConcepts.collections;

public class Count {
    public int val;

    public Count(int val) {
        this.val = val;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Count count = (Count) o;
        return val == count.val;
    }
}
