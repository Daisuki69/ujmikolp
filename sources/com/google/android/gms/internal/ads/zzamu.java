package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzamu {
    public byte[] zza;
    public int zzb;
    private final int zzc;
    private boolean zzd;
    private boolean zze;

    public zzamu(int i, int i4) {
        this.zzc = i;
        byte[] bArr = new byte[131];
        this.zza = bArr;
        bArr[2] = 1;
    }

    public final void zza() {
        this.zzd = false;
        this.zze = false;
    }

    public final boolean zzb() {
        return this.zze;
    }

    public final void zzc(int i) {
        zzghc.zzh(!this.zzd);
        boolean z4 = i == this.zzc;
        this.zzd = z4;
        if (z4) {
            this.zzb = 3;
            this.zze = false;
        }
    }

    public final void zzd(byte[] bArr, int i, int i4) {
        if (this.zzd) {
            int i6 = i4 - i;
            byte[] bArr2 = this.zza;
            int length = bArr2.length;
            int i10 = this.zzb + i6;
            if (length < i10) {
                this.zza = Arrays.copyOf(bArr2, i10 + i10);
            }
            System.arraycopy(bArr, i, this.zza, this.zzb, i6);
            this.zzb += i6;
        }
    }

    public final boolean zze(int i) {
        if (!this.zzd) {
            return false;
        }
        this.zzb -= i;
        this.zzd = false;
        this.zze = true;
        return true;
    }
}
