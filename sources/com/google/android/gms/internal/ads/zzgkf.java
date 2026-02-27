package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgkf {
    public static boolean zza(Iterable iterable, zzghd zzghdVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            zzghdVar.getClass();
            return zzc((List) iterable, zzghdVar);
        }
        Iterator it = iterable.iterator();
        zzghdVar.getClass();
        boolean z4 = false;
        while (it.hasNext()) {
            if (zzghdVar.zza(it.next())) {
                it.remove();
                z4 = true;
            }
        }
        return z4;
    }

    public static Object zzb(Iterable iterable, Object obj) {
        zzgmd it = ((zzglu) iterable).iterator();
        return it.hasNext() ? it.next() : obj;
    }

    private static boolean zzc(List list, zzghd zzghdVar) {
        int i = 0;
        int i4 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!zzghdVar.zza(obj)) {
                if (i > i4) {
                    try {
                        list.set(i4, obj);
                    } catch (IllegalArgumentException unused) {
                        zzd(list, zzghdVar, i4, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        zzd(list, zzghdVar, i4, i);
                        return true;
                    }
                }
                i4++;
            }
            i++;
        }
        list.subList(i4, list.size()).clear();
        return i != i4;
    }

    private static void zzd(List list, zzghd zzghdVar, int i, int i4) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i4) {
                break;
            } else if (zzghdVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i4--;
            if (i4 < i) {
                return;
            } else {
                list.remove(i4);
            }
        }
    }
}
