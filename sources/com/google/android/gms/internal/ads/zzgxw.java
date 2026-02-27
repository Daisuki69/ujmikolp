package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgxw extends zzgqs {
    private final zzgzk zza;

    public zzgxw(zzgzk zzgzkVar) {
        this.zza = zzgzkVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgxw)) {
            return false;
        }
        zzgzk zzgzkVar = ((zzgxw) obj).zza;
        zzgzk zzgzkVar2 = this.zza;
        return zzgzkVar2.zzc().zzc().equals(zzgzkVar.zzc().zzc()) && zzgzkVar2.zzc().zza().equals(zzgzkVar.zzc().zza()) && zzgzkVar2.zzc().zzb().equals(zzgzkVar.zzc().zzb());
    }

    public final int hashCode() {
        zzgzk zzgzkVar = this.zza;
        return Objects.hash(zzgzkVar.zzc(), zzgzkVar.zzf());
    }

    public final String toString() {
        zzgzk zzgzkVar = this.zza;
        String strZza = zzgzkVar.zzc().zza();
        int iOrdinal = zzgzkVar.zzc().zzc().ordinal();
        return We.s.l("(typeUrl=", strZza, ", outputPrefixType=", iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgqs
    public final boolean zza() {
        return this.zza.zzc().zzc() != zzhep.RAW;
    }

    public final zzgzk zzb() {
        return this.zza;
    }
}
