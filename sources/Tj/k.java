package Tj;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements Pj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f5869a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f5870b = new p("kotlin.Long", Rj.b.f);

    @Override // Pj.a
    public final Object a(N.e eVar) {
        return Long.valueOf(eVar.m());
    }

    @Override // Pj.a
    public final void c(Vj.h hVar, Object obj) {
        hVar.e(((Number) obj).longValue());
    }

    @Override // Pj.a
    public final Rj.d d() {
        return f5870b;
    }
}
