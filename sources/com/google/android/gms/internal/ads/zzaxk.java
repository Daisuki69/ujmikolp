package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaxk {
    private final zzavx zza;
    private final String zzb;
    private final String zzc;
    private final Class[] zze;
    private volatile Method zzd = null;
    private final CountDownLatch zzf = new CountDownLatch(1);

    public zzaxk(zzavx zzavxVar, String str, String str2, Class... clsArr) {
        this.zza = zzavxVar;
        this.zzb = str;
        this.zzc = str2;
        this.zze = clsArr;
        zzavxVar.zzd().submit(new zzaxj(this));
    }

    private final String zzc(byte[] bArr, String str) throws zzavb, UnsupportedEncodingException {
        return new String(this.zza.zzf().zzb(bArr, str), "UTF-8");
    }

    public final Method zza() {
        if (this.zzd != null) {
            return this.zzd;
        }
        try {
            if (this.zzf.await(2L, TimeUnit.SECONDS)) {
                return this.zzd;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public final /* synthetic */ void zzb() {
        try {
            zzavx zzavxVar = this.zza;
            Class<?> clsLoadClass = zzavxVar.zze().loadClass(zzc(zzavxVar.zzg(), this.zzb));
            if (clsLoadClass != null) {
                this.zzd = clsLoadClass.getMethod(zzc(zzavxVar.zzg(), this.zzc), this.zze);
            }
        } catch (zzavb | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th2) {
            this.zzf.countDown();
            throw th2;
        }
        this.zzf.countDown();
    }
}
