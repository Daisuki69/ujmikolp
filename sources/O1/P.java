package O1;

/* JADX INFO: loaded from: classes2.dex */
public final class P extends AbstractC0498a {
    public final S c;

    public P(int i, S s9) {
        super(s9.size(), i);
        this.c = s9;
    }

    @Override // O1.AbstractC0498a
    public final Object a(int i) {
        return this.c.get(i);
    }
}
