package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import mx_android.support.v7.media.MediaRouteProviderProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class zzccz extends zzccq implements zzcat {
    public static final /* synthetic */ int zzd = 0;
    private zzcau zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzcci zzi;
    private long zzj;
    private long zzk;

    public zzccz(zzcbd zzcbdVar, zzcbc zzcbcVar) {
        super(zzcbdVar);
        zzcds zzcdsVar = new zzcds(zzcbdVar.getContext(), zzcbcVar, (zzcbd) this.zzc.get(), null);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("ExoPlayerAdapter initialized.");
        this.zze = zzcdsVar;
        zzcdsVar.zzs(this);
    }

    public static final String zzc(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzf(str)));
    }

    private final void zzd(long j) {
        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzb();
            }
        }, j);
    }

    private static String zzx(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        androidx.media3.datasource.cache.c.A(sb2, str, "/", canonicalName, Global.COLON);
        sb2.append(message);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzccq, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzcau zzcauVar = this.zze;
        if (zzcauVar != null) {
            zzcauVar.zzs(null);
            this.zze.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzD() {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache onRenderedFirstFrame");
    }

    public final zzcau zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzs(null);
        zzcau zzcauVar = this.zze;
        this.zze = null;
        return zzcauVar;
    }

    public final /* synthetic */ void zzb() {
        long jLongValue;
        long jIntValue;
        boolean zBooleanValue;
        long j;
        long j6;
        long j7;
        String strZzc = zzc(this.zzf);
        try {
            jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzQ)).longValue() * 1000;
            jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzu)).intValue();
            zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcd)).booleanValue();
        } catch (Exception e) {
            String str = this.zzf;
            String message = e.getMessage();
            String strP = androidx.camera.core.impl.a.p(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str, " Exception: ", message);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strP);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "VideoStreamExoPlayerCache.preload");
            release();
            zzq(this.zzf, strZzc, MediaRouteProviderProtocol.SERVICE_DATA_ERROR, zzx(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, e));
        }
        synchronized (this) {
            try {
                if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzj > jLongValue) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(jLongValue).length() + 27);
                    sb2.append("Timeout reached. Limit: ");
                    sb2.append(jLongValue);
                    sb2.append(" ms");
                    throw new IOException(sb2.toString());
                }
                if (this.zzg) {
                    throw new IOException("Abort requested before buffering finished. ");
                }
                if (!this.zzh) {
                    if (!this.zze.zzB()) {
                        throw new IOException("ExoPlayer was released during preloading.");
                    }
                    long jZzH = this.zze.zzH();
                    if (jZzH > 0) {
                        long jZzN = this.zze.zzN();
                        if (jZzN != this.zzk) {
                            boolean z4 = jZzN > 0;
                            j6 = jZzH;
                            j7 = jZzN;
                            j = jIntValue;
                            zzm(this.zzf, strZzc, j7, j6, z4, zBooleanValue ? this.zze.zzI() : -1L, zBooleanValue ? this.zze.zzJ() : -1L, zBooleanValue ? this.zze.zzK() : -1L, zzcau.zzP(), zzcau.zzQ());
                            this.zzk = j7;
                        } else {
                            j = jIntValue;
                            j6 = jZzH;
                            j7 = jZzN;
                        }
                        if (j7 >= j6) {
                            zzp(this.zzf, strZzc, j6);
                        } else if (this.zze.zzO() >= j && j7 > 0) {
                        }
                    }
                    zzd(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzR)).longValue());
                    return;
                }
                com.google.android.gms.ads.internal.zzt.zzB().zzd(this.zzi);
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final boolean zze(String str) {
        return zzf(str, new String[]{str});
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final boolean zzf(String str, String[] strArr) {
        Clock clock;
        String str2;
        String str3;
        long j;
        long j6;
        long j7;
        long j9;
        long j10;
        long j11;
        long j12;
        boolean z4;
        this.zzf = str;
        String strZzc = zzc(str);
        String str4 = " ms";
        String str5 = "Timeout reached. Limit: ";
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.zze.zzq(uriArr, this.zzb);
            zzcbd zzcbdVar = (zzcbd) this.zzc.get();
            if (zzcbdVar != null) {
                zzcbdVar.zzt(strZzc, this);
            }
            Clock clockZzk = com.google.android.gms.ads.internal.zzt.zzk();
            long jCurrentTimeMillis = clockZzk.currentTimeMillis();
            long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzR)).longValue();
            long jLongValue2 = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzQ)).longValue() * 1000;
            long jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzu)).intValue();
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcd)).booleanValue();
            long j13 = -1;
            while (true) {
                synchronized (this) {
                    try {
                        if (clockZzk.currentTimeMillis() - jCurrentTimeMillis > jLongValue2) {
                            long j14 = jLongValue2;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(j14).length() + 27);
                            sb2.append(str5);
                            sb2.append(j14);
                            sb2.append(str4);
                            throw new IOException(sb2.toString());
                        }
                        if (this.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (!this.zzh) {
                            if (!this.zze.zzB()) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            long jZzH = this.zze.zzH();
                            if (jZzH > 0) {
                                clock = clockZzk;
                                long jZzN = this.zze.zzN();
                                if (jZzN != j13) {
                                    if (jZzN > 0) {
                                        j12 = jLongValue2;
                                        z4 = true;
                                    } else {
                                        j12 = jLongValue2;
                                        z4 = false;
                                    }
                                    long j15 = jLongValue;
                                    j10 = jZzH;
                                    str3 = str5;
                                    j9 = j15;
                                    str2 = str4;
                                    j11 = jZzN;
                                    j6 = jIntValue;
                                    j = j12;
                                    zzm(str, strZzc, j11, j10, z4, zBooleanValue ? this.zze.zzI() : -1L, zBooleanValue ? this.zze.zzJ() : -1L, zBooleanValue ? this.zze.zzK() : -1L, zzcau.zzP(), zzcau.zzQ());
                                    j13 = j11;
                                } else {
                                    str3 = str5;
                                    j9 = jLongValue;
                                    j6 = jIntValue;
                                    j10 = jZzH;
                                    str2 = str4;
                                    j = jLongValue2;
                                    j11 = jZzN;
                                }
                                if (j11 >= j10) {
                                    zzp(str, strZzc, j10);
                                } else if (this.zze.zzO() < j6 || j11 <= 0) {
                                    j7 = j9;
                                }
                            } else {
                                clock = clockZzk;
                                str2 = str4;
                                str3 = str5;
                                j = jLongValue2;
                                j6 = jIntValue;
                                j7 = jLongValue;
                            }
                            try {
                                wait(j7);
                            } catch (InterruptedException unused) {
                                throw new IOException("Wait interrupted.");
                            }
                        }
                    } finally {
                    }
                }
                jLongValue = j7;
                str4 = str2;
                jLongValue2 = j;
                jIntValue = j6;
                str5 = str3;
                clockZzk = clock;
            }
            return true;
        } catch (Exception e) {
            String message = e.getMessage();
            String strP = androidx.camera.core.impl.a.p(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str, " Exception: ", message);
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strP);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "VideoStreamExoPlayerCache.preload");
            release();
            zzq(str, strZzc, MediaRouteProviderProtocol.SERVICE_DATA_ERROR, zzx(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, e));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final boolean zzg(String str, String[] strArr, zzcci zzcciVar) {
        this.zzf = str;
        this.zzi = zzcciVar;
        String strZzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.zze.zzq(uriArr, this.zzb);
            zzcbd zzcbdVar = (zzcbd) this.zzc.get();
            if (zzcbdVar != null) {
                zzcbdVar.zzt(strZzc, this);
            }
            this.zzj = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            this.zzk = -1L;
            zzd(0L);
            return true;
        } catch (Exception e) {
            String message = e.getMessage();
            String strP = androidx.camera.core.impl.a.p(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str, " Exception: ", message);
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strP);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "VideoStreamExoPlayerCache.preload");
            release();
            zzq(str, strZzc, MediaRouteProviderProtocol.SERVICE_DATA_ERROR, zzx(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, e));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final void zzh(int i) {
        this.zze.zzG(i);
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final void zzi(int i) {
        this.zze.zzF(i);
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final void zzj(int i) {
        this.zze.zzy(i);
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final void zzk(int i) {
        this.zze.zzz(i);
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final void zzl() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzq(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzr(final boolean z4, final long j) {
        final zzcbd zzcbdVar = (zzcbd) this.zzc.get();
        if (zzcbdVar != null) {
            zzbzh.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccy
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcbdVar.zzu(z4, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzs(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzt(int i, int i4) {
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzu(String str, Exception exc) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache error", exc);
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzv(String str, Exception exc) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache exception", exc);
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "VideoStreamExoPlayerCache.onException");
    }
}
