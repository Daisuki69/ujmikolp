package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzevx implements zzgob {
    static final /* synthetic */ zzevx zza = new zzevx();

    private /* synthetic */ zzevx() {
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final /* synthetic */ S1.y zza(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        return appSetIdInfo == null ? zzgot.zza(new zzevz(null, -1)) : zzgot.zza(new zzevz(appSetIdInfo.getId(), appSetIdInfo.getScope()));
    }
}
