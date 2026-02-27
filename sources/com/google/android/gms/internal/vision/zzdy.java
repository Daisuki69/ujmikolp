package com.google.android.gms.internal.vision;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
final class zzdy extends zzdl {

    @NullableDecl
    private final Object zza;
    private int zzb;
    private final /* synthetic */ zzdp zzc;

    public zzdy(zzdp zzdpVar, int i) {
        this.zzc = zzdpVar;
        this.zza = zzdpVar.zzb[i];
        this.zzb = i;
    }

    private final void zza() {
        int i = this.zzb;
        if (i == -1 || i >= this.zzc.size() || !zzcz.zza(this.zza, this.zzc.zzb[this.zzb])) {
            this.zzb = this.zzc.zza(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.vision.zzdl, java.util.Map.Entry
    @NullableDecl
    public final Object getKey() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.vision.zzdl, java.util.Map.Entry
    @NullableDecl
    public final Object getValue() {
        Map mapZzb = this.zzc.zzb();
        if (mapZzb != null) {
            return mapZzb.get(this.zza);
        }
        zza();
        int i = this.zzb;
        if (i == -1) {
            return null;
        }
        return this.zzc.zzc[i];
    }

    @Override // com.google.android.gms.internal.vision.zzdl, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapZzb = this.zzc.zzb();
        if (mapZzb != null) {
            return mapZzb.put(this.zza, obj);
        }
        zza();
        int i = this.zzb;
        if (i == -1) {
            this.zzc.put(this.zza, obj);
            return null;
        }
        Object[] objArr = this.zzc.zzc;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }
}
