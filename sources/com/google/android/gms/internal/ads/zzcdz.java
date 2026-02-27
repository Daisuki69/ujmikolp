package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcdz extends zzcaj {
    private final zzcbe zzc;

    @Nullable
    private zzcea zzd;
    private Uri zze;
    private zzcai zzf;
    private boolean zzg;
    private int zzh;

    public zzcdz(Context context, zzcbe zzcbeVar) {
        super(context);
        this.zzh = 1;
        this.zzg = false;
        this.zzc = zzcbeVar;
        zzcbeVar.zza(this);
    }

    private final boolean zzu() {
        int i = this.zzh;
        return (i == 1 || i == 2 || this.zzd == null) ? false : true;
    }

    private final void zzv(int i) {
        if (i == 4) {
            this.zzc.zze();
            this.zzb.zzd();
        } else if (this.zzh == 4) {
            this.zzc.zzf();
            this.zzb.zze();
        }
        this.zzh = i;
    }

    @Override // android.view.View
    public final String toString() {
        String name = zzcdz.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return We.s.q(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final String zza() {
        return "ImmersivePlayer";
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzb(zzcai zzcaiVar) {
        this.zzf = zzcaiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzc(@Nullable String str) {
        if (str != null) {
            Uri uri = Uri.parse(str);
            this.zze = uri;
            this.zzd = new zzcea(uri.toString());
            zzv(3);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdy
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzr();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzd() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView stop");
        zzcea zzceaVar = this.zzd;
        if (zzceaVar != null) {
            zzceaVar.zzd();
            this.zzd = null;
            zzv(1);
        }
        this.zzc.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zze() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView play");
        if (zzu()) {
            this.zzd.zzb();
            zzv(4);
            this.zza.zza();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzs();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzf() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView pause");
        if (zzu() && this.zzd.zza()) {
            this.zzd.zzc();
            zzv(5);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdx
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzt();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final int zzg() {
        return zzu() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final int zzh() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzi(int i) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 27);
        sb2.append("AdImmersivePlayerView seek ");
        sb2.append(i);
        com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzj(float f, float f3) {
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final int zzk() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final int zzl() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final long zzm() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final long zzn() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final long zzo() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final int zzp() {
        return zzu() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj, com.google.android.gms.internal.ads.zzcbg
    public final void zzq() {
        if (this.zzd != null) {
            this.zzb.zzc();
        }
    }

    public final /* synthetic */ void zzr() {
        zzcai zzcaiVar = this.zzf;
        if (zzcaiVar != null) {
            zzcaiVar.zzb();
        }
    }

    public final /* synthetic */ void zzs() {
        zzcai zzcaiVar = this.zzf;
        if (zzcaiVar != null) {
            if (!this.zzg) {
                zzcaiVar.zzk();
                this.zzg = true;
            }
            this.zzf.zzc();
        }
    }

    public final /* synthetic */ void zzt() {
        zzcai zzcaiVar = this.zzf;
        if (zzcaiVar != null) {
            zzcaiVar.zzd();
        }
    }
}
