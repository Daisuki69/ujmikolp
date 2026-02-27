package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhgg {
    private final byte[] zza;

    private zzhgg(byte[] bArr, int i, int i4) {
        byte[] bArr2 = new byte[i4];
        this.zza = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i4);
    }

    public static zzhgg zza(byte[] bArr) {
        if (bArr != null) {
            return zzb(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static zzhgg zzb(byte[] bArr, int i, int i4) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        int length = bArr.length;
        if (i4 > length) {
            i4 = length;
        }
        return new zzhgg(bArr, 0, i4);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzhgg) {
            return Arrays.equals(((zzhgg) obj).zza, this.zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b8 : bArr) {
            sb2.append("0123456789abcdef".charAt((b8 & 255) >> 4));
            sb2.append("0123456789abcdef".charAt(b8 & 15));
        }
        String string = sb2.toString();
        return We.s.q(new StringBuilder(string.length() + 7), "Bytes(", string, ")");
    }

    public final byte[] zzc() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final int zzd() {
        return this.zza.length;
    }
}
