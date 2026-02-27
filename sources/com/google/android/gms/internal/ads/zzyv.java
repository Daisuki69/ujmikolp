package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzyv {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzyo[] zzd = new zzyo[100];

    public zzyv(boolean z4, int i) {
    }

    public final synchronized void zza() {
        zzb(0);
    }

    public final synchronized void zzb(int i) {
        int i4 = this.zza;
        this.zza = i;
        if (i < i4) {
            zzf();
        }
    }

    public final synchronized zzyo zzc() {
        zzyo zzyoVar;
        try {
            this.zzb++;
            int i = this.zzc;
            if (i > 0) {
                zzyo[] zzyoVarArr = this.zzd;
                int i4 = i - 1;
                this.zzc = i4;
                zzyoVar = zzyoVarArr[i4];
                if (zzyoVar == null) {
                    throw null;
                }
                zzyoVarArr[i4] = null;
            } else {
                zzyoVar = new zzyo(new byte[65536], 0);
                int i6 = this.zzb;
                zzyo[] zzyoVarArr2 = this.zzd;
                int length = zzyoVarArr2.length;
                if (i6 > length) {
                    this.zzd = (zzyo[]) Arrays.copyOf(zzyoVarArr2, length + length);
                    return zzyoVar;
                }
            }
            return zzyoVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzd(zzyo zzyoVar) {
        zzyo[] zzyoVarArr = this.zzd;
        int i = this.zzc;
        this.zzc = i + 1;
        zzyoVarArr[i] = zzyoVar;
        this.zzb--;
        notifyAll();
    }

    public final synchronized void zze(@Nullable zzyp zzypVar) {
        while (zzypVar != null) {
            try {
                zzyo[] zzyoVarArr = this.zzd;
                int i = this.zzc;
                this.zzc = i + 1;
                zzyoVarArr[i] = zzypVar.zzd();
                this.zzb--;
                zzypVar = zzypVar.zze();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notifyAll();
    }

    public final synchronized void zzf() {
        int i = this.zza;
        String str = zzeo.zza;
        int iMax = Math.max(0, ((i + 65535) / 65536) - this.zzb);
        int i4 = this.zzc;
        if (iMax >= i4) {
            return;
        }
        Arrays.fill(this.zzd, iMax, i4, (Object) null);
        this.zzc = iMax;
    }

    public final synchronized int zzg() {
        return this.zzb * 65536;
    }
}
