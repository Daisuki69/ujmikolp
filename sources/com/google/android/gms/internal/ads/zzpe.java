package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import dOYHB6.yFtIp6.ht2aO8;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzpe {
    private final Context zza;
    private final zzpd zzb;
    private final Handler zzc;
    private final zzpa zzd;
    private final BroadcastReceiver zze;

    @Nullable
    private final zzpb zzf;

    @Nullable
    private zzoz zzg;

    @Nullable
    private AudioDeviceInfo zzh;
    private zzc zzi;
    private boolean zzj;

    /* JADX WARN: Multi-variable type inference failed */
    public zzpe(Context context, zzpd zzpdVar, zzc zzcVar, @Nullable AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.zza = applicationContext;
        this.zzb = zzpdVar;
        this.zzi = zzcVar;
        this.zzh = audioDeviceInfo;
        Handler handler = new Handler(zzeo.zze(), null);
        this.zzc = handler;
        this.zzd = new zzpa(this, 0 == true ? 1 : 0);
        this.zze = new zzpc(this, 0 == true ? 1 : 0);
        Uri uriZzc = zzoz.zzc();
        this.zzf = uriZzc != null ? new zzpb(this, handler, applicationContext.getContentResolver(), uriZzc) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final void zzf(zzoz zzozVar) {
        if (!this.zzj || zzozVar.equals(this.zzg)) {
            return;
        }
        this.zzg = zzozVar;
        this.zzb.zza(zzozVar);
    }

    public final void zza(zzoz zzozVar) {
        zzf(zzozVar);
    }

    public final void zzb(zzc zzcVar) {
        this.zzi = zzcVar;
        zzf(zzoz.zza(this.zza, zzcVar, this.zzh));
    }

    public final void zzc(@Nullable AudioDeviceInfo audioDeviceInfo) {
        if (Objects.equals(audioDeviceInfo, this.zzh)) {
            return;
        }
        this.zzh = audioDeviceInfo;
        zzf(zzoz.zza(this.zza, this.zzi, audioDeviceInfo));
    }

    public final zzoz zzd() {
        if (this.zzj) {
            zzoz zzozVar = this.zzg;
            zzozVar.getClass();
            return zzozVar;
        }
        this.zzj = true;
        zzpb zzpbVar = this.zzf;
        if (zzpbVar != null) {
            zzpbVar.zza();
        }
        Context context = this.zza;
        zzpa zzpaVar = this.zzd;
        Handler handler = this.zzc;
        zzca.zza(context).registerAudioDeviceCallback(zzpaVar, handler);
        zzoz zzozVarZzb = zzoz.zzb(context, ht2aO8.registerReceiver(context, this.zze, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), this.zzi, this.zzh);
        this.zzg = zzozVarZzb;
        return zzozVarZzb;
    }

    public final void zze() {
        if (this.zzj) {
            this.zzg = null;
            Context context = this.zza;
            zzca.zza(context).unregisterAudioDeviceCallback(this.zzd);
            ht2aO8.unregisterReceiver(context, this.zze);
            zzpb zzpbVar = this.zzf;
            if (zzpbVar != null) {
                zzpbVar.zzb();
            }
            this.zzj = false;
        }
    }

    public final /* synthetic */ Context zzg() {
        return this.zza;
    }

    public final /* synthetic */ AudioDeviceInfo zzh() {
        return this.zzh;
    }

    public final /* synthetic */ void zzi(AudioDeviceInfo audioDeviceInfo) {
        this.zzh = null;
    }

    public final /* synthetic */ zzc zzj() {
        return this.zzi;
    }
}
