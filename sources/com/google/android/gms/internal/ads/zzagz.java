package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.ts.TsExtractor;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.paymaya.domain.model.MfaTencentErrorResult;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class zzagz implements zzacu {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final UUID zzf;
    private static final Map zzg;
    private long zzA;
    private long zzB;
    private boolean zzC;
    private boolean zzD;

    @Nullable
    private zzagy zzE;
    private boolean zzF;
    private int zzG;
    private long zzH;
    private boolean zzI;
    private long zzJ;
    private long zzK;
    private long zzL;

    @Nullable
    private zzdt zzM;

    @Nullable
    private zzdt zzN;
    private boolean zzO;
    private boolean zzP;
    private int zzQ;
    private long zzR;
    private long zzS;
    private int zzT;
    private int zzU;
    private int[] zzV;
    private int zzW;
    private int zzX;
    private int zzY;
    private int zzZ;
    private boolean zzaa;
    private long zzab;
    private int zzac;
    private int zzad;
    private int zzae;
    private boolean zzaf;
    private boolean zzag;
    private boolean zzah;
    private int zzai;
    private byte zzaj;
    private boolean zzak;
    private zzacx zzal;
    private final zzagu zzam;
    private final zzahb zzh;
    private final SparseArray zzi;
    private final boolean zzj;
    private final boolean zzk;
    private final zzajt zzl;
    private final zzef zzm;
    private final zzef zzn;
    private final zzef zzo;
    private final zzef zzp;
    private final zzef zzq;
    private final zzef zzr;
    private final zzef zzs;
    private final zzef zzt;
    private final zzef zzu;
    private final zzef zzv;
    private ByteBuffer zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        String str = zzeo.zza;
        zzc = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        zzd = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zze = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zzf = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        androidx.media3.datasource.cache.c.t(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        androidx.media3.datasource.cache.c.t(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        zzg = Collections.unmodifiableMap(map);
    }

    @Deprecated
    public zzagz() {
        this(new zzagu(), 2, zzajt.zza);
    }

    private final void zzA() {
        if (!this.zzD) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i >= sparseArray.size()) {
                zzacx zzacxVar = this.zzal;
                zzacxVar.getClass();
                zzacxVar.zzv();
                this.zzD = false;
                return;
            }
            if (((zzagy) sparseArray.valueAt(i)).zzV) {
                return;
            } else {
                i++;
            }
        }
    }

    private final void zzp(int i) throws zzas {
        if (this.zzE != null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 32);
        sb2.append("Element ");
        sb2.append(i);
        sb2.append(" must be in a TrackEntry");
        throw zzas.zzb(sb2.toString(), null);
    }

    private final void zzq(int i) throws zzas {
        if (this.zzM == null || this.zzN == null) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 26);
            sb2.append("Element ");
            sb2.append(i);
            sb2.append(" must be in a Cues");
            throw zzas.zzb(sb2.toString(), null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzr(com.google.android.gms.internal.ads.zzagy r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagz.zzr(com.google.android.gms.internal.ads.zzagy, long, int, int, int):void");
    }

    private final void zzs(zzacv zzacvVar, int i) throws IOException {
        zzef zzefVar = this.zzo;
        if (zzefVar.zze() >= i) {
            return;
        }
        if (zzefVar.zzj() < i) {
            int iZzj = zzefVar.zzj();
            zzefVar.zzc(Math.max(iZzj + iZzj, i));
        }
        zzacvVar.zzc(zzefVar.zzi(), zzefVar.zze(), i - zzefVar.zze());
        zzefVar.zzf(i);
    }

    private final int zzt(zzacv zzacvVar, zzagy zzagyVar, int i, boolean z4) throws IOException {
        int i4;
        if ("S_TEXT/UTF8".equals(zzagyVar.zzc)) {
            zzv(zzacvVar, zzb, i);
            int i6 = this.zzad;
            zzu();
            return i6;
        }
        if ("S_TEXT/ASS".equals(zzagyVar.zzc) || "S_TEXT/SSA".equals(zzagyVar.zzc)) {
            zzv(zzacvVar, zzd, i);
            int i10 = this.zzad;
            zzu();
            return i10;
        }
        if ("S_TEXT/WEBVTT".equals(zzagyVar.zzc)) {
            zzv(zzacvVar, zze, i);
            int i11 = this.zzad;
            zzu();
            return i11;
        }
        if (zzagyVar.zzV) {
            zzagyVar.zzZ.getClass();
            zzef zzefVar = new zzef(i);
            if (zzacvVar.zzh(zzefVar.zzi(), 0, i, true)) {
                zzacvVar.zzl();
                if (zzact.zza(zzefVar.zzr()) == 1 && zzefVar.zzd() >= 10) {
                    byte[] bArr = new byte[10];
                    zzefVar.zzm(bArr, 0, 10);
                    zzefVar.zzh(0);
                    int iZzc = zzact.zzc(bArr);
                    if (zzefVar.zzd() >= iZzc + 4) {
                        zzefVar.zzk(iZzc);
                        if (zzact.zza(zzefVar.zzB()) == 2) {
                            zzs zzsVarZza = zzagyVar.zzZ.zza();
                            zzsVarZza.zzm(MimeTypes.AUDIO_DTS_HD);
                            zzagyVar.zzZ = zzsVarZza.zzM();
                        }
                    }
                }
            }
            zzagyVar.zzY.zzu(zzagyVar.zzZ);
            zzagyVar.zzV = false;
            zzA();
        }
        zzaeb zzaebVar = zzagyVar.zzY;
        if (!this.zzaf) {
            if (zzagyVar.zzh) {
                this.zzY &= -1073741825;
                if (!this.zzag) {
                    zzef zzefVar2 = this.zzo;
                    zzacvVar.zzc(zzefVar2.zzi(), 0, 1);
                    this.zzac++;
                    if ((zzefVar2.zzi()[0] & 128) == 128) {
                        throw zzas.zzb("Extension bit is set in signal byte", null);
                    }
                    this.zzaj = zzefVar2.zzi()[0];
                    this.zzag = true;
                }
                byte b8 = this.zzaj;
                if ((b8 & 1) == 1) {
                    int i12 = b8 & 2;
                    this.zzY |= 1073741824;
                    if (!this.zzak) {
                        zzef zzefVar3 = this.zzt;
                        zzacvVar.zzc(zzefVar3.zzi(), 0, 8);
                        this.zzac += 8;
                        this.zzak = true;
                        zzef zzefVar4 = this.zzo;
                        zzefVar4.zzi()[0] = (byte) ((i12 != 2 ? 0 : 128) | 8);
                        zzefVar4.zzh(0);
                        zzaebVar.zzw(zzefVar4, 1, 1);
                        this.zzad++;
                        zzefVar3.zzh(0);
                        zzaebVar.zzw(zzefVar3, 8, 1);
                        this.zzad += 8;
                    }
                    if (i12 == 2) {
                        if (!this.zzah) {
                            zzef zzefVar5 = this.zzo;
                            zzacvVar.zzc(zzefVar5.zzi(), 0, 1);
                            this.zzac++;
                            zzefVar5.zzh(0);
                            this.zzai = zzefVar5.zzs();
                            this.zzah = true;
                        }
                        int i13 = this.zzai * 4;
                        zzef zzefVar6 = this.zzo;
                        zzefVar6.zza(i13);
                        zzacvVar.zzc(zzefVar6.zzi(), 0, i13);
                        this.zzac += i13;
                        int i14 = (this.zzai >> 1) + 1;
                        int i15 = (i14 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzw;
                        if (byteBuffer == null || byteBuffer.capacity() < i15) {
                            this.zzw = ByteBuffer.allocate(i15);
                        }
                        this.zzw.position(0);
                        this.zzw.putShort((short) i14);
                        int i16 = 0;
                        int i17 = 0;
                        while (true) {
                            i4 = this.zzai;
                            if (i16 >= i4) {
                                break;
                            }
                            int iZzH = zzefVar6.zzH();
                            int i18 = iZzH - i17;
                            if (i16 % 2 == 0) {
                                this.zzw.putShort((short) i18);
                            } else {
                                this.zzw.putInt(i18);
                            }
                            i16++;
                            i17 = iZzH;
                        }
                        int i19 = (i - this.zzac) - i17;
                        if ((i4 & 1) == 1) {
                            this.zzw.putInt(i19);
                        } else {
                            this.zzw.putShort((short) i19);
                            this.zzw.putInt(0);
                        }
                        zzef zzefVar7 = this.zzu;
                        zzefVar7.zzb(this.zzw.array(), i15);
                        zzaebVar.zzw(zzefVar7, i15, 1);
                        this.zzad += i15;
                    }
                }
            } else {
                byte[] bArr2 = zzagyVar.zzi;
                if (bArr2 != null) {
                    this.zzr.zzb(bArr2, bArr2.length);
                }
            }
            if (!"A_OPUS".equals(zzagyVar.zzc) ? zzagyVar.zzg > 0 : z4) {
                this.zzY |= 268435456;
                this.zzv.zza(0);
                int iZze = (this.zzr.zze() + i) - this.zzac;
                zzef zzefVar8 = this.zzo;
                zzefVar8.zza(4);
                zzefVar8.zzi()[0] = (byte) ((iZze >> 24) & 255);
                zzefVar8.zzi()[1] = (byte) ((iZze >> 16) & 255);
                zzefVar8.zzi()[2] = (byte) ((iZze >> 8) & 255);
                zzefVar8.zzi()[3] = (byte) (iZze & 255);
                zzaebVar.zzw(zzefVar8, 4, 2);
                this.zzad += 4;
            }
            this.zzaf = true;
        }
        zzef zzefVar9 = this.zzr;
        int iZze2 = zzefVar9.zze() + i;
        if (!"V_MPEG4/ISO/AVC".equals(zzagyVar.zzc) && !"V_MPEGH/ISO/HEVC".equals(zzagyVar.zzc)) {
            if (zzagyVar.zzU != null) {
                zzghc.zzh(zzefVar9.zze() == 0);
                zzagyVar.zzU.zzb(zzacvVar);
            }
            while (true) {
                int i20 = this.zzac;
                if (i20 >= iZze2) {
                    break;
                }
                int iZzx = zzx(zzacvVar, zzaebVar, iZze2 - i20);
                this.zzac += iZzx;
                this.zzad += iZzx;
            }
        } else {
            zzef zzefVar10 = this.zzn;
            byte[] bArrZzi = zzefVar10.zzi();
            bArrZzi[0] = 0;
            bArrZzi[1] = 0;
            bArrZzi[2] = 0;
            int i21 = zzagyVar.zzaa;
            int i22 = 4 - i21;
            while (this.zzac < iZze2) {
                int i23 = this.zzae;
                if (i23 == 0) {
                    int iMin = Math.min(i21, zzefVar9.zzd());
                    zzacvVar.zzc(bArrZzi, i22 + iMin, i21 - iMin);
                    if (iMin > 0) {
                        zzefVar9.zzm(bArrZzi, i22, iMin);
                    }
                    this.zzac += i21;
                    zzefVar10.zzh(0);
                    this.zzae = zzefVar10.zzH();
                    zzef zzefVar11 = this.zzm;
                    zzefVar11.zzh(0);
                    zzaebVar.zzz(zzefVar11, 4);
                    this.zzad += 4;
                } else {
                    int iZzx2 = zzx(zzacvVar, zzaebVar, i23);
                    this.zzac += iZzx2;
                    this.zzad += iZzx2;
                    this.zzae -= iZzx2;
                }
            }
        }
        if ("A_VORBIS".equals(zzagyVar.zzc)) {
            zzef zzefVar12 = this.zzp;
            zzefVar12.zzh(0);
            zzaebVar.zzz(zzefVar12, 4);
            this.zzad += 4;
        }
        int i24 = this.zzad;
        zzu();
        return i24;
    }

    private final void zzu() {
        this.zzac = 0;
        this.zzad = 0;
        this.zzae = 0;
        this.zzaf = false;
        this.zzag = false;
        this.zzah = false;
        this.zzai = 0;
        this.zzaj = (byte) 0;
        this.zzak = false;
        this.zzr.zza(0);
    }

    private final void zzv(zzacv zzacvVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length;
        int i4 = length + i;
        zzef zzefVar = this.zzs;
        if (zzefVar.zzj() < i4) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i4 + i);
            zzefVar.zzb(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, zzefVar.zzi(), 0, length);
        }
        zzacvVar.zzc(zzefVar.zzi(), length, i);
        zzefVar.zzh(0);
        zzefVar.zzf(i4);
    }

    private static byte[] zzw(long j, String str, long j6) {
        zzghc.zza(j != androidx.media3.common.C.TIME_UNSET);
        Locale locale = Locale.US;
        int i = (int) (j / 3600000000L);
        Integer numValueOf = Integer.valueOf(i);
        long j7 = j - (((long) i) * 3600000000L);
        int i4 = (int) (j7 / 60000000);
        Integer numValueOf2 = Integer.valueOf(i4);
        long j9 = j7 - (((long) i4) * 60000000);
        int i6 = (int) (j9 / 1000000);
        String str2 = String.format(locale, str, numValueOf, numValueOf2, Integer.valueOf(i6), Integer.valueOf((int) ((j9 - (((long) i6) * 1000000)) / j6)));
        String str3 = zzeo.zza;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    private final int zzx(zzacv zzacvVar, zzaeb zzaebVar, int i) throws IOException {
        zzef zzefVar = this.zzr;
        int iZzd = zzefVar.zzd();
        if (iZzd <= 0) {
            return zzaebVar.zzy(zzacvVar, i, false);
        }
        int iMin = Math.min(i, iZzd);
        zzaebVar.zzz(zzefVar, iMin);
        return iMin;
    }

    private final long zzy(long j) throws zzas {
        long j6 = this.zzz;
        if (j6 != androidx.media3.common.C.TIME_UNSET) {
            return zzeo.zzt(j, j6, 1000L, RoundingMode.DOWN);
        }
        throw zzas.zzb("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static int[] zzz(@Nullable int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    @CallSuper
    public final void zza(int i, long j, long j6) throws zzas {
        zzacx zzacxVar = this.zzal;
        zzacxVar.getClass();
        if (i == 160) {
            this.zzaa = false;
            this.zzab = 0L;
            return;
        }
        if (i == 174) {
            zzagy zzagyVar = new zzagy();
            this.zzE = zzagyVar;
            zzagyVar.zza = this.zzC;
            return;
        }
        if (i == 187) {
            this.zzO = false;
            return;
        }
        if (i == 19899) {
            this.zzG = -1;
            this.zzH = -1L;
            return;
        }
        if (i == 20533) {
            zzp(i);
            this.zzE.zzh = true;
            return;
        }
        if (i == 21968) {
            zzp(i);
            this.zzE.zzy = true;
            return;
        }
        if (i == 408125543) {
            long j7 = this.zzy;
            if (j7 != -1 && j7 != j) {
                throw zzas.zzb("Multiple Segment elements not supported", null);
            }
            this.zzy = j;
            this.zzx = j6;
            return;
        }
        if (i == 475249515) {
            this.zzM = new zzdt(32);
            this.zzN = new zzdt(32);
        } else if (i == 524531317 && !this.zzF) {
            if (this.zzj && this.zzJ != -1) {
                this.zzI = true;
            } else {
                zzacxVar.zzw(new zzadu(this.zzB, 0L));
                this.zzF = true;
            }
        }
    }

    @CallSuper
    public final void zzb(int i) throws zzas {
        int i4;
        zzadv zzaduVar;
        int i6;
        int i10 = 0;
        zzacx zzacxVar = this.zzal;
        zzacxVar.getClass();
        if (i == 160) {
            if (this.zzQ == 2) {
                zzagy zzagyVar = (zzagy) this.zzi.get(this.zzW);
                zzagyVar.zzb();
                if (this.zzab > 0 && "A_OPUS".equals(zzagyVar.zzc)) {
                    zzef zzefVar = this.zzv;
                    byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzab).array();
                    zzefVar.zzb(bArrArray, bArrArray.length);
                }
                int i11 = 0;
                for (int i12 = 0; i12 < this.zzU; i12++) {
                    i11 += this.zzV[i12];
                }
                int i13 = 0;
                while (i13 < this.zzU) {
                    long j = this.zzR + ((long) ((zzagyVar.zzf * i13) / 1000));
                    int i14 = this.zzY;
                    if (i13 == 0) {
                        if (!this.zzaa) {
                            i14 |= 1;
                        }
                        i4 = 0;
                    } else {
                        i4 = i13;
                    }
                    int i15 = this.zzV[i4];
                    int i16 = i11 - i15;
                    zzr(zzagyVar, j, i14, i15, i16);
                    i13 = i4 + 1;
                    i11 = i16;
                }
                this.zzQ = 0;
                return;
            }
            return;
        }
        if (i != 174) {
            if (i == 19899) {
                int i17 = this.zzG;
                if (i17 != -1) {
                    long j6 = this.zzH;
                    if (j6 != -1) {
                        if (i17 == 475249515) {
                            this.zzJ = j6;
                            return;
                        }
                        return;
                    }
                }
                throw zzas.zzb("Mandatory element SeekID or SeekPosition not found", null);
            }
            if (i == 25152) {
                zzp(i);
                zzagy zzagyVar2 = this.zzE;
                if (zzagyVar2.zzh) {
                    if (zzagyVar2.zzj == null) {
                        throw zzas.zzb("Encrypted Track found but ContentEncKeyID was not found", null);
                    }
                    zzagyVar2.zzl = new zzp(null, new zzo(zzf.zza, null, MimeTypes.VIDEO_WEBM, this.zzE.zzj.zzb));
                    return;
                }
                return;
            }
            if (i == 28032) {
                zzp(i);
                zzagy zzagyVar3 = this.zzE;
                if (zzagyVar3.zzh && zzagyVar3.zzi != null) {
                    throw zzas.zzb("Combining encryption and compression is not supported", null);
                }
                return;
            }
            if (i == 357149030) {
                if (this.zzz == androidx.media3.common.C.TIME_UNSET) {
                    this.zzz = 1000000L;
                }
                long j7 = this.zzA;
                if (j7 != androidx.media3.common.C.TIME_UNSET) {
                    this.zzB = zzy(j7);
                    return;
                }
                return;
            }
            if (i == 374648427) {
                if (this.zzi.size() == 0) {
                    throw zzas.zzb("No valid tracks were found", null);
                }
                zzA();
                return;
            }
            if (i != 475249515) {
                return;
            }
            if (!this.zzF) {
                zzdt zzdtVar = this.zzM;
                zzdt zzdtVar2 = this.zzN;
                if (this.zzy == -1 || this.zzB == androidx.media3.common.C.TIME_UNSET || zzdtVar == null || zzdtVar.zzd() == 0 || zzdtVar2 == null || zzdtVar2.zzd() != zzdtVar.zzd()) {
                    zzaduVar = new zzadu(this.zzB, 0L);
                } else {
                    int iZzd = zzdtVar.zzd();
                    int[] iArrCopyOf = new int[iZzd];
                    long[] jArrCopyOf = new long[iZzd];
                    long[] jArrCopyOf2 = new long[iZzd];
                    long[] jArrCopyOf3 = new long[iZzd];
                    for (int i18 = 0; i18 < iZzd; i18++) {
                        jArrCopyOf3[i18] = zzdtVar.zzc(i18);
                        jArrCopyOf[i18] = zzdtVar2.zzc(i18) + this.zzy;
                    }
                    while (true) {
                        i6 = iZzd - 1;
                        if (i10 >= i6) {
                            break;
                        }
                        int i19 = i10 + 1;
                        iArrCopyOf[i10] = (int) (jArrCopyOf[i19] - jArrCopyOf[i10]);
                        jArrCopyOf2[i10] = jArrCopyOf3[i19] - jArrCopyOf3[i10];
                        i10 = i19;
                    }
                    int i20 = i6;
                    while (i20 > 0 && jArrCopyOf3[i20] > this.zzB) {
                        i20--;
                    }
                    iArrCopyOf[i20] = (int) ((this.zzy + this.zzx) - jArrCopyOf[i20]);
                    jArrCopyOf2[i20] = this.zzB - jArrCopyOf3[i20];
                    if (i20 < i6) {
                        zzds.zzc("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration");
                        int i21 = i20 + 1;
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i21);
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i21);
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i21);
                        jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i21);
                    }
                    zzaduVar = new zzaci(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
                }
                zzacxVar.zzw(zzaduVar);
                this.zzF = true;
            }
            this.zzM = null;
            this.zzN = null;
            return;
        }
        zzagy zzagyVar4 = this.zzE;
        zzagyVar4.getClass();
        String str = zzagyVar4.zzc;
        if (str == null) {
            throw zzas.zzb("CodecId is missing in TrackEntry element", null);
        }
        switch (str) {
            case "V_VP8":
            case "V_VP9":
            case "V_AV1":
            case "V_MPEG2":
            case "V_MPEG4/ISO/SP":
            case "V_MPEG4/ISO/ASP":
            case "V_MPEG4/ISO/AP":
            case "V_MPEG4/ISO/AVC":
            case "V_MPEGH/ISO/HEVC":
            case "V_MS/VFW/FOURCC":
            case "V_THEORA":
            case "A_OPUS":
            case "A_VORBIS":
            case "A_AAC":
            case "A_MPEG/L2":
            case "A_MPEG/L3":
            case "A_AC3":
            case "A_EAC3":
            case "A_TRUEHD":
            case "A_DTS":
            case "A_DTS/EXPRESS":
            case "A_DTS/LOSSLESS":
            case "A_FLAC":
            case "A_MS/ACM":
            case "A_PCM/INT/LIT":
            case "A_PCM/INT/BIG":
            case "A_PCM/FLOAT/IEEE":
            case "S_TEXT/UTF8":
            case "S_TEXT/ASS":
            case "S_TEXT/SSA":
            case "S_TEXT/WEBVTT":
            case "S_VOBSUB":
            case "S_HDMV/PGS":
            case "S_DVBSUB":
                zzagyVar4.zza(zzacxVar, zzagyVar4.zzd);
                this.zzi.put(zzagyVar4.zzd, zzagyVar4);
                break;
        }
        this.zzE = null;
    }

    @CallSuper
    public final void zzc(int i, long j) throws zzas {
        boolean z4;
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j).length() + 35);
            sb2.append("ContentEncodingOrder ");
            sb2.append(j);
            sb2.append(" not supported");
            throw zzas.zzb(sb2.toString(), null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(j).length() + 35);
            sb3.append("ContentEncodingScope ");
            sb3.append(j);
            sb3.append(" not supported");
            throw zzas.zzb(sb3.toString(), null);
        }
        switch (i) {
            case 131:
                zzp(i);
                this.zzE.zze = (int) j;
                return;
            case TsExtractor.TS_STREAM_TYPE_DTS_HD /* 136 */:
                z4 = j == 1;
                zzp(i);
                this.zzE.zzX = z4;
                return;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                this.zzS = zzy(j);
                return;
            case 159:
                zzp(i);
                this.zzE.zzP = (int) j;
                return;
            case 176:
                zzp(i);
                this.zzE.zzm = (int) j;
                return;
            case 179:
                zzq(i);
                this.zzM.zza(zzy(j));
                return;
            case 186:
                zzp(i);
                this.zzE.zzn = (int) j;
                return;
            case MfaTencentErrorResult.TENCENT_ERROR_CAMERA_PERMISSION /* 215 */:
                zzp(i);
                this.zzE.zzd = (int) j;
                return;
            case 231:
                this.zzL = zzy(j);
                return;
            case 238:
                this.zzZ = (int) j;
                return;
            case 241:
                if (this.zzO) {
                    return;
                }
                zzq(i);
                this.zzN.zza(j);
                this.zzO = true;
                return;
            case 251:
                this.zzaa = true;
                return;
            case 16871:
                zzp(i);
                this.zzE.zzd((int) j);
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                StringBuilder sb4 = new StringBuilder(String.valueOf(j).length() + 30);
                sb4.append("ContentCompAlgo ");
                sb4.append(j);
                sb4.append(" not supported");
                throw zzas.zzb(sb4.toString(), null);
            case 17029:
                if (j < 1 || j > 2) {
                    StringBuilder sb5 = new StringBuilder(String.valueOf(j).length() + 33);
                    sb5.append("DocTypeReadVersion ");
                    sb5.append(j);
                    sb5.append(" not supported");
                    throw zzas.zzb(sb5.toString(), null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(String.valueOf(j).length() + 30);
                sb6.append("EBMLReadVersion ");
                sb6.append(j);
                sb6.append(" not supported");
                throw zzas.zzb(sb6.toString(), null);
            case 18401:
                if (j == 5) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(String.valueOf(j).length() + 29);
                sb7.append("ContentEncAlgo ");
                sb7.append(j);
                sb7.append(" not supported");
                throw zzas.zzb(sb7.toString(), null);
            case 18408:
                if (j == 1) {
                    return;
                }
                StringBuilder sb8 = new StringBuilder(String.valueOf(j).length() + 36);
                sb8.append("AESSettingsCipherMode ");
                sb8.append(j);
                sb8.append(" not supported");
                throw zzas.zzb(sb8.toString(), null);
            case 21420:
                this.zzH = j + this.zzy;
                return;
            case 21432:
                int i4 = (int) j;
                zzp(i);
                if (i4 == 0) {
                    this.zzE.zzx = 0;
                    return;
                }
                if (i4 == 1) {
                    this.zzE.zzx = 2;
                    return;
                } else if (i4 == 3) {
                    this.zzE.zzx = 1;
                    return;
                } else {
                    if (i4 != 15) {
                        return;
                    }
                    this.zzE.zzx = 3;
                    return;
                }
            case 21680:
                zzp(i);
                this.zzE.zzp = (int) j;
                return;
            case 21682:
                zzp(i);
                this.zzE.zzr = (int) j;
                return;
            case 21690:
                zzp(i);
                this.zzE.zzq = (int) j;
                return;
            case 21930:
                z4 = j == 1;
                zzp(i);
                this.zzE.zzW = z4;
                return;
            case 21938:
                zzp(i);
                zzagy zzagyVar = this.zzE;
                zzagyVar.zzy = true;
                zzagyVar.zzo = (int) j;
                return;
            case 21998:
                zzp(i);
                this.zzE.zzg = (int) j;
                return;
            case 22186:
                zzp(i);
                this.zzE.zzS = j;
                return;
            case 22203:
                zzp(i);
                this.zzE.zzT = j;
                return;
            case 25188:
                zzp(i);
                this.zzE.zzQ = (int) j;
                return;
            case 30114:
                this.zzab = j;
                return;
            case 30321:
                int i6 = (int) j;
                zzp(i);
                if (i6 == 0) {
                    this.zzE.zzs = 0;
                    return;
                }
                if (i6 == 1) {
                    this.zzE.zzs = 1;
                    return;
                } else if (i6 == 2) {
                    this.zzE.zzs = 2;
                    return;
                } else {
                    if (i6 != 3) {
                        return;
                    }
                    this.zzE.zzs = 3;
                    return;
                }
            case 2352003:
                zzp(i);
                this.zzE.zzf = (int) j;
                return;
            case 2807729:
                this.zzz = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i10 = (int) j;
                        zzp(i);
                        if (i10 == 1) {
                            this.zzE.zzB = 2;
                            return;
                        } else {
                            if (i10 != 2) {
                                return;
                            }
                            this.zzE.zzB = 1;
                            return;
                        }
                    case 21946:
                        zzp(i);
                        int iZzc = zzh.zzc((int) j);
                        if (iZzc != -1) {
                            this.zzE.zzA = iZzc;
                            return;
                        }
                        return;
                    case 21947:
                        zzp(i);
                        this.zzE.zzy = true;
                        int iZzb = zzh.zzb((int) j);
                        if (iZzb != -1) {
                            this.zzE.zzz = iZzb;
                            return;
                        }
                        return;
                    case 21948:
                        zzp(i);
                        this.zzE.zzC = (int) j;
                        return;
                    case 21949:
                        zzp(i);
                        this.zzE.zzD = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        return new zzaha().zza(zzacvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final /* synthetic */ List zze() {
        return AbstractC1170d.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        if (this.zzk) {
            zzacxVar = new zzajw(zzacxVar, this.zzl);
        }
        this.zzal = zzacxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) throws IOException {
        int i = 0;
        this.zzP = false;
        while (!this.zzP) {
            if (this.zzam.zzc(zzacvVar)) {
                long jZzn = zzacvVar.zzn();
                if (this.zzI) {
                    this.zzK = jZzn;
                    zzadsVar.zza = this.zzJ;
                    this.zzI = false;
                    return 1;
                }
                if (this.zzF) {
                    long j = this.zzK;
                    if (j != -1) {
                        zzadsVar.zza = j;
                        this.zzK = -1L;
                        return 1;
                    }
                }
            } else {
                while (true) {
                    SparseArray sparseArray = this.zzi;
                    if (i >= sparseArray.size()) {
                        return -1;
                    }
                    zzagy zzagyVar = (zzagy) sparseArray.valueAt(i);
                    zzagyVar.zzb();
                    zzaec zzaecVar = zzagyVar.zzU;
                    if (zzaecVar != null) {
                        zzaecVar.zzd(zzagyVar.zzY, zzagyVar.zzj);
                    }
                    i++;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    @CallSuper
    public final void zzh(long j, long j6) {
        this.zzL = androidx.media3.common.C.TIME_UNSET;
        int i = 0;
        this.zzQ = 0;
        this.zzam.zzb();
        this.zzh.zza();
        zzu();
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i >= sparseArray.size()) {
                return;
            }
            zzaec zzaecVar = ((zzagy) sparseArray.valueAt(i)).zzU;
            if (zzaecVar != null) {
                zzaecVar.zza();
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final /* synthetic */ zzacu zzi() {
        return AbstractC1170d.b(this);
    }

    @CallSuper
    public final void zzj(int i, double d10) throws zzas {
        if (i == 181) {
            zzp(i);
            this.zzE.zzR = (int) d10;
            return;
        }
        if (i == 17545) {
            this.zzA = (long) d10;
            return;
        }
        switch (i) {
            case 21969:
                zzp(i);
                this.zzE.zzE = (float) d10;
                break;
            case 21970:
                zzp(i);
                this.zzE.zzF = (float) d10;
                break;
            case 21971:
                zzp(i);
                this.zzE.zzG = (float) d10;
                break;
            case 21972:
                zzp(i);
                this.zzE.zzH = (float) d10;
                break;
            case 21973:
                zzp(i);
                this.zzE.zzI = (float) d10;
                break;
            case 21974:
                zzp(i);
                this.zzE.zzJ = (float) d10;
                break;
            case 21975:
                zzp(i);
                this.zzE.zzK = (float) d10;
                break;
            case 21976:
                zzp(i);
                this.zzE.zzL = (float) d10;
                break;
            case 21977:
                zzp(i);
                this.zzE.zzM = (float) d10;
                break;
            case 21978:
                zzp(i);
                this.zzE.zzN = (float) d10;
                break;
            default:
                switch (i) {
                    case 30323:
                        zzp(i);
                        this.zzE.zzt = (float) d10;
                        break;
                    case 30324:
                        zzp(i);
                        this.zzE.zzu = (float) d10;
                        break;
                    case 30325:
                        zzp(i);
                        this.zzE.zzv = (float) d10;
                        break;
                }
                break;
        }
    }

    @CallSuper
    public final void zzk(int i, String str) throws zzas {
        if (i == 134) {
            zzp(i);
            this.zzE.zzc = str;
            return;
        }
        if (i != 17026) {
            if (i == 21358) {
                zzp(i);
                this.zzE.zzb = str;
                return;
            } else {
                if (i != 2274716) {
                    return;
                }
                zzp(i);
                this.zzE.zze(str);
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            this.zzC = Objects.equals(str, "webm");
            return;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 22);
        sb2.append("DocType ");
        sb2.append(str);
        sb2.append(" not supported");
        throw zzas.zzb(sb2.toString(), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CallSuper
    public final void zzl(int i, int i4, zzacv zzacvVar) throws IOException {
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        long j;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = i;
        int i19 = 1;
        int i20 = 0;
        if (i18 != 161 && i18 != 163) {
            if (i18 == 165) {
                if (this.zzQ != 2) {
                    return;
                }
                zzagy zzagyVar = (zzagy) this.zzi.get(this.zzW);
                if (this.zzZ != 4 || !"V_VP9".equals(zzagyVar.zzc)) {
                    zzacvVar.zzf(i4);
                    return;
                }
                zzef zzefVar = this.zzv;
                zzefVar.zza(i4);
                zzacvVar.zzc(zzefVar.zzi(), 0, i4);
                return;
            }
            if (i18 == 16877) {
                zzp(i);
                zzagy zzagyVar2 = this.zzE;
                if (zzagyVar2.zzc() != 1685485123 && zzagyVar2.zzc() != 1685480259) {
                    zzacvVar.zzf(i4);
                    return;
                }
                byte[] bArr = new byte[i4];
                zzagyVar2.zzO = bArr;
                zzacvVar.zzc(bArr, 0, i4);
                return;
            }
            if (i18 == 16981) {
                zzp(i);
                byte[] bArr2 = new byte[i4];
                this.zzE.zzi = bArr2;
                zzacvVar.zzc(bArr2, 0, i4);
                return;
            }
            if (i18 == 18402) {
                byte[] bArr3 = new byte[i4];
                zzacvVar.zzc(bArr3, 0, i4);
                zzp(i);
                this.zzE.zzj = new zzaea(1, bArr3, 0, 0);
                return;
            }
            if (i18 == 21419) {
                zzef zzefVar2 = this.zzq;
                Arrays.fill(zzefVar2.zzi(), (byte) 0);
                zzacvVar.zzc(zzefVar2.zzi(), 4 - i4, i4);
                zzefVar2.zzh(0);
                this.zzG = (int) zzefVar2.zzz();
                return;
            }
            if (i18 == 25506) {
                zzp(i);
                byte[] bArr4 = new byte[i4];
                this.zzE.zzk = bArr4;
                zzacvVar.zzc(bArr4, 0, i4);
                return;
            }
            if (i18 != 30322) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i18).length() + 15);
                sb2.append("Unexpected id: ");
                sb2.append(i18);
                throw zzas.zzb(sb2.toString(), null);
            }
            zzp(i);
            byte[] bArr5 = new byte[i4];
            this.zzE.zzw = bArr5;
            zzacvVar.zzc(bArr5, 0, i4);
            return;
        }
        int i21 = 8;
        if (this.zzQ == 0) {
            zzahb zzahbVar = this.zzh;
            this.zzW = (int) zzahbVar.zzb(zzacvVar, false, true, 8);
            this.zzX = zzahbVar.zzc();
            this.zzS = androidx.media3.common.C.TIME_UNSET;
            this.zzQ = 1;
            this.zzo.zza(0);
        }
        zzagy zzagyVar3 = (zzagy) this.zzi.get(this.zzW);
        if (zzagyVar3 == null) {
            zzacvVar.zzf(i4 - this.zzX);
            this.zzQ = 0;
            return;
        }
        zzagyVar3.zzb();
        if (this.zzQ == 1) {
            zzs(zzacvVar, 3);
            zzef zzefVar3 = this.zzo;
            int i22 = (zzefVar3.zzi()[2] & 6) >> 1;
            if (i22 == 0) {
                this.zzU = 1;
                int[] iArrZzz = zzz(this.zzV, 1);
                this.zzV = iArrZzz;
                iArrZzz[0] = (i4 - this.zzX) - 3;
            } else {
                zzs(zzacvVar, 4);
                int i23 = (zzefVar3.zzi()[3] & 255) + 1;
                this.zzU = i23;
                int[] iArrZzz2 = zzz(this.zzV, i23);
                this.zzV = iArrZzz2;
                if (i22 == 2) {
                    int i24 = (i4 - this.zzX) - 4;
                    int i25 = this.zzU;
                    Arrays.fill(iArrZzz2, 0, i25, i24 / i25);
                } else {
                    if (i22 != 1) {
                        if (i22 != 3) {
                            throw zzas.zzb("Unexpected lacing value: 2", null);
                        }
                        int i26 = 0;
                        int i27 = 0;
                        int i28 = 4;
                        while (true) {
                            int i29 = this.zzU - 1;
                            if (i26 >= i29) {
                                i6 = i19;
                                i11 = i20;
                                this.zzV[i29] = ((i4 - this.zzX) - i28) - i27;
                                break;
                            }
                            this.zzV[i26] = i20;
                            int i30 = i28 + 1;
                            zzs(zzacvVar, i30);
                            if (zzefVar3.zzi()[i28] == 0) {
                                throw zzas.zzb("No valid varint length mask found", null);
                            }
                            int i31 = i19;
                            int i32 = i20;
                            while (true) {
                                if (i32 >= i21) {
                                    i12 = i20;
                                    i13 = i21;
                                    j = 0;
                                    break;
                                }
                                i13 = i21;
                                int i33 = i31 << (7 - i32);
                                if ((zzefVar3.zzi()[i28] & i33) != 0) {
                                    i30 += i32;
                                    zzs(zzacvVar, i30);
                                    i12 = i20;
                                    j = zzefVar3.zzi()[i28] & 255 & (~i33);
                                    int i34 = i28 + 1;
                                    while (i34 < i30) {
                                        j = (j << i13) | ((long) (zzefVar3.zzi()[i34] & 255));
                                        i34++;
                                        i32 = i32;
                                    }
                                    int i35 = i32;
                                    if (i26 > 0) {
                                        j -= (1 << ((i35 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i32++;
                                    i21 = i13;
                                }
                            }
                            i28 = i30;
                            if (j < -2147483648L || j > 2147483647L) {
                                break;
                            }
                            int[] iArr = this.zzV;
                            int i36 = (int) j;
                            if (i26 != 0) {
                                i36 += iArr[i26 - 1];
                            }
                            iArr[i26] = i36;
                            i27 += i36;
                            i26++;
                            i19 = i31;
                            i20 = i12;
                            i21 = i13;
                        }
                        throw zzas.zzb("EBML lacing sample size out of range.", null);
                    }
                    int i37 = 0;
                    int i38 = 0;
                    int i39 = 4;
                    while (true) {
                        i14 = this.zzU - 1;
                        if (i37 >= i14) {
                            break;
                        }
                        this.zzV[i37] = 0;
                        while (true) {
                            i15 = i39 + 1;
                            zzs(zzacvVar, i15);
                            int i40 = zzefVar3.zzi()[i39] & 255;
                            int[] iArr2 = this.zzV;
                            i16 = iArr2[i37] + i40;
                            iArr2[i37] = i16;
                            if (i40 != 255) {
                                break;
                            } else {
                                i39 = i15;
                            }
                        }
                        i38 += i16;
                        i37++;
                        i39 = i15;
                    }
                    this.zzV[i14] = ((i4 - this.zzX) - i39) - i38;
                }
            }
            i6 = 1;
            i11 = 0;
            this.zzR = this.zzL + zzy((zzefVar3.zzi()[i11] << 8) | (zzefVar3.zzi()[i6] & 255));
            if (zzagyVar3.zze == 2) {
                i17 = i6;
            } else if (i18 == 163) {
                i17 = (zzefVar3.zzi()[2] & 128) == 128 ? i6 : i11;
                i18 = 163;
            } else {
                i17 = i11;
            }
            this.zzY = i17;
            this.zzQ = 2;
            this.zzT = i11;
            i10 = 163;
        } else {
            i6 = 1;
            i10 = 163;
        }
        if (i18 == i10) {
            while (true) {
                int i41 = this.zzT;
                if (i41 >= this.zzU) {
                    this.zzQ = 0;
                    return;
                }
                int iZzt = zzt(zzacvVar, zzagyVar3, this.zzV[i41], false);
                zzagy zzagyVar4 = zzagyVar3;
                zzr(zzagyVar4, this.zzR + ((long) ((this.zzT * zzagyVar3.zzf) / 1000)), this.zzY, iZzt, 0);
                this.zzT++;
                zzagyVar3 = zzagyVar4;
            }
        } else {
            while (true) {
                int i42 = this.zzT;
                if (i42 >= this.zzU) {
                    return;
                }
                int[] iArr3 = this.zzV;
                boolean z4 = i6;
                iArr3[i42] = zzt(zzacvVar, zzagyVar3, iArr3[i42], z4);
                this.zzT += z4 ? 1 : 0;
            }
        }
    }

    public zzagz(zzagu zzaguVar, int i, zzajt zzajtVar) {
        this.zzy = -1L;
        this.zzz = androidx.media3.common.C.TIME_UNSET;
        this.zzA = androidx.media3.common.C.TIME_UNSET;
        this.zzB = androidx.media3.common.C.TIME_UNSET;
        this.zzJ = -1L;
        this.zzK = -1L;
        this.zzL = androidx.media3.common.C.TIME_UNSET;
        this.zzam = zzaguVar;
        zzaguVar.zza(new zzagw(this, null));
        this.zzl = zzajtVar;
        this.zzj = 1 == ((i & 1) ^ 1);
        this.zzk = (i & 2) == 0;
        this.zzh = new zzahb();
        this.zzi = new SparseArray();
        this.zzo = new zzef(4);
        this.zzp = new zzef(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzq = new zzef(4);
        this.zzm = new zzef(zzfl.zza);
        this.zzn = new zzef(4);
        this.zzr = new zzef();
        this.zzs = new zzef();
        this.zzt = new zzef(8);
        this.zzu = new zzef();
        this.zzv = new zzef();
        this.zzV = new int[1];
        this.zzD = true;
    }

    public zzagz(zzajt zzajtVar, int i) {
        this(new zzagu(), 0, zzajtVar);
    }
}
