package Tj;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements Pj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pj.a f5871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f5872b;

    public l(Pj.a serializer) {
        kotlin.jvm.internal.j.g(serializer, "serializer");
        this.f5871a = serializer;
        this.f5872b = new q(serializer.d());
    }

    @Override // Pj.a
    public final Object a(N.e eVar) {
        if (eVar.o()) {
            return eVar.r(this.f5871a);
        }
        return null;
    }

    @Override // Pj.a
    public final void c(Vj.h hVar, Object obj) {
        if (obj != null) {
            hVar.j(this.f5871a, obj);
        } else {
            hVar.g();
        }
    }

    @Override // Pj.a
    public final Rj.d d() {
        return this.f5872b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && l.class == obj.getClass() && kotlin.jvm.internal.j.b(this.f5871a, ((l) obj).f5871a);
    }

    public final int hashCode() {
        return this.f5871a.hashCode();
    }
}
