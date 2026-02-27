package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class zzh {
    public static final zzh zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;

    @Nullable
    public final byte[] zze;
    public final int zzf;
    public final int zzg;
    private int zzh;

    static {
        zzg zzgVar = new zzg();
        zzgVar.zza(1);
        zzgVar.zzb(2);
        zzgVar.zzc(3);
        zza = zzgVar.zzg();
        zzg zzgVar2 = new zzg();
        zzgVar2.zza(1);
        zzgVar2.zzb(1);
        zzgVar2.zzc(2);
        zzgVar2.zzg();
        String str = zzeo.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ zzh(int i, int i4, int i6, byte[] bArr, int i10, int i11, byte[] bArr2) {
        this.zzb = i;
        this.zzc = i4;
        this.zzd = i6;
        this.zze = bArr;
        this.zzf = i10;
        this.zzg = i11;
    }

    public static boolean zza(@Nullable zzh zzhVar) {
        if (zzhVar == null) {
            return true;
        }
        int i = zzhVar.zzb;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i4 = zzhVar.zzc;
        if (i4 != -1 && i4 != 2) {
            return false;
        }
        int i6 = zzhVar.zzd;
        if ((i6 != -1 && i6 != 3) || zzhVar.zze != null) {
            return false;
        }
        int i10 = zzhVar.zzg;
        if (i10 != -1 && i10 != 8) {
            return false;
        }
        int i11 = zzhVar.zzf;
        return i11 == -1 || i11 == 8;
    }

    public static int zzb(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int zzc(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String zzh(int i) {
        return i != -1 ? i != 6 ? i != 1 ? i != 2 ? androidx.camera.core.impl.a.o(new StringBuilder(String.valueOf(i).length() + 22), "Undefined color space ", i) : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    private static String zzi(int i) {
        return i != -1 ? i != 10 ? i != 1 ? i != 2 ? i != 3 ? i != 6 ? i != 7 ? androidx.camera.core.impl.a.o(new StringBuilder(String.valueOf(i).length() + 25), "Undefined color transfer ", i) : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    private static String zzj(int i) {
        return i != -1 ? i != 1 ? i != 2 ? androidx.camera.core.impl.a.o(new StringBuilder(String.valueOf(i).length() + 22), "Undefined color range ", i) : "Limited range" : "Full range" : "Unset color range";
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzh.class == obj.getClass()) {
            zzh zzhVar = (zzh) obj;
            if (this.zzb == zzhVar.zzb && this.zzc == zzhVar.zzc && this.zzd == zzhVar.zzd && Arrays.equals(this.zze, zzhVar.zze) && this.zzf == zzhVar.zzf && this.zzg == zzhVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzh;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((Arrays.hashCode(this.zze) + ((((((this.zzb + 527) * 31) + this.zzc) * 31) + this.zzd) * 31)) * 31) + this.zzf) * 31) + this.zzg;
        this.zzh = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        int i = this.zzf;
        int i4 = this.zzd;
        int i6 = this.zzc;
        String strZzh = zzh(this.zzb);
        String strZzj = zzj(i6);
        String strZzi = zzi(i4);
        String strO = i != -1 ? We.s.o(new StringBuilder(String.valueOf(i).length() + 8), "bit Luma", i) : "NA";
        int i10 = this.zzg;
        String strO2 = i10 != -1 ? We.s.o(new StringBuilder(String.valueOf(i10).length() + 10), "bit Chroma", i10) : "NA";
        boolean z4 = this.zze != null;
        StringBuilder sb2 = new StringBuilder(androidx.media3.datasource.cache.c.b(androidx.media3.datasource.cache.c.b(androidx.media3.datasource.cache.c.b(androidx.media3.datasource.cache.c.b(strZzh.length() + 12, 2, strZzj) + strZzi.length() + 2, 2, String.valueOf(z4)), 2, strO), 1, strO2));
        sb2.append("ColorInfo(");
        sb2.append(strZzh);
        sb2.append(", ");
        sb2.append(strZzj);
        sb2.append(", ");
        sb2.append(strZzi);
        sb2.append(", ");
        sb2.append(z4);
        androidx.media3.datasource.cache.c.A(sb2, ", ", strO, ", ", strO2);
        sb2.append(")");
        return sb2.toString();
    }

    public final zzg zzd() {
        return new zzg(this, null);
    }

    public final boolean zze() {
        return (this.zzf == -1 || this.zzg == -1) ? false : true;
    }

    public final boolean zzf() {
        return (this.zzb == -1 || this.zzc == -1 || this.zzd == -1) ? false : true;
    }

    public final String zzg() {
        String str;
        String string;
        if (zzf()) {
            String strZzh = zzh(this.zzb);
            String strZzj = zzj(this.zzc);
            String strZzi = zzi(this.zzd);
            String str2 = zzeo.zza;
            Locale locale = Locale.US;
            str = strZzh + "/" + strZzj + "/" + strZzi;
        } else {
            str = "NA/NA/NA";
        }
        if (zze()) {
            int i = this.zzf;
            int i4 = this.zzg;
            StringBuilder sb2 = new StringBuilder(androidx.media3.datasource.cache.c.a(i, 1) + String.valueOf(i4).length());
            sb2.append(i);
            sb2.append("/");
            sb2.append(i4);
            string = sb2.toString();
        } else {
            string = "NA/NA";
        }
        return We.s.q(new StringBuilder(string.length() + str.length() + 1), str, "/", string);
    }
}
