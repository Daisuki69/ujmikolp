package k2;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import io.flutter.plugins.firebase.crashlytics.Constants;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: renamed from: k2.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1740n implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1740n f17985a = new C1740n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f17986b = C2294b.c(SessionDescription.ATTR_TYPE);
    public static final C2294b c = C2294b.c(Constants.REASON);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2294b f17987d = C2294b.c("frames");
    public static final C2294b e = C2294b.c("causedBy");
    public static final C2294b f = C2294b.c("overflowCount");

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        C1711V c1711v = (C1711V) ((z0) obj);
        interfaceC2296d.add(f17986b, c1711v.f17896a);
        interfaceC2296d.add(c, c1711v.f17897b);
        interfaceC2296d.add(f17987d, c1711v.c);
        interfaceC2296d.add(e, c1711v.f17898d);
        interfaceC2296d.add(f, c1711v.e);
    }
}
