package com.google.android.gms.internal.mlkit_vision_face;

import androidx.annotation.NonNull;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
final class zzcr extends OutputStream {
    private long zza = 0;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.zza++;
    }

    public final long zza() {
        return this.zza;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.zza += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(@NonNull byte[] bArr, int i, int i4) {
        int length;
        int i6;
        if (i >= 0 && i <= (length = bArr.length) && i4 >= 0 && (i6 = i + i4) <= length && i6 >= 0) {
            this.zza += (long) i4;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
