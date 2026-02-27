package com.google.android.gms.internal.measurement;

import We.s;
import androidx.camera.video.AudioStats;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class zzas implements Iterable, zzao {
    private final String zza;

    public zzas(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzas) {
            return this.zza.equals(((zzas) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzar(this);
    }

    public final String toString() {
        String str = this.zza;
        return s.q(new StringBuilder(str.length() + 2), "\"", str, "\"");
    }

    public final /* synthetic */ String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        return this.zza;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzcA(String str, zzg zzgVar, List list) {
        String str2;
        String str3;
        String str4;
        String str5;
        byte b8;
        int i;
        int i4;
        int i6;
        int i10;
        zzg zzgVar2;
        int iZzi;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "hasOwnProperty";
            str3 = "trim";
        } else {
            str2 = "hasOwnProperty";
            str3 = "trim";
            if (!str3.equals(str)) {
                throw new IllegalArgumentException(s.i(str, " is not a String function"));
            }
        }
        switch (str.hashCode()) {
            case -1789698943:
                str4 = str2;
                str5 = "charAt";
                b8 = str.equals(str4) ? (byte) 2 : (byte) -1;
                break;
            case -1776922004:
                str5 = "charAt";
                if (str.equals("toString")) {
                    b8 = 14;
                    str4 = str2;
                }
                str4 = str2;
                break;
            case -1464939364:
                str5 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    b8 = 12;
                    str4 = str2;
                }
                str4 = str2;
                break;
            case -1361633751:
                str5 = "charAt";
                if (str.equals(str5)) {
                    str4 = str2;
                    b8 = 0;
                }
                str4 = str2;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str4 = str2;
                    str5 = "charAt";
                    b8 = 1;
                }
                str4 = str2;
                str5 = "charAt";
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    b8 = 13;
                    str4 = str2;
                    str5 = "charAt";
                }
                str4 = str2;
                str5 = "charAt";
                break;
            case -906336856:
                if (str.equals("search")) {
                    b8 = 7;
                    str4 = str2;
                    str5 = "charAt";
                }
                str4 = str2;
                str5 = "charAt";
                break;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    b8 = 11;
                    str4 = str2;
                    str5 = "charAt";
                }
                str4 = str2;
                str5 = "charAt";
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    b8 = 4;
                    str4 = str2;
                    str5 = "charAt";
                }
                str4 = str2;
                str5 = "charAt";
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    b8 = 15;
                    str4 = str2;
                    str5 = "charAt";
                }
                str4 = str2;
                str5 = "charAt";
                break;
            case 3568674:
                if (str.equals(str3)) {
                    b8 = 16;
                    str4 = str2;
                    str5 = "charAt";
                }
                str4 = str2;
                str5 = "charAt";
                break;
            case 103668165:
                if (str.equals("match")) {
                    b8 = 5;
                    str4 = str2;
                    str5 = "charAt";
                }
                str4 = str2;
                str5 = "charAt";
                break;
            case 109526418:
                if (str.equals("slice")) {
                    b8 = 8;
                    str4 = str2;
                    str5 = "charAt";
                }
                str4 = str2;
                str5 = "charAt";
                break;
            case 109648666:
                if (str.equals("split")) {
                    b8 = 9;
                    str4 = str2;
                    str5 = "charAt";
                }
                str4 = str2;
                str5 = "charAt";
                break;
            case 530542161:
                if (str.equals("substring")) {
                    b8 = 10;
                    str4 = str2;
                    str5 = "charAt";
                }
                str4 = str2;
                str5 = "charAt";
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    b8 = 6;
                    str4 = str2;
                    str5 = "charAt";
                }
                str4 = str2;
                str5 = "charAt";
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    str4 = str2;
                    str5 = "charAt";
                    b8 = 3;
                }
                str4 = str2;
                str5 = "charAt";
                break;
            default:
                str4 = str2;
                str5 = "charAt";
                break;
        }
        String strZzc = AdError.UNDEFINED_DOMAIN;
        byte b10 = b8;
        double dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
        switch (b10) {
            case 0:
                zzh.zzc(str5, 1, list);
                int iZzi2 = !list.isEmpty() ? (int) zzh.zzi(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue()) : 0;
                String str6 = this.zza;
                return (iZzi2 < 0 || iZzi2 >= str6.length()) ? zzao.zzm : new zzas(String.valueOf(str6.charAt(iZzi2)));
            case 1:
                if (list.isEmpty()) {
                    return this;
                }
                StringBuilder sb2 = new StringBuilder(this.zza);
                for (int i11 = 0; i11 < list.size(); i11++) {
                    sb2.append(zzgVar.zza((zzao) list.get(i11)).zzc());
                }
                return new zzas(sb2.toString());
            case 2:
                zzh.zza(str4, 1, list);
                String str7 = this.zza;
                zzao zzaoVarZza = zzgVar.zza((zzao) list.get(0));
                if (SessionDescription.ATTR_LENGTH.equals(zzaoVarZza.zzc())) {
                    return zzao.zzk;
                }
                double dDoubleValue2 = zzaoVarZza.zzd().doubleValue();
                return (dDoubleValue2 != Math.floor(dDoubleValue2) || (i = (int) dDoubleValue2) < 0 || i >= str7.length()) ? zzao.zzl : zzao.zzk;
            case 3:
                zzh.zzc("indexOf", 2, list);
                String str8 = this.zza;
                if (list.size() > 0) {
                    strZzc = zzgVar.zza((zzao) list.get(0)).zzc();
                }
                String str9 = strZzc;
                if (list.size() >= 2) {
                    dDoubleValue = zzgVar.zza((zzao) list.get(1)).zzd().doubleValue();
                }
                return new zzah(Double.valueOf(str8.indexOf(str9, (int) zzh.zzi(dDoubleValue))));
            case 4:
                zzh.zzc("lastIndexOf", 2, list);
                String str10 = this.zza;
                if (list.size() > 0) {
                    strZzc = zzgVar.zza((zzao) list.get(0)).zzc();
                }
                String str11 = strZzc;
                return new zzah(Double.valueOf(str10.lastIndexOf(str11, (int) (Double.isNaN(list.size() < 2 ? Double.NaN : zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()) ? Double.POSITIVE_INFINITY : zzh.zzi(r3)))));
            case 5:
                zzh.zzc("match", 1, list);
                Matcher matcher = Pattern.compile(list.size() <= 0 ? "" : zzgVar.zza((zzao) list.get(0)).zzc()).matcher(this.zza);
                return matcher.find() ? new zzae(Arrays.asList(new zzas(matcher.group()))) : zzao.zzg;
            case 6:
                zzh.zzc("replace", 2, list);
                zzao zzaoVarZza2 = zzao.zzf;
                if (!list.isEmpty()) {
                    strZzc = zzgVar.zza((zzao) list.get(0)).zzc();
                    if (list.size() > 1) {
                        zzaoVarZza2 = zzgVar.zza((zzao) list.get(1));
                    }
                }
                String str12 = strZzc;
                String str13 = this.zza;
                int iIndexOf = str13.indexOf(str12);
                if (iIndexOf < 0) {
                    return this;
                }
                if (zzaoVarZza2 instanceof zzai) {
                    i4 = 0;
                    zzaoVarZza2 = ((zzai) zzaoVarZza2).zza(zzgVar, Arrays.asList(new zzas(str12), new zzah(Double.valueOf(iIndexOf)), this));
                } else {
                    i4 = 0;
                }
                String strSubstring = str13.substring(i4, iIndexOf);
                String strZzc2 = zzaoVarZza2.zzc();
                String strSubstring2 = str13.substring(str12.length() + iIndexOf);
                return new zzas(s.q(new StringBuilder(String.valueOf(strSubstring).length() + String.valueOf(strZzc2).length() + String.valueOf(strSubstring2).length()), strSubstring, strZzc2, strSubstring2));
            case 7:
                zzh.zzc("search", 1, list);
                if (!list.isEmpty()) {
                    strZzc = zzgVar.zza((zzao) list.get(0)).zzc();
                }
                return Pattern.compile(strZzc).matcher(this.zza).find() ? new zzah(Double.valueOf(r0.start())) : new zzah(Double.valueOf(-1.0d));
            case 8:
                zzh.zzc("slice", 2, list);
                String str14 = this.zza;
                double dZzi = zzh.zzi(!list.isEmpty() ? zzgVar.zza((zzao) list.get(0)).zzd().doubleValue() : 0.0d);
                double dMax = dZzi < AudioStats.AUDIO_AMPLITUDE_NONE ? Math.max(((double) str14.length()) + dZzi, AudioStats.AUDIO_AMPLITUDE_NONE) : Math.min(dZzi, str14.length());
                double dZzi2 = zzh.zzi(list.size() > 1 ? zzgVar.zza((zzao) list.get(1)).zzd().doubleValue() : str14.length());
                double dMax2 = dZzi2 < AudioStats.AUDIO_AMPLITUDE_NONE ? Math.max(((double) str14.length()) + dZzi2, AudioStats.AUDIO_AMPLITUDE_NONE) : Math.min(dZzi2, str14.length());
                int i12 = (int) dMax;
                return new zzas(str14.substring(i12, Math.max(0, ((int) dMax2) - i12) + i12));
            case 9:
                zzh.zzc("split", 2, list);
                String str15 = this.zza;
                if (str15.length() == 0) {
                    return new zzae(Arrays.asList(this));
                }
                ArrayList arrayList = new ArrayList();
                if (list.isEmpty()) {
                    arrayList.add(this);
                } else {
                    String strZzc3 = zzgVar.zza((zzao) list.get(0)).zzc();
                    long jZzh = list.size() > 1 ? zzh.zzh(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()) : 2147483647L;
                    if (jZzh == 0) {
                        return new zzae();
                    }
                    String[] strArrSplit = str15.split(Pattern.quote(strZzc3), ((int) jZzh) + 1);
                    int length = strArrSplit.length;
                    if (!strZzc3.isEmpty() || length <= 0) {
                        i6 = length;
                        i10 = 0;
                    } else {
                        boolean zIsEmpty = strArrSplit[0].isEmpty();
                        i6 = length - 1;
                        i10 = zIsEmpty;
                        if (!strArrSplit[i6].isEmpty()) {
                            i6 = length;
                            i10 = zIsEmpty;
                        }
                    }
                    if (length > jZzh) {
                        i6--;
                    }
                    while (i10 < i6) {
                        arrayList.add(new zzas(strArrSplit[i10]));
                        i10++;
                    }
                }
                return new zzae(arrayList);
            case 10:
                zzh.zzc("substring", 2, list);
                String str16 = this.zza;
                if (list.isEmpty()) {
                    zzgVar2 = zzgVar;
                    iZzi = 0;
                } else {
                    zzgVar2 = zzgVar;
                    iZzi = (int) zzh.zzi(zzgVar2.zza((zzao) list.get(0)).zzd().doubleValue());
                }
                int iZzi3 = list.size() > 1 ? (int) zzh.zzi(zzgVar2.zza((zzao) list.get(1)).zzd().doubleValue()) : str16.length();
                int iMin = Math.min(Math.max(iZzi, 0), str16.length());
                int iMin2 = Math.min(Math.max(iZzi3, 0), str16.length());
                return new zzas(str16.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
            case 11:
                zzh.zza("toLocaleUpperCase", 0, list);
                return new zzas(this.zza.toUpperCase());
            case 12:
                zzh.zza("toLocaleLowerCase", 0, list);
                return new zzas(this.zza.toLowerCase());
            case 13:
                zzh.zza("toLowerCase", 0, list);
                return new zzas(this.zza.toLowerCase(Locale.ENGLISH));
            case 14:
                zzh.zza("toString", 0, list);
                return this;
            case 15:
                zzh.zza("toUpperCase", 0, list);
                return new zzas(this.zza.toUpperCase(Locale.ENGLISH));
            case 16:
                zzh.zza("toUpperCase", 0, list);
                return new zzas(this.zza.trim());
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Double zzd() {
        String str = this.zza;
        if (str.isEmpty()) {
            return Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Boolean zze() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Iterator zzf() {
        return new zzaq(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzt() {
        return new zzas(this.zza);
    }
}
