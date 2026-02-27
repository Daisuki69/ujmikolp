package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzas;
import com.google.android.gms.internal.clearcut.zzat;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzas<MessageType extends zzas<MessageType, BuilderType>, BuilderType extends zzat<MessageType, BuilderType>> implements zzdo {
    private static boolean zzey;
    protected int zzex = 0;

    public void zzf(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.clearcut.zzdo
    public final zzbb zzr() {
        try {
            zzbg zzbgVarZzk = zzbb.zzk(zzas());
            zzb(zzbgVarZzk.zzae());
            return zzbgVarZzk.zzad();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder("ByteString".length() + name.length() + 62);
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e);
        }
    }

    public int zzs() {
        throw new UnsupportedOperationException();
    }
}
