package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class zzfoh {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzf = 1;
    private final Context zzb;
    private final Executor zzc;
    private final Task zzd;
    private final boolean zze;

    public zzfoh(@NonNull Context context, @NonNull Executor executor, @NonNull Task task, boolean z4) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = task;
        this.zze = z4;
    }

    public static zzfoh zza(@NonNull final Context context, @NonNull Executor executor, boolean z4) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z4) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfod
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    taskCompletionSource.setResult(zzfqd.zzb(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfof
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    taskCompletionSource.setResult(zzfqd.zzc());
                }
            });
        }
        return new zzfoh(context, executor, taskCompletionSource.getTask(), z4);
    }

    public static void zzg(int i) {
        zzf = i;
    }

    private final Task zzh(final int i, long j, Exception exc, String str, Map map, String str2) {
        if (!this.zze) {
            return this.zzd.continueWith(this.zzc, zzfog.zza);
        }
        Context context = this.zzb;
        final zzarc zzarcVarZza = zzarg.zza();
        zzarcVarZza.zza(context.getPackageName());
        zzarcVarZza.zzb(j);
        zzarcVarZza.zzg(zzf);
        if (exc != null) {
            int i4 = zzghy.zza;
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            zzarcVarZza.zzc(stringWriter.toString());
            zzarcVarZza.zzd(exc.getClass().getName());
        }
        if (str2 != null) {
            zzarcVarZza.zze(str2);
        }
        if (str != null) {
            zzarcVarZza.zzf(str);
        }
        return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfoe
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ Object then(Task task) {
                if (!task.isSuccessful()) {
                    return Boolean.FALSE;
                }
                int i6 = i;
                zzfqc zzfqcVarZza = ((zzfqd) task.getResult()).zza(((zzarg) zzarcVarZza.zzbu()).zzaN());
                zzfqcVarZza.zzc(i6);
                zzfqcVarZza.zza();
                return Boolean.TRUE;
            }
        });
    }

    public Task zzb(int i, long j) {
        return zzh(i, j, null, null, null, null);
    }

    public Task zzc(int i, long j, Exception exc) {
        return zzh(i, j, exc, null, null, null);
    }

    public final Task zzd(int i, long j, String str, Map map) {
        return zzh(i, j, null, str, null, null);
    }

    public Task zze(int i, String str) {
        return zzh(i, 0L, null, null, null, str);
    }

    public final Task zzf(int i, long j, String str) {
        return zzh(i, j, null, null, null, str);
    }
}
