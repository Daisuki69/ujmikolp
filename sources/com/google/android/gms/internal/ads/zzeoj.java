package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeoj implements zzeup {
    private final zzgpd zza;
    private final VersionInfoParcel zzb;

    public zzeoj(VersionInfoParcel versionInfoParcel, zzgpd zzgpdVar) {
        this.zzb = versionInfoParcel;
        this.zza = zzgpdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final S1.y zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzeoi
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 54;
    }

    public final /* synthetic */ zzeok zzc() {
        return zzeok.zzc(this.zzb);
    }
}
