package com.google.android.gms.internal.mlkit_vision_face;

import A3.g;
import A3.h;
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
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p3.c;
import p3.f;
import p3.k;
import p3.m;

/* JADX INFO: loaded from: classes3.dex */
public final class zzoc {

    @Nullable
    private static zzbn zza;
    private static final zzbp zzb = zzbp.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzc;
    private final String zzd;
    private final zzob zze;
    private final k zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zzoc(Context context, final k kVar, zzob zzobVar, String str) {
        this.zzc = context.getPackageName();
        this.zzd = c.a(context);
        this.zzf = kVar;
        this.zze = zzobVar;
        zzoo.zza();
        this.zzi = str;
        f fVarA = f.a();
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_face.zznv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb();
            }
        };
        fVarA.getClass();
        this.zzg = f.b(callable);
        f fVarA2 = f.a();
        kVar.getClass();
        Callable callable2 = new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_face.zznw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return kVar.a();
            }
        };
        fVarA2.getClass();
        this.zzh = f.b(callable2);
        zzbp zzbpVar = zzb;
        this.zzj = zzbpVar.containsKey(str) ? DynamiteModule.getRemoteVersion(context, (String) zzbpVar.get(str)) : -1;
    }

    @VisibleForTesting
    public static long zza(List list, double d10) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d10 / 100.0d) * ((double) list.size()))) - 1, 0))).longValue();
    }

    @NonNull
    private static synchronized zzbn zzi() {
        try {
            zzbn zzbnVar = zza;
            if (zzbnVar != null) {
                return zzbnVar;
            }
            LocaleListCompat locales = ConfigurationCompat.getLocales(Resources.getSystem().getConfiguration());
            zzbk zzbkVar = new zzbk();
            for (int i = 0; i < locales.size(); i++) {
                zzbkVar.zzb(c.b(locales.get(i)));
            }
            zzbn zzbnVarZzc = zzbkVar.zzc();
            zza = zzbnVarZzc;
            return zzbnVarZzc;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @WorkerThread
    private final String zzj() {
        return this.zzg.isSuccessful() ? (String) this.zzg.getResult() : LibraryVersion.getInstance().getVersion(this.zzi);
    }

    @WorkerThread
    private final boolean zzk(zzkt zzktVar, long j, long j6) {
        return this.zzk.get(zzktVar) == null || j - ((Long) this.zzk.get(zzktVar)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }

    public final /* synthetic */ String zzb() throws Exception {
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    public final /* synthetic */ void zzc(zznr zznrVar, zzkt zzktVar, String str) {
        zznrVar.zzb(zzktVar);
        String strZzd = zznrVar.zzd();
        zzmt zzmtVar = new zzmt();
        zzmtVar.zzb(this.zzc);
        zzmtVar.zzc(this.zzd);
        zzmtVar.zzh(zzi());
        zzmtVar.zzg(Boolean.TRUE);
        zzmtVar.zzl(strZzd);
        zzmtVar.zzj(str);
        zzmtVar.zzi(this.zzh.isSuccessful() ? (String) this.zzh.getResult() : this.zzf.a());
        zzmtVar.zzd(10);
        zzmtVar.zzk(Integer.valueOf(this.zzj));
        zznrVar.zzc(zzmtVar);
        this.zze.zza(zznrVar);
    }

    public final void zzd(zznr zznrVar, zzkt zzktVar) {
        zze(zznrVar, zzktVar, zzj());
    }

    public final void zze(final zznr zznrVar, final zzkt zzktVar, final String str) {
        m.f19041a.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_face.zznx
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc(zznrVar, zzktVar, str);
            }
        });
    }

    @WorkerThread
    public final void zzf(zzoa zzoaVar, zzkt zzktVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzktVar, jElapsedRealtime, 30L)) {
            this.zzk.put(zzktVar, Long.valueOf(jElapsedRealtime));
            zze(zzoaVar.zza(), zzktVar, zzj());
        }
    }

    public final void zzg(zzkt zzktVar, g gVar) {
        zzbs zzbsVar = (zzbs) this.zzl.get(zzktVar);
        if (zzbsVar != null) {
            for (Object obj : zzbsVar.zzq()) {
                ArrayList arrayList = new ArrayList(zzbsVar.zzc(obj));
                Collections.sort(arrayList);
                zzjt zzjtVar = new zzjt();
                Iterator it = arrayList.iterator();
                long jLongValue = 0;
                while (it.hasNext()) {
                    jLongValue += ((Long) it.next()).longValue();
                }
                zzjtVar.zza(Long.valueOf(jLongValue / ((long) arrayList.size())));
                zzjtVar.zzc(Long.valueOf(zza(arrayList, 100.0d)));
                zzjtVar.zzf(Long.valueOf(zza(arrayList, 75.0d)));
                zzjtVar.zzd(Long.valueOf(zza(arrayList, 50.0d)));
                zzjtVar.zzb(Long.valueOf(zza(arrayList, 25.0d)));
                zzjtVar.zze(Long.valueOf(zza(arrayList, AudioStats.AUDIO_AMPLITUDE_NONE)));
                zzjv zzjvVarZzg = zzjtVar.zzg();
                int size = arrayList.size();
                gVar.getClass();
                zzdn zzdnVar = (zzdn) obj;
                h hVar = gVar.f35a;
                hVar.getClass();
                zzku zzkuVar = new zzku();
                zzkuVar.zze(hVar.h ? zzkr.TYPE_THICK : zzkr.TYPE_THIN);
                zzdk zzdkVar = new zzdk();
                zzdkVar.zza(Integer.valueOf(size));
                zzdkVar.zzc(zzdnVar);
                zzdkVar.zzb(zzjvVarZzg);
                zzkuVar.zzd(zzdkVar.zze());
                zze(zzof.zzf(zzkuVar), zzktVar, zzj());
            }
            this.zzl.remove(zzktVar);
        }
    }

    public final /* synthetic */ void zzh(final zzkt zzktVar, Object obj, long j, final g gVar) {
        if (!this.zzl.containsKey(zzktVar)) {
            this.zzl.put(zzktVar, zzas.zzr());
        }
        ((zzbs) this.zzl.get(zzktVar)).zzo(obj, Long.valueOf(j));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzktVar, jElapsedRealtime, 30L)) {
            this.zzk.put(zzktVar, Long.valueOf(jElapsedRealtime));
            final byte[] bArr = null;
            m.f19041a.execute(new Runnable(zzktVar, gVar, bArr) { // from class: com.google.android.gms.internal.mlkit_vision_face.zznz
                public final /* synthetic */ zzkt zzb;
                public final /* synthetic */ g zzc;

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzg(this.zzb, this.zzc);
                }
            });
        }
    }
}
