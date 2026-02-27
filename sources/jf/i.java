package jf;

import ef.AbstractRunnableC1438a;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends AbstractRunnableC1438a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17755b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17756d;
    public final /* synthetic */ k e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, int i, int i4) {
        super("OkHttp %s ping %08x%08x", kVar.f17762d, Integer.valueOf(i), Integer.valueOf(i4));
        this.e = kVar;
        this.f17755b = true;
        this.c = i;
        this.f17756d = i4;
    }

    @Override // ef.AbstractRunnableC1438a
    public final void a() {
        int i = this.c;
        int i4 = this.f17756d;
        boolean z4 = this.f17755b;
        k kVar = this.e;
        kVar.getClass();
        try {
            kVar.f17772t.f(i, i4, z4);
        } catch (IOException e) {
            kVar.f(2, 2, e);
        }
    }
}
