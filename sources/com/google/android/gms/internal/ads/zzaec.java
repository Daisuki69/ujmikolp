package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaec {
    private final byte[] zza = new byte[10];
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final void zza() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzb(zzacv zzacvVar) throws IOException {
        if (this.zzb) {
            return;
        }
        byte[] bArr = this.zza;
        zzacvVar.zzi(bArr, 0, 10);
        zzacvVar.zzl();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.zzb = true;
        }
    }

    public final void zzc(zzaeb zzaebVar, long j, int i, int i4, int i6, @Nullable zzaea zzaeaVar) {
        zzghc.zzi(this.zzg <= i4 + i6, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.zzb) {
            int i10 = this.zzc;
            int i11 = i10 + 1;
            this.zzc = i11;
            if (i10 == 0) {
                this.zzd = j;
                this.zze = i;
                this.zzf = 0;
            }
            this.zzf += i4;
            this.zzg = i6;
            if (i11 >= 16) {
                zzd(zzaebVar, zzaeaVar);
            }
        }
    }

    public final void zzd(zzaeb zzaebVar, @Nullable zzaea zzaeaVar) {
        if (this.zzc > 0) {
            zzaebVar.zzx(this.zzd, this.zze, this.zzf, this.zzg, zzaeaVar);
            this.zzc = 0;
        }
    }
}
