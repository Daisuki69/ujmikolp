package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzccj implements Iterable {
    private final List zza = new ArrayList();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.iterator();
    }

    public final boolean zza(zzcbd zzcbdVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcci zzcciVar = (zzcci) it.next();
            if (zzcciVar.zza == zzcbdVar) {
                arrayList.add(zzcciVar);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((zzcci) it2.next()).zzb.zzl();
        }
        return true;
    }

    @Nullable
    public final zzcci zzb(zzcbd zzcbdVar) {
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcci zzcciVar = (zzcci) it.next();
            if (zzcciVar.zza == zzcbdVar) {
                return zzcciVar;
            }
        }
        return null;
    }

    public final void zzc(zzcci zzcciVar) {
        this.zza.add(zzcciVar);
    }

    public final void zzd(zzcci zzcciVar) {
        this.zza.remove(zzcciVar);
    }
}
