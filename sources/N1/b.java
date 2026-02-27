package N1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b implements j {
    public abstract boolean a(char c);

    @Override // N1.j
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
