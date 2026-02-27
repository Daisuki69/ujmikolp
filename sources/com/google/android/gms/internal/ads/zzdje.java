package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdje {
    public static final zzdje zza = new zzdje(new zzdjd());

    @Nullable
    private final zzbgx zzb;

    @Nullable
    private final zzbgu zzc;

    @Nullable
    private final zzbhk zzd;

    @Nullable
    private final zzbhh zze;

    @Nullable
    private final zzbmf zzf;
    private final SimpleArrayMap zzg;
    private final SimpleArrayMap zzh;

    public /* synthetic */ zzdje(zzdjd zzdjdVar, byte[] bArr) {
        this(zzdjdVar);
    }

    @Nullable
    public final zzbgx zza() {
        return this.zzb;
    }

    @Nullable
    public final zzbgu zzb() {
        return this.zzc;
    }

    @Nullable
    public final zzbhk zzc() {
        return this.zzd;
    }

    @Nullable
    public final zzbhh zzd() {
        return this.zze;
    }

    @Nullable
    public final zzbmf zze() {
        return this.zzf;
    }

    @Nullable
    public final zzbhd zzf(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return (zzbhd) this.zzg.get(str);
    }

    @Nullable
    public final zzbha zzg(String str) {
        return (zzbha) this.zzh.get(str);
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    public final ArrayList zzi() {
        SimpleArrayMap simpleArrayMap = this.zzg;
        ArrayList arrayList = new ArrayList(simpleArrayMap.size());
        for (int i = 0; i < simpleArrayMap.size(); i++) {
            arrayList.add((String) simpleArrayMap.keyAt(i));
        }
        return arrayList;
    }

    private zzdje(zzdjd zzdjdVar) {
        this.zzb = zzdjdVar.zza;
        this.zzc = zzdjdVar.zzb;
        this.zzd = zzdjdVar.zzc;
        this.zzg = new SimpleArrayMap(zzdjdVar.zzf);
        this.zzh = new SimpleArrayMap(zzdjdVar.zzg);
        this.zze = zzdjdVar.zzd;
        this.zzf = zzdjdVar.zze;
    }
}
