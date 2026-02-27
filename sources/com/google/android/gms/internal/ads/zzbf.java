package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbf {
    public final int zza;
    public final String zzb;
    public final int zzc;
    private final zzu[] zzd;
    private int zze;

    static {
        String str = zzeo.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzbf(String str, zzu... zzuVarArr) {
        int length = zzuVarArr.length;
        int i = 1;
        zzghc.zza(length > 0);
        this.zzb = str;
        this.zzd = zzuVarArr;
        this.zza = length;
        int iZzg = zzar.zzg(zzuVarArr[0].zzo);
        this.zzc = iZzg == -1 ? zzar.zzg(zzuVarArr[0].zzn) : iZzg;
        String strZzc = zzc(zzuVarArr[0].zzd);
        int i4 = zzuVarArr[0].zzf | 16384;
        while (true) {
            zzu[] zzuVarArr2 = this.zzd;
            if (i >= zzuVarArr2.length) {
                return;
            }
            if (!strZzc.equals(zzc(zzuVarArr2[i].zzd))) {
                zzu[] zzuVarArr3 = this.zzd;
                zzd("languages", zzuVarArr3[0].zzd, zzuVarArr3[i].zzd, i);
                return;
            } else {
                zzu[] zzuVarArr4 = this.zzd;
                if (i4 != (zzuVarArr4[i].zzf | 16384)) {
                    zzd("role flags", Integer.toBinaryString(zzuVarArr4[0].zzf), Integer.toBinaryString(this.zzd[i].zzf), i);
                    return;
                }
                i++;
            }
        }
    }

    private static String zzc(@Nullable String str) {
        return (str == null || str.equals(androidx.media3.common.C.LANGUAGE_UNDETERMINED)) ? "" : str;
    }

    private static void zzd(String str, @Nullable String str2, @Nullable String str3, int i) {
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(str3).length();
        StringBuilder sb2 = new StringBuilder(str.length() + 40 + length + 17 + length2 + 9 + String.valueOf(i).length() + 1);
        androidx.media3.datasource.cache.c.A(sb2, "Different ", str, " combined in one TrackGroup: '", str2);
        sb2.append("' (track 0) and '");
        sb2.append(str3);
        sb2.append("' (track ");
        sb2.append(i);
        sb2.append(")");
        zzds.zzf("TrackGroup", "", new IllegalStateException(sb2.toString()));
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbf.class == obj.getClass()) {
            zzbf zzbfVar = (zzbf) obj;
            if (this.zzb.equals(zzbfVar.zzb) && Arrays.equals(this.zzd, zzbfVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zze;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.zzb.hashCode() + 527;
        int iHashCode2 = Arrays.hashCode(this.zzd) + (iHashCode * 31);
        this.zze = iHashCode2;
        return iHashCode2;
    }

    public final String toString() {
        String string = Arrays.toString(this.zzd);
        String str = this.zzb;
        return We.s.q(new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(string).length()), str, ": ", string);
    }

    public final zzu zza(int i) {
        return this.zzd[i];
    }

    public final int zzb(zzu zzuVar) {
        int i = 0;
        while (true) {
            zzu[] zzuVarArr = this.zzd;
            if (i >= zzuVarArr.length) {
                return -1;
            }
            if (zzuVar == zzuVarArr[i]) {
                return i;
            }
            i++;
        }
    }
}
