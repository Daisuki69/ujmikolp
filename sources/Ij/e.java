package Ij;

import Bj.A;
import Gj.n;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f2364b;

    static {
        int i = k.c;
        int i4 = k.f2371d;
        long j = k.e;
        String str = k.f2369a;
        e eVar = new e();
        eVar.f2366a = new c(i, i4, str, j);
        f2364b = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // Bj.A
    public final A limitedParallelism(int i, String str) {
        Gj.a.a(i);
        return i >= k.c ? str != null ? new n(this, str) : this : super.limitedParallelism(i, str);
    }

    @Override // Bj.A
    public final String toString() {
        return "Dispatchers.Default";
    }
}
