package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaqq extends zzhpi implements Closeable, AutoCloseable {
    static {
        zzhpp.zzb(zzaqq.class);
    }

    public zzaqq(zzhpj zzhpjVar, zzaqp zzaqpVar) throws IOException {
        zzd(zzhpjVar, zzhpjVar.zzb(), zzaqpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhpi, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzhpi
    public final String toString() {
        String string = this.zzc.toString();
        StringBuilder sb2 = new StringBuilder(androidx.media3.datasource.cache.c.c(7, string));
        sb2.append("model(");
        sb2.append(string);
        sb2.append(")");
        return sb2.toString();
    }
}
