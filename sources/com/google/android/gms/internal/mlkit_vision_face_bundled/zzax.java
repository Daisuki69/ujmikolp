package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzax extends zzaq implements Set {
    private transient zzau zza;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzbe.zza(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzaq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zzd */
    public abstract zzbf iterator();

    public final zzau zzf() {
        zzau zzauVar = this.zza;
        if (zzauVar != null) {
            return zzauVar;
        }
        zzau zzauVarZzg = zzg();
        this.zza = zzauVarZzg;
        return zzauVarZzg;
    }

    public zzau zzg() {
        Object[] array = toArray();
        int i = zzau.zzd;
        return zzau.zzg(array, array.length);
    }
}
