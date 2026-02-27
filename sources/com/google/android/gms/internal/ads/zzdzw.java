package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdzw {
    private final zzgpd zza;
    private final zzdzb zzb;
    private final zzhpr zzc;

    public zzdzw(zzgpd zzgpdVar, zzdzb zzdzbVar, zzhpr zzhprVar) {
        this.zza = zzgpdVar;
        this.zzb = zzdzbVar;
        this.zzc = zzhprVar;
    }

    private final S1.y zzg(final zzbuv zzbuvVar, zzdzm zzdzmVar, final zzdzm zzdzmVar2, final zzgob zzgobVar) {
        S1.y yVarZzh;
        String str = zzbuvVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzG(str)) {
            yVarZzh = zzgot.zzc(new zzdzk(1));
        } else {
            yVarZzh = zzgot.zzh(zzdzmVar.zza(zzbuvVar), ExecutionException.class, zzdzv.zza, this.zza);
        }
        zzgpd zzgpdVar = this.zza;
        return (zzgol) zzgot.zzh((zzgol) zzgot.zzj((zzgol) zzgot.zzj(zzgol.zzw(yVarZzh), zzdzo.zza, zzgpdVar), zzgobVar, zzgpdVar), zzdzk.class, new zzgob() { // from class: com.google.android.gms.internal.ads.zzdzp
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ S1.y zza(Object obj) {
                return this.zza.zzc(zzdzmVar2, zzbuvVar, zzgobVar, (zzdzk) obj);
            }
        }, zzgpdVar);
    }

    public final S1.y zza(final zzbuv zzbuvVar) {
        zzgob zzgobVar = new zzgob() { // from class: com.google.android.gms.internal.ads.zzdzq
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ S1.y zza(Object obj) {
                String str = new String(zzgmo.zza((InputStream) obj), StandardCharsets.UTF_8);
                zzbuv zzbuvVar2 = zzbuvVar;
                zzbuvVar2.zzj = str;
                return zzgot.zza(zzbuvVar2);
            }
        };
        final zzdzb zzdzbVar = this.zzb;
        Objects.requireNonNull(zzdzbVar);
        return zzg(zzbuvVar, new zzdzm() { // from class: com.google.android.gms.internal.ads.zzdzn
            @Override // com.google.android.gms.internal.ads.zzdzm
            public final /* synthetic */ S1.y zza(zzbuv zzbuvVar2) {
                return zzdzbVar.zza(zzbuvVar2);
            }
        }, new zzdzm() { // from class: com.google.android.gms.internal.ads.zzdzr
            @Override // com.google.android.gms.internal.ads.zzdzm
            public final /* synthetic */ S1.y zza(zzbuv zzbuvVar2) {
                return this.zza.zzd(zzbuvVar2);
            }
        }, zzgobVar);
    }

    public final S1.y zzb(zzbuv zzbuvVar) {
        return zzg(zzbuvVar, new zzdzm() { // from class: com.google.android.gms.internal.ads.zzdzt
            @Override // com.google.android.gms.internal.ads.zzdzm
            public final /* synthetic */ S1.y zza(zzbuv zzbuvVar2) {
                return this.zza.zze(zzbuvVar2);
            }
        }, new zzdzm() { // from class: com.google.android.gms.internal.ads.zzdzu
            @Override // com.google.android.gms.internal.ads.zzdzm
            public final /* synthetic */ S1.y zza(zzbuv zzbuvVar2) {
                return this.zza.zzf(zzbuvVar2);
            }
        }, zzdzs.zza);
    }

    public final /* synthetic */ S1.y zzc(zzdzm zzdzmVar, zzbuv zzbuvVar, zzgob zzgobVar, zzdzk zzdzkVar) {
        return zzgot.zzj(zzdzmVar.zza(zzbuvVar), zzgobVar, this.zza);
    }

    public final /* synthetic */ S1.y zzd(zzbuv zzbuvVar) {
        return ((zzeap) this.zzc.zzb()).zzc(zzbuvVar, Binder.getCallingUid());
    }

    public final /* synthetic */ S1.y zze(zzbuv zzbuvVar) {
        return this.zzb.zzd(zzbuvVar.zzh);
    }

    public final /* synthetic */ S1.y zzf(zzbuv zzbuvVar) {
        return ((zzeap) this.zzc.zzb()).zzd(zzbuvVar.zzh);
    }
}
