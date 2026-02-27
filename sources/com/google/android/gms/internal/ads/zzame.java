package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class zzame {
    private static final byte[] zzd = {0, 0, 1};
    public int zza;
    public int zzb;
    public byte[] zzc = new byte[128];
    private boolean zze;

    public zzame(int i) {
    }

    public final void zza() {
        this.zze = false;
        this.zza = 0;
        this.zzb = 0;
    }

    public final boolean zzb(int i, int i4) {
        if (this.zze) {
            int i6 = this.zza - i4;
            this.zza = i6;
            if (this.zzb != 0 || i != 181) {
                this.zze = false;
                return true;
            }
            this.zzb = i6;
        } else if (i == 179) {
            this.zze = true;
        }
        zzc(zzd, 0, 3);
        return false;
    }

    public final void zzc(byte[] bArr, int i, int i4) {
        if (this.zze) {
            int i6 = i4 - i;
            byte[] bArr2 = this.zzc;
            int length = bArr2.length;
            int i10 = this.zza + i6;
            if (length < i10) {
                this.zzc = Arrays.copyOf(bArr2, i10 + i10);
            }
            System.arraycopy(bArr, i, this.zzc, this.zza, i6);
            this.zza += i6;
        }
    }
}
