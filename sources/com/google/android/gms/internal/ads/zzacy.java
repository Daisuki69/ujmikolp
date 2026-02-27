package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.Ac3Util;
import androidx.media3.extractor.Ac4Util;
import androidx.media3.extractor.DtsUtil;
import androidx.media3.extractor.MpegAudioUtil;
import androidx.media3.extractor.OpusUtil;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzacy {
    public static void zza(boolean z4, @Nullable String str) throws zzas {
        if (!z4) {
            throw zzas.zzb(str, null);
        }
    }

    public static int zzb(zzacv zzacvVar, byte[] bArr, int i, int i4) throws IOException {
        int i6 = 0;
        while (i6 < i4) {
            int iZzg = zzacvVar.zzg(bArr, i + i6, i4 - i6);
            if (iZzg == -1) {
                break;
            }
            i6 += iZzg;
        }
        return i6;
    }

    public static boolean zzc(zzacv zzacvVar, byte[] bArr, int i, int i4) throws IOException {
        try {
            zzacvVar.zzc(bArr, i, i4);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zzd(zzacv zzacvVar, int i) throws IOException {
        try {
            zzacvVar.zzf(i);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zzacv zzacvVar, byte[] bArr, int i, int i4, boolean z4) throws IOException {
        try {
            return zzacvVar.zzh(bArr, 0, i4, z4);
        } catch (EOFException e) {
            if (z4) {
                return false;
            }
            throw e;
        }
    }

    public static int zzf(int i) {
        if (i == 20) {
            return OpusUtil.MAX_BYTES_PER_SECOND;
        }
        if (i == 30) {
            return DtsUtil.DTS_HD_MAX_RATE_BYTES_PER_SECOND;
        }
        switch (i) {
            case 5:
                return Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND;
            case 6:
                return 768000;
            case 7:
                return DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND;
            case 8:
                return DtsUtil.DTS_HD_MAX_RATE_BYTES_PER_SECOND;
            case 9:
                return MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND;
            case 10:
                return AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND;
            case 11:
                return AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND;
            case 12:
                return 7000;
            default:
                switch (i) {
                    case 14:
                        return Ac3Util.TRUEHD_MAX_RATE_BYTES_PER_SECOND;
                    case 15:
                        return 8000;
                    case 16:
                        return AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND;
                    case 17:
                        return Ac4Util.MAX_RATE_BYTES_PER_SECOND;
                    case 18:
                        return 768000;
                    default:
                        return androidx.media3.common.C.RATE_UNSET_INT;
                }
        }
    }
}
