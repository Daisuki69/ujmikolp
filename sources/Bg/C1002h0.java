package bg;

import ag.AbstractC0693c;
import android.content.Context;
import cj.C1112C;
import cj.C1132s;

/* JADX INFO: renamed from: bg.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1002h0 extends AbstractC0693c {
    public static final C0960E e = new C0960E(1, "datetaken", null, 0, 28);
    public static final C0960E f = new C0960E(2, "date_added", null, 0, 28);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0960E f9009g = new C0960E(3, "date_modified", null, 0, 28);
    public static final C0960E h = new C0960E(4, "height", null, 0, 28);
    public static final C0960E i = new C0960E(5, "width", null, 0, 28);
    public static final C0960E j = new C0960E(6, "mime_type", null, 0, 28);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0960E f9010k = new C0960E(7, "_size", null, 0, 28);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C0960E f9011l = new C0960E(8, C1132s.g("latitude", "longitude"), null, 0, 29, 60);
    public static final C0960E m;
    public final x0 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0965G0 f9012d;

    static {
        C1112C permissions = C1112C.f9377a;
        kotlin.jvm.internal.j.h(permissions, "permissions");
        cj.r.c("_display_name");
        cj.r.c("bucket_display_name");
        cj.r.c("bucket_id");
        m = new C0960E(12, "_data", null, 0, 28);
        cj.r.c("mini_thumb_magic");
        cj.r.c("orientation");
        cj.r.c("picasa_id");
        cj.r.c("latitude");
        cj.r.c("longitude");
    }

    public C1002h0(Context context, x0 x0Var, C0965G0 c0965g0) {
        super(context, 1);
        this.c = x0Var;
        this.f9012d = c0965g0;
    }

    @Override // ag.AbstractC0693c
    public final Xf.a g() {
        return new C0979S(this.f7198b, this.f7197a, this.f9012d, 2);
    }
}
