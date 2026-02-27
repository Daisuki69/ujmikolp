package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import w2.C2373d;
import w2.C2374e;

/* JADX INFO: loaded from: classes3.dex */
public final class zzof implements zznr {
    private final zzku zza;
    private zzmt zzb = new zzmt();
    private final int zzc;

    private zzof(zzku zzkuVar, int i) {
        this.zza = zzkuVar;
        zzoo.zza();
        this.zzc = i;
    }

    public static zznr zzf(zzku zzkuVar) {
        return new zzof(zzkuVar, 0);
    }

    public static zznr zzg(zzku zzkuVar, int i) {
        return new zzof(zzkuVar, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznr
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznr
    public final zznr zzb(zzkt zzktVar) {
        this.zza.zzf(zzktVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznr
    public final zznr zzc(zzmt zzmtVar) {
        this.zzb = zzmtVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznr
    public final String zzd() {
        zzmv zzmvVarZzf = this.zza.zzj().zzf();
        return (zzmvVarZzf == null || zzac.zzb(zzmvVarZzf.zzk())) ? "NA" : (String) Preconditions.checkNotNull(zzmvVarZzf.zzk());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznr
    public final byte[] zze(int i, boolean z4) {
        this.zzb.zzf(Boolean.valueOf(1 == (i ^ 1)));
        this.zzb.zze(Boolean.FALSE);
        this.zza.zzi(this.zzb.zzm());
        try {
            zzoo.zza();
            if (i != 0) {
                zzkw zzkwVarZzj = this.zza.zzj();
                zzcy zzcyVar = new zzcy();
                zzix.zza.configure(zzcyVar);
                return zzcyVar.zza().zza(zzkwVarZzj);
            }
            zzkw zzkwVarZzj2 = this.zza.zzj();
            C2373d c2373d = new C2373d();
            zzix.zza.configure(c2373d);
            c2373d.f20681d = true;
            StringWriter stringWriter = new StringWriter();
            try {
                C2374e c2374e = new C2374e(stringWriter, c2373d.f20679a, c2373d.f20680b, c2373d.c, c2373d.f20681d);
                c2374e.a(zzkwVarZzj2);
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
