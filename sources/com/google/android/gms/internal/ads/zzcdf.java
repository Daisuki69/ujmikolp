package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcdf extends zzfs {
    private final Context zza;
    private final zzga zzb;
    private final zzcdd zzc;
    private final String zzd;
    private final int zze;
    private final boolean zzf;
    private InputStream zzg;
    private boolean zzh;
    private Uri zzi;
    private volatile zzbat zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private long zzo;
    private S1.y zzp;
    private final AtomicLong zzq;

    public zzcdf(Context context, zzga zzgaVar, String str, int i, zzgy zzgyVar, zzcdd zzcddVar) {
        super(false);
        this.zza = context;
        this.zzb = zzgaVar;
        this.zzc = zzcddVar;
        this.zzd = str;
        this.zze = i;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzn = false;
        this.zzo = 0L;
        this.zzq = new AtomicLong(-1L);
        this.zzp = null;
        this.zzf = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcd)).booleanValue();
        zze(zzgyVar);
    }

    private final boolean zzr() {
        if (!this.zzf) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeQ)).booleanValue() || this.zzm) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeR)).booleanValue() && !this.zzn;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzi
    public final int zza(byte[] bArr, int i, int i4) throws IOException {
        if (!this.zzh) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.zzg;
        int iZza = inputStream != null ? inputStream.read(bArr, i, i4) : this.zzb.zza(bArr, i, i4);
        if (this.zzf && this.zzg == null) {
            return iZza;
        }
        zzh(iZza);
        return iZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzga
    public final long zzb(zzge zzgeVar) throws Throwable {
        zzbaq zzbaqVarZzc;
        Long l6;
        boolean z4;
        boolean z5;
        long jElapsedRealtime;
        StringBuilder sb2;
        zzbbf zzbbfVar;
        if (this.zzh) {
            throw new IOException("Attempt to open an already open GcacheDataSource.");
        }
        boolean z8 = true;
        this.zzh = true;
        Uri uri = zzgeVar.zza;
        this.zzi = uri;
        boolean z9 = this.zzf;
        if (z9 == 0) {
            zzg(zzgeVar);
        }
        this.zzj = zzbat.zza(uri);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeN)).booleanValue()) {
            if (this.zzj != null) {
                this.zzj.zzh = zzgeVar.zze;
                this.zzj.zzi = zzghs.zza(this.zzd);
                this.zzj.zzj = this.zze;
                zzbaqVarZzc = com.google.android.gms.ads.internal.zzt.zzj().zzc(this.zzj);
            } else {
                zzbaqVarZzc = null;
            }
            if (zzbaqVarZzc != null && zzbaqVarZzc.zza()) {
                this.zzk = zzbaqVarZzc.zzd();
                this.zzm = zzbaqVarZzc.zzg();
                this.zzn = zzbaqVarZzc.zze();
                this.zzo = zzbaqVarZzc.zzf();
                this.zzl = true;
                if (!zzr()) {
                    this.zzg = zzbaqVarZzc.zzb();
                    if (this.zzf) {
                        zzg(zzgeVar);
                    }
                    return -1L;
                }
            }
        } else if (this.zzj != null) {
            this.zzj.zzh = zzgeVar.zze;
            this.zzj.zzi = zzghs.zza(this.zzd);
            this.zzj.zzj = this.zze;
            if (this.zzj.zzg) {
                l6 = (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeP);
            } else {
                l6 = (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeO);
            }
            long jLongValue = l6.longValue();
            long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
            com.google.android.gms.ads.internal.zzt.zzz();
            Future futureZza = zzbbe.zza(this.zza, this.zzj);
            try {
                try {
                    zzbbfVar = (zzbbf) futureZza.get(jLongValue, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    th = th2;
                    z8 = z9;
                }
            } catch (InterruptedException unused) {
                z5 = false;
            } catch (ExecutionException | TimeoutException unused2) {
                z4 = false;
            } catch (Throwable th3) {
                th = th3;
                z8 = false;
            }
            try {
                this.zzk = zzbbfVar.zzc();
                this.zzm = zzbbfVar.zzd();
                this.zzn = zzbbfVar.zzf();
                this.zzo = zzbbfVar.zze();
                if (!zzr()) {
                    this.zzg = zzbbfVar.zzb();
                    if (z9 != 0) {
                        zzg(zzgeVar);
                    }
                    long jElapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime2;
                    this.zzc.zza(true, jElapsedRealtime3);
                    this.zzl = true;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(jElapsedRealtime3).length() + 24);
                    sb3.append("Cache connection took ");
                    sb3.append(jElapsedRealtime3);
                    sb3.append("ms");
                    com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
                    return -1L;
                }
                long jElapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime2;
                this.zzc.zza(true, jElapsedRealtime4);
                this.zzl = true;
                sb2 = new StringBuilder(String.valueOf(jElapsedRealtime4).length() + 24);
                sb2.append("Cache connection took ");
                sb2.append(jElapsedRealtime4);
            } catch (InterruptedException unused3) {
                z5 = true;
                futureZza.cancel(true);
                Thread.currentThread().interrupt();
                jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime2;
                this.zzc.zza(z5, jElapsedRealtime);
                this.zzl = z5;
                int length = String.valueOf(jElapsedRealtime).length() + 24;
                sb2 = new StringBuilder(length);
                z9 = length;
                sb2.append("Cache connection took ");
                sb2.append(jElapsedRealtime);
            } catch (ExecutionException | TimeoutException unused4) {
                z4 = true;
                futureZza.cancel(true);
                jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime2;
                this.zzc.zza(z4, jElapsedRealtime);
                this.zzl = z4;
                int length2 = String.valueOf(jElapsedRealtime).length() + 24;
                sb2 = new StringBuilder(length2);
                z9 = length2;
                sb2.append("Cache connection took ");
                sb2.append(jElapsedRealtime);
            } catch (Throwable th4) {
                th = th4;
                long jElapsedRealtime5 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime2;
                this.zzc.zza(z8, jElapsedRealtime5);
                this.zzl = z8;
                StringBuilder sb4 = new StringBuilder(String.valueOf(jElapsedRealtime5).length() + 24);
                sb4.append("Cache connection took ");
                sb4.append(jElapsedRealtime5);
                sb4.append("ms");
                com.google.android.gms.ads.internal.util.zze.zza(sb4.toString());
                throw th;
            }
            sb2.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        }
        this.zzl = false;
        if (this.zzj != null) {
            zzgd zzgdVarZzb = zzgeVar.zzb();
            zzgdVarZzb.zza(Uri.parse(this.zzj.zza));
            zzgeVar = zzgdVarZzb.zze();
        }
        return this.zzb.zzb(zzgeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final Uri zzc() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zzd() throws IOException {
        if (!this.zzh) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.zzh = false;
        this.zzi = null;
        boolean z4 = (this.zzf && this.zzg == null) ? false : true;
        InputStream inputStream = this.zzg;
        if (inputStream != null) {
            IOUtils.closeQuietly(inputStream);
            this.zzg = null;
        } else {
            this.zzb.zzd();
        }
        if (z4) {
            zzi();
        }
    }

    public final boolean zzk() {
        return this.zzk;
    }

    public final boolean zzl() {
        return this.zzl;
    }

    public final boolean zzm() {
        return this.zzm;
    }

    public final boolean zzn() {
        return this.zzn;
    }

    public final long zzo() {
        return this.zzo;
    }

    public final long zzp() {
        if (this.zzj != null) {
            AtomicLong atomicLong = this.zzq;
            if (atomicLong.get() != -1) {
                return atomicLong.get();
            }
            synchronized (this) {
                try {
                    if (this.zzp == null) {
                        this.zzp = zzbzh.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzcde
                            @Override // java.util.concurrent.Callable
                            public final /* synthetic */ Object call() {
                                return this.zza.zzq();
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.zzp.isDone()) {
                try {
                    this.zzq.compareAndSet(-1L, ((Long) this.zzp.get()).longValue());
                    return this.zzq.get();
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }
        return -1L;
    }

    public final /* synthetic */ Long zzq() {
        return Long.valueOf(com.google.android.gms.ads.internal.zzt.zzj().zzd(this.zzj));
    }
}
