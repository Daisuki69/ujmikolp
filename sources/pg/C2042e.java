package pg;

/* JADX INFO: renamed from: pg.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2042e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f19103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19104b;
    public final q c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f19105d;

    public C2042e(j jVar, String str, q qVar, h hVar) {
        this.f19103a = jVar;
        this.f19104b = str;
        this.c = qVar;
        this.f19105d = hVar;
    }

    public final void a(Object obj, InterfaceC2041d interfaceC2041d) {
        this.f19103a.send(this.f19104b, this.c.encodeMessage(obj), interfaceC2041d == null ? null : new C2039b(0, this, interfaceC2041d));
    }

    public final void b(InterfaceC2040c interfaceC2040c) {
        String str = this.f19104b;
        j jVar = this.f19103a;
        h hVar = this.f19105d;
        if (hVar != null) {
            jVar.setMessageHandler(str, interfaceC2040c != null ? new C2038a(0, this, interfaceC2040c) : null, hVar);
        } else {
            jVar.setMessageHandler(str, interfaceC2040c != null ? new C2038a(0, this, interfaceC2040c) : null);
        }
    }
}
