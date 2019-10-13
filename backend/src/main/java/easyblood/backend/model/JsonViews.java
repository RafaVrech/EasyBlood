package easyblood.backend.model;

public class JsonViews {

    public interface SummaryView {}

    public interface CustomerView extends SummaryView {}

    public interface ManagerView extends CustomerView {}

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
