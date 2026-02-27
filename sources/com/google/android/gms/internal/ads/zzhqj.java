package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhqj implements zzhpx {
    private final List zza;
    private final List zzb;

    static {
        zzhpy.zza(Collections.EMPTY_SET);
    }

    public /* synthetic */ zzhqj(List list, List list2, zzhqh zzhqhVar) {
        this.zza = list;
        this.zzb = list2;
    }

    public static zzhqi zza(int i, int i4) {
        return new zzhqi(i, i4, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        List list = this.zza;
        int size = list.size();
        List list2 = this.zzb;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((zzhqg) list2.get(i)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSetZzb = zzhpu.zzb(size);
        int size3 = list.size();
        for (int i4 = 0; i4 < size3; i4++) {
            Object objZzb = ((zzhqg) list.get(i4)).zzb();
            objZzb.getClass();
            hashSetZzb.add(objZzb);
        }
        int size4 = arrayList.size();
        for (int i6 = 0; i6 < size4; i6++) {
            for (Object obj : (Collection) arrayList.get(i6)) {
                obj.getClass();
                hashSetZzb.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSetZzb);
    }
}
