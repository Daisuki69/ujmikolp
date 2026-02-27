package Mj;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements d, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f3426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f3427b;
    public g c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3428d;
    public boolean e;
    public long f;

    public c(i iVar) {
        this.f3426a = iVar;
        a buffer = iVar.getBuffer();
        this.f3427b = buffer;
        g gVar = buffer.f3423a;
        this.c = gVar;
        this.f3428d = gVar != null ? gVar.f3433b : -1;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r5.f3433b) goto L15;
     */
    @Override // Mj.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long l(Mj.a r12, long r13) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Mj.c.l(Mj.a, long):long");
    }
}
