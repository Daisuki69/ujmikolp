package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzhe;
import com.google.android.gms.internal.vision.zzhf;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzhe<MessageType extends zzhf<MessageType, BuilderType>, BuilderType extends zzhe<MessageType, BuilderType>> implements zzkn {
    @Override // 
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType clone();

    public abstract BuilderType zza(MessageType messagetype);

    public abstract BuilderType zza(zzif zzifVar, zzio zzioVar) throws IOException;

    public BuilderType zza(byte[] bArr, int i, int i4, zzio zzioVar) throws zzjk {
        try {
            zzif zzifVarZza = zzif.zza(bArr, 0, i4, false);
            zza(zzifVarZza, zzioVar);
            zzifVarZza.zza(0);
            return this;
        } catch (zzjk e) {
            throw e;
        } catch (IOException e7) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder("byte array".length() + name.length() + 60);
            sb2.append("Reading ");
            sb2.append(name);
            sb2.append(" from a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e7);
        }
    }

    @Override // com.google.android.gms.internal.vision.zzkn
    public final /* synthetic */ zzkn zza(zzkk zzkkVar) {
        if (zzr().getClass().isInstance(zzkkVar)) {
            return zza((zzhf) zzkkVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
