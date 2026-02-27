package jf;

import ef.AbstractRunnableC1438a;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends AbstractRunnableC1438a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17775b = 1;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(j jVar, Object[] objArr) {
        super("OkHttp %s settings", objArr);
        this.c = jVar;
    }

    @Override // ef.AbstractRunnableC1438a
    public final void a() {
        switch (this.f17775b) {
            case 0:
                k kVar = (k) this.c;
                kVar.getClass();
                try {
                    kVar.f17772t.f(2, 0, false);
                } catch (IOException e) {
                    kVar.f(2, 2, e);
                    return;
                }
                break;
            default:
                k kVar2 = (k) ((j) this.c).f17758d;
                kVar2.f17761b.a(kVar2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar, Object[] objArr) {
        super("OkHttp %s ping", objArr);
        this.c = kVar;
    }
}
