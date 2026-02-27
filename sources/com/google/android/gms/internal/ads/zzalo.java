package com.google.android.gms.internal.ads;

import com.dynatrace.android.agent.Global;

/* JADX INFO: loaded from: classes3.dex */
public final class zzalo {
    public static long zza(String str) {
        String str2 = zzeo.zza;
        String[] strArrSplit = str.split("\\.", 2);
        long j = 0;
        for (String str3 : strArrSplit[0].split(Global.COLON, -1)) {
            j = (j * 60) + Long.parseLong(str3);
        }
        long j6 = j * 1000;
        if (strArrSplit.length == 2) {
            String strTrim = strArrSplit[1].trim();
            if (strTrim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(strTrim));
            }
            j6 += Long.parseLong(strTrim);
        }
        return j6 * 1000;
    }

    public static float zzb(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }
}
