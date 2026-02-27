package u;

import n.s;
import t.C2264a;
import v.AbstractC2327b;

/* JADX INFO: renamed from: u.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2290a implements InterfaceC2291b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t.e f20212b;
    public final C2264a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20213d;
    public final boolean e;

    public C2290a(String str, t.e eVar, C2264a c2264a, boolean z4, boolean z5) {
        this.f20211a = str;
        this.f20212b = eVar;
        this.c = c2264a;
        this.f20213d = z4;
        this.e = z5;
    }

    @Override // u.InterfaceC2291b
    public final p.c a(s sVar, AbstractC2327b abstractC2327b) {
        return new p.f(sVar, abstractC2327b, this);
    }
}
