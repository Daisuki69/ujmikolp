package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzevu implements zzeup {
    private final Executor zza;
    private final String zzb;

    public zzevu(zzbyn zzbynVar, Executor executor, String str, @Nullable PackageInfo packageInfo, int i) {
        this.zza = executor;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final S1.y zza() {
        S1.y yVarZza = zzgot.zza(this.zzb);
        zzevt zzevtVar = zzevt.zza;
        Executor executor = this.zza;
        return zzgot.zzh(zzgot.zzk(yVarZza, zzevtVar, executor), Throwable.class, new zzgob() { // from class: com.google.android.gms.internal.ads.zzevs
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ S1.y zza(Object obj) {
                return this.zza.zzc((Throwable) obj);
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 41;
    }

    public final /* synthetic */ S1.y zzc(Throwable th2) {
        return zzgot.zza(new zzevv(this.zzb));
    }
}
