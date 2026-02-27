package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioRouting$OnRoutingChangedListener;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(24)
final class zzqw {
    private final AudioTrack zza;
    private final zzpe zzb;
    private final Handler zzc;

    @Nullable
    private AudioRouting$OnRoutingChangedListener zzd = new AudioRouting$OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.zzqv
        public final /* synthetic */ void onRoutingChanged(AudioRouting audioRouting) {
            this.zza.zzb(audioRouting);
        }
    };

    public zzqw(AudioTrack audioTrack, zzpe zzpeVar) {
        this.zza = audioTrack;
        this.zzb = zzpeVar;
        Handler handler = new Handler(Looper.myLooper());
        this.zzc = handler;
        audioTrack.addOnRoutingChangedListener(this.zzd, handler);
    }

    public final void zza() {
        AudioRouting$OnRoutingChangedListener audioRouting$OnRoutingChangedListener = this.zzd;
        audioRouting$OnRoutingChangedListener.getClass();
        this.zza.removeOnRoutingChangedListener(androidx.media3.common.util.d.d(audioRouting$OnRoutingChangedListener));
        this.zzd = null;
    }

    public final /* synthetic */ void zzb(final AudioRouting audioRouting) {
        if (this.zzd == null) {
            return;
        }
        zzcv.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqt
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc(audioRouting);
            }
        });
    }

    public final /* synthetic */ void zzc(AudioRouting audioRouting) {
        final AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
        if (routedDevice != null) {
            this.zzc.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzd(routedDevice);
                }
            });
        }
    }

    public final /* synthetic */ void zzd(AudioDeviceInfo audioDeviceInfo) {
        if (this.zzd == null) {
            return;
        }
        this.zzb.zzc(audioDeviceInfo);
    }
}
