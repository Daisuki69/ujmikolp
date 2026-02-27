package bg;

import ag.AbstractC0693c;
import android.content.Context;
import cj.C1112C;
import java.util.ArrayList;

/* JADX INFO: renamed from: bg.M, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0974M extends AbstractC0693c {
    public static final C0960E e;
    public static final C0960E f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0960E f8822g;
    public static final C0960E h;
    public final ArrayList c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0965G0 f8823d;

    static {
        C1112C c1112c = C1112C.f9377a;
        e = new C0960E(1, c1112c, c1112c, 0, 0, 120);
        f = new C0960E(2, c1112c, c1112c, 0, 0, 120);
        f8822g = new C0960E(3, c1112c, c1112c, 0, 0, 120);
        h = new C0960E(4, c1112c, c1112c, 0, 0, 120);
    }

    public C0974M(Context context, ArrayList arrayList, C0965G0 c0965g0) {
        super(context, 1);
        this.c = arrayList;
        this.f8823d = c0965g0;
    }

    @Override // ag.AbstractC0693c
    public final Xf.a g() {
        return new C1022z(this.f7197a, this.c, this.f8823d);
    }
}
