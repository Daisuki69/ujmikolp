package N1;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3489a = new a();

    @Override // N1.i
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // N1.i
    public final boolean b() {
        return false;
    }

    @Override // N1.i
    public final Object c(Enum r1) {
        return r1;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
