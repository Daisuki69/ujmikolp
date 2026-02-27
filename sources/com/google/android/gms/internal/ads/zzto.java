package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzto implements zzur {
    private final ArrayList zza = new ArrayList(1);
    private final HashSet zzb = new HashSet(1);
    private final zzuz zzc = new zzuz();
    private final zzrp zzd = new zzrp();

    @Nullable
    private Looper zze;

    @Nullable
    private zzbe zzf;

    @Nullable
    private zzox zzg;

    @Override // com.google.android.gms.internal.ads.zzur
    public /* synthetic */ void zzA(zzaj zzajVar) {
        M.a(this, zzajVar);
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public /* synthetic */ zzbe zzH() {
        return M.b(this);
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public /* synthetic */ boolean zzI() {
        return M.c(this);
    }

    public void zzM() {
    }

    public abstract void zza(@Nullable zzgy zzgyVar);

    public void zzc() {
    }

    public abstract void zzd();

    public final void zze(zzbe zzbeVar) {
        this.zzf = zzbeVar;
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zzuq) arrayList.get(i)).zza(this, zzbeVar);
        }
    }

    public final zzuz zzf(@Nullable zzup zzupVar) {
        return this.zzc.zza(0, zzupVar);
    }

    public final zzuz zzg(int i, @Nullable zzup zzupVar) {
        return this.zzc.zza(0, zzupVar);
    }

    public final zzrp zzh(@Nullable zzup zzupVar) {
        return this.zzd.zza(0, zzupVar);
    }

    public final zzrp zzi(int i, @Nullable zzup zzupVar) {
        return this.zzd.zza(0, zzupVar);
    }

    public final boolean zzj() {
        return !this.zzb.isEmpty();
    }

    public final zzox zzk() {
        zzox zzoxVar = this.zzg;
        zzoxVar.getClass();
        return zzoxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzl(Handler handler, zzva zzvaVar) {
        this.zzc.zzb(handler, zzvaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzm(zzva zzvaVar) {
        this.zzc.zzc(zzvaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzn(Handler handler, zzrq zzrqVar) {
        this.zzd.zzb(handler, zzrqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzo(zzrq zzrqVar) {
        this.zzd.zzc(zzrqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzp(zzuq zzuqVar, @Nullable zzgy zzgyVar, zzox zzoxVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z4 = true;
        if (looper != null && looper != looperMyLooper) {
            z4 = false;
        }
        zzghc.zza(z4);
        this.zzg = zzoxVar;
        zzbe zzbeVar = this.zzf;
        this.zza.add(zzuqVar);
        if (this.zze == null) {
            this.zze = looperMyLooper;
            this.zzb.add(zzuqVar);
            zza(zzgyVar);
        } else if (zzbeVar != null) {
            zzq(zzuqVar);
            zzuqVar.zza(this, zzbeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzq(zzuq zzuqVar) {
        this.zze.getClass();
        HashSet hashSet = this.zzb;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(zzuqVar);
        if (zIsEmpty) {
            zzM();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzr(zzuq zzuqVar) {
        HashSet hashSet = this.zzb;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(zzuqVar);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzs(zzuq zzuqVar) {
        ArrayList arrayList = this.zza;
        arrayList.remove(zzuqVar);
        if (!arrayList.isEmpty()) {
            zzr(zzuqVar);
            return;
        }
        this.zze = null;
        this.zzf = null;
        this.zzg = null;
        this.zzb.clear();
        zzd();
    }
}
