package e3;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import gj.InterfaceC1526a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;
import zj.z;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements Serializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f16576a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f16577b = new j(null, null, null, null, null);

    @Override // androidx.datastore.core.Serializer
    public final /* bridge */ /* synthetic */ Object getDefaultValue() {
        return f16577b;
    }

    @Override // androidx.datastore.core.Serializer
    public final Object readFrom(InputStream inputStream, InterfaceC1526a interfaceC1526a) throws CorruptionException {
        try {
            Uj.b bVar = Uj.b.f6005d;
            String strJ = z.j(Xh.i.z(inputStream));
            bVar.getClass();
            return (j) bVar.a(j.Companion.serializer(), strJ);
        } catch (Exception e) {
            throw new CorruptionException("Cannot parse session configs", e);
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final Object writeTo(Object obj, OutputStream outputStream, InterfaceC1526a interfaceC1526a) throws IOException {
        outputStream.write(z.l(Uj.b.f6005d.b(j.Companion.serializer(), (j) obj)));
        return Unit.f18162a;
    }
}
