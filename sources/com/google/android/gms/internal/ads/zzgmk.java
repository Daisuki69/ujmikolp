package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzgmk {
    private static final zzgmk zza = new zzgmh("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final zzgmk zzb = new zzgmh("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    private static final zzgmk zzc;

    static {
        new zzgmj("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new zzgmj("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        zzc = new zzgmg("base16()", "0123456789ABCDEF");
    }

    public static zzgmk zzl() {
        return zza;
    }

    public static zzgmk zzm() {
        return zzb;
    }

    public static zzgmk zzn() {
        return zzc;
    }

    public abstract void zza(Appendable appendable, byte[] bArr, int i, int i4) throws IOException;

    public abstract int zzb(byte[] bArr, CharSequence charSequence) throws zzgmi;

    public abstract int zzd(int i);

    public abstract int zzf(int i);

    public CharSequence zzg(CharSequence charSequence) {
        throw null;
    }

    public abstract zzgmk zzh();

    public abstract zzgmk zzi();

    public final String zzj(byte[] bArr, int i, int i4) {
        zzghc.zzo(0, i4, bArr.length);
        StringBuilder sb2 = new StringBuilder(zzd(i4));
        try {
            zza(sb2, bArr, 0, i4);
            return sb2.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final byte[] zzk(CharSequence charSequence) {
        try {
            CharSequence charSequenceZzg = zzg(charSequence);
            int iZzf = zzf(charSequenceZzg.length());
            byte[] bArr = new byte[iZzf];
            int iZzb = zzb(bArr, charSequenceZzg);
            if (iZzb == iZzf) {
                return bArr;
            }
            byte[] bArr2 = new byte[iZzb];
            System.arraycopy(bArr, 0, bArr2, 0, iZzb);
            return bArr2;
        } catch (zzgmi e) {
            throw new IllegalArgumentException(e);
        }
    }
}
