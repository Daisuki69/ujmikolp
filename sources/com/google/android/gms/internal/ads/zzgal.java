package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
final class zzgal implements zzfwn {
    private final zzhpr zza;
    private final zzhpr zzb;
    private final ExecutorService zzc;
    private final boolean zzd;
    private final boolean zze;
    private final boolean zzf;

    public zzgal(zzhpr zzhprVar, zzhpr zzhprVar2, ExecutorService executorService, boolean z4, boolean z5, boolean z8) {
        this.zza = zzhprVar;
        this.zzb = zzhprVar2;
        this.zzc = executorService;
        this.zzd = z4;
        this.zze = z5;
        this.zzf = z8;
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final String zza() {
        return ((zzgbn) this.zzb.zzb()).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final S1.y zzb() {
        if (this.zzf) {
            return (zzgol) zzgot.zzj((zzgol) zzgot.zzg(zzgol.zzw(((zzgbc) this.zza.zzb()).zza()), Throwable.class, zzgak.zza, zzgpk.zza()), new zzgob() { // from class: com.google.android.gms.internal.ads.zzgai
                @Override // com.google.android.gms.internal.ads.zzgob
                public final /* synthetic */ S1.y zza(Object obj) {
                    return this.zza.zzi((zzgbb) obj);
                }
            }, zzgpk.zza());
        }
        S1.y yVarZzb = ((zzgbn) this.zzb.zzb()).zzb();
        zzh();
        return yVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final S1.y zzc(Context context) {
        if (!this.zzd) {
            zzh();
        }
        return ((zzgbn) this.zzb.zzb()).zzc(context);
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final S1.y zzd(Context context, String str, View view, Activity activity) {
        if (!this.zzd) {
            zzh();
        }
        return ((zzgbn) this.zzb.zzb()).zzd(context, null, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final S1.y zze(Context context, String str, View view, Activity activity) {
        if (!this.zzd) {
            zzh();
        }
        return ((zzgbn) this.zzb.zzb()).zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final void zzf(InputEvent inputEvent) {
        ((zzgbn) this.zzb.zzb()).zzf(inputEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final int zzg() {
        ((zzgbn) this.zzb.zzb()).zzg();
        return 3;
    }

    public final S1.y zzh() {
        try {
            return zzgot.zzj(((zzgbc) this.zza.zzb()).zza(), new zzgob() { // from class: com.google.android.gms.internal.ads.zzgaj
                @Override // com.google.android.gms.internal.ads.zzgob
                public final /* synthetic */ S1.y zza(Object obj) {
                    return this.zza.zzj((zzgbb) obj);
                }
            }, this.zzc);
        } catch (Throwable th2) {
            return zzgot.zzc(th2);
        }
    }

    public final /* synthetic */ S1.y zzi(zzgbb zzgbbVar) {
        return ((zzgbn) this.zzb.zzb()).zzb();
    }

    public final /* synthetic */ S1.y zzj(zzgbb zzgbbVar) {
        return (this.zze && zzgbbVar == zzgbb.RESULT_UPDATED) ? ((zzgbn) this.zzb.zzb()).zzb() : zzgot.zzb();
    }
}
