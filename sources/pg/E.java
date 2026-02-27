package pg;

import android.util.Log;
import io.flutter.plugin.common.FlutterException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import mx_android.support.v7.media.MediaRouteProviderProtocol;
import nj.C1951a;

/* JADX INFO: loaded from: classes4.dex */
public final class E implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E f19095b = new E(C2037D.INSTANCE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2037D f19096a;

    public E(C2037D c2037d) {
        this.f19096a = c2037d;
    }

    @Override // pg.v
    public final r a(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        C2037D c2037d = this.f19096a;
        Object value = c2037d.readValue(byteBuffer);
        Object value2 = c2037d.readValue(byteBuffer);
        if (!(value instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new r((String) value, value2);
    }

    @Override // pg.v
    public final ByteBuffer b(Object obj) throws IOException {
        C1951a c1951a = new C1951a();
        c1951a.write(0);
        this.f19096a.writeValue(c1951a, obj);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(c1951a.size());
        byteBufferAllocateDirect.put(c1951a.b(), 0, c1951a.size());
        return byteBufferAllocateDirect;
    }

    @Override // pg.v
    public final ByteBuffer c(r rVar) {
        C1951a c1951a = new C1951a();
        C2037D c2037d = this.f19096a;
        c2037d.writeValue(c1951a, rVar.f19112a);
        c2037d.writeValue(c1951a, rVar.f19113b);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(c1951a.size());
        byteBufferAllocateDirect.put(c1951a.b(), 0, c1951a.size());
        return byteBufferAllocateDirect;
    }

    @Override // pg.v
    public final Object d(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        byte b8 = byteBuffer.get();
        C2037D c2037d = this.f19096a;
        if (b8 != 0) {
            if (b8 == 1) {
            }
            throw new IllegalArgumentException("Envelope corrupted");
        }
        Object value = c2037d.readValue(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return value;
        }
        Object value2 = c2037d.readValue(byteBuffer);
        Object value3 = c2037d.readValue(byteBuffer);
        Object value4 = c2037d.readValue(byteBuffer);
        if ((value2 instanceof String) && ((value3 == null || (value3 instanceof String)) && !byteBuffer.hasRemaining())) {
            throw new FlutterException((String) value2, (String) value3, value4);
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }

    @Override // pg.v
    public final ByteBuffer e(String str, String str2) throws IOException {
        C1951a c1951a = new C1951a();
        c1951a.write(1);
        C2037D c2037d = this.f19096a;
        c2037d.writeValue(c1951a, MediaRouteProviderProtocol.SERVICE_DATA_ERROR);
        c2037d.writeValue(c1951a, str);
        c2037d.writeValue(c1951a, null);
        c2037d.writeValue(c1951a, str2);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(c1951a.size());
        byteBufferAllocateDirect.put(c1951a.b(), 0, c1951a.size());
        return byteBufferAllocateDirect;
    }

    @Override // pg.v
    public final ByteBuffer f(String str, String str2, Object obj) throws IOException {
        C1951a c1951a = new C1951a();
        c1951a.write(1);
        C2037D c2037d = this.f19096a;
        c2037d.writeValue(c1951a, str);
        c2037d.writeValue(c1951a, str2);
        if (obj instanceof Throwable) {
            c2037d.writeValue(c1951a, Log.getStackTraceString((Throwable) obj));
        } else {
            c2037d.writeValue(c1951a, obj);
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(c1951a.size());
        byteBufferAllocateDirect.put(c1951a.b(), 0, c1951a.size());
        return byteBufferAllocateDirect;
    }
}
