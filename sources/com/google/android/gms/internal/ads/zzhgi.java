package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
final class zzhgi extends FilterInputStream {
    private int zza;

    public zzhgi(InputStream inputStream, int i) {
        super(inputStream);
        this.zza = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        return Math.min(super.available(), this.zza);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.zza <= 0) {
            return -1;
        }
        int i = super.read();
        if (i >= 0) {
            this.zza--;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        int iSkip = (int) super.skip(Math.min(j, this.zza));
        if (iSkip >= 0) {
            this.zza -= iSkip;
        }
        return iSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i4) throws IOException {
        int i6 = this.zza;
        if (i6 <= 0) {
            return -1;
        }
        int i10 = super.read(bArr, i, Math.min(i4, i6));
        if (i10 >= 0) {
            this.zza -= i10;
        }
        return i10;
    }
}
