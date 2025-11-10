public final class Storage<T> {
    private final T value;

    public Storage(T value) {
        this.value = value;
    }

    public T getValueOrDefault(T alternative) {
        return value != null ? value : alternative;
    }

    @Override
    public String toString() {
        return value != null ? value.toString() : "null";
    }
}
