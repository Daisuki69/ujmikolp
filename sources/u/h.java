package u;

import n.s;
import t.C2265b;
import v.AbstractC2327b;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements InterfaceC2291b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20232b;
    public final C2265b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t.e f20233d;
    public final C2265b e;
    public final C2265b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C2265b f20234g;
    public final C2265b h;
    public final C2265b i;
    public final boolean j;

    public h(String str, int i, C2265b c2265b, t.e eVar, C2265b c2265b2, C2265b c2265b3, C2265b c2265b4, C2265b c2265b5, C2265b c2265b6, boolean z4) {
        this.f20231a = str;
        this.f20232b = i;
        this.c = c2265b;
        this.f20233d = eVar;
        this.e = c2265b2;
        this.f = c2265b3;
        this.f20234g = c2265b4;
        this.h = c2265b5;
        this.i = c2265b6;
        this.j = z4;
    }

    @Override // u.InterfaceC2291b
    public final p.c a(s sVar, AbstractC2327b abstractC2327b) {
        return new p.n(sVar, abstractC2327b, this);
    }
}
