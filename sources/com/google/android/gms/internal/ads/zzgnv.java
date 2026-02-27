package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzgnv extends zzgnz {
    private static final zzgpb zza = new zzgpb(zzgnv.class);
    private zzgjv zzb;
    private final boolean zzc;
    private final boolean zzd;

    public zzgnv(zzgjv zzgjvVar, boolean z4, boolean z5) {
        super(zzgjvVar.size());
        this.zzb = zzgjvVar;
        this.zzc = z4;
        this.zzd = z5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzD, reason: merged with bridge method [inline-methods] */
    public final void zzy(int i, S1.y yVar) {
        try {
            if (yVar.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i, yVar);
            }
            zzz(null);
        } catch (Throwable th2) {
            zzz(null);
            throw th2;
        }
    }

    private final void zzE(Throwable th2) {
        th2.getClass();
        if (this.zzc && !zzb(th2) && zzI(zzB(), th2)) {
            zzF(th2);
        } else if (th2 instanceof Error) {
            zzF(th2);
        }
    }

    private static void zzF(Throwable th2) {
        zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th2 instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th2);
    }

    private final void zzG(int i, Future future) {
        try {
            zzw(i, zzgpu.zza(future));
        } catch (ExecutionException e) {
            zzE(e.getCause());
        } catch (Throwable th2) {
            zzE(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final void zzz(zzgjv zzgjvVar) {
        int iZzC = zzC();
        int i = 0;
        zzghc.zzi(iZzC >= 0, "Less than 0 remaining futures");
        if (iZzC == 0) {
            if (zzgjvVar != null) {
                zzgmd it = zzgjvVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzG(i, future);
                    }
                    i++;
                }
            }
            this.seenExceptionsField = null;
            zzx();
            zzA(2);
        }
    }

    private static boolean zzI(Set set, Throwable th2) {
        while (th2 != null) {
            if (!set.add(th2)) {
                return false;
            }
            th2 = th2.getCause();
        }
        return true;
    }

    public void zzA(int i) {
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    public final void zzc() {
        zzgjv zzgjvVar = this.zzb;
        zzA(1);
        if ((zzgjvVar != null) && isCancelled()) {
            boolean zZzj = zzj();
            zzgmd it = zzgjvVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zZzj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    public final String zzd() {
        zzgjv zzgjvVar = this.zzb;
        return zzgjvVar != null ? "futures=".concat(zzgjvVar.toString()) : super.zzd();
    }

    public final void zze() {
        Objects.requireNonNull(this.zzb);
        if (this.zzb.isEmpty()) {
            zzx();
            return;
        }
        if (this.zzc) {
            zzgmd it = this.zzb.iterator();
            final int i = 0;
            while (it.hasNext()) {
                final S1.y yVar = (S1.y) it.next();
                int i4 = i + 1;
                if (yVar.isDone()) {
                    zzy(i, yVar);
                } else {
                    yVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgnu
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzy(i, yVar);
                        }
                    }, zzgoi.INSTANCE);
                }
                i = i4;
            }
            return;
        }
        zzgjv zzgjvVar = this.zzb;
        final zzgjv zzgjvVar2 = true != this.zzd ? null : zzgjvVar;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzgnt
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzz(zzgjvVar2);
            }
        };
        zzgmd it2 = zzgjvVar.iterator();
        while (it2.hasNext()) {
            S1.y yVar2 = (S1.y) it2.next();
            if (yVar2.isDone()) {
                zzz(zzgjvVar2);
            } else {
                yVar2.addListener(runnable, zzgoi.INSTANCE);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final void zzf(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable thZzl = zzl();
        Objects.requireNonNull(thZzl);
        zzI(set, thZzl);
    }

    public abstract void zzw(int i, Object obj);

    public abstract void zzx();
}
