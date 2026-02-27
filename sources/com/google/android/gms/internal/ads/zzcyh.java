package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcyh extends zzdbq implements zzcwm, zzcxr {
    private final zzfcj zzb;
    private final AtomicBoolean zzc;
    private final zzfcu zzd;

    public zzcyh(Set set, zzfcj zzfcjVar, zzfcu zzfcuVar) {
        super(set);
        this.zzc = new AtomicBoolean();
        this.zzb = zzfcjVar;
        this.zzd = zzfcuVar;
    }

    private final void zzb() {
        final com.google.android.gms.ads.internal.client.zzt zztVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziA)).booleanValue() && this.zzc.compareAndSet(false, true) && (zztVar = this.zzb.zzae) != null && zztVar.zza == 3) {
            zzs(new zzdbp() { // from class: com.google.android.gms.internal.ads.zzcyg
                @Override // com.google.android.gms.internal.ads.zzdbp
                public final /* synthetic */ void zza(Object obj) {
                    ((zzcyj) obj).zzm(zztVar);
                }
            });
        }
    }

    public final void zza(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        if (com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zza(this.zzd) && this.zzb.zzaB) {
            zzs(new zzdbp() { // from class: com.google.android.gms.internal.ads.zzcyf
                @Override // com.google.android.gms.internal.ads.zzdbp
                public final /* synthetic */ void zza(Object obj) {
                    ((zzcyj) obj).zzm(zztVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdw() {
        int i = this.zzb.zzb;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxr
    public final void zzl() {
        if (this.zzb.zzb == 1) {
            zzb();
        }
    }
}
