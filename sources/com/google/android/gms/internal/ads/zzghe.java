package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzghe implements Serializable, zzghd {
    private final List zza;

    public final boolean equals(Object obj) {
        if (obj instanceof zzghe) {
            return this.zza.equals(((zzghe) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z4 = true;
        for (Object obj : this.zza) {
            if (!z4) {
                sb2.append(',');
            }
            sb2.append(obj);
            z4 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzghd
    public final boolean zza(Object obj) {
        int i = 0;
        while (true) {
            List list = this.zza;
            if (i >= list.size()) {
                return true;
            }
            if (!((zzghd) list.get(i)).zza(obj)) {
                return false;
            }
            i++;
        }
    }
}
