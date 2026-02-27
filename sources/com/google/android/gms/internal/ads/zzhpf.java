package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class zzhpf extends zzhpi implements zzaqs {
    protected final String zza = "moov";

    public zzhpf(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void zzb(zzhpj zzhpjVar, ByteBuffer byteBuffer, long j, zzaqp zzaqpVar) throws IOException {
        zzhpjVar.zzc();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzc = zzhpjVar;
        this.zze = zzhpjVar.zzc();
        zzhpjVar.zzd(zzhpjVar.zzc() + j);
        this.zzf = zzhpjVar.zzc();
        this.zzb = zzaqpVar;
    }
}
