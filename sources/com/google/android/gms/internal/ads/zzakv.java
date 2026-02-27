package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class zzakv implements zzajv {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzakt zzh = new zzakt(30.0f, 1, 1);

    public zzakv() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.zzi = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    private static String[] zzc(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return new String[0];
        }
        String str2 = zzeo.zza;
        return strTrim.split("\\s+", -1);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0373 A[Catch: zzajr -> 0x03c7, TryCatch #1 {zzajr -> 0x03c7, blocks: (B:168:0x02da, B:170:0x02f5, B:173:0x030b, B:175:0x0311, B:177:0x0317, B:198:0x034d, B:203:0x0376, B:205:0x037c, B:206:0x0385, B:199:0x0351, B:200:0x036e, B:201:0x036f, B:202:0x0373, B:207:0x0386, B:208:0x0387, B:209:0x03a4, B:172:0x02fe, B:210:0x03a5, B:211:0x03c6), top: B:229:0x02da }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x037c A[Catch: zzajr -> 0x03c7, TryCatch #1 {zzajr -> 0x03c7, blocks: (B:168:0x02da, B:170:0x02f5, B:173:0x030b, B:175:0x0311, B:177:0x0317, B:198:0x034d, B:203:0x0376, B:205:0x037c, B:206:0x0385, B:199:0x0351, B:200:0x036e, B:201:0x036f, B:202:0x0373, B:207:0x0386, B:208:0x0387, B:209:0x03a4, B:172:0x02fe, B:210:0x03a5, B:211:0x03c6), top: B:229:0x02da }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0385 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v44 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v87 */
    /* JADX WARN: Type inference failed for: r7v88 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzaky zzd(org.xmlpull.v1.XmlPullParser r17, com.google.android.gms.internal.ads.zzaky r18) {
        /*
            Method dump skipped, instruction units count: 1194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakv.zzd(org.xmlpull.v1.XmlPullParser, com.google.android.gms.internal.ads.zzaky):com.google.android.gms.internal.ads.zzaky");
    }

    private static zzaky zze(@Nullable zzaky zzakyVar) {
        return zzakyVar == null ? new zzaky() : zzakyVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.text.Layout.Alignment zzf(java.lang.String r5) {
        /*
            java.lang.String r5 = com.google.android.gms.internal.ads.zzggj.zza(r5)
            int r0 = r5.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1364013995: goto L38;
                case 100571: goto L2e;
                case 3317767: goto L24;
                case 108511772: goto L1a;
                case 109757538: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L42
        L10:
            java.lang.String r0 = "start"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r4
            goto L43
        L1a:
            java.lang.String r0 = "right"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r3
            goto L43
        L24:
            java.lang.String r0 = "left"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = 0
            goto L43
        L2e:
            java.lang.String r0 = "end"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r2
            goto L43
        L38:
            java.lang.String r0 = "center"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r1
            goto L43
        L42:
            r5 = -1
        L43:
            if (r5 == 0) goto L55
            if (r5 == r4) goto L55
            if (r5 == r3) goto L52
            if (r5 == r2) goto L52
            if (r5 == r1) goto L4f
            r5 = 0
            return r5
        L4f:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
            return r5
        L52:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r5
        L55:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakv.zzf(java.lang.String):android.text.Layout$Alignment");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long zzg(java.lang.String r13, com.google.android.gms.internal.ads.zzakt r14) throws com.google.android.gms.internal.ads.zzajr {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakv.zzg(java.lang.String, com.google.android.gms.internal.ads.zzakt):long");
    }

    @Override // com.google.android.gms.internal.ads.zzajv
    public final void zza(byte[] bArr, int i, int i4, zzaju zzajuVar, zzdf zzdfVar) {
        zzajp.zza(zzb(bArr, i, i4), zzajuVar, zzdfVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:286|(6:435|287|288|(8:421|290|SW:291|(2:314|(2:316|(3:318|(2:320|(2:322|(3:425|325|(1:327)))(2:333|(1:335)))(2:336|(1:338))|328)(2:339|340))(1:343))(1:344)|329|430|345|463)|462|348)|(3:350|(1:359)(4:352|(1:354)(1:355)|356|(2:358|359)(1:360))|409)(1:361)|362|(3:364|(1:366)(7:(2:370|(1:372))|373|375|376|428|377|(1:379))|367)(1:374)|368|375|376|428|377|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x06dc, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0315 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, TRY_LEAVE, TryCatch #15 {IOException -> 0x0097, XmlPullParserException -> 0x009a, blocks: (B:3:0x0009, B:5:0x0065, B:7:0x0070, B:10:0x007c, B:13:0x0088, B:15:0x0090, B:22:0x00a0, B:24:0x00a8, B:28:0x00bc, B:30:0x00d5, B:32:0x00df, B:33:0x00e3, B:35:0x00ef, B:36:0x00f3, B:65:0x016e, B:83:0x01c7, B:86:0x01db, B:88:0x01e1, B:90:0x01e9, B:92:0x01f1, B:94:0x01f9, B:96:0x0201, B:98:0x0209, B:100:0x020f, B:102:0x0217, B:104:0x021f, B:106:0x0225, B:108:0x022b, B:110:0x0231, B:112:0x0239, B:115:0x0242, B:409:0x075a, B:119:0x0274, B:121:0x027a, B:123:0x0283, B:125:0x0292, B:127:0x029f, B:129:0x02b5, B:131:0x02bb, B:282:0x0558, B:134:0x02c6, B:137:0x02d2, B:266:0x0507, B:140:0x02f0, B:142:0x02f8, B:144:0x0300, B:146:0x0308, B:151:0x0315, B:154:0x032e, B:156:0x0334, B:158:0x0341, B:179:0x03a8, B:181:0x03ae, B:183:0x03b4, B:185:0x03bc, B:187:0x03c2, B:190:0x03d5, B:192:0x03db, B:194:0x03e8, B:214:0x045d, B:216:0x0465, B:236:0x04ab, B:238:0x04b3, B:264:0x04fa, B:195:0x03f3, B:196:0x03f4, B:197:0x03f5, B:198:0x0402, B:201:0x040a, B:204:0x0418, B:206:0x041e, B:208:0x0429, B:209:0x043d, B:210:0x043e, B:211:0x043f, B:212:0x044c, B:159:0x034a, B:160:0x034b, B:161:0x034c, B:163:0x0357, B:166:0x0361, B:169:0x036a, B:171:0x0370, B:173:0x037b, B:174:0x038d, B:175:0x038e, B:176:0x038f, B:177:0x0397, B:269:0x051a, B:271:0x0528, B:273:0x0533, B:275:0x0539, B:277:0x0545, B:287:0x0573, B:290:0x0596, B:325:0x0627, B:327:0x062f, B:345:0x0671, B:386:0x06ec, B:333:0x0642, B:336:0x064c, B:340:0x065a, B:343:0x0661, B:344:0x0669, B:350:0x0688, B:354:0x0694, B:358:0x069d, B:366:0x06af, B:375:0x06c7, B:377:0x06d3, B:379:0x06d8, B:370:0x06b8, B:68:0x017b, B:70:0x0187, B:73:0x0190, B:75:0x0196, B:77:0x01a1, B:78:0x01ad, B:79:0x01ae, B:80:0x01af, B:40:0x010f, B:42:0x011b, B:45:0x0127, B:47:0x012d, B:49:0x0134, B:51:0x013a, B:57:0x0150, B:64:0x0166, B:60:0x015d, B:63:0x0165, B:390:0x070a, B:392:0x0718, B:395:0x071c, B:397:0x0726, B:399:0x0730, B:401:0x0737, B:402:0x0738, B:405:0x074b, B:408:0x0758, B:413:0x0776), top: B:440:0x0009, inners: #5, #8, #12, #13, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03c2 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, TRY_LEAVE, TryCatch #15 {IOException -> 0x0097, XmlPullParserException -> 0x009a, blocks: (B:3:0x0009, B:5:0x0065, B:7:0x0070, B:10:0x007c, B:13:0x0088, B:15:0x0090, B:22:0x00a0, B:24:0x00a8, B:28:0x00bc, B:30:0x00d5, B:32:0x00df, B:33:0x00e3, B:35:0x00ef, B:36:0x00f3, B:65:0x016e, B:83:0x01c7, B:86:0x01db, B:88:0x01e1, B:90:0x01e9, B:92:0x01f1, B:94:0x01f9, B:96:0x0201, B:98:0x0209, B:100:0x020f, B:102:0x0217, B:104:0x021f, B:106:0x0225, B:108:0x022b, B:110:0x0231, B:112:0x0239, B:115:0x0242, B:409:0x075a, B:119:0x0274, B:121:0x027a, B:123:0x0283, B:125:0x0292, B:127:0x029f, B:129:0x02b5, B:131:0x02bb, B:282:0x0558, B:134:0x02c6, B:137:0x02d2, B:266:0x0507, B:140:0x02f0, B:142:0x02f8, B:144:0x0300, B:146:0x0308, B:151:0x0315, B:154:0x032e, B:156:0x0334, B:158:0x0341, B:179:0x03a8, B:181:0x03ae, B:183:0x03b4, B:185:0x03bc, B:187:0x03c2, B:190:0x03d5, B:192:0x03db, B:194:0x03e8, B:214:0x045d, B:216:0x0465, B:236:0x04ab, B:238:0x04b3, B:264:0x04fa, B:195:0x03f3, B:196:0x03f4, B:197:0x03f5, B:198:0x0402, B:201:0x040a, B:204:0x0418, B:206:0x041e, B:208:0x0429, B:209:0x043d, B:210:0x043e, B:211:0x043f, B:212:0x044c, B:159:0x034a, B:160:0x034b, B:161:0x034c, B:163:0x0357, B:166:0x0361, B:169:0x036a, B:171:0x0370, B:173:0x037b, B:174:0x038d, B:175:0x038e, B:176:0x038f, B:177:0x0397, B:269:0x051a, B:271:0x0528, B:273:0x0533, B:275:0x0539, B:277:0x0545, B:287:0x0573, B:290:0x0596, B:325:0x0627, B:327:0x062f, B:345:0x0671, B:386:0x06ec, B:333:0x0642, B:336:0x064c, B:340:0x065a, B:343:0x0661, B:344:0x0669, B:350:0x0688, B:354:0x0694, B:358:0x069d, B:366:0x06af, B:375:0x06c7, B:377:0x06d3, B:379:0x06d8, B:370:0x06b8, B:68:0x017b, B:70:0x0187, B:73:0x0190, B:75:0x0196, B:77:0x01a1, B:78:0x01ad, B:79:0x01ae, B:80:0x01af, B:40:0x010f, B:42:0x011b, B:45:0x0127, B:47:0x012d, B:49:0x0134, B:51:0x013a, B:57:0x0150, B:64:0x0166, B:60:0x015d, B:63:0x0165, B:390:0x070a, B:392:0x0718, B:395:0x071c, B:397:0x0726, B:399:0x0730, B:401:0x0737, B:402:0x0738, B:405:0x074b, B:408:0x0758, B:413:0x0776), top: B:440:0x0009, inners: #5, #8, #12, #13, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0465 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, TRY_LEAVE, TryCatch #15 {IOException -> 0x0097, XmlPullParserException -> 0x009a, blocks: (B:3:0x0009, B:5:0x0065, B:7:0x0070, B:10:0x007c, B:13:0x0088, B:15:0x0090, B:22:0x00a0, B:24:0x00a8, B:28:0x00bc, B:30:0x00d5, B:32:0x00df, B:33:0x00e3, B:35:0x00ef, B:36:0x00f3, B:65:0x016e, B:83:0x01c7, B:86:0x01db, B:88:0x01e1, B:90:0x01e9, B:92:0x01f1, B:94:0x01f9, B:96:0x0201, B:98:0x0209, B:100:0x020f, B:102:0x0217, B:104:0x021f, B:106:0x0225, B:108:0x022b, B:110:0x0231, B:112:0x0239, B:115:0x0242, B:409:0x075a, B:119:0x0274, B:121:0x027a, B:123:0x0283, B:125:0x0292, B:127:0x029f, B:129:0x02b5, B:131:0x02bb, B:282:0x0558, B:134:0x02c6, B:137:0x02d2, B:266:0x0507, B:140:0x02f0, B:142:0x02f8, B:144:0x0300, B:146:0x0308, B:151:0x0315, B:154:0x032e, B:156:0x0334, B:158:0x0341, B:179:0x03a8, B:181:0x03ae, B:183:0x03b4, B:185:0x03bc, B:187:0x03c2, B:190:0x03d5, B:192:0x03db, B:194:0x03e8, B:214:0x045d, B:216:0x0465, B:236:0x04ab, B:238:0x04b3, B:264:0x04fa, B:195:0x03f3, B:196:0x03f4, B:197:0x03f5, B:198:0x0402, B:201:0x040a, B:204:0x0418, B:206:0x041e, B:208:0x0429, B:209:0x043d, B:210:0x043e, B:211:0x043f, B:212:0x044c, B:159:0x034a, B:160:0x034b, B:161:0x034c, B:163:0x0357, B:166:0x0361, B:169:0x036a, B:171:0x0370, B:173:0x037b, B:174:0x038d, B:175:0x038e, B:176:0x038f, B:177:0x0397, B:269:0x051a, B:271:0x0528, B:273:0x0533, B:275:0x0539, B:277:0x0545, B:287:0x0573, B:290:0x0596, B:325:0x0627, B:327:0x062f, B:345:0x0671, B:386:0x06ec, B:333:0x0642, B:336:0x064c, B:340:0x065a, B:343:0x0661, B:344:0x0669, B:350:0x0688, B:354:0x0694, B:358:0x069d, B:366:0x06af, B:375:0x06c7, B:377:0x06d3, B:379:0x06d8, B:370:0x06b8, B:68:0x017b, B:70:0x0187, B:73:0x0190, B:75:0x0196, B:77:0x01a1, B:78:0x01ad, B:79:0x01ae, B:80:0x01af, B:40:0x010f, B:42:0x011b, B:45:0x0127, B:47:0x012d, B:49:0x0134, B:51:0x013a, B:57:0x0150, B:64:0x0166, B:60:0x015d, B:63:0x0165, B:390:0x070a, B:392:0x0718, B:395:0x071c, B:397:0x0726, B:399:0x0730, B:401:0x0737, B:402:0x0738, B:405:0x074b, B:408:0x0758, B:413:0x0776), top: B:440:0x0009, inners: #5, #8, #12, #13, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04b3 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, TRY_LEAVE, TryCatch #15 {IOException -> 0x0097, XmlPullParserException -> 0x009a, blocks: (B:3:0x0009, B:5:0x0065, B:7:0x0070, B:10:0x007c, B:13:0x0088, B:15:0x0090, B:22:0x00a0, B:24:0x00a8, B:28:0x00bc, B:30:0x00d5, B:32:0x00df, B:33:0x00e3, B:35:0x00ef, B:36:0x00f3, B:65:0x016e, B:83:0x01c7, B:86:0x01db, B:88:0x01e1, B:90:0x01e9, B:92:0x01f1, B:94:0x01f9, B:96:0x0201, B:98:0x0209, B:100:0x020f, B:102:0x0217, B:104:0x021f, B:106:0x0225, B:108:0x022b, B:110:0x0231, B:112:0x0239, B:115:0x0242, B:409:0x075a, B:119:0x0274, B:121:0x027a, B:123:0x0283, B:125:0x0292, B:127:0x029f, B:129:0x02b5, B:131:0x02bb, B:282:0x0558, B:134:0x02c6, B:137:0x02d2, B:266:0x0507, B:140:0x02f0, B:142:0x02f8, B:144:0x0300, B:146:0x0308, B:151:0x0315, B:154:0x032e, B:156:0x0334, B:158:0x0341, B:179:0x03a8, B:181:0x03ae, B:183:0x03b4, B:185:0x03bc, B:187:0x03c2, B:190:0x03d5, B:192:0x03db, B:194:0x03e8, B:214:0x045d, B:216:0x0465, B:236:0x04ab, B:238:0x04b3, B:264:0x04fa, B:195:0x03f3, B:196:0x03f4, B:197:0x03f5, B:198:0x0402, B:201:0x040a, B:204:0x0418, B:206:0x041e, B:208:0x0429, B:209:0x043d, B:210:0x043e, B:211:0x043f, B:212:0x044c, B:159:0x034a, B:160:0x034b, B:161:0x034c, B:163:0x0357, B:166:0x0361, B:169:0x036a, B:171:0x0370, B:173:0x037b, B:174:0x038d, B:175:0x038e, B:176:0x038f, B:177:0x0397, B:269:0x051a, B:271:0x0528, B:273:0x0533, B:275:0x0539, B:277:0x0545, B:287:0x0573, B:290:0x0596, B:325:0x0627, B:327:0x062f, B:345:0x0671, B:386:0x06ec, B:333:0x0642, B:336:0x064c, B:340:0x065a, B:343:0x0661, B:344:0x0669, B:350:0x0688, B:354:0x0694, B:358:0x069d, B:366:0x06af, B:375:0x06c7, B:377:0x06d3, B:379:0x06d8, B:370:0x06b8, B:68:0x017b, B:70:0x0187, B:73:0x0190, B:75:0x0196, B:77:0x01a1, B:78:0x01ad, B:79:0x01ae, B:80:0x01af, B:40:0x010f, B:42:0x011b, B:45:0x0127, B:47:0x012d, B:49:0x0134, B:51:0x013a, B:57:0x0150, B:64:0x0166, B:60:0x015d, B:63:0x0165, B:390:0x070a, B:392:0x0718, B:395:0x071c, B:397:0x0726, B:399:0x0730, B:401:0x0737, B:402:0x0738, B:405:0x074b, B:408:0x0758, B:413:0x0776), top: B:440:0x0009, inners: #5, #8, #12, #13, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0565 A[LOOP:1: B:121:0x027a->B:285:0x0565, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:379:0x06d8 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, zzajr -> 0x06dc, TRY_LEAVE, TryCatch #6 {zzajr -> 0x06dc, blocks: (B:377:0x06d3, B:379:0x06d8), top: B:428:0x06d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:459:0x055e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017b A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, TryCatch #15 {IOException -> 0x0097, XmlPullParserException -> 0x009a, blocks: (B:3:0x0009, B:5:0x0065, B:7:0x0070, B:10:0x007c, B:13:0x0088, B:15:0x0090, B:22:0x00a0, B:24:0x00a8, B:28:0x00bc, B:30:0x00d5, B:32:0x00df, B:33:0x00e3, B:35:0x00ef, B:36:0x00f3, B:65:0x016e, B:83:0x01c7, B:86:0x01db, B:88:0x01e1, B:90:0x01e9, B:92:0x01f1, B:94:0x01f9, B:96:0x0201, B:98:0x0209, B:100:0x020f, B:102:0x0217, B:104:0x021f, B:106:0x0225, B:108:0x022b, B:110:0x0231, B:112:0x0239, B:115:0x0242, B:409:0x075a, B:119:0x0274, B:121:0x027a, B:123:0x0283, B:125:0x0292, B:127:0x029f, B:129:0x02b5, B:131:0x02bb, B:282:0x0558, B:134:0x02c6, B:137:0x02d2, B:266:0x0507, B:140:0x02f0, B:142:0x02f8, B:144:0x0300, B:146:0x0308, B:151:0x0315, B:154:0x032e, B:156:0x0334, B:158:0x0341, B:179:0x03a8, B:181:0x03ae, B:183:0x03b4, B:185:0x03bc, B:187:0x03c2, B:190:0x03d5, B:192:0x03db, B:194:0x03e8, B:214:0x045d, B:216:0x0465, B:236:0x04ab, B:238:0x04b3, B:264:0x04fa, B:195:0x03f3, B:196:0x03f4, B:197:0x03f5, B:198:0x0402, B:201:0x040a, B:204:0x0418, B:206:0x041e, B:208:0x0429, B:209:0x043d, B:210:0x043e, B:211:0x043f, B:212:0x044c, B:159:0x034a, B:160:0x034b, B:161:0x034c, B:163:0x0357, B:166:0x0361, B:169:0x036a, B:171:0x0370, B:173:0x037b, B:174:0x038d, B:175:0x038e, B:176:0x038f, B:177:0x0397, B:269:0x051a, B:271:0x0528, B:273:0x0533, B:275:0x0539, B:277:0x0545, B:287:0x0573, B:290:0x0596, B:325:0x0627, B:327:0x062f, B:345:0x0671, B:386:0x06ec, B:333:0x0642, B:336:0x064c, B:340:0x065a, B:343:0x0661, B:344:0x0669, B:350:0x0688, B:354:0x0694, B:358:0x069d, B:366:0x06af, B:375:0x06c7, B:377:0x06d3, B:379:0x06d8, B:370:0x06b8, B:68:0x017b, B:70:0x0187, B:73:0x0190, B:75:0x0196, B:77:0x01a1, B:78:0x01ad, B:79:0x01ae, B:80:0x01af, B:40:0x010f, B:42:0x011b, B:45:0x0127, B:47:0x012d, B:49:0x0134, B:51:0x013a, B:57:0x0150, B:64:0x0166, B:60:0x015d, B:63:0x0165, B:390:0x070a, B:392:0x0718, B:395:0x071c, B:397:0x0726, B:399:0x0730, B:401:0x0737, B:402:0x0738, B:405:0x074b, B:408:0x0758, B:413:0x0776), top: B:440:0x0009, inners: #5, #8, #12, #13, #14 }] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v70, types: [com.google.android.gms.internal.ads.zzakw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v15 */
    /* JADX WARN: Type inference failed for: r22v16 */
    /* JADX WARN: Type inference failed for: r22v17 */
    /* JADX WARN: Type inference failed for: r22v18 */
    /* JADX WARN: Type inference failed for: r22v19 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v20 */
    /* JADX WARN: Type inference failed for: r22v21 */
    /* JADX WARN: Type inference failed for: r22v22 */
    /* JADX WARN: Type inference failed for: r22v23 */
    /* JADX WARN: Type inference failed for: r22v24 */
    /* JADX WARN: Type inference failed for: r22v25 */
    /* JADX WARN: Type inference failed for: r22v26 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r22v5 */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r22v7 */
    /* JADX WARN: Type inference failed for: r22v9 */
    /* JADX WARN: Type inference failed for: r51v1, types: [com.google.android.gms.internal.ads.zzaky, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.google.android.gms.internal.ads.zzaku] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzajq zzb(byte[] r50, int r51, int r52) {
        /*
            Method dump skipped, instruction units count: 1954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakv.zzb(byte[], int, int):com.google.android.gms.internal.ads.zzajq");
    }
}
