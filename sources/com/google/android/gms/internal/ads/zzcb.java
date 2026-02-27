package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcb {
    private final zzgjz zza;
    private final List zzb = new ArrayList();
    private ByteBuffer[] zzc = new ByteBuffer[0];
    private boolean zzd;

    public zzcb(zzgjz zzgjzVar) {
        this.zza = zzgjzVar;
        zzcc zzccVar = zzcc.zza;
        this.zzd = false;
    }

    private final void zzi(ByteBuffer byteBuffer) {
        boolean z4;
        do {
            int i = 0;
            z4 = false;
            while (i <= zzj()) {
                if (!this.zzc[i].hasRemaining()) {
                    List list = this.zzb;
                    zzcf zzcfVar = (zzcf) list.get(i);
                    if (!zzcfVar.zzg()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.zzc[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : zzcf.zza;
                        long jRemaining = byteBuffer2.remaining();
                        zzcfVar.zzd(byteBuffer2);
                        this.zzc[i] = zzcfVar.zzf();
                        boolean z5 = true;
                        if (jRemaining - ((long) byteBuffer2.remaining()) <= 0 && !this.zzc[i].hasRemaining()) {
                            z5 = false;
                        }
                        z4 |= z5;
                    } else if (!this.zzc[i].hasRemaining() && i < zzj()) {
                        ((zzcf) list.get(i + 1)).zze();
                    }
                }
                i++;
            }
        } while (z4);
    }

    private final int zzj() {
        return this.zzc.length - 1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcb)) {
            return false;
        }
        zzgjz zzgjzVar = this.zza;
        int size = zzgjzVar.size();
        zzgjz zzgjzVar2 = ((zzcb) obj).zza;
        if (size != zzgjzVar2.size()) {
            return false;
        }
        for (int i = 0; i < zzgjzVar.size(); i++) {
            if (zzgjzVar.get(i) != zzgjzVar2.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzcc zza(zzcc zzccVar) throws zzce {
        if (zzccVar.equals(zzcc.zza)) {
            throw new zzce("Unhandled input format:", zzccVar);
        }
        int i = 0;
        while (true) {
            zzgjz zzgjzVar = this.zza;
            if (i >= zzgjzVar.size()) {
                return zzccVar;
            }
            zzcf zzcfVar = (zzcf) zzgjzVar.get(i);
            zzcc zzccVarZzb = zzcfVar.zzb(zzccVar);
            if (zzcfVar.zzc()) {
                zzghc.zzh(!zzccVarZzb.equals(r0));
                zzccVar = zzccVarZzb;
            }
            i++;
        }
    }

    public final void zzb(zzcd zzcdVar) {
        List list = this.zzb;
        list.clear();
        this.zzd = false;
        long jZza = zzcdVar.zzb;
        int i = 0;
        while (true) {
            zzgjz zzgjzVar = this.zza;
            if (i >= zzgjzVar.size()) {
                break;
            }
            zzcf zzcfVar = (zzcf) zzgjzVar.get(i);
            zzcfVar.zzi(new zzcd(jZza));
            if (zzcfVar.zzc()) {
                jZza = zzcfVar.zza(jZza);
                zzghc.zzh(jZza >= 0);
                list.add(zzcfVar);
            }
            i++;
        }
        this.zzc = new ByteBuffer[list.size()];
        for (int i4 = 0; i4 <= zzj(); i4++) {
            this.zzc[i4] = ((zzcf) list.get(i4)).zzf();
        }
    }

    public final boolean zzc() {
        return !this.zzb.isEmpty();
    }

    public final void zzd(ByteBuffer byteBuffer) {
        if (!zzc() || this.zzd) {
            return;
        }
        zzi(byteBuffer);
    }

    public final ByteBuffer zze() {
        if (!zzc()) {
            return zzcf.zza;
        }
        ByteBuffer byteBuffer = this.zzc[zzj()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        zzi(zzcf.zza);
        return this.zzc[zzj()];
    }

    public final void zzf() {
        if (!zzc() || this.zzd) {
            return;
        }
        this.zzd = true;
        ((zzcf) this.zzb.get(0)).zze();
    }

    public final boolean zzg() {
        return this.zzd && ((zzcf) this.zzb.get(zzj())).zzg() && !this.zzc[zzj()].hasRemaining();
    }

    public final void zzh() {
        int i = 0;
        while (true) {
            zzgjz zzgjzVar = this.zza;
            if (i >= zzgjzVar.size()) {
                this.zzc = new ByteBuffer[0];
                zzcc zzccVar = zzcc.zza;
                this.zzd = false;
                return;
            } else {
                zzcf zzcfVar = (zzcf) zzgjzVar.get(i);
                zzcfVar.zzi(zzcd.zza);
                zzcfVar.zzj();
                i++;
            }
        }
    }
}
