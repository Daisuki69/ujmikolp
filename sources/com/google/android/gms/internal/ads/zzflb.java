package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.video.AudioStats;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzflb {
    protected final ClientApi zza;
    protected final Context zzb;
    protected final int zzc;
    protected final zzfdy zzd;
    protected com.google.android.gms.ads.internal.client.zzft zze;
    protected AtomicBoolean zzf;

    @Nullable
    protected com.google.android.gms.ads.internal.client.zzch zzg;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzce zzh;
    private final Queue zzi;
    private final zzfkf zzj;
    private final String zzk;
    private AtomicBoolean zzl;
    private final ScheduledExecutorService zzm;
    private AtomicBoolean zzn;
    private AtomicBoolean zzo;
    private zzfkk zzp;
    private final Clock zzq;
    private final zzfkr zzr;

    public zzflb(ClientApi clientApi, Context context, int i, zzfdy zzfdyVar, @NonNull com.google.android.gms.ads.internal.client.zzft zzftVar, @Nullable com.google.android.gms.ads.internal.client.zzce zzceVar, @NonNull ScheduledExecutorService scheduledExecutorService, zzfkf zzfkfVar, Clock clock) {
        this("none", clientApi, context, i, zzfdyVar, zzftVar, scheduledExecutorService, zzfkfVar, clock);
        this.zzh = zzceVar;
    }

    public static final /* synthetic */ double zzD(com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        return !(zzeaVar instanceof zzcvl) ? AudioStats.AUDIO_AMPLITUDE_NONE : ((zzcvl) zzeaVar).zzl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzF, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzt(Object obj) {
        try {
            this.zzl.set(false);
            if (obj != null) {
                this.zzj.zza();
                this.zzo.set(true);
                zzI(obj);
            }
            zzJ(obj == null);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzG, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzu(Throwable th2) {
        try {
            this.zzl.set(false);
            if ((th2 instanceof zzfjx) && ((zzfjx) th2).zza() == 0) {
                throw null;
            }
            zzJ(true);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzv(com.google.android.gms.ads.internal.client.zze zzeVar) {
        try {
            if (this.zzn.get()) {
                com.google.android.gms.ads.internal.util.zzs.zza.post(new zzfky(this, zzeVar));
            }
            this.zzl.set(false);
            int i = zzeVar.zza;
            if (i != 1 && i != 8 && i != 10 && i != 11) {
                zzJ(true);
                return;
            }
            com.google.android.gms.ads.internal.client.zzft zzftVar = this.zze;
            int i4 = zzftVar.zzb;
            String str = zzftVar.zza;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 26 + String.valueOf(str).length() + 61);
            sb2.append("Preloading ");
            sb2.append(i4);
            sb2.append(", for adUnitId:");
            sb2.append(str);
            sb2.append(", Ad load failed. Stop preloading due to non-retriable error:");
            String string = sb2.toString();
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh(string);
            this.zzf.set(false);
            zzfkq zzfkqVar = new zzfkq(this.zze.zza, zzm());
            zzfkqVar.zza(this.zzk);
            this.zzp.zzk(this.zzq.currentTimeMillis(), new zzfkr(zzfkqVar, null), zzeVar, this.zze.zzd, zzn(), zzz());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void zzI(Object obj) {
        try {
            Clock clock = this.zzq;
            zzfks zzfksVar = new zzfks(obj, clock);
            this.zzi.add(zzfksVar);
            com.google.android.gms.ads.internal.client.zzea zzeaVarZzb = zzb(obj);
            long jCurrentTimeMillis = clock.currentTimeMillis();
            if (this.zzn.get()) {
                com.google.android.gms.ads.internal.util.zzs.zza.post(new zzfkw(this, zzeaVarZzb));
            }
            ScheduledExecutorService scheduledExecutorService = this.zzm;
            scheduledExecutorService.execute(new zzfkx(this, jCurrentTimeMillis, zzeaVarZzb));
            scheduledExecutorService.schedule(new zzfkv(this), zzfksVar.zzc(), TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void zzJ(boolean z4) {
        try {
            zzfkf zzfkfVar = this.zzj;
            if (zzfkfVar.zzd()) {
                return;
            }
            if (z4) {
                zzfkfVar.zzc();
            }
            this.zzm.schedule(new zzfkv(this), zzfkfVar.zzb(), TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void zzK() {
        Iterator it = this.zzi.iterator();
        while (it.hasNext()) {
            if (((zzfks) it.next()).zzb()) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzL, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzw(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zzch zzchVar = this.zzg;
        if (zzchVar != null) {
            try {
                zzchVar.zzg(this.zzk, zzeVar);
            } catch (RemoteException unused) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdFailedToPreload");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0028 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0018 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: zzM, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzx(@androidx.annotation.Nullable com.google.android.gms.ads.internal.client.zzea r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.ads.internal.client.zzce r0 = r2.zzh     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L14
            com.google.android.gms.ads.internal.client.zzft r1 = r2.zze     // Catch: java.lang.Throwable -> Lb android.os.RemoteException -> Ld
            r0.zze(r1)     // Catch: java.lang.Throwable -> Lb android.os.RemoteException -> Ld
            goto L14
        Lb:
            r3 = move-exception
            goto L2a
        Ld:
            int r0 = com.google.android.gms.ads.internal.util.zze.zza     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = "Failed to call onAdsAvailable"
            com.google.android.gms.ads.internal.util.client.zzo.zzi(r0)     // Catch: java.lang.Throwable -> Lb
        L14:
            com.google.android.gms.ads.internal.client.zzch r0 = r2.zzg     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L28
            java.lang.String r1 = r2.zzk     // Catch: java.lang.Throwable -> Lb android.os.RemoteException -> L1f
            r0.zze(r1, r3)     // Catch: java.lang.Throwable -> Lb android.os.RemoteException -> L1f
            monitor-exit(r2)
            return
        L1f:
            int r3 = com.google.android.gms.ads.internal.util.zze.zza     // Catch: java.lang.Throwable -> Lb
            java.lang.String r3 = "Failed to call onAdPreloaded"
            com.google.android.gms.ads.internal.util.client.zzo.zzi(r3)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r2)
            return
        L28:
            monitor-exit(r2)
            return
        L2a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzflb.zzx(com.google.android.gms.ads.internal.client.zzea):void");
    }

    private final synchronized void zzN() {
        try {
            if (this.zzo.get() && this.zzi.isEmpty()) {
                this.zzo.set(false);
                if (this.zzn.get()) {
                    com.google.android.gms.ads.internal.util.zzs.zza.post(new zzfkz(this));
                }
                this.zzm.execute(new zzfla(this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0028 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0018 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: zzO, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzy() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.ads.internal.client.zzce r0 = r2.zzh     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L14
            com.google.android.gms.ads.internal.client.zzft r1 = r2.zze     // Catch: java.lang.Throwable -> Lb android.os.RemoteException -> Ld
            r0.zzf(r1)     // Catch: java.lang.Throwable -> Lb android.os.RemoteException -> Ld
            goto L14
        Lb:
            r0 = move-exception
            goto L2a
        Ld:
            int r0 = com.google.android.gms.ads.internal.util.zze.zza     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = "Failed to call onAdsExhausted"
            com.google.android.gms.ads.internal.util.client.zzo.zzi(r0)     // Catch: java.lang.Throwable -> Lb
        L14:
            com.google.android.gms.ads.internal.client.zzch r0 = r2.zzg     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L28
            java.lang.String r1 = r2.zzk     // Catch: java.lang.Throwable -> Lb android.os.RemoteException -> L1f
            r0.zzf(r1)     // Catch: java.lang.Throwable -> Lb android.os.RemoteException -> L1f
            monitor-exit(r2)
            return
        L1f:
            int r0 = com.google.android.gms.ads.internal.util.zze.zza     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = "Failed to call onAdsExhausted"
            com.google.android.gms.ads.internal.util.client.zzo.zzi(r0)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r2)
            return
        L28:
            monitor-exit(r2)
            return
        L2a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzflb.zzy():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzP, reason: merged with bridge method [inline-methods] */
    public final String zzz() {
        return true != "none".equals(this.zzk) ? ExifInterface.GPS_MEASUREMENT_2D : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static final String zzQ(@Nullable com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        if (zzeaVar instanceof zzcvl) {
            return ((zzcvl) zzeaVar).zzk();
        }
        return null;
    }

    public final /* synthetic */ zzfkk zzA() {
        return this.zzp;
    }

    public final /* synthetic */ Clock zzB() {
        return this.zzq;
    }

    public final /* synthetic */ zzfkr zzC() {
        return this.zzr;
    }

    public abstract S1.y zza(Context context);

    @Nullable
    public abstract com.google.android.gms.ads.internal.client.zzea zzb(Object obj);

    public final synchronized zzflb zzc() {
        this.zzm.submit(new zzfkv(this));
        return this;
    }

    public final synchronized boolean zzd() {
        zzK();
        return !this.zzi.isEmpty();
    }

    @Nullable
    public final synchronized Object zze() {
        try {
            this.zzj.zza();
            Queue queue = this.zzi;
            zzfks zzfksVar = (zzfks) queue.poll();
            this.zzo.set(zzfksVar != null);
            if (zzfksVar == null) {
                zzfksVar = null;
            } else if (!queue.isEmpty()) {
                zzfks zzfksVar2 = (zzfks) queue.peek();
                AdFormat adFormat = AdFormat.getAdFormat(this.zze.zzb);
                String strZzQ = zzQ(zzb(zzfksVar.zza()));
                if (zzfksVar2 != null && adFormat != null && strZzQ != null && zzfksVar2.zzd() < zzfksVar.zzd()) {
                    this.zzp.zzg(this.zzq.currentTimeMillis(), this.zze.zzd, zzn(), strZzQ, this.zzr, zzz());
                }
            }
            zzq();
            if (zzfksVar == null) {
                return null;
            }
            return zzfksVar.zza();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void zzf() {
        this.zzf.set(false);
        this.zzn.set(false);
    }

    public final void zzg() {
        this.zzf.set(false);
    }

    public final synchronized void zzh() {
        this.zzf.set(true);
        this.zzn.set(true);
        this.zzm.submit(new zzfkv(this));
    }

    @Nullable
    public final synchronized String zzi() {
        Object objZzp;
        objZzp = zzp();
        return zzQ(objZzp == null ? null : zzb(objZzp));
    }

    public final void zzj(zzfkk zzfkkVar) {
        this.zzp = zzfkkVar;
    }

    public final synchronized void zzk(int i) {
        Preconditions.checkArgument(i >= 5);
        this.zzj.zze(i);
    }

    public final String zzl() {
        return this.zzk;
    }

    @Nullable
    public final AdFormat zzm() {
        return AdFormat.getAdFormat(this.zze.zzb);
    }

    public final synchronized int zzn() {
        return this.zzi.size();
    }

    public final void zzo() {
        this.zzi.clear();
    }

    @Nullable
    public final synchronized Object zzp() {
        zzfks zzfksVar = (zzfks) this.zzi.peek();
        if (zzfksVar == null) {
            return null;
        }
        return zzfksVar.zza();
    }

    public final synchronized void zzq() {
        S1.y yVarZza;
        try {
            zzK();
            zzN();
            if (!this.zzl.get() && this.zzf.get() && this.zzi.size() < this.zze.zzd) {
                this.zzl.set(true);
                Activity activityZzd = com.google.android.gms.ads.internal.zzt.zzg().zzd();
                if (activityZzd == null) {
                    String strValueOf = String.valueOf(this.zze.zza);
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Empty activity context at preloading: ".concat(strValueOf));
                    yVarZza = zza(this.zzb);
                } else {
                    yVarZza = zza(activityZzd);
                }
                zzgot.zzq(yVarZza, new zzfkt(this), this.zzm);
            }
        } finally {
        }
    }

    public final void zzr(int i) {
        Preconditions.checkArgument(i > 0);
        AdFormat adFormat = AdFormat.getAdFormat(this.zze.zzb);
        int i4 = this.zze.zzd;
        synchronized (this) {
            try {
                com.google.android.gms.ads.internal.client.zzft zzftVar = this.zze;
                this.zze = new com.google.android.gms.ads.internal.client.zzft(zzftVar.zza, zzftVar.zzb, zzftVar.zzc, i > 0 ? i : zzftVar.zzd);
                Queue queue = this.zzi;
                if (queue.size() > i) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzv)).booleanValue()) {
                        ArrayList arrayList = new ArrayList();
                        for (int i6 = 0; i6 < i; i6++) {
                            zzfks zzfksVar = (zzfks) queue.poll();
                            if (zzfksVar != null) {
                                arrayList.add(zzfksVar);
                            }
                        }
                        queue.clear();
                        queue.addAll(arrayList);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zzfkk zzfkkVar = this.zzp;
        if (zzfkkVar == null || adFormat == null) {
            return;
        }
        zzfkkVar.zzc(i4, i, this.zzq.currentTimeMillis(), new zzfkr(new zzfkq(this.zze.zza, adFormat), null));
    }

    public final void zzs(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzA)).booleanValue()) {
            Bundle bundle = zzmVar.zzB;
            bundle.putInt("plcs", zzn());
            bundle.putInt("plbs", this.zze.zzd);
            bundle.putString("plid", this.zzk);
        }
    }

    public zzflb(String str, ClientApi clientApi, Context context, int i, zzfdy zzfdyVar, @NonNull com.google.android.gms.ads.internal.client.zzft zzftVar, @Nullable com.google.android.gms.ads.internal.client.zzch zzchVar, @NonNull ScheduledExecutorService scheduledExecutorService, zzfkf zzfkfVar, Clock clock) {
        this(str, clientApi, context, i, zzfdyVar, zzftVar, scheduledExecutorService, zzfkfVar, clock);
        this.zzg = zzchVar;
    }

    private zzflb(String str, ClientApi clientApi, Context context, int i, zzfdy zzfdyVar, @NonNull com.google.android.gms.ads.internal.client.zzft zzftVar, @NonNull ScheduledExecutorService scheduledExecutorService, zzfkf zzfkfVar, Clock clock) {
        this.zzk = str;
        this.zza = clientApi;
        this.zzb = context;
        this.zzc = i;
        this.zzd = zzfdyVar;
        this.zze = zzftVar;
        this.zzi = new PriorityQueue(Math.max(1, zzftVar.zzd), new zzfku(this));
        this.zzf = new AtomicBoolean(true);
        this.zzl = new AtomicBoolean(false);
        this.zzm = scheduledExecutorService;
        this.zzj = zzfkfVar;
        this.zzn = new AtomicBoolean(true);
        this.zzo = new AtomicBoolean(false);
        this.zzq = clock;
        zzfkq zzfkqVar = new zzfkq(zzftVar.zza, AdFormat.getAdFormat(this.zze.zzb));
        zzfkqVar.zza(str);
        this.zzr = new zzfkr(zzfkqVar, null);
    }
}
