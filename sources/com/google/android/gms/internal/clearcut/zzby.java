package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzca;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzby<FieldDescriptorType extends zzca<FieldDescriptorType>> {
    private static final zzby zzgw = new zzby(true);
    private boolean zzgu;
    private boolean zzgv = false;
    private final zzei<FieldDescriptorType, Object> zzgt = zzei.zzaj(16);

    private zzby() {
    }

    public static int zza(zzfl zzflVar, int i, Object obj) {
        int iZzr = zzbn.zzr(i);
        if (zzflVar == zzfl.zzql) {
            zzci.zzf((zzdo) obj);
            iZzr <<= 1;
        }
        return iZzr + zzb(zzflVar, obj);
    }

    public static <T extends zzca<T>> zzby<T> zzar() {
        return zzgw;
    }

    private static int zzb(zzca<?> zzcaVar, Object obj) {
        zzfl zzflVarZzau = zzcaVar.zzau();
        int iZzc = zzcaVar.zzc();
        if (!zzcaVar.zzaw()) {
            return zza(zzflVarZzau, iZzc, obj);
        }
        int iZza = 0;
        List list = (List) obj;
        if (!zzcaVar.zzax()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iZza += zza(zzflVarZzau, iZzc, it.next());
            }
            return iZza;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iZza += zzb(zzflVarZzau, it2.next());
        }
        return zzbn.zzz(iZza) + zzbn.zzr(iZzc) + iZza;
    }

    private final void zzc(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzcr) {
            value = zzcr.zzbr();
        }
        if (key.zzaw()) {
            Object objZza = zza(key);
            if (objZza == null) {
                objZza = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objZza).add(zzd(it.next()));
            }
            this.zzgt.put(key, objZza);
            return;
        }
        if (key.zzav() != zzfq.MESSAGE) {
            this.zzgt.put(key, zzd(value));
            return;
        }
        Object objZza2 = zza(key);
        if (objZza2 == null) {
            this.zzgt.put(key, zzd(value));
        } else {
            this.zzgt.put(key, objZza2 instanceof zzdv ? key.zza((zzdv) objZza2, (zzdv) value) : key.zza(((zzdo) objZza2).zzbc(), (zzdo) value).zzbj());
        }
    }

    private static int zzd(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzav() != zzfq.MESSAGE || key.zzaw() || key.zzax()) {
            return zzb((zzca<?>) key, value);
        }
        boolean z4 = value instanceof zzcr;
        int iZzc = entry.getKey().zzc();
        return z4 ? zzbn.zzb(iZzc, (zzcr) value) : zzbn.zzd(iZzc, (zzdo) value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzby zzbyVar = new zzby();
        for (int i = 0; i < this.zzgt.zzdr(); i++) {
            Map.Entry<K, Object> entryZzak = this.zzgt.zzak(i);
            zzbyVar.zza((zzca) entryZzak.getKey(), entryZzak.getValue());
        }
        Iterator it = this.zzgt.zzds().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zzbyVar.zza((zzca) entry.getKey(), entry.getValue());
        }
        zzbyVar.zzgv = this.zzgv;
        return zzbyVar;
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> descendingIterator() {
        return this.zzgv ? new zzcu(this.zzgt.zzdt().iterator()) : this.zzgt.zzdt().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzby) {
            return this.zzgt.equals(((zzby) obj).zzgt);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzgt.hashCode();
    }

    public final boolean isEmpty() {
        return this.zzgt.isEmpty();
    }

    public final boolean isImmutable() {
        return this.zzgu;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.zzgt.zzdr(); i++) {
            if (!zzb(this.zzgt.zzak(i))) {
                return false;
            }
        }
        Iterator it = this.zzgt.zzds().iterator();
        while (it.hasNext()) {
            if (!zzb((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> iterator() {
        return this.zzgv ? new zzcu(this.zzgt.entrySet().iterator()) : this.zzgt.entrySet().iterator();
    }

    public final int zzas() {
        int iZzb = 0;
        for (int i = 0; i < this.zzgt.zzdr(); i++) {
            Map.Entry<K, Object> entryZzak = this.zzgt.zzak(i);
            iZzb += zzb((zzca<?>) entryZzak.getKey(), entryZzak.getValue());
        }
        Iterator it = this.zzgt.zzds().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iZzb += zzb((zzca<?>) entry.getKey(), entry.getValue());
        }
        return iZzb;
    }

    public final int zzat() {
        int iZzd = 0;
        for (int i = 0; i < this.zzgt.zzdr(); i++) {
            iZzd += zzd((Map.Entry) this.zzgt.zzak(i));
        }
        Iterator it = this.zzgt.zzds().iterator();
        while (it.hasNext()) {
            iZzd += zzd((Map.Entry) it.next());
        }
        return iZzd;
    }

    public final void zzv() {
        if (this.zzgu) {
            return;
        }
        this.zzgt.zzv();
        this.zzgu = true;
    }

    private zzby(boolean z4) {
        zzv();
    }

    private final Object zza(FieldDescriptorType fielddescriptortype) {
        Object obj = this.zzgt.get(fielddescriptortype);
        return obj instanceof zzcr ? zzcr.zzbr() : obj;
    }

    private static int zzb(zzfl zzflVar, Object obj) {
        switch (zzbz.zzgq[zzflVar.ordinal()]) {
            case 1:
                return zzbn.zzb(((Double) obj).doubleValue());
            case 2:
                return zzbn.zzb(((Float) obj).floatValue());
            case 3:
                return zzbn.zze(((Long) obj).longValue());
            case 4:
                return zzbn.zzf(((Long) obj).longValue());
            case 5:
                return zzbn.zzs(((Integer) obj).intValue());
            case 6:
                return zzbn.zzh(((Long) obj).longValue());
            case 7:
                return zzbn.zzv(((Integer) obj).intValue());
            case 8:
                return zzbn.zzb(((Boolean) obj).booleanValue());
            case 9:
                return zzbn.zzd((zzdo) obj);
            case 10:
                return obj instanceof zzcr ? zzbn.zza((zzcr) obj) : zzbn.zzc((zzdo) obj);
            case 11:
                return obj instanceof zzbb ? zzbn.zzb((zzbb) obj) : zzbn.zzh((String) obj);
            case 12:
                return obj instanceof zzbb ? zzbn.zzb((zzbb) obj) : zzbn.zzd((byte[]) obj);
            case 13:
                return zzbn.zzt(((Integer) obj).intValue());
            case 14:
                return zzbn.zzw(((Integer) obj).intValue());
            case 15:
                return zzbn.zzi(((Long) obj).longValue());
            case 16:
                return zzbn.zzu(((Integer) obj).intValue());
            case 17:
                return zzbn.zzg(((Long) obj).longValue());
            case 18:
                return obj instanceof zzcj ? zzbn.zzx(((zzcj) obj).zzc()) : zzbn.zzx(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static Object zzd(Object obj) {
        if (obj instanceof zzdv) {
            return ((zzdv) obj).zzci();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static void zza(zzbn zzbnVar, zzfl zzflVar, int i, Object obj) throws IOException {
        if (zzflVar == zzfl.zzql) {
            zzdo zzdoVar = (zzdo) obj;
            zzci.zzf(zzdoVar);
            zzbnVar.zzb(i, 3);
            zzdoVar.zzb(zzbnVar);
            zzbnVar.zzb(i, 4);
        }
        zzbnVar.zzb(i, zzflVar.zzel());
        switch (zzbz.zzgq[zzflVar.ordinal()]) {
            case 1:
                zzbnVar.zza(((Double) obj).doubleValue());
                break;
            case 2:
                zzbnVar.zza(((Float) obj).floatValue());
                break;
            case 3:
                zzbnVar.zzb(((Long) obj).longValue());
                break;
            case 4:
                zzbnVar.zzb(((Long) obj).longValue());
                break;
            case 5:
                zzbnVar.zzn(((Integer) obj).intValue());
                break;
            case 6:
                zzbnVar.zzd(((Long) obj).longValue());
                break;
            case 7:
                zzbnVar.zzq(((Integer) obj).intValue());
                break;
            case 8:
                zzbnVar.zza(((Boolean) obj).booleanValue());
                break;
            case 9:
                ((zzdo) obj).zzb(zzbnVar);
                break;
            case 10:
                zzbnVar.zzb((zzdo) obj);
                break;
            case 11:
                if (!(obj instanceof zzbb)) {
                    zzbnVar.zzg((String) obj);
                } else {
                    zzbnVar.zza((zzbb) obj);
                }
                break;
            case 12:
                if (!(obj instanceof zzbb)) {
                    byte[] bArr = (byte[]) obj;
                    zzbnVar.zzd(bArr, 0, bArr.length);
                } else {
                    zzbnVar.zza((zzbb) obj);
                }
                break;
            case 13:
                zzbnVar.zzo(((Integer) obj).intValue());
                break;
            case 14:
                zzbnVar.zzq(((Integer) obj).intValue());
                break;
            case 15:
                zzbnVar.zzd(((Long) obj).longValue());
                break;
            case 16:
                zzbnVar.zzp(((Integer) obj).intValue());
                break;
            case 17:
                zzbnVar.zzc(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof zzcj)) {
                    zzbnVar.zzn(((Integer) obj).intValue());
                } else {
                    zzbnVar.zzn(((zzcj) obj).zzc());
                }
                break;
        }
    }

    private static boolean zzb(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.zzav() == zzfq.MESSAGE) {
            boolean zZzaw = key.zzaw();
            Object value = entry.getValue();
            if (zZzaw) {
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    if (!((zzdo) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                if (!(value instanceof zzdo)) {
                    if (value instanceof zzcr) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((zzdo) value).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void zza(zzby<FieldDescriptorType> zzbyVar) {
        for (int i = 0; i < zzbyVar.zzgt.zzdr(); i++) {
            zzc(zzbyVar.zzgt.zzak(i));
        }
        Iterator it = zzbyVar.zzgt.zzds().iterator();
        while (it.hasNext()) {
            zzc((Map.Entry) it.next());
        }
    }

    private final void zza(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.zzaw()) {
            zza(fielddescriptortype.zzau(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                zza(fielddescriptortype.zzau(), obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzcr) {
            this.zzgv = true;
        }
        this.zzgt.put(fielddescriptortype, obj);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0011. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zza(com.google.android.gms.internal.clearcut.zzfl r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.clearcut.zzci.checkNotNull(r3)
            int[] r0 = com.google.android.gms.internal.clearcut.zzbz.zzgx
            com.google.android.gms.internal.clearcut.zzfq r2 = r2.zzek()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L42;
                case 2: goto L3f;
                case 3: goto L3c;
                case 4: goto L39;
                case 5: goto L36;
                case 6: goto L33;
                case 7: goto L2a;
                case 8: goto L1e;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            goto L45
        L15:
            boolean r2 = r3 instanceof com.google.android.gms.internal.clearcut.zzdo
            if (r2 != 0) goto L28
            boolean r2 = r3 instanceof com.google.android.gms.internal.clearcut.zzcr
            if (r2 == 0) goto L27
            goto L28
        L1e:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L28
            boolean r2 = r3 instanceof com.google.android.gms.internal.clearcut.zzcj
            if (r2 == 0) goto L27
            goto L28
        L27:
            r0 = r1
        L28:
            r1 = r0
            goto L45
        L2a:
            boolean r2 = r3 instanceof com.google.android.gms.internal.clearcut.zzbb
            if (r2 != 0) goto L28
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L27
            goto L28
        L33:
            boolean r0 = r3 instanceof java.lang.String
            goto L28
        L36:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L28
        L39:
            boolean r0 = r3 instanceof java.lang.Double
            goto L28
        L3c:
            boolean r0 = r3 instanceof java.lang.Float
            goto L28
        L3f:
            boolean r0 = r3 instanceof java.lang.Long
            goto L28
        L42:
            boolean r0 = r3 instanceof java.lang.Integer
            goto L28
        L45:
            if (r1 == 0) goto L48
            return
        L48:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzby.zza(com.google.android.gms.internal.clearcut.zzfl, java.lang.Object):void");
    }
}
