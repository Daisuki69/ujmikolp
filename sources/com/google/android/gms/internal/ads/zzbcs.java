package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class zzbcs extends zzbct {
    @Nullable
    private static final String zzb(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i = 0;
        int i4 = 0;
        while (i4 < str.length() && str.charAt(i4) == ',') {
            i4++;
        }
        while (length > 0) {
            int i6 = length - 1;
            if (str.charAt(i6) != ',') {
                break;
            }
            length = i6;
        }
        if (length < i4) {
            return null;
        }
        if (i4 != 0) {
            i = i4;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i, length);
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final String zza(@Nullable String str, String str2) {
        String strZzb = zzb(str);
        String strZzb2 = zzb(str2);
        if (TextUtils.isEmpty(strZzb)) {
            return strZzb2;
        }
        if (TextUtils.isEmpty(strZzb2)) {
            return strZzb;
        }
        return We.s.q(new StringBuilder(String.valueOf(strZzb).length() + 1 + String.valueOf(strZzb2).length()), strZzb, ",", strZzb2);
    }
}
