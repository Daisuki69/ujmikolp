package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.common.PlaybackException;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfqa {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfqb zzc;
    private final zzfoh zzd;
    private final zzfoc zze;
    private final boolean zzf;

    @Nullable
    private zzfpp zzg;
    private final Object zzh = new Object();

    public zzfqa(@NonNull Context context, @NonNull zzfqb zzfqbVar, @NonNull zzfoh zzfohVar, @NonNull zzfoc zzfocVar, boolean z4) {
        this.zzb = context;
        this.zzc = zzfqbVar;
        this.zzd = zzfohVar;
        this.zze = zzfocVar;
        this.zzf = z4;
    }

    private final synchronized Class zzd(@NonNull zzfpq zzfpqVar) throws zzfpz {
        try {
            if (zzfpqVar.zza() == null) {
                throw new zzfpz(4010, "mc");
            }
            String strZza = zzfpqVar.zza().zza();
            HashMap map = zza;
            Class cls = (Class) map.get(strZza);
            if (cls != null) {
                return cls;
            }
            try {
                if (!this.zze.zza(zzfpqVar.zzb())) {
                    throw new zzfpz(2026, "VM did not pass signature verification");
                }
                try {
                    File fileZzc = zzfpqVar.zzc();
                    if (!fileZzc.exists()) {
                        fileZzc.mkdirs();
                    }
                    Class<?> clsLoadClass = new DexClassLoader(zzfpqVar.zzb().getAbsolutePath(), fileZzc.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    map.put(strZza, clsLoadClass);
                    return clsLoadClass;
                } catch (ClassNotFoundException e) {
                    e = e;
                    throw new zzfpz(2008, e);
                } catch (IllegalArgumentException e7) {
                    e = e7;
                    throw new zzfpz(2008, e);
                } catch (SecurityException e10) {
                    e = e10;
                    throw new zzfpz(2008, e);
                }
            } catch (GeneralSecurityException e11) {
                throw new zzfpz(2026, e11);
            }
        } finally {
        }
    }

    public final boolean zza(@NonNull zzfpq zzfpqVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfpp zzfppVar = new zzfpp(zzd(zzfpqVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfpqVar.zzd(), null, new Bundle(), 2), zzfpqVar, this.zzc, this.zzd, this.zzf);
                if (!zzfppVar.zzf()) {
                    throw new zzfpz(4000, "init failed");
                }
                int iZzh = zzfppVar.zzh();
                if (iZzh != 0) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzh).length() + 4);
                    sb2.append("ci: ");
                    sb2.append(iZzh);
                    throw new zzfpz(PlaybackException.ERROR_CODE_DECODER_INIT_FAILED, sb2.toString());
                }
                synchronized (this.zzh) {
                    zzfpp zzfppVar2 = this.zzg;
                    if (zzfppVar2 != null) {
                        try {
                            zzfppVar2.zzg();
                        } catch (zzfpz e) {
                            this.zzd.zzc(e.zza(), -1L, e);
                        }
                        this.zzg = zzfppVar;
                    } else {
                        this.zzg = zzfppVar;
                    }
                }
                this.zzd.zzb(3000, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e7) {
                throw new zzfpz(PlaybackException.ERROR_CODE_IO_BAD_HTTP_STATUS, e7);
            }
        } catch (zzfpz e10) {
            this.zzd.zzc(e10.zza(), System.currentTimeMillis() - jCurrentTimeMillis, e10);
            return false;
        } catch (Exception e11) {
            this.zzd.zzc(4010, System.currentTimeMillis() - jCurrentTimeMillis, e11);
            return false;
        }
    }

    @Nullable
    public final zzfok zzb() {
        zzfpp zzfppVar;
        synchronized (this.zzh) {
            zzfppVar = this.zzg;
        }
        return zzfppVar;
    }

    @Nullable
    public final zzfpq zzc() {
        synchronized (this.zzh) {
            try {
                zzfpp zzfppVar = this.zzg;
                if (zzfppVar == null) {
                    return null;
                }
                return zzfppVar.zze();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
