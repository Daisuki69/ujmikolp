package yf;

import java.io.FilterOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends FilterOutputStream implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f21275a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, Af.c cVar) {
        super(cVar);
        this.f21275a = pVar;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        j jVar = j.f21177F0;
        p pVar = this.f21275a;
        pVar.D(jVar, (int) pVar.f21276b.c);
        pVar.f21277d = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i4) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i4);
    }
}
