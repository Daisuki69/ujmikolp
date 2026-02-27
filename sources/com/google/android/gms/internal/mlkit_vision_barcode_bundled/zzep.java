package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class zzep {
    static final Charset zza;
    public static final byte[] zzb;

    static {
        Charset.forName("US-ASCII");
        zza = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        zzb = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new zzdh(bArr, 0, 0, false, null).zza(0);
        } catch (zzer e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int zza(boolean z4) {
        return z4 ? 1231 : 1237;
    }

    public static int zzb(int i, byte[] bArr, int i4, int i6) {
        for (int i10 = i4; i10 < i4 + i6; i10++) {
            i = (i * 31) + bArr[i10];
        }
        return i;
    }

    public static Object zzc(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }
}
