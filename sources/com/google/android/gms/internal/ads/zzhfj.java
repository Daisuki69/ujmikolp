package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhfj implements zzgpx {
    private final zzhfy zza;
    private final zzgqr zzb;
    private final int zzc;
    private final byte[] zzd;

    private zzhfj(zzhfy zzhfyVar, zzgqr zzgqrVar, int i, byte[] bArr) {
        this.zza = zzhfyVar;
        this.zzb = zzgqrVar;
        this.zzc = i;
        this.zzd = bArr;
    }

    public static zzgpx zzb(zzgrm zzgrmVar) throws GeneralSecurityException {
        zzhfd zzhfdVar = new zzhfd(zzgrmVar.zzd().zzc(zzgqc.zza()), zzgrmVar.zzf().zzf());
        String strValueOf = String.valueOf(zzgrmVar.zzf().zzh());
        return new zzhfj(zzhfdVar, new zzhgd(new zzhgc("HMAC".concat(strValueOf), new SecretKeySpec(zzgrmVar.zze().zzc(zzgqc.zza()), "HMAC")), zzgrmVar.zzf().zze()), zzgrmVar.zzf().zze(), zzgrmVar.zzb().zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgpx
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzd;
        int length = bArr.length;
        int i = this.zzc;
        int length2 = bArr3.length;
        if (length < i + length2) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!zzgzu.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int i4 = length - i;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i4);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i4, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (MessageDigest.isEqual(((zzhgd) this.zzb).zzc(zzhfh.zza(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))), bArrCopyOfRange2)) {
            return this.zza.zza(bArrCopyOfRange);
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
