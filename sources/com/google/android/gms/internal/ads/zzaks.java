package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.dynatrace.android.agent.Global;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
final class zzaks {

    @Nullable
    public final String zza;

    @Nullable
    public final String zzb;
    public final boolean zzc;
    public final long zzd;
    public final long zze;

    @Nullable
    public final zzaky zzf;
    public final String zzg;

    @Nullable
    public final String zzh;

    @Nullable
    public final zzaks zzi;

    @Nullable
    private final String[] zzj;
    private final HashMap zzk;
    private final HashMap zzl;
    private List zzm;

    private zzaks(@Nullable String str, @Nullable String str2, long j, long j6, @Nullable zzaky zzakyVar, @Nullable String[] strArr, String str3, @Nullable String str4, @Nullable zzaks zzaksVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzh = str4;
        this.zzf = zzakyVar;
        this.zzj = strArr;
        this.zzc = str2 != null;
        this.zzd = j;
        this.zze = j6;
        str3.getClass();
        this.zzg = str3;
        this.zzi = zzaksVar;
        this.zzk = new HashMap();
        this.zzl = new HashMap();
    }

    public static zzaks zza(String str) {
        return new zzaks(null, str.replaceAll("\r\n", Global.NEWLINE).replaceAll(" *\n *", Global.NEWLINE).replaceAll(Global.NEWLINE, Global.BLANK).replaceAll("[ \t\\x0B\f\r]+", Global.BLANK), androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, null, null, "", null, null);
    }

    public static zzaks zzb(@Nullable String str, long j, long j6, @Nullable zzaky zzakyVar, @Nullable String[] strArr, String str2, @Nullable String str3, @Nullable zzaks zzaksVar) {
        return new zzaks(str, null, j, j6, zzakyVar, strArr, str2, str3, zzaksVar);
    }

