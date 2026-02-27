package u;

import java.util.ArrayList;
import n.s;
import t.C2264a;
import t.C2265b;
import v.AbstractC2327b;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements InterfaceC2291b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20221b;
    public final C2264a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2264a f20222d;
    public final C2264a e;
    public final C2264a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C2265b f20223g;
    public final int h;
    public final int i;
    public final float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f20224k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C2265b f20225l;
    public final boolean m;

    public e(String str, int i, C2264a c2264a, C2264a c2264a2, C2264a c2264a3, C2264a c2264a4, C2265b c2265b, int i4, int i6, float f, ArrayList arrayList, C2265b c2265b2, boolean z4) {
        this.f20220a = str;
        this.f20221b = i;
        this.c = c2264a;
        this.f20222d = c2264a2;
        this.e = c2264a3;
        this.f = c2264a4;
        this.f20223g = c2265b;
        this.h = i4;
        this.i = i6;
        this.j = f;
        this.f20224k = arrayList;
        this.f20225l = c2265b2;
        this.m = z4;
    }

    @Override // u.InterfaceC2291b
    public final p.c a(s sVar, AbstractC2327b abstractC2327b) {
        return new p.i(sVar, abstractC2327b, this);
    }
}
