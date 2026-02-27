package Zg;

import Bj.H;
import io.ktor.utils.io.w;
import java.io.OutputStream;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends OutputStream implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f6951a;

    public f(w wVar) {
        this.f6951a = wVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        H.x(kotlin.coroutines.g.f18170a, new b(this.f6951a, null));
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws Throwable {
        H.x(kotlin.coroutines.g.f18170a, new c(this.f6951a, null));
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws Throwable {
        H.x(kotlin.coroutines.g.f18170a, new d(this.f6951a, i, null));
    }

    @Override // java.io.OutputStream
    public final void write(byte[] b8, int i, int i4) throws Throwable {
        j.g(b8, "b");
        H.x(kotlin.coroutines.g.f18170a, new e(this.f6951a, b8, i, i4, null));
    }
}
