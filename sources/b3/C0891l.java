package b3;

/* JADX INFO: renamed from: b3.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0891l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B2.b f8483a;

    public C0891l(B2.b transportFactoryProvider) {
        kotlin.jvm.internal.j.g(transportFactoryProvider, "transportFactoryProvider");
        this.f8483a = transportFactoryProvider;
    }

    public final void a(C0873M c0873m) {
        ((c1.q) ((Z0.g) this.f8483a.get())).a("FIREBASE_APPQUALITY_SESSION", new Z0.c("json"), new androidx.work.impl.e(this, 1)).a(new Z0.a(c0873m, Z0.e.f6874a, null), new androidx.media3.extractor.flv.a(22));
    }
}
