package jf;

import ef.AbstractRunnableC1438a;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends AbstractRunnableC1438a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17750b;
    public final /* synthetic */ int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f17751d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, Object[] objArr, int i, int i4) {
        super("OkHttp %s stream %d", objArr);
        this.f17751d = kVar;
        this.f17750b = i;
        this.c = i4;
    }

    @Override // ef.AbstractRunnableC1438a
    public final void a() {
        k kVar = this.f17751d;
        try {
            kVar.f17772t.b(this.f17750b, this.c);
        } catch (IOException e) {
            kVar.f(2, 2, e);
        }
    }
}
