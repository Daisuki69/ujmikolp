package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdwd implements com.google.android.gms.ads.internal.overlay.zzq, zzcgg {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private zzdvs zzc;
    private zzcek zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzdn zzh;
    private boolean zzi;

    public zzdwd(Context context, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = versionInfoParcel;
    }

    private final synchronized boolean zzq(com.google.android.gms.ads.internal.client.zzdn zzdnVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjI)).booleanValue()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Ad inspector had an internal error.");
            try {
                zzdnVar.zze(zzfee.zzd(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.zzc == null) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Ad inspector had an internal error.");
            try {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(new NullPointerException("InspectorManager null"), "InspectorUi.shouldOpenUi");
                zzdnVar.zze(zzfee.zzd(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.zze && !this.zzf) {
            if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() >= this.zzg + ((long) ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjL)).intValue())) {
                return true;
            }
        }
        int i6 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Ad inspector cannot be opened because it is already open.");
        try {
            zzdnVar.zze(zzfee.zzd(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcgg
    public final synchronized void zza(boolean z4, int i, String str, String str2) {
        if (z4) {
            com.google.android.gms.ads.internal.util.zze.zza("Ad inspector loaded.");
            this.zze = true;
            zzn();
            return;
        }
        int i4 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Ad inspector failed to load.");
        try {
            zzbyv zzbyvVarZzh = com.google.android.gms.ads.internal.zzt.zzh();
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 46 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
            sb2.append("Failed to load UI. Error code: ");
            sb2.append(i);
            sb2.append(", Description: ");
            sb2.append(str);
            sb2.append(", Failing URL: ");
            sb2.append(str2);
            zzbyvVarZzh.zzg(new Exception(sb2.toString()), "InspectorUi.onAdWebViewFinishedLoading 0");
            com.google.android.gms.ads.internal.client.zzdn zzdnVar = this.zzh;
            if (zzdnVar != null) {
                zzdnVar.zze(zzfee.zzd(17, null, null));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "InspectorUi.onAdWebViewFinishedLoading 1");
        }
        this.zzi = true;
        this.zzd.destroy();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdA() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdB() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdC() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdD() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdE() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdX() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final synchronized void zzdY(int i) {
        this.zzd.destroy();
        if (!this.zzi) {
            com.google.android.gms.ads.internal.util.zze.zza("Inspector closed.");
            com.google.android.gms.ads.internal.client.zzdn zzdnVar = this.zzh;
            if (zzdnVar != null) {
                try {
                    zzdnVar.zze(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.zzf = false;
        this.zze = false;
        this.zzg = 0L;
        this.zzi = false;
        this.zzh = null;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdt() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdu() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdv() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final synchronized void zzh() {
        this.zzf = true;
        zzn();
    }

    public final void zzl(zzdvs zzdvsVar) {
        this.zzc = zzdvsVar;
    }

    public final synchronized void zzm(com.google.android.gms.ads.internal.client.zzdn zzdnVar, zzbkg zzbkgVar, zzbjz zzbjzVar, zzbjm zzbjmVar) {
        if (zzq(zzdnVar)) {
            try {
                com.google.android.gms.ads.internal.zzt.zzd();
                zzcek zzcekVarZza = zzcfa.zza(this.zza, zzcgt.zzb(), "", false, false, null, null, this.zzb, null, null, null, zzbbh.zza(), null, null, null, null, null);
                this.zzd = zzcekVarZza;
                zzcgi zzcgiVarZzP = zzcekVarZza.zzP();
                if (zzcgiVarZzP == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to obtain a web view for the ad inspector");
                    try {
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(new NullPointerException("Failed to obtain a web view for the ad inspector"), "InspectorUi.openInspector 2");
                        zzdnVar.zze(zzfee.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "InspectorUi.openInspector 3");
                        return;
                    }
                }
                this.zzh = zzdnVar;
                Context context = this.zza;
                zzcgiVarZzP.zzZ(null, null, null, null, null, false, null, null, null, null, null, null, null, zzbkgVar, null, new zzbkf(context), zzbjzVar, zzbjmVar, null, null, null);
                zzcgiVarZzP.zzG(this);
                this.zzd.loadUrl((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjJ));
                com.google.android.gms.ads.internal.zzt.zzb();
                com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel(this, this.zzd, 1, this.zzb), true, null);
                this.zzg = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            } catch (zzcez e7) {
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to obtain a web view for the ad inspector", e7);
                try {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e7, "InspectorUi.openInspector 0");
                    zzdnVar.zze(zzfee.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e10) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "InspectorUi.openInspector 1");
                }
            }
        }
    }

    public final synchronized void zzn() {
        if (this.zze && this.zzf) {
            zzbzh.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwc
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzp();
                }
            });
        }
    }

    @Nullable
    public final Activity zzo() {
        zzcek zzcekVar = this.zzd;
        if (zzcekVar == null || zzcekVar.zzX()) {
            return null;
        }
        return this.zzd.zzj();
    }

    public final /* synthetic */ void zzp() {
        this.zzd.zzc("window.inspectorInfo", this.zzc.zzr().toString());
    }
}
