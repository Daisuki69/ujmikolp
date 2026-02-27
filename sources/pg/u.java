package pg;

/* JADX INFO: loaded from: classes4.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f19114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19115b;
    public final v c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f19116d;

    public u(j jVar, String str) {
        this(jVar, str, E.f19095b, null);
    }

    public final void a(String str, Object obj, t tVar) {
        this.f19114a.send(this.f19115b, this.c.c(new r(str, obj)), tVar == null ? null : new C2039b(1, this, tVar));
    }

    public final void b(s sVar) {
        String str = this.f19115b;
        j jVar = this.f19114a;
        h hVar = this.f19116d;
        if (hVar != null) {
            jVar.setMessageHandler(str, sVar != null ? new C2038a(1, this, sVar) : null, hVar);
        } else {
            jVar.setMessageHandler(str, sVar != null ? new C2038a(1, this, sVar) : null);
        }
    }

    public u(j jVar, String str, v vVar, h hVar) {
        this.f19114a = jVar;
        this.f19115b = str;
        this.c = vVar;
        this.f19116d = hVar;
    }
}
