package com.google.android.gms.internal.ads;

import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzth implements zztk {
    static final /* synthetic */ zzth zza = new zzth();

    private /* synthetic */ zzth() {
    }

    @Override // com.google.android.gms.internal.ads.zztk
    public final /* synthetic */ int zza(Object obj) {
        int i = zztl.zza;
        String str = ((zzst) obj).zza;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
