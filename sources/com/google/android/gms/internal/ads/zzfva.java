package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfva {
    public static byte[] zza(String str, boolean z4) throws IllegalArgumentException {
        byte[] bArrZzk = zzgmk.zzl().zzk(str);
        if (bArrZzk.length != 0 || str.length() <= 0) {
            return bArrZzk;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }
}
