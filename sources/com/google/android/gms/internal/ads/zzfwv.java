package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfwv implements zzfvv {
    private final zzfui zza;
    private final zzfwr zzb;
    private final zzfwo zzc;
    private final ExecutorService zzd;
    private final zzgea zze;
    private final AtomicReference zzf = new AtomicReference();

    public zzfwv(zzfui zzfuiVar, zzfwr zzfwrVar, zzfwo zzfwoVar, ExecutorService executorService, zzgea zzgeaVar) {
        this.zza = zzfuiVar;
        this.zzb = zzfwrVar;
        this.zzc = zzfwoVar;
        this.zzd = executorService;
        this.zze = zzgeaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvv
    public final S1.y zza() {
        zzfwr zzfwrVar = this.zzb;
        zzfui zzfuiVar = this.zza;
        zzgol zzgolVar = (zzgol) zzgot.zzk(zzgol.zzw(zzfwrVar.zzb(zzfuiVar.zzC(), zzfuiVar.zza())), new zzggr() { // from class: com.google.android.gms.internal.ads.zzfwu
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                zzfwn zzfwnVar = (zzfwn) obj;
                this.zza.zzf(zzfwnVar);
                return zzfwnVar;
            }
        }, zzgpk.zza());
        zzgot.zzq(zzgolVar, new zzfwt(this), this.zzd);
        return zzgolVar;
    }

    public final S1.y zzb(Context context) {
        return ((zzfwn) this.zzf.get()).zzc(context);
    }

    public final S1.y zzc(Context context, String str, View view, Activity activity) {
        return ((zzfwn) this.zzf.get()).zzd(context, null, view, activity);
    }

    public final S1.y zzd(Context context, String str, View view, Activity activity) {
        return ((zzfwn) this.zzf.get()).zze(context, str, view, null);
    }

    public final void zze(InputEvent inputEvent) {
        zzfwn zzfwnVar = (zzfwn) this.zzf.get();
        if (zzfwnVar == null) {
            this.zze.zzb(54);
        } else {
            zzfwnVar.zzf(inputEvent);
        }
    }

    public final /* synthetic */ zzfwn zzf(zzfwn zzfwnVar) {
        this.zzf.set(zzfwnVar);
        return zzfwnVar;
    }

    public final /* synthetic */ zzfwo zzg() {
        return this.zzc;
    }

    public final int zzh() {
        zzfwn zzfwnVar = (zzfwn) this.zzf.get();
        if (zzfwnVar == null) {
            return 1;
        }
        return zzfwnVar.zzg();
    }
}
