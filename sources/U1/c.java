package U1;

import android.content.Context;
import b2.C0859a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements B2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5897b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.f5896a = i;
        this.f5897b = obj;
        this.c = obj2;
    }

    @Override // B2.b
    public final Object get() {
        switch (this.f5896a) {
            case 0:
                g gVar = (g) this.f5897b;
                return new G2.a((Context) this.c, gVar.g(), (y2.c) gVar.f5906d.get(y2.c.class));
            case 1:
                b2.e eVar = (b2.e) this.f5897b;
                eVar.getClass();
                C0859a c0859a = (C0859a) this.c;
                return c0859a.f.v(new Xh.b(c0859a, eVar));
            default:
                return new z2.h((Context) this.c, (String) this.f5897b);
        }
    }

    public /* synthetic */ c(Context context, String str) {
        this.f5896a = 2;
        this.c = context;
        this.f5897b = str;
    }
}
