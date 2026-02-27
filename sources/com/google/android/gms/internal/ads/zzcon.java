package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class zzcon extends zzcok {
    private final Context zzc;
    private final View zzd;

    @Nullable
    private final zzcek zze;
    private final zzfck zzf;
    private final zzcqq zzg;
    private final zzdje zzh;
    private final zzdeb zzi;
    private final zzhpr zzj;
    private final Executor zzk;
    private com.google.android.gms.ads.internal.client.zzr zzl;

    public zzcon(zzcqr zzcqrVar, Context context, zzfck zzfckVar, View view, @Nullable zzcek zzcekVar, zzcqq zzcqqVar, zzdje zzdjeVar, zzdeb zzdebVar, zzhpr zzhprVar, Executor executor) {
        super(zzcqrVar);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzcekVar;
        this.zzf = zzfckVar;
        this.zzg = zzcqqVar;
        this.zzh = zzdjeVar;
        this.zzi = zzdebVar;
        this.zzj = zzhprVar;
        this.zzk = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzcok
    public final View zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcok
    public final void zzb(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        zzcek zzcekVar;
        if (viewGroup == null || (zzcekVar = this.zze) == null) {
            return;
        }
        zzcekVar.zzaf(zzcgt.zza(zzrVar));
        viewGroup.setMinimumHeight(zzrVar.zzc);
        viewGroup.setMinimumWidth(zzrVar.zzf);
        this.zzl = zzrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcok
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzed zzc() {
        try {
            return this.zzg.zza();
        } catch (zzfdj unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcok
    public final zzfck zze() {
        com.google.android.gms.ads.internal.client.zzr zzrVar = this.zzl;
        if (zzrVar != null) {
            return zzfdi.zzb(zzrVar);
        }
        zzfcj zzfcjVar = this.zzb;
        if (zzfcjVar.zzac) {
            for (String str : zzfcjVar.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.zzd;
            return new zzfck(view.getWidth(), view.getHeight(), false);
        }
        return (zzfck) zzfcjVar.zzr.get(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcok
    public final zzfck zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcok
    public final int zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziC)).booleanValue() && this.zzb.zzag) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziD)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcok
    public final int zzh() {
        return this.zza.zzb.zzb.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcok
    public final void zzi() {
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcqs
    public final void zzj() {
        this.zzk.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcom
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzk();
            }
        });
        super.zzj();
    }

    public final /* synthetic */ void zzk() {
        zzbhh zzbhhVarZzd = this.zzh.zzd();
        if (zzbhhVarZzd == null) {
            return;
        }
        try {
            zzbhhVarZzd.zze((com.google.android.gms.ads.internal.client.zzbx) this.zzj.zzb(), ObjectWrapper.wrap(this.zzc));
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("RemoteException when notifyAdLoad is called", e);
        }
    }
}
