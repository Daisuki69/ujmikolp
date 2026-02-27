package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzala implements zzajv {
    private final zzef zza = new zzef();
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final float zzf;
    private final int zzg;

    public zzala(List list) {
        int size = list.size();
        String str = androidx.media3.common.C.SANS_SERIF_NAME;
        if (size != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.zzc = 0;
            this.zzd = -1;
            this.zze = androidx.media3.common.C.SANS_SERIF_NAME;
            this.zzb = false;
            this.zzf = 0.85f;
            this.zzg = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.zzc = bArr[24];
        this.zzd = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.zze = true == "Serif".equals(zzeo.zzj(bArr, 43, bArr.length + (-43))) ? androidx.media3.common.C.SERIF_NAME : str;
        int i = bArr[25] * 20;
        this.zzg = i;
        boolean z4 = (bArr[0] & 32) != 0;
        this.zzb = z4;
        if (z4) {
            this.zzf = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.95f));
        } else {
            this.zzf = 0.85f;
        }
    }

    private static void zzb(SpannableStringBuilder spannableStringBuilder, int i, int i4, int i6, int i10, int i11) {
        if (i != i4) {
            int i12 = i11 | 33;
            int i13 = i & 1;
            int i14 = i & 2;
            boolean z4 = true;
            if (i13 != 0) {
                if (i14 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i6, i10, i12);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i6, i10, i12);
                    z4 = false;
                }
            } else if (i14 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i6, i10, i12);
            } else {
                z4 = false;
            }
            if ((i & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i6, i10, i12);
            } else {
                if (i13 != 0 || z4) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i6, i10, i12);
            }
        }
    }

    private static void zzc(SpannableStringBuilder spannableStringBuilder, int i, int i4, int i6, int i10, int i11) {
        if (i != i4) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i6, i10, i11 | 33);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzajv
    public final void zza(byte[] bArr, int i, int i4, zzaju zzajuVar, zzdf zzdfVar) {
        String strZzK;
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        SpannableStringBuilder spannableStringBuilder;
        int i15;
        int i16;
        int i17;
        int i18;
        zzef zzefVar = this.zza;
        zzefVar.zzb(bArr, i + i4);
        zzefVar.zzh(i);
        int i19 = 1;
        int i20 = 0;
        int i21 = 2;
        zzghc.zza(zzefVar.zzd() >= 2);
        int iZzt = zzefVar.zzt();
        if (iZzt == 0) {
            strZzK = "";
        } else {
            int iZzg = zzefVar.zzg();
            Charset charsetZzR = zzefVar.zzR();
            int iZzg2 = zzefVar.zzg() - iZzg;
            if (charsetZzR == null) {
                charsetZzR = StandardCharsets.UTF_8;
            }
            strZzK = zzefVar.zzK(iZzt - iZzg2, charsetZzR);
        }
        if (strZzK.isEmpty()) {
            zzdfVar.zza(new zzajn(zzgjz.zzi(), androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET));
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(strZzK);
        int i22 = this.zzc;
        zzb(spannableStringBuilder2, i22, 0, 0, spannableStringBuilder2.length(), 16711680);
        int i23 = i22;
        int i24 = this.zzd;
        zzc(spannableStringBuilder2, i24, -1, 0, spannableStringBuilder2.length(), 16711680);
        int i25 = i24;
        String str = this.zze;
        int length = spannableStringBuilder2.length();
        if (str != androidx.media3.common.C.SANS_SERIF_NAME) {
            spannableStringBuilder2.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fMax = this.zzf;
        while (zzefVar.zzd() >= 8) {
            int iZzg3 = zzefVar.zzg();
            int iZzB = zzefVar.zzB();
            int iZzB2 = zzefVar.zzB();
            if (iZzB2 == 1937013100) {
                zzghc.zza(zzefVar.zzd() >= i21 ? i19 : i20);
                int iZzt2 = zzefVar.zzt();
                int i26 = i20;
                while (i26 < iZzt2) {
                    zzghc.zza(zzefVar.zzd() >= 12 ? i19 : i20);
                    int iZzt3 = zzefVar.zzt();
                    int iZzt4 = zzefVar.zzt();
                    zzefVar.zzk(i21);
                    int i27 = iZzt2;
                    int iZzs = zzefVar.zzs();
                    zzefVar.zzk(i19);
                    int iZzB3 = zzefVar.zzB();
                    int i28 = i19;
                    if (iZzt4 > spannableStringBuilder2.length()) {
                        int length2 = spannableStringBuilder2.length();
                        i13 = i23;
                        i14 = i25;
                        spannableStringBuilder = spannableStringBuilder2;
                        StringBuilder sb2 = new StringBuilder(androidx.media3.datasource.cache.c.b(String.valueOf(iZzt4).length() + 44, 2, String.valueOf(length2)));
                        sb2.append("Truncating styl end (");
                        sb2.append(iZzt4);
                        sb2.append(") to cueText.length() (");
                        sb2.append(length2);
                        sb2.append(").");
                        zzds.zzc("Tx3gParser", sb2.toString());
                        iZzt4 = spannableStringBuilder.length();
                    } else {
                        i13 = i23;
                        i14 = i25;
                        spannableStringBuilder = spannableStringBuilder2;
                    }
                    if (iZzt3 >= iZzt4) {
                        StringBuilder sb3 = new StringBuilder(androidx.media3.datasource.cache.c.b(String.valueOf(iZzt3).length() + 36, 2, String.valueOf(iZzt4)));
                        sb3.append("Ignoring styl with start (");
                        sb3.append(iZzt3);
                        sb3.append(") >= end (");
                        sb3.append(iZzt4);
                        sb3.append(").");
                        zzds.zzc("Tx3gParser", sb3.toString());
                        i17 = i13;
                        i16 = i26;
                        i15 = i27;
                        spannableStringBuilder2 = spannableStringBuilder;
                        i18 = i14;
                    } else {
                        i15 = i27;
                        i16 = i26;
                        spannableStringBuilder2 = spannableStringBuilder;
                        int i29 = i13;
                        zzb(spannableStringBuilder2, iZzs, i29, iZzt3, iZzt4, 0);
                        i17 = i29;
                        i18 = i14;
                        zzc(spannableStringBuilder2, iZzB3, i18, iZzt3, iZzt4, 0);
                    }
                    iZzt2 = i15;
                    i23 = i17;
                    i25 = i18;
                    i21 = 2;
                    i19 = i28;
                    i26 = i16 + 1;
                    i20 = 0;
                }
                i6 = i19;
                i10 = i25;
                i11 = i23;
                i12 = i21;
            } else {
                i6 = i19;
                i10 = i25;
                i11 = i23;
                if (iZzB2 == 1952608120 && this.zzb) {
                    i12 = 2;
                    zzghc.zza(zzefVar.zzd() >= 2 ? i6 : 0);
                    float fZzt = zzefVar.zzt();
                    int i30 = this.zzg;
                    String str2 = zzeo.zza;
                    fMax = Math.max(0.0f, Math.min(fZzt / i30, 0.95f));
                } else {
                    i12 = 2;
                }
            }
            zzefVar.zzh(iZzg3 + iZzB);
            i23 = i11;
            i21 = i12;
            i25 = i10;
            i20 = 0;
            i19 = i6;
        }
        zzck zzckVar = new zzck();
        zzckVar.zza(spannableStringBuilder2);
        zzckVar.zzf(fMax, 0);
        zzckVar.zzg(0);
        zzdfVar.zza(new zzajn(zzgjz.zzj(zzckVar.zzr()), androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET));
    }
}
