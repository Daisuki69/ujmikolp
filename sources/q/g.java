package q;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends A.c {
    public final /* synthetic */ A.c c;

    public g(A.c cVar) {
        this.c = cVar;
    }

    @Override // A.c
    public final Object a(A.b bVar) {
        Float f = (Float) this.c.f15b;
        if (f == null) {
            return null;
        }
        return Float.valueOf(f.floatValue() * 2.55f);
    }
}
