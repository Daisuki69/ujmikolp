package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.media3.extractor.mp4.Atom;
import androidx.media3.extractor.mp4.Sniffer;
import java.io.IOException;
import mx_android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class zzair {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, Atom.TYPE_avc1, Atom.TYPE_hvc1, Atom.TYPE_hev1, Atom.TYPE_av01, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, Sniffer.BRAND_QUICKTIME, 1297305174, 1684175153, 1769172332, 1885955686};

    @Nullable
    public static zzadz zza(zzacv zzacvVar) throws IOException {
        return zzc(zzacvVar, true, false);
    }

    @Nullable
    public static zzadz zzb(zzacv zzacvVar, boolean z4) throws IOException {
        return zzc(zzacvVar, false, z4);
    }

    @Nullable
    private static zzadz zzc(zzacv zzacvVar, boolean z4, boolean z5) throws IOException {
        zzadz zzadzVar;
        long j;
        zzef zzefVar;
        int i;
        long j6;
        int i4;
        int[] iArr;
        long jZzo = zzacvVar.zzo();
        long j7 = -1;
        long j9 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (jZzo != -1 && jZzo <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j9 = jZzo;
        }
        zzef zzefVar2 = new zzef(64);
        int i6 = (int) j9;
        int i10 = 0;
        int i11 = 0;
        boolean z8 = false;
        while (i11 < i6) {
            zzefVar2.zza(8);
            boolean z9 = true;
            if (!zzacvVar.zzh(zzefVar2.zzi(), i10, 8, true)) {
                break;
            }
            long jZzz = zzefVar2.zzz();
            int iZzB = zzefVar2.zzB();
            if (jZzz == 1) {
                j = j7;
                zzacvVar.zzi(zzefVar2.zzi(), 8, 8);
                i = 16;
                zzefVar2.zzf(16);
                jZzz = zzefVar2.zzD();
                zzefVar = zzefVar2;
            } else {
                j = j7;
                if (jZzz == 0) {
                    long jZzo2 = zzacvVar.zzo();
                    if (jZzo2 != j) {
                        jZzz = (jZzo2 - zzacvVar.zzm()) + 8;
                    }
                }
                zzefVar = zzefVar2;
                i = 8;
            }
            long j10 = jZzz;
            zzadzVar = null;
            long j11 = i;
            if (j10 < j11) {
                return new zzahm(iZzB, j10, i);
            }
            i11 += i;
            if (iZzB == 1836019574) {
                i6 += (int) j10;
                if (jZzo != -1 && i6 > jZzo) {
                    i6 = (int) jZzo;
                }
                zzefVar2 = zzefVar;
                j7 = j;
                i10 = 0;
            } else {
                if (iZzB == 1953653099 || iZzB == 1835297121 || iZzB == 1835626086) {
                    j6 = jZzo;
                    i4 = 0;
                } else {
                    if (iZzB == 1836019558 || iZzB == 1836475768) {
                        i10 = 1;
                        break;
                    }
                    z8 |= !(iZzB != 1835295092);
                    if (iZzB == 1937007212) {
                        if (j10 > 1000000) {
                            i10 = 0;
                            break;
                        }
                        iZzB = 1937007212;
                    }
                    j6 = jZzo;
                    if ((((long) i11) + j10) - j11 >= i6) {
                        i10 = 0;
                        break;
                    }
                    int i12 = (int) (j10 - j11);
                    i11 += i12;
                    if (iZzB != 1718909296) {
                        i4 = 0;
                        if (i12 != 0) {
                            zzacvVar.zzk(i12);
                        }
                    } else {
                        if (i12 < 8) {
                            return new zzahm(Atom.TYPE_ftyp, i12, 8);
                        }
                        zzefVar.zza(i12);
                        i4 = 0;
                        zzacvVar.zzi(zzefVar.zzi(), 0, i12);
                        int iZzB2 = zzefVar.zzB();
                        boolean zZzd = zzd(iZzB2, z5) | z8;
                        zzefVar.zzk(4);
                        int iZzd = zzefVar.zzd() / 4;
                        if (!zZzd && iZzd > 0) {
                            iArr = new int[iZzd];
                            int i13 = 0;
                            while (true) {
                                if (i13 >= iZzd) {
                                    z9 = zZzd;
                                    break;
                                }
                                int iZzB3 = zzefVar.zzB();
                                iArr[i13] = iZzB3;
                                if (zzd(iZzB3, z5)) {
                                    break;
                                }
                                i13++;
                            }
                        } else {
                            z9 = zZzd;
                            iArr = null;
                        }
                        if (!z9) {
                            return new zzaiw(iZzB2, iArr);
                        }
                        z8 = z9;
                    }
                }
                i10 = i4;
                zzefVar2 = zzefVar;
                j7 = j;
                jZzo = j6;
            }
        }
        zzadzVar = null;
        return !z8 ? zzain.zza : z4 != i10 ? i10 != 0 ? zzaig.zza : zzaig.zzb : zzadzVar;
    }

    private static boolean zzd(int i, boolean z4) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579) {
            if (z4) {
                return true;
            }
            i = 1751476579;
        }
        int[] iArr = zza;
        for (int i4 = 0; i4 < 29; i4++) {
            if (iArr[i4] == i) {
                return true;
            }
        }
        return false;
    }
}
