package w2;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;
import u2.InterfaceC2297e;
import u2.InterfaceC2298f;

/* JADX INFO: renamed from: w2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2374e implements InterfaceC2296d, InterfaceC2298f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20682a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JsonWriter f20683b;
    public final HashMap c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f20684d;
    public final C2370a e;
    public final boolean f;

    public C2374e(Writer writer, HashMap map, HashMap map2, C2370a c2370a, boolean z4) {
        this.f20683b = new JsonWriter(writer);
        this.c = map;
        this.f20684d = map2;
        this.e = c2370a;
        this.f = z4;
    }

    public final C2374e a(Object obj) {
        int i = 0;
        JsonWriter jsonWriter = this.f20683b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        b(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            InterfaceC2295c interfaceC2295c = (InterfaceC2295c) this.c.get(obj.getClass());
            if (interfaceC2295c != null) {
                jsonWriter.beginObject();
                interfaceC2295c.encode(obj, this);
                jsonWriter.endObject();
                return this;
            }
            InterfaceC2297e interfaceC2297e = (InterfaceC2297e) this.f20684d.get(obj.getClass());
            if (interfaceC2297e != null) {
                interfaceC2297e.encode(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.e.encode(obj, this);
                throw null;
            }
            if (obj instanceof InterfaceC2375f) {
                int number = ((InterfaceC2375f) obj).getNumber();
                c();
                jsonWriter.value(number);
                return this;
            }
            String strName = ((Enum) obj).name();
            c();
            jsonWriter.value(strName);
            return this;
        }
        if (obj instanceof byte[]) {
            c();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i < length) {
                jsonWriter.value(r8[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                c();
                jsonWriter.value(j);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                a(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                a(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    @Override // u2.InterfaceC2296d
    public final InterfaceC2296d add(C2294b c2294b, double d10) throws IOException {
        String str = c2294b.f20258a;
        c();
        JsonWriter jsonWriter = this.f20683b;
        jsonWriter.name(str);
        c();
        jsonWriter.value(d10);
        return this;
    }

    public final C2374e b(Object obj, String str) throws IOException {
        boolean z4 = this.f;
        JsonWriter jsonWriter = this.f20683b;
        if (z4) {
            if (obj == null) {
                return this;
            }
            c();
            jsonWriter.name(str);
            a(obj);
            return this;
        }
        c();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        a(obj);
        return this;
    }

    public final void c() {
        if (!this.f20682a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }

    @Override // u2.InterfaceC2296d
    public final InterfaceC2296d add(C2294b c2294b, int i) throws IOException {
        String str = c2294b.f20258a;
        c();
        JsonWriter jsonWriter = this.f20683b;
        jsonWriter.name(str);
        c();
        jsonWriter.value(i);
        return this;
    }

    @Override // u2.InterfaceC2296d
    public final InterfaceC2296d add(C2294b c2294b, long j) throws IOException {
        String str = c2294b.f20258a;
        c();
        JsonWriter jsonWriter = this.f20683b;
        jsonWriter.name(str);
        c();
        jsonWriter.value(j);
        return this;
    }

    @Override // u2.InterfaceC2296d
    public final InterfaceC2296d add(C2294b c2294b, Object obj) throws IOException {
        b(obj, c2294b.f20258a);
        return this;
    }

    @Override // u2.InterfaceC2296d
    public final InterfaceC2296d add(C2294b c2294b, boolean z4) throws IOException {
        String str = c2294b.f20258a;
        c();
        JsonWriter jsonWriter = this.f20683b;
        jsonWriter.name(str);
        c();
        jsonWriter.value(z4);
        return this;
    }

    @Override // u2.InterfaceC2298f
    public final InterfaceC2298f add(String str) throws IOException {
        c();
        this.f20683b.value(str);
        return this;
    }

    @Override // u2.InterfaceC2298f
    public final InterfaceC2298f add(boolean z4) throws IOException {
        c();
        this.f20683b.value(z4);
        return this;
    }
}
