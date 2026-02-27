package x2;

import androidx.camera.video.AudioStats;
import androidx.work.WorkInfo;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;
import u2.InterfaceC2297e;
import w2.C2370a;

/* JADX INFO: renamed from: x2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2459f implements InterfaceC2296d {
    public static final Charset f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2294b f20884g = new C2294b("key", androidx.media3.datasource.cache.c.r(androidx.media3.datasource.cache.c.o(InterfaceC2458e.class, new C2454a(1))));
    public static final C2294b h = new C2294b("value", androidx.media3.datasource.cache.c.r(androidx.media3.datasource.cache.c.o(InterfaceC2458e.class, new C2454a(2))));
    public static final C2370a i = new C2370a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OutputStream f20885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f20886b;
    public final HashMap c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2370a f20887d;
    public final C2461h e = new C2461h(this);

    public C2459f(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, C2370a c2370a) {
        this.f20885a = byteArrayOutputStream;
        this.f20886b = map;
        this.c = map2;
        this.f20887d = c2370a;
    }

    public static int e(C2294b c2294b) {
        InterfaceC2458e interfaceC2458e = (InterfaceC2458e) c2294b.b(InterfaceC2458e.class);
        if (interfaceC2458e != null) {
            return ((C2454a) interfaceC2458e).f20880a;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    public final void a(C2294b c2294b, double d10, boolean z4) throws IOException {
        if (z4 && d10 == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return;
        }
        f((e(c2294b) << 3) | 1);
        this.f20885a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d10).array());
    }

    @Override // u2.InterfaceC2296d
    public final InterfaceC2296d add(C2294b c2294b, Object obj) {
        c(c2294b, obj, true);
        return this;
    }

    public final void b(C2294b c2294b, int i4, boolean z4) {
        if (z4 && i4 == 0) {
            return;
        }
        InterfaceC2458e interfaceC2458e = (InterfaceC2458e) c2294b.b(InterfaceC2458e.class);
        if (interfaceC2458e == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        f(((C2454a) interfaceC2458e).f20880a << 3);
        f(i4);
    }

    public final void c(C2294b c2294b, Object obj, boolean z4) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z4 && charSequence.length() == 0) {
                return;
            }
            f((e(c2294b) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            f(bytes.length);
            this.f20885a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                c(c2294b, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                d(i, c2294b, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            a(c2294b, ((Double) obj).doubleValue(), z4);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z4 && fFloatValue == 0.0f) {
                return;
            }
            f((e(c2294b) << 3) | 5);
            this.f20885a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z4 && jLongValue == 0) {
                return;
            }
            InterfaceC2458e interfaceC2458e = (InterfaceC2458e) c2294b.b(InterfaceC2458e.class);
            if (interfaceC2458e == null) {
                throw new EncodingException("Field has no @Protobuf config");
            }
            f(((C2454a) interfaceC2458e).f20880a << 3);
            g(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            b(c2294b, ((Boolean) obj).booleanValue() ? 1 : 0, z4);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z4 && bArr.length == 0) {
                return;
            }
            f((e(c2294b) << 3) | 2);
            f(bArr.length);
            this.f20885a.write(bArr);
            return;
        }
        InterfaceC2295c interfaceC2295c = (InterfaceC2295c) this.f20886b.get(obj.getClass());
        if (interfaceC2295c != null) {
            d(interfaceC2295c, c2294b, obj, z4);
            return;
        }
        InterfaceC2297e interfaceC2297e = (InterfaceC2297e) this.c.get(obj.getClass());
        if (interfaceC2297e != null) {
            C2461h c2461h = this.e;
            c2461h.f20889a = false;
            c2461h.c = c2294b;
            c2461h.f20890b = z4;
            interfaceC2297e.encode(obj, c2461h);
            return;
        }
        if (obj instanceof InterfaceC2456c) {
            b(c2294b, ((InterfaceC2456c) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            b(c2294b, ((Enum) obj).ordinal(), true);
        } else {
            d(this.f20887d, c2294b, obj, z4);
        }
    }

    public final void d(InterfaceC2295c interfaceC2295c, C2294b c2294b, Object obj, boolean z4) throws IOException {
        C2455b c2455b = new C2455b();
        c2455b.f20881a = 0L;
        try {
            OutputStream outputStream = this.f20885a;
            this.f20885a = c2455b;
            try {
                interfaceC2295c.encode(obj, this);
                this.f20885a = outputStream;
                long j = c2455b.f20881a;
                c2455b.close();
                if (z4 && j == 0) {
                    return;
                }
                f((e(c2294b) << 3) | 2);
                g(j);
                interfaceC2295c.encode(obj, this);
            } catch (Throwable th2) {
                this.f20885a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                c2455b.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final void f(int i4) throws IOException {
        while ((i4 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
            this.f20885a.write((i4 & 127) | 128);
            i4 >>>= 7;
        }
        this.f20885a.write(i4 & 127);
    }

    public final void g(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.f20885a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f20885a.write(((int) j) & 127);
    }

    @Override // u2.InterfaceC2296d
    public final InterfaceC2296d add(C2294b c2294b, double d10) throws IOException {
        a(c2294b, d10, true);
        return this;
    }

    @Override // u2.InterfaceC2296d
    public final InterfaceC2296d add(C2294b c2294b, int i4) {
        b(c2294b, i4, true);
        return this;
    }

    @Override // u2.InterfaceC2296d
    public final InterfaceC2296d add(C2294b c2294b, boolean z4) {
        b(c2294b, z4 ? 1 : 0, true);
        return this;
    }

    @Override // u2.InterfaceC2296d
    public final InterfaceC2296d add(C2294b c2294b, long j) throws IOException {
        if (j == 0) {
            return this;
        }
        InterfaceC2458e interfaceC2458e = (InterfaceC2458e) c2294b.b(InterfaceC2458e.class);
        if (interfaceC2458e != null) {
            f(((C2454a) interfaceC2458e).f20880a << 3);
            g(j);
            return this;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }
}
