package bg;

import ag.AbstractC0693c;
import android.content.Context;
import cj.C1112C;

/* JADX INFO: renamed from: bg.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1000g0 extends AbstractC0693c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0960E f8996d;
    public static final C0960E e;
    public static final C0960E f;
    public final C0965G0 c;

    static {
        C1112C c1112c = C1112C.f9377a;
        f8996d = new C0960E(1, c1112c, c1112c, 0, 0, 120);
        e = new C0960E(2, c1112c, c1112c, 0, 0, 120);
        f = new C0960E(3, c1112c, c1112c, 0, 0, 120);
    }

    public C1000g0(Context context, C0965G0 c0965g0) {
        super(context, 1);
        this.c = c0965g0;
    }

    @Override // ag.AbstractC0693c
    public final Xf.a g() {
        return new C1004i0(this.f7197a, this.c);
    }
}
