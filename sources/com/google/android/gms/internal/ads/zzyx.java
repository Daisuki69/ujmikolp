package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzyx implements zzyu, zzgy {
    public static final zzgjz zza = zzgjz.zzm(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final zzgjz zzb = zzgjz.zzm(1500000L, 980000L, 750000L, 520000L, 290000L);
    public static final zzgjz zzc;
    public static final zzgjz zzd;
    public static final zzgjz zze;
    public static final zzgjz zzf;

    @Nullable
    @SuppressLint({"NonFinalStaticField", "StaticFieldLeak"})
    private static zzyx zzg;

    @Nullable
    private final Context zzh;
    private final zzgkc zzi;
    private final zzys zzj;

    @GuardedBy("this")
    private final zzzl zzk;

    @GuardedBy("this")
    private int zzl;

    @GuardedBy("this")
    private long zzm;

    @GuardedBy("this")
    private long zzn;

    @GuardedBy("this")
    private long zzo;

    @GuardedBy("this")
    private long zzp;

    @GuardedBy("this")
    private long zzq;

    @GuardedBy("this")
    private long zzr;
    private int zzs;
    private String zzt;

    static {
        Long lValueOf = Long.valueOf(SilenceSkippingAudioProcessor.DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US);
        zzc = zzgjz.zzm(lValueOf, 1300000L, 1000000L, 860000L, 610000L);
        zzd = zzgjz.zzm(2500000L, 1700000L, 1200000L, 970000L, 680000L);
        zze = zzgjz.zzm(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
        zzf = zzgjz.zzm(2700000L, lValueOf, 1600000L, 1300000L, 1000000L);
    }

    public /* synthetic */ zzyx(Context context, Map map, int i, zzdb zzdbVar, boolean z4, byte[] bArr) {
        this.zzh = context == null ? null : context.getApplicationContext();
        this.zzi = zzgkc.zzc(map);
        this.zzj = new zzys();
        this.zzk = new zzzl(2000);
        if (context == null) {
            this.zzs = 0;
            this.zzq = 1000000L;
            return;
        }
        zzed zzedVarZza = zzed.zza(context);
        int iZzc = zzedVarZza.zzc();
        this.zzs = iZzc;
        this.zzq = zzl(iZzc);
        zzedVarZza.zzb(new zzdx() { // from class: com.google.android.gms.internal.ads.zzyw
            @Override // com.google.android.gms.internal.ads.zzdx
            public final /* synthetic */ void zza(int i4) throws Throwable {
                this.zza.zzi(i4);
            }
        }, zzcv.zza());
    }

    public static synchronized zzyx zzh(Context context) {
        try {
            if (zzg == null) {
                Context applicationContext = context == null ? null : context.getApplicationContext();
                zzdb zzdbVar = zzdb.zza;
                HashMap map = new HashMap(8);
                map.put(0, 1000000L);
                Long lValueOf = Long.valueOf(androidx.media3.common.C.TIME_UNSET);
                map.put(2, lValueOf);
                map.put(3, lValueOf);
                map.put(4, lValueOf);
                map.put(5, lValueOf);
                map.put(10, lValueOf);
                map.put(9, lValueOf);
                map.put(7, lValueOf);
                zzg = new zzyx(applicationContext, map, 2000, zzdbVar, true, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zzg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0012 A[Catch: all -> 0x0082, TRY_ENTER, TryCatch #0 {all -> 0x0082, blocks: (B:3:0x0001, B:11:0x0012, B:17:0x001e, B:28:0x004f, B:34:0x0066), top: B:47:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0041 A[Catch: all -> 0x000d, TryCatch #1 {all -> 0x000d, blocks: (B:5:0x0005, B:19:0x0022, B:21:0x0028, B:23:0x0032, B:25:0x003c, B:27:0x004d, B:26:0x0041, B:30:0x005d), top: B:49:0x0005 }] */
    /* JADX INFO: renamed from: zzj, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzi(int r9) throws java.lang.Throwable {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.zzs     // Catch: java.lang.Throwable -> L82
            if (r0 != r9) goto L12
            java.lang.String r0 = r8.zzt     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto La
            goto L12
        La:
            r2 = r8
            goto L85
        Ld:
            r0 = move-exception
            r9 = r0
            r2 = r8
            goto L87
        L12:
            r8.zzs = r9     // Catch: java.lang.Throwable -> L82
            r0 = 1
            if (r9 == r0) goto La
            if (r9 == 0) goto La
            r0 = 8
            if (r9 != r0) goto L1e
            goto La
        L1e:
            java.lang.String r0 = r8.zzt     // Catch: java.lang.Throwable -> L82
            if (r0 != 0) goto L4f
            android.content.Context r0 = r8.zzh     // Catch: java.lang.Throwable -> Ld
            java.lang.String r1 = com.google.android.gms.internal.ads.zzeo.zza     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto L41
            java.lang.String r1 = "phone"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> Ld
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto L41
            java.lang.String r0 = r0.getNetworkCountryIso()     // Catch: java.lang.Throwable -> Ld
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Ld
            if (r1 != 0) goto L41
            java.lang.String r0 = com.google.android.gms.internal.ads.zzggj.zzb(r0)     // Catch: java.lang.Throwable -> Ld
            goto L4d
        L41:
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = r0.getCountry()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = com.google.android.gms.internal.ads.zzggj.zzb(r0)     // Catch: java.lang.Throwable -> Ld
        L4d:
            r8.zzt = r0     // Catch: java.lang.Throwable -> Ld
        L4f:
            long r0 = r8.zzl(r9)     // Catch: java.lang.Throwable -> L82
            r8.zzq = r0     // Catch: java.lang.Throwable -> L82
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L82
            int r9 = r8.zzl     // Catch: java.lang.Throwable -> L82
            if (r9 <= 0) goto L64
            long r2 = r8.zzm     // Catch: java.lang.Throwable -> Ld
            long r2 = r0 - r2
            int r9 = (int) r2
        L62:
            r3 = r9
            goto L66
        L64:
            r9 = 0
            goto L62
        L66:
            long r4 = r8.zzn     // Catch: java.lang.Throwable -> L82
            long r6 = r8.zzq     // Catch: java.lang.Throwable -> L82
            r2 = r8
            r2.zzk(r3, r4, r6)     // Catch: java.lang.Throwable -> L7f
            r2.zzm = r0     // Catch: java.lang.Throwable -> L7f
            r0 = 0
            r2.zzn = r0     // Catch: java.lang.Throwable -> L7f
            r2.zzp = r0     // Catch: java.lang.Throwable -> L7f
            r2.zzo = r0     // Catch: java.lang.Throwable -> L7f
            com.google.android.gms.internal.ads.zzzl r9 = r2.zzk     // Catch: java.lang.Throwable -> L7f
            r9.zza()     // Catch: java.lang.Throwable -> L7f
            monitor-exit(r8)
            return
        L7f:
            r0 = move-exception
        L80:
            r9 = r0
            goto L87
        L82:
            r0 = move-exception
            r2 = r8
            goto L80
        L85:
            monitor-exit(r8)
            return
        L87:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L7f
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyx.zzi(int):void");
    }

    @GuardedBy("this")
    private final void zzk(int i, long j, long j6) {
        int i4;
        long j7;
        if (i == 0) {
            if (j != 0) {
                j7 = j;
            } else if (j6 == this.zzr) {
                return;
            } else {
                j7 = 0;
            }
            i4 = 0;
        } else {
            i4 = i;
            j7 = j;
        }
        this.zzr = j6;
        this.zzj.zzc(i4, j7, j6);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long zzl(int r10) {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.zzgkc r0 = r9.zzi
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            java.lang.Object r1 = r0.get(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            r2 = 1000000(0xf4240, double:4.940656E-318)
            r4 = 0
            if (r1 != 0) goto L1f
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            java.lang.Object r10 = r0.get(r10)
            r1 = r10
            java.lang.Long r1 = (java.lang.Long) r1
            goto Lad
        L1f:
            long r5 = r1.longValue()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto Lad
            java.lang.String r0 = r9.zzt
            java.lang.String r0 = com.google.android.gms.internal.ads.zzghs.zza(r0)
            int[] r0 = zzn(r0)
            r1 = 2
            if (r10 == r1) goto L9b
            r5 = 3
            if (r10 == r5) goto L8b
            r6 = 4
            if (r10 == r6) goto L7c
            r1 = 5
            if (r10 == r1) goto L6d
            r5 = 7
            if (r10 == r5) goto L9b
            r4 = 9
            if (r10 == r4) goto L5e
            r1 = 10
            if (r10 == r1) goto L4f
            r0 = r2
            goto La9
        L4f:
            com.google.android.gms.internal.ads.zzgjz r10 = com.google.android.gms.internal.ads.zzyx.zze
            r0 = r0[r6]
            java.lang.Object r10 = r10.get(r0)
            java.lang.Long r10 = (java.lang.Long) r10
            long r0 = r10.longValue()
            goto La9
        L5e:
            com.google.android.gms.internal.ads.zzgjz r10 = com.google.android.gms.internal.ads.zzyx.zzf
            r0 = r0[r1]
            java.lang.Object r10 = r10.get(r0)
            java.lang.Long r10 = (java.lang.Long) r10
            long r0 = r10.longValue()
            goto La9
        L6d:
            com.google.android.gms.internal.ads.zzgjz r10 = com.google.android.gms.internal.ads.zzyx.zzd
            r0 = r0[r5]
            java.lang.Object r10 = r10.get(r0)
            java.lang.Long r10 = (java.lang.Long) r10
            long r0 = r10.longValue()
            goto La9
        L7c:
            com.google.android.gms.internal.ads.zzgjz r10 = com.google.android.gms.internal.ads.zzyx.zzc
            r0 = r0[r1]
            java.lang.Object r10 = r10.get(r0)
            java.lang.Long r10 = (java.lang.Long) r10
            long r0 = r10.longValue()
            goto La9
        L8b:
            com.google.android.gms.internal.ads.zzgjz r10 = com.google.android.gms.internal.ads.zzyx.zzb
            r1 = 1
            r0 = r0[r1]
            java.lang.Object r10 = r10.get(r0)
            java.lang.Long r10 = (java.lang.Long) r10
            long r0 = r10.longValue()
            goto La9
        L9b:
            com.google.android.gms.internal.ads.zzgjz r10 = com.google.android.gms.internal.ads.zzyx.zza
            r0 = r0[r4]
            java.lang.Object r10 = r10.get(r0)
            java.lang.Long r10 = (java.lang.Long) r10
            long r0 = r10.longValue()
        La9:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        Lad:
            if (r1 != 0) goto Lb3
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
        Lb3:
            long r0 = r1.longValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyx.zzl(int):long");
    }

    private static boolean zzm(zzge zzgeVar, boolean z4) {
        return z4 && !zzgeVar.zza(8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0145, code lost:
    
        if (r3.equals("YE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x015d, code lost:
    
        if (r3.equals("WS") != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0167, code lost:
    
        if (r3.equals("WF") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0171, code lost:
    
        if (r3.equals("VU") != false) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01a5, code lost:
    
        if (r3.equals("VE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01af, code lost:
    
        if (r3.equals("VC") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01b9, code lost:
    
        if (r3.equals("VA") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01fb, code lost:
    
        if (r3.equals("UA") != false) goto L815;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0221, code lost:
    
        if (r3.equals("TV") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0239, code lost:
    
        if (r3.equals(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f16194z) != false) goto L889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x025f, code lost:
    
        if (r3.equals("TM") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0269, code lost:
    
        if (r3.equals("TL") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0273, code lost:
    
        if (r3.equals("TJ") != false) goto L744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x027d, code lost:
    
        if (r3.equals(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f16153A) != false) goto L804;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0295, code lost:
    
        if (r3.equals(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f16154B) != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x02ad, code lost:
    
        if (r3.equals("SZ") != false) goto L866;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x02b7, code lost:
    
        if (r3.equals("SY") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x02c1, code lost:
    
        if (r3.equals("SX") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x02e7, code lost:
    
        if (r3.equals("SS") != false) goto L656;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x031b, code lost:
    
        if (r3.equals("SM") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0325, code lost:
    
        if (r3.equals("SL") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x033d, code lost:
    
        if (r3.equals("SJ") != false) goto L708;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0347, code lost:
    
        if (r3.equals("SI") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0351, code lost:
    
        if (r3.equals("SH") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0369, code lost:
    
        if (r3.equals("SE") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0373, code lost:
    
        if (r3.equals("SD") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x037d, code lost:
    
        if (r3.equals("SC") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        if (r3.equals("CI") != false) goto L862;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0387, code lost:
    
        if (r3.equals("SB") != false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x038e, code lost:
    
        return new int[]{4, 2, 4, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x03f7, code lost:
    
        if (r3.equals("PY") != false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x040f, code lost:
    
        if (r3.equals("PT") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0435, code lost:
    
        if (r3.equals("PM") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0469, code lost:
    
        if (r3.equals(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_PG) != false) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
    
        if (r3.equals("CG") != false) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x048f, code lost:
    
        if (r3.equals("PA") != false) goto L901;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x04b5, code lost:
    
        if (r3.equals("NU") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x04bf, code lost:
    
        if (r3.equals("NR") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x04f3, code lost:
    
        if (r3.equals("NI") != false) goto L788;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x050b, code lost:
    
        if (r3.equals("NF") != false) goto L708;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0515, code lost:
    
        if (r3.equals("NE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x051f, code lost:
    
        if (r3.equals("NC") != false) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0526, code lost:
    
        return new int[]{2, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x053b, code lost:
    
        if (r3.equals("MZ") != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0542, code lost:
    
        return new int[]{3, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x058f, code lost:
    
        if (r3.equals("MT") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0599, code lost:
    
        if (r3.equals("MS") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x05a3, code lost:
    
        if (r3.equals("MR") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x05bb, code lost:
    
        if (r3.equals("MP") != false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x05c2, code lost:
    
        return new int[]{1, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x05e5, code lost:
    
        if (r3.equals("MM") != false) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x05ef, code lost:
    
        if (r3.equals("ML") != false) goto L811;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0607, code lost:
    
        if (r3.equals("MH") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x060e, code lost:
    
        return new int[]{4, 2, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x0615, code lost:
    
        if (r3.equals("MG") != false) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0649, code lost:
    
        if (r3.equals("MC") != false) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0661, code lost:
    
        if (r3.equals("LY") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x066b, code lost:
    
        if (r3.equals("LV") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0691, code lost:
    
        if (r3.equals("LS") != false) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0698, code lost:
    
        return new int[]{4, 3, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x069f, code lost:
    
        if (r3.equals("LR") != false) goto L748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x06a9, code lost:
    
        if (r3.equals("LK") != false) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x06b0, code lost:
    
        return new int[]{3, 2, 3, 3, 4, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x06b7, code lost:
    
        if (r3.equals(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f16190v) != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x06f9, code lost:
    
        if (r3.equals("KY") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0703, code lost:
    
        if (r3.equals("KW") != false) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0099, code lost:
    
        if (r3.equals("BQ") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x071b, code lost:
    
        if (r3.equals("KN") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0725, code lost:
    
        if (r3.equals("KM") != false) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x072c, code lost:
    
        return new int[]{4, 3, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0733, code lost:
    
        if (r3.equals("KI") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0775, code lost:
    
        if (r3.equals("JO") != false) goto L889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x078d, code lost:
    
        if (r3.equals("JE") != false) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x07a5, code lost:
    
        if (r3.equals("IS") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x07e7, code lost:
    
        if (r3.equals("IM") != false) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x081b, code lost:
    
        if (r3.equals("HU") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x0825, code lost:
    
        if (r3.equals("HT") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x082f, code lost:
    
        if (r3.equals("HR") != false) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x0836, code lost:
    
        return new int[]{1, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x0891, code lost:
    
        if (r3.equals("GQ") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x08b7, code lost:
    
        if (r3.equals("GM") != false) goto L656;
     */
    /* JADX WARN: Code restructure failed: missing block: B:657:0x08be, code lost:
    
        return new int[]{4, 3, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x08c5, code lost:
    
        if (r3.equals("GL") != false) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x08cc, code lost:
    
        return new int[]{1, 2, 2, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:663:0x08d3, code lost:
    
        if (r3.equals("GI") != false) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x08da, code lost:
    
        return new int[]{0, 2, 0, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00cd, code lost:
    
        if (r3.equals("BL") != false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:707:0x096d, code lost:
    
        if (r3.equals("FK") != false) goto L708;
     */
    /* JADX WARN: Code restructure failed: missing block: B:709:0x0974, code lost:
    
        return new int[]{3, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:727:0x09b3, code lost:
    
        if (r3.equals("ER") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:729:0x09ba, code lost:
    
        return new int[]{4, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:731:0x09c1, code lost:
    
        if (r3.equals("EG") != false) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:733:0x09c8, code lost:
    
        return new int[]{3, 4, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:735:0x09cf, code lost:
    
        if (r3.equals("EE") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x09d6, code lost:
    
        return new int[]{0, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:743:0x09eb, code lost:
    
        if (r3.equals("DZ") != false) goto L744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x09f2, code lost:
    
        return new int[]{3, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:747:0x09f9, code lost:
    
        if (r3.equals("DO") != false) goto L748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:749:0x0a00, code lost:
    
        return new int[]{3, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e5, code lost:
    
        if (r3.equals("AT") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:751:0x0a07, code lost:
    
        if (r3.equals("DM") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:758:0x0a1f, code lost:
    
        if (r3.equals("DJ") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:773:0x0a53, code lost:
    
        if (r3.equals("CX") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:776:0x0a5d, code lost:
    
        if (r3.equals("CW") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x0a75, code lost:
    
        if (r3.equals("CU") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:785:0x0a7c, code lost:
    
        return new int[]{4, 2, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:787:0x0a83, code lost:
    
        if (r3.equals("CR") != false) goto L788;
     */
    /* JADX WARN: Code restructure failed: missing block: B:789:0x0a8a, code lost:
    
        return new int[]{2, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:799:0x0aad, code lost:
    
        if (r3.equals("CM") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x0ab4, code lost:
    
        return new int[]{4, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:803:0x0abb, code lost:
    
        if (r3.equals("CL") != false) goto L804;
     */
    /* JADX WARN: Code restructure failed: missing block: B:805:0x0ac2, code lost:
    
        return new int[]{0, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:807:0x0ac9, code lost:
    
        if (r3.equals("CK") != false) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:810:0x0ad3, code lost:
    
        if (r3.equals("CD") != false) goto L811;
     */
    /* JADX WARN: Code restructure failed: missing block: B:812:0x0ada, code lost:
    
        return new int[]{3, 3, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:814:0x0ae1, code lost:
    
        if (r3.equals("CA") != false) goto L815;
     */
    /* JADX WARN: Code restructure failed: missing block: B:816:0x0ae8, code lost:
    
        return new int[]{0, 2, 1, 2, 3, 3};
     */
    /* JADX WARN: Code restructure failed: missing block: B:826:0x0b0b, code lost:
    
        if (r3.equals("BI") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:828:0x0b12, code lost:
    
        return new int[]{4, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:834:0x0b27, code lost:
    
        if (r3.equals("BG") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:836:0x0b2e, code lost:
    
        return new int[]{0, 0, 0, 0, 1, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:838:0x0b35, code lost:
    
        if (r3.equals("BF") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:840:0x0b3c, code lost:
    
        return new int[]{4, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:850:0x0b5f, code lost:
    
        if (r3.equals("AZ") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:852:0x0b66, code lost:
    
        return new int[]{4, 2, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:858:0x0b7b, code lost:
    
        if (r3.equals("AI") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x010b, code lost:
    
        if (r3.equals("AQ") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:861:0x0b84, code lost:
    
        if (r3.equals("AG") != false) goto L862;
     */
    /* JADX WARN: Code restructure failed: missing block: B:863:0x0b8b, code lost:
    
        return new int[]{2, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:865:0x0b92, code lost:
    
        if (r3.equals("AF") != false) goto L866;
     */
    /* JADX WARN: Code restructure failed: missing block: B:867:0x0b99, code lost:
    
        return new int[]{4, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:873:0x0bae, code lost:
    
        if (r3.equals("AD") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:876:0x0bb7, code lost:
    
        if (r3.equals("BZ") != false) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:878:0x0bbe, code lost:
    
        return new int[]{2, 2, 2, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:884:0x0bd3, code lost:
    
        if (r3.equals("BB") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:886:0x0bda, code lost:
    
        return new int[]{1, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:888:0x0be1, code lost:
    
        if (r3.equals("BA") != false) goto L889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0115, code lost:
    
        if (r3.equals("ZW") != false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:890:0x0be8, code lost:
    
        return new int[]{1, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:892:0x0bef, code lost:
    
        if (r3.equals("AX") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:894:0x0bf6, code lost:
    
        return new int[]{0, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:900:0x0c0b, code lost:
    
        if (r3.equals("AM") != false) goto L901;
     */
    /* JADX WARN: Code restructure failed: missing block: B:902:0x0c12, code lost:
    
        return new int[]{2, 3, 2, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x013b, code lost:
    
        if (r3.equals("YT") != false) goto L390;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int[] zzn(java.lang.String r3) {
        /*
            Method dump skipped, instruction units count: 6672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyx.zzn(java.lang.String):int[]");
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final void zza(zzga zzgaVar, zzge zzgeVar, boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final synchronized void zzb(zzga zzgaVar, zzge zzgeVar, boolean z4) {
        try {
            if (zzm(zzgeVar, z4)) {
                if (this.zzl == 0) {
                    this.zzm = SystemClock.elapsedRealtime();
                }
                this.zzl++;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final synchronized void zzc(zzga zzgaVar, zzge zzgeVar, boolean z4, int i) {
        if (zzm(zzgeVar, z4)) {
            this.zzn += (long) i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    @Override // com.google.android.gms.internal.ads.zzgy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzd(com.google.android.gms.internal.ads.zzga r11, com.google.android.gms.internal.ads.zzge r12, boolean r13) throws java.lang.Throwable {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r11 = zzm(r12, r13)     // Catch: java.lang.Throwable -> L6d
            if (r11 != 0) goto L9
            monitor-exit(r10)
            return
        L9:
            int r11 = r10.zzl     // Catch: java.lang.Throwable -> L6d
            if (r11 <= 0) goto Lf
            r11 = 1
            goto L10
        Lf:
            r11 = 0
        L10:
            com.google.android.gms.internal.ads.zzghc.zzh(r11)     // Catch: java.lang.Throwable -> L6d
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L6d
            long r0 = r10.zzm     // Catch: java.lang.Throwable -> L6d
            long r0 = r11 - r0
            long r2 = r10.zzo     // Catch: java.lang.Throwable -> L6d
            int r5 = (int) r0     // Catch: java.lang.Throwable -> L6d
            long r0 = (long) r5     // Catch: java.lang.Throwable -> L6d
            long r2 = r2 + r0
            r10.zzo = r2     // Catch: java.lang.Throwable -> L6d
            long r0 = r10.zzp     // Catch: java.lang.Throwable -> L6d
            long r2 = r10.zzn     // Catch: java.lang.Throwable -> L6d
            long r0 = r0 + r2
            r10.zzp = r0     // Catch: java.lang.Throwable -> L6d
            if (r5 <= 0) goto L70
            float r13 = (float) r2     // Catch: java.lang.Throwable -> L6d
            com.google.android.gms.internal.ads.zzzl r0 = r10.zzk     // Catch: java.lang.Throwable -> L6d
            double r1 = (double) r2     // Catch: java.lang.Throwable -> L6d
            double r1 = java.lang.Math.sqrt(r1)     // Catch: java.lang.Throwable -> L6d
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L6d
            r2 = 1174011904(0x45fa0000, float:8000.0)
            float r13 = r13 * r2
            float r2 = (float) r5     // Catch: java.lang.Throwable -> L6d
            float r13 = r13 / r2
            r0.zzb(r1, r13)     // Catch: java.lang.Throwable -> L6d
            long r1 = r10.zzo     // Catch: java.lang.Throwable -> L6d
            r3 = 2000(0x7d0, double:9.88E-321)
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 >= 0) goto L52
            long r1 = r10.zzp     // Catch: java.lang.Throwable -> L4e
            r3 = 524288(0x80000, double:2.590327E-318)
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 < 0) goto L5b
            goto L52
        L4e:
            r0 = move-exception
            r11 = r0
            r4 = r10
            goto L79
        L52:
            r13 = 1056964608(0x3f000000, float:0.5)
            float r13 = r0.zzc(r13)     // Catch: java.lang.Throwable -> L6d
            long r0 = (long) r13     // Catch: java.lang.Throwable -> L6d
            r10.zzq = r0     // Catch: java.lang.Throwable -> L6d
        L5b:
            long r6 = r10.zzn     // Catch: java.lang.Throwable -> L6d
            long r8 = r10.zzq     // Catch: java.lang.Throwable -> L6d
            r4 = r10
            r4.zzk(r5, r6, r8)     // Catch: java.lang.Throwable -> L6a
            r4.zzm = r11     // Catch: java.lang.Throwable -> L6a
            r11 = 0
            r4.zzn = r11     // Catch: java.lang.Throwable -> L6a
            goto L71
        L6a:
            r0 = move-exception
        L6b:
            r11 = r0
            goto L79
        L6d:
            r0 = move-exception
            r4 = r10
            goto L6b
        L70:
            r4 = r10
        L71:
            int r11 = r4.zzl     // Catch: java.lang.Throwable -> L6a
            int r11 = r11 + (-1)
            r4.zzl = r11     // Catch: java.lang.Throwable -> L6a
            monitor-exit(r10)
            return
        L79:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L6a
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyx.zzd(com.google.android.gms.internal.ads.zzga, com.google.android.gms.internal.ads.zzge, boolean):void");
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final zzgy zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final void zzf(Handler handler, zzyt zzytVar) {
        zzytVar.getClass();
        this.zzj.zza(handler, zzytVar);
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final void zzg(zzyt zzytVar) {
        this.zzj.zzb(zzytVar);
    }
}
