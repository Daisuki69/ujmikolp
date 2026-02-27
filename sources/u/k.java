package u;

import android.graphics.Path;
import dOYHB6.tiZVw8.numX49;
import n.s;
import t.C2264a;
import v.AbstractC2327b;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements InterfaceC2291b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path.FillType f20241b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2264a f20242d;
    public final C2264a e;
    public final boolean f;

    public k(String str, boolean z4, Path.FillType fillType, C2264a c2264a, C2264a c2264a2, boolean z5) {
        this.c = str;
        this.f20240a = z4;
        this.f20241b = fillType;
        this.f20242d = c2264a;
        this.e = c2264a2;
        this.f = z5;
    }

    @Override // u.InterfaceC2291b
    public final p.c a(s sVar, AbstractC2327b abstractC2327b) {
        return new p.g(sVar, abstractC2327b, this);
    }

    public final String toString() {
        return androidx.camera.core.impl.a.q(new StringBuilder(numX49.tnTj78("b2zi")), this.f20240a, '}');
    }
}
