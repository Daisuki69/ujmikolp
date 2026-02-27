package bg;

import ag.AbstractC0693c;
import android.content.Context;
import cj.C1112C;

/* JADX INFO: renamed from: bg.N, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0975N extends AbstractC0693c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final C0960E f8824A;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0960E f8825d;
    public static final C0960E e;
    public static final C0960E f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0960E f8826g;
    public static final C0960E h;
    public static final C0960E i;
    public static final C0960E j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0960E f8827k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C0960E f8828l;
    public static final C0960E m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0960E f8829n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C0960E f8830o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C0960E f8831p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0960E f8832q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0960E f8833r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0960E f8834s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0960E f8835t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0960E f8836u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0960E f8837v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0960E f8838w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0960E f8839x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C0960E f8840y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C0960E f8841z;
    public final C0965G0 c;

    static {
        C1112C c1112c = C1112C.f9377a;
        f8825d = new C0960E(1, "date_added", null, 0, 28);
        e = new C0960E(2, "date_modified", null, 0, 28);
        f = new C0960E(3, "duration", null, 0, 28);
        f8826g = new C0960E(4, "mime_type", null, 0, 28);
        h = new C0960E(5, "is_music", null, 0, 28);
        i = new C0960E(6, "year", null, 0, 28);
        j = new C0960E(7, "is_notification", null, 0, 28);
        f8827k = new C0960E(8, "is_ringtone", null, 0, 28);
        f8828l = new C0960E(9, "is_alarm", null, 0, 28);
        m = new C0960E(10, "_display_name", null, 0, 28);
        f8829n = new C0960E(11, "album", null, 0, 28);
        f8830o = new C0960E(12, "artist", null, 0, 28);
        f8831p = new C0960E(13, "album_id", null, 0, 28);
        f8832q = new C0960E(14, "album_key", null, 0, 28);
        f8833r = new C0960E(15, "artist_id", null, 0, 28);
        f8834s = new C0960E(16, "artist_key", null, 0, 28);
        f8835t = new C0960E(17, "bookmark", null, 0, 28);
        f8836u = new C0960E(18, "composer", null, 0, 28);
        f8837v = new C0960E(19, "is_podcast", null, 0, 28);
        f8838w = new C0960E(20, "title_key", null, 0, 28);
        f8839x = new C0960E(21, "track", null, 0, 28);
        f8840y = new C0960E(22, "_data", null, 0, 28);
        f8841z = new C0960E(24, "is_recording", c1112c, 31, 16);
        f8824A = new C0960E(25, "is_audiobook", c1112c, 29, 16);
    }

    public C0975N(Context context, C0965G0 c0965g0) {
        super(context, 1);
        this.c = c0965g0;
    }

    @Override // ag.AbstractC0693c
    public final Xf.a g() {
        return new C0979S(this.f7198b, this.f7197a, this.c, 0);
    }
}
