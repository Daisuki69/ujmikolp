package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdaw extends zzdbq implements zzbid {
    public zzdaw(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbid
    public final synchronized void zzb(final String str, final String str2) {
        zzs(new zzdbp() { // from class: com.google.android.gms.internal.ads.zzdav
            @Override // com.google.android.gms.internal.ads.zzdbp
            public final /* synthetic */ void zza(Object obj) {
                ((AppEventListener) obj).onAppEvent(str, str2);
            }
        });
    }
}
