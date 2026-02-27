package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class zzakm {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final int zzk;

    private zzakm(int i, int i4, int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.zza = i;
        this.zzb = i4;
        this.zzc = i6;
        this.zzd = i10;
        this.zze = i11;
        this.zzf = i12;
        this.zzg = i13;
        this.zzh = i14;
        this.zzi = i15;
        this.zzj = i16;
        this.zzk = i17;
    }

    @Nullable
    public static zzakm zza(String str) {
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i = 0;
        int i4 = -1;
        int i6 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                if (i4 != -1) {
                    return new zzakm(i4, i6, i10, i11, i12, i13, i14, i15, i16, i17, length);
                }
                return null;
            }
            switch (zzggj.zza(strArrSplit[i].trim())) {
                case "name":
                    i4 = i;
                    break;
                case "alignment":
                    i6 = i;
                    break;
                case "primarycolour":
                    i10 = i;
                    break;
                case "outlinecolour":
                    i11 = i;
                    break;
                case "fontsize":
                    i12 = i;
                    break;
                case "bold":
                    i13 = i;
                    break;
                case "italic":
                    i14 = i;
                    break;
                case "underline":
                    i15 = i;
                    break;
                case "strikeout":
                    i16 = i;
                    break;
                case "borderstyle":
                    i17 = i;
                    break;
            }
            i++;
        }
    }
}
