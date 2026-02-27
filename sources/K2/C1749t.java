package k2;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: renamed from: k2.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1749t implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1749t f18011a = new C1749t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f18012b = C2294b.c("timestamp");
    public static final C2294b c = C2294b.c(SessionDescription.ATTR_TYPE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2294b f18013d = C2294b.c("app");
    public static final C2294b e = C2294b.c("device");
    public static final C2294b f = C2294b.c("log");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2294b f18014g = C2294b.c("rollouts");

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        C1707Q c1707q = (C1707Q) ((L0) obj);
        interfaceC2296d.add(f18012b, c1707q.f17883a);
        interfaceC2296d.add(c, c1707q.f17884b);
        interfaceC2296d.add(f18013d, c1707q.c);
        interfaceC2296d.add(e, c1707q.f17885d);
        interfaceC2296d.add(f, c1707q.e);
        interfaceC2296d.add(f18014g, c1707q.f);
    }
}
