package com.google.android.gms.internal.ads;

import com.dynatrace.android.agent.Global;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class zzalj {
    public final String zza;
    public final int zzb;
    public final String zzc;
    public final Set zzd;

    private zzalj(String str, int i, String str2, Set set) {
        this.zzb = i;
        this.zza = str;
        this.zzc = str2;
        this.zzd = set;
    }

    public static zzalj zza(String str, int i) {
        String str2;
        String strTrim = str.trim();
        zzghc.zza(!strTrim.isEmpty());
        int iIndexOf = strTrim.indexOf(Global.BLANK);
        if (iIndexOf == -1) {
            str2 = "";
        } else {
            String strTrim2 = strTrim.substring(iIndexOf).trim();
            strTrim = strTrim.substring(0, iIndexOf);
            str2 = strTrim2;
        }
        String str3 = zzeo.zza;
        String[] strArrSplit = strTrim.split("\\.", -1);
        String str4 = strArrSplit[0];
        HashSet hashSet = new HashSet();
        for (int i4 = 1; i4 < strArrSplit.length; i4++) {
            hashSet.add(strArrSplit[i4]);
        }
        return new zzalj(str4, i, str2, hashSet);
    }

    public static zzalj zzb() {
        return new zzalj("", 0, "", Collections.EMPTY_SET);
    }
}
