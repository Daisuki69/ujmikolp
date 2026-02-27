package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzdo implements zzhh {
    private final zzdn zza;

    private zzdo(zzdn zzdnVar) {
        byte[] bArr = zzep.zzb;
        this.zza = zzdnVar;
        zzdnVar.zza = this;
    }

    public static zzdo zza(zzdn zzdnVar) {
        zzdo zzdoVar = zzdnVar.zza;
        return zzdoVar != null ? zzdoVar : new zzdo(zzdnVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzA(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzfb)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzh(i, ((Long) list.get(i4)).longValue());
                    i4++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int i6 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Long) list.get(i10)).getClass();
                i6 += 8;
            }
            this.zza.zzt(i6);
            while (i4 < list.size()) {
                this.zza.zzi(((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        zzfb zzfbVar = (zzfb) list;
        if (!z4) {
            while (i4 < zzfbVar.size()) {
                this.zza.zzh(i, zzfbVar.zze(i4));
                i4++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzfbVar.size(); i12++) {
            zzfbVar.zze(i12);
            i11 += 8;
        }
        this.zza.zzt(i11);
        while (i4 < zzfbVar.size()) {
            this.zza.zzi(zzfbVar.zze(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzB(int i, int i4) throws IOException {
        this.zza.zzs(i, (i4 >> 31) ^ (i4 + i4));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzC(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzei)) {
            if (!z4) {
                while (i4 < list.size()) {
                    zzdn zzdnVar = this.zza;
                    int iIntValue = ((Integer) list.get(i4)).intValue();
                    zzdnVar.zzs(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i4++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int iZzA = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                int iIntValue2 = ((Integer) list.get(i6)).intValue();
                iZzA += zzdn.zzA((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.zza.zzt(iZzA);
            while (i4 < list.size()) {
                zzdn zzdnVar2 = this.zza;
                int iIntValue3 = ((Integer) list.get(i4)).intValue();
                zzdnVar2.zzt((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i4++;
            }
            return;
        }
        zzei zzeiVar = (zzei) list;
        if (!z4) {
            while (i4 < zzeiVar.size()) {
                zzdn zzdnVar3 = this.zza;
                int iZze = zzeiVar.zze(i4);
                zzdnVar3.zzs(i, (iZze >> 31) ^ (iZze + iZze));
                i4++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int iZzA2 = 0;
        for (int i10 = 0; i10 < zzeiVar.size(); i10++) {
            int iZze2 = zzeiVar.zze(i10);
            iZzA2 += zzdn.zzA((iZze2 >> 31) ^ (iZze2 + iZze2));
        }
        this.zza.zzt(iZzA2);
        while (i4 < zzeiVar.size()) {
            zzdn zzdnVar4 = this.zza;
            int iZze3 = zzeiVar.zze(i4);
            zzdnVar4.zzt((iZze3 >> 31) ^ (iZze3 + iZze3));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzD(int i, long j) throws IOException {
        this.zza.zzu(i, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzE(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzfb)) {
            if (!z4) {
                while (i4 < list.size()) {
                    zzdn zzdnVar = this.zza;
                    long jLongValue = ((Long) list.get(i4)).longValue();
                    zzdnVar.zzu(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i4++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int iZzB = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                long jLongValue2 = ((Long) list.get(i6)).longValue();
                iZzB += zzdn.zzB((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            this.zza.zzt(iZzB);
            while (i4 < list.size()) {
                zzdn zzdnVar2 = this.zza;
                long jLongValue3 = ((Long) list.get(i4)).longValue();
                zzdnVar2.zzv((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i4++;
            }
            return;
        }
        zzfb zzfbVar = (zzfb) list;
        if (!z4) {
            while (i4 < zzfbVar.size()) {
                zzdn zzdnVar3 = this.zza;
                long jZze = zzfbVar.zze(i4);
                zzdnVar3.zzu(i, (jZze >> 63) ^ (jZze + jZze));
                i4++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int iZzB2 = 0;
        for (int i10 = 0; i10 < zzfbVar.size(); i10++) {
            long jZze2 = zzfbVar.zze(i10);
            iZzB2 += zzdn.zzB((jZze2 >> 63) ^ (jZze2 + jZze2));
        }
        this.zza.zzt(iZzB2);
        while (i4 < zzfbVar.size()) {
            zzdn zzdnVar4 = this.zza;
            long jZze3 = zzfbVar.zze(i4);
            zzdnVar4.zzv((jZze3 >> 63) ^ (jZze3 + jZze3));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    @Deprecated
    public final void zzF(int i) throws IOException {
        this.zza.zzr(i, 3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzG(int i, String str) throws IOException {
        this.zza.zzp(i, str);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzH(int i, List list) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzey)) {
            while (i4 < list.size()) {
                this.zza.zzp(i, (String) list.get(i4));
                i4++;
            }
            return;
        }
        zzey zzeyVar = (zzey) list;
        while (i4 < list.size()) {
            Object objZza = zzeyVar.zza();
            if (objZza instanceof String) {
                this.zza.zzp(i, (String) objZza);
            } else {
                this.zza.zze(i, (zzdf) objZza);
            }
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzI(int i, int i4) throws IOException {
        this.zza.zzs(i, i4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzJ(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzei)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzs(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int iZzA = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZzA += zzdn.zzA(((Integer) list.get(i6)).intValue());
            }
            this.zza.zzt(iZzA);
            while (i4 < list.size()) {
                this.zza.zzt(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        zzei zzeiVar = (zzei) list;
        if (!z4) {
            while (i4 < zzeiVar.size()) {
                this.zza.zzs(i, zzeiVar.zze(i4));
                i4++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int iZzA2 = 0;
        for (int i10 = 0; i10 < zzeiVar.size(); i10++) {
            iZzA2 += zzdn.zzA(zzeiVar.zze(i10));
        }
        this.zza.zzt(iZzA2);
        while (i4 < zzeiVar.size()) {
            this.zza.zzt(zzeiVar.zze(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzK(int i, long j) throws IOException {
        this.zza.zzu(i, j);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzL(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzfb)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzu(i, ((Long) list.get(i4)).longValue());
                    i4++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int iZzB = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZzB += zzdn.zzB(((Long) list.get(i6)).longValue());
            }
            this.zza.zzt(iZzB);
            while (i4 < list.size()) {
                this.zza.zzv(((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        zzfb zzfbVar = (zzfb) list;
        if (!z4) {
            while (i4 < zzfbVar.size()) {
                this.zza.zzu(i, zzfbVar.zze(i4));
                i4++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int iZzB2 = 0;
        for (int i10 = 0; i10 < zzfbVar.size(); i10++) {
            iZzB2 += zzdn.zzB(zzfbVar.zze(i10));
        }
        this.zza.zzt(iZzB2);
        while (i4 < zzfbVar.size()) {
            this.zza.zzv(zzfbVar.zze(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzb(int i, boolean z4) throws IOException {
        this.zza.zzd(i, z4);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzc(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzcw)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzd(i, ((Boolean) list.get(i4)).booleanValue());
                    i4++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int i6 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Boolean) list.get(i10)).getClass();
                i6++;
            }
            this.zza.zzt(i6);
            while (i4 < list.size()) {
                this.zza.zzb(((Boolean) list.get(i4)).booleanValue() ? (byte) 1 : (byte) 0);
                i4++;
            }
            return;
        }
        zzcw zzcwVar = (zzcw) list;
        if (!z4) {
            while (i4 < zzcwVar.size()) {
                this.zza.zzd(i, zzcwVar.zzf(i4));
                i4++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzcwVar.size(); i12++) {
            zzcwVar.zzf(i12);
            i11++;
        }
        this.zza.zzt(i11);
        while (i4 < zzcwVar.size()) {
            this.zza.zzb(zzcwVar.zzf(i4) ? (byte) 1 : (byte) 0);
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzd(int i, zzdf zzdfVar) throws IOException {
        this.zza.zze(i, zzdfVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zze(int i, List list) throws IOException {
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.zza.zze(i, (zzdf) list.get(i4));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzf(int i, double d10) throws IOException {
        this.zza.zzh(i, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzg(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzdp)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzh(i, Double.doubleToRawLongBits(((Double) list.get(i4)).doubleValue()));
                    i4++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int i6 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Double) list.get(i10)).getClass();
                i6 += 8;
            }
            this.zza.zzt(i6);
            while (i4 < list.size()) {
                this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i4)).doubleValue()));
                i4++;
            }
            return;
        }
        zzdp zzdpVar = (zzdp) list;
        if (!z4) {
            while (i4 < zzdpVar.size()) {
                this.zza.zzh(i, Double.doubleToRawLongBits(zzdpVar.zze(i4)));
                i4++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzdpVar.size(); i12++) {
            zzdpVar.zze(i12);
            i11 += 8;
        }
        this.zza.zzt(i11);
        while (i4 < zzdpVar.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(zzdpVar.zze(i4)));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    @Deprecated
    public final void zzh(int i) throws IOException {
        this.zza.zzr(i, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzi(int i, int i4) throws IOException {
        this.zza.zzj(i, i4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzj(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzei)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzj(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int iZzB = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZzB += zzdn.zzB(((Integer) list.get(i6)).intValue());
            }
            this.zza.zzt(iZzB);
            while (i4 < list.size()) {
                this.zza.zzk(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        zzei zzeiVar = (zzei) list;
        if (!z4) {
            while (i4 < zzeiVar.size()) {
                this.zza.zzj(i, zzeiVar.zze(i4));
                i4++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int iZzB2 = 0;
        for (int i10 = 0; i10 < zzeiVar.size(); i10++) {
            iZzB2 += zzdn.zzB(zzeiVar.zze(i10));
        }
        this.zza.zzt(iZzB2);
        while (i4 < zzeiVar.size()) {
            this.zza.zzk(zzeiVar.zze(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzk(int i, int i4) throws IOException {
        this.zza.zzf(i, i4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzl(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzei)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzf(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int i6 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).getClass();
                i6 += 4;
            }
            this.zza.zzt(i6);
            while (i4 < list.size()) {
                this.zza.zzg(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        zzei zzeiVar = (zzei) list;
        if (!z4) {
            while (i4 < zzeiVar.size()) {
                this.zza.zzf(i, zzeiVar.zze(i4));
                i4++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzeiVar.size(); i12++) {
            zzeiVar.zze(i12);
            i11 += 4;
        }
        this.zza.zzt(i11);
        while (i4 < zzeiVar.size()) {
            this.zza.zzg(zzeiVar.zze(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzm(int i, long j) throws IOException {
        this.zza.zzh(i, j);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzn(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzfb)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzh(i, ((Long) list.get(i4)).longValue());
                    i4++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int i6 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Long) list.get(i10)).getClass();
                i6 += 8;
            }
            this.zza.zzt(i6);
            while (i4 < list.size()) {
                this.zza.zzi(((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        zzfb zzfbVar = (zzfb) list;
        if (!z4) {
            while (i4 < zzfbVar.size()) {
                this.zza.zzh(i, zzfbVar.zze(i4));
                i4++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzfbVar.size(); i12++) {
            zzfbVar.zze(i12);
            i11 += 8;
        }
        this.zza.zzt(i11);
        while (i4 < zzfbVar.size()) {
            this.zza.zzi(zzfbVar.zze(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzo(int i, float f) throws IOException {
        this.zza.zzf(i, Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzp(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzdz)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzf(i, Float.floatToRawIntBits(((Float) list.get(i4)).floatValue()));
                    i4++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int i6 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Float) list.get(i10)).getClass();
                i6 += 4;
            }
            this.zza.zzt(i6);
            while (i4 < list.size()) {
                this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i4)).floatValue()));
                i4++;
            }
            return;
        }
        zzdz zzdzVar = (zzdz) list;
        if (!z4) {
            while (i4 < zzdzVar.size()) {
                this.zza.zzf(i, Float.floatToRawIntBits(zzdzVar.zze(i4)));
                i4++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzdzVar.size(); i12++) {
            zzdzVar.zze(i12);
            i11 += 4;
        }
        this.zza.zzt(i11);
        while (i4 < zzdzVar.size()) {
            this.zza.zzg(Float.floatToRawIntBits(zzdzVar.zze(i4)));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzq(int i, Object obj, zzge zzgeVar) throws IOException {
        zzdn zzdnVar = this.zza;
        zzdnVar.zzr(i, 3);
        zzgeVar.zzi((zzfm) obj, zzdnVar.zza);
        zzdnVar.zzr(i, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzr(int i, int i4) throws IOException {
        this.zza.zzj(i, i4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzs(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzei)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzj(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int iZzB = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZzB += zzdn.zzB(((Integer) list.get(i6)).intValue());
            }
            this.zza.zzt(iZzB);
            while (i4 < list.size()) {
                this.zza.zzk(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        zzei zzeiVar = (zzei) list;
        if (!z4) {
            while (i4 < zzeiVar.size()) {
                this.zza.zzj(i, zzeiVar.zze(i4));
                i4++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int iZzB2 = 0;
        for (int i10 = 0; i10 < zzeiVar.size(); i10++) {
            iZzB2 += zzdn.zzB(zzeiVar.zze(i10));
        }
        this.zza.zzt(iZzB2);
        while (i4 < zzeiVar.size()) {
            this.zza.zzk(zzeiVar.zze(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzt(int i, long j) throws IOException {
        this.zza.zzu(i, j);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzu(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzfb)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzu(i, ((Long) list.get(i4)).longValue());
                    i4++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int iZzB = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZzB += zzdn.zzB(((Long) list.get(i6)).longValue());
            }
            this.zza.zzt(iZzB);
            while (i4 < list.size()) {
                this.zza.zzv(((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        zzfb zzfbVar = (zzfb) list;
        if (!z4) {
            while (i4 < zzfbVar.size()) {
                this.zza.zzu(i, zzfbVar.zze(i4));
                i4++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int iZzB2 = 0;
        for (int i10 = 0; i10 < zzfbVar.size(); i10++) {
            iZzB2 += zzdn.zzB(zzfbVar.zze(i10));
        }
        this.zza.zzt(iZzB2);
        while (i4 < zzfbVar.size()) {
            this.zza.zzv(zzfbVar.zze(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzv(int i, Object obj, zzge zzgeVar) throws IOException {
        this.zza.zzm(i, (zzfm) obj, zzgeVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzw(int i, Object obj) throws IOException {
        if (obj instanceof zzdf) {
            this.zza.zzo(i, (zzdf) obj);
        } else {
            this.zza.zzn(i, (zzfm) obj);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzx(int i, int i4) throws IOException {
        this.zza.zzf(i, i4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzy(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzei)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzf(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int i6 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).getClass();
                i6 += 4;
            }
            this.zza.zzt(i6);
            while (i4 < list.size()) {
                this.zza.zzg(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        zzei zzeiVar = (zzei) list;
        if (!z4) {
            while (i4 < zzeiVar.size()) {
                this.zza.zzf(i, zzeiVar.zze(i4));
                i4++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzeiVar.size(); i12++) {
            zzeiVar.zze(i12);
            i11 += 4;
        }
        this.zza.zzt(i11);
        while (i4 < zzeiVar.size()) {
            this.zza.zzg(zzeiVar.zze(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzz(int i, long j) throws IOException {
        this.zza.zzh(i, j);
    }
}
