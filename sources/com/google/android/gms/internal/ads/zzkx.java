package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzkx implements zzva, zzrq {
    final /* synthetic */ zzlc zza;
    private final zzkz zzb;

    public zzkx(zzlc zzlcVar, zzkz zzkzVar) {
        Objects.requireNonNull(zzlcVar);
        this.zza = zzlcVar;
        this.zzb = zzkzVar;
    }

    @Nullable
    private final Pair zzf(int i, @Nullable zzup zzupVar) {
        zzup zzupVarZza;
        zzup zzupVar2 = null;
        if (zzupVar != null) {
            zzkz zzkzVar = this.zzb;
            int i4 = 0;
            while (true) {
                List list = zzkzVar.zzc;
                if (i4 >= list.size()) {
                    zzupVarZza = null;
                    break;
                }
                if (((zzup) list.get(i4)).zzd == zzupVar.zzd) {
                    Object obj = zzupVar.zza;
                    Object obj2 = zzkzVar.zzb;
                    int i6 = zzlj.zzb;
                    zzupVarZza = zzupVar.zza(Pair.create(obj2, obj));
                    break;
                }
                i4++;
            }
            if (zzupVarZza == null) {
                return null;
            }
            zzupVar2 = zzupVarZza;
        }
        return Pair.create(Integer.valueOf(this.zzb.zzd), zzupVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzcT(int i, @Nullable zzup zzupVar, final zzug zzugVar, final zzul zzulVar, final int i4) {
        final Pair pairZzf = zzf(0, zzupVar);
        if (pairZzf != null) {
            zzlc zzlcVar = this.zza;
            zzlcVar.zzj().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzi().zzcT(((Integer) pair.first).intValue(), (zzup) pair.second, zzugVar, zzulVar, i4);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzcU(int i, @Nullable zzup zzupVar, final zzug zzugVar, final zzul zzulVar) {
        final Pair pairZzf = zzf(0, zzupVar);
        if (pairZzf != null) {
            zzlc zzlcVar = this.zza;
            zzlcVar.zzj().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzks
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzi().zzcU(((Integer) pair.first).intValue(), (zzup) pair.second, zzugVar, zzulVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzcV(int i, @Nullable zzup zzupVar, final zzug zzugVar, final zzul zzulVar) {
        final Pair pairZzf = zzf(0, zzupVar);
        if (pairZzf != null) {
            zzlc zzlcVar = this.zza;
            zzlcVar.zzj().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzi().zzcV(((Integer) pair.first).intValue(), (zzup) pair.second, zzugVar, zzulVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzcW(int i, @Nullable zzup zzupVar, final zzug zzugVar, final zzul zzulVar, final IOException iOException, final boolean z4) {
        final Pair pairZzf = zzf(0, zzupVar);
        if (pairZzf != null) {
            zzlc zzlcVar = this.zza;
            zzlcVar.zzj().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzku
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzi().zzcW(((Integer) pair.first).intValue(), (zzup) pair.second, zzugVar, zzulVar, iOException, z4);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzcX(int i, @Nullable zzup zzupVar, final zzul zzulVar) {
        final Pair pairZzf = zzf(0, zzupVar);
        if (pairZzf != null) {
            zzlc zzlcVar = this.zza;
            zzlcVar.zzj().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzi().zzcX(((Integer) pair.first).intValue(), (zzup) pair.second, zzulVar);
                }
            });
        }
    }
}
