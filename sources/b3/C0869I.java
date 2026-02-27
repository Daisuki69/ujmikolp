package b3;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import gj.InterfaceC1526a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;

/* JADX INFO: renamed from: b3.I, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0869I implements Serializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U f8391a;

    public C0869I(U sessionGenerator) {
        kotlin.jvm.internal.j.g(sessionGenerator, "sessionGenerator");
        this.f8391a = sessionGenerator;
    }

    @Override // androidx.datastore.core.Serializer
    public final Object getDefaultValue() {
        return new C0868H(this.f8391a.a(null), null, null);
    }

    @Override // androidx.datastore.core.Serializer
    public final Object readFrom(InputStream inputStream, InterfaceC1526a interfaceC1526a) throws CorruptionException {
        try {
            Uj.b bVar = Uj.b.f6005d;
            String strJ = zj.z.j(Xh.i.z(inputStream));
            bVar.getClass();
            return (C0868H) bVar.a(C0868H.Companion.serializer(), strJ);
        } catch (Exception e) {
            throw new CorruptionException("Cannot parse session data", e);
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final Object writeTo(Object obj, OutputStream outputStream, InterfaceC1526a interfaceC1526a) throws IOException {
        outputStream.write(zj.z.l(Uj.b.f6005d.b(C0868H.Companion.serializer(), (C0868H) obj)));
        return Unit.f18162a;
    }
}
