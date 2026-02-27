package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzgxu extends zzgqs {
    private final String zza;
    private final zzhep zzb;

    public /* synthetic */ zzgxu(String str, zzhep zzhepVar, byte[] bArr) {
        this.zza = str;
        this.zzb = zzhepVar;
    }

    public final String toString() {
        String str = this.zza;
        int iOrdinal = this.zzb.ordinal();
        return We.s.l("(typeUrl=", str, ", outputPrefixType=", iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgqs
    public final boolean zza() {
        return this.zzb != zzhep.RAW;
    }
}
