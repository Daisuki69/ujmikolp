package com.google.android.gms.internal.measurement;

import We.s;
import defpackage.AbstractC1414e;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static zzao a(zzak zzakVar, zzao zzaoVar, zzg zzgVar, List list) {
        if (zzakVar.zzj(zzaoVar.zzc())) {
            zzao zzaoVarZzk = zzakVar.zzk(zzaoVar.zzc());
            if (zzaoVarZzk instanceof zzai) {
                return ((zzai) zzaoVarZzk).zza(zzgVar, list);
            }
            throw new IllegalArgumentException(s.i(zzaoVar.zzc(), " is not a function"));
        }
        if (!"hasOwnProperty".equals(zzaoVar.zzc())) {
            throw new IllegalArgumentException(AbstractC1414e.h("Object has no function ", zzaoVar.zzc()));
        }
        zzh.zza("hasOwnProperty", 1, list);
        return zzakVar.zzj(zzgVar.zza((zzao) list.get(0)).zzc()) ? zzao.zzk : zzao.zzl;
    }

    public static Iterator b(Map map) {
        return new zzaj(map.keySet().iterator());
    }
}
