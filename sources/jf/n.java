package jf;

import ef.AbstractRunnableC1438a;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends AbstractRunnableC1438a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17778b;
    public final /* synthetic */ of.e c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17779d;
    public final /* synthetic */ k e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k kVar, Object[] objArr, int i, of.e eVar, int i4) {
        super("OkHttp %s Push Data[%s]", objArr);
        this.e = kVar;
        this.f17778b = i;
        this.c = eVar;
        this.f17779d = i4;
    }

    @Override // ef.AbstractRunnableC1438a
    public final void a() {
        try {
            mg.c cVar = this.e.j;
            of.e eVar = this.c;
            int i = this.f17779d;
            if (cVar == null) {
                throw null;
            }
            eVar.r(i);
            this.e.f17772t.b(this.f17778b, 6);
            synchronized (this.e) {
                this.e.f17774v.remove(Integer.valueOf(this.f17778b));
            }
        } catch (IOException unused) {
        }
    }
}
