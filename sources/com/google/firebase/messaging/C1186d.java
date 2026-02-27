package com.google.firebase.messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.google.firebase.messaging.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1186d extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f9778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f9779b;

    public C1186d(InputStream inputStream) {
        super(inputStream);
        this.f9779b = -1L;
        this.f9778a = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.f9778a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.f9779b = this.f9778a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f9778a == 0) {
            return -1;
        }
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            this.f9778a--;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f9779b == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f9778a = this.f9779b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j, this.f9778a));
        this.f9778a -= jSkip;
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i4) throws IOException {
        long j = this.f9778a;
        if (j == 0) {
            return -1;
        }
        int i6 = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i4, j));
        if (i6 != -1) {
            this.f9778a -= (long) i6;
        }
        return i6;
    }
}
