package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzxn extends zzbj {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private final SparseArray zzh;
    private final SparseBooleanArray zzi;

    public zzxn() {
        this.zzh = new SparseArray();
        this.zzi = new SparseBooleanArray();
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
        this.zzg = true;
    }

    public final /* synthetic */ boolean zzA() {
        return this.zzb;
    }

    public final /* synthetic */ boolean zzB() {
        return this.zzc;
    }

    public final /* synthetic */ boolean zzC() {
        return this.zzd;
    }

    public final /* synthetic */ boolean zzD() {
        return this.zze;
    }

    public final /* synthetic */ boolean zzE() {
        return this.zzf;
    }

    public final /* synthetic */ boolean zzF() {
        return this.zzg;
    }

    public final /* synthetic */ SparseArray zzG() {
        return this.zzh;
    }

    public final /* synthetic */ SparseBooleanArray zzH() {
        return this.zzi;
    }

    public final zzxn zzx(zzbk zzbkVar) {
        zza(zzbkVar);
        return this;
    }

    public final zzxn zzy(int i, boolean z4) {
        SparseBooleanArray sparseBooleanArray = this.zzi;
        if (sparseBooleanArray.get(i) == z4) {
            return this;
        }
        if (z4) {
            sparseBooleanArray.put(i, true);
            return this;
        }
        sparseBooleanArray.delete(i);
        return this;
    }

    public final /* synthetic */ boolean zzz() {
        return this.zza;
    }

    public /* synthetic */ zzxn(zzxo zzxoVar, byte[] bArr) {
        super(zzxoVar);
        this.zza = zzxoVar.zzK;
        this.zzb = zzxoVar.zzM;
        this.zzc = zzxoVar.zzO;
        this.zzd = zzxoVar.zzT;
        this.zze = zzxoVar.zzU;
        this.zzf = zzxoVar.zzV;
        this.zzg = zzxoVar.zzX;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArrayZze = zzxoVar.zze();
            if (i < sparseArrayZze.size()) {
                sparseArray.put(sparseArrayZze.keyAt(i), new HashMap((Map) sparseArrayZze.valueAt(i)));
                i++;
            } else {
                this.zzh = sparseArray;
                this.zzi = zzxoVar.zzf().clone();
                return;
            }
        }
    }
}
