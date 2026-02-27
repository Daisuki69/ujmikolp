package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgyp {
    public static final zzhgg zza = zzhgg.zza(new byte[0]);

    public static final zzhgg zza(int i) {
        return zzhgg.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final zzhgg zzb(int i) {
        return zzhgg.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
