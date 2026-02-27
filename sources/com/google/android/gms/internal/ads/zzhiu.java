package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhiu {
    static final Charset zza;
    public static final byte[] zzb;
    public static final ByteBuffer zzc;

    static {
        Charset.forName("US-ASCII");
        zza = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        zzb = bArr;
        zzc = ByteBuffer.wrap(bArr);
        zzhhg.zzG(bArr, 0, 0, false);
    }

    public static Object zza(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int zzb(boolean z4) {
        return z4 ? 1231 : 1237;
    }

    public static int zzc(int i, byte[] bArr, int i4, int i6) {
        for (int i10 = i4; i10 < i4 + i6; i10++) {
            i = (i * 31) + bArr[i10];
        }
        return i;
    }
}
