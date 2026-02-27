package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzenz implements zzgob {
    static final /* synthetic */ zzenz zza = new zzenz();

    private /* synthetic */ zzenz() {
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final /* synthetic */ S1.y zza(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        return appSetIdInfo == null ? zzgot.zza(new zzeod(null, -1)) : zzgot.zza(new zzeod(appSetIdInfo.getId(), appSetIdInfo.getScope()));
    }
}
