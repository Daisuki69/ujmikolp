package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeq {
    public final String zza;

    private zzeq(int i, int i4, String str) {
        this.zza = str;
    }

    @Nullable
    public static zzeq zza(zzef zzefVar) {
        String str;
        zzefVar.zzk(2);
        int iZzs = zzefVar.zzs();
        int i = iZzs >> 1;
        int i4 = iZzs & 1;
        int iZzs2 = zzefVar.zzs() >> 3;
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        int i6 = iZzs2 | (i4 << 5);
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(i6).length();
        String str2 = i < 10 ? ".0" : ".";
        int iB = androidx.media3.datasource.cache.c.b(str.length(), length, str2);
        String str3 = i6 < 10 ? ".0" : ".";
        StringBuilder sb2 = new StringBuilder(androidx.media3.datasource.cache.c.b(iB, length2, str3));
        sb2.append(str);
        sb2.append(str2);
        sb2.append(i);
        sb2.append(str3);
        sb2.append(i6);
        return new zzeq(i, i6, sb2.toString());
    }
}
