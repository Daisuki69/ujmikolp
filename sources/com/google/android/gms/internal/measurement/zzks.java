package com.google.android.gms.internal.measurement;

import We.s;
import com.google.android.gms.internal.measurement.zzkr;
import com.google.android.gms.internal.measurement.zzks;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzks<MessageType extends zzks<MessageType, BuilderType>, BuilderType extends zzkr<MessageType, BuilderType>> implements zznm {
    protected int zza = 0;

    public static void zzce(Iterable iterable, List list) {
        zzkr.zzaU(iterable, list);
    }

    @Override // com.google.android.gms.internal.measurement.zznm
    public final zzlh zzcb() {
        try {
            int iZzcn = zzcn();
            zzlh zzlhVar = zzlh.zzb;
            byte[] bArr = new byte[iZzcn];
            int i = zzlm.zzb;
            zzlk zzlkVar = new zzlk(bArr, 0, iZzcn);
            zzcB(zzlkVar);
            return zzle.zza(zzlkVar, bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException(s.q(new StringBuilder(name.length() + 72), "Serializing ", name, " to a ByteString threw an IOException (should never happen)."), e);
        }
    }

    public final byte[] zzcc() {
        try {
            int iZzcn = zzcn();
            byte[] bArr = new byte[iZzcn];
            int i = zzlm.zzb;
            zzlk zzlkVar = new zzlk(bArr, 0, iZzcn);
            zzcB(zzlkVar);
            zzlkVar.zzE();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException(s.q(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    public int zzcd(zznx zznxVar) {
        throw null;
    }
}
