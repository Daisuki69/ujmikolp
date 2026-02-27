package com.google.android.gms.internal.ads;

import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.MpegAudioUtil;
import androidx.media3.extractor.OpusUtil;

/* JADX INFO: loaded from: classes3.dex */
final class zzamt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean zza(com.google.android.gms.internal.ads.zzee r18, com.google.android.gms.internal.ads.zzamr r19) throws com.google.android.gms.internal.ads.zzas {
        /*
            r0 = r18
            r1 = r19
            r0.zze()
            r2 = 3
            r3 = 8
            int r2 = zzf(r0, r2, r3, r3)
            r1.zza = r2
            r4 = 0
            r5 = -1
            if (r2 == r5) goto Lc1
            r2 = 2
            int r6 = java.lang.Math.max(r2, r3)
            r7 = 32
            int r6 = java.lang.Math.max(r6, r7)
            r8 = 63
            r9 = 1
            if (r6 > r8) goto L26
            r6 = r9
            goto L27
        L26:
            r6 = r4
        L27:
            com.google.android.gms.internal.ads.zzghc.zza(r6)
            int r6 = r0.zzc()
            r10 = -1
            if (r6 >= r2) goto L34
        L32:
            r12 = r10
            goto L5f
        L34:
            long r12 = r0.zzk(r2)
            r14 = 3
            int r6 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r6 != 0) goto L5f
            int r6 = r0.zzc()
            if (r6 >= r3) goto L45
            goto L32
        L45:
            long r12 = r0.zzk(r3)
            long r14 = r14 + r12
            r16 = 255(0xff, double:1.26E-321)
            int r3 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r3 != 0) goto L5e
            int r3 = r0.zzc()
            if (r3 >= r7) goto L57
            goto L32
        L57:
            long r6 = r0.zzk(r7)
            long r12 = r6 + r14
            goto L5f
        L5e:
            r12 = r14
        L5f:
            r1.zzb = r12
            int r3 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r3 != 0) goto L66
            return r4
        L66:
            r6 = 16
            int r3 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r3 > 0) goto La1
            r6 = 0
            int r3 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r3 != 0) goto L93
            int r3 = r1.zza
            r6 = 0
            if (r3 == r9) goto L8c
            if (r3 == r2) goto L85
            r2 = 17
            if (r3 == r2) goto L7e
            goto L93
        L7e:
            java.lang.String r0 = "AudioTruncation packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzas r0 = com.google.android.gms.internal.ads.zzas.zzb(r0, r6)
            throw r0
        L85:
            java.lang.String r0 = "Mpegh3daFrame packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzas r0 = com.google.android.gms.internal.ads.zzas.zzb(r0, r6)
            throw r0
        L8c:
            java.lang.String r0 = "Mpegh3daConfig packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzas r0 = com.google.android.gms.internal.ads.zzas.zzb(r0, r6)
            throw r0
        L93:
            r2 = 11
            r3 = 24
            int r0 = zzf(r0, r2, r3, r3)
            r1.zzc = r0
            if (r0 == r5) goto La0
            return r9
        La0:
            return r4
        La1:
            java.lang.String r0 = java.lang.String.valueOf(r12)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 49
            r1.<init>(r0)
            java.lang.String r0 = "Contains sub-stream with an invalid packet label "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.internal.ads.zzas r0 = com.google.android.gms.internal.ads.zzas.zzc(r0)
            throw r0
        Lc1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamt.zza(com.google.android.gms.internal.ads.zzee, com.google.android.gms.internal.ads.zzamr):boolean");
    }

    public static zzams zzb(zzee zzeeVar) throws zzas {
        int iZzj;
        int i;
        char c;
        int i4;
        int i6;
        int iZzj2;
        char c10;
        int iZzj3 = zzeeVar.zzj(8);
        int i10 = 5;
        int iZzj4 = zzeeVar.zzj(5);
        if (iZzj4 != 31) {
            switch (iZzj4) {
                case 0:
                    iZzj = 96000;
                    break;
                case 1:
                    iZzj = 88200;
                    break;
                case 2:
                    iZzj = 64000;
                    break;
                case 3:
                    iZzj = OpusUtil.SAMPLE_RATE;
                    break;
                case 4:
                    iZzj = 44100;
                    break;
                case 5:
                    iZzj = 32000;
                    break;
                case 6:
                    iZzj = 24000;
                    break;
                case 7:
                    iZzj = 22050;
                    break;
                case 8:
                    iZzj = AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND;
                    break;
                case 9:
                    iZzj = 12000;
                    break;
                case 10:
                    iZzj = 11025;
                    break;
                case 11:
                    iZzj = 8000;
                    break;
                case 12:
                    iZzj = 7350;
                    break;
                case 13:
                case 14:
                default:
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj4).length() + 32);
                    sb2.append("Unsupported sampling rate index ");
                    sb2.append(iZzj4);
                    throw zzas.zzc(sb2.toString());
                case 15:
                    iZzj = 57600;
                    break;
                case 16:
                    iZzj = 51200;
                    break;
                case 17:
                    iZzj = MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND;
                    break;
                case 18:
                    iZzj = 38400;
                    break;
                case 19:
                    iZzj = 34150;
                    break;
                case 20:
                    iZzj = 28800;
                    break;
                case 21:
                    iZzj = 25600;
                    break;
                case 22:
                    iZzj = AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;
                    break;
                case 23:
                    iZzj = 19200;
                    break;
                case 24:
                    iZzj = 17075;
                    break;
                case 25:
                    iZzj = 14400;
                    break;
                case 26:
                    iZzj = 12800;
                    break;
                case 27:
                    iZzj = 9600;
                    break;
            }
        } else {
            iZzj = zzeeVar.zzj(24);
        }
        int iZzj5 = zzeeVar.zzj(3);
        int i11 = 1;
        if (iZzj5 == 0) {
            i = 768;
        } else if (iZzj5 == 1) {
            i = 1024;
        } else if (iZzj5 == 2 || iZzj5 == 3) {
            i = 2048;
        } else {
            if (iZzj5 != 4) {
                StringBuilder sb3 = new StringBuilder(androidx.media3.datasource.cache.c.a(iZzj5, 36));
                sb3.append("Unsupported coreSbrFrameLengthIndex ");
                sb3.append(iZzj5);
                throw zzas.zzc(sb3.toString());
            }
            i = 4096;
        }
        if (iZzj5 == 0 || iZzj5 == 1) {
            c = 0;
        } else if (iZzj5 == 2) {
            c = 2;
        } else if (iZzj5 == 3) {
            c = 3;
        } else {
            if (iZzj5 != 4) {
                StringBuilder sb4 = new StringBuilder(androidx.media3.datasource.cache.c.a(iZzj5, 36));
                sb4.append("Unsupported coreSbrFrameLengthIndex ");
                sb4.append(iZzj5);
                throw zzas.zzc(sb4.toString());
            }
            c = 1;
        }
        zzeeVar.zzh(2);
        zzc(zzeeVar);
        int iZzj6 = zzeeVar.zzj(5);
        int i12 = 0;
        int iZzf = 0;
        while (true) {
            int i13 = 16;
            if (i12 < iZzj6 + 1) {
                int iZzj7 = zzeeVar.zzj(3);
                iZzf += zzf(zzeeVar, 5, 8, 16) + 1;
                if ((iZzj7 == 0 || iZzj7 == 2) && zzeeVar.zzi()) {
                    zzc(zzeeVar);
                }
                i12++;
            } else {
                int iZzf2 = zzf(zzeeVar, 4, 8, 16) + 1;
                zzeeVar.zzg();
                int i14 = 0;
                while (true) {
                    double d10 = 2.0d;
                    if (i14 >= iZzf2) {
                        int i15 = iZzj3;
                        byte[] bArr = null;
                        if (zzeeVar.zzi()) {
                            int iZzf3 = zzf(zzeeVar, 2, 4, 8) + 1;
                            for (int i16 = 0; i16 < iZzf3; i16++) {
                                int iZzf4 = zzf(zzeeVar, 4, 8, 16);
                                int iZzf5 = zzf(zzeeVar, 4, 8, 16);
                                if (iZzf4 == 7) {
                                    int iZzj8 = zzeeVar.zzj(4) + 1;
                                    zzeeVar.zzh(4);
                                    byte[] bArr2 = new byte[iZzj8];
                                    for (int i17 = 0; i17 < iZzj8; i17++) {
                                        bArr2[i17] = (byte) zzeeVar.zzj(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    zzeeVar.zzh(iZzf5 * 8);
                                }
                            }
                        }
                        byte[] bArr3 = bArr;
                        switch (iZzj) {
                            case 14700:
                            case AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND /* 16000 */:
                                d10 = 3.0d;
                                break;
                            case 22050:
                            case 24000:
                                break;
                            case 29400:
                            case 32000:
                            case 58800:
                            case 64000:
                                d10 = 1.5d;
                                break;
                            case 44100:
                            case OpusUtil.SAMPLE_RATE /* 48000 */:
                            case 88200:
                            case 96000:
                                d10 = 1.0d;
                                break;
                            default:
                                StringBuilder sb5 = new StringBuilder(String.valueOf(iZzj).length() + 26);
                                sb5.append("Unsupported sampling rate ");
                                sb5.append(iZzj);
                                throw zzas.zzc(sb5.toString());
                        }
                        return new zzams(i15, (int) (((double) iZzj) * d10), (int) (((double) i) * d10), bArr3, null);
                    }
                    int iZzj9 = zzeeVar.zzj(2);
                    if (iZzj9 == 0) {
                        i4 = iZzj3;
                        i6 = i11;
                        zzd(zzeeVar);
                        if (c > 0) {
                            zze(zzeeVar);
                        }
                    } else if (iZzj9 == i11) {
                        i6 = i11;
                        if (zzd(zzeeVar)) {
                            zzeeVar.zzg();
                        }
                        if (c > 0) {
                            zze(zzeeVar);
                            iZzj2 = zzeeVar.zzj(2);
                            c10 = c;
                        } else {
                            iZzj2 = 0;
                            c10 = 0;
                        }
                        if (iZzj2 > 0) {
                            zzeeVar.zzh(6);
                            int iZzj10 = zzeeVar.zzj(2);
                            zzeeVar.zzh(4);
                            if (zzeeVar.zzi()) {
                                zzeeVar.zzh(i10);
                            }
                            if (iZzj2 == 2 || iZzj2 == 3) {
                                zzeeVar.zzh(6);
                            }
                            if (iZzj10 == 2) {
                                zzeeVar.zzg();
                            }
                        }
                        i4 = iZzj3;
                        int iFloor = ((int) Math.floor(Math.log(iZzf - 1) / Math.log(2.0d))) + 1;
                        int iZzj11 = zzeeVar.zzj(2);
                        if (iZzj11 > 0 && zzeeVar.zzi()) {
                            zzeeVar.zzh(iFloor);
                        }
                        if (zzeeVar.zzi()) {
                            zzeeVar.zzh(iFloor);
                        }
                        if (c10 == 0 && iZzj11 == 0) {
                            zzeeVar.zzg();
                        }
                    } else if (iZzj9 != 3) {
                        i4 = iZzj3;
                        i6 = i11;
                    } else {
                        zzf(zzeeVar, 4, 8, i13);
                        int iZzf6 = zzf(zzeeVar, 4, 8, i13);
                        i6 = i11;
                        if (zzeeVar.zzi()) {
                            zzf(zzeeVar, 8, i13, 0);
                        }
                        zzeeVar.zzg();
                        if (iZzf6 > 0) {
                            zzeeVar.zzh(iZzf6 * 8);
                        }
                        i4 = iZzj3;
                    }
                    i14++;
                    iZzj3 = i4;
                    i11 = i6;
                    i10 = 5;
                    i13 = 16;
                }
            }
        }
    }

    private static void zzc(zzee zzeeVar) {
        int iZzj;
        int iZzj2 = zzeeVar.zzj(2);
        if (iZzj2 == 0) {
            zzeeVar.zzh(6);
            return;
        }
        int iZzf = zzf(zzeeVar, 5, 8, 16) + 1;
        if (iZzj2 == 1) {
            zzeeVar.zzh(iZzf * 7);
            return;
        }
        if (iZzj2 == 2) {
            boolean zZzi = zzeeVar.zzi();
            int i = true != zZzi ? 5 : 1;
            int i4 = true == zZzi ? 7 : 5;
            int i6 = true == zZzi ? 8 : 6;
            int i10 = 0;
            while (i10 < iZzf) {
                if (zzeeVar.zzi()) {
                    zzeeVar.zzh(7);
                    iZzj = 0;
                } else {
                    if (zzeeVar.zzj(2) == 3 && zzeeVar.zzj(i4) * i != 0) {
                        zzeeVar.zzg();
                    }
                    iZzj = zzeeVar.zzj(i6) * i;
                    if (iZzj != 0 && iZzj != 180) {
                        zzeeVar.zzg();
                    }
                    zzeeVar.zzg();
                }
                if (iZzj != 0 && iZzj != 180 && zzeeVar.zzi()) {
                    i10++;
                }
                i10++;
            }
        }
    }

    private static boolean zzd(zzee zzeeVar) {
        zzeeVar.zzh(3);
        boolean zZzi = zzeeVar.zzi();
        if (zZzi) {
            zzeeVar.zzh(13);
        }
        return zZzi;
    }

    private static void zze(zzee zzeeVar) {
        zzeeVar.zzh(3);
        zzeeVar.zzh(8);
        boolean zZzi = zzeeVar.zzi();
        boolean zZzi2 = zzeeVar.zzi();
        if (zZzi) {
            zzeeVar.zzh(5);
        }
        if (zZzi2) {
            zzeeVar.zzh(6);
        }
    }

    private static int zzf(zzee zzeeVar, int i, int i4, int i6) {
        zzghc.zza(Math.max(Math.max(i, i4), i6) <= 31);
        int i10 = (1 << i) - 1;
        int i11 = (1 << i4) - 1;
        long j = ((long) i10) + ((long) i11);
        long j6 = (int) j;
        if (j != j6) {
            throw new ArithmeticException();
        }
        if (j6 + ((long) (1 << i6)) != ((int) r6)) {
            throw new ArithmeticException();
        }
        if (zzeeVar.zzc() < i) {
            return -1;
        }
        int iZzj = zzeeVar.zzj(i);
        if (iZzj == i10) {
            if (zzeeVar.zzc() < i4) {
                return -1;
            }
            int iZzj2 = zzeeVar.zzj(i4);
            iZzj += iZzj2;
            if (iZzj2 == i11) {
                if (zzeeVar.zzc() < i6) {
                    return -1;
                }
                return zzeeVar.zzj(i6) + iZzj;
            }
        }
        return iZzj;
    }
}
