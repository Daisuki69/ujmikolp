package Df;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yf.d f1128a;

    public d() {
        this.f1128a = new yf.d();
    }

    @Override // Df.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public yf.d c() {
        return this.f1128a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return this.f1128a.equals(((d) obj).f1128a);
        }
        return false;
    }

    public int hashCode() {
        return this.f1128a.hashCode();
    }

    public d(yf.d dVar) {
        this.f1128a = dVar;
    }
}
