package u;

import android.graphics.Path;
import n.s;
import t.C2264a;
import v.AbstractC2327b;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements InterfaceC2291b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path.FillType f20217b;
    public final C2264a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2264a f20218d;
    public final C2264a e;
    public final C2264a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f20219g;
    public final boolean h;

    public d(String str, int i, Path.FillType fillType, C2264a c2264a, C2264a c2264a2, C2264a c2264a3, C2264a c2264a4, boolean z4) {
        this.f20216a = i;
        this.f20217b = fillType;
        this.c = c2264a;
        this.f20218d = c2264a2;
        this.e = c2264a3;
        this.f = c2264a4;
        this.f20219g = str;
        this.h = z4;
    }

    @Override // u.InterfaceC2291b
    public final p.c a(s sVar, AbstractC2327b abstractC2327b) {
        return new p.h(sVar, abstractC2327b, this);
    }
}
