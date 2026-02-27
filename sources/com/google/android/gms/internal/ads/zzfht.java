package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfht implements zzfhr {
    private final Context zza;
    private final int zzp;
    private long zzb = 0;
    private long zzc = -1;
    private boolean zzd = false;
    private int zzq = 2;
    private int zzr = 2;
    private int zze = 0;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private zzfig zzj = zzfig.SCAR_REQUEST_TYPE_UNSPECIFIED;
    private String zzk = "";
    private String zzl = "";
    private String zzm = "";
    private boolean zzn = false;
    private boolean zzo = false;

    public zzfht(Context context, int i) {
        this.zza = context;
        this.zzp = i;
    }

    public final /* synthetic */ long zzA() {
        return this.zzb;
    }

    public final /* synthetic */ long zzB() {
        return this.zzc;
    }

    public final /* synthetic */ boolean zzC() {
        return this.zzd;
    }

    public final /* synthetic */ int zzD() {
        return this.zze;
    }

    public final /* synthetic */ String zzE() {
        return this.zzf;
    }

    public final /* synthetic */ String zzF() {
        return this.zzg;
    }

    public final /* synthetic */ String zzG() {
        return this.zzh;
    }

    public final /* synthetic */ String zzH() {
        return this.zzi;
    }

    public final /* synthetic */ zzfig zzI() {
        return this.zzj;
    }

    public final /* synthetic */ String zzJ() {
        return this.zzk;
    }

    public final /* synthetic */ String zzK() {
        return this.zzl;
    }

    public final /* synthetic */ String zzL() {
        return this.zzm;
    }

    public final synchronized zzfht zzM(int i) {
        this.zzq = i;
        return this;
    }

    public final /* synthetic */ int zzN() {
        return this.zzp;
    }

    public final /* synthetic */ int zzO() {
        return this.zzq;
    }

    public final /* synthetic */ int zzP() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final /* bridge */ /* synthetic */ zzfhr zza() {
        zzq();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final synchronized boolean zzb() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final /* bridge */ /* synthetic */ zzfhr zzc() {
        zzr();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final /* bridge */ /* synthetic */ zzfhr zzd(boolean z4) {
        zzs(z4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final /* bridge */ /* synthetic */ zzfhr zze(String str) {
        zzt(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final /* bridge */ /* synthetic */ zzfhr zzf(zzfig zzfigVar) {
        zzu(zzfigVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final /* bridge */ /* synthetic */ zzfhr zzg(zzfct zzfctVar) {
        zzv(zzfctVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final /* bridge */ /* synthetic */ zzfhr zzh(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzw(zzeVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final /* bridge */ /* synthetic */ zzfhr zzi(String str) {
        zzx(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final /* bridge */ /* synthetic */ zzfhr zzj(Throwable th2) {
        zzy(th2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final /* bridge */ /* synthetic */ zzfhr zzk(String str) {
        zzz(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final boolean zzl() {
        return !TextUtils.isEmpty(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    @Nullable
    public final synchronized zzfhu zzm() {
        try {
            if (this.zzn) {
                return null;
            }
            this.zzn = true;
            if (!this.zzo) {
                zzq();
            }
            if (this.zzc < 0) {
                zzr();
            }
            return new zzfhu(this, null);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final /* bridge */ /* synthetic */ zzfhr zzp(int i) {
        zzM(i);
        return this;
    }

    public final synchronized zzfht zzq() {
        Configuration configuration;
        com.google.android.gms.ads.internal.util.zzz zzzVarZzf = com.google.android.gms.ads.internal.zzt.zzf();
        Context context = this.zza;
        this.zze = zzzVarZzf.zzm(context);
        Resources resources = context.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.zzr = i;
        this.zzb = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        this.zzo = true;
        return this;
    }

    public final synchronized zzfht zzr() {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        return this;
    }

    public final synchronized zzfht zzs(boolean z4) {
        this.zzd = z4;
        return this;
    }

    public final synchronized zzfht zzt(String str) {
        this.zzi = str;
        return this;
    }

    public final synchronized zzfht zzu(zzfig zzfigVar) {
        this.zzj = zzfigVar;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        r2.zzg = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.google.android.gms.internal.ads.zzfht zzv(com.google.android.gms.internal.ads.zzfct r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzfcm r0 = r3.zzb     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = r0.zzb     // Catch: java.lang.Throwable -> Le
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto L10
            r2.zzf = r0     // Catch: java.lang.Throwable -> Le
            goto L10
        Le:
            r3 = move-exception
            goto L2e
        L10:
            java.util.List r3 = r3.zza     // Catch: java.lang.Throwable -> Le
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Le
        L16:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> Le
            com.google.android.gms.internal.ads.zzfcj r0 = (com.google.android.gms.internal.ads.zzfcj) r0     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = r0.zzab     // Catch: java.lang.Throwable -> Le
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto L16
            r2.zzg = r0     // Catch: java.lang.Throwable -> Le
        L2c:
            monitor-exit(r2)
            return r2
        L2e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfht.zzv(com.google.android.gms.internal.ads.zzfct):com.google.android.gms.internal.ads.zzfht");
    }

    public final synchronized zzfht zzw(com.google.android.gms.ads.internal.client.zze zzeVar) {
        try {
            IBinder iBinder = zzeVar.zze;
            if (iBinder != null) {
                zzcvl zzcvlVar = (zzcvl) iBinder;
                String strZzk = zzcvlVar.zzk();
                if (!TextUtils.isEmpty(strZzk)) {
                    this.zzf = strZzk;
                }
                String strZzf = zzcvlVar.zzf();
                if (!TextUtils.isEmpty(strZzf)) {
                    this.zzg = strZzf;
                }
            }
        } finally {
        }
        return this;
    }

    public final synchronized zzfht zzx(String str) {
        this.zzh = str;
        return this;
    }

    public final synchronized zzfht zzy(Throwable th2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjC)).booleanValue()) {
            this.zzl = zzbtt.zzf(th2);
            this.zzk = (String) zzghq.zza(zzggo.zzc('\n')).zzd(zzbtt.zze(th2)).iterator().next();
        }
        return this;
    }

    public final synchronized zzfht zzz(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjC)).booleanValue()) {
            this.zzm = str;
        }
        return this;
    }
}
