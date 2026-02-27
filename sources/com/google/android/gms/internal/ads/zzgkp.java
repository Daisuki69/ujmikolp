package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgkp {
    public static ArrayList zza(Iterator it) {
        ArrayList arrayList = new ArrayList();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static ArrayList zzb(int i) {
        zzgiz.zzb(i, "initialArraySize");
        return new ArrayList(i);
    }

    public static List zzc(List list, zzggr zzggrVar) {
        return list instanceof RandomAccess ? new zzgkm(list, zzggrVar) : new zzgko(list, zzggrVar);
    }
}
