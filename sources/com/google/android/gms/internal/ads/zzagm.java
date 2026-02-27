package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzagm extends zzagh {

    @Nullable
    public final String zza;
    public final zzgjz zzb;

    public zzagm(String str, @Nullable String str2, List list) {
        super(str);
        zzghc.zza(!list.isEmpty());
        this.zza = str2;
        zzgjz zzgjzVarZzq = zzgjz.zzq(list);
        this.zzb = zzgjzVarZzq;
    }

    private static List zzb(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagm.class == obj.getClass()) {
            zzagm zzagmVar = (zzagm) obj;
            if (Objects.equals(this.zzf, zzagmVar.zzf) && Objects.equals(this.zza, zzagmVar.zza) && this.zzb.equals(zzagmVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzf.hashCode() + 527;
        String str = this.zza;
        return this.zzb.hashCode() + (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final String toString() {
        String strValueOf = String.valueOf(this.zzb);
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        StringBuilder sb2 = new StringBuilder(length + 14 + String.valueOf(str2).length() + 9 + strValueOf.length());
        androidx.media3.datasource.cache.c.A(sb2, str, ": description=", str2, ": values=");
        sb2.append(strValueOf);
        return sb2.toString();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzagh, com.google.android.gms.internal.ads.zzan
    public final void zza(zzal zzalVar) {
        byte b8;
        String str = this.zzf;
        switch (str.hashCode()) {
            case 82815:
                b8 = !str.equals("TAL") ? (byte) -1 : (byte) 6;
                break;
            case 82878:
                b8 = !str.equals("TCM") ? (byte) -1 : (byte) 16;
                break;
            case 82897:
                b8 = !str.equals("TDA") ? (byte) -1 : (byte) 12;
                break;
            case 83253:
                b8 = !str.equals("TP1") ? (byte) -1 : (byte) 2;
                break;
            case 83254:
                b8 = !str.equals("TP2") ? (byte) -1 : (byte) 4;
                break;
            case 83255:
                b8 = !str.equals("TP3") ? (byte) -1 : (byte) 18;
                break;
            case 83341:
                b8 = !str.equals("TRK") ? (byte) -1 : (byte) 8;
                break;
            case 83378:
                b8 = !str.equals("TT2") ? (byte) -1 : (byte) 0;
                break;
            case 83536:
                b8 = !str.equals("TXT") ? (byte) -1 : (byte) 20;
                break;
            case 83552:
                b8 = !str.equals("TYE") ? (byte) -1 : (byte) 10;
                break;
            case 2567331:
                b8 = !str.equals("TALB") ? (byte) -1 : (byte) 7;
                break;
            case 2569357:
                b8 = !str.equals("TCOM") ? (byte) -1 : (byte) 17;
                break;
            case 2569358:
                b8 = !str.equals("TCON") ? (byte) -1 : (byte) 22;
                break;
            case 2569891:
                b8 = !str.equals("TDAT") ? (byte) -1 : (byte) 13;
                break;
            case 2570401:
                b8 = !str.equals("TDRC") ? (byte) -1 : (byte) 14;
                break;
            case 2570410:
                b8 = !str.equals("TDRL") ? (byte) -1 : (byte) 15;
                break;
            case 2571565:
                b8 = !str.equals("TEXT") ? (byte) -1 : (byte) 21;
                break;
            case 2575251:
                b8 = !str.equals("TIT2") ? (byte) -1 : (byte) 1;
                break;
            case 2581512:
                b8 = !str.equals("TPE1") ? (byte) -1 : (byte) 3;
                break;
            case 2581513:
                b8 = !str.equals("TPE2") ? (byte) -1 : (byte) 5;
                break;
            case 2581514:
                b8 = !str.equals("TPE3") ? (byte) -1 : (byte) 19;
                break;
            case 2583398:
                b8 = !str.equals("TRCK") ? (byte) -1 : (byte) 9;
                break;
            case 2590194:
                b8 = !str.equals("TYER") ? (byte) -1 : (byte) 11;
                break;
            default:
                b8 = -1;
                break;
        }
        try {
            switch (b8) {
                case 0:
                case 1:
                    zzalVar.zza((CharSequence) this.zzb.get(0));
                    break;
                case 2:
                case 3:
                    zzalVar.zzb((CharSequence) this.zzb.get(0));
                    break;
                case 4:
                case 5:
                    zzalVar.zzd((CharSequence) this.zzb.get(0));
                    break;
                case 6:
                case 7:
                    zzalVar.zzc((CharSequence) this.zzb.get(0));
                    break;
                case 8:
                case 9:
                    String str2 = (String) this.zzb.get(0);
                    String str3 = zzeo.zza;
                    String[] strArrSplit = str2.split("/", -1);
                    int i = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    zzalVar.zzg(Integer.valueOf(i));
                    zzalVar.zzh(numValueOf);
                    break;
                case 10:
                case 11:
                    zzalVar.zzi(Integer.valueOf(Integer.parseInt((String) this.zzb.get(0))));
                    break;
                case 12:
                case 13:
                    String str4 = (String) this.zzb.get(0);
                    int i4 = Integer.parseInt(str4.substring(2, 4));
                    int i6 = Integer.parseInt(str4.substring(0, 2));
                    zzalVar.zzj(Integer.valueOf(i4));
                    zzalVar.zzk(Integer.valueOf(i6));
                    break;
                case 14:
                    List listZzb = zzb((String) this.zzb.get(0));
                    int size = listZzb.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                zzalVar.zzk((Integer) listZzb.get(2));
                            }
                        }
                        zzalVar.zzj((Integer) listZzb.get(1));
                    }
                    zzalVar.zzi((Integer) listZzb.get(0));
                    break;
                case 15:
                    List listZzb2 = zzb((String) this.zzb.get(0));
                    int size2 = listZzb2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                zzalVar.zzn((Integer) listZzb2.get(2));
                            }
                        }
                        zzalVar.zzm((Integer) listZzb2.get(1));
                    }
                    zzalVar.zzl((Integer) listZzb2.get(0));
                    break;
                case 16:
                case 17:
                    zzalVar.zzp((CharSequence) this.zzb.get(0));
                    break;
                case 18:
                case 19:
                    zzalVar.zzq((CharSequence) this.zzb.get(0));
                    break;
                case 20:
                case 21:
                    zzalVar.zzo((CharSequence) this.zzb.get(0));
                    break;
                case 22:
                    zzgjz zzgjzVar = this.zzb;
                    Integer numZzh = zzgne.zzh((String) zzgjzVar.get(0), 10);
                    if (numZzh != null) {
                        String strZza = zzagi.zza(numZzh.intValue());
                        if (strZza != null) {
                            zzalVar.zzt(strZza);
                        }
                    } else {
                        zzalVar.zzt((CharSequence) zzgjzVar.get(0));
                    }
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }
}
