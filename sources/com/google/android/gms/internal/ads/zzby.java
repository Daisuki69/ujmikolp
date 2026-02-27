package com.google.android.gms.internal.ads;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import c2.AbstractC1066i;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzby {
    private final AudioManager.OnAudioFocusChangeListener zzb;
    private final Handler zzc;
    private final zzc zzd;

    @Nullable
    private final Object zzf;
    private final int zza = 1;
    private final boolean zze = false;

    public zzby(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, zzc zzcVar, boolean z4) {
        this.zzc = handler;
        this.zzd = zzcVar;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 26) {
            this.zzb = new zzbx(onAudioFocusChangeListener, handler);
        } else {
            this.zzb = onAudioFocusChangeListener;
        }
        this.zzf = i4 >= 26 ? AbstractC1066i.j().setAudioAttributes(zzcVar.zza()).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build() : null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzby)) {
            return false;
        }
        zzby zzbyVar = (zzby) obj;
        int i = zzbyVar.zza;
        return Objects.equals(this.zzb, zzbyVar.zzb) && Objects.equals(this.zzc, zzbyVar.zzc) && Objects.equals(this.zzd, zzbyVar.zzd);
    }

    public final int hashCode() {
        return Objects.hash(1, this.zzb, this.zzc, this.zzd, Boolean.FALSE);
    }

    public final zzc zza() {
        return this.zzd;
    }

    public final AudioManager.OnAudioFocusChangeListener zzb() {
        return this.zzb;
    }

    @RequiresApi(26)
    public final AudioFocusRequest zzc() {
        Object obj = this.zzf;
        obj.getClass();
        return androidx.core.graphics.a.n(obj);
    }
}
