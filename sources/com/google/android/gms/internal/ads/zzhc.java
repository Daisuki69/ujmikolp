package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(24)
final class zzhc {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = androidx.media3.common.util.d.e();

    public /* synthetic */ zzhc(MediaCodec.CryptoInfo cryptoInfo, byte[] bArr) {
        this.zza = cryptoInfo;
    }

    public final /* synthetic */ void zza(int i, int i4) {
        MediaCodec.CryptoInfo.Pattern pattern = this.zzb;
        pattern.set(i, i4);
        this.zza.setPattern(pattern);
    }
}
