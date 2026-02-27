package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfox {
    private final Context zza;
    private final Executor zzb;
    private final zzfoh zzc;
    private final zzfow zzd;
    private Task zze;

    @VisibleForTesting
    public zzfox(Context context, Executor executor, zzfoh zzfohVar, zzfoj zzfojVar, zzfot zzfotVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfohVar;
        this.zzd = zzfotVar;
    }

    public static zzfox zza(@NonNull Context context, @NonNull Executor executor, @NonNull zzfoh zzfohVar, @NonNull zzfoj zzfojVar) {
        final zzfox zzfoxVar = new zzfox(context, executor, zzfohVar, zzfojVar, new zzfot());
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzfov
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        };
        Executor executor2 = zzfoxVar.zzb;
        zzfoxVar.zze = Tasks.call(executor2, callable).addOnFailureListener(executor2, new OnFailureListener() { // from class: com.google.android.gms.internal.ads.zzfou
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final /* synthetic */ void onFailure(Exception exc) {
                this.zza.zzd(exc);
            }
        });
        return zzfoxVar;
    }

    public final zzast zzb() {
        zzfow zzfowVar = this.zzd;
        Task task = this.zze;
        return !task.isSuccessful() ? zzfowVar.zza() : (zzast) task.getResult();
    }

    public final /* synthetic */ zzast zzc() throws PackageManager.NameNotFoundException {
        Context context = this.zza;
        return zzfoo.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    public final /* synthetic */ void zzd(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.zzc.zzc(2025, -1L, exc);
    }
}
