package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class zzccw extends zzccq implements zzgy {
    private static final AtomicInteger zzo = new AtomicInteger(0);
    private String zzd;
    private final zzcbc zze;
    private boolean zzf;
    private final zzccv zzg;
    private final zzcbz zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private final Object zzk;
    private final String zzl;
    private final int zzm;
    private boolean zzn;

    public zzccw(zzcbd zzcbdVar, zzcbc zzcbcVar) {
        super(zzcbdVar);
        this.zze = zzcbcVar;
        this.zzg = new zzccv();
        this.zzh = new zzcbz();
        this.zzk = new Object();
        this.zzl = (String) zzgha.zzd(zzcbdVar != null ? zzcbdVar.zzn() : null).zza("");
        this.zzm = zzcbdVar != null ? zzcbdVar.zzp() : 0;
        zzo.incrementAndGet();
    }

    public static int zzr() {
        return zzo.get();
    }

    public static final String zzv(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzf(str)));
    }

    private final void zzx() {
        int iZza = (int) this.zzg.zza();
        int iZza2 = (int) this.zzh.zza(this.zzi);
        int iPosition = this.zzi.position();
        int iRound = Math.round((iPosition / iZza) * iZza2);
        int iZzP = zzcau.zzP();
        int iZzQ = zzcau.zzQ();
        String str = this.zzd;
        zzn(str, zzv(str), iPosition, iZza, iRound, iZza2, iRound > 0, iZzP, iZzQ);
    }

    @Override // com.google.android.gms.internal.ads.zzccq, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzo.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final void zza(zzga zzgaVar, zzge zzgeVar, boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final void zzb(zzga zzgaVar, zzge zzgeVar, boolean z4) {
        if (zzgaVar instanceof zzgl) {
            this.zzg.zzb((zzgl) zzgaVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final void zzc(zzga zzgaVar, zzge zzgeVar, boolean z4, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final void zzd(zzga zzgaVar, zzge zzgeVar, boolean z4) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00fa, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // com.google.android.gms.internal.ads.zzccq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zze(java.lang.String r28) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzccw.zze(java.lang.String):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final void zzl() {
        this.zzf = true;
    }

    public final String zzs() {
        return this.zzd;
    }

    public final boolean zzt() {
        return this.zzn;
    }

    public final ByteBuffer zzu() {
        synchronized (this.zzk) {
            try {
                ByteBuffer byteBuffer = this.zzi;
                if (byteBuffer != null && !this.zzj) {
                    byteBuffer.flip();
                    this.zzj = true;
                }
                this.zzf = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.zzi;
    }
}
