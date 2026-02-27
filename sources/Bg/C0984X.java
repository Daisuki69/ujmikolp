package bg;

import ag.AbstractC0693c;
import android.content.Context;
import cj.C1112C;
import cj.C1132s;

/* JADX INFO: renamed from: bg.X, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0984X extends AbstractC0693c {
    public static final C0960E e = new C0960E(1, "date_added", null, 0, 28);
    public static final C0960E f = new C0960E(2, "date_modified", null, 0, 28);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0960E f8875g = new C0960E(3, "datetaken", null, 0, 28);
    public static final C0960E h = new C0960E(4, "duration", null, 0, 28);
    public static final C0960E i = new C0960E(5, "isprivate", null, 0, 28);
    public static final C0960E j = new C0960E(6, "mime_type", null, 0, 28);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0960E f8876k = new C0960E(7, "resolution", null, 0, 28);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C0960E f8877l = new C0960E(8, "_size", null, 0, 28);
    public static final C0960E m = new C0960E(9, "tags", null, 0, 28);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0960E f8878n = new C0960E(10, "language", null, 0, 28);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C0960E f8879o = new C0960E(11, C1132s.g("latitude", "longitude"), null, 0, 29, 60);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C0960E f8880p = new C0960E(12, "title", null, 0, 28);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0960E f8881q = new C0960E(13, "_display_name", null, 0, 28);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0960E f8882r = new C0960E(14, "album", null, 0, 28);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0960E f8883s = new C0960E(15, "artist", null, 0, 28);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0960E f8884t = new C0960E(16, "bookmark", null, 0, 28);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0960E f8885u = new C0960E(17, "bucket_display_name", null, 0, 28);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0960E f8886v = new C0960E(18, "bucket_id", null, 0, 28);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0960E f8887w = new C0960E(19, "category", null, 0, 28);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0960E f8888x = new C0960E(20, "_data", null, 0, 28);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C0960E f8889y = new C0960E(21, "description", null, 0, 28);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C0960E f8890z = new C0960E(22, "mini_thumb_magic", null, 0, 12);
    public final x0 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0965G0 f8891d;

    static {
        C1112C permissions = C1112C.f9377a;
        kotlin.jvm.internal.j.h(permissions, "permissions");
        cj.r.c("latitude");
        cj.r.c("longitude");
    }

    public C0984X(Context context, x0 x0Var, C0965G0 c0965g0) {
        super(context, 1);
        this.c = x0Var;
        this.f8891d = c0965g0;
    }

    @Override // ag.AbstractC0693c
    public final Xf.a g() {
        return new C0979S(this.f7198b, this.f7197a, this.f8891d, 1);
    }
}
