package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
class zzgit extends zzgir implements List {
    final /* synthetic */ zzgiu zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgit(zzgiu zzgiuVar, Object obj, List list, zzgir zzgirVar) {
        super(zzgiuVar, obj, list, zzgirVar);
        Objects.requireNonNull(zzgiuVar);
        this.zzf = zzgiuVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        zza();
        boolean zIsEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i, obj);
        zzgiu zzgiuVar = this.zzf;
        zzgiuVar.zzq(zzgiuVar.zzp() + 1);
        if (zIsEmpty) {
            zzc();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.zzb).addAll(i, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.zzb.size();
        zzgiu zzgiuVar = this.zzf;
        zzgiuVar.zzq(zzgiuVar.zzp() + (size2 - size));
        if (size != 0) {
            return zAddAll;
        }
        zzc();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zza();
        return ((List) this.zzb).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zza();
        return ((List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zza();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zza();
        return new zzgis(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        zza();
        Object objRemove = ((List) this.zzb).remove(i);
        this.zzf.zzq(r0.zzp() - 1);
        zzb();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        zza();
        return ((List) this.zzb).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i4) {
        zza();
        List listSubList = ((List) this.zzb).subList(i, i4);
        zzgir zzgirVar = this.zzc;
        if (zzgirVar == null) {
            zzgirVar = this;
        }
        return this.zzf.zzg(this.zza, listSubList, zzgirVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        zza();
        return new zzgis(this, i);
    }
}
