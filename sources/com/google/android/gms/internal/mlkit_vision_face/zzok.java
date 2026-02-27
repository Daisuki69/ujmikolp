package com.google.android.gms.internal.mlkit_vision_face;

import B2.b;
import Z0.c;
import Z0.d;
import Z0.f;
import a1.C0620a;
import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import b2.j;
import c1.q;
import c1.r;
import c1.s;

/* JADX INFO: loaded from: classes3.dex */
public final class zzok implements zzob {

    @Nullable
    private b zza;
    private final b zzb;
    private final zznt zzc;

    public zzok(Context context, zznt zzntVar) {
        this.zzc = zzntVar;
        C0620a c0620a = C0620a.e;
        s.b(context);
        final q qVarC = s.a().c(c0620a);
        if (C0620a.f6974d.contains(new c("json"))) {
            this.zza = new j(new b() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzoh
                @Override // B2.b
                public final Object get() {
                    return ((q) qVarC).a("FIREBASE_ML_SDK", new c("json"), new f() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzoj
                        @Override // Z0.f
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new j(new b() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzoi
            @Override // B2.b
            public final Object get() {
                return ((q) qVarC).a("FIREBASE_ML_SDK", new c("proto"), new f() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzog
                    @Override // Z0.f
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    @VisibleForTesting
    public static d zzb(zznt zzntVar, zznr zznrVar) {
        int iZza = zzntVar.zza();
        return zznrVar.zza() != 0 ? d.a(zznrVar.zze(iZza, false)) : d.b(zznrVar.zze(iZza, false));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzob
    public final void zza(zznr zznrVar) {
        if (this.zzc.zza() != 0) {
            ((r) this.zzb.get()).b(zzb(this.zzc, zznrVar));
            return;
        }
        b bVar = this.zza;
        if (bVar != null) {
            ((r) bVar.get()).b(zzb(this.zzc, zznrVar));
        }
    }
}
