package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.PlaybackException;
import com.dynatrace.android.agent.Global;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(31)
public final class zzot implements zzmg, zzou {
    private boolean zzA;
    private final Context zza;
    private final zzov zzc;
    private final PlaybackSession zzd;

    @Nullable
    private String zzj;

    @Nullable
    private PlaybackMetrics.Builder zzk;
    private int zzl;

    @Nullable
    private zzat zzo;

    @Nullable
    private zzos zzp;

    @Nullable
    private zzos zzq;

    @Nullable
    private zzos zzr;

    @Nullable
    private zzu zzs;

    @Nullable
    private zzu zzt;

    @Nullable
    private zzu zzu;
    private boolean zzv;
    private boolean zzw;
    private int zzx;
    private int zzy;
    private int zzz;
    private final Executor zzb = zzcv.zza();
    private final zzbd zzf = new zzbd();
    private final zzbc zzg = new zzbc();
    private final HashMap zzi = new HashMap();
    private final HashMap zzh = new HashMap();
    private final long zze = SystemClock.elapsedRealtime();
    private int zzm = 0;
    private int zzn = 0;

    private zzot(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzd = playbackSession;
        zzom zzomVar = new zzom(zzom.zza);
        this.zzc = zzomVar;
        zzomVar.zza(this);
    }

