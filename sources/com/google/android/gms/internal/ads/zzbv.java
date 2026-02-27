package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbv {

    @Nullable
    private AudioManager.OnAudioFocusChangeListener zza;

    @Nullable
    private Handler zzb;
    private zzc zzc = zzc.zza;

    public zzbv(int i) {
    }

    public final zzbv zza(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.zza = onAudioFocusChangeListener;
        this.zzb = handler;
        return this;
    }

    public final zzbv zzb(zzc zzcVar) {
        this.zzc = zzcVar;
        return this;
    }

    public final zzby zzc() {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.zza;
        if (onAudioFocusChangeListener == null) {
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }
        Handler handler = this.zzb;
        handler.getClass();
        return new zzby(1, onAudioFocusChangeListener, handler, this.zzc, false);
    }
}