    private final void zzi(TreeSet treeSet, boolean z4) {
        String str = this.zza;
        boolean zEquals = TtmlNode.TAG_P.equals(str);
        boolean zEquals2 = TtmlNode.TAG_DIV.equals(str);
        if (z4 || zEquals || (zEquals2 && this.zzh != null)) {
            long j = this.zzd;
            if (j != androidx.media3.common.C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j));
            }
            long j6 = this.zze;
            if (j6 != androidx.media3.common.C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j6));
            }
        }
        if (this.zzm != null) {
            for (int i = 0; i < this.zzm.size(); i++) {
                zzaks zzaksVar = (zzaks) this.zzm.get(i);
                boolean z5 = true;
                if (!z4 && !zEquals) {
                    z5 = false;
                }
                zzaksVar.zzi(treeSet, z5);
            }
        }
    }

    private final void zzj(long j, String str, List list) {
        String str2;
        String str3 = this.zzg;
        if (true != "".equals(str3)) {
            str = str3;
        }
        if (zzc(j) && TtmlNode.TAG_DIV.equals(this.zza) && (str2 = this.zzh) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < zzf(); i++) {
            zze(i).zzj(j, str, list);
        }
    }

    private final void zzk(long j, boolean z4, String str, Map map) {
        long j6;
        boolean z5;
        HashMap map2 = this.zzk;
        map2.clear();
        HashMap map3 = this.zzl;
        map3.clear();
        String str2 = this.zza;
        if (TtmlNode.TAG_METADATA.equals(str2)) {
            return;
        }
        String str3 = this.zzg;
        String str4 = true != "".equals(str3) ? str3 : str;
        if (this.zzc && z4) {
            SpannableStringBuilder spannableStringBuilderZzl = zzl(str4, map);
            String str5 = this.zzb;
            str5.getClass();
            spannableStringBuilderZzl.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z4) {
            zzl(str4, map).append('\n');
            return;
        }
        if (zzc(j)) {
            for (Map.Entry entry : map.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequenceZzb = ((zzck) entry.getValue()).zzb();
                charSequenceZzb.getClass();
                map2.put(str6, Integer.valueOf(charSequenceZzb.length()));
            }
            boolean zEquals = TtmlNode.TAG_P.equals(str2);
            for (int i = 0; i < zzf(); i++) {
                zzaks zzaksVarZze = zze(i);
                if (z4 || zEquals) {
                    j6 = j;
                    z5 = true;
                } else {
                    j6 = j;
                    z5 = false;
                }
                zzaksVarZze.zzk(j6, z5, str4, map);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderZzl2 = zzl(str4, map);
                int length = spannableStringBuilderZzl2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (spannableStringBuilderZzl2.charAt(length) == ' ');
                if (length >= 0 && spannableStringBuilderZzl2.charAt(length) != '\n') {
                    spannableStringBuilderZzl2.append('\n');
                }
            }
            for (Map.Entry entry2 : map.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequenceZzb2 = ((zzck) entry2.getValue()).zzb();
                charSequenceZzb2.getClass();
                map3.put(str7, Integer.valueOf(charSequenceZzb2.length()));
            }
        }
    }

    private static SpannableStringBuilder zzl(String str, Map map) {
        if (!map.containsKey(str)) {
            zzck zzckVar = new zzck();
            zzckVar.zza(new SpannableStringBuilder());
            map.put(str, zzckVar);
        }
        CharSequence charSequenceZzb = ((zzck) map.get(str)).zzb();
        charSequenceZzb.getClass();
        return (SpannableStringBuilder) charSequenceZzb;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzm(long r20, java.util.Map r22, java.util.Map r23, java.lang.String r24, java.util.Map r25) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaks.zzm(long, java.util.Map, java.util.Map, java.lang.String, java.util.Map):void");
    }

    public final boolean zzc(long j) {
        long j6 = this.zzd;
        if (j6 == androidx.media3.common.C.TIME_UNSET) {
            if (this.zze == androidx.media3.common.C.TIME_UNSET) {
                return true;
            }
            j6 = -9223372036854775807L;
        }
        if (j6 <= j && this.zze == androidx.media3.common.C.TIME_UNSET) {
            return true;
        }
        if (j6 != androidx.media3.common.C.TIME_UNSET || j >= this.zze) {
            return j6 <= j && j < this.zze;
        }
        return true;
    }

    public final void zzd(zzaks zzaksVar) {
        if (this.zzm == null) {
            this.zzm = new ArrayList();
        }
        this.zzm.add(zzaksVar);
    }

    public final zzaks zze(int i) {
        List list = this.zzm;
        if (list != null) {
            return (zzaks) list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int zzf() {
        List list = this.zzm;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final long[] zzg() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        zzi(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public final List zzh(long j, Map map, Map map2, Map map3) {
        ArrayList arrayList = new ArrayList();
        String str = this.zzg;
        zzj(j, str, arrayList);
        TreeMap treeMap = new TreeMap();
        zzk(j, false, str, treeMap);
        zzm(j, map, map2, str, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str2 = (String) map3.get(pair.second);
            if (str2 != null) {
                byte[] bArrDecode = Base64.decode(str2, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                zzakw zzakwVar = (zzakw) map2.get(pair.first);
                zzakwVar.getClass();
                zzck zzckVar = new zzck();
                zzckVar.zzc(bitmapDecodeByteArray);
                zzckVar.zzi(zzakwVar.zzb);
                zzckVar.zzj(0);
                zzckVar.zzf(zzakwVar.zzc, 0);
                zzckVar.zzg(zzakwVar.zze);
                zzckVar.zzm(zzakwVar.zzf);
                zzckVar.zzn(zzakwVar.zzg);
                zzckVar.zzo(zzakwVar.zzj);
                arrayList2.add(zzckVar.zzr());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            zzakw zzakwVar2 = (zzakw) map2.get(entry.getKey());
            zzakwVar2.getClass();
            zzck zzckVar2 = (zzck) entry.getValue();
            CharSequence charSequenceZzb = zzckVar2.zzb();
            charSequenceZzb.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequenceZzb;
            for (zzakq zzakqVar : (zzakq[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zzakq.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(zzakqVar), spannableStringBuilder.getSpanEnd(zzakqVar), (CharSequence) "");
            }
            int i4 = 0;
            while (i4 < spannableStringBuilder.length()) {
                int i6 = i4 + 1;
                if (spannableStringBuilder.charAt(i4) == ' ') {
                    int i10 = i6;
                    while (i10 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i10) == ' ') {
                        i10++;
                    }
                    int i11 = i10 - i6;
                    if (i11 > 0) {
                        spannableStringBuilder.delete(i4, i11 + i4);
                    }
                }
                i4 = i6;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i12 = 0;
            while (i12 < spannableStringBuilder.length() - 1) {
                int i13 = i12 + 1;
                if (spannableStringBuilder.charAt(i12) == '\n' && spannableStringBuilder.charAt(i13) == ' ') {
                    spannableStringBuilder.delete(i13, i12 + 2);
                }
                i12 = i13;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i14 = 0;
            while (i14 < spannableStringBuilder.length() - 1) {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i14) == ' ' && spannableStringBuilder.charAt(i15) == '\n') {
                    spannableStringBuilder.delete(i14, i15);
                }
                i14 = i15;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            zzckVar2.zzf(zzakwVar2.zzc, zzakwVar2.zzd);
            zzckVar2.zzg(zzakwVar2.zze);
            zzckVar2.zzi(zzakwVar2.zzb);
            zzckVar2.zzm(zzakwVar2.zzf);
            zzckVar2.zzl(zzakwVar2.zzi, zzakwVar2.zzh);
            zzckVar2.zzo(zzakwVar2.zzj);
            arrayList2.add(zzckVar2.zzr());
        }
        return arrayList2;
    }
}
