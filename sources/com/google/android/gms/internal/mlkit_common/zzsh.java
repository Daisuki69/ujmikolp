package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.core.os.ConfigurationCompat;
import androidx.core.os.LocaleListCompat;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Callable;
import o3.AbstractC1959b;
import p3.c;
import p3.f;
import p3.i;
import p3.k;
import p3.m;

/* JADX INFO: loaded from: classes3.dex */
public final class zzsh {

    @Nullable
    private static zzaf zza;
    private static final zzai zzb = zzai.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzc;
    private final String zzd;
    private final zzrz zze;
    private final k zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;

    public zzsh(Context context, final k kVar, zzrz zzrzVar, String str) {
        new HashMap();
        new HashMap();
        this.zzc = context.getPackageName();
        this.zzd = c.a(context);
        this.zzf = kVar;
        this.zze = zzrzVar;
        zzsv.zza();
        this.zzi = str;
        f fVarA = f.a();
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzse
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zza();
            }
        };
        fVarA.getClass();
        this.zzg = f.b(callable);
        f fVarA2 = f.a();
        Objects.requireNonNull(kVar);
        Callable callable2 = new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzsf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return kVar.a();
            }
        };
        fVarA2.getClass();
        this.zzh = f.b(callable2);
        zzai zzaiVar = zzb;
        this.zzj = zzaiVar.containsKey(str) ? DynamiteModule.getRemoteVersion(context, (String) zzaiVar.get(str)) : -1;
    }

    @NonNull
    private static synchronized zzaf zzh() {
        try {
            zzaf zzafVar = zza;
            if (zzafVar != null) {
                return zzafVar;
            }
            LocaleListCompat locales = ConfigurationCompat.getLocales(Resources.getSystem().getConfiguration());
            zzac zzacVar = new zzac();
            for (int i = 0; i < locales.size(); i++) {
                zzacVar.zzb(c.b(locales.get(i)));
            }
            zzaf zzafVarZzc = zzacVar.zzc();
            zza = zzafVarZzc;
            return zzafVarZzc;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final zzqt zzi(String str, String str2) {
        zzqt zzqtVar = new zzqt();
        zzqtVar.zzb(this.zzc);
        zzqtVar.zzc(this.zzd);
        zzqtVar.zzh(zzh());
        zzqtVar.zzg(Boolean.TRUE);
        zzqtVar.zzl(str);
        zzqtVar.zzj(str2);
        zzqtVar.zzi(this.zzh.isSuccessful() ? (String) this.zzh.getResult() : this.zzf.a());
        zzqtVar.zzd(10);
        zzqtVar.zzk(Integer.valueOf(this.zzj));
        return zzqtVar;
    }

    @WorkerThread
    private final String zzj() {
        if (this.zzg.isSuccessful()) {
            return (String) this.zzg.getResult();
        }
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    public final /* synthetic */ String zza() throws Exception {
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    public final /* synthetic */ void zzb(zzry zzryVar, zzmv zzmvVar, String str) {
        zzryVar.zza(zzmvVar);
        zzryVar.zzc(zzi(zzryVar.zzd(), str));
        this.zze.zza(zzryVar);
    }

    public final /* synthetic */ void zzc(zzry zzryVar, zzsj zzsjVar, AbstractC1959b abstractC1959b) {
        zzryVar.zza(zzmv.MODEL_DOWNLOAD);
        zzryVar.zzc(zzi(zzsjVar.zze(), zzj()));
        zzryVar.zzb(zzst.zza(abstractC1959b, this.zzf, zzsjVar));
        this.zze.zza(zzryVar);
    }

    public final void zzd(final zzry zzryVar, final zzmv zzmvVar) {
        final String strZzj = zzj();
        m.f19041a.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_common.zzsd
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb(zzryVar, zzmvVar, strZzj);
            }
        });
    }

    public final void zze(zzry zzryVar, AbstractC1959b abstractC1959b, boolean z4, int i) {
        zzsj.zzh().zzf(false);
        throw null;
    }

    public final void zzf(zzry zzryVar, AbstractC1959b abstractC1959b, zzmu zzmuVar, boolean z4, i iVar, zzna zznaVar) {
        zzsi zzsiVarZzh = zzsj.zzh();
        zzsiVarZzh.zzf(z4);
        zzsiVarZzh.zzd(iVar);
        zzsiVarZzh.zzb(zzmuVar);
        zzsiVarZzh.zza(zznaVar);
        zzg(zzryVar, abstractC1959b, zzsiVarZzh.zzh());
    }

    public final void zzg(final zzry zzryVar, final AbstractC1959b abstractC1959b, final zzsj zzsjVar) {
        m.f19041a.execute(new Runnable(zzryVar, zzsjVar, abstractC1959b) { // from class: com.google.android.gms.internal.mlkit_common.zzsg
            public final /* synthetic */ zzry zzb;
            public final /* synthetic */ zzsj zzc;
            public final /* synthetic */ AbstractC1959b zzd;

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc(this.zzb, this.zzc, null);
            }
        });
    }
}
