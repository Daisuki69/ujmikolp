package com.google.android.gms.measurement.internal;

import android.app.BroadcastOptions;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.media3.datasource.cache.c;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzqp;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import dOYHB6.yFtIp6.kKDWJ7;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class zzpg implements zzjg {
    private static volatile zzpg zzb;
    private List zzA;
    private long zzB;
    private final Map zzC;
    private final Map zzD;
    private final Map zzE;
    private zzlu zzG;
    private String zzH;
    private zzay zzI;
    private long zzJ;

    @VisibleForTesting
    long zza;
    private final zzht zzc;
    private final zzgz zzd;
    private zzav zze;
    private zzhb zzf;
    private zzok zzg;
    private zzad zzh;
    private final zzpk zzi;
    private zzlp zzj;
    private zznn zzk;
    private final zzou zzl;
    private zzhk zzm;
    private final zzic zzn;
    private boolean zzp;
    private List zzq;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private FileLock zzx;
    private FileChannel zzy;
    private List zzz;
    private final AtomicBoolean zzo = new AtomicBoolean(false);
    private final Deque zzr = new LinkedList();
    private final Map zzF = new HashMap();
    private final zzpo zzK = new zzpb(this);

    public zzpg(zzph zzphVar, zzic zzicVar) {
        Preconditions.checkNotNull(zzphVar);
        this.zzn = zzic.zzy(zzphVar.zza, null, null);
        this.zzB = -1L;
        this.zzl = new zzou(this);
        zzpk zzpkVar = new zzpk(this);
        zzpkVar.zzax();
        this.zzi = zzpkVar;
        zzgz zzgzVar = new zzgz(this);
        zzgzVar.zzax();
        this.zzd = zzgzVar;
        zzht zzhtVar = new zzht(this);
        zzhtVar.zzax();
        this.zzc = zzhtVar;
        this.zzC = new HashMap();
        this.zzD = new HashMap();
        this.zzE = new HashMap();
        zzaW().zzj(new zzov(this, zzphVar));
    }

    public static zzpg zza(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzpg.class) {
                try {
                    if (zzb == null) {
                        zzb = new zzpg((zzph) Preconditions.checkNotNull(new zzph(context)), null);
                    }
                } finally {
                }
            }
        }
        return zzb;
    }

    @VisibleForTesting
    public static final void zzaA(com.google.android.gms.internal.measurement.zzhr zzhrVar, int i, String str) {
        List listZza = zzhrVar.zza();
        for (int i4 = 0; i4 < listZza.size(); i4++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.zzhw) listZza.get(i4)).zzb())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.zzhv zzhvVarZzn = com.google.android.gms.internal.measurement.zzhw.zzn();
        zzhvVarZzn.zzb("_err");
        zzhvVarZzn.zzf(i);
        com.google.android.gms.internal.measurement.zzhw zzhwVar = (com.google.android.gms.internal.measurement.zzhw) zzhvVarZzn.zzbc();
        com.google.android.gms.internal.measurement.zzhv zzhvVarZzn2 = com.google.android.gms.internal.measurement.zzhw.zzn();
        zzhvVarZzn2.zzb("_ev");
        zzhvVarZzn2.zzd(str);
        com.google.android.gms.internal.measurement.zzhw zzhwVar2 = (com.google.android.gms.internal.measurement.zzhw) zzhvVarZzn2.zzbc();
        zzhrVar.zzf(zzhwVar);
        zzhrVar.zzf(zzhwVar2);
    }

    @VisibleForTesting
    public static final void zzaB(com.google.android.gms.internal.measurement.zzhr zzhrVar, @NonNull String str) {
        List listZza = zzhrVar.zza();
        for (int i = 0; i < listZza.size(); i++) {
            if (str.equals(((com.google.android.gms.internal.measurement.zzhw) listZza.get(i)).zzb())) {
                zzhrVar.zzj(i);
                return;
            }
        }
    }

    private final int zzaC(String str, zzan zzanVar) {
        zzjk zzjkVar;
        zzji zzjiVarZzA;
        zzht zzhtVar = this.zzc;
        if (zzhtVar.zzx(str) == null) {
            zzanVar.zzc(zzjk.AD_PERSONALIZATION, zzam.FAILSAFE);
            return 1;
        }
        zzh zzhVarZzu = zzj().zzu(str);
        if (zzhVarZzu != null && zze.zzc(zzhVarZzu.zzaH()).zza() == zzji.POLICY && (zzjiVarZzA = zzhtVar.zzA(str, (zzjkVar = zzjk.AD_PERSONALIZATION))) != zzji.UNINITIALIZED) {
            zzanVar.zzc(zzjkVar, zzam.REMOTE_ENFORCED_DEFAULT);
            return zzjiVarZzA == zzji.GRANTED ? 0 : 1;
        }
        zzjk zzjkVar2 = zzjk.AD_PERSONALIZATION;
        zzanVar.zzc(zzjkVar2, zzam.REMOTE_DEFAULT);
        return zzhtVar.zzv(str, zzjkVar2) ? 0 : 1;
    }

    private final Map zzaD(com.google.android.gms.internal.measurement.zzhs zzhsVar) {
        HashMap map = new HashMap();
        zzp();
        for (Map.Entry entry : zzpk.zzH(zzhsVar, "gad_").entrySet()) {
            map.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return map;
    }

    private final zzay zzaE() {
        if (this.zzI == null) {
            this.zzI = new zzoy(this, this.zzn);
        }
        return this.zzI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* JADX INFO: renamed from: zzaF, reason: merged with bridge method [inline-methods] */
    public final void zzav() {
        zzaW().zzg();
        if (this.zzr.isEmpty() || zzaE().zzc()) {
            return;
        }
        long jMax = Math.max(0L, ((long) ((Integer) zzfy.zzaB.zzb(null)).intValue()) - (zzaZ().elapsedRealtime() - this.zzJ));
        zzaV().zzk().zzb("Scheduling notify next app runnable, delay in ms", Long.valueOf(jMax));
        zzaE().zzb(jMax);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(40:8|(5:9|10|(5:12|13|(3:15|(1:22)|25)(23:27|28|(2:36|(3:38|(1:45)(1:44)|46)(0))(1:35)|47|(2:49|(3:51|(4:54|(1:492)(2:60|489)|61|52)|488))|62|63|(9:65|66|(0)(1:72)|(4:119|(3:120|121|(3:123|(2:125|503)(2:126|(2:128|502)(1:504))|129)(1:501))|130|(2:133|(3:138|(1:140)(2:141|(3:143|(3:146|(1:148)(1:520)|144)|519))|149)(1:137))(1:132))(1:150)|151|(5:153|(3:(2:158|(2:160|161))|162|163)|164|165|196)(2:166|(5:168|(3:(2:173|(2:175|161))|176|163)|164|165|196)(3:177|(4:179|(2:181|(1:183))(1:184)|185|(2:189|(2:190|(2:192|(2:517|194)(1:195))(1:518)))(0))(1:165)|196))|197|(9:199|(4:202|(2:215|(2:217|506)(1:508))(5:206|(5:209|(2:212|210)|510|213|207)|509|214|507)|218|200)|505|219|(4:222|(3:512|224|515)(1:514)|513|220)|511|225|(2:228|226)|516)(1:229)|230)(1:73)|71|(3:74|75|(3:77|(2:79|495)(2:80|(2:82|496)(2:83|494))|84)(1:493))|85|(1:89)(1:88)|(1:91)|92|(1:94)(1:95)|96|(4:101|(4:104|(2:106|499)(2:107|(2:109|498)(1:500))|110|102)|497|(1:(1:116)(1:117))(1:(1:113)(2:114|(0)(0))))|(0)(0)|151|(0)(0)|197|(0)(0)|230)|26|231)(1:487)|476|477)|232|(3:234|(2:236|(2:238|523)(2:239|(1:524)(3:241|(1:243)(1:244)|(1:526)(2:248|522))))(0)|249)|521|250|(2:251|(1:527)(2:253|(2:528|255)(1:529)))|256|(1:258)(2:259|(1:261))|262|(1:264)(1:265)|266|(1:268)(1:269)|270|(6:273|(1:275)|276|(2:278|531)(1:532)|279|271)|530|280|(2:285|(1:289))(1:284)|290|(1:292)|293|(1:295)|296|(1:304)|305|(10:483|307|(7:310|311|(5:313|(1:317)|(1:333)(5:321|(1:325)|326|(1:331)(1:330)|332)|334|335)(4:337|338|(4:485|340|345|(7:347|(3:350|(3:540|352|(4:354|360|(1:362)(6:364|(1:369)(1:368)|370|(1:372)(1:374)|373|(3:376|(1:384)|385)(4:386|(3:388|(1:390)|391)(5:392|(1:394)(1:395)|396|(3:398|(1:400)|401)(2:403|(1:405))|402)|406|537))|363)(3:355|(0)(0)|363))(1:358)|348)|539|359|360|(0)(0)|363)(4:359|360|(0)(0)|363))(3:344|345|(0)(0))|407)|336|538|407|308)|536|408|(1:410)|411|(2:414|412)|541|415)(1:416)|417|(1:419)(13:421|(9:423|(1:425)(1:426)|427|(1:429)(1:430)|431|(1:433)(1:434)|435|(1:437)(1:438)|439)|440|(4:442|443|(2:451|(1:453)(1:454))(1:448)|455)(1:456)|457|(3:(2:461|534)(1:535)|462|458)|533|463|(1:465)|466|481|467|471)|420|440|(0)(0)|457|(1:458)|533|463|(0)|466|481|467|471) */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x0e20, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x0e21, code lost:
    
        r3.zzu.zzaV().zzb().zzc("Failed to remove unused event metadata. appId", com.google.android.gms.measurement.internal.zzgu.zzl(r1), r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03cf A[Catch: all -> 0x0103, TryCatch #1 {all -> 0x0103, blocks: (B:3:0x0017, B:5:0x0035, B:8:0x003f, B:9:0x0057, B:12:0x006f, B:15:0x0095, B:17:0x00cc, B:20:0x00dd, B:22:0x00e7, B:231:0x070b, B:27:0x011a, B:30:0x012c, B:32:0x0132, B:47:0x0174, B:49:0x0182, B:52:0x01a2, B:54:0x01a8, B:56:0x01b8, B:58:0x01c6, B:60:0x01d6, B:61:0x01e3, B:62:0x01e6, B:65:0x01fc, B:74:0x022c, B:77:0x0236, B:79:0x0244, B:84:0x028e, B:80:0x025f, B:82:0x026d, B:88:0x0299, B:91:0x02cc, B:92:0x02f6, B:94:0x032f, B:96:0x0335, B:99:0x0341, B:101:0x037a, B:102:0x0395, B:104:0x039b, B:106:0x03ab, B:110:0x03c1, B:107:0x03b5, B:113:0x03c8, B:116:0x03cf, B:117:0x03e7, B:119:0x0400, B:120:0x040c, B:123:0x0418, B:129:0x043b, B:126:0x042a, B:151:0x04bd, B:153:0x04c9, B:156:0x04da, B:158:0x04eb, B:160:0x04f7, B:197:0x05cb, B:199:0x05d1, B:200:0x05dd, B:202:0x05e3, B:204:0x05f3, B:206:0x05fd, B:207:0x0614, B:209:0x061a, B:210:0x0635, B:212:0x063b, B:213:0x0659, B:214:0x0662, B:218:0x068d, B:215:0x0668, B:217:0x067a, B:219:0x0699, B:220:0x06b5, B:222:0x06bb, B:224:0x06ce, B:225:0x06db, B:226:0x06df, B:228:0x06e5, B:230:0x06f7, B:166:0x0517, B:168:0x0523, B:171:0x0536, B:173:0x0547, B:175:0x0553, B:177:0x0563, B:179:0x0572, B:181:0x057e, B:185:0x058d, B:187:0x0597, B:190:0x05a2, B:192:0x05a8, B:194:0x05b8, B:195:0x05c3, B:133:0x0445, B:135:0x0451, B:137:0x045d, B:149:0x04a2, B:141:0x047a, B:144:0x048c, B:146:0x0492, B:148:0x049c, B:36:0x013c, B:38:0x0149, B:40:0x0155, B:42:0x015b, B:46:0x0166, B:234:0x0724, B:236:0x0732, B:238:0x073b, B:249:0x076f, B:239:0x0745, B:241:0x0750, B:243:0x0756, B:246:0x0762, B:248:0x076a, B:250:0x0772, B:251:0x077e, B:253:0x0784, B:255:0x0796, B:256:0x07a1, B:258:0x07a9, B:262:0x07cf, B:264:0x07e9, B:266:0x07fe, B:268:0x0818, B:270:0x082d, B:271:0x083b, B:273:0x0841, B:275:0x0851, B:276:0x0858, B:278:0x0864, B:279:0x086b, B:280:0x0870, B:282:0x08b2, B:284:0x08b8, B:290:0x08df, B:292:0x08e7, B:293:0x08f0, B:295:0x08f6, B:296:0x08fc, B:298:0x0911, B:300:0x0921, B:302:0x0931, B:304:0x0939, B:305:0x093c, B:313:0x09b0, B:315:0x09c9, B:317:0x09df, B:319:0x09e4, B:321:0x09e8, B:323:0x09ec, B:325:0x09f6, B:326:0x09fc, B:328:0x0a00, B:330:0x0a06, B:332:0x0a17, B:334:0x0a23, B:340:0x0a4b, B:343:0x0a51, B:285:0x08c6, B:287:0x08cc, B:289:0x08d2, B:269:0x082a, B:265:0x07fb, B:259:0x07af, B:261:0x07b5), top: B:479:0x0017, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03e7 A[Catch: all -> 0x0103, TryCatch #1 {all -> 0x0103, blocks: (B:3:0x0017, B:5:0x0035, B:8:0x003f, B:9:0x0057, B:12:0x006f, B:15:0x0095, B:17:0x00cc, B:20:0x00dd, B:22:0x00e7, B:231:0x070b, B:27:0x011a, B:30:0x012c, B:32:0x0132, B:47:0x0174, B:49:0x0182, B:52:0x01a2, B:54:0x01a8, B:56:0x01b8, B:58:0x01c6, B:60:0x01d6, B:61:0x01e3, B:62:0x01e6, B:65:0x01fc, B:74:0x022c, B:77:0x0236, B:79:0x0244, B:84:0x028e, B:80:0x025f, B:82:0x026d, B:88:0x0299, B:91:0x02cc, B:92:0x02f6, B:94:0x032f, B:96:0x0335, B:99:0x0341, B:101:0x037a, B:102:0x0395, B:104:0x039b, B:106:0x03ab, B:110:0x03c1, B:107:0x03b5, B:113:0x03c8, B:116:0x03cf, B:117:0x03e7, B:119:0x0400, B:120:0x040c, B:123:0x0418, B:129:0x043b, B:126:0x042a, B:151:0x04bd, B:153:0x04c9, B:156:0x04da, B:158:0x04eb, B:160:0x04f7, B:197:0x05cb, B:199:0x05d1, B:200:0x05dd, B:202:0x05e3, B:204:0x05f3, B:206:0x05fd, B:207:0x0614, B:209:0x061a, B:210:0x0635, B:212:0x063b, B:213:0x0659, B:214:0x0662, B:218:0x068d, B:215:0x0668, B:217:0x067a, B:219:0x0699, B:220:0x06b5, B:222:0x06bb, B:224:0x06ce, B:225:0x06db, B:226:0x06df, B:228:0x06e5, B:230:0x06f7, B:166:0x0517, B:168:0x0523, B:171:0x0536, B:173:0x0547, B:175:0x0553, B:177:0x0563, B:179:0x0572, B:181:0x057e, B:185:0x058d, B:187:0x0597, B:190:0x05a2, B:192:0x05a8, B:194:0x05b8, B:195:0x05c3, B:133:0x0445, B:135:0x0451, B:137:0x045d, B:149:0x04a2, B:141:0x047a, B:144:0x048c, B:146:0x0492, B:148:0x049c, B:36:0x013c, B:38:0x0149, B:40:0x0155, B:42:0x015b, B:46:0x0166, B:234:0x0724, B:236:0x0732, B:238:0x073b, B:249:0x076f, B:239:0x0745, B:241:0x0750, B:243:0x0756, B:246:0x0762, B:248:0x076a, B:250:0x0772, B:251:0x077e, B:253:0x0784, B:255:0x0796, B:256:0x07a1, B:258:0x07a9, B:262:0x07cf, B:264:0x07e9, B:266:0x07fe, B:268:0x0818, B:270:0x082d, B:271:0x083b, B:273:0x0841, B:275:0x0851, B:276:0x0858, B:278:0x0864, B:279:0x086b, B:280:0x0870, B:282:0x08b2, B:284:0x08b8, B:290:0x08df, B:292:0x08e7, B:293:0x08f0, B:295:0x08f6, B:296:0x08fc, B:298:0x0911, B:300:0x0921, B:302:0x0931, B:304:0x0939, B:305:0x093c, B:313:0x09b0, B:315:0x09c9, B:317:0x09df, B:319:0x09e4, B:321:0x09e8, B:323:0x09ec, B:325:0x09f6, B:326:0x09fc, B:328:0x0a00, B:330:0x0a06, B:332:0x0a17, B:334:0x0a23, B:340:0x0a4b, B:343:0x0a51, B:285:0x08c6, B:287:0x08cc, B:289:0x08d2, B:269:0x082a, B:265:0x07fb, B:259:0x07af, B:261:0x07b5), top: B:479:0x0017, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0400 A[Catch: all -> 0x0103, TryCatch #1 {all -> 0x0103, blocks: (B:3:0x0017, B:5:0x0035, B:8:0x003f, B:9:0x0057, B:12:0x006f, B:15:0x0095, B:17:0x00cc, B:20:0x00dd, B:22:0x00e7, B:231:0x070b, B:27:0x011a, B:30:0x012c, B:32:0x0132, B:47:0x0174, B:49:0x0182, B:52:0x01a2, B:54:0x01a8, B:56:0x01b8, B:58:0x01c6, B:60:0x01d6, B:61:0x01e3, B:62:0x01e6, B:65:0x01fc, B:74:0x022c, B:77:0x0236, B:79:0x0244, B:84:0x028e, B:80:0x025f, B:82:0x026d, B:88:0x0299, B:91:0x02cc, B:92:0x02f6, B:94:0x032f, B:96:0x0335, B:99:0x0341, B:101:0x037a, B:102:0x0395, B:104:0x039b, B:106:0x03ab, B:110:0x03c1, B:107:0x03b5, B:113:0x03c8, B:116:0x03cf, B:117:0x03e7, B:119:0x0400, B:120:0x040c, B:123:0x0418, B:129:0x043b, B:126:0x042a, B:151:0x04bd, B:153:0x04c9, B:156:0x04da, B:158:0x04eb, B:160:0x04f7, B:197:0x05cb, B:199:0x05d1, B:200:0x05dd, B:202:0x05e3, B:204:0x05f3, B:206:0x05fd, B:207:0x0614, B:209:0x061a, B:210:0x0635, B:212:0x063b, B:213:0x0659, B:214:0x0662, B:218:0x068d, B:215:0x0668, B:217:0x067a, B:219:0x0699, B:220:0x06b5, B:222:0x06bb, B:224:0x06ce, B:225:0x06db, B:226:0x06df, B:228:0x06e5, B:230:0x06f7, B:166:0x0517, B:168:0x0523, B:171:0x0536, B:173:0x0547, B:175:0x0553, B:177:0x0563, B:179:0x0572, B:181:0x057e, B:185:0x058d, B:187:0x0597, B:190:0x05a2, B:192:0x05a8, B:194:0x05b8, B:195:0x05c3, B:133:0x0445, B:135:0x0451, B:137:0x045d, B:149:0x04a2, B:141:0x047a, B:144:0x048c, B:146:0x0492, B:148:0x049c, B:36:0x013c, B:38:0x0149, B:40:0x0155, B:42:0x015b, B:46:0x0166, B:234:0x0724, B:236:0x0732, B:238:0x073b, B:249:0x076f, B:239:0x0745, B:241:0x0750, B:243:0x0756, B:246:0x0762, B:248:0x076a, B:250:0x0772, B:251:0x077e, B:253:0x0784, B:255:0x0796, B:256:0x07a1, B:258:0x07a9, B:262:0x07cf, B:264:0x07e9, B:266:0x07fe, B:268:0x0818, B:270:0x082d, B:271:0x083b, B:273:0x0841, B:275:0x0851, B:276:0x0858, B:278:0x0864, B:279:0x086b, B:280:0x0870, B:282:0x08b2, B:284:0x08b8, B:290:0x08df, B:292:0x08e7, B:293:0x08f0, B:295:0x08f6, B:296:0x08fc, B:298:0x0911, B:300:0x0921, B:302:0x0931, B:304:0x0939, B:305:0x093c, B:313:0x09b0, B:315:0x09c9, B:317:0x09df, B:319:0x09e4, B:321:0x09e8, B:323:0x09ec, B:325:0x09f6, B:326:0x09fc, B:328:0x0a00, B:330:0x0a06, B:332:0x0a17, B:334:0x0a23, B:340:0x0a4b, B:343:0x0a51, B:285:0x08c6, B:287:0x08cc, B:289:0x08d2, B:269:0x082a, B:265:0x07fb, B:259:0x07af, B:261:0x07b5), top: B:479:0x0017, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04c9 A[Catch: all -> 0x0103, TryCatch #1 {all -> 0x0103, blocks: (B:3:0x0017, B:5:0x0035, B:8:0x003f, B:9:0x0057, B:12:0x006f, B:15:0x0095, B:17:0x00cc, B:20:0x00dd, B:22:0x00e7, B:231:0x070b, B:27:0x011a, B:30:0x012c, B:32:0x0132, B:47:0x0174, B:49:0x0182, B:52:0x01a2, B:54:0x01a8, B:56:0x01b8, B:58:0x01c6, B:60:0x01d6, B:61:0x01e3, B:62:0x01e6, B:65:0x01fc, B:74:0x022c, B:77:0x0236, B:79:0x0244, B:84:0x028e, B:80:0x025f, B:82:0x026d, B:88:0x0299, B:91:0x02cc, B:92:0x02f6, B:94:0x032f, B:96:0x0335, B:99:0x0341, B:101:0x037a, B:102:0x0395, B:104:0x039b, B:106:0x03ab, B:110:0x03c1, B:107:0x03b5, B:113:0x03c8, B:116:0x03cf, B:117:0x03e7, B:119:0x0400, B:120:0x040c, B:123:0x0418, B:129:0x043b, B:126:0x042a, B:151:0x04bd, B:153:0x04c9, B:156:0x04da, B:158:0x04eb, B:160:0x04f7, B:197:0x05cb, B:199:0x05d1, B:200:0x05dd, B:202:0x05e3, B:204:0x05f3, B:206:0x05fd, B:207:0x0614, B:209:0x061a, B:210:0x0635, B:212:0x063b, B:213:0x0659, B:214:0x0662, B:218:0x068d, B:215:0x0668, B:217:0x067a, B:219:0x0699, B:220:0x06b5, B:222:0x06bb, B:224:0x06ce, B:225:0x06db, B:226:0x06df, B:228:0x06e5, B:230:0x06f7, B:166:0x0517, B:168:0x0523, B:171:0x0536, B:173:0x0547, B:175:0x0553, B:177:0x0563, B:179:0x0572, B:181:0x057e, B:185:0x058d, B:187:0x0597, B:190:0x05a2, B:192:0x05a8, B:194:0x05b8, B:195:0x05c3, B:133:0x0445, B:135:0x0451, B:137:0x045d, B:149:0x04a2, B:141:0x047a, B:144:0x048c, B:146:0x0492, B:148:0x049c, B:36:0x013c, B:38:0x0149, B:40:0x0155, B:42:0x015b, B:46:0x0166, B:234:0x0724, B:236:0x0732, B:238:0x073b, B:249:0x076f, B:239:0x0745, B:241:0x0750, B:243:0x0756, B:246:0x0762, B:248:0x076a, B:250:0x0772, B:251:0x077e, B:253:0x0784, B:255:0x0796, B:256:0x07a1, B:258:0x07a9, B:262:0x07cf, B:264:0x07e9, B:266:0x07fe, B:268:0x0818, B:270:0x082d, B:271:0x083b, B:273:0x0841, B:275:0x0851, B:276:0x0858, B:278:0x0864, B:279:0x086b, B:280:0x0870, B:282:0x08b2, B:284:0x08b8, B:290:0x08df, B:292:0x08e7, B:293:0x08f0, B:295:0x08f6, B:296:0x08fc, B:298:0x0911, B:300:0x0921, B:302:0x0931, B:304:0x0939, B:305:0x093c, B:313:0x09b0, B:315:0x09c9, B:317:0x09df, B:319:0x09e4, B:321:0x09e8, B:323:0x09ec, B:325:0x09f6, B:326:0x09fc, B:328:0x0a00, B:330:0x0a06, B:332:0x0a17, B:334:0x0a23, B:340:0x0a4b, B:343:0x0a51, B:285:0x08c6, B:287:0x08cc, B:289:0x08d2, B:269:0x082a, B:265:0x07fb, B:259:0x07af, B:261:0x07b5), top: B:479:0x0017, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0517 A[Catch: all -> 0x0103, TryCatch #1 {all -> 0x0103, blocks: (B:3:0x0017, B:5:0x0035, B:8:0x003f, B:9:0x0057, B:12:0x006f, B:15:0x0095, B:17:0x00cc, B:20:0x00dd, B:22:0x00e7, B:231:0x070b, B:27:0x011a, B:30:0x012c, B:32:0x0132, B:47:0x0174, B:49:0x0182, B:52:0x01a2, B:54:0x01a8, B:56:0x01b8, B:58:0x01c6, B:60:0x01d6, B:61:0x01e3, B:62:0x01e6, B:65:0x01fc, B:74:0x022c, B:77:0x0236, B:79:0x0244, B:84:0x028e, B:80:0x025f, B:82:0x026d, B:88:0x0299, B:91:0x02cc, B:92:0x02f6, B:94:0x032f, B:96:0x0335, B:99:0x0341, B:101:0x037a, B:102:0x0395, B:104:0x039b, B:106:0x03ab, B:110:0x03c1, B:107:0x03b5, B:113:0x03c8, B:116:0x03cf, B:117:0x03e7, B:119:0x0400, B:120:0x040c, B:123:0x0418, B:129:0x043b, B:126:0x042a, B:151:0x04bd, B:153:0x04c9, B:156:0x04da, B:158:0x04eb, B:160:0x04f7, B:197:0x05cb, B:199:0x05d1, B:200:0x05dd, B:202:0x05e3, B:204:0x05f3, B:206:0x05fd, B:207:0x0614, B:209:0x061a, B:210:0x0635, B:212:0x063b, B:213:0x0659, B:214:0x0662, B:218:0x068d, B:215:0x0668, B:217:0x067a, B:219:0x0699, B:220:0x06b5, B:222:0x06bb, B:224:0x06ce, B:225:0x06db, B:226:0x06df, B:228:0x06e5, B:230:0x06f7, B:166:0x0517, B:168:0x0523, B:171:0x0536, B:173:0x0547, B:175:0x0553, B:177:0x0563, B:179:0x0572, B:181:0x057e, B:185:0x058d, B:187:0x0597, B:190:0x05a2, B:192:0x05a8, B:194:0x05b8, B:195:0x05c3, B:133:0x0445, B:135:0x0451, B:137:0x045d, B:149:0x04a2, B:141:0x047a, B:144:0x048c, B:146:0x0492, B:148:0x049c, B:36:0x013c, B:38:0x0149, B:40:0x0155, B:42:0x015b, B:46:0x0166, B:234:0x0724, B:236:0x0732, B:238:0x073b, B:249:0x076f, B:239:0x0745, B:241:0x0750, B:243:0x0756, B:246:0x0762, B:248:0x076a, B:250:0x0772, B:251:0x077e, B:253:0x0784, B:255:0x0796, B:256:0x07a1, B:258:0x07a9, B:262:0x07cf, B:264:0x07e9, B:266:0x07fe, B:268:0x0818, B:270:0x082d, B:271:0x083b, B:273:0x0841, B:275:0x0851, B:276:0x0858, B:278:0x0864, B:279:0x086b, B:280:0x0870, B:282:0x08b2, B:284:0x08b8, B:290:0x08df, B:292:0x08e7, B:293:0x08f0, B:295:0x08f6, B:296:0x08fc, B:298:0x0911, B:300:0x0921, B:302:0x0931, B:304:0x0939, B:305:0x093c, B:313:0x09b0, B:315:0x09c9, B:317:0x09df, B:319:0x09e4, B:321:0x09e8, B:323:0x09ec, B:325:0x09f6, B:326:0x09fc, B:328:0x0a00, B:330:0x0a06, B:332:0x0a17, B:334:0x0a23, B:340:0x0a4b, B:343:0x0a51, B:285:0x08c6, B:287:0x08cc, B:289:0x08d2, B:269:0x082a, B:265:0x07fb, B:259:0x07af, B:261:0x07b5), top: B:479:0x0017, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x05d1 A[Catch: all -> 0x0103, TryCatch #1 {all -> 0x0103, blocks: (B:3:0x0017, B:5:0x0035, B:8:0x003f, B:9:0x0057, B:12:0x006f, B:15:0x0095, B:17:0x00cc, B:20:0x00dd, B:22:0x00e7, B:231:0x070b, B:27:0x011a, B:30:0x012c, B:32:0x0132, B:47:0x0174, B:49:0x0182, B:52:0x01a2, B:54:0x01a8, B:56:0x01b8, B:58:0x01c6, B:60:0x01d6, B:61:0x01e3, B:62:0x01e6, B:65:0x01fc, B:74:0x022c, B:77:0x0236, B:79:0x0244, B:84:0x028e, B:80:0x025f, B:82:0x026d, B:88:0x0299, B:91:0x02cc, B:92:0x02f6, B:94:0x032f, B:96:0x0335, B:99:0x0341, B:101:0x037a, B:102:0x0395, B:104:0x039b, B:106:0x03ab, B:110:0x03c1, B:107:0x03b5, B:113:0x03c8, B:116:0x03cf, B:117:0x03e7, B:119:0x0400, B:120:0x040c, B:123:0x0418, B:129:0x043b, B:126:0x042a, B:151:0x04bd, B:153:0x04c9, B:156:0x04da, B:158:0x04eb, B:160:0x04f7, B:197:0x05cb, B:199:0x05d1, B:200:0x05dd, B:202:0x05e3, B:204:0x05f3, B:206:0x05fd, B:207:0x0614, B:209:0x061a, B:210:0x0635, B:212:0x063b, B:213:0x0659, B:214:0x0662, B:218:0x068d, B:215:0x0668, B:217:0x067a, B:219:0x0699, B:220:0x06b5, B:222:0x06bb, B:224:0x06ce, B:225:0x06db, B:226:0x06df, B:228:0x06e5, B:230:0x06f7, B:166:0x0517, B:168:0x0523, B:171:0x0536, B:173:0x0547, B:175:0x0553, B:177:0x0563, B:179:0x0572, B:181:0x057e, B:185:0x058d, B:187:0x0597, B:190:0x05a2, B:192:0x05a8, B:194:0x05b8, B:195:0x05c3, B:133:0x0445, B:135:0x0451, B:137:0x045d, B:149:0x04a2, B:141:0x047a, B:144:0x048c, B:146:0x0492, B:148:0x049c, B:36:0x013c, B:38:0x0149, B:40:0x0155, B:42:0x015b, B:46:0x0166, B:234:0x0724, B:236:0x0732, B:238:0x073b, B:249:0x076f, B:239:0x0745, B:241:0x0750, B:243:0x0756, B:246:0x0762, B:248:0x076a, B:250:0x0772, B:251:0x077e, B:253:0x0784, B:255:0x0796, B:256:0x07a1, B:258:0x07a9, B:262:0x07cf, B:264:0x07e9, B:266:0x07fe, B:268:0x0818, B:270:0x082d, B:271:0x083b, B:273:0x0841, B:275:0x0851, B:276:0x0858, B:278:0x0864, B:279:0x086b, B:280:0x0870, B:282:0x08b2, B:284:0x08b8, B:290:0x08df, B:292:0x08e7, B:293:0x08f0, B:295:0x08f6, B:296:0x08fc, B:298:0x0911, B:300:0x0921, B:302:0x0931, B:304:0x0939, B:305:0x093c, B:313:0x09b0, B:315:0x09c9, B:317:0x09df, B:319:0x09e4, B:321:0x09e8, B:323:0x09ec, B:325:0x09f6, B:326:0x09fc, B:328:0x0a00, B:330:0x0a06, B:332:0x0a17, B:334:0x0a23, B:340:0x0a4b, B:343:0x0a51, B:285:0x08c6, B:287:0x08cc, B:289:0x08d2, B:269:0x082a, B:265:0x07fb, B:259:0x07af, B:261:0x07b5), top: B:479:0x0017, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0745 A[Catch: all -> 0x0103, TryCatch #1 {all -> 0x0103, blocks: (B:3:0x0017, B:5:0x0035, B:8:0x003f, B:9:0x0057, B:12:0x006f, B:15:0x0095, B:17:0x00cc, B:20:0x00dd, B:22:0x00e7, B:231:0x070b, B:27:0x011a, B:30:0x012c, B:32:0x0132, B:47:0x0174, B:49:0x0182, B:52:0x01a2, B:54:0x01a8, B:56:0x01b8, B:58:0x01c6, B:60:0x01d6, B:61:0x01e3, B:62:0x01e6, B:65:0x01fc, B:74:0x022c, B:77:0x0236, B:79:0x0244, B:84:0x028e, B:80:0x025f, B:82:0x026d, B:88:0x0299, B:91:0x02cc, B:92:0x02f6, B:94:0x032f, B:96:0x0335, B:99:0x0341, B:101:0x037a, B:102:0x0395, B:104:0x039b, B:106:0x03ab, B:110:0x03c1, B:107:0x03b5, B:113:0x03c8, B:116:0x03cf, B:117:0x03e7, B:119:0x0400, B:120:0x040c, B:123:0x0418, B:129:0x043b, B:126:0x042a, B:151:0x04bd, B:153:0x04c9, B:156:0x04da, B:158:0x04eb, B:160:0x04f7, B:197:0x05cb, B:199:0x05d1, B:200:0x05dd, B:202:0x05e3, B:204:0x05f3, B:206:0x05fd, B:207:0x0614, B:209:0x061a, B:210:0x0635, B:212:0x063b, B:213:0x0659, B:214:0x0662, B:218:0x068d, B:215:0x0668, B:217:0x067a, B:219:0x0699, B:220:0x06b5, B:222:0x06bb, B:224:0x06ce, B:225:0x06db, B:226:0x06df, B:228:0x06e5, B:230:0x06f7, B:166:0x0517, B:168:0x0523, B:171:0x0536, B:173:0x0547, B:175:0x0553, B:177:0x0563, B:179:0x0572, B:181:0x057e, B:185:0x058d, B:187:0x0597, B:190:0x05a2, B:192:0x05a8, B:194:0x05b8, B:195:0x05c3, B:133:0x0445, B:135:0x0451, B:137:0x045d, B:149:0x04a2, B:141:0x047a, B:144:0x048c, B:146:0x0492, B:148:0x049c, B:36:0x013c, B:38:0x0149, B:40:0x0155, B:42:0x015b, B:46:0x0166, B:234:0x0724, B:236:0x0732, B:238:0x073b, B:249:0x076f, B:239:0x0745, B:241:0x0750, B:243:0x0756, B:246:0x0762, B:248:0x076a, B:250:0x0772, B:251:0x077e, B:253:0x0784, B:255:0x0796, B:256:0x07a1, B:258:0x07a9, B:262:0x07cf, B:264:0x07e9, B:266:0x07fe, B:268:0x0818, B:270:0x082d, B:271:0x083b, B:273:0x0841, B:275:0x0851, B:276:0x0858, B:278:0x0864, B:279:0x086b, B:280:0x0870, B:282:0x08b2, B:284:0x08b8, B:290:0x08df, B:292:0x08e7, B:293:0x08f0, B:295:0x08f6, B:296:0x08fc, B:298:0x0911, B:300:0x0921, B:302:0x0931, B:304:0x0939, B:305:0x093c, B:313:0x09b0, B:315:0x09c9, B:317:0x09df, B:319:0x09e4, B:321:0x09e8, B:323:0x09ec, B:325:0x09f6, B:326:0x09fc, B:328:0x0a00, B:330:0x0a06, B:332:0x0a17, B:334:0x0a23, B:340:0x0a4b, B:343:0x0a51, B:285:0x08c6, B:287:0x08cc, B:289:0x08d2, B:269:0x082a, B:265:0x07fb, B:259:0x07af, B:261:0x07b5), top: B:479:0x0017, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0a87 A[Catch: all -> 0x0ab8, TryCatch #3 {all -> 0x0ab8, blocks: (B:307:0x097e, B:308:0x0991, B:310:0x0997, B:407:0x0c60, B:338:0x0a35, B:345:0x0a65, B:347:0x0a87, B:348:0x0a8f, B:350:0x0a95, B:352:0x0aa7, B:360:0x0ac2, B:362:0x0ad6, B:364:0x0aff, B:366:0x0b0b, B:368:0x0b1f, B:370:0x0b60, B:376:0x0b7a, B:378:0x0b85, B:380:0x0b89, B:382:0x0b8d, B:384:0x0b91, B:385:0x0b9d, B:386:0x0ba2, B:388:0x0ba8, B:390:0x0bbe, B:391:0x0bc3, B:406:0x0c5b, B:392:0x0bdc, B:394:0x0be0, B:398:0x0c09, B:400:0x0c2d, B:401:0x0c34, B:405:0x0c4e, B:395:0x0bf0, B:408:0x0c6e, B:410:0x0c7c, B:411:0x0c82, B:412:0x0c8a, B:414:0x0c90, B:417:0x0ca9, B:419:0x0cb9, B:440:0x0d37, B:421:0x0cd2, B:423:0x0cd8, B:425:0x0ce0, B:427:0x0ce7, B:433:0x0cf5, B:435:0x0cfc, B:437:0x0d28, B:439:0x0d2f, B:438:0x0d2c, B:434:0x0cf9, B:426:0x0ce4), top: B:483:0x097e }] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0ac0 A[PHI: r10
  0x0ac0: PHI (r10v6 ??) = (r10v5 ??), (r10v19 ??) binds: [B:346:0x0a85, B:539:0x0ac0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0ad6 A[Catch: all -> 0x0ab8, TryCatch #3 {all -> 0x0ab8, blocks: (B:307:0x097e, B:308:0x0991, B:310:0x0997, B:407:0x0c60, B:338:0x0a35, B:345:0x0a65, B:347:0x0a87, B:348:0x0a8f, B:350:0x0a95, B:352:0x0aa7, B:360:0x0ac2, B:362:0x0ad6, B:364:0x0aff, B:366:0x0b0b, B:368:0x0b1f, B:370:0x0b60, B:376:0x0b7a, B:378:0x0b85, B:380:0x0b89, B:382:0x0b8d, B:384:0x0b91, B:385:0x0b9d, B:386:0x0ba2, B:388:0x0ba8, B:390:0x0bbe, B:391:0x0bc3, B:406:0x0c5b, B:392:0x0bdc, B:394:0x0be0, B:398:0x0c09, B:400:0x0c2d, B:401:0x0c34, B:405:0x0c4e, B:395:0x0bf0, B:408:0x0c6e, B:410:0x0c7c, B:411:0x0c82, B:412:0x0c8a, B:414:0x0c90, B:417:0x0ca9, B:419:0x0cb9, B:440:0x0d37, B:421:0x0cd2, B:423:0x0cd8, B:425:0x0ce0, B:427:0x0ce7, B:433:0x0cf5, B:435:0x0cfc, B:437:0x0d28, B:439:0x0d2f, B:438:0x0d2c, B:434:0x0cf9, B:426:0x0ce4), top: B:483:0x097e }] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0aff A[Catch: all -> 0x0ab8, TryCatch #3 {all -> 0x0ab8, blocks: (B:307:0x097e, B:308:0x0991, B:310:0x0997, B:407:0x0c60, B:338:0x0a35, B:345:0x0a65, B:347:0x0a87, B:348:0x0a8f, B:350:0x0a95, B:352:0x0aa7, B:360:0x0ac2, B:362:0x0ad6, B:364:0x0aff, B:366:0x0b0b, B:368:0x0b1f, B:370:0x0b60, B:376:0x0b7a, B:378:0x0b85, B:380:0x0b89, B:382:0x0b8d, B:384:0x0b91, B:385:0x0b9d, B:386:0x0ba2, B:388:0x0ba8, B:390:0x0bbe, B:391:0x0bc3, B:406:0x0c5b, B:392:0x0bdc, B:394:0x0be0, B:398:0x0c09, B:400:0x0c2d, B:401:0x0c34, B:405:0x0c4e, B:395:0x0bf0, B:408:0x0c6e, B:410:0x0c7c, B:411:0x0c82, B:412:0x0c8a, B:414:0x0c90, B:417:0x0ca9, B:419:0x0cb9, B:440:0x0d37, B:421:0x0cd2, B:423:0x0cd8, B:425:0x0ce0, B:427:0x0ce7, B:433:0x0cf5, B:435:0x0cfc, B:437:0x0d28, B:439:0x0d2f, B:438:0x0d2c, B:434:0x0cf9, B:426:0x0ce4), top: B:483:0x097e }] */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0d3d  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0d9f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0dbe  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0df3 A[Catch: all -> 0x0d63, TryCatch #0 {all -> 0x0d63, blocks: (B:443:0x0d3f, B:445:0x0d54, B:448:0x0d5b, B:455:0x0d8f, B:457:0x0da1, B:458:0x0db8, B:461:0x0dc0, B:462:0x0dc5, B:463:0x0dd7, B:465:0x0df3, B:466:0x0e0e, B:467:0x0e16, B:471:0x0e34, B:470:0x0e21, B:451:0x0d66, B:453:0x0d72, B:454:0x0d78, B:472:0x0e3e), top: B:478:0x0033, inners: #2 }] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v45 */
    /* JADX WARN: Type inference failed for: r10v46 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v117 */
    /* JADX WARN: Type inference failed for: r2v127 */
    /* JADX WARN: Type inference failed for: r2v128 */
    /* JADX WARN: Type inference failed for: r2v129 */
    /* JADX WARN: Type inference failed for: r2v130 */
    /* JADX WARN: Type inference failed for: r2v131 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.measurement.internal.zzpg] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.google.android.gms.measurement.internal.zzpg] */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52, types: [com.google.android.gms.measurement.internal.zzpg] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v78 */
    /* JADX WARN: Type inference failed for: r7v79 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v80 */
    /* JADX WARN: Type inference failed for: r7v81 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzaG(java.lang.String r46, long r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpg.zzaG(java.lang.String, long):boolean");
    }

    @VisibleForTesting
    private final void zzaH(com.google.android.gms.internal.measurement.zzic zzicVar, long j, boolean z4) {
        Object obj;
        String str = true != z4 ? "_lte" : "_se";
        zzpn zzpnVarZzm = zzj().zzm(zzicVar.zzK(), str);
        zzpn zzpnVar = (zzpnVarZzm == null || (obj = zzpnVarZzm.zze) == null) ? new zzpn(zzicVar.zzK(), TtmlNode.TEXT_EMPHASIS_AUTO, str, zzaZ().currentTimeMillis(), Long.valueOf(j)) : new zzpn(zzicVar.zzK(), TtmlNode.TEXT_EMPHASIS_AUTO, str, zzaZ().currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j));
        com.google.android.gms.internal.measurement.zzit zzitVarZzm = com.google.android.gms.internal.measurement.zziu.zzm();
        zzitVarZzm.zzb(str);
        zzitVarZzm.zza(zzaZ().currentTimeMillis());
        Object obj2 = zzpnVar.zze;
        zzitVarZzm.zze(((Long) obj2).longValue());
        com.google.android.gms.internal.measurement.zziu zziuVar = (com.google.android.gms.internal.measurement.zziu) zzitVarZzm.zzbc();
        int iZzx = zzpk.zzx(zzicVar, str);
        if (iZzx >= 0) {
            zzicVar.zzn(iZzx, zziuVar);
        } else {
            zzicVar.zzo(zziuVar);
        }
        if (j > 0) {
            zzj().zzl(zzpnVar);
            zzaV().zzk().zzc("Updated engagement user property. scope, value", true != z4 ? "lifetime" : "session-scoped", obj2);
        }
    }

    private final boolean zzaI(com.google.android.gms.internal.measurement.zzhr zzhrVar, com.google.android.gms.internal.measurement.zzhr zzhrVar2) {
        Preconditions.checkArgument("_e".equals(zzhrVar.zzk()));
        zzp();
        com.google.android.gms.internal.measurement.zzhw zzhwVarZzF = zzpk.zzF((com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbc(), "_sc");
        String strZzd = zzhwVarZzF == null ? null : zzhwVarZzF.zzd();
        zzp();
        com.google.android.gms.internal.measurement.zzhw zzhwVarZzF2 = zzpk.zzF((com.google.android.gms.internal.measurement.zzhs) zzhrVar2.zzbc(), "_pc");
        String strZzd2 = zzhwVarZzF2 != null ? zzhwVarZzF2.zzd() : null;
        if (strZzd2 == null || !strZzd2.equals(strZzd)) {
            return false;
        }
        Preconditions.checkArgument("_e".equals(zzhrVar.zzk()));
        zzp();
        com.google.android.gms.internal.measurement.zzhw zzhwVarZzF3 = zzpk.zzF((com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbc(), "_et");
        if (zzhwVarZzF3 == null || !zzhwVarZzF3.zze() || zzhwVarZzF3.zzf() <= 0) {
            return true;
        }
        long jZzf = zzhwVarZzF3.zzf();
        zzp();
        com.google.android.gms.internal.measurement.zzhw zzhwVarZzF4 = zzpk.zzF((com.google.android.gms.internal.measurement.zzhs) zzhrVar2.zzbc(), "_et");
        if (zzhwVarZzF4 != null && zzhwVarZzF4.zzf() > 0) {
            jZzf += zzhwVarZzF4.zzf();
        }
        zzp();
        zzpk.zzC(zzhrVar2, "_et", Long.valueOf(jZzf));
        zzp();
        zzpk.zzC(zzhrVar, "_fr", 1L);
        return true;
    }

    private final boolean zzaJ() {
        zzaW().zzg();
        zzu();
        return zzj().zzP() || !TextUtils.isEmpty(zzj().zzF());
    }

    private static String zzaK(Map map, String str) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    @WorkerThread
    private final void zzaL() {
        long jMax;
        long jMax2;
        zzaW().zzg();
        zzu();
        if (this.zza > 0) {
            long jAbs = 3600000 - Math.abs(zzaZ().elapsedRealtime() - this.zza);
            if (jAbs > 0) {
                zzaV().zzk().zzb("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(jAbs));
                zzk().zzb();
                zzl().zzd();
                return;
            }
            this.zza = 0L;
        }
        if (!this.zzn.zzH() || !zzaJ()) {
            zzaV().zzk().zza("Nothing to upload or uploading impossible");
            zzk().zzb();
            zzl().zzd();
            return;
        }
        long jCurrentTimeMillis = zzaZ().currentTimeMillis();
        zzd();
        long jMax3 = Math.max(0L, ((Long) zzfy.zzO.zzb(null)).longValue());
        boolean z4 = true;
        if (!zzj().zzR() && !zzj().zzG()) {
            z4 = false;
        }
        if (z4) {
            String strZzA = zzd().zzA();
            if (TextUtils.isEmpty(strZzA) || ".none.".equals(strZzA)) {
                zzd();
                jMax = Math.max(0L, ((Long) zzfy.zzI.zzb(null)).longValue());
            } else {
                zzd();
                jMax = Math.max(0L, ((Long) zzfy.zzJ.zzb(null)).longValue());
            }
        } else {
            zzd();
            jMax = Math.max(0L, ((Long) zzfy.zzH.zzb(null)).longValue());
        }
        long jZza = this.zzk.zzd.zza();
        long jZza2 = this.zzk.zze.zza();
        long j = 0;
        boolean z5 = z4;
        long jMax4 = Math.max(zzj().zzM(), zzj().zzO());
        if (jMax4 == 0) {
            jMax2 = 0;
        } else {
            long jAbs2 = jCurrentTimeMillis - Math.abs(jMax4 - jCurrentTimeMillis);
            long jAbs3 = jCurrentTimeMillis - Math.abs(jZza - jCurrentTimeMillis);
            long jAbs4 = jCurrentTimeMillis - Math.abs(jZza2 - jCurrentTimeMillis);
            jMax2 = jMax3 + jAbs2;
            long jMax5 = Math.max(jAbs3, jAbs4);
            if (z5 && jMax5 > 0) {
                jMax2 = Math.min(jAbs2, jMax5) + jMax;
            }
            if (!zzp().zzs(jMax5, jMax)) {
                jMax2 = jMax5 + jMax;
            }
            if (jAbs4 != 0 && jAbs4 >= jAbs2) {
                int i = 0;
                while (true) {
                    zzd();
                    if (i >= Math.min(20, Math.max(0, ((Integer) zzfy.zzQ.zzb(null)).intValue()))) {
                        jMax2 = 0;
                        break;
                    }
                    zzd();
                    jMax2 += Math.max(j, ((Long) zzfy.zzP.zzb(null)).longValue()) * (1 << i);
                    if (jMax2 > jAbs4) {
                        break;
                    }
                    i++;
                    j = 0;
                }
            }
            j = 0;
        }
        if (jMax2 == j) {
            zzaV().zzk().zza("Next upload time is 0");
            zzk().zzb();
            zzl().zzd();
            return;
        }
        if (!zzi().zzb()) {
            zzaV().zzk().zza("No network");
            zzk().zza();
            zzl().zzd();
            return;
        }
        long jZza3 = this.zzk.zzc.zza();
        zzd();
        long jMax6 = Math.max(0L, ((Long) zzfy.zzF.zzb(null)).longValue());
        if (!zzp().zzs(jZza3, jMax6)) {
            jMax2 = Math.max(jMax2, jZza3 + jMax6);
        }
        zzk().zzb();
        long jCurrentTimeMillis2 = jMax2 - zzaZ().currentTimeMillis();
        if (jCurrentTimeMillis2 <= 0) {
            zzd();
            jCurrentTimeMillis2 = Math.max(0L, ((Long) zzfy.zzK.zzb(null)).longValue());
            this.zzk.zzd.zzb(zzaZ().currentTimeMillis());
        }
        zzaV().zzk().zzb("Upload scheduled in approximately ms", Long.valueOf(jCurrentTimeMillis2));
        zzl().zzc(jCurrentTimeMillis2);
    }

    @WorkerThread
    private final void zzaM() {
        zzaW().zzg();
        if (this.zzu || this.zzv || this.zzw) {
            zzaV().zzk().zzd("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv), Boolean.valueOf(this.zzw));
            return;
        }
        zzaV().zzk().zza("Stopping uploading service(s)");
        List list = this.zzq;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((List) Preconditions.checkNotNull(this.zzq)).clear();
    }

    @WorkerThread
    private final Boolean zzaN(zzh zzhVar) {
        try {
            if (zzhVar.zzt() != -2147483648L) {
                if (zzhVar.zzt() == Wrappers.packageManager(this.zzn.zzaY()).getPackageInfo(zzhVar.zzc(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = Wrappers.packageManager(this.zzn.zzaY()).getPackageInfo(zzhVar.zzc(), 0).versionName;
                String strZzr = zzhVar.zzr();
                if (strZzr != null && strZzr.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @WorkerThread
    private final zzr zzaO(String str) {
        zzh zzhVarZzu = zzj().zzu(str);
        if (zzhVarZzu == null || TextUtils.isEmpty(zzhVarZzu.zzr())) {
            zzaV().zzj().zzb("No app data available; dropping", str);
            return null;
        }
        Boolean boolZzaN = zzaN(zzhVarZzu);
        if (boolZzaN == null || boolZzaN.booleanValue()) {
            return new zzr(str, zzhVarZzu.zzf(), zzhVarZzu.zzr(), zzhVarZzu.zzt(), zzhVarZzu.zzv(), zzhVarZzu.zzx(), zzhVarZzu.zzz(), (String) null, zzhVarZzu.zzD(), false, zzhVarZzu.zzl(), 0L, 0, zzhVarZzu.zzac(), false, zzhVarZzu.zzae(), zzhVarZzu.zzB(), zzhVarZzu.zzag(), zzB(str).zzl(), "", (String) null, zzhVarZzu.zzai(), zzhVarZzu.zzak(), zzB(str).zzb(), zzx(str).zze(), zzhVarZzu.zzao(), zzhVarZzu.zzaw(), zzhVarZzu.zzay(), zzhVarZzu.zzaH(), 0L, zzhVarZzu.zzaL());
        }
        zzaV().zzb().zzb("App version does not match; dropping. appId", zzgu.zzl(str));
        return null;
    }

    @WorkerThread
    private final boolean zzaP(String str, String str2) {
        zzbc zzbcVarZzf = zzj().zzf(str, str2);
        return zzbcVarZzf == null || zzbcVarZzf.zzc < 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzaQ(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT < 34) {
            kKDWJ7.sendBroadcast(context, intent);
        } else {
            context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
    }

    private static final boolean zzaR(zzr zzrVar) {
        return !TextUtils.isEmpty(zzrVar.zzb);
    }

    private static final zzos zzaS(zzos zzosVar) {
        if (zzosVar == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (zzosVar.zzav()) {
            return zzosVar;
        }
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzosVar.getClass())));
    }

    private static final Boolean zzaT(zzr zzrVar) {
        Boolean bool = zzrVar.zzp;
        String str = zzrVar.zzC;
        if (!TextUtils.isEmpty(str)) {
            zzji zzjiVarZza = zze.zzc(str).zza();
            zzji zzjiVar = zzji.UNINITIALIZED;
            int iOrdinal = zzjiVarZza.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                return null;
            }
            if (iOrdinal == 2) {
                return Boolean.TRUE;
            }
            if (iOrdinal == 3) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    @WorkerThread
    public final void zzA(String str, zzjl zzjlVar) {
        zzaW().zzg();
        zzu();
        this.zzC.put(str, zzjlVar);
        zzj().zzZ(str, zzjlVar);
    }

    @WorkerThread
    public final zzjl zzB(String str) {
        zzjl zzjlVar = zzjl.zza;
        zzaW().zzg();
        zzu();
        zzjl zzjlVarZzX = (zzjl) this.zzC.get(str);
        if (zzjlVarZzX == null) {
            zzjlVarZzX = zzj().zzX(str);
            if (zzjlVarZzX == null) {
                zzjlVarZzX = zzjl.zza;
            }
            zzA(str, zzjlVarZzX);
        }
        return zzjlVarZzX;
    }

    public final long zzC() {
        long jCurrentTimeMillis = zzaZ().currentTimeMillis();
        zznn zznnVar = this.zzk;
        zznnVar.zzaw();
        zznnVar.zzg();
        zzhe zzheVar = zznnVar.zzf;
        long jZza = zzheVar.zza();
        if (jZza == 0) {
            jZza = ((long) zznnVar.zzu.zzk().zzf().nextInt(DateTimeConstants.MILLIS_PER_DAY)) + 1;
            zzheVar.zzb(jZza);
        }
        return ((((jCurrentTimeMillis + jZza) / 1000) / 60) / 60) / 24;
    }

    @WorkerThread
    public final void zzD(zzbg zzbgVar, String str) {
        zzh zzhVarZzu = zzj().zzu(str);
        if (zzhVarZzu == null || TextUtils.isEmpty(zzhVarZzu.zzr())) {
            zzaV().zzj().zzb("No app data available; dropping event", str);
            return;
        }
        Boolean boolZzaN = zzaN(zzhVarZzu);
        if (boolZzaN == null) {
            if (!"_ui".equals(zzbgVar.zza)) {
                zzaV().zze().zzb("Could not find package. appId", zzgu.zzl(str));
            }
        } else if (!boolZzaN.booleanValue()) {
            zzaV().zzb().zzb("App version does not match; dropping event. appId", zzgu.zzl(str));
            return;
        }
        zzE(zzbgVar, new zzr(str, zzhVarZzu.zzf(), zzhVarZzu.zzr(), zzhVarZzu.zzt(), zzhVarZzu.zzv(), zzhVarZzu.zzx(), zzhVarZzu.zzz(), (String) null, zzhVarZzu.zzD(), false, zzhVarZzu.zzl(), 0L, 0, zzhVarZzu.zzac(), false, zzhVarZzu.zzae(), zzhVarZzu.zzB(), zzhVarZzu.zzag(), zzB(str).zzl(), "", (String) null, zzhVarZzu.zzai(), zzhVarZzu.zzak(), zzB(str).zzb(), zzx(str).zze(), zzhVarZzu.zzao(), zzhVarZzu.zzaw(), zzhVarZzu.zzay(), zzhVarZzu.zzaH(), 0L, zzhVarZzu.zzaL()));
    }

    @WorkerThread
    public final void zzE(zzbg zzbgVar, zzr zzrVar) {
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
        zzgv zzgvVarZza = zzgv.zza(zzbgVar);
        zzt().zzI(zzgvVarZza.zzd, zzj().zzU(str));
        zzt().zzG(zzgvVarZza, zzd().zzd(str));
        zzbg zzbgVarZzb = zzgvVarZza.zzb();
        if (!zzd().zzp(null, zzfy.zzbf) && "_cmp".equals(zzbgVarZzb.zza)) {
            zzbe zzbeVar = zzbgVarZzb.zzb;
            if ("referrer API v2".equals(zzbeVar.zzd("_cis"))) {
                String strZzd = zzbeVar.zzd("gclid");
                if (!TextUtils.isEmpty(strZzd)) {
                    zzac(new zzpl("_lgclid", zzbgVarZzb.zzd, strZzd, TtmlNode.TEXT_EMPHASIS_AUTO), zzrVar);
                }
            }
        }
        zzF(zzbgVarZzb, zzrVar);
    }

    @WorkerThread
    public final void zzF(zzbg zzbgVar, zzr zzrVar) {
        zzbg zzbgVar2;
        List<zzah> listZzt;
        List<zzah> listZzt2;
        List<zzah> listZzt3;
        String str;
        Preconditions.checkNotNull(zzrVar);
        String str2 = zzrVar.zza;
        Preconditions.checkNotEmpty(str2);
        zzaW().zzg();
        zzu();
        long j = zzbgVar.zzd;
        zzgv zzgvVarZza = zzgv.zza(zzbgVar);
        zzaW().zzg();
        zzpp.zzav((this.zzG == null || (str = this.zzH) == null || !str.equals(str2)) ? null : this.zzG, zzgvVarZza.zzd, false);
        zzbg zzbgVarZzb = zzgvVarZza.zzb();
        zzp();
        if (zzpk.zzD(zzbgVarZzb, zzrVar)) {
            if (!zzrVar.zzh) {
                zzao(zzrVar);
                return;
            }
            List list = zzrVar.zzr;
            if (list != null) {
                String str3 = zzbgVarZzb.zza;
                if (!list.contains(str3)) {
                    zzaV().zzj().zzd("Dropping non-safelisted event. appId, event name, origin", str2, zzbgVarZzb.zza, zzbgVarZzb.zzc);
                    return;
                } else {
                    Bundle bundleZzf = zzbgVarZzb.zzb.zzf();
                    bundleZzf.putLong("ga_safelisted", 1L);
                    zzbgVar2 = new zzbg(str3, new zzbe(bundleZzf), zzbgVarZzb.zzc, zzbgVarZzb.zzd);
                }
            } else {
                zzbgVar2 = zzbgVarZzb;
            }
            zzj().zzb();
            try {
                String str4 = zzbgVar2.zza;
                if ("_s".equals(str4) && !zzj().zzQ(str2, "_s") && zzbgVar2.zzb.zzb("_sid").longValue() != 0) {
                    if (zzj().zzQ(str2, "_f") || zzj().zzQ(str2, "_v")) {
                        zzj().zzW(str2, null, "_sid", zzG(str2, zzbgVar2));
                    } else {
                        zzj().zzW(str2, Long.valueOf(zzaZ().currentTimeMillis() - 15000), "_sid", zzG(str2, zzbgVar2));
                    }
                }
                zzav zzavVarZzj = zzj();
                Preconditions.checkNotEmpty(str2);
                zzavVarZzj.zzg();
                zzavVarZzj.zzaw();
                if (j < 0) {
                    zzavVarZzj.zzu.zzaV().zze().zzc("Invalid time querying timed out conditional properties", zzgu.zzl(str2), Long.valueOf(j));
                    listZzt = Collections.EMPTY_LIST;
                } else {
                    listZzt = zzavVarZzj.zzt("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                }
                for (zzah zzahVar : listZzt) {
                    if (zzahVar != null) {
                        zzaV().zzk().zzd("User property timed out", zzahVar.zza, this.zzn.zzl().zzc(zzahVar.zzc.zzb), zzahVar.zzc.zza());
                        zzbg zzbgVar3 = zzahVar.zzg;
                        if (zzbgVar3 != null) {
                            zzH(new zzbg(zzbgVar3, j), zzrVar);
                        }
                        zzj().zzr(str2, zzahVar.zzc.zzb);
                    }
                }
                zzav zzavVarZzj2 = zzj();
                Preconditions.checkNotEmpty(str2);
                zzavVarZzj2.zzg();
                zzavVarZzj2.zzaw();
                if (j < 0) {
                    zzavVarZzj2.zzu.zzaV().zze().zzc("Invalid time querying expired conditional properties", zzgu.zzl(str2), Long.valueOf(j));
                    listZzt2 = Collections.EMPTY_LIST;
                } else {
                    listZzt2 = zzavVarZzj2.zzt("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(listZzt2.size());
                for (zzah zzahVar2 : listZzt2) {
                    if (zzahVar2 != null) {
                        zzaV().zzk().zzd("User property expired", zzahVar2.zza, this.zzn.zzl().zzc(zzahVar2.zzc.zzb), zzahVar2.zzc.zza());
                        zzj().zzk(str2, zzahVar2.zzc.zzb);
                        zzbg zzbgVar4 = zzahVar2.zzk;
                        if (zzbgVar4 != null) {
                            arrayList.add(zzbgVar4);
                        }
                        zzj().zzr(str2, zzahVar2.zzc.zzb);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzH(new zzbg((zzbg) it.next(), j), zzrVar);
                }
                zzav zzavVarZzj3 = zzj();
                Preconditions.checkNotEmpty(str2);
                Preconditions.checkNotEmpty(str4);
                zzavVarZzj3.zzg();
                zzavVarZzj3.zzaw();
                if (j < 0) {
                    zzic zzicVar = zzavVarZzj3.zzu;
                    zzicVar.zzaV().zze().zzd("Invalid time querying triggered conditional properties", zzgu.zzl(str2), zzicVar.zzl().zza(str4), Long.valueOf(j));
                    listZzt3 = Collections.EMPTY_LIST;
                } else {
                    listZzt3 = zzavVarZzj3.zzt("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j)});
                }
                ArrayList arrayList2 = new ArrayList(listZzt3.size());
                for (zzah zzahVar3 : listZzt3) {
                    if (zzahVar3 != null) {
                        zzpl zzplVar = zzahVar3.zzc;
                        zzpn zzpnVar = new zzpn((String) Preconditions.checkNotNull(zzahVar3.zza), zzahVar3.zzb, zzplVar.zzb, j, Preconditions.checkNotNull(zzplVar.zza()));
                        if (zzj().zzl(zzpnVar)) {
                            zzaV().zzk().zzd("User property triggered", zzahVar3.zza, this.zzn.zzl().zzc(zzpnVar.zzc), zzpnVar.zze);
                        } else {
                            zzaV().zzb().zzd("Too many active user properties, ignoring", zzgu.zzl(zzahVar3.zza), this.zzn.zzl().zzc(zzpnVar.zzc), zzpnVar.zze);
                        }
                        zzbg zzbgVar5 = zzahVar3.zzi;
                        if (zzbgVar5 != null) {
                            arrayList2.add(zzbgVar5);
                        }
                        zzahVar3.zzc = new zzpl(zzpnVar);
                        zzahVar3.zze = true;
                        zzj().zzp(zzahVar3);
                    }
                }
                zzH(zzbgVar2, zzrVar);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    zzH(new zzbg((zzbg) it2.next(), j), zzrVar);
                }
                zzj().zzc();
                zzj().zzd();
            } catch (Throwable th2) {
                zzj().zzd();
                throw th2;
            }
        }
    }

    public final Bundle zzG(String str, zzbg zzbgVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", zzbgVar.zzb.zzb("_sid").longValue());
        zzpn zzpnVarZzm = zzj().zzm(str, "_sno");
        if (zzpnVarZzm != null) {
            Object obj = zzpnVarZzm.zze;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0366 A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:36:0x0155, B:39:0x0164, B:41:0x016c, B:47:0x0179, B:89:0x02f2, B:98:0x0325, B:100:0x0366, B:102:0x036b, B:103:0x0382, B:105:0x038d, B:107:0x03a6, B:109:0x03ab, B:110:0x03c2, B:113:0x03e4, B:117:0x0407, B:118:0x041e, B:120:0x042a, B:123:0x0447, B:124:0x045b, B:126:0x0463, B:128:0x046f, B:130:0x0475, B:131:0x047c, B:133:0x0489, B:135:0x0491, B:137:0x0499, B:139:0x04a1, B:140:0x04ad, B:141:0x04ba, B:147:0x04fc, B:148:0x0511, B:150:0x0533, B:153:0x054a, B:156:0x0585, B:158:0x05b0, B:160:0x05e8, B:161:0x05eb, B:163:0x05f3, B:164:0x05f6, B:166:0x05fe, B:167:0x0601, B:169:0x0609, B:170:0x060c, B:172:0x0615, B:173:0x0619, B:175:0x0626, B:176:0x0629, B:178:0x0655, B:180:0x065f, B:184:0x0674, B:189:0x0680, B:192:0x0689, B:196:0x0696, B:200:0x06a4, B:204:0x06b2, B:208:0x06c0, B:212:0x06ce, B:216:0x06d9, B:220:0x06e6, B:221:0x06f2, B:223:0x06f8, B:224:0x06fb, B:226:0x071e, B:229:0x0727, B:232:0x0730, B:233:0x074a, B:235:0x0750, B:237:0x0764, B:239:0x0770, B:241:0x077d, B:244:0x0796, B:245:0x07a6, B:249:0x07af, B:250:0x07b2, B:252:0x07bf, B:253:0x07c4, B:255:0x07e2, B:257:0x07e6, B:259:0x07f6, B:261:0x0801, B:262:0x080a, B:264:0x0814, B:266:0x0820, B:268:0x082a, B:270:0x0830, B:272:0x083f, B:274:0x0855, B:276:0x085b, B:277:0x0864, B:279:0x0872, B:281:0x08ae, B:283:0x08b8, B:284:0x08bb, B:286:0x08c5, B:288:0x08e1, B:289:0x08ec, B:291:0x0924, B:293:0x092c, B:295:0x0936, B:296:0x0943, B:298:0x094d, B:299:0x095a, B:300:0x0963, B:302:0x0969, B:304:0x09a5, B:306:0x09af, B:308:0x09c1, B:310:0x09c7, B:311:0x0a0c, B:312:0x0a17, B:313:0x0a22, B:315:0x0a28, B:324:0x0a75, B:325:0x0ac0, B:327:0x0ad1, B:341:0x0b32, B:332:0x0ae9, B:333:0x0aec, B:318:0x0a35, B:320:0x0a61, B:338:0x0b05, B:339:0x0b1c, B:340:0x0b1d, B:227:0x0721, B:157:0x05a2, B:144:0x04e3, B:92:0x0306, B:93:0x030d, B:95:0x0313, B:97:0x031f, B:54:0x0191, B:56:0x019d, B:58:0x01b2, B:64:0x01d2, B:69:0x0208, B:71:0x020e, B:73:0x021c, B:75:0x022a, B:78:0x0236, B:86:0x02bb, B:88:0x02c5, B:80:0x025f, B:81:0x0278, B:85:0x029e, B:84:0x028b, B:67:0x01de, B:68:0x01fc), top: B:353:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x086f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018d A[PHI: r28 r29
  0x018d: PHI (r28v6 java.lang.String) = (r28v1 java.lang.String), (r28v1 java.lang.String), (r28v7 java.lang.String) binds: [B:70:0x020c, B:72:0x021a, B:52:0x0189] A[DONT_GENERATE, DONT_INLINE]
  0x018d: PHI (r29v6 java.lang.String) = (r29v1 java.lang.String), (r29v1 java.lang.String), (r29v7 java.lang.String) binds: [B:70:0x020c, B:72:0x021a, B:52:0x0189] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019d A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:36:0x0155, B:39:0x0164, B:41:0x016c, B:47:0x0179, B:89:0x02f2, B:98:0x0325, B:100:0x0366, B:102:0x036b, B:103:0x0382, B:105:0x038d, B:107:0x03a6, B:109:0x03ab, B:110:0x03c2, B:113:0x03e4, B:117:0x0407, B:118:0x041e, B:120:0x042a, B:123:0x0447, B:124:0x045b, B:126:0x0463, B:128:0x046f, B:130:0x0475, B:131:0x047c, B:133:0x0489, B:135:0x0491, B:137:0x0499, B:139:0x04a1, B:140:0x04ad, B:141:0x04ba, B:147:0x04fc, B:148:0x0511, B:150:0x0533, B:153:0x054a, B:156:0x0585, B:158:0x05b0, B:160:0x05e8, B:161:0x05eb, B:163:0x05f3, B:164:0x05f6, B:166:0x05fe, B:167:0x0601, B:169:0x0609, B:170:0x060c, B:172:0x0615, B:173:0x0619, B:175:0x0626, B:176:0x0629, B:178:0x0655, B:180:0x065f, B:184:0x0674, B:189:0x0680, B:192:0x0689, B:196:0x0696, B:200:0x06a4, B:204:0x06b2, B:208:0x06c0, B:212:0x06ce, B:216:0x06d9, B:220:0x06e6, B:221:0x06f2, B:223:0x06f8, B:224:0x06fb, B:226:0x071e, B:229:0x0727, B:232:0x0730, B:233:0x074a, B:235:0x0750, B:237:0x0764, B:239:0x0770, B:241:0x077d, B:244:0x0796, B:245:0x07a6, B:249:0x07af, B:250:0x07b2, B:252:0x07bf, B:253:0x07c4, B:255:0x07e2, B:257:0x07e6, B:259:0x07f6, B:261:0x0801, B:262:0x080a, B:264:0x0814, B:266:0x0820, B:268:0x082a, B:270:0x0830, B:272:0x083f, B:274:0x0855, B:276:0x085b, B:277:0x0864, B:279:0x0872, B:281:0x08ae, B:283:0x08b8, B:284:0x08bb, B:286:0x08c5, B:288:0x08e1, B:289:0x08ec, B:291:0x0924, B:293:0x092c, B:295:0x0936, B:296:0x0943, B:298:0x094d, B:299:0x095a, B:300:0x0963, B:302:0x0969, B:304:0x09a5, B:306:0x09af, B:308:0x09c1, B:310:0x09c7, B:311:0x0a0c, B:312:0x0a17, B:313:0x0a22, B:315:0x0a28, B:324:0x0a75, B:325:0x0ac0, B:327:0x0ad1, B:341:0x0b32, B:332:0x0ae9, B:333:0x0aec, B:318:0x0a35, B:320:0x0a61, B:338:0x0b05, B:339:0x0b1c, B:340:0x0b1d, B:227:0x0721, B:157:0x05a2, B:144:0x04e3, B:92:0x0306, B:93:0x030d, B:95:0x0313, B:97:0x031f, B:54:0x0191, B:56:0x019d, B:58:0x01b2, B:64:0x01d2, B:69:0x0208, B:71:0x020e, B:73:0x021c, B:75:0x022a, B:78:0x0236, B:86:0x02bb, B:88:0x02c5, B:80:0x025f, B:81:0x0278, B:85:0x029e, B:84:0x028b, B:67:0x01de, B:68:0x01fc), top: B:353:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01fc A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:36:0x0155, B:39:0x0164, B:41:0x016c, B:47:0x0179, B:89:0x02f2, B:98:0x0325, B:100:0x0366, B:102:0x036b, B:103:0x0382, B:105:0x038d, B:107:0x03a6, B:109:0x03ab, B:110:0x03c2, B:113:0x03e4, B:117:0x0407, B:118:0x041e, B:120:0x042a, B:123:0x0447, B:124:0x045b, B:126:0x0463, B:128:0x046f, B:130:0x0475, B:131:0x047c, B:133:0x0489, B:135:0x0491, B:137:0x0499, B:139:0x04a1, B:140:0x04ad, B:141:0x04ba, B:147:0x04fc, B:148:0x0511, B:150:0x0533, B:153:0x054a, B:156:0x0585, B:158:0x05b0, B:160:0x05e8, B:161:0x05eb, B:163:0x05f3, B:164:0x05f6, B:166:0x05fe, B:167:0x0601, B:169:0x0609, B:170:0x060c, B:172:0x0615, B:173:0x0619, B:175:0x0626, B:176:0x0629, B:178:0x0655, B:180:0x065f, B:184:0x0674, B:189:0x0680, B:192:0x0689, B:196:0x0696, B:200:0x06a4, B:204:0x06b2, B:208:0x06c0, B:212:0x06ce, B:216:0x06d9, B:220:0x06e6, B:221:0x06f2, B:223:0x06f8, B:224:0x06fb, B:226:0x071e, B:229:0x0727, B:232:0x0730, B:233:0x074a, B:235:0x0750, B:237:0x0764, B:239:0x0770, B:241:0x077d, B:244:0x0796, B:245:0x07a6, B:249:0x07af, B:250:0x07b2, B:252:0x07bf, B:253:0x07c4, B:255:0x07e2, B:257:0x07e6, B:259:0x07f6, B:261:0x0801, B:262:0x080a, B:264:0x0814, B:266:0x0820, B:268:0x082a, B:270:0x0830, B:272:0x083f, B:274:0x0855, B:276:0x085b, B:277:0x0864, B:279:0x0872, B:281:0x08ae, B:283:0x08b8, B:284:0x08bb, B:286:0x08c5, B:288:0x08e1, B:289:0x08ec, B:291:0x0924, B:293:0x092c, B:295:0x0936, B:296:0x0943, B:298:0x094d, B:299:0x095a, B:300:0x0963, B:302:0x0969, B:304:0x09a5, B:306:0x09af, B:308:0x09c1, B:310:0x09c7, B:311:0x0a0c, B:312:0x0a17, B:313:0x0a22, B:315:0x0a28, B:324:0x0a75, B:325:0x0ac0, B:327:0x0ad1, B:341:0x0b32, B:332:0x0ae9, B:333:0x0aec, B:318:0x0a35, B:320:0x0a61, B:338:0x0b05, B:339:0x0b1c, B:340:0x0b1d, B:227:0x0721, B:157:0x05a2, B:144:0x04e3, B:92:0x0306, B:93:0x030d, B:95:0x0313, B:97:0x031f, B:54:0x0191, B:56:0x019d, B:58:0x01b2, B:64:0x01d2, B:69:0x0208, B:71:0x020e, B:73:0x021c, B:75:0x022a, B:78:0x0236, B:86:0x02bb, B:88:0x02c5, B:80:0x025f, B:81:0x0278, B:85:0x029e, B:84:0x028b, B:67:0x01de, B:68:0x01fc), top: B:353:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x020e A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:36:0x0155, B:39:0x0164, B:41:0x016c, B:47:0x0179, B:89:0x02f2, B:98:0x0325, B:100:0x0366, B:102:0x036b, B:103:0x0382, B:105:0x038d, B:107:0x03a6, B:109:0x03ab, B:110:0x03c2, B:113:0x03e4, B:117:0x0407, B:118:0x041e, B:120:0x042a, B:123:0x0447, B:124:0x045b, B:126:0x0463, B:128:0x046f, B:130:0x0475, B:131:0x047c, B:133:0x0489, B:135:0x0491, B:137:0x0499, B:139:0x04a1, B:140:0x04ad, B:141:0x04ba, B:147:0x04fc, B:148:0x0511, B:150:0x0533, B:153:0x054a, B:156:0x0585, B:158:0x05b0, B:160:0x05e8, B:161:0x05eb, B:163:0x05f3, B:164:0x05f6, B:166:0x05fe, B:167:0x0601, B:169:0x0609, B:170:0x060c, B:172:0x0615, B:173:0x0619, B:175:0x0626, B:176:0x0629, B:178:0x0655, B:180:0x065f, B:184:0x0674, B:189:0x0680, B:192:0x0689, B:196:0x0696, B:200:0x06a4, B:204:0x06b2, B:208:0x06c0, B:212:0x06ce, B:216:0x06d9, B:220:0x06e6, B:221:0x06f2, B:223:0x06f8, B:224:0x06fb, B:226:0x071e, B:229:0x0727, B:232:0x0730, B:233:0x074a, B:235:0x0750, B:237:0x0764, B:239:0x0770, B:241:0x077d, B:244:0x0796, B:245:0x07a6, B:249:0x07af, B:250:0x07b2, B:252:0x07bf, B:253:0x07c4, B:255:0x07e2, B:257:0x07e6, B:259:0x07f6, B:261:0x0801, B:262:0x080a, B:264:0x0814, B:266:0x0820, B:268:0x082a, B:270:0x0830, B:272:0x083f, B:274:0x0855, B:276:0x085b, B:277:0x0864, B:279:0x0872, B:281:0x08ae, B:283:0x08b8, B:284:0x08bb, B:286:0x08c5, B:288:0x08e1, B:289:0x08ec, B:291:0x0924, B:293:0x092c, B:295:0x0936, B:296:0x0943, B:298:0x094d, B:299:0x095a, B:300:0x0963, B:302:0x0969, B:304:0x09a5, B:306:0x09af, B:308:0x09c1, B:310:0x09c7, B:311:0x0a0c, B:312:0x0a17, B:313:0x0a22, B:315:0x0a28, B:324:0x0a75, B:325:0x0ac0, B:327:0x0ad1, B:341:0x0b32, B:332:0x0ae9, B:333:0x0aec, B:318:0x0a35, B:320:0x0a61, B:338:0x0b05, B:339:0x0b1c, B:340:0x0b1d, B:227:0x0721, B:157:0x05a2, B:144:0x04e3, B:92:0x0306, B:93:0x030d, B:95:0x0313, B:97:0x031f, B:54:0x0191, B:56:0x019d, B:58:0x01b2, B:64:0x01d2, B:69:0x0208, B:71:0x020e, B:73:0x021c, B:75:0x022a, B:78:0x0236, B:86:0x02bb, B:88:0x02c5, B:80:0x025f, B:81:0x0278, B:85:0x029e, B:84:0x028b, B:67:0x01de, B:68:0x01fc), top: B:353:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0306 A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:36:0x0155, B:39:0x0164, B:41:0x016c, B:47:0x0179, B:89:0x02f2, B:98:0x0325, B:100:0x0366, B:102:0x036b, B:103:0x0382, B:105:0x038d, B:107:0x03a6, B:109:0x03ab, B:110:0x03c2, B:113:0x03e4, B:117:0x0407, B:118:0x041e, B:120:0x042a, B:123:0x0447, B:124:0x045b, B:126:0x0463, B:128:0x046f, B:130:0x0475, B:131:0x047c, B:133:0x0489, B:135:0x0491, B:137:0x0499, B:139:0x04a1, B:140:0x04ad, B:141:0x04ba, B:147:0x04fc, B:148:0x0511, B:150:0x0533, B:153:0x054a, B:156:0x0585, B:158:0x05b0, B:160:0x05e8, B:161:0x05eb, B:163:0x05f3, B:164:0x05f6, B:166:0x05fe, B:167:0x0601, B:169:0x0609, B:170:0x060c, B:172:0x0615, B:173:0x0619, B:175:0x0626, B:176:0x0629, B:178:0x0655, B:180:0x065f, B:184:0x0674, B:189:0x0680, B:192:0x0689, B:196:0x0696, B:200:0x06a4, B:204:0x06b2, B:208:0x06c0, B:212:0x06ce, B:216:0x06d9, B:220:0x06e6, B:221:0x06f2, B:223:0x06f8, B:224:0x06fb, B:226:0x071e, B:229:0x0727, B:232:0x0730, B:233:0x074a, B:235:0x0750, B:237:0x0764, B:239:0x0770, B:241:0x077d, B:244:0x0796, B:245:0x07a6, B:249:0x07af, B:250:0x07b2, B:252:0x07bf, B:253:0x07c4, B:255:0x07e2, B:257:0x07e6, B:259:0x07f6, B:261:0x0801, B:262:0x080a, B:264:0x0814, B:266:0x0820, B:268:0x082a, B:270:0x0830, B:272:0x083f, B:274:0x0855, B:276:0x085b, B:277:0x0864, B:279:0x0872, B:281:0x08ae, B:283:0x08b8, B:284:0x08bb, B:286:0x08c5, B:288:0x08e1, B:289:0x08ec, B:291:0x0924, B:293:0x092c, B:295:0x0936, B:296:0x0943, B:298:0x094d, B:299:0x095a, B:300:0x0963, B:302:0x0969, B:304:0x09a5, B:306:0x09af, B:308:0x09c1, B:310:0x09c7, B:311:0x0a0c, B:312:0x0a17, B:313:0x0a22, B:315:0x0a28, B:324:0x0a75, B:325:0x0ac0, B:327:0x0ad1, B:341:0x0b32, B:332:0x0ae9, B:333:0x0aec, B:318:0x0a35, B:320:0x0a61, B:338:0x0b05, B:339:0x0b1c, B:340:0x0b1d, B:227:0x0721, B:157:0x05a2, B:144:0x04e3, B:92:0x0306, B:93:0x030d, B:95:0x0313, B:97:0x031f, B:54:0x0191, B:56:0x019d, B:58:0x01b2, B:64:0x01d2, B:69:0x0208, B:71:0x020e, B:73:0x021c, B:75:0x022a, B:78:0x0236, B:86:0x02bb, B:88:0x02c5, B:80:0x025f, B:81:0x0278, B:85:0x029e, B:84:0x028b, B:67:0x01de, B:68:0x01fc), top: B:353:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean, int] */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzH(com.google.android.gms.measurement.internal.zzbg r45, com.google.android.gms.measurement.internal.zzr r46) {
        /*
            Method dump skipped, instruction units count: 2923
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpg.zzH(com.google.android.gms.measurement.internal.zzbg, com.google.android.gms.measurement.internal.zzr):void");
    }

    @WorkerThread
    public final void zzI(zzh zzhVar, com.google.android.gms.internal.measurement.zzic zzicVar) {
        com.google.android.gms.internal.measurement.zziu zziuVar;
        zzaW().zzg();
        zzu();
        zzan zzanVarZzd = zzan.zzd(zzicVar.zzaA());
        String strZzc = zzhVar.zzc();
        zzaW().zzg();
        zzu();
        zzjl zzjlVarZzB = zzB(strZzc);
        zzji zzjiVar = zzji.UNINITIALIZED;
        int iOrdinal = zzjlVarZzB.zzp().ordinal();
        if (iOrdinal == 1) {
            zzanVarZzd.zzc(zzjk.AD_STORAGE, zzam.REMOTE_ENFORCED_DEFAULT);
        } else if (iOrdinal == 2 || iOrdinal == 3) {
            zzanVarZzd.zzb(zzjk.AD_STORAGE, zzjlVarZzB.zzb());
        } else {
            zzanVarZzd.zzc(zzjk.AD_STORAGE, zzam.FAILSAFE);
        }
        int iOrdinal2 = zzjlVarZzB.zzq().ordinal();
        if (iOrdinal2 == 1) {
            zzanVarZzd.zzc(zzjk.ANALYTICS_STORAGE, zzam.REMOTE_ENFORCED_DEFAULT);
        } else if (iOrdinal2 == 2 || iOrdinal2 == 3) {
            zzanVarZzd.zzb(zzjk.ANALYTICS_STORAGE, zzjlVarZzB.zzb());
        } else {
            zzanVarZzd.zzc(zzjk.ANALYTICS_STORAGE, zzam.FAILSAFE);
        }
        String strZzc2 = zzhVar.zzc();
        zzaW().zzg();
        zzu();
        zzaz zzazVarZzz = zzz(strZzc2, zzx(strZzc2), zzB(strZzc2), zzanVarZzd);
        zzicVar.zzaD(((Boolean) Preconditions.checkNotNull(zzazVarZzz.zzj())).booleanValue());
        if (!TextUtils.isEmpty(zzazVarZzz.zzk())) {
            zzicVar.zzaF(zzazVarZzz.zzk());
        }
        zzaW().zzg();
        zzu();
        Iterator it = zzicVar.zzk().iterator();
        while (true) {
            if (it.hasNext()) {
                zziuVar = (com.google.android.gms.internal.measurement.zziu) it.next();
                if ("_npa".equals(zziuVar.zzc())) {
                    break;
                }
            } else {
                zziuVar = null;
                break;
            }
        }
        if (zziuVar != null) {
            zzjk zzjkVar = zzjk.AD_PERSONALIZATION;
            if (zzanVarZzd.zza(zzjkVar) == zzam.UNSET) {
                zzpn zzpnVarZzm = zzj().zzm(zzhVar.zzc(), "_npa");
                if (zzpnVarZzm != null) {
                    String str = zzpnVarZzm.zzb;
                    if ("tcf".equals(str)) {
                        zzanVarZzd.zzc(zzjkVar, zzam.TCF);
                    } else if ("app".equals(str)) {
                        zzanVarZzd.zzc(zzjkVar, zzam.API);
                    } else {
                        zzanVarZzd.zzc(zzjkVar, zzam.MANIFEST);
                    }
                } else {
                    Boolean boolZzae = zzhVar.zzae();
                    if (boolZzae == null || ((boolZzae.booleanValue() && zziuVar.zzg() != 1) || !(boolZzae.booleanValue() || zziuVar.zzg() == 0))) {
                        zzanVarZzd.zzc(zzjkVar, zzam.API);
                    } else {
                        zzanVarZzd.zzc(zzjkVar, zzam.MANIFEST);
                    }
                }
            }
        } else {
            int iZzaC = zzaC(zzhVar.zzc(), zzanVarZzd);
            com.google.android.gms.internal.measurement.zzit zzitVarZzm = com.google.android.gms.internal.measurement.zziu.zzm();
            zzitVarZzm.zzb("_npa");
            zzitVarZzm.zza(zzaZ().currentTimeMillis());
            zzitVarZzm.zze(iZzaC);
            zzicVar.zzo((com.google.android.gms.internal.measurement.zziu) zzitVarZzm.zzbc());
            zzaV().zzk().zzc("Setting user property", "non_personalized_ads(_npa)", Integer.valueOf(iZzaC));
        }
        zzicVar.zzaB(zzanVarZzd.toString());
        boolean zZzy = this.zzc.zzy(zzhVar.zzc());
        List listZzb = zzicVar.zzb();
        int i = 0;
        for (int i4 = 0; i4 < listZzb.size(); i4++) {
            if ("_tcf".equals(((com.google.android.gms.internal.measurement.zzhs) listZzb.get(i4)).zzd())) {
                com.google.android.gms.internal.measurement.zzhr zzhrVar = (com.google.android.gms.internal.measurement.zzhr) ((com.google.android.gms.internal.measurement.zzhs) listZzb.get(i4)).zzcl();
                List listZza = zzhrVar.zza();
                int i6 = 0;
                while (true) {
                    if (i6 >= listZza.size()) {
                        break;
                    }
                    if ("_tcfd".equals(((com.google.android.gms.internal.measurement.zzhw) listZza.get(i6)).zzb())) {
                        String strZzd = ((com.google.android.gms.internal.measurement.zzhw) listZza.get(i6)).zzd();
                        if (zZzy && strZzd.length() > 4) {
                            char[] charArray = strZzd.toCharArray();
                            int i10 = 1;
                            while (true) {
                                if (i10 >= 64) {
                                    break;
                                }
                                if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10)) {
                                    i = i10;
                                    break;
                                }
                                i10++;
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(1 | i);
                            strZzd = String.valueOf(charArray);
                        }
                        com.google.android.gms.internal.measurement.zzhv zzhvVarZzn = com.google.android.gms.internal.measurement.zzhw.zzn();
                        zzhvVarZzn.zzb("_tcfd");
                        zzhvVarZzn.zzd(strZzd);
                        zzhrVar.zze(i6, zzhvVarZzn);
                    } else {
                        i6++;
                    }
                }
                zzicVar.zzf(i4, zzhrVar);
                return;
            }
        }
    }

    @WorkerThread
    public final void zzJ(zzh zzhVar, com.google.android.gms.internal.measurement.zzic zzicVar) {
        zzaW().zzg();
        zzu();
        com.google.android.gms.internal.measurement.zzgx zzgxVarZzr = com.google.android.gms.internal.measurement.zzha.zzr();
        byte[] bArrZzaJ = zzhVar.zzaJ();
        if (bArrZzaJ != null) {
            try {
                zzgxVarZzr = (com.google.android.gms.internal.measurement.zzgx) zzpk.zzw(zzgxVarZzr, bArrZzaJ);
            } catch (com.google.android.gms.internal.measurement.zzmr unused) {
                zzaV().zze().zzb("Failed to parse locally stored ad campaign info. appId", zzgu.zzl(zzhVar.zzc()));
            }
        }
        for (com.google.android.gms.internal.measurement.zzhs zzhsVar : zzicVar.zzb()) {
            if (zzhsVar.zzd().equals("_cmp")) {
                String str = (String) zzpk.zzJ(zzhsVar, "gclid", "");
                String str2 = (String) zzpk.zzJ(zzhsVar, "gbraid", "");
                String str3 = (String) zzpk.zzJ(zzhsVar, "gad_source", "");
                String[] strArrSplit = ((String) zzfy.zzbg.zzb(null)).split(",");
                zzp();
                if (!zzpk.zzG(zzhsVar, strArrSplit).isEmpty()) {
                    long jLongValue = ((Long) zzpk.zzJ(zzhsVar, "click_timestamp", 0L)).longValue();
                    if (jLongValue <= 0) {
                        jLongValue = zzhsVar.zzf();
                    }
                    if ("referrer API v2".equals(zzpk.zzI(zzhsVar, "_cis"))) {
                        if (jLongValue > zzgxVarZzr.zzo()) {
                            if (str.isEmpty()) {
                                zzgxVarZzr.zzj();
                            } else {
                                zzgxVarZzr.zzi(str);
                            }
                            if (str2.isEmpty()) {
                                zzgxVarZzr.zzl();
                            } else {
                                zzgxVarZzr.zzk(str2);
                            }
                            if (str3.isEmpty()) {
                                zzgxVarZzr.zzn();
                            } else {
                                zzgxVarZzr.zzm(str3);
                            }
                            zzgxVarZzr.zzp(jLongValue);
                            zzgxVarZzr.zzs();
                            zzgxVarZzr.zzt(zzaD(zzhsVar));
                        }
                    } else if (jLongValue > zzgxVarZzr.zzg()) {
                        if (str.isEmpty()) {
                            zzgxVarZzr.zzb();
                        } else {
                            zzgxVarZzr.zza(str);
                        }
                        if (str2.isEmpty()) {
                            zzgxVarZzr.zzd();
                        } else {
                            zzgxVarZzr.zzc(str2);
                        }
                        if (str3.isEmpty()) {
                            zzgxVarZzr.zzf();
                        } else {
                            zzgxVarZzr.zze(str3);
                        }
                        zzgxVarZzr.zzh(jLongValue);
                        zzgxVarZzr.zzq();
                        zzgxVarZzr.zzr(zzaD(zzhsVar));
                    }
                }
            }
        }
        if (!((com.google.android.gms.internal.measurement.zzha) zzgxVarZzr.zzbc()).equals(com.google.android.gms.internal.measurement.zzha.zzs())) {
            zzicVar.zzaM((com.google.android.gms.internal.measurement.zzha) zzgxVarZzr.zzbc());
        }
        zzhVar.zzaI(((com.google.android.gms.internal.measurement.zzha) zzgxVarZzr.zzbc()).zzcc());
        if (zzhVar.zza()) {
            zzj().zzv(zzhVar, false, false);
        }
        if (zzd().zzp(null, zzfy.zzbf)) {
            zzj().zzk(zzhVar.zzc(), "_lgclid");
        }
    }

    @WorkerThread
    public final String zzK(zzjl zzjlVar) {
        if (!zzjlVar.zzo(zzjk.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        zzt().zzf().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    @VisibleForTesting
    public final void zzL(List list) {
        Preconditions.checkArgument(!list.isEmpty());
        if (this.zzz != null) {
            zzaV().zzb().zza("Set uploading progress before finishing the previous upload");
        } else {
            this.zzz = new ArrayList(list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.android.gms.measurement.internal.zzpg] */
    /* JADX WARN: Type inference failed for: r1v12, types: [long] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v22, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.database.Cursor] */
    @WorkerThread
    public final void zzM() {
        zzav zzavVarZzj;
        long jZzF;
        SQLiteException e;
        zzh zzhVarZzu;
        zzaW().zzg();
        zzu();
        this.zzw = true;
        try {
            zzic zzicVar = this.zzn;
            zzicVar.zzaU();
            Boolean boolZzJ = zzicVar.zzt().zzJ();
            if (boolZzJ == null) {
                zzaV().zze().zza("Upload data called on the client side before use of service was decided");
            } else if (boolZzJ.booleanValue()) {
                zzaV().zzb().zza("Upload called in the client side when service should be used");
            } else if (this.zza > 0) {
                zzaL();
            } else {
                zzaW().zzg();
                if (this.zzz != null) {
                    zzaV().zzk().zza("Uploading requested multiple times");
                } else if (zzi().zzb()) {
                    ?? CurrentTimeMillis = zzaZ().currentTimeMillis();
                    ?? r72 = 0;
                    cursorRawQuery = null;
                    Cursor cursorRawQuery = null;
                    string = null;
                    string = null;
                    String string = null;
                    int iZzm = zzd().zzm(null, zzfy.zzai);
                    zzd();
                    long jZzF2 = CurrentTimeMillis - zzal.zzF();
                    for (int i = 0; i < iZzm && zzaG(null, jZzF2); i++) {
                    }
                    zzqp.zza();
                    zzaW().zzg();
                    zzav();
                    long jZza = this.zzk.zzd.zza();
                    if (jZza != 0) {
                        zzaV().zzj().zzb("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(CurrentTimeMillis - jZza)));
                    }
                    String strZzF = zzj().zzF();
                    long j = -1;
                    if (TextUtils.isEmpty(strZzF)) {
                        try {
                            this.zzB = -1L;
                            zzavVarZzj = zzj();
                            zzd();
                            jZzF = CurrentTimeMillis - zzal.zzF();
                            zzavVarZzj.zzg();
                            zzavVarZzj.zzaw();
                        } catch (Throwable th2) {
                            th = th2;
                            r72 = CurrentTimeMillis;
                        }
                        try {
                            CurrentTimeMillis = zzavVarZzj.zze().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(jZzF)});
                            try {
                                if (CurrentTimeMillis.moveToFirst()) {
                                    string = CurrentTimeMillis.getString(0);
                                } else {
                                    zzavVarZzj.zzu.zzaV().zzk().zza("No expired configs for apps with pending events");
                                }
                            } catch (SQLiteException e7) {
                                e = e7;
                                zzavVarZzj.zzu.zzaV().zzb().zzb("Error selecting expired configs", e);
                                if (CurrentTimeMillis != 0) {
                                }
                                if (!TextUtils.isEmpty(string)) {
                                    zzW(zzhVarZzu);
                                }
                                this.zzw = false;
                                zzaM();
                            }
                        } catch (SQLiteException e10) {
                            e = e10;
                            CurrentTimeMillis = 0;
                        } catch (Throwable th3) {
                            th = th3;
                            throw th;
                        }
                        CurrentTimeMillis.close();
                        if (!TextUtils.isEmpty(string) && (zzhVarZzu = zzj().zzu(string)) != null) {
                            zzW(zzhVarZzu);
                        }
                    } else {
                        if (this.zzB == -1) {
                            zzav zzavVarZzj2 = zzj();
                            try {
                                try {
                                    cursorRawQuery = zzavVarZzj2.zze().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                    if (cursorRawQuery.moveToFirst()) {
                                        j = cursorRawQuery.getLong(0);
                                    }
                                } finally {
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                }
                            } catch (SQLiteException e11) {
                                zzavVarZzj2.zzu.zzaV().zzb().zzb("Error querying raw events", e11);
                                if (cursorRawQuery != null) {
                                }
                                this.zzB = j;
                                zzN(strZzF, CurrentTimeMillis);
                                this.zzw = false;
                                zzaM();
                            }
                            cursorRawQuery.close();
                            this.zzB = j;
                        }
                        zzN(strZzF, CurrentTimeMillis);
                    }
                } else {
                    zzaV().zzk().zza("Network not connected, ignoring upload request");
                    zzaL();
                }
            }
            this.zzw = false;
            zzaM();
        } catch (Throwable th4) {
            this.zzw = false;
            zzaM();
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00be, code lost:
    
        r22 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x045e A[PHI: r10 r16 r23
  0x045e: PHI (r10v39 java.util.List) = (r10v75 java.util.List), (r10v76 java.util.List) binds: [B:184:0x0484, B:176:0x045c] A[DONT_GENERATE, DONT_INLINE]
  0x045e: PHI (r16v7 java.util.List) = (r16v18 java.util.List), (r16v19 java.util.List) binds: [B:184:0x0484, B:176:0x045c] A[DONT_GENERATE, DONT_INLINE]
  0x045e: PHI (r23v12 android.database.Cursor) = (r23v18 android.database.Cursor), (r23v22 android.database.Cursor) binds: [B:184:0x0484, B:176:0x045c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b A[PHI: r0 r10 r23
  0x006b: PHI (r0v117 java.util.List) = (r0v8 java.util.List), (r0v141 java.util.List) binds: [B:108:0x022a, B:16:0x0069] A[DONT_GENERATE, DONT_INLINE]
  0x006b: PHI (r10v57 android.database.Cursor) = (r10v5 android.database.Cursor), (r10v59 android.database.Cursor) binds: [B:108:0x022a, B:16:0x0069] A[DONT_GENERATE, DONT_INLINE]
  0x006b: PHI (r23v28 long) = (r23v2 long), (r23v29 long) binds: [B:108:0x022a, B:16:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x07fb  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x080c  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0822 A[LOOP:7: B:336:0x081c->B:338:0x0822, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0850  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0865  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0941  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0944  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x09b0  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0a0b  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x07e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:471:? A[RETURN, SYNTHETIC] */
    @androidx.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzN(java.lang.String r33, long r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpg.zzN(java.lang.String, long):void");
    }

    @VisibleForTesting
    @WorkerThread
    public final boolean zzO(String str, String str2) {
        zzh zzhVarZzu = zzj().zzu(str);
        if (zzhVarZzu != null && zzt().zzaa(str, zzhVarZzu.zzay())) {
            this.zzF.remove(str2);
            return true;
        }
        zzpe zzpeVar = (zzpe) this.zzF.get(str2);
        if (zzpeVar == null) {
            return true;
        }
        return zzpeVar.zzb();
    }

    @WorkerThread
    public final void zzP(String str) {
        com.google.android.gms.internal.measurement.zzib zzibVarZzd;
        zzaW().zzg();
        zzu();
        this.zzw = true;
        try {
            zzic zzicVar = this.zzn;
            zzicVar.zzaU();
            Boolean boolZzJ = zzicVar.zzt().zzJ();
            if (boolZzJ == null) {
                zzaV().zze().zza("Upload data called on the client side before use of service was decided");
            } else if (boolZzJ.booleanValue()) {
                zzaV().zzb().zza("Upload called in the client side when service should be used");
            } else if (this.zza > 0) {
                zzaL();
            } else if (!zzi().zzb()) {
                zzaV().zzk().zza("Network not connected, ignoring upload request");
                zzaL();
            } else if (zzj().zzD(str)) {
                zzav zzavVarZzj = zzj();
                Preconditions.checkNotEmpty(str);
                zzavVarZzj.zzg();
                zzavVarZzj.zzaw();
                List listZzC = zzavVarZzj.zzC(str, zzoo.zza(zzls.GOOGLE_SIGNAL), 1);
                zzpj zzpjVar = listZzC.isEmpty() ? null : (zzpj) listZzC.get(0);
                if (zzpjVar != null && (zzibVarZzd = zzpjVar.zzd()) != null) {
                    zzaV().zzk().zzd("[sgtm] Uploading data from upload queue. appId, type, url", str, zzpjVar.zzf(), zzpjVar.zze());
                    byte[] bArrZzcc = zzibVarZzd.zzcc();
                    if (Log.isLoggable(zzaV().zzn(), 2)) {
                        zzaV().zzk().zzd("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(bArrZzcc.length), zzp().zzi(zzibVarZzd));
                    }
                    zzot zzotVarZza = zzpjVar.zza();
                    this.zzv = true;
                    zzi().zzc(str, zzotVarZza, zzibVarZzd, new zzox(this, str, zzpjVar));
                }
            } else {
                zzaV().zzk().zzb("[sgtm] Upload queue has no batches for appId", str);
            }
            this.zzw = false;
            zzaM();
        } catch (Throwable th2) {
            this.zzw = false;
            zzaM();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:4:0x000d, B:19:0x005a, B:22:0x0080, B:13:0x001e, B:15:0x0048, B:17:0x0052, B:18:0x0056), top: B:27:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    @androidx.annotation.VisibleForTesting
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzQ(@androidx.annotation.NonNull java.lang.String r4, int r5, java.lang.Throwable r6, byte[] r7, com.google.android.gms.measurement.internal.zzpj r8) {
        /*
            r3 = this;
            com.google.android.gms.measurement.internal.zzhz r0 = r3.zzaW()
            r0.zzg()
            r3.zzu()
            r0 = 0
            if (r7 != 0) goto L13
            byte[] r7 = new byte[r0]     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r4 = move-exception
            goto L9b
        L13:
            r1 = 200(0xc8, float:2.8E-43)
            if (r5 == r1) goto L1c
            r1 = 204(0xcc, float:2.86E-43)
            if (r5 != r1) goto L5a
            r5 = r1
        L1c:
            if (r6 != 0) goto L5a
            com.google.android.gms.measurement.internal.zzav r6 = r3.zzj()     // Catch: java.lang.Throwable -> L10
            long r7 = r8.zzc()     // Catch: java.lang.Throwable -> L10
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L10
            r6.zzE(r7)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzgu r6 = r3.zzaV()     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzgs r6 = r6.zzk()     // Catch: java.lang.Throwable -> L10
            java.lang.String r7 = "Successfully uploaded batch from upload queue. appId, status"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L10
            r6.zzc(r7, r4, r5)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzgz r5 = r3.zzi()     // Catch: java.lang.Throwable -> L10
            boolean r5 = r5.zzb()     // Catch: java.lang.Throwable -> L10
            if (r5 == 0) goto L56
            com.google.android.gms.measurement.internal.zzav r5 = r3.zzj()     // Catch: java.lang.Throwable -> L10
            boolean r5 = r5.zzD(r4)     // Catch: java.lang.Throwable -> L10
            if (r5 == 0) goto L56
            r3.zzP(r4)     // Catch: java.lang.Throwable -> L10
            goto L95
        L56:
            r3.zzaL()     // Catch: java.lang.Throwable -> L10
            goto L95
        L5a:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L10
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L10
            r1.<init>(r7, r2)     // Catch: java.lang.Throwable -> L10
            int r7 = r1.length()     // Catch: java.lang.Throwable -> L10
            r2 = 32
            int r7 = java.lang.Math.min(r2, r7)     // Catch: java.lang.Throwable -> L10
            java.lang.String r7 = r1.substring(r0, r7)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzgu r1 = r3.zzaV()     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzgs r1 = r1.zzh()     // Catch: java.lang.Throwable -> L10
            java.lang.String r2 = "Network upload failed. Will retry later. appId, status, error"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L10
            if (r6 != 0) goto L80
            r6 = r7
        L80:
            r1.zzd(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzav r4 = r3.zzj()     // Catch: java.lang.Throwable -> L10
            long r5 = r8.zzc()     // Catch: java.lang.Throwable -> L10
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L10
            r4.zzK(r5)     // Catch: java.lang.Throwable -> L10
            r3.zzaL()     // Catch: java.lang.Throwable -> L10
        L95:
            r3.zzv = r0
            r3.zzaM()
            return
        L9b:
            r3.zzv = r0
            r3.zzaM()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpg.zzQ(java.lang.String, int, java.lang.Throwable, byte[], com.google.android.gms.measurement.internal.zzpj):void");
    }

    @WorkerThread
    public final void zzR(String str, boolean z4, Long l6, Long l8) {
        zzh zzhVarZzu = zzj().zzu(str);
        if (zzhVarZzu != null) {
            zzhVarZzu.zzar(z4);
            zzhVarZzu.zzat(l6);
            zzhVarZzu.zzav(l8);
            if (zzhVarZzu.zza()) {
                zzj().zzv(zzhVarZzu, false, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzS(java.lang.String r7, com.google.android.gms.internal.measurement.zzic r8) {
        /*
            r6 = this;
            com.google.android.gms.measurement.internal.zzht r0 = r6.zzh()
            java.util.Set r0 = r0.zzl(r7)
            if (r0 == 0) goto Ld
            r8.zzaw(r0)
        Ld:
            com.google.android.gms.measurement.internal.zzht r0 = r6.zzh()
            boolean r0 = r0.zzp(r7)
            if (r0 == 0) goto L1a
            r8.zzG()
        L1a:
            com.google.android.gms.measurement.internal.zzht r0 = r6.zzh()
            boolean r0 = r0.zzq(r7)
            r1 = -1
            if (r0 == 0) goto L3f
            java.lang.String r0 = r8.zzD()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L3f
            java.lang.String r2 = "."
            int r2 = r0.indexOf(r2)
            if (r2 == r1) goto L3f
            r3 = 0
            java.lang.String r0 = r0.substring(r3, r2)
            r8.zzE(r0)
        L3f:
            com.google.android.gms.measurement.internal.zzht r0 = r6.zzh()
            boolean r0 = r0.zzr(r7)
            if (r0 == 0) goto L54
            java.lang.String r0 = "_id"
            int r0 = com.google.android.gms.measurement.internal.zzpk.zzx(r8, r0)
            if (r0 == r1) goto L54
            r8.zzr(r0)
        L54:
            com.google.android.gms.measurement.internal.zzht r0 = r6.zzh()
            boolean r0 = r0.zzs(r7)
            if (r0 == 0) goto L61
            r8.zzan()
        L61:
            com.google.android.gms.measurement.internal.zzht r0 = r6.zzh()
            boolean r0 = r0.zzt(r7)
            if (r0 == 0) goto Lab
            r8.zzX()
            com.google.android.gms.measurement.internal.zzjl r0 = r6.zzB(r7)
            com.google.android.gms.measurement.internal.zzjk r1 = com.google.android.gms.measurement.internal.zzjk.ANALYTICS_STORAGE
            boolean r0 = r0.zzo(r1)
            if (r0 == 0) goto Lab
            java.util.Map r0 = r6.zzE
            java.lang.Object r1 = r0.get(r7)
            com.google.android.gms.measurement.internal.zzpd r1 = (com.google.android.gms.measurement.internal.zzpd) r1
            if (r1 == 0) goto L9d
            long r2 = r1.zzb
            com.google.android.gms.measurement.internal.zzal r4 = r6.zzd()
            com.google.android.gms.measurement.internal.zzfx r5 = com.google.android.gms.measurement.internal.zzfy.zzak
            long r4 = r4.zzl(r7, r5)
            long r4 = r4 + r2
            com.google.android.gms.common.util.Clock r2 = r6.zzaZ()
            long r2 = r2.elapsedRealtime()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto La6
        L9d:
            com.google.android.gms.measurement.internal.zzpd r1 = new com.google.android.gms.measurement.internal.zzpd
            r2 = 0
            r1.<init>(r6, r2)
            r0.put(r7, r1)
        La6:
            java.lang.String r0 = r1.zza
            r8.zzax(r0)
        Lab:
            com.google.android.gms.measurement.internal.zzht r0 = r6.zzh()
            boolean r7 = r0.zzu(r7)
            if (r7 == 0) goto Lb8
            r8.zzav()
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpg.zzS(java.lang.String, com.google.android.gms.internal.measurement.zzic):void");
    }

    public final void zzT(com.google.android.gms.internal.measurement.zzic zzicVar, zzpc zzpcVar) {
        for (int i = 0; i < zzicVar.zzc(); i++) {
            com.google.android.gms.internal.measurement.zzhr zzhrVar = (com.google.android.gms.internal.measurement.zzhr) zzicVar.zzd(i).zzcl();
            Iterator it = zzhrVar.zza().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if ("_c".equals(((com.google.android.gms.internal.measurement.zzhw) it.next()).zzb())) {
                    if (zzpcVar.zza.zzar() >= zzd().zzm(zzpcVar.zza.zzA(), zzfy.zzal)) {
                        int iZzm = zzd().zzm(zzpcVar.zza.zzA(), zzfy.zzay);
                        String strZzaw = null;
                        if (iZzm <= 0) {
                            if (zzd().zzp(zzpcVar.zza.zzA(), zzfy.zzaR)) {
                                strZzaw = zzt().zzaw();
                                com.google.android.gms.internal.measurement.zzhv zzhvVarZzn = com.google.android.gms.internal.measurement.zzhw.zzn();
                                zzhvVarZzn.zzb("_tu");
                                zzhvVarZzn.zzd(strZzaw);
                                zzhrVar.zzf((com.google.android.gms.internal.measurement.zzhw) zzhvVarZzn.zzbc());
                            }
                            com.google.android.gms.internal.measurement.zzhv zzhvVarZzn2 = com.google.android.gms.internal.measurement.zzhw.zzn();
                            zzhvVarZzn2.zzb("_tr");
                            zzhvVarZzn2.zzf(1L);
                            zzhrVar.zzf((com.google.android.gms.internal.measurement.zzhw) zzhvVarZzn2.zzbc());
                            zzoh zzohVarZzf = zzp().zzf(zzpcVar.zza.zzA(), zzicVar, zzhrVar, strZzaw);
                            if (zzohVarZzf != null) {
                                zzaV().zzk().zzc("Generated trigger URI. appId, uri", zzpcVar.zza.zzA(), zzohVarZzf.zza);
                                zzj().zzY(zzpcVar.zza.zzA(), zzohVarZzf);
                                Deque deque = this.zzr;
                                if (!deque.contains(zzpcVar.zza.zzA())) {
                                    deque.add(zzpcVar.zza.zzA());
                                }
                            }
                        } else if (zzj().zzw(zzC(), zzpcVar.zza.zzA(), false, false, false, false, false, false, true).zzg > iZzm) {
                            com.google.android.gms.internal.measurement.zzhv zzhvVarZzn3 = com.google.android.gms.internal.measurement.zzhw.zzn();
                            zzhvVarZzn3.zzb("_tnr");
                            zzhvVarZzn3.zzf(1L);
                            zzhrVar.zzf((com.google.android.gms.internal.measurement.zzhw) zzhvVarZzn3.zzbc());
                        } else {
                            if (zzd().zzp(zzpcVar.zza.zzA(), zzfy.zzaR)) {
                                strZzaw = zzt().zzaw();
                                com.google.android.gms.internal.measurement.zzhv zzhvVarZzn4 = com.google.android.gms.internal.measurement.zzhw.zzn();
                                zzhvVarZzn4.zzb("_tu");
                                zzhvVarZzn4.zzd(strZzaw);
                                zzhrVar.zzf((com.google.android.gms.internal.measurement.zzhw) zzhvVarZzn4.zzbc());
                            }
                            com.google.android.gms.internal.measurement.zzhv zzhvVarZzn5 = com.google.android.gms.internal.measurement.zzhw.zzn();
                            zzhvVarZzn5.zzb("_tr");
                            zzhvVarZzn5.zzf(1L);
                            zzhrVar.zzf((com.google.android.gms.internal.measurement.zzhw) zzhvVarZzn5.zzbc());
                            zzoh zzohVarZzf2 = zzp().zzf(zzpcVar.zza.zzA(), zzicVar, zzhrVar, strZzaw);
                            if (zzohVarZzf2 != null) {
                                zzaV().zzk().zzc("Generated trigger URI. appId, uri", zzpcVar.zza.zzA(), zzohVarZzf2.zza);
                                zzj().zzY(zzpcVar.zza.zzA(), zzohVarZzf2);
                                Deque deque2 = this.zzr;
                                if (!deque2.contains(zzpcVar.zza.zzA())) {
                                    deque2.add(zzpcVar.zza.zzA());
                                }
                            }
                        }
                    }
                    zzicVar.zze(i, (com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbc());
                }
            }
        }
    }

    @VisibleForTesting
    public final void zzU(String str, com.google.android.gms.internal.measurement.zzhv zzhvVar, Bundle bundle, String str2) {
        List listListOf = CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"});
        long jZzf = (zzpp.zzZ(zzhvVar.zza()) || zzpp.zzZ(str)) ? zzd().zzf(str2, true) : zzd().zze(str2, true);
        long jCodePointCount = zzhvVar.zzc().codePointCount(0, zzhvVar.zzc().length());
        zzpp zzppVarZzt = zzt();
        String strZza = zzhvVar.zza();
        zzd();
        String strZzC = zzppVarZzt.zzC(strZza, 40, true);
        if (jCodePointCount <= jZzf || listListOf.contains(zzhvVar.zza())) {
            return;
        }
        if ("_ev".equals(zzhvVar.zza())) {
            bundle.putString("_ev", zzt().zzC(zzhvVar.zzc(), zzd().zzf(str2, true), true));
            return;
        }
        zzaV().zzh().zzc("Param value is too long; discarded. Name, value length", strZzC, Long.valueOf(jCodePointCount));
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", strZzC);
                bundle.putLong("_el", jCodePointCount);
            }
        }
        bundle.remove(zzhvVar.zza());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0072 A[Catch: all -> 0x0017, TryCatch #2 {all -> 0x0017, blocks: (B:4:0x0014, B:8:0x001c, B:16:0x0035, B:21:0x0081, B:20:0x0072, B:22:0x008d, B:24:0x00a4, B:27:0x00b7, B:29:0x00c5, B:31:0x00e5, B:73:0x0220, B:75:0x0233, B:77:0x023d, B:85:0x025d, B:79:0x0243, B:81:0x024d, B:83:0x0253, B:84:0x0257, B:86:0x0260, B:87:0x0267, B:30:0x00d8, B:88:0x0268), top: B:95:0x0014, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d A[Catch: all -> 0x0017, PHI: r0
  0x008d: PHI (r0v2 int) = (r0v0 int), (r0v37 int) binds: [B:9:0x0028, B:15:0x0033] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {all -> 0x0017, blocks: (B:4:0x0014, B:8:0x001c, B:16:0x0035, B:21:0x0081, B:20:0x0072, B:22:0x008d, B:24:0x00a4, B:27:0x00b7, B:29:0x00c5, B:31:0x00e5, B:73:0x0220, B:75:0x0233, B:77:0x023d, B:85:0x025d, B:79:0x0243, B:81:0x024d, B:83:0x0253, B:84:0x0257, B:86:0x0260, B:87:0x0267, B:30:0x00d8, B:88:0x0268), top: B:95:0x0014, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5 A[Catch: all -> 0x0017, SQLiteException -> 0x00b4, TryCatch #0 {SQLiteException -> 0x00b4, blocks: (B:24:0x00a4, B:27:0x00b7, B:29:0x00c5, B:31:0x00e5, B:73:0x0220, B:75:0x0233, B:77:0x023d, B:85:0x025d, B:79:0x0243, B:81:0x024d, B:83:0x0253, B:84:0x0257, B:86:0x0260, B:87:0x0267, B:30:0x00d8), top: B:93:0x00a4, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d8 A[Catch: all -> 0x0017, SQLiteException -> 0x00b4, TryCatch #0 {SQLiteException -> 0x00b4, blocks: (B:24:0x00a4, B:27:0x00b7, B:29:0x00c5, B:31:0x00e5, B:73:0x0220, B:75:0x0233, B:77:0x023d, B:85:0x025d, B:79:0x0243, B:81:0x024d, B:83:0x0253, B:84:0x0257, B:86:0x0260, B:87:0x0267, B:30:0x00d8), top: B:93:0x00a4, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fd A[Catch: all -> 0x0157, TryCatch #1 {all -> 0x0157, blocks: (B:32:0x00ec, B:33:0x00f5, B:35:0x00fd, B:37:0x0115, B:41:0x013f, B:43:0x0149, B:47:0x015a, B:48:0x015f, B:50:0x0165, B:52:0x017c, B:54:0x01a1, B:56:0x01bb, B:58:0x01de, B:59:0x01ef, B:60:0x01f3, B:62:0x01f9, B:63:0x0200, B:66:0x020d, B:68:0x0211, B:71:0x0218, B:72:0x0219), top: B:94:0x00ec, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0165 A[Catch: all -> 0x0157, TryCatch #1 {all -> 0x0157, blocks: (B:32:0x00ec, B:33:0x00f5, B:35:0x00fd, B:37:0x0115, B:41:0x013f, B:43:0x0149, B:47:0x015a, B:48:0x015f, B:50:0x0165, B:52:0x017c, B:54:0x01a1, B:56:0x01bb, B:58:0x01de, B:59:0x01ef, B:60:0x01f3, B:62:0x01f9, B:63:0x0200, B:66:0x020d, B:68:0x0211, B:71:0x0218, B:72:0x0219), top: B:94:0x00ec, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01bb A[Catch: all -> 0x0157, TryCatch #1 {all -> 0x0157, blocks: (B:32:0x00ec, B:33:0x00f5, B:35:0x00fd, B:37:0x0115, B:41:0x013f, B:43:0x0149, B:47:0x015a, B:48:0x015f, B:50:0x0165, B:52:0x017c, B:54:0x01a1, B:56:0x01bb, B:58:0x01de, B:59:0x01ef, B:60:0x01f3, B:62:0x01f9, B:63:0x0200, B:66:0x020d, B:68:0x0211, B:71:0x0218, B:72:0x0219), top: B:94:0x00ec, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f9 A[Catch: all -> 0x0157, TRY_LEAVE, TryCatch #1 {all -> 0x0157, blocks: (B:32:0x00ec, B:33:0x00f5, B:35:0x00fd, B:37:0x0115, B:41:0x013f, B:43:0x0149, B:47:0x015a, B:48:0x015f, B:50:0x0165, B:52:0x017c, B:54:0x01a1, B:56:0x01bb, B:58:0x01de, B:59:0x01ef, B:60:0x01f3, B:62:0x01f9, B:63:0x0200, B:66:0x020d, B:68:0x0211, B:71:0x0218, B:72:0x0219), top: B:94:0x00ec, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0243 A[Catch: all -> 0x0017, SQLiteException -> 0x00b4, TryCatch #0 {SQLiteException -> 0x00b4, blocks: (B:24:0x00a4, B:27:0x00b7, B:29:0x00c5, B:31:0x00e5, B:73:0x0220, B:75:0x0233, B:77:0x023d, B:85:0x025d, B:79:0x0243, B:81:0x024d, B:83:0x0253, B:84:0x0257, B:86:0x0260, B:87:0x0267, B:30:0x00d8), top: B:93:0x00a4, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0257 A[Catch: all -> 0x0017, SQLiteException -> 0x00b4, TryCatch #0 {SQLiteException -> 0x00b4, blocks: (B:24:0x00a4, B:27:0x00b7, B:29:0x00c5, B:31:0x00e5, B:73:0x0220, B:75:0x0233, B:77:0x023d, B:85:0x025d, B:79:0x0243, B:81:0x024d, B:83:0x0253, B:84:0x0257, B:86:0x0260, B:87:0x0267, B:30:0x00d8), top: B:93:0x00a4, outer: #2 }] */
    @androidx.annotation.VisibleForTesting
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzV(boolean r20, int r21, java.lang.Throwable r22, byte[] r23, java.lang.String r24, java.util.List r25) {
        /*
            Method dump skipped, instruction units count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpg.zzV(boolean, int, java.lang.Throwable, byte[], java.lang.String, java.util.List):void");
    }

    @WorkerThread
    public final void zzW(zzh zzhVar) {
        zzaW().zzg();
        if (TextUtils.isEmpty(zzhVar.zzf())) {
            zzX((String) Preconditions.checkNotNull(zzhVar.zzc()), 204, null, null, null);
            return;
        }
        String str = (String) Preconditions.checkNotNull(zzhVar.zzc());
        zzaV().zzk().zzb("Fetching remote configuration", str);
        com.google.android.gms.internal.measurement.zzgl zzglVarZzb = zzh().zzb(str);
        String strZzd = zzh().zzd(str);
        ArrayMap arrayMap = null;
        if (zzglVarZzb != null) {
            if (!TextUtils.isEmpty(strZzd)) {
                arrayMap = new ArrayMap();
                arrayMap.put("If-Modified-Since", strZzd);
            }
            String strZze = zzh().zze(str);
            if (!TextUtils.isEmpty(strZze)) {
                if (arrayMap == null) {
                    arrayMap = new ArrayMap();
                }
                arrayMap.put("If-None-Match", strZze);
            }
        }
        this.zzu = true;
        zzi().zzd(zzhVar, arrayMap, new zzgw() { // from class: com.google.android.gms.measurement.internal.zzpf
            @Override // com.google.android.gms.measurement.internal.zzgw
            public final /* synthetic */ void zza(String str2, int i, Throwable th2, byte[] bArr, Map map) {
                this.zza.zzX(str2, i, th2, bArr, map);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    @androidx.annotation.VisibleForTesting
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzX(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map r11) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpg.zzX(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    @WorkerThread
    public final void zzY(Runnable runnable) {
        zzaW().zzg();
        if (this.zzq == null) {
            this.zzq = new ArrayList();
        }
        this.zzq.add(runnable);
    }

    @WorkerThread
    public final void zzZ() {
        zzaW().zzg();
        zzu();
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        if (zzaa()) {
            FileChannel fileChannel = this.zzy;
            zzaW().zzg();
            int i = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                zzaV().zzb().zza("Bad channel to read from");
            } else {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int i4 = fileChannel.read(byteBufferAllocate);
                    if (i4 == 4) {
                        byteBufferAllocate.flip();
                        i = byteBufferAllocate.getInt();
                    } else if (i4 != -1) {
                        zzaV().zze().zzb("Unexpected data length. Bytes read", Integer.valueOf(i4));
                    }
                } catch (IOException e) {
                    zzaV().zzb().zzb("Failed to read from channel", e);
                }
            }
            int iZzm = this.zzn.zzv().zzm();
            zzaW().zzg();
            if (i > iZzm) {
                zzaV().zzb().zzc("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(iZzm));
                return;
            }
            if (i < iZzm) {
                FileChannel fileChannel2 = this.zzy;
                zzaW().zzg();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    zzaV().zzb().zza("Bad channel to read from");
                } else {
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                    byteBufferAllocate2.putInt(iZzm);
                    byteBufferAllocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(byteBufferAllocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            zzaV().zzb().zzb("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                        }
                        zzaV().zzk().zzc("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(iZzm));
                        return;
                    } catch (IOException e7) {
                        zzaV().zzb().zzb("Failed to write to channel", e7);
                    }
                }
                zzaV().zzb().zzc("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(iZzm));
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final zzae zzaU() {
        return this.zzn.zzaU();
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final zzgu zzaV() {
        return ((zzic) Preconditions.checkNotNull(this.zzn)).zzaV();
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final zzhz zzaW() {
        return ((zzic) Preconditions.checkNotNull(this.zzn)).zzaW();
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final Context zzaY() {
        return this.zzn.zzaY();
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final Clock zzaZ() {
        return ((zzic) Preconditions.checkNotNull(this.zzn)).zzaZ();
    }

    @VisibleForTesting
    @WorkerThread
    public final boolean zzaa() {
        zzaW().zzg();
        FileLock fileLock = this.zzx;
        if (fileLock != null && fileLock.isValid()) {
            zzaV().zzk().zza("Storage concurrent access okay");
            return true;
        }
        this.zze.zzu.zzc();
        File filesDir = this.zzn.zzaY().getFilesDir();
        com.google.android.gms.internal.measurement.zzbv.zza();
        int i = com.google.android.gms.internal.measurement.zzca.zzb;
        try {
            FileChannel channel = new RandomAccessFile(new File(new File(filesDir, "google_app_measurement.db").getPath()), "rw").getChannel();
            this.zzy = channel;
            FileLock fileLockTryLock = channel.tryLock();
            this.zzx = fileLockTryLock;
            if (fileLockTryLock != null) {
                zzaV().zzk().zza("Storage concurrent access okay");
                return true;
            }
            zzaV().zzb().zza("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            zzaV().zzb().zzb("Failed to acquire storage lock", e);
            return false;
        } catch (IOException e7) {
            zzaV().zzb().zzb("Failed to access storage lock file", e7);
            return false;
        } catch (OverlappingFileLockException e10) {
            zzaV().zze().zzb("Storage lock already acquired", e10);
            return false;
        }
    }

    @VisibleForTesting(otherwise = 4)
    @WorkerThread
    public final void zzab(zzr zzrVar) {
        if (this.zzz != null) {
            ArrayList arrayList = new ArrayList();
            this.zzA = arrayList;
            arrayList.addAll(this.zzz);
        }
        zzav zzavVarZzj = zzj();
        String str = (String) Preconditions.checkNotNull(zzrVar.zza);
        Preconditions.checkNotEmpty(str);
        zzavVarZzj.zzg();
        zzavVarZzj.zzaw();
        try {
            SQLiteDatabase sQLiteDatabaseZze = zzavVarZzj.zze();
            String[] strArr = {str};
            int iDelete = sQLiteDatabaseZze.delete("apps", "app_id=?", strArr) + sQLiteDatabaseZze.delete("events", "app_id=?", strArr) + sQLiteDatabaseZze.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseZze.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseZze.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseZze.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseZze.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseZze.delete("queue", "app_id=?", strArr) + sQLiteDatabaseZze.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseZze.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseZze.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseZze.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseZze.delete("upload_queue", "app_id=?", strArr);
            com.google.android.gms.internal.measurement.zzpo.zza();
            zzic zzicVar = zzavVarZzj.zzu;
            if (zzicVar.zzc().zzp(null, zzfy.zzbh)) {
                iDelete += sQLiteDatabaseZze.delete("no_data_mode_events", "app_id=?", strArr);
            }
            if (iDelete > 0) {
                zzicVar.zzaV().zzk().zzc("Reset analytics data. app, records", str, Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e) {
            zzavVarZzj.zzu.zzaV().zzb().zzc("Error resetting analytics data. appId, error", zzgu.zzl(str), e);
        }
        if (zzrVar.zzh) {
            zzah(zzrVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d1  */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzac(com.google.android.gms.measurement.internal.zzpl r22, com.google.android.gms.measurement.internal.zzr r23) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpg.zzac(com.google.android.gms.measurement.internal.zzpl, com.google.android.gms.measurement.internal.zzr):void");
    }

    @WorkerThread
    public final void zzad(String str, zzr zzrVar) {
        zzaW().zzg();
        zzu();
        if (zzaR(zzrVar)) {
            if (!zzrVar.zzh) {
                zzao(zzrVar);
                return;
            }
            Boolean boolZzaT = zzaT(zzrVar);
            if ("_npa".equals(str) && boolZzaT != null) {
                zzaV().zzj().zza("Falling back to manifest metadata value for ad personalization");
                zzac(new zzpl("_npa", zzaZ().currentTimeMillis(), Long.valueOf(true != boolZzaT.booleanValue() ? 0L : 1L), TtmlNode.TEXT_EMPHASIS_AUTO), zzrVar);
                return;
            }
            zzgs zzgsVarZzj = zzaV().zzj();
            zzic zzicVar = this.zzn;
            zzgsVarZzj.zzb("Removing user property", zzicVar.zzl().zzc(str));
            zzj().zzb();
            try {
                zzao(zzrVar);
                if ("_id".equals(str)) {
                    zzj().zzk((String) Preconditions.checkNotNull(zzrVar.zza), "_lair");
                }
                zzj().zzk((String) Preconditions.checkNotNull(zzrVar.zza), str);
                zzj().zzc();
                zzaV().zzj().zzb("User property removed", zzicVar.zzl().zzc(str));
                zzj().zzd();
            } catch (Throwable th2) {
                zzj().zzd();
                throw th2;
            }
        }
    }

    public final void zzae() {
        this.zzs++;
    }

    public final void zzaf() {
        this.zzt++;
    }

    public final zzic zzag() {
        return this.zzn;
    }

    @WorkerThread
    public final void zzah(zzr zzrVar) {
        long j;
        long j6;
        zzbc zzbcVarZzf;
        boolean z4;
        String str;
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        long j7;
        boolean z5;
        zzaW().zzg();
        zzu();
        Preconditions.checkNotNull(zzrVar);
        String str2 = zzrVar.zza;
        Preconditions.checkNotEmpty(str2);
        if (zzaR(zzrVar)) {
            zzh zzhVarZzu = zzj().zzu(str2);
            if (zzhVarZzu != null && TextUtils.isEmpty(zzhVarZzu.zzf()) && !TextUtils.isEmpty(zzrVar.zzb)) {
                zzhVarZzu.zzI(0L);
                zzj().zzv(zzhVarZzu, false, false);
                zzh().zzh(str2);
            }
            if (!zzrVar.zzh) {
                zzao(zzrVar);
                return;
            }
            long jCurrentTimeMillis = zzrVar.zzl;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = zzaZ().currentTimeMillis();
            }
            long j9 = jCurrentTimeMillis;
            int i = zzrVar.zzm;
            if (i != 0 && i != 1) {
                zzaV().zze().zzc("Incorrect app type, assuming installed app. appId, appType", zzgu.zzl(str2), Integer.valueOf(i));
                i = 0;
            }
            zzj().zzb();
            try {
                zzpn zzpnVarZzm = zzj().zzm(str2, "_npa");
                Boolean boolZzaT = zzaT(zzrVar);
                if (zzpnVarZzm != null && !TtmlNode.TEXT_EMPHASIS_AUTO.equals(zzpnVarZzm.zzb)) {
                    j = j9;
                    j6 = 1;
                } else if (boolZzaT != null) {
                    zzpl zzplVar = new zzpl("_npa", j9, Long.valueOf(true != boolZzaT.booleanValue() ? 0L : 1L), TtmlNode.TEXT_EMPHASIS_AUTO);
                    j6 = 1;
                    j = j9;
                    if (zzpnVarZzm == null || !zzpnVarZzm.zze.equals(zzplVar.zzd)) {
                        zzac(zzplVar, zzrVar);
                    }
                } else {
                    j = j9;
                    j6 = 1;
                    if (zzpnVarZzm != null) {
                        zzad("_npa", zzrVar);
                    }
                }
                if (zzd().zzp(null, zzfy.zzbb)) {
                    zzan(zzrVar, zzrVar.zzD);
                } else {
                    zzan(zzrVar, j);
                }
                zzao(zzrVar);
                if (i == 0) {
                    zzbcVarZzf = zzj().zzf(str2, "_f");
                    z4 = false;
                } else {
                    zzbcVarZzf = zzj().zzf(str2, "_v");
                    z4 = true;
                }
                if (zzbcVarZzf == null) {
                    long j10 = ((j / 3600000) + j6) * 3600000;
                    if (z4) {
                        long j11 = j;
                        zzac(new zzpl("_fvt", j11, Long.valueOf(j10), TtmlNode.TEXT_EMPHASIS_AUTO), zzrVar);
                        zzaW().zzg();
                        zzu();
                        Bundle bundle = new Bundle();
                        bundle.putLong("_c", 1L);
                        bundle.putLong("_r", 1L);
                        bundle.putLong("_et", 1L);
                        if (zzrVar.zzo) {
                            bundle.putLong("_dac", 1L);
                        }
                        if (zzd().zzp(null, zzfy.zzbj)) {
                            bundle.putLong("_elt", zzaZ().currentTimeMillis());
                        }
                        zzE(new zzbg("_v", new zzbe(bundle), TtmlNode.TEXT_EMPHASIS_AUTO, j11), zzrVar);
                    } else {
                        Long lValueOf = Long.valueOf(j10);
                        long j12 = j;
                        zzac(new zzpl("_fot", j12, lValueOf, TtmlNode.TEXT_EMPHASIS_AUTO), zzrVar);
                        zzaW().zzg();
                        zzhk zzhkVar = (zzhk) Preconditions.checkNotNull(this.zzm);
                        if (str2 == null || str2.isEmpty()) {
                            str = "_elt";
                            zzhkVar.zza.zzaV().zzf().zza("Install Referrer Reporter was called with invalid app package name");
                        } else {
                            zzic zzicVar = zzhkVar.zza;
                            zzicVar.zzaW().zzg();
                            if (zzhkVar.zza()) {
                                zzhj zzhjVar = new zzhj(zzhkVar, str2);
                                zzicVar.zzaW().zzg();
                                Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                str = "_elt";
                                intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                PackageManager packageManager = zzicVar.zzaY().getPackageManager();
                                if (packageManager == null) {
                                    zzicVar.zzaV().zzf().zza("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                } else {
                                    List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
                                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                                        zzicVar.zzaV().zzi().zza("Play Service for fetching Install Referrer is unavailable on device");
                                    } else {
                                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                                        if (serviceInfo != null) {
                                            String str3 = serviceInfo.packageName;
                                            if (serviceInfo.name != null && "com.android.vending".equals(str3) && zzhkVar.zza()) {
                                                try {
                                                    zzicVar.zzaV().zzk().zzb("Install Referrer Service is", ConnectionTracker.getInstance().bindService(zzicVar.zzaY(), new Intent(intent), zzhjVar, 1) ? "available" : "not available");
                                                } catch (RuntimeException e) {
                                                    zzhkVar.zza.zzaV().zzb().zzb("Exception occurred while binding to Install Referrer Service", e.getMessage());
                                                }
                                            } else {
                                                zzicVar.zzaV().zze().zza("Play Store version 8.3.73 or higher required for Install Referrer");
                                            }
                                        }
                                    }
                                }
                            } else {
                                zzicVar.zzaV().zzi().zza("Install Referrer Reporter is not available");
                                str = "_elt";
                            }
                        }
                        zzaW().zzg();
                        zzu();
                        Bundle bundle2 = new Bundle();
                        long j13 = j6;
                        bundle2.putLong("_c", j13);
                        bundle2.putLong("_r", j13);
                        bundle2.putLong("_uwa", 0L);
                        bundle2.putLong("_pfo", 0L);
                        bundle2.putLong("_sys", 0L);
                        bundle2.putLong("_sysu", 0L);
                        bundle2.putLong("_et", j13);
                        if (zzrVar.zzo) {
                            bundle2.putLong("_dac", j13);
                        }
                        String str4 = (String) Preconditions.checkNotNull(zzrVar.zza);
                        zzav zzavVarZzj = zzj();
                        Preconditions.checkNotEmpty(str4);
                        zzavVarZzj.zzg();
                        zzavVarZzj.zzaw();
                        long jZzN = zzavVarZzj.zzN(str4, "first_open_count");
                        zzic zzicVar2 = this.zzn;
                        if (zzicVar2.zzaY().getPackageManager() == null) {
                            zzaV().zzb().zzb("PackageManager is null, first open report might be inaccurate. appId", zzgu.zzl(str4));
                        } else {
                            try {
                                packageInfo = Wrappers.packageManager(zzicVar2.zzaY()).getPackageInfo(str4, 0);
                            } catch (PackageManager.NameNotFoundException e7) {
                                zzaV().zzb().zzc("Package info is null, first open report might be inaccurate. appId", zzgu.zzl(str4), e7);
                                packageInfo = null;
                            }
                            if (packageInfo != null) {
                                long j14 = packageInfo.firstInstallTime;
                                if (j14 != 0) {
                                    if (j14 != packageInfo.lastUpdateTime) {
                                        if (!zzd().zzp(null, zzfy.zzaI)) {
                                            bundle2.putLong("_uwa", 1L);
                                        } else if (jZzN == 0) {
                                            bundle2.putLong("_uwa", 1L);
                                            jZzN = 0;
                                        }
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    zzac(new zzpl("_fi", j12, Long.valueOf(true != z5 ? 0L : 1L), TtmlNode.TEXT_EMPHASIS_AUTO), zzrVar);
                                }
                            }
                            try {
                                applicationInfo = Wrappers.packageManager(this.zzn.zzaY()).getApplicationInfo(str4, 0);
                            } catch (PackageManager.NameNotFoundException e10) {
                                zzaV().zzb().zzc("Application info is null, first open report might be inaccurate. appId", zzgu.zzl(str4), e10);
                                applicationInfo = null;
                            }
                            if (applicationInfo != null) {
                                if ((applicationInfo.flags & 1) != 0) {
                                    j7 = 1;
                                    bundle2.putLong("_sys", 1L);
                                } else {
                                    j7 = 1;
                                }
                                if ((applicationInfo.flags & 128) != 0) {
                                    bundle2.putLong("_sysu", j7);
                                }
                            }
                        }
                        if (jZzN >= 0) {
                            bundle2.putLong("_pfo", jZzN);
                        }
                        if (zzd().zzp(null, zzfy.zzbj)) {
                            bundle2.putLong(str, zzaZ().currentTimeMillis());
                        }
                        zzE(new zzbg("_f", new zzbe(bundle2), TtmlNode.TEXT_EMPHASIS_AUTO, j12), zzrVar);
                    }
                } else {
                    long j15 = j;
                    if (zzrVar.zzi) {
                        zzE(new zzbg("_cd", new zzbe(new Bundle()), TtmlNode.TEXT_EMPHASIS_AUTO, j15), zzrVar);
                    }
                }
                zzj().zzc();
                zzj().zzd();
            } catch (Throwable th2) {
                zzj().zzd();
                throw th2;
            }
        }
    }

    @WorkerThread
    public final void zzai(zzr zzrVar) throws Throwable {
        zzaW().zzg();
        zzu();
        Preconditions.checkNotNull(zzrVar);
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
        int i = 0;
        if (zzd().zzp(null, zzfy.zzaz)) {
            long jCurrentTimeMillis = zzaZ().currentTimeMillis();
            int iZzm = zzd().zzm(null, zzfy.zzai);
            zzd();
            long jZzF = jCurrentTimeMillis - zzal.zzF();
            while (i < iZzm && zzaG(null, jZzF)) {
                i++;
            }
        } else {
            zzd();
            long jZzH = zzal.zzH();
            while (i < jZzH && zzaG(str, 0L)) {
                i++;
            }
        }
        if (zzd().zzp(null, zzfy.zzaA)) {
            zzaW().zzg();
            zzav();
        }
        if (this.zzl.zzc(str, com.google.android.gms.internal.measurement.zzin.zzb(zzrVar.zzE))) {
            zzaV().zzk().zzb("[sgtm] Going background, trigger client side upload. appId", str);
            zzN(str, zzaZ().currentTimeMillis());
        }
    }

    @WorkerThread
    public final void zzaj(zzah zzahVar) {
        zzr zzrVarZzaO = zzaO((String) Preconditions.checkNotNull(zzahVar.zza));
        if (zzrVarZzaO != null) {
            zzak(zzahVar, zzrVarZzaO);
        }
    }

    @WorkerThread
    public final void zzak(zzah zzahVar, zzr zzrVar) {
        Preconditions.checkNotNull(zzahVar);
        Preconditions.checkNotEmpty(zzahVar.zza);
        Preconditions.checkNotNull(zzahVar.zzb);
        Preconditions.checkNotNull(zzahVar.zzc);
        Preconditions.checkNotEmpty(zzahVar.zzc.zzb);
        zzaW().zzg();
        zzu();
        if (zzaR(zzrVar)) {
            if (!zzrVar.zzh) {
                zzao(zzrVar);
                return;
            }
            zzah zzahVar2 = new zzah(zzahVar);
            boolean z4 = false;
            zzahVar2.zze = false;
            zzj().zzb();
            try {
                zzah zzahVarZzq = zzj().zzq((String) Preconditions.checkNotNull(zzahVar2.zza), zzahVar2.zzc.zzb);
                if (zzahVarZzq != null && !zzahVarZzq.zzb.equals(zzahVar2.zzb)) {
                    zzaV().zze().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzn.zzl().zzc(zzahVar2.zzc.zzb), zzahVar2.zzb, zzahVarZzq.zzb);
                }
                if (zzahVarZzq != null && zzahVarZzq.zze) {
                    zzahVar2.zzb = zzahVarZzq.zzb;
                    zzahVar2.zzd = zzahVarZzq.zzd;
                    zzahVar2.zzh = zzahVarZzq.zzh;
                    zzahVar2.zzf = zzahVarZzq.zzf;
                    zzahVar2.zzi = zzahVarZzq.zzi;
                    zzahVar2.zze = true;
                    zzpl zzplVar = zzahVar2.zzc;
                    zzahVar2.zzc = new zzpl(zzplVar.zzb, zzahVarZzq.zzc.zzc, zzplVar.zza(), zzahVarZzq.zzc.zzf);
                } else if (TextUtils.isEmpty(zzahVar2.zzf)) {
                    zzpl zzplVar2 = zzahVar2.zzc;
                    zzahVar2.zzc = new zzpl(zzplVar2.zzb, zzahVar2.zzd, zzplVar2.zza(), zzahVar2.zzc.zzf);
                    zzahVar2.zze = true;
                    z4 = true;
                }
                if (zzahVar2.zze) {
                    zzpl zzplVar3 = zzahVar2.zzc;
                    zzpn zzpnVar = new zzpn((String) Preconditions.checkNotNull(zzahVar2.zza), zzahVar2.zzb, zzplVar3.zzb, zzplVar3.zzc, Preconditions.checkNotNull(zzplVar3.zza()));
                    if (zzj().zzl(zzpnVar)) {
                        zzaV().zzj().zzd("User property updated immediately", zzahVar2.zza, this.zzn.zzl().zzc(zzpnVar.zzc), zzpnVar.zze);
                    } else {
                        zzaV().zzb().zzd("(2)Too many active user properties, ignoring", zzgu.zzl(zzahVar2.zza), this.zzn.zzl().zzc(zzpnVar.zzc), zzpnVar.zze);
                    }
                    if (z4 && zzahVar2.zzi != null) {
                        zzH(new zzbg(zzahVar2.zzi, zzahVar2.zzd), zzrVar);
                    }
                }
                if (zzj().zzp(zzahVar2)) {
                    zzaV().zzj().zzd("Conditional property added", zzahVar2.zza, this.zzn.zzl().zzc(zzahVar2.zzc.zzb), zzahVar2.zzc.zza());
                } else {
                    zzaV().zzb().zzd("Too many conditional properties, ignoring", zzgu.zzl(zzahVar2.zza), this.zzn.zzl().zzc(zzahVar2.zzc.zzb), zzahVar2.zzc.zza());
                }
                zzj().zzc();
                zzj().zzd();
            } catch (Throwable th2) {
                zzj().zzd();
                throw th2;
            }
        }
    }

    @WorkerThread
    public final void zzal(zzah zzahVar) {
        zzr zzrVarZzaO = zzaO((String) Preconditions.checkNotNull(zzahVar.zza));
        if (zzrVarZzaO != null) {
            zzam(zzahVar, zzrVarZzaO);
        }
    }

    @WorkerThread
    public final void zzam(zzah zzahVar, zzr zzrVar) {
        Preconditions.checkNotNull(zzahVar);
        Preconditions.checkNotEmpty(zzahVar.zza);
        Preconditions.checkNotNull(zzahVar.zzc);
        Preconditions.checkNotEmpty(zzahVar.zzc.zzb);
        zzaW().zzg();
        zzu();
        if (zzaR(zzrVar)) {
            if (!zzrVar.zzh) {
                zzao(zzrVar);
                return;
            }
            zzj().zzb();
            try {
                zzao(zzrVar);
                String str = (String) Preconditions.checkNotNull(zzahVar.zza);
                zzah zzahVarZzq = zzj().zzq(str, zzahVar.zzc.zzb);
                if (zzahVarZzq != null) {
                    zzaV().zzj().zzc("Removing conditional user property", zzahVar.zza, this.zzn.zzl().zzc(zzahVar.zzc.zzb));
                    zzj().zzr(str, zzahVar.zzc.zzb);
                    if (zzahVarZzq.zze) {
                        zzj().zzk(str, zzahVar.zzc.zzb);
                    }
                    zzbg zzbgVar = zzahVar.zzk;
                    if (zzbgVar != null) {
                        zzbe zzbeVar = zzbgVar.zzb;
                        zzH((zzbg) Preconditions.checkNotNull(zzt().zzac(str, ((zzbg) Preconditions.checkNotNull(zzbgVar)).zza, zzbeVar != null ? zzbeVar.zzf() : null, zzahVarZzq.zzb, zzbgVar.zzd, true, true)), zzrVar);
                    }
                } else {
                    zzaV().zze().zzc("Conditional user property doesn't exist", zzgu.zzl(zzahVar.zza), this.zzn.zzl().zzc(zzahVar.zzc.zzb));
                }
                zzj().zzc();
                zzj().zzd();
            } catch (Throwable th2) {
                zzj().zzd();
                throw th2;
            }
        }
    }

    @WorkerThread
    public final void zzan(zzr zzrVar, long j) {
        zzh zzhVarZzu = zzj().zzu((String) Preconditions.checkNotNull(zzrVar.zza));
        if (zzhVarZzu != null && zzt().zzB(zzrVar.zzb, zzhVarZzu.zzf())) {
            zzaV().zze().zzb("New GMP App Id passed in. Removing cached database data. appId", zzgu.zzl(zzhVarZzu.zzc()));
            zzav zzavVarZzj = zzj();
            String strZzc = zzhVarZzu.zzc();
            zzavVarZzj.zzaw();
            zzavVarZzj.zzg();
            Preconditions.checkNotEmpty(strZzc);
            try {
                SQLiteDatabase sQLiteDatabaseZze = zzavVarZzj.zze();
                String[] strArr = {strZzc};
                int iDelete = sQLiteDatabaseZze.delete("events", "app_id=?", strArr) + sQLiteDatabaseZze.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseZze.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseZze.delete("apps", "app_id=?", strArr) + sQLiteDatabaseZze.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseZze.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseZze.delete("event_filters", "app_id=?", strArr) + sQLiteDatabaseZze.delete("property_filters", "app_id=?", strArr) + sQLiteDatabaseZze.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseZze.delete("consent_settings", "app_id=?", strArr) + sQLiteDatabaseZze.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseZze.delete("trigger_uris", "app_id=?", strArr);
                com.google.android.gms.internal.measurement.zzpo.zza();
                zzic zzicVar = zzavVarZzj.zzu;
                if (zzicVar.zzc().zzp(null, zzfy.zzbh)) {
                    iDelete += sQLiteDatabaseZze.delete("no_data_mode_events", "app_id=?", strArr);
                }
                if (iDelete > 0) {
                    zzicVar.zzaV().zzk().zzc("Deleted application data. app, records", strZzc, Integer.valueOf(iDelete));
                }
            } catch (SQLiteException e) {
                zzavVarZzj.zzu.zzaV().zzb().zzc("Error deleting application data. appId, error", zzgu.zzl(strZzc), e);
            }
            zzhVarZzu = null;
        }
        if (zzhVarZzu != null) {
            boolean z4 = (zzhVarZzu.zzt() == -2147483648L || zzhVarZzu.zzt() == zzrVar.zzj) ? false : true;
            String strZzr = zzhVarZzu.zzr();
            if (z4 || ((zzhVarZzu.zzt() != -2147483648L || strZzr == null || strZzr.equals(zzrVar.zzc)) ? false : true)) {
                zzbg zzbgVar = new zzbg("_au", new zzbe(c.d("_pv", strZzr)), TtmlNode.TEXT_EMPHASIS_AUTO, j);
                if (zzd().zzp(null, zzfy.zzbc)) {
                    zzE(zzbgVar, zzrVar);
                } else {
                    zzF(zzbgVar, zzrVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e2  */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzh zzao(com.google.android.gms.measurement.internal.zzr r13) {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpg.zzao(com.google.android.gms.measurement.internal.zzr):com.google.android.gms.measurement.internal.zzh");
    }

    public final String zzap(zzr zzrVar) {
        try {
            return (String) zzaW().zzh(new zzoz(this, zzrVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzaV().zzb().zzc("Failed to get app instance id. appId", zzgu.zzl(zzrVar.zza), e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    @WorkerThread
    public final List zzaq(zzr zzrVar, Bundle bundle) {
        zzaW().zzg();
        zzqp.zza();
        zzal zzalVarZzd = zzd();
        String str = zzrVar.zza;
        if (!zzalVarZzd.zzp(str, zzfy.zzaP) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    zzaV().zzb().zza("Uri sources and timestamps do not match");
                } else {
                    for (int i = 0; i < intArray.length; i++) {
                        zzav zzavVarZzj = zzj();
                        int i4 = intArray[i];
                        long j = longArray[i];
                        Preconditions.checkNotEmpty(str);
                        zzavVarZzj.zzg();
                        zzavVarZzj.zzaw();
                        try {
                            int iDelete = zzavVarZzj.zze().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i4), String.valueOf(j)});
                            zzgs zzgsVarZzk = zzavVarZzj.zzu.zzaV().zzk();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(iDelete).length() + 46);
                            sb2.append("Pruned ");
                            sb2.append(iDelete);
                            sb2.append(" trigger URIs. appId, source, timestamp");
                            zzgsVarZzk.zzd(sb2.toString(), str, Integer.valueOf(i4), Long.valueOf(j));
                        } catch (SQLiteException e) {
                            zzavVarZzj.zzu.zzaV().zzb().zzc("Error pruning trigger URIs. appId", zzgu.zzl(str), e);
                        }
                    }
                }
            }
        }
        zzav zzavVarZzj2 = zzj();
        String str2 = zzrVar.zza;
        Preconditions.checkNotEmpty(str2);
        zzavVarZzj2.zzg();
        zzavVarZzj2.zzaw();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = zzavVarZzj2.zze().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new zzoh(string, cursorQuery.getLong(1), cursorQuery.getInt(2)));
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e7) {
                zzavVarZzj2.zzu.zzaV().zzb().zzc("Error querying trigger uris. appId", zzgu.zzl(str2), e7);
                arrayList = Collections.EMPTY_LIST;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return arrayList;
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th2;
        }
    }

    @WorkerThread
    public final void zzar(String str, zzaf zzafVar) {
        zzaW().zzg();
        zzu();
        zzav zzavVarZzj = zzj();
        long j = zzafVar.zza;
        zzpj zzpjVarZzB = zzavVarZzj.zzB(j);
        if (zzpjVarZzB == null) {
            zzaV().zze().zzc("[sgtm] Queued batch doesn't exist. appId, rowId", str, Long.valueOf(j));
            return;
        }
        String strZze = zzpjVarZzB.zze();
        if (zzafVar.zzb != zzlr.SUCCESS.zza()) {
            if (zzafVar.zzb == zzlr.BACKOFF.zza()) {
                Map map = this.zzF;
                zzpe zzpeVar = (zzpe) map.get(strZze);
                if (zzpeVar == null) {
                    zzpeVar = new zzpe(this);
                    map.put(strZze, zzpeVar);
                } else {
                    zzpeVar.zza();
                }
                zzaV().zzk().zzd("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str, strZze, Long.valueOf((zzpeVar.zzc() - zzaZ().currentTimeMillis()) / 1000));
            }
            zzav zzavVarZzj2 = zzj();
            Long lValueOf = Long.valueOf(zzafVar.zza);
            zzavVarZzj2.zzK(lValueOf);
            zzaV().zzk().zzc("[sgtm] increased batch retry count after failed client upload. appId, rowId", str, lValueOf);
            return;
        }
        Map map2 = this.zzF;
        if (map2.containsKey(strZze)) {
            map2.remove(strZze);
        }
        zzav zzavVarZzj3 = zzj();
        Long lValueOf2 = Long.valueOf(j);
        zzavVarZzj3.zzE(lValueOf2);
        zzaV().zzk().zzc("[sgtm] queued batch deleted after successful client upload. appId, rowId", str, lValueOf2);
        long j6 = zzafVar.zzc;
        if (j6 > 0) {
            zzav zzavVarZzj4 = zzj();
            zzavVarZzj4.zzg();
            zzavVarZzj4.zzaw();
            Long lValueOf3 = Long.valueOf(j6);
            Preconditions.checkNotNull(lValueOf3);
            ContentValues contentValues = new ContentValues();
            contentValues.put("upload_type", Integer.valueOf(zzls.GOOGLE_SIGNAL.zza()));
            zzic zzicVar = zzavVarZzj4.zzu;
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzicVar.zzaZ().currentTimeMillis()));
            try {
                if (zzavVarZzj4.zze().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j6), str, String.valueOf(zzls.GOOGLE_SIGNAL_PENDING.zza())}) != 1) {
                    zzicVar.zzaV().zze().zzc("Google Signal pending batch not updated. appId, rowId", str, lValueOf3);
                }
                zzaV().zzk().zzc("[sgtm] queued Google Signal batch updated. appId, signalRowId", str, Long.valueOf(zzafVar.zzc));
                zzP(str);
            } catch (SQLiteException e) {
                zzavVarZzj4.zzu.zzaV().zzb().zzd("Failed to update google Signal pending batch. appid, rowId", str, Long.valueOf(j6), e);
                throw e;
            }
        }
    }

    public final void zzas(boolean z4) {
        zzaL();
    }

    @WorkerThread
    public final void zzat(String str, zzlu zzluVar) {
        zzaW().zzg();
        String str2 = this.zzH;
        if (str2 == null || str2.equals(str) || zzluVar != null) {
            this.zzH = str;
            this.zzG = zzluVar;
        }
    }

    public final /* synthetic */ void zzau(zzph zzphVar) {
        zzaW().zzg();
        this.zzm = new zzhk(this);
        zzav zzavVar = new zzav(this);
        zzavVar.zzax();
        this.zze = zzavVar;
        zzd().zza((zzak) Preconditions.checkNotNull(this.zzc));
        zznn zznnVar = new zznn(this);
        zznnVar.zzax();
        this.zzk = zznnVar;
        zzad zzadVar = new zzad(this);
        zzadVar.zzax();
        this.zzh = zzadVar;
        zzlp zzlpVar = new zzlp(this);
        zzlpVar.zzax();
        this.zzj = zzlpVar;
        zzok zzokVar = new zzok(this);
        zzokVar.zzax();
        this.zzg = zzokVar;
        this.zzf = new zzhb(this);
        if (this.zzs != this.zzt) {
            zzaV().zzb().zzc("Not all upload components initialized", Integer.valueOf(this.zzs), Integer.valueOf(this.zzt));
        }
        this.zzo.set(true);
        zzaV().zzk().zza("UploadController is now fully initialized");
    }

    public final /* synthetic */ zzic zzax() {
        return this.zzn;
    }

    public final /* synthetic */ Deque zzay() {
        return this.zzr;
    }

    public final /* synthetic */ void zzaz(long j) {
        this.zzJ = j;
    }

    @WorkerThread
    public final void zzc() {
        zzaW().zzg();
        zzj().zzI();
        zzav zzavVarZzj = zzj();
        zzavVarZzj.zzg();
        zzavVarZzj.zzaw();
        if (zzavVarZzj.zzag()) {
            zzfx zzfxVar = zzfy.zzav;
            if (((Long) zzfxVar.zzb(null)).longValue() != 0) {
                SQLiteDatabase sQLiteDatabaseZze = zzavVarZzj.zze();
                zzic zzicVar = zzavVarZzj.zzu;
                int iDelete = sQLiteDatabaseZze.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(zzicVar.zzaZ().currentTimeMillis()), String.valueOf(zzfxVar.zzb(null))});
                if (iDelete > 0) {
                    zzicVar.zzaV().zzk().zzb("Deleted stale trigger uris. rowsDeleted", Integer.valueOf(iDelete));
                }
            }
        }
        if (this.zzk.zzd.zza() == 0) {
            this.zzk.zzd.zzb(zzaZ().currentTimeMillis());
        }
        zzaL();
    }

    public final zzal zzd() {
        return ((zzic) Preconditions.checkNotNull(this.zzn)).zzc();
    }

    public final zzou zzf() {
        return this.zzl;
    }

    public final zzht zzh() {
        zzht zzhtVar = this.zzc;
        zzaS(zzhtVar);
        return zzhtVar;
    }

    public final zzgz zzi() {
        zzgz zzgzVar = this.zzd;
        zzaS(zzgzVar);
        return zzgzVar;
    }

    public final zzav zzj() {
        zzav zzavVar = this.zze;
        zzaS(zzavVar);
        return zzavVar;
    }

    public final zzhb zzk() {
        zzhb zzhbVar = this.zzf;
        if (zzhbVar != null) {
            return zzhbVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final zzok zzl() {
        zzok zzokVar = this.zzg;
        zzaS(zzokVar);
        return zzokVar;
    }

    public final zzad zzm() {
        zzad zzadVar = this.zzh;
        zzaS(zzadVar);
        return zzadVar;
    }

    public final zzlp zzn() {
        zzlp zzlpVar = this.zzj;
        zzaS(zzlpVar);
        return zzlpVar;
    }

    public final zzpk zzp() {
        zzpk zzpkVar = this.zzi;
        zzaS(zzpkVar);
        return zzpkVar;
    }

    public final zznn zzq() {
        return this.zzk;
    }

    public final zzgn zzs() {
        return this.zzn.zzl();
    }

    public final zzpp zzt() {
        return ((zzic) Preconditions.checkNotNull(this.zzn)).zzk();
    }

    public final void zzu() {
        if (!this.zzo.get()) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    @WorkerThread
    public final void zzv(zzr zzrVar) {
        zzaW().zzg();
        zzu();
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
        zzjl zzjlVarZzf = zzjl.zzf(zzrVar.zzs, zzrVar.zzx);
        zzB(str);
        zzaV().zzk().zzc("Setting storage consent for package", str, zzjlVarZzf);
        zzA(str, zzjlVarZzf);
    }

    @WorkerThread
    public final void zzw(zzr zzrVar) {
        zzaW().zzg();
        zzu();
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
        zzaz zzazVarZzg = zzaz.zzg(zzrVar.zzy);
        zzaV().zzk().zzc("Setting DMA consent for package", str, zzazVarZzg);
        zzaW().zzg();
        zzu();
        zzji zzjiVarZzc = zzaz.zzh(zzy(str), 100).zzc();
        this.zzD.put(str, zzazVarZzg);
        zzj().zzab(str, zzazVarZzg);
        zzji zzjiVarZzc2 = zzaz.zzh(zzy(str), 100).zzc();
        zzaW().zzg();
        zzu();
        zzji zzjiVar = zzji.DENIED;
        boolean z4 = zzjiVarZzc == zzjiVar && zzjiVarZzc2 == zzji.GRANTED;
        boolean z5 = zzjiVarZzc == zzji.GRANTED && zzjiVarZzc2 == zzjiVar;
        if (z4 || z5) {
            zzaV().zzk().zzb("Generated _dcu event for", str);
            Bundle bundle = new Bundle();
            if (zzj().zzw(zzC(), str, false, false, false, false, false, false, false).zzf < zzd().zzm(str, zzfy.zzam)) {
                bundle.putLong("_r", 1L);
                zzaV().zzk().zzc("_dcu realtime event count", str, Long.valueOf(zzj().zzw(zzC(), str, false, false, false, false, false, true, false).zzf));
            }
            this.zzK.zza(str, "_dcu", bundle);
        }
    }

    @WorkerThread
    public final zzaz zzx(String str) {
        zzaW().zzg();
        zzu();
        Map map = this.zzD;
        zzaz zzazVar = (zzaz) map.get(str);
        if (zzazVar != null) {
            return zzazVar;
        }
        zzaz zzazVarZzaa = zzj().zzaa(str);
        map.put(str, zzazVarZzaa);
        return zzazVarZzaa;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @WorkerThread
    public final Bundle zzy(String str) {
        zzaW().zzg();
        zzu();
        if (zzh().zzx(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        zzjl zzjlVarZzB = zzB(str);
        bundle.putAll(zzjlVarZzB.zzn());
        bundle.putAll(zzz(str, zzx(str), zzjlVarZzB, new zzan()).zzf());
        zzpn zzpnVarZzm = zzj().zzm(str, "_npa");
        bundle.putString("ad_personalization", 1 != (zzpnVarZzm != null ? zzpnVarZzm.zze.equals(1L) : zzaC(str, new zzan())) ? "granted" : "denied");
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    @androidx.annotation.VisibleForTesting
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzaz zzz(java.lang.String r10, com.google.android.gms.measurement.internal.zzaz r11, com.google.android.gms.measurement.internal.zzjl r12, com.google.android.gms.measurement.internal.zzan r13) {
        /*
            r9 = this;
            com.google.android.gms.measurement.internal.zzht r0 = r9.zzh()
            com.google.android.gms.internal.measurement.zzgf r0 = r0.zzx(r10)
            java.lang.String r1 = "-"
            r2 = 90
            if (r0 != 0) goto L31
            com.google.android.gms.measurement.internal.zzji r10 = r11.zzc()
            com.google.android.gms.measurement.internal.zzji r12 = com.google.android.gms.measurement.internal.zzji.DENIED
            if (r10 != r12) goto L20
            int r2 = r11.zzb()
            com.google.android.gms.measurement.internal.zzjk r10 = com.google.android.gms.measurement.internal.zzjk.AD_USER_DATA
            r13.zzb(r10, r2)
            goto L27
        L20:
            com.google.android.gms.measurement.internal.zzjk r10 = com.google.android.gms.measurement.internal.zzjk.AD_USER_DATA
            com.google.android.gms.measurement.internal.zzam r11 = com.google.android.gms.measurement.internal.zzam.FAILSAFE
            r13.zzc(r10, r11)
        L27:
            com.google.android.gms.measurement.internal.zzaz r10 = new com.google.android.gms.measurement.internal.zzaz
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            r10.<init>(r11, r2, r12, r1)
            return r10
        L31:
            com.google.android.gms.measurement.internal.zzji r0 = r11.zzc()
            com.google.android.gms.measurement.internal.zzji r3 = com.google.android.gms.measurement.internal.zzji.GRANTED
            if (r0 == r3) goto L85
            com.google.android.gms.measurement.internal.zzji r4 = com.google.android.gms.measurement.internal.zzji.DENIED
            if (r0 != r4) goto L3e
            goto L85
        L3e:
            com.google.android.gms.measurement.internal.zzji r11 = com.google.android.gms.measurement.internal.zzji.POLICY
            if (r0 != r11) goto L55
            com.google.android.gms.measurement.internal.zzht r11 = r9.zzc
            com.google.android.gms.measurement.internal.zzjk r0 = com.google.android.gms.measurement.internal.zzjk.AD_USER_DATA
            com.google.android.gms.measurement.internal.zzji r11 = r11.zzA(r10, r0)
            com.google.android.gms.measurement.internal.zzji r5 = com.google.android.gms.measurement.internal.zzji.UNINITIALIZED
            if (r11 == r5) goto L55
            com.google.android.gms.measurement.internal.zzam r12 = com.google.android.gms.measurement.internal.zzam.REMOTE_ENFORCED_DEFAULT
            r13.zzc(r0, r12)
            r0 = r11
            goto L8e
        L55:
            com.google.android.gms.measurement.internal.zzht r11 = r9.zzc
            com.google.android.gms.measurement.internal.zzjk r0 = com.google.android.gms.measurement.internal.zzjk.AD_USER_DATA
            com.google.android.gms.measurement.internal.zzjk r5 = r11.zzw(r10, r0)
            com.google.android.gms.measurement.internal.zzji r12 = r12.zzp()
            r6 = 1
            if (r12 == r3) goto L66
            if (r12 != r4) goto L68
        L66:
            r7 = r6
            goto L69
        L68:
            r7 = 0
        L69:
            com.google.android.gms.measurement.internal.zzjk r8 = com.google.android.gms.measurement.internal.zzjk.AD_STORAGE
            if (r5 != r8) goto L76
            if (r7 == 0) goto L76
            com.google.android.gms.measurement.internal.zzam r11 = com.google.android.gms.measurement.internal.zzam.REMOTE_DELEGATION
            r13.zzc(r0, r11)
            r0 = r12
            goto L8e
        L76:
            com.google.android.gms.measurement.internal.zzam r12 = com.google.android.gms.measurement.internal.zzam.REMOTE_DEFAULT
            r13.zzc(r0, r12)
            boolean r11 = r11.zzv(r10, r0)
            if (r6 == r11) goto L83
            r0 = r4
            goto L8e
        L83:
            r0 = r3
            goto L8e
        L85:
            int r2 = r11.zzb()
            com.google.android.gms.measurement.internal.zzjk r11 = com.google.android.gms.measurement.internal.zzjk.AD_USER_DATA
            r13.zzb(r11, r2)
        L8e:
            com.google.android.gms.measurement.internal.zzht r11 = r9.zzc
            boolean r11 = r11.zzy(r10)
            com.google.android.gms.measurement.internal.zzht r12 = r9.zzh()
            java.util.SortedSet r10 = r12.zzz(r10)
            com.google.android.gms.measurement.internal.zzji r12 = com.google.android.gms.measurement.internal.zzji.DENIED
            if (r0 == r12) goto Lbb
            boolean r12 = r10.isEmpty()
            if (r12 == 0) goto La7
            goto Lbb
        La7:
            com.google.android.gms.measurement.internal.zzaz r12 = new com.google.android.gms.measurement.internal.zzaz
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            java.lang.String r1 = ""
            if (r11 == 0) goto Lb7
            java.lang.String r1 = android.text.TextUtils.join(r1, r10)
        Lb7:
            r12.<init>(r13, r2, r0, r1)
            return r12
        Lbb:
            com.google.android.gms.measurement.internal.zzaz r10 = new com.google.android.gms.measurement.internal.zzaz
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r10.<init>(r12, r2, r11, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpg.zzz(java.lang.String, com.google.android.gms.measurement.internal.zzaz, com.google.android.gms.measurement.internal.zzjl, com.google.android.gms.measurement.internal.zzan):com.google.android.gms.measurement.internal.zzaz");
    }
}
