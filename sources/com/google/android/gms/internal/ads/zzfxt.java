package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfxt {
    private MessageDigest zza;
    private final zzgea zzb;
    private final Object zzc = new Object();
    private boolean zzd = false;
    private SecureRandom zze;

    public zzfxt(zzgea zzgeaVar) {
        this.zzb = zzgeaVar;
    }

    public final void zza() {
        if (zzc()) {
            return;
        }
        zzb(new SecureRandom());
    }

    public final synchronized void zzb(SecureRandom secureRandom) {
        zzgdy zzgdyVarZza = this.zzb.zza(202);
        try {
            try {
                try {
                    zzgdyVarZza.zza();
                    this.zze = secureRandom;
                    this.zza = MessageDigest.getInstance("MD5");
                    this.zzd = true;
                } catch (Throwable th2) {
                    zzgdyVarZza.zzb(th2);
                    throw th2;
                }
            } catch (NoSuchAlgorithmException e) {
                zzgdyVarZza.zzb(e);
            }
            zzgdyVarZza.zzc();
        } catch (Throwable th3) {
            zzgdyVarZza.zzc();
            throw th3;
        }
    }

    public final synchronized boolean zzc() {
        return this.zzd;
    }

    public final byte[] zzd(byte[] bArr, String str, boolean z4) throws UnsupportedEncodingException {
        int length = bArr.length;
        int i = true != z4 ? 255 : 239;
        zzghc.zza(length <= i);
        ByteBuffer byteBufferPut = ByteBuffer.allocate(i + 1).put((byte) length);
        if (length < i) {
            int i4 = i - length;
            byte[] bArr2 = new byte[i4];
            this.zze.nextBytes(bArr2);
            bArr = Arrays.copyOf(bArr, length + i4);
            System.arraycopy(bArr2, 0, bArr, length, i4);
        }
        byte[] bArrArray = byteBufferPut.put(bArr).array();
        if (z4) {
            bArrArray = ByteBuffer.allocate(256).put(zze(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        zzfxw[] zzfxwVarArr = new zzfyj().zzcG;
        int length2 = zzfxwVarArr.length;
        for (int i6 = 0; i6 < 12; i6++) {
            zzfxwVarArr[i6].zza(bArrArray, bArr3);
        }
        if (!zzghs.zzc(str)) {
            new zzfxv(str.length() > 32 ? str.substring(0, 32).getBytes(StandardCharsets.UTF_8) : str.getBytes(StandardCharsets.UTF_8)).zza(bArr3);
        }
        return bArr3;
    }

    public final byte[] zze(byte[] bArr) {
        byte[] bArrDigest;
        synchronized (this.zzc) {
            this.zza.reset();
            this.zza.update(bArr);
            bArrDigest = this.zza.digest();
        }
        return bArrDigest;
    }

    public final zzatj zzf(byte[] bArr, String str) throws UnsupportedEncodingException {
        zzatj zzatjVarZza = zzatk.zza();
        byte[] bArrZze = zze(bArr);
        zzhhb zzhhbVar = zzhhb.zzb;
        zzatjVarZza.zzb(zzhhb.zzr(bArrZze, 0, bArrZze.length));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int length = bArr.length;
            if (i >= ((length - 1) / 255) + 1) {
                break;
            }
            int i4 = i * 255;
            int i6 = i4 + 255;
            if (length > i6) {
                length = i6;
            }
            arrayList.add(Arrays.copyOfRange(bArr, i4, length));
            i++;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zzatjVarZza.zza(zzhhb.zzr(zzd((byte[]) it.next(), str, false), 0, 256));
        }
        return zzatjVarZza;
    }

    public final String zzg(int i, String str) throws UnsupportedEncodingException {
        zzarw zzarwVarZzi = zzast.zzi();
        zzarwVarZzi.zzl(i);
        return Base64.encodeToString(zzd(((zzast) zzarwVarZzi.zzbu()).zzaN(), str, true), 11);
    }
}
