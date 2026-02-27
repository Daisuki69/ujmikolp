package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgot extends zzgov {
    public static S1.y zza(Object obj) {
        return obj == null ? zzgox.zza : new zzgox(obj);
    }

    public static S1.y zzb() {
        return zzgox.zza;
    }

    public static S1.y zzc(Throwable th2) {
        th2.getClass();
        return new zzgow(th2);
    }

    public static S1.y zzd(Callable callable, Executor executor) {
        zzgps zzgpsVar = new zzgps(callable);
        executor.execute(zzgpsVar);
        return zzgpsVar;
    }

    public static S1.y zze(Runnable runnable, Executor executor) {
        zzgps zzgpsVarZze = zzgps.zze(runnable, null);
        executor.execute(zzgpsVarZze);
        return zzgpsVarZze;
    }

    public static S1.y zzf(zzgoa zzgoaVar, Executor executor) {
        zzgps zzgpsVar = new zzgps(zzgoaVar);
        executor.execute(zzgpsVar);
        return zzgpsVar;
    }

    public static S1.y zzg(S1.y yVar, Class cls, zzggr zzggrVar, Executor executor) {
        int i = zzgnl.zzd;
        zzgnk zzgnkVar = new zzgnk(yVar, cls, zzggrVar);
        yVar.addListener(zzgnkVar, zzgpk.zzd(executor, zzgnkVar));
        return zzgnkVar;
    }

    public static S1.y zzh(S1.y yVar, Class cls, zzgob zzgobVar, Executor executor) {
        int i = zzgnl.zzd;
        zzgnj zzgnjVar = new zzgnj(yVar, cls, zzgobVar);
        yVar.addListener(zzgnjVar, zzgpk.zzd(executor, zzgnjVar));
        return zzgnjVar;
    }

    public static S1.y zzi(S1.y yVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return yVar.isDone() ? yVar : zzgpp.zze(yVar, j, timeUnit, scheduledExecutorService);
    }

    public static S1.y zzj(S1.y yVar, zzgob zzgobVar, Executor executor) {
        int i = zzgns.zzc;
        zzgnq zzgnqVar = new zzgnq(yVar, zzgobVar);
        yVar.addListener(zzgnqVar, zzgpk.zzd(executor, zzgnqVar));
        return zzgnqVar;
    }

    public static S1.y zzk(S1.y yVar, zzggr zzggrVar, Executor executor) {
        int i = zzgns.zzc;
        zzgnr zzgnrVar = new zzgnr(yVar, zzggrVar);
        yVar.addListener(zzgnrVar, zzgpk.zzd(executor, zzgnrVar));
        return zzgnrVar;
    }

    public static S1.y zzl(Iterable iterable) {
        return new zzgoc(zzgjz.zzp(iterable), true);
    }

    public static zzgos zzm(Iterable iterable) {
        return new zzgos(false, zzgjz.zzp(iterable), null);
    }

    @SafeVarargs
    public static zzgos zzn(S1.y... yVarArr) {
        return new zzgos(true, zzgjz.zzr(yVarArr), null);
    }

    public static zzgos zzo(Iterable iterable) {
        return new zzgos(true, zzgjz.zzp(iterable), null);
    }

    @SafeVarargs
    public static S1.y zzp(S1.y... yVarArr) {
        return new zzgoc(zzgjz.zzr(yVarArr), false);
    }

    public static void zzq(S1.y yVar, zzgoq zzgoqVar, Executor executor) {
        zzgoqVar.getClass();
        yVar.addListener(new zzgor(yVar, zzgoqVar), executor);
    }

    public static Object zzr(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzgpu.zza(future);
        }
        throw new IllegalStateException(zzghs.zzd("Future was expected to be done: %s", future));
    }

    public static Object zzs(Future future) {
        try {
            return zzgpu.zza(future);
        } catch (ExecutionException e) {
            if (e.getCause() instanceof Error) {
                throw new zzgoj((Error) e.getCause());
            }
            throw new zzgpt(e.getCause());
        }
    }
}
