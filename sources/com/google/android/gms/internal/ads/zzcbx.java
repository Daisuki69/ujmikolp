package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcbx implements zzga {
    private final Context zza;
    private final zzga zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbat zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private zzge zzl;

    public zzcbx(Context context, zzga zzgaVar, String str, int i, zzgy zzgyVar, zzcbw zzcbwVar) {
        this.zza = context;
        this.zzb = zzgaVar;
        this.zzc = str;
        this.zzd = i;
        new AtomicLong(-1L);
        this.zze = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcd)).booleanValue();
    }

    private final boolean zzf() {
        if (!this.zze) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeQ)).booleanValue() || this.zzj) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeR)).booleanValue() && !this.zzk;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzi
    public final int zza(byte[] bArr, int i, int i4) throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.zzf;
        return inputStream != null ? inputStream.read(bArr, i, i4) : this.zzb.zza(bArr, i, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final long zzb(zzge zzgeVar) throws IOException {
        Long l6;
        if (this.zzg) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.zzg = true;
        Uri uri = zzgeVar.zza;
        this.zzh = uri;
        this.zzl = zzgeVar;
        this.zzi = zzbat.zza(uri);
        zzbaq zzbaqVarZzc = null;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeN)).booleanValue()) {
            if (this.zzi != null) {
                this.zzi.zzh = zzgeVar.zze;
                this.zzi.zzi = zzghs.zza(this.zzc);
                this.zzi.zzj = this.zzd;
                zzbaqVarZzc = com.google.android.gms.ads.internal.zzt.zzj().zzc(this.zzi);
            }
            if (zzbaqVarZzc != null && zzbaqVarZzc.zza()) {
                this.zzj = zzbaqVarZzc.zzg();
                this.zzk = zzbaqVarZzc.zze();
                if (!zzf()) {
                    this.zzf = zzbaqVarZzc.zzb();
                    return -1L;
                }
            }
        } else if (this.zzi != null) {
            this.zzi.zzh = zzgeVar.zze;
            this.zzi.zzi = zzghs.zza(this.zzc);
            this.zzi.zzj = this.zzd;
            if (this.zzi.zzg) {
                l6 = (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeP);
            } else {
                l6 = (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeO);
            }
            long jLongValue = l6.longValue();
            com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
            com.google.android.gms.ads.internal.zzt.zzz();
            Future futureZza = zzbbe.zza(this.zza, this.zzi);
            try {
                try {
                    zzbbf zzbbfVar = (zzbbf) futureZza.get(jLongValue, TimeUnit.MILLISECONDS);
                    zzbbfVar.zzc();
                    this.zzj = zzbbfVar.zzd();
                    this.zzk = zzbbfVar.zzf();
                    zzbbfVar.zze();
                    if (!zzf()) {
                        this.zzf = zzbbfVar.zzb();
                    }
                } catch (InterruptedException unused) {
                    futureZza.cancel(false);
                    Thread.currentThread().interrupt();
                } catch (ExecutionException | TimeoutException unused2) {
                    futureZza.cancel(false);
                }
            } catch (Throwable unused3) {
            }
            com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
            throw null;
        }
        if (this.zzi != null) {
            zzgd zzgdVarZzb = zzgeVar.zzb();
            zzgdVarZzb.zza(Uri.parse(this.zzi.zza));
            this.zzl = zzgdVarZzb.zze();
        }
        return this.zzb.zzb(this.zzl);
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zzd() throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.zzg = false;
        this.zzh = null;
        InputStream inputStream = this.zzf;
        if (inputStream == null) {
            this.zzb.zzd();
        } else {
            IOUtils.closeQuietly(inputStream);
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zze(zzgy zzgyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final /* synthetic */ Map zzj() {
        return u.a(this);
    }
}
