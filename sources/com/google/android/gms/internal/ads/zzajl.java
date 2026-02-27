package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.ts.PsExtractor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class zzajl extends zzajj {

    @Nullable
    private zzajk zza;
    private int zzb;
    private boolean zzc;

    @Nullable
    private zzaeg zzd;

    @Nullable
    private zzaee zze;

    @Override // com.google.android.gms.internal.ads.zzajj
    public final void zza(boolean z4) {
        super.zza(z4);
        if (z4) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final long zzb(zzef zzefVar) {
        if ((zzefVar.zzi()[0] & 1) == 1) {
            return -1L;
        }
        byte b8 = zzefVar.zzi()[0];
        zzajk zzajkVar = this.zza;
        zzajkVar.getClass();
        int i = !zzajkVar.zzd[(b8 >> 1) & (255 >>> (8 - zzajkVar.zze))].zza ? zzajkVar.zza.zze : zzajkVar.zza.zzf;
        int i4 = this.zzc ? (this.zzb + i) / 4 : 0;
        if (zzefVar.zzj() < zzefVar.zze() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(zzefVar.zzi(), zzefVar.zze() + 4);
            zzefVar.zzb(bArrCopyOf, bArrCopyOf.length);
        } else {
            zzefVar.zzf(zzefVar.zze() + 4);
        }
        long j = i4;
        byte[] bArrZzi = zzefVar.zzi();
        bArrZzi[zzefVar.zze() - 4] = (byte) (j & 255);
        bArrZzi[zzefVar.zze() - 3] = (byte) ((j >>> 8) & 255);
        bArrZzi[zzefVar.zze() - 2] = (byte) ((j >>> 16) & 255);
        bArrZzi[zzefVar.zze() - 1] = (byte) ((j >>> 24) & 255);
        this.zzc = true;
        this.zzb = i;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final boolean zzc(zzef zzefVar, long j, zzajh zzajhVar) throws IOException {
        zzajk zzajkVar;
        int i;
        int iZzb;
        int i4;
        int i6;
        long jFloor;
        if (this.zza != null) {
            zzajhVar.zza.getClass();
            return false;
        }
        zzaeg zzaegVar = this.zzd;
        int i10 = 1;
        if (zzaegVar == null) {
            zzaeh.zzd(1, zzefVar, false);
            int iZzI = zzefVar.zzI();
            int iZzs = zzefVar.zzs();
            int iZzI2 = zzefVar.zzI();
            int iZzC = zzefVar.zzC();
            int i11 = iZzC <= 0 ? -1 : iZzC;
            int iZzC2 = zzefVar.zzC();
            int i12 = iZzC2 <= 0 ? -1 : iZzC2;
            int iZzC3 = zzefVar.zzC();
            int i13 = iZzC3 <= 0 ? -1 : iZzC3;
            int iZzs2 = zzefVar.zzs();
            this.zzd = new zzaeg(iZzI, iZzs, iZzI2, i11, i12, i13, (int) Math.pow(2.0d, iZzs2 & 15), (int) Math.pow(2.0d, (iZzs2 & PsExtractor.VIDEO_STREAM_MASK) >> 4), 1 == (zzefVar.zzs() & 1), Arrays.copyOf(zzefVar.zzi(), zzefVar.zze()));
        } else {
            int i14 = 4;
            zzaee zzaeeVar = this.zze;
            if (zzaeeVar == null) {
                this.zze = zzaeh.zzb(zzefVar, true, true);
            } else {
                byte[] bArr = new byte[zzefVar.zze()];
                System.arraycopy(zzefVar.zzi(), 0, bArr, 0, zzefVar.zze());
                int i15 = zzaegVar.zza;
                int i16 = 5;
                zzaeh.zzd(5, zzefVar, false);
                int iZzs3 = zzefVar.zzs() + 1;
                zzaed zzaedVar = new zzaed(zzefVar.zzi());
                zzaedVar.zzc(zzefVar.zzg() * 8);
                int i17 = 0;
                while (true) {
                    int i18 = 2;
                    int i19 = 16;
                    if (i17 >= iZzs3) {
                        int i20 = i10;
                        int i21 = 6;
                        int iZzb2 = zzaedVar.zzb(6) + i20;
                        for (int i22 = 0; i22 < iZzb2; i22++) {
                            if (zzaedVar.zzb(16) != 0) {
                                throw zzas.zzb("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int iZzb3 = zzaedVar.zzb(6) + i20;
                        int i23 = 0;
                        while (true) {
                            int i24 = 3;
                            if (i23 < iZzb3) {
                                int iZzb4 = zzaedVar.zzb(i19);
                                if (iZzb4 == 0) {
                                    int i25 = 8;
                                    zzaedVar.zzc(8);
                                    zzaedVar.zzc(16);
                                    zzaedVar.zzc(16);
                                    zzaedVar.zzc(6);
                                    zzaedVar.zzc(8);
                                    int iZzb5 = zzaedVar.zzb(4) + 1;
                                    int i26 = 0;
                                    while (i26 < iZzb5) {
                                        zzaedVar.zzc(i25);
                                        i26++;
                                        i25 = 8;
                                    }
                                } else {
                                    if (iZzb4 != 1) {
                                        StringBuilder sb2 = new StringBuilder(androidx.media3.datasource.cache.c.a(iZzb4, 41));
                                        sb2.append("floor type greater than 1 not decodable: ");
                                        sb2.append(iZzb4);
                                        throw zzas.zzb(sb2.toString(), null);
                                    }
                                    int iZzb6 = zzaedVar.zzb(5);
                                    int[] iArr = new int[iZzb6];
                                    int i27 = -1;
                                    for (int i28 = 0; i28 < iZzb6; i28++) {
                                        int iZzb7 = zzaedVar.zzb(4);
                                        iArr[i28] = iZzb7;
                                        if (iZzb7 > i27) {
                                            i27 = iZzb7;
                                        }
                                    }
                                    int i29 = i27 + 1;
                                    int[] iArr2 = new int[i29];
                                    int i30 = 0;
                                    while (i30 < i29) {
                                        iArr2[i30] = zzaedVar.zzb(i24) + 1;
                                        int iZzb8 = zzaedVar.zzb(2);
                                        if (iZzb8 > 0) {
                                            i4 = 8;
                                            zzaedVar.zzc(8);
                                        } else {
                                            i4 = 8;
                                        }
                                        int i31 = i29;
                                        int i32 = 0;
                                        for (int i33 = 1; i32 < (i33 << iZzb8); i33 = 1) {
                                            zzaedVar.zzc(i4);
                                            i32++;
                                            i4 = 8;
                                        }
                                        i30++;
                                        i29 = i31;
                                        i24 = 3;
                                    }
                                    zzaedVar.zzc(2);
                                    int iZzb9 = zzaedVar.zzb(4);
                                    int i34 = 0;
                                    int i35 = 0;
                                    for (int i36 = 0; i36 < iZzb6; i36++) {
                                        i34 += iArr2[iArr[i36]];
                                        while (i35 < i34) {
                                            zzaedVar.zzc(iZzb9);
                                            i35++;
                                        }
                                    }
                                }
                                i23++;
                                i21 = 6;
                                i19 = 16;
                            } else {
                                int i37 = 1;
                                int iZzb10 = zzaedVar.zzb(i21) + 1;
                                int i38 = 0;
                                while (i38 < iZzb10) {
                                    if (zzaedVar.zzb(16) > 2) {
                                        throw zzas.zzb("residueType greater than 2 is not decodable", null);
                                    }
                                    zzaedVar.zzc(24);
                                    zzaedVar.zzc(24);
                                    zzaedVar.zzc(24);
                                    int iZzb11 = zzaedVar.zzb(i21) + i37;
                                    int i39 = 8;
                                    zzaedVar.zzc(8);
                                    int[] iArr3 = new int[iZzb11];
                                    for (int i40 = 0; i40 < iZzb11; i40++) {
                                        iArr3[i40] = ((zzaedVar.zza() ? zzaedVar.zzb(5) : 0) * 8) + zzaedVar.zzb(3);
                                    }
                                    int i41 = 0;
                                    while (i41 < iZzb11) {
                                        int i42 = 0;
                                        while (i42 < i39) {
                                            if ((iArr3[i41] & (1 << i42)) != 0) {
                                                zzaedVar.zzc(i39);
                                            }
                                            i42++;
                                            i39 = 8;
                                        }
                                        i41++;
                                        i39 = 8;
                                    }
                                    i38++;
                                    i21 = 6;
                                    i37 = 1;
                                }
                                int iZzb12 = zzaedVar.zzb(i21) + 1;
                                for (int i43 = 0; i43 < iZzb12; i43++) {
                                    int iZzb13 = zzaedVar.zzb(16);
                                    if (iZzb13 != 0) {
                                        StringBuilder sb3 = new StringBuilder(androidx.media3.datasource.cache.c.a(iZzb13, 41));
                                        sb3.append("mapping type other than 0 not supported: ");
                                        sb3.append(iZzb13);
                                        zzds.zze("VorbisUtil", sb3.toString());
                                    } else {
                                        if (zzaedVar.zza()) {
                                            i = 1;
                                            iZzb = zzaedVar.zzb(4) + 1;
                                        } else {
                                            i = 1;
                                            iZzb = 1;
                                        }
                                        if (zzaedVar.zza()) {
                                            int iZzb14 = zzaedVar.zzb(8) + i;
                                            for (int i44 = 0; i44 < iZzb14; i44++) {
                                                int i45 = i15 - 1;
                                                zzaedVar.zzc(zzaeh.zza(i45));
                                                zzaedVar.zzc(zzaeh.zza(i45));
                                            }
                                        }
                                        if (zzaedVar.zzb(2) != 0) {
                                            throw zzas.zzb("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iZzb > 1) {
                                            for (int i46 = 0; i46 < i15; i46++) {
                                                zzaedVar.zzc(4);
                                            }
                                        }
                                        for (int i47 = 0; i47 < iZzb; i47++) {
                                            zzaedVar.zzc(8);
                                            zzaedVar.zzc(8);
                                            zzaedVar.zzc(8);
                                        }
                                    }
                                }
                                int iZzb15 = zzaedVar.zzb(6);
                                int i48 = iZzb15 + 1;
                                zzaef[] zzaefVarArr = new zzaef[i48];
                                for (int i49 = 0; i49 < i48; i49++) {
                                    zzaefVarArr[i49] = new zzaef(zzaedVar.zza(), zzaedVar.zzb(16), zzaedVar.zzb(16), zzaedVar.zzb(8));
                                }
                                if (!zzaedVar.zza()) {
                                    throw zzas.zzb("framing bit after modes not set as expected", null);
                                }
                                zzajkVar = new zzajk(zzaegVar, zzaeeVar, bArr, zzaefVarArr, zzaeh.zza(iZzb15));
                            }
                        }
                    } else {
                        if (zzaedVar.zzb(24) != 5653314) {
                            int iZzd = zzaedVar.zzd();
                            StringBuilder sb4 = new StringBuilder(String.valueOf(iZzd).length() + 55);
                            sb4.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb4.append(iZzd);
                            throw zzas.zzb(sb4.toString(), null);
                        }
                        int iZzb16 = zzaedVar.zzb(16);
                        int iZzb17 = zzaedVar.zzb(24);
                        if (zzaedVar.zza()) {
                            zzaedVar.zzc(i16);
                            for (int iZzb18 = 0; iZzb18 < iZzb17; iZzb18 += zzaedVar.zzb(zzaeh.zza(iZzb17 - iZzb18))) {
                            }
                        } else {
                            boolean zZza = zzaedVar.zza();
                            for (int i50 = 0; i50 < iZzb17; i50++) {
                                if (!zZza) {
                                    zzaedVar.zzc(i16);
                                } else if (zzaedVar.zza()) {
                                    zzaedVar.zzc(i16);
                                }
                            }
                        }
                        int i51 = i14;
                        int iZzb19 = zzaedVar.zzb(i51);
                        if (iZzb19 > 2) {
                            StringBuilder sb5 = new StringBuilder(String.valueOf(iZzb19).length() + 42);
                            sb5.append("lookup type greater than 2 not decodable: ");
                            sb5.append(iZzb19);
                            throw zzas.zzb(sb5.toString(), null);
                        }
                        if (iZzb19 != i10) {
                            if (iZzb19 != 2) {
                                i6 = i10;
                            }
                            i17++;
                            i10 = i6;
                            i14 = 4;
                            i16 = 5;
                        } else {
                            i18 = iZzb19;
                        }
                        zzaedVar.zzc(32);
                        zzaedVar.zzc(32);
                        int iZzb20 = zzaedVar.zzb(i51) + i10;
                        zzaedVar.zzc(i10);
                        if (i18 != i10) {
                            i6 = i10;
                            jFloor = ((long) iZzb16) * ((long) iZzb17);
                        } else if (iZzb16 != 0) {
                            i6 = i10;
                            jFloor = (long) Math.floor(Math.pow(iZzb17, 1.0d / ((double) iZzb16)));
                        } else {
                            i6 = i10;
                            jFloor = 0;
                        }
                        zzaedVar.zzc((int) (jFloor * ((long) iZzb20)));
                        i17++;
                        i10 = i6;
                        i14 = 4;
                        i16 = 5;
                    }
                }
            }
        }
        zzajkVar = null;
        this.zza = zzajkVar;
        if (zzajkVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        zzaeg zzaegVar2 = zzajkVar.zza;
        arrayList.add(zzaegVar2.zzg);
        arrayList.add(zzajkVar.zzc);
        zzao zzaoVarZzc = zzaeh.zzc(zzgjz.zzr(zzajkVar.zzb.zza));
        zzs zzsVar = new zzs();
        zzsVar.zzl(MimeTypes.AUDIO_OGG);
        zzsVar.zzm(MimeTypes.AUDIO_VORBIS);
        zzsVar.zzh(zzaegVar2.zzd);
        zzsVar.zzi(zzaegVar2.zzc);
        zzsVar.zzE(zzaegVar2.zza);
        zzsVar.zzF(zzaegVar2.zzb);
        zzsVar.zzp(arrayList);
        zzsVar.zzk(zzaoVarZzc);
        zzajhVar.zza = zzsVar.zzM();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final void zzj(long j) {
        super.zzj(j);
        this.zzc = j != 0;
        zzaeg zzaegVar = this.zzd;
        this.zzb = zzaegVar != null ? zzaegVar.zze : 0;
    }
}
