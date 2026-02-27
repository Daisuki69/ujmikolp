package pg;

/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f19108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19109b;
    public final E c;

    public n(j jVar, String str) {
        E e = E.f19095b;
        this.f19108a = jVar;
        this.f19109b = str;
        this.c = e;
    }

    public final void a(m mVar) {
        this.f19108a.setMessageHandler(this.f19109b, mVar == null ? null : new U8.c(this, mVar));
    }
}
