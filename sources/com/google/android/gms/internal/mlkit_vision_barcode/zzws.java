package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import w2.C2373d;
import w2.C2374e;

/* JADX INFO: loaded from: classes3.dex */
public final class zzws implements zzwe {
    private final zzrd zza;
    private zzvb zzb = new zzvb();
    private final int zzc;

    private zzws(zzrd zzrdVar, int i) {
        this.zza = zzrdVar;
        zzxb.zza();
        this.zzc = i;
    }

    public static zzwe zzf(zzrd zzrdVar) {
        return new zzws(zzrdVar, 0);
    }

    public static zzwe zzg(zzrd zzrdVar, int i) {
        return new zzws(zzrdVar, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwe
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwe
    public final zzwe zzb(zzrc zzrcVar) {
        this.zza.zzf(zzrcVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwe
    public final zzwe zzc(zzvb zzvbVar) {
        this.zzb = zzvbVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwe
    public final String zzd() {
        zzvd zzvdVarZzg = this.zza.zzk().zzg();
        return (zzvdVarZzg == null || zzba.zzc(zzvdVarZzg.zzk())) ? "NA" : (String) Preconditions.checkNotNull(zzvdVarZzg.zzk());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwe
    public final byte[] zze(int i, boolean z4) {
        this.zzb.zzf(Boolean.valueOf(1 == (i ^ 1)));
        this.zzb.zze(Boolean.FALSE);
        this.zza.zzj(this.zzb.zzm());
        try {
            zzxb.zza();
            if (i != 0) {
                zzrf zzrfVarZzk = this.zza.zzk();
                zzfi zzfiVar = new zzfi();
                zzox.zza.configure(zzfiVar);
                return zzfiVar.zza().zza(zzrfVarZzk);
            }
            zzrf zzrfVarZzk2 = this.zza.zzk();
            C2373d c2373d = new C2373d();
            zzox.zza.configure(c2373d);
            c2373d.f20681d = true;
            StringWriter stringWriter = new StringWriter();
            try {
                C2374e c2374e = new C2374e(stringWriter, c2373d.f20679a, c2373d.f20680b, c2373d.c, c2373d.f20681d);
                c2374e.a(zzrfVarZzk2);
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
