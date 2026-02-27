package com.google.android.gms.internal.fido;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbl {
    private static final zzbl zza = new zzbj("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final zzbl zzb = new zzbj("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    private static final zzbl zzc = new zzbk("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
    private static final zzbl zzd = new zzbk("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
    private static final zzbl zze = new zzbi("base16()", "0123456789ABCDEF");

    public static zzbl zzd() {
        return zze;
    }

    public abstract void zza(Appendable appendable, byte[] bArr, int i, int i4) throws IOException;

    public abstract int zzb(int i);

    public final String zze(byte[] bArr, int i, int i4) {
        zzas.zze(0, i4, bArr.length);
        StringBuilder sb2 = new StringBuilder(zzb(i4));
        try {
            zza(sb2, bArr, 0, i4);
            return sb2.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
