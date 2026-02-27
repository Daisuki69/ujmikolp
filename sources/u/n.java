package u;

import java.util.ArrayList;
import n.s;
import p.r;
import t.C2264a;
import t.C2265b;
import v.AbstractC2327b;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements InterfaceC2291b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2265b f20249b;
    public final ArrayList c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2264a f20250d;
    public final C2264a e;
    public final C2265b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f20251g;
    public final int h;
    public final float i;
    public final boolean j;

    public n(String str, C2265b c2265b, ArrayList arrayList, C2264a c2264a, C2264a c2264a2, C2265b c2265b2, int i, int i4, float f, boolean z4) {
        this.f20248a = str;
        this.f20249b = c2265b;
        this.c = arrayList;
        this.f20250d = c2264a;
        this.e = c2264a2;
        this.f = c2265b2;
        this.f20251g = i;
        this.h = i4;
        this.i = f;
        this.j = z4;
    }

    @Override // u.InterfaceC2291b
    public final p.c a(s sVar, AbstractC2327b abstractC2327b) {
        return new r(sVar, abstractC2327b, this);
    }
}
