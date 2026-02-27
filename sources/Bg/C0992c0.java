package bg;

import ag.AbstractC0693c;
import android.content.Context;
import cj.C1112C;
import java.util.List;

/* JADX INFO: renamed from: bg.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0992c0 extends AbstractC0693c {
    public static final C0960E e;
    public static final C0960E f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0960E f8935g;
    public static final C0960E h;
    public static final C0960E i;
    public final n0 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0965G0 f8936d;

    static {
        List listC = cj.r.c("android.permission.ACCESS_WIFI_STATE");
        C1112C fieldsToCollect = C1112C.f9377a;
        kotlin.jvm.internal.j.h(fieldsToCollect, "fieldsToCollect");
        e = new C0960E(4, fieldsToCollect, listC, 0, 0, 120);
        f = new C0960E(5, fieldsToCollect, listC, 26, 0, 112);
        f8935g = new C0960E(11, fieldsToCollect, listC, 0, 0, 120);
        h = new C0960E(12, fieldsToCollect, listC, 0, 0, 120);
        i = new C0960E(13, fieldsToCollect, listC, 23, 0, 112);
    }

    public C0992c0(Context context, n0 n0Var, C0965G0 c0965g0) {
        super(context, 1);
        this.c = n0Var;
        this.f8936d = c0965g0;
    }

    @Override // ag.AbstractC0693c
    public final Xf.a g() {
        return new C0996e0(this.f7198b, this.c, this.f7197a, this.f8936d);
    }
}