    private final void zzA(int i, long j, @Nullable zzu zzuVar, int i4) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = androidx.media3.exoplayer.analytics.v.k(i).setTimeSinceCreatedMillis(j - this.zze);
        if (zzuVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i4 != 1 ? 1 : 2);
            String str = zzuVar.zzn;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzuVar.zzo;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzuVar.zzk;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i6 = zzuVar.zzj;
            if (i6 != -1) {
                timeSinceCreatedMillis.setBitrate(i6);
            }
            int i10 = zzuVar.zzv;
            if (i10 != -1) {
                timeSinceCreatedMillis.setWidth(i10);
            }
            int i11 = zzuVar.zzw;
            if (i11 != -1) {
                timeSinceCreatedMillis.setHeight(i11);
            }
            int i12 = zzuVar.zzG;
            if (i12 != -1) {
                timeSinceCreatedMillis.setChannelCount(i12);
            }
            int i13 = zzuVar.zzH;
            if (i13 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i13);
            }
            String str4 = zzuVar.zzd;
            if (str4 != null) {
                String str5 = zzeo.zza;
                String[] strArrSplit = str4.split(Global.HYPHEN, -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = zzuVar.zzz;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzA = true;
        final TrackChangeEvent trackChangeEventBuild = timeSinceCreatedMillis.build();
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzop
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzu(trackChangeEventBuild);
            }
        });
    }

    private final void zzB(zzbe zzbeVar, @Nullable zzup zzupVar) {
        int iZze;
        PlaybackMetrics.Builder builder = this.zzk;
        if (zzupVar == null || (iZze = zzbeVar.zze(zzupVar.zza)) == -1) {
            return;
        }
        zzbc zzbcVar = this.zzg;
        int i = 0;
        zzbeVar.zzd(iZze, zzbcVar, false);
        zzbd zzbdVar = this.zzf;
        zzbeVar.zzb(zzbcVar.zzc, zzbdVar, 0L);
        zzaf zzafVar = zzbdVar.zzd.zzb;
        if (zzafVar != null) {
            int iZzG = zzeo.zzG(zzafVar.zza);
            i = iZzG != 0 ? iZzG != 1 ? iZzG != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        long j = zzbdVar.zzm;
        if (j != androidx.media3.common.C.TIME_UNSET && !zzbdVar.zzk && !zzbdVar.zzi && !zzbdVar.zzb()) {
            builder.setMediaDurationMillis(zzeo.zzp(j));
        }
        builder.setPlaybackType(true != zzbdVar.zzb() ? 1 : 2);
        this.zzA = true;
    }

    private final void zzC() {
        PlaybackMetrics.Builder builder = this.zzk;
        if (builder != null && this.zzA) {
            builder.setAudioUnderrunCount(this.zzz);
            this.zzk.setVideoFramesDropped(this.zzx);
            this.zzk.setVideoFramesPlayed(this.zzy);
            Long l6 = (Long) this.zzh.get(this.zzj);
            this.zzk.setNetworkTransferDurationMillis(l6 == null ? 0L : l6.longValue());
            Long l8 = (Long) this.zzi.get(this.zzj);
            this.zzk.setNetworkBytesRead(l8 == null ? 0L : l8.longValue());
            this.zzk.setStreamSource((l8 == null || l8.longValue() <= 0) ? 0 : 1);
            final PlaybackMetrics playbackMetricsBuild = this.zzk.build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzv(playbackMetricsBuild);
                }
            });
        }
        this.zzk = null;
        this.zzj = null;
        this.zzz = 0;
        this.zzx = 0;
        this.zzy = 0;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzA = false;
    }

    @SuppressLint({"SwitchIntDef"})
    private static int zzD(int i) {
        switch (zzeo.zzF(i)) {
            case PlaybackException.ERROR_CODE_DRM_PROVISIONING_FAILED /* 6002 */:
                return 24;
            case PlaybackException.ERROR_CODE_DRM_CONTENT_ERROR /* 6003 */:
                return 28;
            case PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED /* 6004 */:
                return 25;
            case PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION /* 6005 */:
                return 26;
            default:
                return 27;
        }
    }

    @Nullable
    public static zzot zza(Context context) {
        MediaMetricsManager mediaMetricsManagerB = androidx.media3.exoplayer.analytics.u.b(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerB == null) {
            return null;
        }
        return new zzot(context, mediaMetricsManagerB.createPlaybackSession());
    }

    private final boolean zzw(@Nullable zzos zzosVar) {
        if (zzosVar != null) {
            return zzosVar.zzc.equals(this.zzc.zzf());
        }
        return false;
    }

    private final void zzx(long j, @Nullable zzu zzuVar, int i) {
        if (Objects.equals(this.zzs, zzuVar)) {
            return;
        }
        int i4 = this.zzs == null ? 1 : 0;
        this.zzs = zzuVar;
        zzA(1, j, zzuVar, i4);
    }

    private final void zzy(long j, @Nullable zzu zzuVar, int i) {
        if (Objects.equals(this.zzt, zzuVar)) {
            return;
        }
        int i4 = this.zzt == null ? 1 : 0;
        this.zzt = zzuVar;
        zzA(0, j, zzuVar, i4);
    }

    private final void zzz(long j, @Nullable zzu zzuVar, int i) {
        if (Objects.equals(this.zzu, zzuVar)) {
            return;
        }
        int i4 = this.zzu == null ? 1 : 0;
        this.zzu = zzuVar;
        zzA(2, j, zzuVar, i4);
    }

    public final LogSessionId zzb() {
        return this.zzd.getSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zzou
    public final void zzc(zzme zzmeVar, String str) {
        zzup zzupVar = zzmeVar.zzd;
        if (zzupVar == null || !zzupVar.zzb()) {
            zzC();
            this.zzj = str;
            this.zzk = androidx.media3.exoplayer.analytics.v.i().setPlayerName(MediaLibraryInfo.TAG).setPlayerVersion("1.8.0");
            zzB(zzmeVar.zzb, zzupVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzou
    public final void zzd(zzme zzmeVar, String str, boolean z4) {
        zzup zzupVar = zzmeVar.zzd;
        if ((zzupVar == null || !zzupVar.zzb()) && str.equals(this.zzj)) {
            zzC();
        }
        this.zzh.remove(str);
        this.zzi.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzdj(zzme zzmeVar, zzaz zzazVar, zzaz zzazVar2, int i) {
        if (i == 1) {
            this.zzv = true;
            i = 1;
        }
        this.zzl = i;
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzdk(zzme zzmeVar, zzul zzulVar) {
        zzup zzupVar = zzmeVar.zzd;
        if (zzupVar == null) {
            return;
        }
        zzu zzuVar = zzulVar.zzb;
        zzuVar.getClass();
        zzos zzosVar = new zzos(zzuVar, 0, this.zzc.zzb(zzmeVar.zzb, zzupVar));
        int i = zzulVar.zza;
        if (i != 0) {
            if (i == 1) {
                this.zzq = zzosVar;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.zzr = zzosVar;
                return;
            }
        }
        this.zzp = zzosVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzdl(zzme zzmeVar, int i, long j, long j6) {
        zzup zzupVar = zzmeVar.zzd;
        if (zzupVar != null) {
            String strZzb = this.zzc.zzb(zzmeVar.zzb, zzupVar);
            HashMap map = this.zzi;
            Long l6 = (Long) map.get(strZzb);
            HashMap map2 = this.zzh;
            Long l8 = (Long) map2.get(strZzb);
            map.put(strZzb, Long.valueOf((l6 == null ? 0L : l6.longValue()) + j));
            map2.put(strZzb, Long.valueOf((l8 != null ? l8.longValue() : 0L) + ((long) i)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzdm(zzme zzmeVar, zzhr zzhrVar) {
        this.zzx += zzhrVar.zzg;
        this.zzy += zzhrVar.zze;
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x029c  */
    @Override // com.google.android.gms.internal.ads.zzmg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzdn(com.google.android.gms.internal.ads.zzba r20, com.google.android.gms.internal.ads.zzmf r21) {
        /*
            Method dump skipped, instruction units count: 996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzot.zzdn(com.google.android.gms.internal.ads.zzba, com.google.android.gms.internal.ads.zzmf):void");
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final /* synthetic */ void zze(zzme zzmeVar, int i) {
        H.f(this, zzmeVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzg(zzme zzmeVar, zzat zzatVar) {
        this.zzo = zzatVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzh(zzme zzmeVar, zzug zzugVar, zzul zzulVar, IOException iOException, boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final /* synthetic */ void zzk(zzme zzmeVar, zzu zzuVar, zzhs zzhsVar) {
        H.i(this, zzmeVar, zzuVar, zzhsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final /* synthetic */ void zzl(zzme zzmeVar, zzu zzuVar, zzhs zzhsVar) {
        H.j(this, zzmeVar, zzuVar, zzhsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final /* synthetic */ void zzm(zzme zzmeVar, int i, long j) {
        H.k(this, zzmeVar, i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final /* synthetic */ void zzo(zzme zzmeVar, Object obj, long j) {
        H.l(this, zzmeVar, obj, j);
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzp(zzme zzmeVar, zzbu zzbuVar) {
        zzos zzosVar = this.zzp;
        if (zzosVar != null) {
            zzu zzuVar = zzosVar.zza;
            if (zzuVar.zzw == -1) {
                zzs zzsVarZza = zzuVar.zza();
                zzsVarZza.zzt(zzbuVar.zzb);
                zzsVarZza.zzu(zzbuVar.zzc);
                this.zzp = new zzos(zzsVarZza.zzM(), 0, zzosVar.zzc);
            }
        }
    }

    public final /* synthetic */ void zzr(PlaybackErrorEvent playbackErrorEvent) {
        this.zzd.reportPlaybackErrorEvent(playbackErrorEvent);
    }

    public final /* synthetic */ void zzs(NetworkEvent networkEvent) {
        this.zzd.reportNetworkEvent(networkEvent);
    }

    public final /* synthetic */ void zzt(PlaybackStateEvent playbackStateEvent) {
        this.zzd.reportPlaybackStateEvent(playbackStateEvent);
    }

    public final /* synthetic */ void zzu(TrackChangeEvent trackChangeEvent) {
        this.zzd.reportTrackChangeEvent(trackChangeEvent);
    }

    public final /* synthetic */ void zzv(PlaybackMetrics playbackMetrics) {
        this.zzd.reportPlaybackMetrics(playbackMetrics);
    }
}
