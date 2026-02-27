package nj;

import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: nj.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1951a extends ByteArrayOutputStream {
    public byte[] b() {
        return ((ByteArrayOutputStream) this).buf;
    }

    public byte[] c() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        kotlin.jvm.internal.j.f(buf, "buf");
        return buf;
    }
}
