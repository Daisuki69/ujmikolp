package com.google.android.gms.internal.auth;

import We.s;
import androidx.camera.core.impl.a;

/* JADX INFO: loaded from: classes3.dex */
final class zzdy extends zzeb {
    private final int zzc;

    public zzdy(byte[] bArr, int i, int i4) {
        super(bArr);
        zzee.zzi(0, i4, bArr.length);
        this.zzc = i4;
    }

    @Override // com.google.android.gms.internal.auth.zzeb, com.google.android.gms.internal.auth.zzee
    public final byte zza(int i) {
        int i4 = this.zzc;
        if (((i4 - (i + 1)) | i) >= 0) {
            return this.zza[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(s.f(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a.c(i, i4, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.auth.zzeb, com.google.android.gms.internal.auth.zzee
    public final byte zzb(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.auth.zzeb, com.google.android.gms.internal.auth.zzee
    public final int zzd() {
        return this.zzc;
    }
}
