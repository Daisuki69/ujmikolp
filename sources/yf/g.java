package yf;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends Af.b {
    public final /* synthetic */ Af.e c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Af.e eVar, Af.e eVar2) {
        super(eVar);
        this.c = eVar2;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }
}
