package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzazl implements Comparator {
    public zzazl(zzazn zzaznVar) {
        Objects.requireNonNull(zzaznVar);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzazq zzazqVar = (zzazq) obj;
        zzazq zzazqVar2 = (zzazq) obj2;
        int i = zzazqVar.zzc - zzazqVar2.zzc;
        return i != 0 ? i : Long.compare(zzazqVar.zza, zzazqVar2.zza);
    }
}
