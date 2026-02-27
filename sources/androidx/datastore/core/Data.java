package androidx.datastore.core;

/* JADX INFO: loaded from: classes.dex */
public final class Data<T> extends State<T> {
    private final int hashCode;
    private final T value;

    public Data(T t5, int i, int i4) {
        super(i4, null);
        this.value = t5;
        this.hashCode = i;
    }

    public final void checkHashCode() {
        T t5 = this.value;
        if ((t5 != null ? t5.hashCode() : 0) != this.hashCode) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    public final int getHashCode() {
        return this.hashCode;
    }

    public final T getValue() {
        return this.value;
    }
}
