package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzhp {
    private final zzght zza;
    private final Handler zzb;

    @Nullable
    private zzho zzc;

    @Nullable
    private zzc zzd;
    private int zzf;
    private zzby zzh;
    private float zzg = 1.0f;
    private int zze = 0;

    public zzhp(final Context context, Looper looper, zzho zzhoVar) {
        this.zza = zzghx.zza(new zzght() { // from class: com.google.android.gms.internal.ads.zzhn
            @Override // com.google.android.gms.internal.ads.zzght
            public final /* synthetic */ Object zza() {
                return zzca.zza(context);
            }
        });
        this.zzc = zzhoVar;
        this.zzb = new Handler(looper);
    }

    private final void zzf() {
        int i = this.zze;
        if (i == 1 || i == 0 || this.zzh == null) {
            return;
        }
        zzca.zzc((AudioManager) this.zza.zza(), this.zzh);
    }

    private final void zzg(int i) {
        if (this.zze == i) {
            return;
        }
        this.zze = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.zzg != f) {
            this.zzg = f;
            zzho zzhoVar = this.zzc;
            if (zzhoVar != null) {
                zzhoVar.zza(f);
            }
        }
    }

    private final void zzh(int i) {
        zzho zzhoVar = this.zzc;
        if (zzhoVar != null) {
            zzhoVar.zzb(i);
        }
    }

    public final float zza() {
        return this.zzg;
    }

    public final void zzb(@Nullable zzc zzcVar) {
        if (Objects.equals(this.zzd, zzcVar)) {
            return;
        }
        this.zzd = zzcVar;
        this.zzf = zzcVar == null ? 0 : 1;
    }

    public final int zzc(boolean z4, int i) {
        if (i == 1 || this.zzf != 1) {
            zzf();
            zzg(0);
            return 1;
        }
        if (!z4) {
            int i4 = this.zze;
            if (i4 != 1) {
                return i4 != 3 ? 1 : 0;
            }
            return -1;
        }
        if (this.zze == 2) {
            return 1;
        }
        if (this.zzh == null) {
            zzbv zzbvVar = new zzbv(1);
            zzc zzcVar = this.zzd;
            zzcVar.getClass();
            zzbvVar.zzb(zzcVar);
            zzbvVar.zza(new AudioManager.OnAudioFocusChangeListener() { // from class: com.google.android.gms.internal.ads.zzhm
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final /* synthetic */ void onAudioFocusChange(int i6) {
                    this.zza.zze(i6);
                }
            }, this.zzb);
            this.zzh = zzbvVar.zzc();
        }
        if (zzca.zzb((AudioManager) this.zza.zza(), this.zzh) == 1) {
            zzg(2);
            return 1;
        }
        zzg(1);
        return -1;
    }

    public final void zzd() {
        this.zzc = null;
        zzf();
        zzg(0);
    }

    public final /* synthetic */ void zze(int i) {
        if (i == -3 || i == -2) {
            if (i != -2) {
                zzg(4);
                return;
            } else {
                zzh(0);
                zzg(3);
                return;
            }
        }
        if (i == -1) {
            zzh(-1);
            zzf();
            zzg(1);
        } else if (i != 1) {
            androidx.media3.datasource.cache.c.x(new StringBuilder(String.valueOf(i).length() + 27), "Unknown focus change type: ", i, "AudioFocusManager");
        } else {
            zzg(2);
            zzh(1);
        }
    }
}
