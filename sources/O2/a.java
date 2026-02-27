package O2;

import U2.g;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends e {
    public static final M2.a c = M2.a.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f4624b;

    public a(g gVar) {
        this.f4624b = gVar;
    }

    @Override // O2.e
    public final boolean a() {
        M2.a aVar = c;
        g gVar = this.f4624b;
        if (gVar == null) {
            aVar.f("ApplicationInfo is null");
        } else if (!gVar.C()) {
            aVar.f("GoogleAppId is null");
        } else if (!gVar.A()) {
            aVar.f("AppInstanceId is null");
        } else if (!gVar.B()) {
            aVar.f("ApplicationProcessState is null");
        } else {
            if (!gVar.z()) {
                return true;
            }
            if (!gVar.x().w()) {
                aVar.f("AndroidAppInfo.packageName is null");
            } else {
                if (gVar.x().x()) {
                    return true;
                }
                aVar.f("AndroidAppInfo.sdkVersion is null");
            }
        }
        aVar.f("ApplicationInfo is invalid");
        return false;
    }
}
