package Tj;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements Pj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f5865a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f5866b = new p("kotlin.Int", Rj.b.e);

    @Override // Pj.a
    public final Object a(N.e eVar) {
        return Integer.valueOf(eVar.k());
    }

    @Override // Pj.a
    public final void c(Vj.h hVar, Object obj) {
        hVar.c(((Number) obj).intValue());
    }

    @Override // Pj.a
    public final Rj.d d() {
        return f5866b;
    }
}
