package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfxv {
    private final byte[] zza = new byte[256];
    private int zzb;
    private int zzc;

    public zzfxv(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.zza[i] = (byte) i;
        }
        int i4 = 0;
        for (int i6 = 0; i6 < 256; i6++) {
            byte[] bArr2 = this.zza;
            byte b8 = bArr2[i6];
            i4 = (i4 + b8 + bArr[i6 % bArr.length]) & 255;
            bArr2[i6] = bArr2[i4];
            bArr2[i4] = b8;
        }
        this.zzb = 0;
        this.zzc = 0;
    }

    public final void zza(byte[] bArr) {
        int i = this.zzb;
        int i4 = this.zzc;
        for (int i6 = 0; i6 < 256; i6++) {
            byte[] bArr2 = this.zza;
            i = (i + 1) & 255;
            byte b8 = bArr2[i];
            i4 = (i4 + b8) & 255;
            bArr2[i] = bArr2[i4];
            bArr2[i4] = b8;
            bArr[i6] = (byte) (bArr2[(bArr2[i] + b8) & 255] ^ bArr[i6]);
        }
        this.zzb = i;
        this.zzc = i4;
    }
}
