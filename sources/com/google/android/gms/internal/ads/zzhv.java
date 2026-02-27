package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.media3.datasource.RawResourceDataSource;
import androidx.media3.exoplayer.DefaultLoadControl;
import androidx.media3.exoplayer.ExoPlayer;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhv implements zzkj {
    public static final zzgjz zza = zzgjz.zzn(Constants.FILE, "content", "data", "android.resource", RawResourceDataSource.RAW_RESOURCE_SCHEME, "asset");
    private final zzbd zzb;
    private final zzbc zzc;
    private final zzyv zzd;
    private final long zze;
    private final long zzf;
    private final long zzg;
    private final long zzh;
    private final long zzi;
    private final long zzj;
    private final long zzk;
    private final long zzl;
    private final long zzm;
    private final HashMap zzn;
    private long zzo;

    public zzhv() {
        zzyv zzyvVar = new zzyv(true, 65536);
        zzo(1000, 0, "bufferForPlaybackMs", "0");
        zzo(1000, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        zzo(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzo(1000, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        zzo(50000, 1000, "minBufferMs", "bufferForPlaybackMs");
        zzo(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        zzo(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzo(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        zzo(50000, 50000, "maxBufferMs", "minBufferMs");
        zzo(50000, 1000, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        zzo(0, 0, "backBufferDurationMs", "0");
        this.zzb = new zzbd();
        this.zzc = new zzbc();
        this.zzd = zzyvVar;
        this.zze = zzeo.zzq(50000L);
        this.zzf = zzeo.zzq(1000L);
        this.zzg = zzeo.zzq(50000L);
        this.zzh = zzeo.zzq(50000L);
        this.zzi = zzeo.zzq(1000L);
        this.zzj = zzeo.zzq(1000L);
        this.zzk = zzeo.zzq(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
        this.zzl = zzeo.zzq(1000L);
        this.zzm = zzeo.zzq(0L);
        this.zzn = new HashMap();
        this.zzo = -1L;
    }

    private final void zzl(zzox zzoxVar) {
        if (this.zzn.remove(zzoxVar) != null) {
            zzm();
        }
    }

    private final void zzm() {
        if (this.zzn.isEmpty()) {
            this.zzd.zza();
        } else {
            this.zzd.zzb(zzj());
        }
    }

    private final boolean zzn(zzki zzkiVar) {
        zzbe zzbeVar = zzkiVar.zzb;
        zzaf zzafVar = zzbeVar.zzb(zzbeVar.zzo(zzkiVar.zzc.zza, this.zzc).zzc, this.zzb, 0L).zzd.zzb;
        if (zzafVar == null) {
            return false;
        }
        String scheme = zzafVar.zza.getScheme();
        return TextUtils.isEmpty(scheme) || zza.contains(scheme);
    }

    private static void zzo(int i, int i4, String str, String str2) {
        if (i < i4) {
            throw new IllegalArgumentException(zzghs.zzd("%s cannot be less than %s", str, str2));
        }
    }

    private static final boolean zzp(boolean z4) {
        return z4;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final void zza(zzox zzoxVar) {
        long id = Thread.currentThread().getId();
        long j = this.zzo;
        boolean z4 = true;
        if (j != -1 && j != id) {
            z4 = false;
        }
        zzghc.zzi(z4, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.zzo = id;
        HashMap map = this.zzn;
        if (!map.containsKey(zzoxVar)) {
            map.put(zzoxVar, new zzhu(null));
        }
        zzhu zzhuVar = (zzhu) map.get(zzoxVar);
        zzhuVar.getClass();
        zzhuVar.zzb = 13107200;
        zzhuVar.zza = false;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final void zzb(zzki zzkiVar, zzwq zzwqVar, zzyf[] zzyfVarArr) {
        zzhu zzhuVar = (zzhu) this.zzn.get(zzkiVar.zza);
        zzhuVar.getClass();
        boolean zZzn = zzn(zzkiVar);
        int length = zzyfVarArr.length;
        int i = 0;
        int i4 = 0;
        while (true) {
            int i6 = 13107200;
            if (i >= length) {
                zzhuVar.zzb = Math.max(13107200, i4);
                zzm();
                return;
            }
            zzyf zzyfVar = zzyfVarArr[i];
            if (zzyfVar != null) {
                switch (zzyfVar.zza().zzc) {
                    case -1:
                    case 1:
                        break;
                    case 0:
                        i6 = DefaultLoadControl.DEFAULT_MUXED_BUFFER_SIZE;
                        break;
                    case 2:
                        i6 = !zZzn ? DefaultLoadControl.DEFAULT_VIDEO_BUFFER_SIZE : 19660800;
                        break;
                    case 3:
                    case 5:
                    default:
                        i6 = 131072;
                        break;
                    case 4:
                        i6 = 26214400;
                        break;
                }
                i4 += i6;
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final void zzc(zzox zzoxVar) {
        zzl(zzoxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final void zzd(zzox zzoxVar) {
        zzl(zzoxVar);
        if (this.zzn.isEmpty()) {
            this.zzo = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final long zze(zzox zzoxVar) {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final boolean zzf(zzox zzoxVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final boolean zzg(zzki zzkiVar) {
        zzhu zzhuVar = (zzhu) this.zzn.get(zzkiVar.zza);
        zzhuVar.getClass();
        boolean zZzn = zzn(zzkiVar);
        int iZzg = this.zzd.zzg();
        int iZzj = zzj();
        long jMin = zZzn ? this.zzf : this.zze;
        long j = zZzn ? this.zzh : this.zzg;
        float f = zzkiVar.zzf;
        if (f > 1.0f) {
            jMin = Math.min(zzeo.zzv(jMin, f), j);
        }
        long j6 = zzkiVar.zze;
        if (j6 < Math.max(jMin, 500000L)) {
            boolean z4 = zzp(zZzn) || iZzg < iZzj;
            zzhuVar.zza = z4;
            if (!z4 && j6 < 500000) {
                zzds.zzc("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j6 >= j || iZzg >= iZzj) {
            zzhuVar.zza = false;
        }
        return zzhuVar.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final boolean zzh(zzki zzkiVar) {
        long jMin;
        boolean z4;
        boolean z5 = zzkiVar.zzg;
        long j = zzkiVar.zze;
        float f = zzkiVar.zzf;
        boolean zZzn = zzn(zzkiVar);
        long jZzw = zzeo.zzw(j, f);
        if (z5) {
            if (zZzn) {
                jMin = this.zzl;
                z4 = true;
            } else {
                jMin = this.zzk;
                z4 = false;
            }
        } else if (zZzn) {
            jMin = this.zzj;
            z4 = true;
        } else {
            jMin = this.zzi;
            z4 = false;
        }
        long j6 = zzkiVar.zzh;
        if (j6 != androidx.media3.common.C.TIME_UNSET) {
            jMin = Math.min(j6 / 2, jMin);
        }
        if (jMin <= 0 || jZzw >= jMin) {
            return true;
        }
        return !zzp(z4) && this.zzd.zzg() >= zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final boolean zzi(zzbe zzbeVar, zzup zzupVar, long j) {
        Iterator it = this.zzn.values().iterator();
        while (it.hasNext()) {
            if (((zzhu) it.next()).zza) {
                return false;
            }
        }
        return true;
    }

    @VisibleForTesting
    public final int zzj() {
        Iterator it = this.zzn.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((zzhu) it.next()).zzb;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final zzyv zzk() {
        return this.zzd;
    }
}
