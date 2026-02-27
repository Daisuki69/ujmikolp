package com.google.android.gms.internal.vision;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class zzjf {
    public static final byte[] zzb;
    private static final ByteBuffer zzd;
    private static final zzif zze;
    static final Charset zza = Charset.forName("UTF-8");
    private static final Charset zzc = Charset.forName("ISO-8859-1");

    static {
        byte[] bArr = new byte[0];
        zzb = bArr;
        zzd = ByteBuffer.wrap(bArr);
        zze = zzif.zza(bArr, 0, bArr.length, false);
    }

    public static int zza(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static String zzb(byte[] bArr) {
        return new String(bArr, zza);
    }

    public static int zzc(byte[] bArr) {
        int length = bArr.length;
        int iZza = zza(length, bArr, 0, length);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public static int zza(boolean z4) {
        return z4 ? 1231 : 1237;
    }

    public static <T> T zza(T t5) {
        t5.getClass();
        return t5;
    }

    public static <T> T zza(T t5, String str) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(str);
    }

    public static boolean zza(byte[] bArr) {
        return zzmd.zza(bArr);
    }

    public static int zza(int i, byte[] bArr, int i4, int i6) {
        for (int i10 = i4; i10 < i4 + i6; i10++) {
            i = (i * 31) + bArr[i10];
        }
        return i;
    }

    public static boolean zza(zzkk zzkkVar) {
        boolean z4 = zzkkVar instanceof zzhh;
        return false;
    }

    public static Object zza(Object obj, Object obj2) {
        return ((zzkk) obj).zzp().zza((zzkk) obj2).zze();
    }
}
