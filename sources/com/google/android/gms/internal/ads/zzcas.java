package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcas {
    private final Context zza;
    private final zzcbd zzb;
    private final ViewGroup zzc;

    @Nullable
    private final zzdsm zzd;
    private zzcar zze;

    public zzcas(Context context, ViewGroup viewGroup, zzcek zzcekVar, @Nullable zzdsm zzdsmVar) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzcekVar;
        this.zze = null;
        this.zzd = zzdsmVar;
    }

    @Nullable
    public final Integer zza() {
        zzcar zzcarVar = this.zze;
        if (zzcarVar != null) {
            return zzcarVar.zzl();
        }
        return null;
    }

    public final void zzb(int i, int i4, int i6, int i10) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzcar zzcarVar = this.zze;
        if (zzcarVar != null) {
            zzcarVar.zzn(i, i4, i6, i10);
        }
    }

    public final void zzc(int i, int i4, int i6, int i10, int i11, boolean z4, zzcbc zzcbcVar) {
        if (this.zze != null) {
            return;
        }
        zzcbd zzcbdVar = this.zzb;
        zzbcp.zza(zzcbdVar.zzq().zzc(), zzcbdVar.zzi(), "vpr2");
        zzcar zzcarVar = new zzcar(this.zza, zzcbdVar, i11, z4, zzcbdVar.zzq().zzc(), zzcbcVar, this.zzd);
        this.zze = zzcarVar;
        this.zzc.addView(zzcarVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.zze.zzn(i, i4, i6, i10);
        zzcbdVar.zzds(false);
    }

    public final zzcar zzd() {
        return this.zze;
    }

    public final void zze() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzcar zzcarVar = this.zze;
        if (zzcarVar != null) {
            zzcarVar.zzr();
        }
    }

    public final void zzf() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzcar zzcarVar = this.zze;
        if (zzcarVar != null) {
            zzcarVar.zzE();
            this.zzc.removeView(this.zze);
            this.zze = null;
        }
    }

    public final void zzg(int i) {
        zzcar zzcarVar = this.zze;
        if (zzcarVar != null) {
            zzcarVar.zzm(i);
        }
    }
}
