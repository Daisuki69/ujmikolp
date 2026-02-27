package com.google.android.gms.internal.ads;

import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.events.eventsapi.EventMetricsAggregator;
import com.google.android.gms.internal.ads.zzgnm;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzgnn<V> extends zzgpv implements S1.y {
    private static final zza zzbi;
    static final Object zze = new Object();
    static final zzgpb zzf = new zzgpb(zzgnm.class);
    static final boolean zzg;
    volatile zzgnm.zzd listenersField;
    volatile Object valueField;
    volatile zze waitersField;

    abstract class zza {
        public /* synthetic */ zza(byte[] bArr) {
        }

        public abstract void zza(zze zzeVar, Thread thread);

        public abstract void zzb(zze zzeVar, zze zzeVar2);

        public abstract boolean zzc(zzgnn zzgnnVar, zze zzeVar, zze zzeVar2);

        public abstract boolean zzd(zzgnn zzgnnVar, zzgnm.zzd zzdVar, zzgnm.zzd zzdVar2);

        public abstract zze zze(zzgnn zzgnnVar, zze zzeVar);

        public abstract zzgnm.zzd zzf(zzgnn zzgnnVar, zzgnm.zzd zzdVar);

        public abstract boolean zzg(zzgnn zzgnnVar, Object obj, Object obj2);
    }

    final class zzb extends zza {
        private static final AtomicReferenceFieldUpdater<zze, Thread> zza = AtomicReferenceFieldUpdater.newUpdater(zze.class, Thread.class, "thread");
        private static final AtomicReferenceFieldUpdater<zze, zze> zzb = AtomicReferenceFieldUpdater.newUpdater(zze.class, zze.class, "next");
        private static final AtomicReferenceFieldUpdater<? super zzgnn<?>, zze> zzc = AtomicReferenceFieldUpdater.newUpdater(zzgnn.class, zze.class, "waitersField");
        private static final AtomicReferenceFieldUpdater<? super zzgnn<?>, zzgnm.zzd> zzd = AtomicReferenceFieldUpdater.newUpdater(zzgnn.class, zzgnm.zzd.class, "listenersField");
        private static final AtomicReferenceFieldUpdater<? super zzgnn<?>, Object> zze = AtomicReferenceFieldUpdater.newUpdater(zzgnn.class, Object.class, "valueField");

        private zzb() {
            throw null;
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        public final void zza(zze zzeVar, Thread thread) {
            zza.lazySet(zzeVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        public final void zzb(zze zzeVar, zze zzeVar2) {
            zzb.lazySet(zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        public final boolean zzc(zzgnn zzgnnVar, zze zzeVar, zze zzeVar2) {
            AtomicReferenceFieldUpdater<? super zzgnn<?>, zze> atomicReferenceFieldUpdater = zzc;
            while (!atomicReferenceFieldUpdater.compareAndSet(zzgnnVar, zzeVar, zzeVar2)) {
                if (atomicReferenceFieldUpdater.get(zzgnnVar) != zzeVar) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        public final boolean zzd(zzgnn zzgnnVar, zzgnm.zzd zzdVar, zzgnm.zzd zzdVar2) {
            AtomicReferenceFieldUpdater<? super zzgnn<?>, zzgnm.zzd> atomicReferenceFieldUpdater = zzd;
            while (!atomicReferenceFieldUpdater.compareAndSet(zzgnnVar, zzdVar, zzdVar2)) {
                if (atomicReferenceFieldUpdater.get(zzgnnVar) != zzdVar) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        public final zze zze(zzgnn zzgnnVar, zze zzeVar) {
            return zzc.getAndSet(zzgnnVar, zzeVar);
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        public final zzgnm.zzd zzf(zzgnn zzgnnVar, zzgnm.zzd zzdVar) {
            return zzd.getAndSet(zzgnnVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        public final boolean zzg(zzgnn zzgnnVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<? super zzgnn<?>, Object> atomicReferenceFieldUpdater = zze;
            while (!atomicReferenceFieldUpdater.compareAndSet(zzgnnVar, obj, obj2)) {
                if (atomicReferenceFieldUpdater.get(zzgnnVar) != obj) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ zzb(byte[] bArr) {
            super(null);
        }
    }

    final class zzc extends zza {
        private zzc() {
            throw null;
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        public final void zza(zze zzeVar, Thread thread) {
            zzeVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        public final void zzb(zze zzeVar, zze zzeVar2) {
            zzeVar.next = zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        public final boolean zzc(zzgnn zzgnnVar, zze zzeVar, zze zzeVar2) {
            synchronized (zzgnnVar) {
                try {
                    if (zzgnnVar.waitersField != zzeVar) {
                        return false;
                    }
                    zzgnnVar.waitersField = zzeVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        public final boolean zzd(zzgnn zzgnnVar, zzgnm.zzd zzdVar, zzgnm.zzd zzdVar2) {
            synchronized (zzgnnVar) {
                try {
                    if (zzgnnVar.listenersField != zzdVar) {
                        return false;
                    }
                    zzgnnVar.listenersField = zzdVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        public final zze zze(zzgnn zzgnnVar, zze zzeVar) {
            zze zzeVar2;
            synchronized (zzgnnVar) {
                try {
                    zzeVar2 = zzgnnVar.waitersField;
                    if (zzeVar2 != zzeVar) {
                        zzgnnVar.waitersField = zzeVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        public final zzgnm.zzd zzf(zzgnn zzgnnVar, zzgnm.zzd zzdVar) {
            zzgnm.zzd zzdVar2;
            synchronized (zzgnnVar) {
                try {
                    zzdVar2 = zzgnnVar.listenersField;
                    if (zzdVar2 != zzdVar) {
                        zzgnnVar.listenersField = zzdVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        public final boolean zzg(zzgnn zzgnnVar, Object obj, Object obj2) {
            synchronized (zzgnnVar) {
                try {
                    if (zzgnnVar.valueField != obj) {
                        return false;
                    }
                    zzgnnVar.valueField = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public /* synthetic */ zzc(byte[] bArr) {
            super(null);
        }
    }

    final class zzd extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;
        public static final /* synthetic */ int zzg = 0;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(zzgno.zza);
                }
                try {
                    zzc = unsafe.objectFieldOffset(zzgnn.class.getDeclaredField("waitersField"));
                    zzb = unsafe.objectFieldOffset(zzgnn.class.getDeclaredField("listenersField"));
                    zzd = unsafe.objectFieldOffset(zzgnn.class.getDeclaredField("valueField"));
                    zze = unsafe.objectFieldOffset(zze.class.getDeclaredField("thread"));
                    zzf = unsafe.objectFieldOffset(zze.class.getDeclaredField("next"));
                    zza = unsafe;
                } catch (NoSuchFieldException e) {
                    throw new RuntimeException(e);
                }
            } catch (PrivilegedActionException e7) {
                throw new RuntimeException("Could not initialize intrinsics", e7.getCause());
            }
        }

        private zzd() {
            throw null;
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        public final void zza(zze zzeVar, Thread thread) {
            zza.putObject(zzeVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        public final void zzb(zze zzeVar, zze zzeVar2) {
            zza.putObject(zzeVar, zzf, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        public final boolean zzc(zzgnn zzgnnVar, zze zzeVar, zze zzeVar2) {
            return v.a(zza, zzgnnVar, zzc, zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        public final boolean zzd(zzgnn zzgnnVar, zzgnm.zzd zzdVar, zzgnm.zzd zzdVar2) {
            return v.a(zza, zzgnnVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        public final zze zze(zzgnn zzgnnVar, zze zzeVar) {
            zze zzeVar2;
            do {
                zzeVar2 = zzgnnVar.waitersField;
                if (zzeVar == zzeVar2) {
                    break;
                }
            } while (!zzc(zzgnnVar, zzeVar2, zzeVar));
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        public final zzgnm.zzd zzf(zzgnn zzgnnVar, zzgnm.zzd zzdVar) {
            zzgnm.zzd zzdVar2;
            do {
                zzdVar2 = zzgnnVar.listenersField;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zzd(zzgnnVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        public final boolean zzg(zzgnn zzgnnVar, Object obj, Object obj2) {
            return v.a(zza, zzgnnVar, zzd, obj, obj2);
        }

        public /* synthetic */ zzd(byte[] bArr) {
            super(null);
        }
    }

    final class zze {
        static final zze zza = new zze(false);
        volatile zze next;
        volatile Thread thread;

        public zze(boolean z4) {
        }

        public zze() {
            zzgnn.zzv(this, Thread.currentThread());
        }
    }

    static {
        boolean z4;
        Throwable th2;
        Throwable th3;
        zza zzcVar;
        try {
            z4 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z4 = false;
        }
        zzg = z4;
        String property = System.getProperty("java.runtime.name", "");
        byte[] bArr = null;
        if (property == null || property.contains(EventMetricsAggregator.OS_NAME)) {
            try {
                zzcVar = new zzd(bArr);
            } catch (Error | Exception e) {
                try {
                    zzcVar = new zzb(bArr);
                    th2 = null;
                    th3 = e;
                } catch (Error | Exception e7) {
                    th2 = e7;
                    th3 = e;
                    zzcVar = new zzc(bArr);
                }
            }
        } else {
            try {
                zzcVar = new zzb(bArr);
            } catch (NoClassDefFoundError unused2) {
                zzcVar = new zzc(bArr);
            }
        }
        th2 = null;
        th3 = null;
        zzbi = zzcVar;
        if (th2 != null) {
            zzgpb zzgpbVar = zzf;
            Logger loggerZza = zzgpbVar.zza();
            Level level = Level.SEVERE;
            loggerZza.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th3);
            zzgpbVar.zza().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th2);
        }
    }

    private final void zza(zze zzeVar) {
        zzeVar.thread = null;
        while (true) {
            zze zzeVar2 = this.waitersField;
            if (zzeVar2 != zze.zza) {
                zze zzeVar3 = null;
                while (zzeVar2 != null) {
                    zze zzeVar4 = zzeVar2.next;
                    if (zzeVar2.thread != null) {
                        zzeVar3 = zzeVar2;
                    } else if (zzeVar3 != null) {
                        zzeVar3.next = zzeVar4;
                        if (zzeVar3.thread == null) {
                            break;
                        }
                    } else if (!zzbi.zzc(this, zzeVar2, zzeVar4)) {
                        break;
                    }
                    zzeVar2 = zzeVar4;
                }
                return;
            }
            return;
        }
    }

    public static boolean zzr(zzgnn zzgnnVar, Object obj, Object obj2) {
        return zzbi.zzg(zzgnnVar, obj, obj2);
    }

    public static /* synthetic */ void zzv(zze zzeVar, Thread thread) {
        zzbi.zza(zzeVar, thread);
    }

    public abstract /* synthetic */ void addListener(Runnable runnable, Executor executor);

    public final boolean zzp(zzgnm.zzd zzdVar, zzgnm.zzd zzdVar2) {
        return zzbi.zzd(this, zzdVar, zzdVar2);
    }

    public final zzgnm.zzd zzq(zzgnm.zzd zzdVar) {
        return zzbi.zzf(this, zzdVar);
    }

    public final void zzs() {
        for (zze zzeVarZze = zzbi.zze(this, zze.zza); zzeVarZze != null; zzeVarZze = zzeVarZze.next) {
            Thread thread = zzeVarZze.thread;
            if (thread != null) {
                zzeVarZze.thread = null;
                LockSupport.unpark(thread);
            }
        }
    }

    public final Object zzt(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.valueField;
        if ((obj != null) && zzgnm.zzh(obj)) {
            return zzgnm.zzg(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            zze zzeVar = this.waitersField;
            if (zzeVar != zze.zza) {
                zze zzeVar2 = new zze();
                do {
                    zza zzaVar = zzbi;
                    zzaVar.zzb(zzeVar2, zzeVar);
                    if (zzaVar.zzc(this, zzeVar, zzeVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                zza(zzeVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.valueField;
                            if ((obj2 != null) && zzgnm.zzh(obj2)) {
                                return zzgnm.zzg(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        zza(zzeVar2);
                    } else {
                        zzeVar = this.waitersField;
                    }
                } while (zzeVar != zze.zza);
            }
            Object obj3 = this.valueField;
            Objects.requireNonNull(obj3);
            return zzgnm.zzg(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.valueField;
            if ((obj4 != null) && zzgnm.zzh(obj4)) {
                return zzgnm.zzg(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb2 = new StringBuilder(String.valueOf(j).length() + 8 + String.valueOf(lowerCase2).length());
        androidx.media3.datasource.cache.c.z(sb2, "Waited ", j, Global.BLANK);
        sb2.append(lowerCase2);
        String string3 = sb2.toString();
        if (nanos + 1000 < 0) {
            String strConcat = string3.concat(" (plus ");
            long j6 = -nanos;
            long jConvert = timeUnit.convert(j6, TimeUnit.NANOSECONDS);
            long nanos2 = j6 - timeUnit.toNanos(jConvert);
            boolean z4 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(jConvert).length() + strConcat.length() + 1 + String.valueOf(lowerCase).length());
                androidx.media3.datasource.cache.c.z(sb3, strConcat, jConvert, Global.BLANK);
                sb3.append(lowerCase);
                String string4 = sb3.toString();
                if (z4) {
                    string4 = string4.concat(",");
                }
                strConcat = string4.concat(Global.BLANK);
            }
            if (z4) {
                StringBuilder sb4 = new StringBuilder(String.valueOf(nanos2).length() + strConcat.length() + 13);
                sb4.append(strConcat);
                sb4.append(nanos2);
                sb4.append(" nanoseconds ");
                strConcat = sb4.toString();
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(We.s.q(new StringBuilder(string3.length() + 5 + String.valueOf(string).length()), string3, " for ", string));
    }

    public final Object zzu() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.valueField;
        if ((obj2 != null) && zzgnm.zzh(obj2)) {
            return zzgnm.zzg(obj2);
        }
        zze zzeVar = this.waitersField;
        if (zzeVar != zze.zza) {
            zze zzeVar2 = new zze();
            do {
                zza zzaVar = zzbi;
                zzaVar.zzb(zzeVar2, zzeVar);
                if (zzaVar.zzc(this, zzeVar, zzeVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zza(zzeVar2);
                            throw new InterruptedException();
                        }
                        obj = this.valueField;
                    } while (!((obj != null) & zzgnm.zzh(obj)));
                    return zzgnm.zzg(obj);
                }
                zzeVar = this.waitersField;
            } while (zzeVar != zze.zza);
        }
        Object obj3 = this.valueField;
        Objects.requireNonNull(obj3);
        return zzgnm.zzg(obj3);
    }
}
