package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzae {
    public final long zza = androidx.media3.common.C.TIME_UNSET;
    public final long zzb = androidx.media3.common.C.TIME_UNSET;
    public final long zzc = androidx.media3.common.C.TIME_UNSET;
    public final float zzd = -3.4028235E38f;
    public final float zze = -3.4028235E38f;

    static {
        String str = zzeo.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public /* synthetic */ zzae(zzad zzadVar, byte[] bArr) {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzae)) {
            return false;
        }
        long j = ((zzae) obj).zza;
        return true;
    }

    public final int hashCode() {
        int i = (int) (-9223372034707292159L);
        return Float.floatToIntBits(-3.4028235E38f) + ((Float.floatToIntBits(-3.4028235E38f) + (((((i * 31) + i) * 31) + i) * 31)) * 31);
    }
}
