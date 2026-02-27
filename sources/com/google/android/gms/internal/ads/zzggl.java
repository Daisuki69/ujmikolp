package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzggl extends zzggk {
    private final char zza;

    public zzggl(char c) {
        this.zza = c;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i = this.zza;
        for (int i4 = 0; i4 < 4; i4++) {
            cArr[5 - i4] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        String strCopyValueOf = String.copyValueOf(cArr);
        return We.s.q(new StringBuilder(String.valueOf(strCopyValueOf).length() + 18), "CharMatcher.is('", strCopyValueOf, "')");
    }

    @Override // com.google.android.gms.internal.ads.zzggo
    public final boolean zzb(char c) {
        return c == this.zza;
    }
}
