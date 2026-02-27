package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import mx_android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes3.dex */
final class zzatt {
    static boolean zza;
    public static final /* synthetic */ int zzc = 0;
    private static MessageDigest zzd;
    private static final Object zze = new Object();
    private static final Object zzf = new Object();
    static final CountDownLatch zzb = new CountDownLatch(1);

    public static void zza() {
        synchronized (zzf) {
            try {
                if (!zza) {
                    zza = true;
                    new Thread(new zzats(null)).start();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String zzb(byte[] bArr, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        zzatj zzatjVarZzc = zzc(bArr, str);
        return zzatn.zza(zzatjVarZzc == null ? zzh(zzg(4096).zzaN(), str, true) : ((zzatk) zzatjVarZzc.zzbu()).zzaN(), true);
    }

    public static zzatj zzc(byte[] bArr, String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        Vector vectorZzd = zzd(bArr, 255);
        if (vectorZzd == null || vectorZzd.isEmpty()) {
            return null;
        }
        zzatj zzatjVarZza = zzatk.zza();
        int size = vectorZzd.size();
        for (int i = 0; i < size; i++) {
            zzatjVarZza.zza(zzhhb.zzr(zzh((byte[]) vectorZzd.get(i), str, false), 0, 256));
        }
        byte[] bArrZze = zze(bArr);
        zzhhb zzhhbVar = zzhhb.zzb;
        zzatjVarZza.zzb(zzhhb.zzr(bArrZze, 0, bArrZze.length));
        return zzatjVarZza;
    }

    public static Vector zzd(byte[] bArr, int i) {
        int length = bArr.length;
        if (length <= 0) {
            return null;
        }
        int i4 = length + 254;
        Vector vector = new Vector();
        for (int i6 = 0; i6 < i4 / 255; i6++) {
            int i10 = i6 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i10 > 255) {
                    length2 = i10 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i10, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    public static byte[] zze(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        synchronized (zze) {
            try {
                zza();
                MessageDigest messageDigest2 = null;
                try {
                    if (zzb.await(2L, TimeUnit.SECONDS) && (messageDigest = zzd) != null) {
                        messageDigest2 = messageDigest;
                    }
                } catch (InterruptedException unused) {
                }
                if (messageDigest2 == null) {
                    throw new NoSuchAlgorithmException("Cannot compute hash");
                }
                messageDigest2.reset();
                messageDigest2.update(bArr);
                bArrDigest = zzd.digest();
            } finally {
            }
        }
        return bArrDigest;
    }

    public static zzast zzg(int i) {
        zzarw zzarwVarZzi = zzast.zzi();
        zzarwVarZzi.zzl(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
        return (zzast) zzarwVarZzi.zzbu();
    }

    private static byte[] zzh(byte[] bArr, String str, boolean z4) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] bArrArray;
        int length = bArr.length;
        int i = true != z4 ? 255 : 239;
        if (length > i) {
            bArr = zzg(4096).zzaN();
        }
        int i4 = i + 1;
        int length2 = bArr.length;
        byte b8 = (byte) length2;
        if (length2 < i) {
            byte[] bArr2 = new byte[i - length2];
            new SecureRandom().nextBytes(bArr2);
            bArrArray = ByteBuffer.allocate(i4).put(b8).put(bArr).put(bArr2).array();
        } else {
            bArrArray = ByteBuffer.allocate(i4).put(b8).put(bArr).array();
        }
        if (z4) {
            bArrArray = ByteBuffer.allocate(256).put(zze(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        zzatu[] zzatuVarArr = new zzauh().zzcG;
        int length3 = zzatuVarArr.length;
        for (int i6 = 0; i6 < 12; i6++) {
            zzatuVarArr[i6].zza(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzatl(str.getBytes("UTF-8")).zza(bArr3);
        }
        return bArr3;
    }
}
