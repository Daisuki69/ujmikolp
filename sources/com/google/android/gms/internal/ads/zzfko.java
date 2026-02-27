package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.annotation.Nullable;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfko {
    private final zzflc zzc;
    private final zzfkk zzd;
    private final Context zze;

    @Nullable
    private volatile ConnectivityManager zzf;
    private final Clock zzh;
    private AtomicInteger zzi;
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final ConcurrentMap zza = new ConcurrentHashMap();
    private final ConcurrentMap zzb = new ConcurrentHashMap();

    public zzfko(zzflc zzflcVar, zzfkk zzfkkVar, Context context, Clock clock) {
        this.zzc = zzflcVar;
        this.zzd = zzfkkVar;
        this.zze = context;
        this.zzh = clock;
    }

    public static String zzh(String str, @Nullable AdFormat adFormat) {
        String strName = adFormat == null ? "NULL" : adFormat.name();
        return We.s.q(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(strName).length()), str, "#", strName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzi(boolean z4) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzw)).booleanValue()) {
            zzj(z4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzj(boolean z4) {
        try {
            if (z4) {
                Iterator it = this.zza.values().iterator();
                while (it.hasNext()) {
                    ((zzflb) it.next()).zzh();
                }
            } else {
                Iterator it2 = this.zza.values().iterator();
                while (it2.hasNext()) {
                    ((zzflb) it2.next()).zzg();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00f8 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0001, B:4:0x000f, B:6:0x0015, B:8:0x0034, B:10:0x003c, B:13:0x004b, B:14:0x0051, B:16:0x0059, B:18:0x0067, B:19:0x0076, B:20:0x007a, B:21:0x007e, B:22:0x0088, B:24:0x008e, B:26:0x00a0, B:27:0x00b5, B:28:0x00bf, B:30:0x00c5, B:32:0x00e6, B:35:0x00fb, B:37:0x0101, B:34:0x00f8), top: B:43:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized java.util.List zzm(java.util.List r9) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfko.zzm(java.util.List):java.util.List");
    }

    private final synchronized void zzn(String str, zzflb zzflbVar) {
        zzflbVar.zzc();
        this.zza.put(str, zzflbVar);
    }

    private final synchronized boolean zzo(String str, AdFormat adFormat) {
        boolean z4;
        try {
            Clock clock = this.zzh;
            long jCurrentTimeMillis = clock.currentTimeMillis();
            zzflb zzflbVarZzq = zzq(str, adFormat);
            int iZzn = 0;
            z4 = zzflbVarZzq != null && zzflbVarZzq.zzd();
            Long lValueOf = z4 ? Long.valueOf(clock.currentTimeMillis()) : null;
            zzfkr zzfkrVar = new zzfkr(new zzfkq(str, adFormat), null);
            zzfkk zzfkkVar = this.zzd;
            int i = zzflbVarZzq == null ? 0 : zzflbVarZzq.zze.zzd;
            if (zzflbVarZzq != null) {
                iZzn = zzflbVarZzq.zzn();
            }
            zzfkkVar.zzd(i, iZzn, jCurrentTimeMillis, lValueOf, zzflbVarZzq != null ? zzflbVarZzq.zzi() : null, zzfkrVar, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        } catch (Throwable th2) {
            throw th2;
        }
        return z4;
    }

    @Nullable
    private final synchronized Object zzp(Class cls, String str, AdFormat adFormat) {
        zzfkr zzfkrVar = new zzfkr(new zzfkq(str, adFormat), null);
        zzfkk zzfkkVar = this.zzd;
        Clock clock = this.zzh;
        zzfkkVar.zzf(clock.currentTimeMillis(), zzfkrVar, -1, -1, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        zzflb zzflbVarZzq = zzq(str, adFormat);
        if (zzflbVarZzq == null) {
            return null;
        }
        try {
            String strZzi = zzflbVarZzq.zzi();
            Object objZze = zzflbVarZzq.zze();
            Object objCast = objZze == null ? null : cls.cast(objZze);
            if (objCast != null) {
                zzfkkVar.zzh(clock.currentTimeMillis(), zzflbVarZzq.zze.zzd, zzflbVarZzq.zzn(), strZzi, zzfkrVar, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            }
            return objCast;
        } catch (ClassCastException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "PreloadAdManager.pollAd");
            com.google.android.gms.ads.internal.util.zze.zzb("Unable to cast ad to the requested type:".concat(cls.getName()), e);
            return null;
        }
    }

    @Nullable
    private final synchronized zzflb zzq(String str, AdFormat adFormat) {
        return (zzflb) this.zza.get(zzh(str, adFormat));
    }

    public final synchronized void zza(List list, com.google.android.gms.ads.internal.client.zzce zzceVar) {
        try {
            if (!this.zzg.getAndSet(true)) {
                if (this.zzf == null) {
                    synchronized (this) {
                        if (this.zzf == null) {
                            try {
                                this.zzf = (ConnectivityManager) this.zze.getSystemService("connectivity");
                            } catch (ClassCastException e) {
                                int i = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get connectivity manager", e);
                            }
                        }
                    }
                }
                if (!PlatformVersion.isAtLeastO() || this.zzf == null) {
                    this.zzi = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzE)).intValue());
                } else {
                    try {
                        this.zzf.registerDefaultNetworkCallback(new zzfkn(this));
                    } catch (RuntimeException e7) {
                        int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to register network callback", e7);
                        this.zzi = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzE)).intValue());
                    }
                }
                com.google.android.gms.ads.internal.zzt.zzg().zzb(new zzfkm(this));
            }
            List<com.google.android.gms.ads.internal.client.zzft> listZzm = zzm(list);
            EnumMap enumMap = new EnumMap(AdFormat.class);
            for (com.google.android.gms.ads.internal.client.zzft zzftVar : listZzm) {
                String str = zzftVar.zza;
                AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
                zzflb zzflbVarZza = this.zzc.zza(zzftVar, zzceVar);
                if (adFormat != null && zzflbVarZza != null) {
                    AtomicInteger atomicInteger = this.zzi;
                    if (atomicInteger != null) {
                        zzflbVarZza.zzk(atomicInteger.get());
                    }
                    zzfkk zzfkkVar = this.zzd;
                    zzflbVarZza.zzj(zzfkkVar);
                    zzn(zzh(str, adFormat), zzflbVarZza);
                    enumMap.put(adFormat, Integer.valueOf(((Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(enumMap, adFormat, 0)).intValue() + 1));
                    zzfkkVar.zza(zzftVar.zzd, this.zzh.currentTimeMillis(), new zzfkr(new zzfkq(str, adFormat), null), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                }
            }
            this.zzd.zzb(enumMap, this.zzh.currentTimeMillis(), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean zzb(String str) {
        return zzo(str, AdFormat.REWARDED);
    }

    @Nullable
    public final synchronized zzbwa zzc(String str) {
        return (zzbwa) zzp(zzbwa.class, str, AdFormat.REWARDED);
    }

    public final synchronized boolean zzd(String str) {
        return zzo(str, AdFormat.APP_OPEN_AD);
    }

    @Nullable
    public final synchronized zzbab zze(String str) {
        return (zzbab) zzp(zzbab.class, str, AdFormat.APP_OPEN_AD);
    }

    public final synchronized boolean zzf(String str) {
        return zzo(str, AdFormat.INTERSTITIAL);
    }

    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzbx zzg(String str) {
        return (com.google.android.gms.ads.internal.client.zzbx) zzp(com.google.android.gms.ads.internal.client.zzbx.class, str, AdFormat.INTERSTITIAL);
    }
}
