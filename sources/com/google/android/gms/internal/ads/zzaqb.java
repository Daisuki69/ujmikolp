package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
final class zzaqb extends FilterInputStream {
    private final long zza;
    private long zzb;

    public zzaqb(InputStream inputStream, long j) {
        super(inputStream);
        this.zza = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = super.read();
        if (i != -1) {
            this.zzb++;
        }
        return i;
    }

    public final long zza() {
        return this.zza - this.zzb;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i4) throws IOException {
        int i6 = super.read(bArr, i, i4);
        if (i6 != -1) {
            this.zzb += (long) i6;
        }
        return i6;
    }
}
