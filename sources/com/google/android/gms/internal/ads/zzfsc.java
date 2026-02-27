package com.google.android.gms.internal.ads;

import androidx.datastore.core.Serializer;
import gj.InterfaceC1526a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfsc implements Serializer {
    public static final zzfsc zza = new zzfsc();
    private static final zzfrz zzb;

    static {
        zzfrz zzfrzVarZzd = zzfrz.zzd();
        kotlin.jvm.internal.j.f(zzfrzVarZzd, "getDefaultInstance(...)");
        zzb = zzfrzVarZzd;
    }

    private zzfsc() {
    }

    @Override // androidx.datastore.core.Serializer
    public final /* synthetic */ Object getDefaultValue() {
        return zzb;
    }

    @Override // androidx.datastore.core.Serializer
    public final Object readFrom(InputStream inputStream, InterfaceC1526a interfaceC1526a) {
        try {
            zzfrz zzfrzVarZzc = zzfrz.zzc(inputStream);
            kotlin.jvm.internal.j.d(zzfrzVarZzc);
            return zzfrzVarZzc;
        } catch (Exception unused) {
            return zzb;
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, InterfaceC1526a interfaceC1526a) throws IOException {
        ((zzfrz) obj).zzaO(outputStream);
        return Unit.f18162a;
    }
}
