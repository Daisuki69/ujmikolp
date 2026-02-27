package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import com.dynatrace.android.agent.Global;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class zzyd extends zzyj implements zzlm {
    public static final /* synthetic */ int zzb = 0;
    private static final zzglj zzc = zzglj.zzc(zzxj.zza);

    @Nullable
    public final Context zza;
    private final Object zzd;

    @GuardedBy("lock")
    private zzxo zze;

    @Nullable
    @GuardedBy("lock")
    private Thread zzf;

    @Nullable
    private zzxs zzg;
    private zzc zzh;
    private Boolean zzi;
    private final zzww zzj;

    public zzyd(Context context) {
        zzww zzwwVar = new zzww();
        zzxo zzxoVar = zzxo.zzJ;
        this.zzd = new Object();
        byte[] bArr = null;
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzj = zzwwVar;
        if (zzxoVar != null) {
            this.zze = zzxoVar;
        } else {
            zzxn zzxnVar = new zzxn(zzxoVar, bArr);
            zzxnVar.zzx((zzbk) zzxoVar);
            this.zze = new zzxo(zzxnVar, bArr);
        }
        this.zzh = zzc.zza;
        if (this.zze.zzU && context == null) {
            zzds.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    @Nullable
    public static String zzi(@Nullable String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, androidx.media3.common.C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return str;
    }

    public static int zzj(zzu zzuVar, @Nullable String str, boolean z4) {
        if (!TextUtils.isEmpty(str) && str.equals(zzuVar.zzd)) {
            return 4;
        }
        String strZzi = zzi(str);
        String strZzi2 = zzi(zzuVar.zzd);
        if (strZzi2 == null || strZzi == null) {
            return (z4 && strZzi2 == null) ? 1 : 0;
        }
        if (strZzi2.startsWith(strZzi) || strZzi.startsWith(strZzi2)) {
            return 3;
        }
        String str2 = zzeo.zza;
        return strZzi2.split(Global.HYPHEN, 2)[0].equals(strZzi.split(Global.HYPHEN, 2)[0]) ? 2 : 0;
    }

    public static /* synthetic */ int zzm(int i, int i4) {
        if (i == 0 || i != i4) {
            return Integer.bitCount(i & i4);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ int zzn(com.google.android.gms.internal.ads.zzu r5, com.google.android.gms.internal.ads.zzgjz r6) {
        /*
            r0 = 0
            r1 = r0
        L2:
            int r2 = r6.size()
            if (r1 >= r2) goto L2a
            r2 = r0
        L9:
            java.util.List r3 = r5.zzc
            int r4 = r3.size()
            if (r2 >= r4) goto L27
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.internal.ads.zzw r3 = (com.google.android.gms.internal.ads.zzw) r3
            java.lang.String r3 = r3.zzb
            java.lang.Object r4 = r6.get(r1)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L24
            return r1
        L24:
            int r2 = r2 + 1
            goto L9
        L27:
            int r1 = r1 + 1
            goto L2
        L2a:
            r5 = 2147483647(0x7fffffff, float:NaN)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyd.zzn(com.google.android.gms.internal.ads.zzu, com.google.android.gms.internal.ads.zzgjz):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzu, reason: merged with bridge method [inline-methods] */
    public final void zzl() {
        boolean z4;
        zzxs zzxsVar;
        synchronized (this.zzd) {
            try {
                z4 = false;
                if (this.zze.zzU && Build.VERSION.SDK_INT >= 32 && (zzxsVar = this.zzg) != null && zzxsVar.zza()) {
                    z4 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z4) {
            zzs();
        }
    }

    private static void zzv(zzwq zzwqVar, zzbk zzbkVar, Map map) {
        for (int i = 0; i < zzwqVar.zzb; i++) {
            if (((zzbg) zzbkVar.zzH.get(zzwqVar.zza(i))) != null) {
                throw null;
            }
        }
    }

    @Nullable
    private static final Pair zzw(int i, zzyi zzyiVar, int[][][] iArr, zzxu zzxuVar, Comparator comparator) {
        RandomAccess randomAccessZzj;
        zzyi zzyiVar2 = zzyiVar;
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (i4 < 2) {
            if (i == zzyiVar2.zza(i4)) {
                zzwq zzwqVarZzb = zzyiVar2.zzb(i4);
                for (int i6 = 0; i6 < zzwqVarZzb.zzb; i6++) {
                    zzbf zzbfVarZza = zzwqVarZzb.zza(i6);
                    List listZza = zzxuVar.zza(i4, zzbfVarZza, iArr[i4][i6]);
                    int i10 = zzbfVarZza.zza;
                    boolean[] zArr = new boolean[i10];
                    int i11 = 0;
                    while (i11 < i10) {
                        int i12 = i11 + 1;
                        zzxv zzxvVar = (zzxv) listZza.get(i11);
                        int iZza = zzxvVar.zza();
                        if (!zArr[i11] && iZza != 0) {
                            if (iZza == 1) {
                                randomAccessZzj = zzgjz.zzj(zzxvVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzxvVar);
                                for (int i13 = i12; i13 < i10; i13++) {
                                    zzxv zzxvVar2 = (zzxv) listZza.get(i13);
                                    if (zzxvVar2.zza() == 2 && zzxvVar.zzc(zzxvVar2)) {
                                        arrayList2.add(zzxvVar2);
                                        zArr[i13] = true;
                                    }
                                }
                                randomAccessZzj = arrayList2;
                            }
                            arrayList.add(randomAccessZzj);
                        }
                        i11 = i12;
                    }
                }
            }
            i4++;
            zzyiVar2 = zzyiVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i14 = 0; i14 < list.size(); i14++) {
            iArr2[i14] = ((zzxv) list.get(i14)).zzc;
        }
        zzxv zzxvVar3 = (zzxv) list.get(0);
        return Pair.create(new zzye(zzxvVar3.zzb, iArr2, 0), Integer.valueOf(zzxvVar3.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final void zza(zzll zzllVar) {
        synchronized (this.zzd) {
            boolean z4 = this.zze.zzY;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzym
    public final void zzb() {
        zzxs zzxsVar;
        synchronized (this.zzd) {
            try {
                Thread thread = this.zzf;
                if (thread != null) {
                    zzghc.zzi(thread == Thread.currentThread(), "DefaultTrackSelector is accessed on the wrong thread.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (zzxsVar = this.zzg) != null) {
            zzxsVar.zze();
            this.zzg = null;
        }
        super.zzb();
    }

    public final zzxo zzc() {
        zzxo zzxoVar;
        synchronized (this.zzd) {
            zzxoVar = this.zze;
        }
        return zzxoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzym
    public final boolean zzd() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzym
    public final void zze(zzc zzcVar) {
        if (this.zzh.equals(zzcVar)) {
            return;
        }
        this.zzh = zzcVar;
        zzl();
    }

    public final void zzf(zzxn zzxnVar) {
        boolean zEquals;
        zzxo zzxoVar = new zzxo(zzxnVar, null);
        synchronized (this.zzd) {
            zEquals = this.zze.equals(zzxoVar);
            this.zze = zzxoVar;
        }
        if (zEquals) {
            return;
        }
        if (zzxoVar.zzU && this.zza == null) {
            zzds.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzym
    @Nullable
    public final zzlm zzg() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzyj
    public final Pair zzh(zzyi zzyiVar, int[][][] iArr, final int[] iArr2, zzup zzupVar, zzbe zzbeVar) throws zzhz {
        final zzxo zzxoVar;
        final boolean z4;
        final String str;
        final String languageTag;
        int i;
        Context context;
        CaptioningManager captioningManager;
        Locale locale;
        Context context2;
        Context context3;
        int i4 = 1;
        synchronized (this.zzd) {
            this.zzf = Thread.currentThread();
            zzxoVar = this.zze;
        }
        if (this.zzi == null && (context3 = this.zza) != null) {
            this.zzi = Boolean.valueOf(zzeo.zzN(context3));
        }
        if (zzxoVar.zzU && Build.VERSION.SDK_INT >= 32 && this.zzg == null) {
            this.zzg = new zzxs(this.zza, this, this.zzi);
        }
        int i6 = 2;
        zzye[] zzyeVarArr = new zzye[2];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= 2) {
                z4 = false;
                break;
            }
            if (zzyiVar.zza(i11) == 2 && zzyiVar.zzb(i11).zzb > 0) {
                z4 = true;
                break;
            }
            i11++;
        }
        Pair pairZzw = zzw(1, zzyiVar, iArr, new zzxu() { // from class: com.google.android.gms.internal.ads.zzxf
            @Override // com.google.android.gms.internal.ads.zzxu
            public final /* synthetic */ List zza(int i12, zzbf zzbfVar, int[] iArr3) {
                final zzyd zzydVar = this.zza;
                final zzxo zzxoVar2 = zzxoVar;
                zzghd zzghdVar = new zzghd() { // from class: com.google.android.gms.internal.ads.zzxi
                    @Override // com.google.android.gms.internal.ads.zzghd
                    public final /* synthetic */ boolean zza(Object obj) {
                        return zzydVar.zzk(zzxoVar2, (zzu) obj);
                    }
                };
                int i13 = iArr2[i12];
                int i14 = zzgjz.zzd;
                zzgjw zzgjwVar = new zzgjw();
                for (int i15 = 0; i15 < zzbfVar.zza; i15++) {
                    zzgjwVar.zzf(new zzxa(i12, zzbfVar, i15, zzxoVar2, iArr3[i15], z4, zzghdVar, i13));
                }
                return zzgjwVar.zzi();
            }
        }, zzxb.zza);
        if (pairZzw != null) {
            zzyeVarArr[((Integer) pairZzw.second).intValue()] = (zzye) pairZzw.first;
        }
        if (pairZzw == null) {
            str = null;
        } else {
            Object obj = pairZzw.first;
            str = ((zzye) obj).zza.zza(((zzye) obj).zzb[0]).zzd;
        }
        int i12 = zzxoVar.zzw.zzb;
        final Point pointZzP = (!zzxoVar.zzk || (context2 = this.zza) == null) ? null : zzeo.zzP(context2);
        Pair pairZzw2 = zzw(2, zzyiVar, iArr, new zzxu() { // from class: com.google.android.gms.internal.ads.zzxk
            /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
            @Override // com.google.android.gms.internal.ads.zzxu
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* synthetic */ java.util.List zza(int r19, com.google.android.gms.internal.ads.zzbf r20, int[] r21) {
                /*
                    Method dump skipped, instruction units count: 221
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxk.zza(int, com.google.android.gms.internal.ads.zzbf, int[]):java.util.List");
            }
        }, zzxe.zza);
        int i13 = 4;
        Pair pairZzw3 = pairZzw2 == null ? zzw(4, zzyiVar, iArr, new zzxu() { // from class: com.google.android.gms.internal.ads.zzxh
            @Override // com.google.android.gms.internal.ads.zzxu
            public final /* synthetic */ List zza(int i14, zzbf zzbfVar, int[] iArr3) {
                int i15 = zzyd.zzb;
                int i16 = zzgjz.zzd;
                zzgjw zzgjwVar = new zzgjw();
                for (int i17 = 0; i17 < zzbfVar.zza; i17++) {
                    zzgjwVar.zzf(new zzxl(i14, zzbfVar, i17, zzxoVar, iArr3[i17]));
                }
                return zzgjwVar.zzi();
            }
        }, zzxc.zza) : null;
        if (pairZzw3 != null) {
            zzyeVarArr[((Integer) pairZzw3.second).intValue()] = (zzye) pairZzw3.first;
        } else if (pairZzw2 != null) {
            zzyeVarArr[((Integer) pairZzw2.second).intValue()] = (zzye) pairZzw2.first;
        }
        if (!zzxoVar.zzB || (context = this.zza) == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            languageTag = null;
        } else {
            String str2 = zzeo.zza;
            languageTag = locale.toLanguageTag();
        }
        int i14 = 3;
        Pair pairZzw4 = zzw(3, zzyiVar, iArr, new zzxu() { // from class: com.google.android.gms.internal.ads.zzxg
            @Override // com.google.android.gms.internal.ads.zzxu
            public final /* synthetic */ List zza(int i15, zzbf zzbfVar, int[] iArr3) {
                int i16 = zzyd.zzb;
                int i17 = zzgjz.zzd;
                zzgjw zzgjwVar = new zzgjw();
                for (int i18 = 0; i18 < zzbfVar.zza; i18++) {
                    zzgjwVar.zzf(new zzxt(i15, zzbfVar, i18, zzxoVar, iArr3[i18], str, languageTag));
                }
                return zzgjwVar.zzi();
            }
        }, zzxd.zza);
        if (pairZzw4 != null) {
            zzyeVarArr[((Integer) pairZzw4.second).intValue()] = (zzye) pairZzw4.first;
        }
        int i15 = 0;
        while (i15 < i6) {
            int iZza = zzyiVar.zza(i15);
            if (iZza == i6 || iZza == i4 || iZza == i14 || iZza == i13) {
                i = i4;
            } else {
                zzwq zzwqVarZzb = zzyiVar.zzb(i15);
                int[][] iArr3 = iArr[i15];
                int i16 = i10;
                int i17 = i16;
                zzbf zzbfVar = null;
                zzxm zzxmVar = null;
                while (i16 < zzwqVarZzb.zzb) {
                    zzbf zzbfVarZza = zzwqVarZzb.zza(i16);
                    int[] iArr4 = iArr3[i16];
                    zzxm zzxmVar2 = zzxmVar;
                    int i18 = i4;
                    for (int i19 = i10; i19 < zzbfVarZza.zza; i19++) {
                        if (G.c(iArr4[i19], zzxoVar.zzV)) {
                            zzxm zzxmVar3 = new zzxm(zzbfVarZza.zza(i19), iArr4[i19]);
                            if (zzxmVar2 == null || zzxmVar3.compareTo(zzxmVar2) > 0) {
                                zzxmVar2 = zzxmVar3;
                                zzbfVar = zzbfVarZza;
                                i17 = i19;
                            }
                        }
                    }
                    i16++;
                    i4 = i18;
                    i10 = 0;
                    zzxmVar = zzxmVar2;
                }
                i = i4;
                zzyeVarArr[i15] = zzbfVar == null ? null : new zzye(zzbfVar, new int[]{i17}, 0);
            }
            i15++;
            i4 = i;
            i6 = 2;
            i10 = 0;
            i14 = 3;
            i13 = 4;
        }
        int i20 = i4;
        HashMap map = new HashMap();
        int i21 = 2;
        for (int i22 = 0; i22 < 2; i22++) {
            zzv(zzyiVar.zzb(i22), zzxoVar, map);
        }
        zzv(zzyiVar.zze(), zzxoVar, map);
        for (int i23 = 0; i23 < 2; i23++) {
            if (((zzbg) map.get(Integer.valueOf(zzyiVar.zza(i23)))) != null) {
                throw null;
            }
        }
        int i24 = 0;
        while (i24 < i21) {
            zzwq zzwqVarZzb2 = zzyiVar.zzb(i24);
            if (zzxoVar.zzb(i24, zzwqVarZzb2)) {
                if (zzxoVar.zzc(i24, zzwqVarZzb2) != null) {
                    throw null;
                }
                zzyeVarArr[i24] = null;
            }
            i24++;
            i21 = 2;
        }
        int i25 = 0;
        while (i25 < i21) {
            int iZza2 = zzyiVar.zza(i25);
            if (zzxoVar.zza(i25) || zzxoVar.zzI.contains(Integer.valueOf(iZza2))) {
                zzyeVarArr[i25] = null;
            }
            i25++;
            i21 = 2;
        }
        zzww zzwwVar = this.zzj;
        zzyu zzyuVarZzt = zzt();
        zzgjz zzgjzVarZzd = zzwx.zzd(zzyeVarArr);
        int i26 = 2;
        zzyf[] zzyfVarArr = new zzyf[2];
        int i27 = 0;
        while (i27 < i26) {
            zzye zzyeVar = zzyeVarArr[i27];
            if (zzyeVar != null) {
                int[] iArr5 = zzyeVar.zzb;
                int length = iArr5.length;
                if (length != 0) {
                    zzyfVarArr[i27] = length == i20 ? new zzyg(zzyeVar.zza, iArr5[0], 0, 0, null) : zzwwVar.zza(zzyeVar.zza, iArr5, 0, zzyuVarZzt, (zzgjz) zzgjzVarZzd.get(i27));
                } else {
                    i27++;
                    i26 = 2;
                    i20 = 1;
                }
            }
            i27++;
            i26 = 2;
            i20 = 1;
        }
        zzlo[] zzloVarArr = new zzlo[i26];
        for (int i28 = 0; i28 < i26; i28++) {
            zzloVarArr[i28] = (zzxoVar.zza(i28) || zzxoVar.zzI.contains(Integer.valueOf(zzyiVar.zza(i28))) || (zzyiVar.zza(i28) != -2 && zzyfVarArr[i28] == null)) ? null : zzlo.zza;
        }
        return Pair.create(zzloVarArr, zzyfVarArr);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final /* synthetic */ boolean zzk(zzxo zzxoVar, zzu zzuVar) {
        Boolean bool;
        zzxs zzxsVar;
        zzxs zzxsVar2;
        if (!zzxoVar.zzU || ((bool = this.zzi) != null && bool.booleanValue())) {
            return true;
        }
        int i = zzuVar.zzG;
        byte b8 = -1;
        if (i != -1 && i > 2) {
            String str = zzuVar.zzo;
            if (str != null) {
                switch (str.hashCode()) {
                    case -2123537834:
                        if (str.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                            b8 = 2;
                        }
                        break;
                    case 187078296:
                        if (str.equals(MimeTypes.AUDIO_AC3)) {
                            b8 = 0;
                        }
                        break;
                    case 187078297:
                        if (str.equals(MimeTypes.AUDIO_AC4)) {
                            b8 = 3;
                        }
                        break;
                    case 1504578661:
                        if (str.equals(MimeTypes.AUDIO_E_AC3)) {
                            b8 = 1;
                        }
                        break;
                }
                if ((b8 == 0 || b8 == 1 || b8 == 2 || b8 == 3) && (Build.VERSION.SDK_INT < 32 || (zzxsVar2 = this.zzg) == null || !zzxsVar2.zza())) {
                    return true;
                }
            }
            return Build.VERSION.SDK_INT >= 32 && (zzxsVar = this.zzg) != null && zzxsVar.zza() && zzxsVar.zzb() && this.zzg.zzc() && this.zzg.zzd(this.zzh, zzuVar);
        }
        return true;
    }
}
