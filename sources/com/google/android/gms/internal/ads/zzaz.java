package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaz {

    @Nullable
    public final Object zza;
    public final int zzb;

    @Nullable
    public final zzaj zzc;

    @Nullable
    public final Object zzd;
    public final int zze;
    public final long zzf;
    public final long zzg;
    public final int zzh;
    public final int zzi;

    static {
        String str = zzeo.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public zzaz(@Nullable Object obj, int i, @Nullable zzaj zzajVar, @Nullable Object obj2, int i4, long j, long j6, int i6, int i10) {
        this.zza = obj;
        this.zzb = i;
        this.zzc = zzajVar;
        this.zzd = obj2;
        this.zze = i4;
        this.zzf = j;
        this.zzg = j6;
        this.zzh = i6;
        this.zzi = i10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaz.class == obj.getClass()) {
            zzaz zzazVar = (zzaz) obj;
            if (this.zzb == zzazVar.zzb && this.zze == zzazVar.zze && this.zzf == zzazVar.zzf && this.zzg == zzazVar.zzg && this.zzh == zzazVar.zzh && this.zzi == zzazVar.zzi && Objects.equals(this.zzc, zzazVar.zzc) && Objects.equals(this.zza, zzazVar.zza) && Objects.equals(this.zzd, zzazVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd, Integer.valueOf(this.zze), Long.valueOf(this.zzf), Long.valueOf(this.zzg), Integer.valueOf(this.zzh), Integer.valueOf(this.zzi));
    }

    public final String toString() {
        int i = this.zzb;
        int length = String.valueOf(i).length();
        int i4 = this.zze;
        int length2 = String.valueOf(i4).length();
        long j = this.zzf;
        StringBuilder sb2 = new StringBuilder(length + 19 + length2 + 6 + String.valueOf(j).length());
        androidx.media3.datasource.cache.c.y(sb2, "mediaItem=", i, ", period=", i4);
        String strJ = androidx.media3.datasource.cache.c.j(j, ", pos=", sb2);
        int i6 = this.zzh;
        if (i6 == -1) {
            return strJ;
        }
        long j6 = this.zzg;
        int i10 = this.zzi;
        int length3 = strJ.length();
        StringBuilder sb3 = new StringBuilder(String.valueOf(i6).length() + length3 + 13 + String.valueOf(j6).length() + 10 + 5 + String.valueOf(i10).length());
        sb3.append(strJ);
        sb3.append(", contentPos=");
        sb3.append(j6);
        return androidx.media3.datasource.cache.c.n(sb3, ", adGroup=", i6, ", ad=", i10);
    }
}
