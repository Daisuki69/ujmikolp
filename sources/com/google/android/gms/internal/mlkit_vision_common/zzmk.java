package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import w2.C2373d;
import w2.C2374e;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmk implements zzmb {
    private final zziw zza;
    private zzky zzb = new zzky();

    private zzmk(zziw zziwVar, int i) {
        this.zza = zziwVar;
        zzmw.zza();
    }

    public static zzmb zze(zziw zziwVar) {
        return new zzmk(zziwVar, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final zzmb zza(zziv zzivVar) {
        this.zza.zzc(zzivVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final zzmb zzb(zzky zzkyVar) {
        this.zzb = zzkyVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final String zzc() {
        zzla zzlaVarZzc = this.zza.zzf().zzc();
        return (zzlaVarZzc == null || zzg.zzb(zzlaVarZzc.zzk())) ? "NA" : (String) Preconditions.checkNotNull(zzlaVarZzc.zzk());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final byte[] zzd(int i, boolean z4) {
        this.zzb.zzf(Boolean.valueOf(1 == (i ^ 1)));
        this.zzb.zze(Boolean.FALSE);
        this.zza.zze(this.zzb.zzm());
        try {
            zzmw.zza();
            if (i != 0) {
                zziy zziyVarZzf = this.zza.zzf();
                zzam zzamVar = new zzam();
                zzhe.zza.configure(zzamVar);
                return zzamVar.zza().zza(zziyVarZzf);
            }
            zziy zziyVarZzf2 = this.zza.zzf();
            C2373d c2373d = new C2373d();
            zzhe.zza.configure(c2373d);
            c2373d.f20681d = true;
            StringWriter stringWriter = new StringWriter();
            try {
                C2374e c2374e = new C2374e(stringWriter, c2373d.f20679a, c2373d.f20680b, c2373d.c, c2373d.f20681d);
                c2374e.a(zziyVarZzf2);
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
