package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzeiy implements zzcxb {
    boolean zza;
    final /* synthetic */ zzeec zzb;
    final /* synthetic */ zzbzm zzc;

    public zzeiy(zzejb zzejbVar, zzeec zzeecVar, zzbzm zzbzmVar) {
        this.zzb = zzeecVar;
        this.zzc = zzbzmVar;
        Objects.requireNonNull(zzejbVar);
        this.zza = false;
    }

    private final synchronized void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i = 1;
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfY)).booleanValue()) {
            i = 3;
        }
        this.zzc.zzd(new zzeed(i, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcxb
    public final synchronized void zza() {
        this.zzc.zzc(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcxb
    public final synchronized void zzb(int i) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(new com.google.android.gms.ads.internal.client.zze(i, zzejb.zze(this.zzb.zza, i), AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzcxb
    public final synchronized void zzc(int i, @Nullable String str) {
        try {
            if (this.zza) {
                return;
            }
            this.zza = true;
            if (str == null) {
                str = zzejb.zze(this.zzb.zza, i);
            }
            zze(new com.google.android.gms.ads.internal.client.zze(i, str, AdError.UNDEFINED_DOMAIN, null, null));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxb
    public final synchronized void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(zzeVar);
    }
}
