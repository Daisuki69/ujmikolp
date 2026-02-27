package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.camera.video.AudioStats;
import androidx.core.os.ConfigurationCompat;
import androidx.core.os.LocaleListCompat;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p3.c;
import p3.f;
import p3.k;
import p3.m;
import v3.g;

/* JADX INFO: loaded from: classes3.dex */
public final class zzwp {

    @Nullable
    private static zzcs zza;
    private static final zzcu zzb = zzcu.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzc;
    private final String zzd;
    private final zzwf zze;
    private final k zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zzwp(Context context, final k kVar, zzwf zzwfVar, String str) {
        this.zzc = context.getPackageName();
        this.zzd = c.a(context);
        this.zzf = kVar;
        this.zze = zzwfVar;
        zzxb.zza();
        this.zzi = str;
        f fVarA = f.a();
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb();
            }
        };
        fVarA.getClass();
        this.zzg = f.b(callable);
        f fVarA2 = f.a();
        Objects.requireNonNull(kVar);
        Callable callable2 = new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return kVar.a();
            }
        };
        fVarA2.getClass();
        this.zzh = f.b(callable2);
        zzcu zzcuVar = zzb;
        this.zzj = zzcuVar.containsKey(str) ? DynamiteModule.getRemoteVersion(context, (String) zzcuVar.get(str)) : -1;
    }

    @VisibleForTesting
    public static long zza(List list, double d10) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d10 / 100.0d) * ((double) list.size()))) - 1, 0))).longValue();
    }

    @NonNull
    private static synchronized zzcs zzi() {
        try {
            zzcs zzcsVar = zza;
            if (zzcsVar != null) {
                return zzcsVar;
            }
            LocaleListCompat locales = ConfigurationCompat.getLocales(Resources.getSystem().getConfiguration());
            zzcp zzcpVar = new zzcp();
            for (int i = 0; i < locales.size(); i++) {
                zzcpVar.zzd(c.b(locales.get(i)));
            }
            zzcs zzcsVarZzf = zzcpVar.zzf();
            zza = zzcsVarZzf;
            return zzcsVarZzf;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @WorkerThread
    private final String zzj() {
        if (this.zzg.isSuccessful()) {
            return (String) this.zzg.getResult();
        }
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    @WorkerThread
    private final boolean zzk(zzrc zzrcVar, long j, long j6) {
        return this.zzk.get(zzrcVar) == null || j - ((Long) this.zzk.get(zzrcVar)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }

    public final /* synthetic */ String zzb() throws Exception {
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    public final /* synthetic */ void zzc(zzwe zzweVar, zzrc zzrcVar, String str) {
        zzweVar.zzb(zzrcVar);
        String strZzd = zzweVar.zzd();
        zzvb zzvbVar = new zzvb();
        zzvbVar.zzb(this.zzc);
        zzvbVar.zzc(this.zzd);
        zzvbVar.zzh(zzi());
        zzvbVar.zzg(Boolean.TRUE);
        zzvbVar.zzl(strZzd);
        zzvbVar.zzj(str);
        zzvbVar.zzi(this.zzh.isSuccessful() ? (String) this.zzh.getResult() : this.zzf.a());
        zzvbVar.zzd(10);
        zzvbVar.zzk(Integer.valueOf(this.zzj));
        zzweVar.zzc(zzvbVar);
        this.zze.zza(zzweVar);
    }

    public final void zzd(zzwe zzweVar, zzrc zzrcVar) {
        zze(zzweVar, zzrcVar, zzj());
    }

    public final void zze(final zzwe zzweVar, final zzrc zzrcVar, final String str) {
        m.f19041a.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwj
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc(zzweVar, zzrcVar, str);
            }
        });
    }

    @WorkerThread
    public final void zzf(zzwo zzwoVar, zzrc zzrcVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzrcVar, jElapsedRealtime, 30L)) {
            this.zzk.put(zzrcVar, Long.valueOf(jElapsedRealtime));
            zze(zzwoVar.zza(), zzrcVar, zzj());
        }
    }

    public final void zzg(zzrc zzrcVar, v3.f fVar) {
        zzcy zzcyVar = (zzcy) this.zzl.get(zzrcVar);
        if (zzcyVar != null) {
            for (Object obj : zzcyVar.zzw()) {
                ArrayList arrayList = new ArrayList(zzcyVar.zze(obj));
                Collections.sort(arrayList);
                zzqb zzqbVar = new zzqb();
                Iterator it = arrayList.iterator();
                long jLongValue = 0;
                while (it.hasNext()) {
                    jLongValue += ((Long) it.next()).longValue();
                }
                zzqbVar.zza(Long.valueOf(jLongValue / ((long) arrayList.size())));
                zzqbVar.zzc(Long.valueOf(zza(arrayList, 100.0d)));
                zzqbVar.zzf(Long.valueOf(zza(arrayList, 75.0d)));
                zzqbVar.zzd(Long.valueOf(zza(arrayList, 50.0d)));
                zzqbVar.zzb(Long.valueOf(zza(arrayList, 25.0d)));
                zzqbVar.zze(Long.valueOf(zza(arrayList, AudioStats.AUDIO_AMPLITUDE_NONE)));
                zzqd zzqdVarZzg = zzqbVar.zzg();
                int size = arrayList.size();
                fVar.getClass();
                zzft zzftVar = (zzft) obj;
                g gVar = fVar.f20462a;
                gVar.getClass();
                zzrd zzrdVar = new zzrd();
                zzrdVar.zze(gVar.i ? zzra.TYPE_THICK : zzra.TYPE_THIN);
                zzfq zzfqVar = new zzfq();
                zzfqVar.zza(Integer.valueOf(size));
                zzfqVar.zzc(zzftVar);
                zzfqVar.zzb(zzqdVarZzg);
                zzrdVar.zzd(zzfqVar.zze());
                zze(zzws.zzf(zzrdVar), zzrcVar, zzj());
            }
            this.zzl.remove(zzrcVar);
        }
    }

    public final /* synthetic */ void zzh(final zzrc zzrcVar, Object obj, long j, final v3.f fVar) {
        if (!this.zzl.containsKey(zzrcVar)) {
            this.zzl.put(zzrcVar, zzbw.zzz());
        }
        ((zzcy) this.zzl.get(zzrcVar)).zzt(obj, Long.valueOf(j));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzrcVar, jElapsedRealtime, 30L)) {
            this.zzk.put(zzrcVar, Long.valueOf(jElapsedRealtime));
            m.f19041a.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwk
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzg(zzrcVar, fVar);
                }
            });
        }
    }
}
