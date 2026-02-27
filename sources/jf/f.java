package jf;

import ef.AbstractRunnableC1438a;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends AbstractRunnableC1438a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17752b;
    public final /* synthetic */ long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f17753d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, Object[] objArr, int i, long j) {
        super("OkHttp Window Update %s stream %d", objArr);
        this.f17753d = kVar;
        this.f17752b = i;
        this.c = j;
    }

    @Override // ef.AbstractRunnableC1438a
    public final void a() {
        k kVar = this.f17753d;
        try {
            kVar.f17772t.i(this.f17752b, this.c);
        } catch (IOException e) {
            kVar.f(2, 2, e);
        }
    }
}
