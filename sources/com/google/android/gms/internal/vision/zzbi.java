package com.google.android.gms.internal.vision;

import android.content.ContentResolver;
import android.content.Context;
import android.util.Log;
import androidx.media3.datasource.cache.c;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbi<T> {
    private static volatile zzbr zzb;
    private static volatile boolean zzc;
    private final zzbo zzf;
    private final String zzg;
    private final T zzh;
    private volatile int zzj;
    private volatile T zzk;
    private final boolean zzl;
    private static final Object zza = new Object();
    private static final AtomicReference<Collection<zzbi<?>>> zzd = new AtomicReference<>();
    private static zzbs zze = new zzbs(zzbk.zza);
    private static final AtomicInteger zzi = new AtomicInteger();

    private zzbi(zzbo zzboVar, String str, T t5, boolean z4) {
        this.zzj = -1;
        String str2 = zzboVar.zza;
        if (str2 == null && zzboVar.zzb == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str2 != null && zzboVar.zzb != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.zzf = zzboVar;
        this.zzg = str;
        this.zzh = t5;
        this.zzl = z4;
    }

    @Deprecated
    public static void zza(final Context context) {
        synchronized (zza) {
            try {
                zzbr zzbrVar = zzb;
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                if (zzbrVar == null || zzbrVar.zza() != context) {
                    zzau.zzb();
                    zzbq.zza();
                    zzbd.zza();
                    zzb = new zzav(context, zzdi.zza(new zzdf(context) { // from class: com.google.android.gms.internal.vision.zzbl
                        private final Context zza;

                        {
                            this.zza = context;
                        }

                        @Override // com.google.android.gms.internal.vision.zzdf
                        public final Object zza() {
                            return zzbi.zzc(this.zza);
                        }
                    }));
                    zzi.incrementAndGet();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void zzb(Context context) {
        if (zzb != null) {
            return;
        }
        synchronized (zza) {
            try {
                if (zzb == null) {
                    zza(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final /* synthetic */ boolean zzd() {
        return true;
    }

    public abstract T zza(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:30:0x0050 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:8:0x001c, B:10:0x0020, B:14:0x0027, B:16:0x0032, B:31:0x0052, B:33:0x0062, B:35:0x0078, B:36:0x007b, B:37:0x007f, B:19:0x0039, B:30:0x0050, B:24:0x0042, B:27:0x0049, B:38:0x0083), top: B:44:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:8:0x001c, B:10:0x0020, B:14:0x0027, B:16:0x0032, B:31:0x0052, B:33:0x0062, B:35:0x0078, B:36:0x007b, B:37:0x007f, B:19:0x0039, B:30:0x0050, B:24:0x0042, B:27:0x0049, B:38:0x0083), top: B:44:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T zzc() {
        /*
            r6 = this;
            boolean r0 = r6.zzl
            if (r0 != 0) goto L11
            com.google.android.gms.internal.vision.zzbs r0 = com.google.android.gms.internal.vision.zzbi.zze
            java.lang.String r1 = r6.zzg
            boolean r0 = r0.zza(r1)
            java.lang.String r1 = "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error."
            com.google.android.gms.internal.vision.zzde.zzb(r0, r1)
        L11:
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.vision.zzbi.zzi
            int r0 = r0.get()
            int r1 = r6.zzj
            if (r1 >= r0) goto L87
            monitor-enter(r6)
            int r1 = r6.zzj     // Catch: java.lang.Throwable -> L40
            if (r1 >= r0) goto L83
            com.google.android.gms.internal.vision.zzbr r1 = com.google.android.gms.internal.vision.zzbi.zzb     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L26
            r2 = 1
            goto L27
        L26:
            r2 = 0
        L27:
            java.lang.String r3 = "Must call PhenotypeFlag.init() first"
            com.google.android.gms.internal.vision.zzde.zzb(r2, r3)     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.internal.vision.zzbo r2 = r6.zzf     // Catch: java.lang.Throwable -> L40
            boolean r2 = r2.zzf     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L42
            java.lang.Object r2 = r6.zzb(r1)     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L39
            goto L52
        L39:
            java.lang.Object r2 = r6.zza(r1)     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L50
            goto L52
        L40:
            r0 = move-exception
            goto L85
        L42:
            java.lang.Object r2 = r6.zza(r1)     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L49
            goto L52
        L49:
            java.lang.Object r2 = r6.zzb(r1)     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L50
            goto L52
        L50:
            T r2 = r6.zzh     // Catch: java.lang.Throwable -> L40
        L52:
            com.google.android.gms.internal.vision.zzdf r1 = r1.zzb()     // Catch: java.lang.Throwable -> L40
            java.lang.Object r1 = r1.zza()     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.internal.vision.zzcy r1 = (com.google.android.gms.internal.vision.zzcy) r1     // Catch: java.lang.Throwable -> L40
            boolean r3 = r1.zza()     // Catch: java.lang.Throwable -> L40
            if (r3 == 0) goto L7f
            java.lang.Object r1 = r1.zzb()     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.internal.vision.zzbe r1 = (com.google.android.gms.internal.vision.zzbe) r1     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.internal.vision.zzbo r2 = r6.zzf     // Catch: java.lang.Throwable -> L40
            android.net.Uri r3 = r2.zzb     // Catch: java.lang.Throwable -> L40
            java.lang.String r4 = r2.zza     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = r2.zzd     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = r6.zzg     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = r1.zza(r3, r4, r2, r5)     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L7b
            T r2 = r6.zzh     // Catch: java.lang.Throwable -> L40
            goto L7f
        L7b:
            java.lang.Object r2 = r6.zza(r1)     // Catch: java.lang.Throwable -> L40
        L7f:
            r6.zzk = r2     // Catch: java.lang.Throwable -> L40
            r6.zzj = r0     // Catch: java.lang.Throwable -> L40
        L83:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L40
            goto L87
        L85:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L40
            throw r0
        L87:
            T r0 = r6.zzk
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzbi.zzc():java.lang.Object");
    }

    public final String zzb() {
        return zza(this.zzf.zzd);
    }

    private final T zzb(zzbr zzbrVar) {
        zzcw<Context, Boolean> zzcwVar;
        zzbo zzboVar = this.zzf;
        if (!zzboVar.zze && ((zzcwVar = zzboVar.zzi) == null || zzcwVar.zza(zzbrVar.zza()).booleanValue())) {
            zzbd zzbdVarZza = zzbd.zza(zzbrVar.zza());
            zzbo zzboVar2 = this.zzf;
            Object objZza = zzbdVarZza.zza(zzboVar2.zze ? null : zza(zzboVar2.zzc));
            if (objZza != null) {
                return zza(objZza);
            }
        }
        return null;
    }

    public /* synthetic */ zzbi(zzbo zzboVar, String str, Object obj, boolean z4, zzbn zzbnVar) {
        this(zzboVar, str, obj, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> zzbi<T> zzb(zzbo zzboVar, String str, T t5, zzbp<T> zzbpVar, boolean z4) {
        return new zzbm(zzboVar, str, t5, true, zzbpVar);
    }

    public static void zza() {
        zzi.incrementAndGet();
    }

    private final String zza(String str) {
        if (str != null && str.isEmpty()) {
            return this.zzg;
        }
        String strValueOf = String.valueOf(str);
        String strValueOf2 = String.valueOf(this.zzg);
        return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }

    private final T zza(zzbr zzbrVar) {
        zzay zzayVarZza;
        Object objZza;
        String str;
        if (!this.zzf.zzg && (str = (String) zzbd.zza(zzbrVar.zza()).zza("gms:phenotype:phenotype_flag:debug_bypass_phenotype")) != null && zzaq.zzb.matcher(str).matches()) {
            if (Log.isLoggable("PhenotypeFlag", 3)) {
                String strValueOf = String.valueOf(zzb());
                Log.d("PhenotypeFlag", strValueOf.length() != 0 ? "Bypass reading Phenotype values for flag: ".concat(strValueOf) : new String("Bypass reading Phenotype values for flag: "));
                return null;
            }
        } else {
            if (this.zzf.zzb != null) {
                if (!zzbg.zza(zzbrVar.zza(), this.zzf.zzb)) {
                    zzayVarZza = null;
                } else if (this.zzf.zzh) {
                    ContentResolver contentResolver = zzbrVar.zza().getContentResolver();
                    String lastPathSegment = this.zzf.zzb.getLastPathSegment();
                    String packageName = zzbrVar.zza().getPackageName();
                    StringBuilder sb2 = new StringBuilder(c.c(c.c(1, lastPathSegment), packageName));
                    sb2.append(lastPathSegment);
                    sb2.append("#");
                    sb2.append(packageName);
                    zzayVarZza = zzau.zza(contentResolver, zzbj.zza(sb2.toString()));
                } else {
                    zzayVarZza = zzau.zza(zzbrVar.zza().getContentResolver(), this.zzf.zzb);
                }
            } else {
                zzayVarZza = zzbq.zza(zzbrVar.zza(), this.zzf.zza);
            }
            if (zzayVarZza != null && (objZza = zzayVarZza.zza(zzb())) != null) {
                return zza(objZza);
            }
        }
        return null;
    }

    public static final /* synthetic */ zzcy zzc(Context context) {
        new zzbh();
        return zzbh.zza(context);
    }
}
