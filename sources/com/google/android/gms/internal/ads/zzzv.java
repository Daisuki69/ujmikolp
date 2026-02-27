package com.google.android.gms.internal.ads;

import android.view.Surface;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class zzzv implements zzabr {
    private final zzaau zza;
    private final zzaav zzb;
    private final zzaba zzc;
    private final Queue zzd;

    @Nullable
    private Surface zze;
    private zzu zzf;
    private long zzg;
    private zzabo zzh;
    private Executor zzi;
    private zzaar zzj;

    public zzzv(zzaau zzaauVar, zzaav zzaavVar, zzdb zzdbVar) {
        this.zza = zzaauVar;
        this.zzb = zzaavVar;
        zzaauVar.zzg(zzdbVar);
        this.zzc = new zzaba(new zzzu(this, null), zzaauVar, zzaavVar);
        this.zzd = new ArrayDeque();
        this.zzf = new zzs().zzM();
        this.zzg = androidx.media3.common.C.TIME_UNSET;
        this.zzh = zzabo.zzb;
        this.zzi = zzzq.zza;
        this.zzj = zzzo.zza;
    }

    public final /* synthetic */ Surface zzA() {
        return this.zze;
    }

    public final /* synthetic */ zzabo zzB() {
        return this.zzh;
    }

    public final /* synthetic */ Executor zzC() {
        return this.zzi;
    }

    public final /* synthetic */ zzaar zzD() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zza() {
        this.zzb.zzd();
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzb() {
        this.zzb.zzd();
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzc(zzabo zzaboVar, Executor executor) {
        this.zzh = zzaboVar;
        this.zzi = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final boolean zzd(zzu zzuVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzf() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzg(boolean z4) {
        if (z4) {
            this.zza.zzl();
        }
        this.zzb.zzd();
        this.zzc.zza();
        this.zzd.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final boolean zzh(boolean z4) {
        return this.zza.zzi(z4);
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzi() {
        this.zzc.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final boolean zzj() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final Surface zzk() {
        Surface surface = this.zze;
        surface.getClass();
        return surface;
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzl(zzaar zzaarVar) {
        this.zzj = zzaarVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzm(float f) {
        this.zza.zzn(f);
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzn(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzo(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzp(Surface surface, zzeg zzegVar) {
        this.zze = surface;
        this.zza.zzd(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzq() {
        this.zze = null;
        this.zza.zzd(null);
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzr(int i) {
        this.zza.zzm(i);
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzs(int i, zzu zzuVar, long j, int i4, List list) {
        zzghc.zzh(list.isEmpty());
        int i6 = zzuVar.zzv;
        zzu zzuVar2 = this.zzf;
        if (i6 != zzuVar2.zzv || zzuVar.zzw != zzuVar2.zzw) {
            this.zzc.zzc(i6, zzuVar.zzw);
        }
        float f = zzuVar.zzz;
        if (f != this.zzf.zzz) {
            this.zza.zze(f);
        }
        this.zzf = zzuVar;
        if (j != this.zzg) {
            this.zzc.zzd(i4, j);
            this.zzg = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzt() {
        this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final boolean zzu(long j, zzabp zzabpVar) {
        this.zzd.add(zzabpVar);
        this.zzc.zze(j);
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzy();
            }
        });
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzv(long j, long j6) throws zzabq {
        try {
            this.zzc.zzb(j, j6);
        } catch (zzhz e) {
            throw new zzabq(e, this.zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzw(boolean z4) {
        this.zza.zzj(z4);
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzx() {
    }

    public final /* synthetic */ void zzy() {
        this.zzh.zza();
    }

    public final /* synthetic */ Queue zzz() {
        return this.zzd;
    }
}
