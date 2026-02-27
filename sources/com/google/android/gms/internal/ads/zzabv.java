package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.OpusUtil;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.media3.extractor.ts.TsExtractor;
import java.nio.ByteBuffer;
import okio.Utf8;

/* JADX INFO: loaded from: classes3.dex */
public final class zzabv {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {OpusUtil.SAMPLE_RATE, 44100, 32000};
    private static final int[] zzd = {24000, 22050, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, 256, 320, RendererCapabilities.DECODER_SUPPORT_MASK, 448, 512, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, TsExtractor.TS_STREAM_TYPE_DTS_UHD, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static zzu zza(zzef zzefVar, String str, @Nullable String str2, @Nullable zzp zzpVar) {
        zzee zzeeVar = new zzee();
        zzeeVar.zza(zzefVar);
        int i = zzc[zzeeVar.zzj(2)];
        zzeeVar.zzh(8);
        int i4 = zze[zzeeVar.zzj(3)];
        if (zzeeVar.zzj(1) != 0) {
            i4++;
        }
        int i6 = zzf[zzeeVar.zzj(5)] * 1000;
        zzeeVar.zzm();
        zzefVar.zzh(zzeeVar.zze());
        zzs zzsVar = new zzs();
        zzsVar.zza(str);
        zzsVar.zzm(MimeTypes.AUDIO_AC3);
        zzsVar.zzE(i4);
        zzsVar.zzF(i);
        zzsVar.zzq(zzpVar);
        zzsVar.zze(str2);
        zzsVar.zzh(i6);
        zzsVar.zzi(i6);
        return zzsVar.zzM();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzu zzb(com.google.android.gms.internal.ads.zzef r7, java.lang.String r8, @androidx.annotation.Nullable java.lang.String r9, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzp r10) {
        /*
            com.google.android.gms.internal.ads.zzee r0 = new com.google.android.gms.internal.ads.zzee
            r0.<init>()
            r0.zza(r7)
            r1 = 13
            int r1 = r0.zzj(r1)
            int r1 = r1 * 1000
            r2 = 3
            r0.zzh(r2)
            r3 = 2
            int r3 = r0.zzj(r3)
            int[] r4 = com.google.android.gms.internal.ads.zzabv.zzc
            r3 = r4[r3]
            r4 = 10
            r0.zzh(r4)
            int[] r4 = com.google.android.gms.internal.ads.zzabv.zze
            int r5 = r0.zzj(r2)
            r4 = r4[r5]
            r5 = 1
            int r6 = r0.zzj(r5)
            if (r6 == 0) goto L33
            int r4 = r4 + 1
        L33:
            r0.zzh(r2)
            r2 = 4
            int r2 = r0.zzj(r2)
            r0.zzh(r5)
            if (r2 <= 0) goto L4f
            r2 = 6
            r0.zzh(r2)
            int r2 = r0.zzj(r5)
            if (r2 == 0) goto L4c
            int r4 = r4 + 2
        L4c:
            r0.zzh(r5)
        L4f:
            int r2 = r0.zzc()
            r6 = 7
            if (r2 <= r6) goto L62
            r0.zzh(r6)
            int r2 = r0.zzj(r5)
            if (r2 == 0) goto L62
            java.lang.String r2 = "audio/eac3-joc"
            goto L64
        L62:
            java.lang.String r2 = "audio/eac3"
        L64:
            r0.zzm()
            int r0 = r0.zze()
            r7.zzh(r0)
            com.google.android.gms.internal.ads.zzs r7 = new com.google.android.gms.internal.ads.zzs
            r7.<init>()
            r7.zza(r8)
            r7.zzm(r2)
            r7.zzE(r4)
            r7.zzF(r3)
            r7.zzq(r10)
            r7.zze(r9)
            r7.zzi(r1)
            com.google.android.gms.internal.ads.zzu r7 = r7.zzM()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzabv.zzb(com.google.android.gms.internal.ads.zzef, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.zzp):com.google.android.gms.internal.ads.zzu");
    }

    public static zzabu zzc(zzee zzeeVar) {
        int iZzf;
        int i;
        int i4;
        int i6;
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iZzd = zzeeVar.zzd();
        zzeeVar.zzh(40);
        int iZzj = zzeeVar.zzj(5);
        zzeeVar.zzf(iZzd);
        int i15 = -1;
        if (iZzj > 10) {
            zzeeVar.zzh(16);
            int iZzj2 = zzeeVar.zzj(2);
            if (iZzj2 == 0) {
                i15 = 0;
            } else if (iZzj2 == 1) {
                i15 = 1;
            } else if (iZzj2 == 2) {
                i15 = 2;
            }
            zzeeVar.zzh(3);
            int iZzj3 = zzeeVar.zzj(11) + 1;
            int iZzj4 = zzeeVar.zzj(2);
            if (iZzj4 == 3) {
                i = zzd[zzeeVar.zzj(2)];
                i12 = 6;
                i11 = 3;
            } else {
                int iZzj5 = zzeeVar.zzj(2);
                int i16 = zzb[iZzj5];
                i11 = iZzj5;
                i = zzc[iZzj4];
                i12 = i16;
            }
            iZzf = iZzj3 + iZzj3;
            int i17 = (iZzf * i) / (i12 * 32);
            int iZzj6 = zzeeVar.zzj(3);
            boolean zZzi = zzeeVar.zzi();
            i4 = zze[iZzj6] + (zZzi ? 1 : 0);
            zzeeVar.zzh(10);
            if (zzeeVar.zzi()) {
                zzeeVar.zzh(8);
            }
            if (iZzj6 == 0) {
                zzeeVar.zzh(5);
                if (zzeeVar.zzi()) {
                    zzeeVar.zzh(8);
                }
                i13 = 0;
                iZzj6 = 0;
            } else {
                i13 = iZzj6;
            }
            if (i15 == 1) {
                if (zzeeVar.zzi()) {
                    zzeeVar.zzh(16);
                }
                i14 = 1;
            } else {
                i14 = i15;
            }
            if (zzeeVar.zzi()) {
                if (i13 > 2) {
                    zzeeVar.zzh(2);
                }
                if ((i13 & 1) != 0 && i13 > 2) {
                    zzeeVar.zzh(6);
                }
                if ((i13 & 4) != 0) {
                    zzeeVar.zzh(6);
                }
                if (zZzi && zzeeVar.zzi()) {
                    zzeeVar.zzh(5);
                }
                if (i14 == 0) {
                    if (zzeeVar.zzi()) {
                        zzeeVar.zzh(6);
                    }
                    if (i13 == 0 && zzeeVar.zzi()) {
                        zzeeVar.zzh(6);
                    }
                    if (zzeeVar.zzi()) {
                        zzeeVar.zzh(6);
                    }
                    int iZzj7 = zzeeVar.zzj(2);
                    if (iZzj7 == 1) {
                        zzeeVar.zzh(5);
                    } else if (iZzj7 == 2) {
                        zzeeVar.zzh(12);
                    } else if (iZzj7 == 3) {
                        int iZzj8 = zzeeVar.zzj(5);
                        if (zzeeVar.zzi()) {
                            zzeeVar.zzh(5);
                            if (zzeeVar.zzi()) {
                                zzeeVar.zzh(4);
                            }
                            if (zzeeVar.zzi()) {
                                zzeeVar.zzh(4);
                            }
                            if (zzeeVar.zzi()) {
                                zzeeVar.zzh(4);
                            }
                            if (zzeeVar.zzi()) {
                                zzeeVar.zzh(4);
                            }
                            if (zzeeVar.zzi()) {
                                zzeeVar.zzh(4);
                            }
                            if (zzeeVar.zzi()) {
                                zzeeVar.zzh(4);
                            }
                            if (zzeeVar.zzi()) {
                                zzeeVar.zzh(4);
                            }
                            if (zzeeVar.zzi()) {
                                if (zzeeVar.zzi()) {
                                    zzeeVar.zzh(4);
                                }
                                if (zzeeVar.zzi()) {
                                    zzeeVar.zzh(4);
                                }
                            }
                        }
                        if (zzeeVar.zzi()) {
                            zzeeVar.zzh(5);
                            if (zzeeVar.zzi()) {
                                zzeeVar.zzh(7);
                                if (zzeeVar.zzi()) {
                                    zzeeVar.zzh(8);
                                }
                            }
                        }
                        zzeeVar.zzh((iZzj8 + 2) * 8);
                        zzeeVar.zzm();
                    }
                    if (i13 < 2) {
                        if (zzeeVar.zzi()) {
                            zzeeVar.zzh(14);
                        }
                        if (iZzj6 == 0 && zzeeVar.zzi()) {
                            zzeeVar.zzh(14);
                        }
                    }
                    if (!zzeeVar.zzi()) {
                        i14 = 0;
                    } else if (i11 == 0) {
                        zzeeVar.zzh(5);
                        i14 = 0;
                        i11 = 0;
                    } else {
                        for (int i18 = 0; i18 < i12; i18++) {
                            if (zzeeVar.zzi()) {
                                zzeeVar.zzh(5);
                            }
                        }
                        i14 = 0;
                    }
                }
            }
            if (zzeeVar.zzi()) {
                zzeeVar.zzh(5);
                if (i13 == 2) {
                    zzeeVar.zzh(4);
                    i13 = 2;
                }
                if (i13 >= 6) {
                    zzeeVar.zzh(2);
                }
                if (zzeeVar.zzi()) {
                    zzeeVar.zzh(8);
                }
                if (i13 == 0 && zzeeVar.zzi()) {
                    zzeeVar.zzh(8);
                }
                if (iZzj4 < 3) {
                    zzeeVar.zzg();
                }
            }
            if (i14 == 0 && i11 != 3) {
                zzeeVar.zzg();
            }
            if (i14 == 2 && (i11 == 3 || zzeeVar.zzi())) {
                zzeeVar.zzh(6);
            }
            i6 = i12 * 256;
            str = (zzeeVar.zzi() && zzeeVar.zzj(6) == 1 && zzeeVar.zzj(8) == 1) ? MimeTypes.AUDIO_E_AC3_JOC : MimeTypes.AUDIO_E_AC3;
            i10 = i17;
        } else {
            zzeeVar.zzh(32);
            int iZzj9 = zzeeVar.zzj(2);
            String str2 = iZzj9 == 3 ? null : MimeTypes.AUDIO_AC3;
            int iZzj10 = zzeeVar.zzj(6);
            int i19 = zzf[iZzj10 / 2] * 1000;
            iZzf = zzf(iZzj9, iZzj10);
            zzeeVar.zzh(8);
            int iZzj11 = zzeeVar.zzj(3);
            if ((iZzj11 & 1) != 0 && iZzj11 != 1) {
                zzeeVar.zzh(2);
            }
            if ((iZzj11 & 4) != 0) {
                zzeeVar.zzh(2);
            }
            if (iZzj11 == 2) {
                zzeeVar.zzh(2);
            }
            i = iZzj9 < 3 ? zzc[iZzj9] : -1;
            i4 = zze[iZzj11] + (zzeeVar.zzi() ? 1 : 0);
            i6 = 1536;
            str = str2;
            i10 = i19;
        }
        return new zzabu(str, i15, i4, i, iZzf, i6, i10, null);
    }

    public static int zzd(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b8 = bArr[4];
            return zzf((b8 & 192) >> 6, b8 & Utf8.REPLACEMENT_BYTE);
        }
        int i = bArr[2] & 7;
        int i4 = ((bArr[3] & 255) | (i << 8)) + 1;
        return i4 + i4;
    }

    public static int zze(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return zzb[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    private static int zzf(int i, int i4) {
        int i6;
        if (i < 0 || i >= 3 || i4 < 0 || (i6 = i4 >> 1) >= 19) {
            return -1;
        }
        int i10 = zzc[i];
        if (i10 == 44100) {
            int i11 = zzg[i6] + (i4 & 1);
            return i11 + i11;
        }
        int i12 = zzf[i6];
        return i10 == 32000 ? i12 * 6 : i12 * 4;
    }
}
