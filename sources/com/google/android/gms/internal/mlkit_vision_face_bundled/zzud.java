package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzud implements zzxi {
    private final zzuc zza;

    private zzud(zzuc zzucVar) {
        byte[] bArr = zzvc.zzb;
        this.zza = zzucVar;
        zzucVar.zza = this;
    }

    public static zzud zza(zzuc zzucVar) {
        zzud zzudVar = zzucVar.zza;
        return zzudVar != null ? zzudVar : new zzud(zzucVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzA(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzvl)) {
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
        zzvl zzvlVar = (zzvl) list;
        if (!z4) {
            while (i4 < zzvlVar.size()) {
                this.zza.zzh(i, zzvlVar.zze(i4));
                i4++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzvlVar.size(); i12++) {
            zzvlVar.zze(i12);
            i11 += 8;
        }
        this.zza.zzt(i11);
        while (i4 < zzvlVar.size()) {
            this.zza.zzi(zzvlVar.zze(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzB(int i, int i4) throws IOException {
        this.zza.zzs(i, (i4 >> 31) ^ (i4 + i4));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzC(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzux)) {
            if (!z4) {
                while (i4 < list.size()) {
                    zzuc zzucVar = this.zza;
                    int iIntValue = ((Integer) list.get(i4)).intValue();
                    zzucVar.zzs(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i4++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int iZzz = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                int iIntValue2 = ((Integer) list.get(i6)).intValue();
                iZzz += zzuc.zzz((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.zza.zzt(iZzz);
            while (i4 < list.size()) {
                zzuc zzucVar2 = this.zza;
                int iIntValue3 = ((Integer) list.get(i4)).intValue();
                zzucVar2.zzt((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i4++;
            }
            return;
        }
        zzux zzuxVar = (zzux) list;
        if (!z4) {
            while (i4 < zzuxVar.size()) {
                zzuc zzucVar3 = this.zza;
                int iZze = zzuxVar.zze(i4);
                zzucVar3.zzs(i, (iZze >> 31) ^ (iZze + iZze));
                i4++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int iZzz2 = 0;
        for (int i10 = 0; i10 < zzuxVar.size(); i10++) {
            int iZze2 = zzuxVar.zze(i10);
            iZzz2 += zzuc.zzz((iZze2 >> 31) ^ (iZze2 + iZze2));
        }
        this.zza.zzt(iZzz2);
        while (i4 < zzuxVar.size()) {
            zzuc zzucVar4 = this.zza;
            int iZze3 = zzuxVar.zze(i4);
            zzucVar4.zzt((iZze3 >> 31) ^ (iZze3 + iZze3));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzD(int i, long j) throws IOException {
        this.zza.zzu(i, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzE(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzvl)) {
            if (!z4) {
                while (i4 < list.size()) {
                    zzuc zzucVar = this.zza;
                    long jLongValue = ((Long) list.get(i4)).longValue();
                    zzucVar.zzu(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i4++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int iZzA = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                long jLongValue2 = ((Long) list.get(i6)).longValue();
                iZzA += zzuc.zzA((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            this.zza.zzt(iZzA);
            while (i4 < list.size()) {
                zzuc zzucVar2 = this.zza;
                long jLongValue3 = ((Long) list.get(i4)).longValue();
                zzucVar2.zzv((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i4++;
            }
            return;
        }
        zzvl zzvlVar = (zzvl) list;
        if (!z4) {
            while (i4 < zzvlVar.size()) {
                zzuc zzucVar3 = this.zza;
                long jZze = zzvlVar.zze(i4);
                zzucVar3.zzu(i, (jZze >> 63) ^ (jZze + jZze));
                i4++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int iZzA2 = 0;
        for (int i10 = 0; i10 < zzvlVar.size(); i10++) {
            long jZze2 = zzvlVar.zze(i10);
            iZzA2 += zzuc.zzA((jZze2 >> 63) ^ (jZze2 + jZze2));
        }
        this.zza.zzt(iZzA2);
        while (i4 < zzvlVar.size()) {
            zzuc zzucVar4 = this.zza;
            long jZze3 = zzvlVar.zze(i4);
            zzucVar4.zzv((jZze3 >> 63) ^ (jZze3 + jZze3));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    @Deprecated
    public final void zzF(int i) throws IOException {
        this.zza.zzr(i, 3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzG(int i, String str) throws IOException {
        this.zza.zzp(i, str);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzH(int i, List list) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzvi)) {
            while (i4 < list.size()) {
                this.zza.zzp(i, (String) list.get(i4));
                i4++;
            }
            return;
        }
        zzvi zzviVar = (zzvi) list;
        while (i4 < list.size()) {
            Object objZza = zzviVar.zza();
            if (objZza instanceof String) {
                this.zza.zzp(i, (String) objZza);
            } else {
                this.zza.zze(i, (zztu) objZza);
            }
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzI(int i, int i4) throws IOException {
        this.zza.zzs(i, i4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzJ(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzux)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzs(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int iZzz = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZzz += zzuc.zzz(((Integer) list.get(i6)).intValue());
            }
            this.zza.zzt(iZzz);
            while (i4 < list.size()) {
                this.zza.zzt(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        zzux zzuxVar = (zzux) list;
        if (!z4) {
            while (i4 < zzuxVar.size()) {
                this.zza.zzs(i, zzuxVar.zze(i4));
                i4++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int iZzz2 = 0;
        for (int i10 = 0; i10 < zzuxVar.size(); i10++) {
            iZzz2 += zzuc.zzz(zzuxVar.zze(i10));
        }
        this.zza.zzt(iZzz2);
        while (i4 < zzuxVar.size()) {
            this.zza.zzt(zzuxVar.zze(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzK(int i, long j) throws IOException {
        this.zza.zzu(i, j);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzL(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzvl)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzu(i, ((Long) list.get(i4)).longValue());
                    i4++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int iZzA = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZzA += zzuc.zzA(((Long) list.get(i6)).longValue());
            }
            this.zza.zzt(iZzA);
            while (i4 < list.size()) {
                this.zza.zzv(((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        zzvl zzvlVar = (zzvl) list;
        if (!z4) {
            while (i4 < zzvlVar.size()) {
                this.zza.zzu(i, zzvlVar.zze(i4));
                i4++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int iZzA2 = 0;
        for (int i10 = 0; i10 < zzvlVar.size(); i10++) {
            iZzA2 += zzuc.zzA(zzvlVar.zze(i10));
        }
        this.zza.zzt(iZzA2);
        while (i4 < zzvlVar.size()) {
            this.zza.zzv(zzvlVar.zze(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
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
    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzc(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zztl)) {
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
        zztl zztlVar = (zztl) list;
        if (!z4) {
            while (i4 < zztlVar.size()) {
                this.zza.zzd(i, zztlVar.zzf(i4));
                i4++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zztlVar.size(); i12++) {
            zztlVar.zzf(i12);
            i11++;
        }
        this.zza.zzt(i11);
        while (i4 < zztlVar.size()) {
            this.zza.zzb(zztlVar.zzf(i4) ? (byte) 1 : (byte) 0);
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzd(int i, zztu zztuVar) throws IOException {
        this.zza.zze(i, zztuVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zze(int i, List list) throws IOException {
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.zza.zze(i, (zztu) list.get(i4));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzf(int i, double d10) throws IOException {
        this.zza.zzh(i, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzg(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzue)) {
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
        zzue zzueVar = (zzue) list;
        if (!z4) {
            while (i4 < zzueVar.size()) {
                this.zza.zzh(i, Double.doubleToRawLongBits(zzueVar.zze(i4)));
                i4++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzueVar.size(); i12++) {
            zzueVar.zze(i12);
            i11 += 8;
        }
        this.zza.zzt(i11);
        while (i4 < zzueVar.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(zzueVar.zze(i4)));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    @Deprecated
    public final void zzh(int i) throws IOException {
        this.zza.zzr(i, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzi(int i, int i4) throws IOException {
        this.zza.zzj(i, i4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzj(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzux)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzj(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int iZzA = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZzA += zzuc.zzA(((Integer) list.get(i6)).intValue());
            }
            this.zza.zzt(iZzA);
            while (i4 < list.size()) {
                this.zza.zzk(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        zzux zzuxVar = (zzux) list;
        if (!z4) {
            while (i4 < zzuxVar.size()) {
                this.zza.zzj(i, zzuxVar.zze(i4));
                i4++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int iZzA2 = 0;
        for (int i10 = 0; i10 < zzuxVar.size(); i10++) {
            iZzA2 += zzuc.zzA(zzuxVar.zze(i10));
        }
        this.zza.zzt(iZzA2);
        while (i4 < zzuxVar.size()) {
            this.zza.zzk(zzuxVar.zze(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzk(int i, int i4) throws IOException {
        this.zza.zzf(i, i4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzl(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzux)) {
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
        zzux zzuxVar = (zzux) list;
        if (!z4) {
            while (i4 < zzuxVar.size()) {
                this.zza.zzf(i, zzuxVar.zze(i4));
                i4++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzuxVar.size(); i12++) {
            zzuxVar.zze(i12);
            i11 += 4;
        }
        this.zza.zzt(i11);
        while (i4 < zzuxVar.size()) {
            this.zza.zzg(zzuxVar.zze(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzm(int i, long j) throws IOException {
        this.zza.zzh(i, j);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzn(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzvl)) {
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
        zzvl zzvlVar = (zzvl) list;
        if (!z4) {
            while (i4 < zzvlVar.size()) {
                this.zza.zzh(i, zzvlVar.zze(i4));
                i4++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzvlVar.size(); i12++) {
            zzvlVar.zze(i12);
            i11 += 8;
        }
        this.zza.zzt(i11);
        while (i4 < zzvlVar.size()) {
            this.zza.zzi(zzvlVar.zze(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzo(int i, float f) throws IOException {
        this.zza.zzf(i, Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzp(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzuo)) {
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
        zzuo zzuoVar = (zzuo) list;
        if (!z4) {
            while (i4 < zzuoVar.size()) {
                this.zza.zzf(i, Float.floatToRawIntBits(zzuoVar.zze(i4)));
                i4++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzuoVar.size(); i12++) {
            zzuoVar.zze(i12);
            i11 += 4;
        }
        this.zza.zzt(i11);
        while (i4 < zzuoVar.size()) {
            this.zza.zzg(Float.floatToRawIntBits(zzuoVar.zze(i4)));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzq(int i, Object obj, zzwh zzwhVar) throws IOException {
        zzuc zzucVar = this.zza;
        zzucVar.zzr(i, 3);
        zzwhVar.zzi((zzvw) obj, zzucVar.zza);
        zzucVar.zzr(i, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzr(int i, int i4) throws IOException {
        this.zza.zzj(i, i4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzs(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzux)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzj(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int iZzA = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZzA += zzuc.zzA(((Integer) list.get(i6)).intValue());
            }
            this.zza.zzt(iZzA);
            while (i4 < list.size()) {
                this.zza.zzk(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        zzux zzuxVar = (zzux) list;
        if (!z4) {
            while (i4 < zzuxVar.size()) {
                this.zza.zzj(i, zzuxVar.zze(i4));
                i4++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int iZzA2 = 0;
        for (int i10 = 0; i10 < zzuxVar.size(); i10++) {
            iZzA2 += zzuc.zzA(zzuxVar.zze(i10));
        }
        this.zza.zzt(iZzA2);
        while (i4 < zzuxVar.size()) {
            this.zza.zzk(zzuxVar.zze(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzt(int i, long j) throws IOException {
        this.zza.zzu(i, j);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzu(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzvl)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzu(i, ((Long) list.get(i4)).longValue());
                    i4++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int iZzA = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZzA += zzuc.zzA(((Long) list.get(i6)).longValue());
            }
            this.zza.zzt(iZzA);
            while (i4 < list.size()) {
                this.zza.zzv(((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        zzvl zzvlVar = (zzvl) list;
        if (!z4) {
            while (i4 < zzvlVar.size()) {
                this.zza.zzu(i, zzvlVar.zze(i4));
                i4++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int iZzA2 = 0;
        for (int i10 = 0; i10 < zzvlVar.size(); i10++) {
            iZzA2 += zzuc.zzA(zzvlVar.zze(i10));
        }
        this.zza.zzt(iZzA2);
        while (i4 < zzvlVar.size()) {
            this.zza.zzv(zzvlVar.zze(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzv(int i, Object obj, zzwh zzwhVar) throws IOException {
        this.zza.zzm(i, (zzvw) obj, zzwhVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzw(int i, Object obj) throws IOException {
        if (obj instanceof zztu) {
            this.zza.zzo(i, (zztu) obj);
        } else {
            this.zza.zzn(i, (zzvw) obj);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzx(int i, int i4) throws IOException {
        this.zza.zzf(i, i4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzy(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzux)) {
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
        zzux zzuxVar = (zzux) list;
        if (!z4) {
            while (i4 < zzuxVar.size()) {
                this.zza.zzf(i, zzuxVar.zze(i4));
                i4++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzuxVar.size(); i12++) {
            zzuxVar.zze(i12);
            i11 += 4;
        }
        this.zza.zzt(i11);
        while (i4 < zzuxVar.size()) {
            this.zza.zzg(zzuxVar.zze(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzz(int i, long j) throws IOException {
        this.zza.zzh(i, j);
    }
}
