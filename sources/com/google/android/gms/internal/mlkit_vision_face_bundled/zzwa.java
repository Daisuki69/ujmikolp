package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzwa implements zzwh {
    private final zzvw zza;
    private final zzwv zzb;
    private final boolean zzc;
    private final zzui zzd;

    private zzwa(zzwv zzwvVar, zzui zzuiVar, zzvw zzvwVar) {
        this.zzb = zzwvVar;
        this.zzc = zzvwVar instanceof zzus;
        this.zzd = zzuiVar;
        this.zza = zzvwVar;
    }

    public static zzwa zzc(zzwv zzwvVar, zzui zzuiVar, zzvw zzvwVar) {
        return new zzwa(zzwvVar, zzuiVar, zzvwVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwh
    public final int zza(Object obj) {
        int iZzb = ((zzuw) obj).zzc.zzb();
        return this.zzc ? iZzb + ((zzus) obj).zzb.zzb() : iZzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwh
    public final int zzb(Object obj) {
        int iHashCode = ((zzuw) obj).zzc.hashCode();
        return this.zzc ? (iHashCode * 53) + ((zzus) obj).zzb.zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwh
    public final Object zze() {
        zzvw zzvwVar = this.zza;
        return zzvwVar instanceof zzuw ? ((zzuw) zzvwVar).zzy() : zzvwVar.zzK().zzp();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwh
    public final void zzf(Object obj) {
        this.zzb.zza(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwh
    public final void zzg(Object obj, Object obj2) {
        zzwj.zzp(this.zzb, obj, obj2);
        if (this.zzc) {
            zzwj.zzo(this.zzd, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b8 A[EDGE_INSN: B:61:0x00b8->B:33:0x00b8 BREAK  A[LOOP:1: B:17:0x0064->B:64:0x0064], SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(java.lang.Object r11, byte[] r12, int r13, int r14, com.google.android.gms.internal.mlkit_vision_face_bundled.zztj r15) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face_bundled.zzwa.zzh(java.lang.Object, byte[], int, int, com.google.android.gms.internal.mlkit_vision_face_bundled.zztj):void");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwh
    public final void zzi(Object obj, zzxi zzxiVar) throws IOException {
        Iterator itZzf = ((zzus) obj).zzb.zzf();
        if (!itZzf.hasNext()) {
            ((zzuw) obj).zzc.zzk(zzxiVar);
            return;
        }
        zzul zzulVar = (zzul) ((Map.Entry) itZzf.next()).getKey();
        if (zzulVar.zzc() == zzxh.MESSAGE) {
            zzulVar.zze();
        }
        throw new IllegalStateException("Found invalid MessageSet item.");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwh
    public final boolean zzj(Object obj, Object obj2) {
        if (!((zzuw) obj).zzc.equals(((zzuw) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((zzus) obj).zzb.equals(((zzus) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwh
    public final boolean zzk(Object obj) {
        return ((zzus) obj).zzb.zzl();
    }
}
