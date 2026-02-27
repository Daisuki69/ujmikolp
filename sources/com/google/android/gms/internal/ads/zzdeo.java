package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdeo extends zzdbq {
    public zzdeo(Set set) {
        super(set);
    }

    public final synchronized void zza(@Nullable final com.google.android.gms.ads.nonagon.signalgeneration.zzbj zzbjVar) {
        zzs(new zzdbp() { // from class: com.google.android.gms.internal.ads.zzden
            @Override // com.google.android.gms.internal.ads.zzdbp
            public final /* synthetic */ void zza(Object obj) {
                ((zzdel) obj).zzd(zzbjVar);
            }
        });
    }

    public final synchronized void zzb(@Nullable final String str) {
        zzs(new zzdbp() { // from class: com.google.android.gms.internal.ads.zzdem
            @Override // com.google.android.gms.internal.ads.zzdbp
            public final /* synthetic */ void zza(Object obj) {
                ((zzdel) obj).zze(str);
            }
        });
    }
}
