package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfuc {
    private final zzfvx zza;
    private final zzfwv zzb;
    private final zzgcx zzc;
    private final zzgea zzd;
    private final long zze;
    private final zzhpr zzf;
    private final long zzg;
    private final long zzh = System.currentTimeMillis();
    private final boolean zzi;
    private final long zzj;

    public zzfuc(zzfvx zzfvxVar, zzfwv zzfwvVar, zzgcx zzgcxVar, zzgea zzgeaVar, zzhpr zzhprVar, zzfui zzfuiVar) {
        this.zza = zzfvxVar;
        this.zzb = zzfwvVar;
        this.zzc = zzgcxVar;
        this.zzd = zzgeaVar;
        this.zze = zzfuiVar.zzh();
        this.zzf = zzhprVar;
        this.zzg = zzfuiVar.zzg();
        this.zzi = zzfuiVar.zzq();
        this.zzj = zzfuiVar.zzp();
    }

    public final S1.y zza() {
        return this.zza.zza();
    }

    public final String zzb(Context context) {
        String string;
        boolean z4 = false;
        if (this.zzi) {
            if (System.currentTimeMillis() - this.zzh <= this.zzj) {
                z4 = true;
            }
        }
        zzgdy zzgdyVarZza = this.zzd.zza(3);
        try {
            try {
                try {
                    try {
                        zzgdyVarZza.zza();
                        string = (String) zzgot.zzj(this.zza.zzb(), new zzftz(this, context), zzgpk.zza()).get(z4 ? this.zzg : this.zze, TimeUnit.MILLISECONDS);
                    } catch (TimeoutException e) {
                        zzgdyVarZza.zzb(e);
                        string = z4 ? ((zzfzx) this.zzf.zzb()).zza(true, this.zzh) : Integer.toString(17);
                    }
                } catch (InterruptedException e7) {
                    Thread.currentThread().interrupt();
                    zzgdyVarZza.zzb(e7);
                    string = "";
                }
            } catch (ExecutionException e10) {
                e = e10;
                Throwable cause = e.getCause();
                if (cause != null) {
                    e = cause;
                }
                zzgdyVarZza.zzb(e);
                string = Integer.toString(3);
            } catch (Throwable th2) {
                zzgdyVarZza.zzb(th2);
                throw th2;
            }
            zzgdyVarZza.zzc();
            return string;
        } catch (Throwable th3) {
            zzgdyVarZza.zzc();
            throw th3;
        }
    }

    public final String zzc(Context context, String str, View view, Activity activity) {
        String string;
        zzgdy zzgdyVarZza = this.zzd.zza(4);
        try {
            try {
                zzgdyVarZza.zza();
                try {
                    string = (String) zzgot.zzj(this.zza.zzb(), new zzfua(this, context, null, view, activity), zzgpk.zza()).get(this.zze, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    e = e;
                    InterruptedException interruptedException = e;
                    Thread.currentThread().interrupt();
                    zzgdyVarZza.zzb(interruptedException);
                    string = "";
                } catch (ExecutionException e7) {
                    e = e7;
                    Throwable th2 = e;
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        th2 = cause;
                    }
                    zzgdyVarZza.zzb(th2);
                    string = Integer.toString(3);
                } catch (TimeoutException e10) {
                    e = e10;
                    zzgdyVarZza.zzb(e);
                    string = Integer.toString(17);
                } catch (Throwable th3) {
                    th = th3;
                    Throwable th4 = th;
                    zzgdyVarZza.zzb(th4);
                    throw th4;
                }
            } catch (Throwable th5) {
                zzgdyVarZza.zzc();
                throw th5;
            }
        } catch (InterruptedException e11) {
            e = e11;
        } catch (ExecutionException e12) {
            e = e12;
        } catch (TimeoutException e13) {
            e = e13;
        } catch (Throwable th6) {
            th = th6;
        }
        zzgdyVarZza.zzc();
        return string;
    }

    public final String zzd(Context context, String str, View view, Activity activity) {
        String string;
        zzgdy zzgdyVarZza = this.zzd.zza(5);
        try {
            try {
                zzgdyVarZza.zza();
                try {
                    string = (String) zzgot.zzj(this.zza.zzb(), new zzfub(this, context, str, view, null), zzgpk.zza()).get(this.zze, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    e = e;
                    InterruptedException interruptedException = e;
                    Thread.currentThread().interrupt();
                    zzgdyVarZza.zzb(interruptedException);
                    string = "";
                } catch (ExecutionException e7) {
                    e = e7;
                    Throwable th2 = e;
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        th2 = cause;
                    }
                    zzgdyVarZza.zzb(th2);
                    string = Integer.toString(3);
                } catch (TimeoutException e10) {
                    e = e10;
                    zzgdyVarZza.zzb(e);
                    string = Integer.toString(17);
                } catch (Throwable th3) {
                    th = th3;
                    Throwable th4 = th;
                    zzgdyVarZza.zzb(th4);
                    throw th4;
                }
            } catch (Throwable th5) {
                zzgdyVarZza.zzc();
                throw th5;
            }
        } catch (InterruptedException e11) {
            e = e11;
        } catch (ExecutionException e12) {
            e = e12;
        } catch (TimeoutException e13) {
            e = e13;
        } catch (Throwable th6) {
            th = th6;
        }
        zzgdyVarZza.zzc();
        return string;
    }

    public final void zze(List list) {
        this.zzc.zza(list);
    }

    public final void zzf(InputEvent inputEvent) {
        this.zzb.zze(inputEvent);
    }

    public final /* synthetic */ zzfwv zzg() {
        return this.zzb;
    }

    public final int zzh() {
        return this.zzb.zzh();
    }
}
