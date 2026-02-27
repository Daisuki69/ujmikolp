package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;

/* JADX INFO: loaded from: classes3.dex */
final class zzakk {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;

    private zzakk(int i, int i4, int i6, int i10, int i11, int i12) {
        this.zza = i;
        this.zzb = i4;
        this.zzc = i6;
        this.zzd = i10;
        this.zze = i11;
        this.zzf = i12;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    public static zzakk zza(String str) {
        byte b8;
        zzghc.zza(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i = 0;
        int i4 = -1;
        int i6 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                if (i6 == -1 || i10 == -1 || i12 == -1) {
                    return null;
                }
                return new zzakk(i4, i6, i10, i11, i12, length);
            }
            String strZza = zzggj.zza(strArrSplit[i].trim());
            switch (strZza.hashCode()) {
                case 100571:
                    b8 = !strZza.equals(TtmlNode.END) ? (byte) -1 : (byte) 2;
                    break;
                case 3556653:
                    b8 = !strZza.equals("text") ? (byte) -1 : (byte) 4;
                    break;
                case 102749521:
                    b8 = !strZza.equals("layer") ? (byte) -1 : (byte) 0;
                    break;
                case 109757538:
                    b8 = !strZza.equals(TtmlNode.START) ? (byte) -1 : (byte) 1;
                    break;
                case 109780401:
                    b8 = !strZza.equals(TtmlNode.TAG_STYLE) ? (byte) -1 : (byte) 3;
                    break;
                default:
                    b8 = -1;
                    break;
            }
            if (b8 == 0) {
                i4 = i;
            } else if (b8 == 1) {
                i6 = i;
            } else if (b8 == 2) {
                i10 = i;
            } else if (b8 == 3) {
                i11 = i;
            } else if (b8 == 4) {
                i12 = i;
            }
            i++;
        }
    }
}
