package e3;

import b3.C0881b;
import b3.i0;
import kotlin.time.a;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f16564g;
    public static final zj.o h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f16565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2.e f16566b;
    public final C0881b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f16567d;
    public final s e;
    public final Kj.d f;

    static {
        a.C0097a c0097a = kotlin.time.a.f18208b;
        f16564g = (int) kotlin.time.a.g(kotlin.time.b.e(24, Aj.b.f), Aj.b.f331d);
        h = new zj.o("/");
    }

    public e(i0 timeProvider, C2.e firebaseInstallationsApi, C0881b appInfo, g configsFetcher, s settingsCache) {
        kotlin.jvm.internal.j.g(timeProvider, "timeProvider");
        kotlin.jvm.internal.j.g(firebaseInstallationsApi, "firebaseInstallationsApi");
        kotlin.jvm.internal.j.g(appInfo, "appInfo");
        kotlin.jvm.internal.j.g(configsFetcher, "configsFetcher");
        kotlin.jvm.internal.j.g(settingsCache, "settingsCache");
        this.f16565a = timeProvider;
        this.f16566b = firebaseInstallationsApi;
        this.c = appInfo;
        this.f16567d = configsFetcher;
        this.e = settingsCache;
        this.f = Kj.e.a(1, false);
    }

    @Override // e3.t
    public final Boolean a() {
        return this.e.a().f16573a;
    }

    @Override // e3.t
    public final kotlin.time.a b() {
        Integer num = this.e.a().c;
        if (num == null) {
            return null;
        }
        a.C0097a c0097a = kotlin.time.a.f18208b;
        return new kotlin.time.a(kotlin.time.b.e(num.intValue(), Aj.b.f331d));
    }

    @Override // e3.t
    public final Double c() {
        return this.e.a().f16574b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b7 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:44:0x00ad, B:46:0x00b7, B:47:0x00bf, B:50:0x0166, B:36:0x0086, B:38:0x008e, B:41:0x009b), top: B:59:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:44:0x00ad, B:46:0x00b7, B:47:0x00bf, B:50:0x0166, B:36:0x0086, B:38:0x008e, B:41:0x009b), top: B:59:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12, types: [Kj.a] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    @Override // e3.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gj.InterfaceC1526a r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.e.d(gj.a):java.lang.Object");
    }
}
