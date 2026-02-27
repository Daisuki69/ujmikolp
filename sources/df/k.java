package df;

import com.paymaya.domain.store.L;
import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1365g f16450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC1355A f16451b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16452d;
    public final w e;
    public final x f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f16453g;
    public final k h;
    public final k i;
    public final k j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f16454k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f16455l;
    public final com.google.firebase.messaging.r m;

    public k(j jVar) {
        this.f16450a = (C1365g) jVar.e;
        this.f16451b = (EnumC1355A) jVar.f;
        this.c = jVar.f16445b;
        this.f16452d = jVar.f16444a;
        this.e = (w) jVar.f16447g;
        L l6 = (L) jVar.h;
        l6.getClass();
        this.f = new x(l6);
        this.f16453g = (m) jVar.i;
        this.h = (k) jVar.j;
        this.i = (k) jVar.f16448k;
        this.j = (k) jVar.f16449l;
        this.f16454k = jVar.c;
        this.f16455l = jVar.f16446d;
        this.m = (com.google.firebase.messaging.r) jVar.m;
    }

    public final String b(String str) {
        String strG = this.f.g(str);
        if (strG != null) {
            return strG;
        }
        return null;
    }

    public final j c() {
        j jVar = new j();
        jVar.e = this.f16450a;
        jVar.f = this.f16451b;
        jVar.f16445b = this.c;
        jVar.f16444a = this.f16452d;
        jVar.f16447g = this.e;
        jVar.h = this.f.a();
        jVar.i = this.f16453g;
        jVar.j = this.h;
        jVar.f16448k = this.i;
        jVar.f16449l = this.j;
        jVar.c = this.f16454k;
        jVar.f16446d = this.f16455l;
        jVar.m = this.m;
        return jVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m mVar = this.f16453g;
        if (mVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        mVar.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f16451b + ", code=" + this.c + ", message=" + this.f16452d + ", url=" + this.f16450a.f16439a + '}';
    }
}
