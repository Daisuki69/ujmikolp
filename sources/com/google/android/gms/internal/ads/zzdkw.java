package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdkw implements zzdjc, zzdau {

    @Nullable
    private final zzbpm zza;
    private final zzcwk zzb;
    private final zzcyl zzc;
    private final zzcvq zzd;
    private final zzddx zze;
    private final Context zzf;
    private final zzfcj zzg;
    private final VersionInfoParcel zzh;
    private final zzfdc zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private boolean zzl = true;

    @Nullable
    private final zzbpi zzm;

    @Nullable
    private final zzbpj zzn;

    public zzdkw(@Nullable zzbpi zzbpiVar, @Nullable zzbpj zzbpjVar, @Nullable zzbpm zzbpmVar, zzcwk zzcwkVar, zzcyl zzcylVar, zzcvq zzcvqVar, zzddx zzddxVar, Context context, zzfcj zzfcjVar, VersionInfoParcel versionInfoParcel, zzfdc zzfdcVar) {
        this.zzm = zzbpiVar;
        this.zzn = zzbpjVar;
        this.zza = zzbpmVar;
        this.zzb = zzcwkVar;
        this.zzc = zzcylVar;
        this.zzd = zzcvqVar;
        this.zze = zzddxVar;
        this.zzf = context;
        this.zzg = zzfcjVar;
        this.zzh = versionInfoParcel;
        this.zzi = zzfdcVar;
    }

    private static final HashMap zzB(Map map) {
        HashMap map2 = new HashMap();
        if (map == null) {
            return map2;
        }
        synchronized (map) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        map2.put((String) entry.getKey(), view);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return map2;
    }

    private final void zzi(View view) {
        try {
            zzbpm zzbpmVar = this.zza;
            if (zzbpmVar != null && !zzbpmVar.zzu()) {
                zzbpmVar.zzw(ObjectWrapper.wrap(view));
                this.zzd.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlB)).booleanValue()) {
                    this.zze.zzdz();
                    return;
                }
                return;
            }
            zzbpi zzbpiVar = this.zzm;
            if (zzbpiVar != null && !zzbpiVar.zzq()) {
                zzbpiVar.zzn(ObjectWrapper.wrap(view));
                this.zzd.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlB)).booleanValue()) {
                    this.zze.zzdz();
                    return;
                }
                return;
            }
            zzbpj zzbpjVar = this.zzn;
            if (zzbpjVar == null || zzbpjVar.zzo()) {
                return;
            }
            zzbpjVar.zzl(ObjectWrapper.wrap(view));
            this.zzd.onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlB)).booleanValue()) {
                this.zze.zzdz();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call handleClick", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzA() {
        try {
            zzbpm zzbpmVar = this.zza;
            if (zzbpmVar != null) {
                zzbpmVar.zzC();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call destroy", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00cf A[Catch: RemoteException -> 0x002b, JSONException -> 0x0047, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0047, blocks: (B:49:0x00b4, B:50:0x00c9, B:52:0x00cf), top: B:71:0x00b4 }] */
    @Override // com.google.android.gms.internal.ads.zzdjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(android.view.View r9, @androidx.annotation.Nullable java.util.Map r10, @androidx.annotation.Nullable java.util.Map r11, android.view.View.OnTouchListener r12, android.view.View.OnClickListener r13) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdkw.zza(android.view.View, java.util.Map, java.util.Map, android.view.View$OnTouchListener, android.view.View$OnClickListener):void");
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzb(View view, @Nullable Map map) {
        try {
            IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(view);
            zzbpm zzbpmVar = this.zza;
            if (zzbpmVar != null) {
                zzbpmVar.zzy(iObjectWrapperWrap);
                return;
            }
            zzbpi zzbpiVar = this.zzm;
            if (zzbpiVar != null) {
                zzbpiVar.zzs(iObjectWrapperWrap);
                return;
            }
            zzbpj zzbpjVar = this.zzn;
            if (zzbpjVar != null) {
                zzbpjVar.zzq(iObjectWrapperWrap);
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call untrackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzc(View view, @Nullable View view2, @Nullable Map map, @Nullable Map map2, boolean z4, @Nullable ImageView.ScaleType scaleType) {
        if (this.zzk && this.zzg.zzL) {
            return;
        }
        zzi(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzd(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdau
    public final void zzdL() {
        try {
            zzbpm zzbpmVar = this.zza;
            if (zzbpmVar == null || !zzbpmVar.zzt()) {
                return;
            }
            zzfcj zzfcjVar = this.zzg;
            if (zzfcjVar.zze != 4 && !zzfcjVar.zzaD) {
                return;
            }
            zzbpmVar.zzv();
            this.zzb.zza();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to report impression from an adapter", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdau
    public final void zzdM() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zze(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzf(View view, View view2, Map map, Map map2, boolean z4, @Nullable ImageView.ScaleType scaleType, int i) {
        if (!this.zzk) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.zzg.zzL) {
            zzi(view2);
        } else {
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzg() {
        this.zzk = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final boolean zzh() {
        return this.zzg.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzj(View view, MotionEvent motionEvent, @Nullable View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzk(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    @Nullable
    public final JSONObject zzl(View view, Map map, Map map2, @Nullable ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    @Nullable
    public final JSONObject zzm(View view, Map map, Map map2, @Nullable ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzn() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzo(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzp(zzbhn zzbhnVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzr(@Nullable com.google.android.gms.ads.internal.client.zzdj zzdjVar) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzs(com.google.android.gms.ads.internal.client.zzdf zzdfVar) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzt() {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final int zzu() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final boolean zzv() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzw(@Nullable View view, @Nullable Map map, @Nullable Map map2, @Nullable ImageView.ScaleType scaleType) {
        try {
            if (!this.zzj) {
                this.zzj = com.google.android.gms.ads.internal.zzt.zzo().zzg(this.zzf, this.zzh.afmaVersion, this.zzg.zzC.toString(), this.zzi.zzg);
            }
            if (this.zzl) {
                zzbpm zzbpmVar = this.zza;
                if (zzbpmVar == null) {
                    zzbpi zzbpiVar = this.zzm;
                    if (zzbpiVar != null && !zzbpiVar.zzp()) {
                        zzbpiVar.zzm();
                        this.zzb.zza();
                        return;
                    }
                    zzbpj zzbpjVar = this.zzn;
                    if (zzbpjVar == null || zzbpjVar.zzn()) {
                        return;
                    }
                    zzbpjVar.zzk();
                    this.zzb.zza();
                    return;
                }
                zzfcj zzfcjVar = this.zzg;
                if (zzfcjVar.zzaD) {
                    if (zzbpmVar.zzt()) {
                        return;
                    }
                    zzbpmVar.zzv();
                    this.zzb.zza();
                    return;
                }
                if (zzbpmVar.zzt() && zzfcjVar.zze == 4) {
                    this.zzc.zza();
                } else {
                    zzbpmVar.zzv();
                    this.zzb.zza();
                }
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call recordImpression", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzx(@Nullable View view, @Nullable Map map, @Nullable Map map2, @Nullable ImageView.ScaleType scaleType) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzy() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final boolean zzz(Bundle bundle) {
        return false;
    }
}
