package com.google.android.gms.internal.mlkit_vision_face_bundled;

import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import w2.C2373d;
import w2.C2374e;

/* JADX INFO: loaded from: classes3.dex */
public final class zzsh implements zzrw {
    private final zzni zza;
    private zzqw zzb = new zzqw();
    private final int zzc;

    private zzsh(zzni zzniVar, int i) {
        this.zza = zzniVar;
        zzsn.zza();
        this.zzc = i;
    }

    public static zzrw zzf(zzni zzniVar, int i) {
        return new zzsh(zzniVar, i);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzrw
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzrw
    public final zzrw zzb(zznh zznhVar) {
        this.zza.zze(zznhVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzrw
    public final zzrw zzc(zzqw zzqwVar) {
        this.zzb = zzqwVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzrw
    public final String zzd() {
        String strZzk;
        zzqy zzqyVarZzd = this.zza.zzh().zzd();
        return (zzqyVarZzd == null || (strZzk = zzqyVarZzd.zzk()) == null || strZzk.isEmpty()) ? "NA" : (String) Preconditions.checkNotNull(zzqyVarZzd.zzk());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzrw
    public final byte[] zze(int i, boolean z4) {
        this.zzb.zzf(Boolean.valueOf(1 == (i ^ 1)));
        this.zzb.zze(Boolean.FALSE);
        this.zza.zzg(this.zzb.zzm());
        try {
            zzsn.zza();
            if (i != 0) {
                zznk zznkVarZzh = this.zza.zzh();
                zzbq zzbqVar = new zzbq();
                zzlb.zza.configure(zzbqVar);
                return zzbqVar.zza().zza(zznkVarZzh);
            }
            zznk zznkVarZzh2 = this.zza.zzh();
            C2373d c2373d = new C2373d();
            zzlb.zza.configure(c2373d);
            c2373d.f20681d = true;
            StringWriter stringWriter = new StringWriter();
            try {
                C2374e c2374e = new C2374e(stringWriter, c2373d.f20679a, c2373d.f20680b, c2373d.c, c2373d.f20681d);
                c2374e.a(zznkVarZzh2);
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
