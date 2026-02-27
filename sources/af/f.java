package af;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R4.i f7149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f7150b;

    public f(R4.i iVar, Runnable runnable) {
        this.f7149a = iVar;
        this.f7150b = runnable;
    }

    public final Integer a() {
        R4.i iVar = this.f7149a;
        if (iVar != null) {
            return Integer.valueOf(((C0690e) iVar.f5470b).c);
        }
        return null;
    }
}
