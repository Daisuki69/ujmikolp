package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class zzak {
    private static final HashSet zza = new HashSet();
    private static String zzb = "media3.common";

    public static synchronized String zza() {
        return zzb;
    }

    public static synchronized void zzb(String str) {
        if (zza.add(str)) {
            String str2 = zzb;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 2 + str.length());
            sb2.append(str2);
            sb2.append(", ");
            sb2.append(str);
            zzb = sb2.toString();
        }
    }
}
