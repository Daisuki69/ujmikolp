package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgqj {
    private final List zza = new ArrayList();
    private final zzgxy zzb = zzgxy.zza;
    private boolean zzc = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final void zzc() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzgqh) it.next()).zzd(false);
        }
    }

    public final zzgqj zza(zzgqh zzgqhVar) {
        if (zzgqhVar.zzh() != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (zzgqhVar.zzc()) {
            zzc();
        }
        zzgqhVar.zzi(this);
        this.zza.add(zzgqhVar);
        return this;
    }

    public final zzgqo zzb() throws GeneralSecurityException {
        int i;
        if (this.zzc) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        this.zzc = true;
        List<zzgqh> list = this.zza;
        zzhdz zzhdzVarZzg = zzhec.zzg();
        ArrayList arrayList = new ArrayList(list.size());
        int i4 = 0;
        while (i4 < list.size() - 1) {
            int i6 = i4 + 1;
            if (((zzgqh) list.get(i4)).zzg() == zzgqi.zza && ((zzgqh) list.get(i6)).zzg() != zzgqi.zza) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i4 = i6;
        }
        HashSet hashSet = new HashSet();
        byte[] bArr = null;
        Integer num = null;
        for (zzgqh zzgqhVar : list) {
            zzgqhVar.zze();
            if (zzgqhVar.zzg() == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            if (zzgqhVar.zzg() == zzgqi.zza) {
                int i10 = 0;
                while (true) {
                    if (i10 != 0 && !hashSet.contains(Integer.valueOf(i10))) {
                        break;
                    }
                    int i11 = zzgzu.zza;
                    i10 = 0;
                    while (i10 == 0) {
                        byte[] bArrZza = zzgzm.zza(4);
                        i10 = (bArrZza[3] & 255) | ((bArrZza[0] & 255) << 24) | ((bArrZza[1] & 255) << 16) | ((bArrZza[2] & 255) << 8);
                    }
                }
                i = i10;
            } else {
                zzgqhVar.zzg();
                i = 0;
            }
            Integer numValueOf = Integer.valueOf(i);
            if (hashSet.contains(numValueOf)) {
                throw new GeneralSecurityException(androidx.media3.datasource.cache.c.m(new StringBuilder(String.valueOf(i).length() + 31), "Id ", i, " is used twice in the keyset"));
            }
            hashSet.add(numValueOf);
            zzgqd zzgqdVarZzc = zzgyf.zza().zzc(zzgqhVar.zzf(), true != zzgqhVar.zzf().zza() ? null : numValueOf);
            zzgqm zzgqmVar = new zzgqm(zzgqdVarZzc, zzgqo.zzj(zzgqhVar.zze()), i, zzgqhVar.zzc(), false, zzgqm.zza, null);
            zzhdzVarZzg.zzb(zzgqo.zzq(zzgqdVarZzc, zzgqo.zzj(zzgqhVar.zze()), i));
            if (zzgqhVar.zzc()) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (zzgqhVar.zze() != zzgqf.zza) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = numValueOf;
            }
            arrayList.add(zzgqmVar);
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        zzhdzVarZzg.zza(num.intValue());
        zzhec zzhecVar = (zzhec) zzhdzVarZzg.zzbu();
        zzgqo.zzn(zzhecVar);
        return zzgqo.zzh(new zzgqo(zzhecVar, arrayList, this.zzb, bArr));
    }
}
