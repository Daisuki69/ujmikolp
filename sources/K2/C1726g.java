package k2;

import io.flutter.plugins.firebase.crashlytics.Constants;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: renamed from: k2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1726g implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1726g f17945a = new C1726g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f17946b = C2294b.c(Constants.IDENTIFIER);
    public static final C2294b c = C2294b.c("version");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2294b f17947d = C2294b.c("displayVersion");
    public static final C2294b e = C2294b.c("organization");
    public static final C2294b f = C2294b.c("installationUuid");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2294b f17948g = C2294b.c("developmentPlatform");
    public static final C2294b h = C2294b.c("developmentPlatformVersion");

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        C1702L c1702l = (C1702L) ((w0) obj);
        interfaceC2296d.add(f17946b, c1702l.f17867a);
        interfaceC2296d.add(c, c1702l.f17868b);
        interfaceC2296d.add(f17947d, c1702l.c);
        interfaceC2296d.add(e, (Object) null);
        interfaceC2296d.add(f, c1702l.f17869d);
        interfaceC2296d.add(f17948g, c1702l.e);
        interfaceC2296d.add(h, c1702l.f);
    }
}
