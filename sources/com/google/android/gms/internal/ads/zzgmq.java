package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
final class zzgmq extends zzgml {
    private final File zza;
    private final zzgke zzb;

    public /* synthetic */ zzgmq(File file, zzgmp[] zzgmpVarArr, byte[] bArr) {
        file.getClass();
        this.zza = file;
        this.zzb = zzgke.zzp(zzgmpVarArr);
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.zzb);
        StringBuilder sb2 = new StringBuilder(length + 19 + strValueOf.length() + 1);
        androidx.media3.datasource.cache.c.A(sb2, "Files.asByteSink(", string, ", ", strValueOf);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final /* bridge */ /* synthetic */ OutputStream zza() throws IOException {
        return new FileOutputStream(this.zza, this.zzb.contains(zzgmp.APPEND));
    }
}
