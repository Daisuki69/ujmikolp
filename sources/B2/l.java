package b2;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements B2.b {
    public static final androidx.media3.extractor.flv.a c = new androidx.media3.extractor.flv.a(19);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final R2.d f8370d = new R2.d(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public B2.a f8371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile B2.b f8372b;

    public l(androidx.media3.extractor.flv.a aVar, B2.b bVar) {
        this.f8371a = aVar;
        this.f8372b = bVar;
    }

    public final void a(B2.a aVar) {
        B2.b bVar;
        B2.b bVar2;
        B2.b bVar3 = this.f8372b;
        R2.d dVar = f8370d;
        if (bVar3 != dVar) {
            aVar.d(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f8372b;
            if (bVar != dVar) {
                bVar2 = bVar;
            } else {
                this.f8371a = new androidx.camera.lifecycle.a(18, this.f8371a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.d(bVar);
        }
    }

    @Override // B2.b
    public final Object get() {
        return this.f8372b.get();
    }
}
