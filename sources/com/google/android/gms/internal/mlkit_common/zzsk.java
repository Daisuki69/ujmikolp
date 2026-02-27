package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import w2.C2373d;
import w2.C2374e;

/* JADX INFO: loaded from: classes3.dex */
public final class zzsk implements zzry {
    private final zzmw zza;
    private zzqt zzb = new zzqt();

    private zzsk(zzmw zzmwVar, int i) {
        this.zza = zzmwVar;
        zzsv.zza();
    }

    public static zzry zzf(zzmw zzmwVar) {
        return new zzsk(zzmwVar, 0);
    }

    public static zzry zzg() {
        return new zzsk(new zzmw(), 0);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final zzry zza(zzmv zzmvVar) {
        this.zza.zzf(zzmvVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final zzry zzb(zznc zzncVar) {
        this.zza.zzi(zzncVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final zzry zzc(zzqt zzqtVar) {
        this.zzb = zzqtVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final String zzd() {
        String strZzk;
        zzqv zzqvVarZzf = this.zza.zzk().zzf();
        return (zzqvVarZzf == null || (strZzk = zzqvVarZzf.zzk()) == null || strZzk.isEmpty()) ? "NA" : (String) Preconditions.checkNotNull(zzqvVarZzf.zzk());
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final byte[] zze(int i, boolean z4) {
        this.zzb.zzf(Boolean.valueOf(1 == (i ^ 1)));
        this.zzb.zze(Boolean.FALSE);
        this.zza.zzj(this.zzb.zzm());
        try {
            zzsv.zza();
            if (i != 0) {
                zzmy zzmyVarZzk = this.zza.zzk();
                zzbg zzbgVar = new zzbg();
                zzkr.zza.configure(zzbgVar);
                return zzbgVar.zza().zza(zzmyVarZzk);
            }
            zzmy zzmyVarZzk2 = this.zza.zzk();
            C2373d c2373d = new C2373d();
            zzkr.zza.configure(c2373d);
            c2373d.f20681d = true;
            StringWriter stringWriter = new StringWriter();
            try {
                C2374e c2374e = new C2374e(stringWriter, c2373d.f20679a, c2373d.f20680b, c2373d.c, c2373d.f20681d);
                c2374e.a(zzmyVarZzk2);
                c2374e.c();
                c2374e.f20683b.flush();
            } catch (IOException unused) {
            }
            return stringWriter.toString().getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
