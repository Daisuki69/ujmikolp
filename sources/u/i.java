package u;

import dOYHB6.tiZVw8.numX49;
import n.s;
import p.p;
import t.C2264a;
import t.C2265b;
import v.AbstractC2327b;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements InterfaceC2291b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20235a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20236b;
    public final C2265b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20237d;
    public final t.e e;
    public final Object f;

    public i(String str, C2265b c2265b, C2265b c2265b2, t.d dVar, boolean z4) {
        this.f20236b = str;
        this.c = c2265b;
        this.e = c2265b2;
        this.f = dVar;
        this.f20237d = z4;
    }

    @Override // u.InterfaceC2291b
    public final p.c a(s sVar, AbstractC2327b abstractC2327b) {
        switch (this.f20235a) {
            case 0:
                return new p.o(sVar, abstractC2327b, this);
            default:
                return new p(sVar, abstractC2327b, this);
        }
    }

    public String toString() {
        switch (this.f20235a) {
            case 0:
                return numX49.tnTj78("b2zQ") + this.e + numX49.tnTj78("b2zt") + ((C2264a) this.f) + '}';
            default:
                return super.toString();
        }
    }

    public i(String str, t.e eVar, C2264a c2264a, C2265b c2265b, boolean z4) {
        this.f20236b = str;
        this.e = eVar;
        this.f = c2264a;
        this.c = c2265b;
        this.f20237d = z4;
    }
}
