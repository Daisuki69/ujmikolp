package com.squareup.moshi;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.BufferedSink;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes4.dex */
public abstract class JsonWriter implements Closeable, Flushable {
    String indent;
    boolean lenient;
    boolean promoteValueToName;
    boolean serializeNulls;
    private Map<Class<?>, Object> tags;
    int stackSize = 0;
    int[] scopes = new int[32];
    String[] pathNames = new String[32];
    int[] pathIndices = new int[32];
    int flattenStackSize = -1;

    public static JsonWriter of(BufferedSink bufferedSink) {
        return new JsonUtf8Writer(bufferedSink);
    }

    public abstract JsonWriter beginArray() throws IOException;

    public final int beginFlatten() {
        int iPeekScope = peekScope();
        if (iPeekScope != 5 && iPeekScope != 3 && iPeekScope != 2 && iPeekScope != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int i = this.flattenStackSize;
        this.flattenStackSize = this.stackSize;
        return i;
    }

    public abstract JsonWriter beginObject() throws IOException;

    public final boolean checkStack() {
        int i = this.stackSize;
        int[] iArr = this.scopes;
        if (i != iArr.length) {
            return false;
        }
        if (i == 256) {
            throw new JsonDataException("Nesting too deep at " + getPath() + ": circular reference?");
        }
        this.scopes = Arrays.copyOf(iArr, iArr.length * 2);
        String[] strArr = this.pathNames;
        this.pathNames = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        int[] iArr2 = this.pathIndices;
        this.pathIndices = Arrays.copyOf(iArr2, iArr2.length * 2);
        if (!(this instanceof JsonValueWriter)) {
            return true;
        }
        JsonValueWriter jsonValueWriter = (JsonValueWriter) this;
        Object[] objArr = jsonValueWriter.stack;
        jsonValueWriter.stack = Arrays.copyOf(objArr, objArr.length * 2);
        return true;
    }

    public abstract JsonWriter endArray() throws IOException;

    public final void endFlatten(int i) {
        this.flattenStackSize = i;
    }

    public abstract JsonWriter endObject() throws IOException;

    public final String getIndent() {
        String str = this.indent;
        return str != null ? str : "";
    }

    public final String getPath() {
        return JsonScope.getPath(this.stackSize, this.scopes, this.pathNames, this.pathIndices);
    }

    public final boolean getSerializeNulls() {
        return this.serializeNulls;
    }

    public final boolean isLenient() {
        return this.lenient;
    }

    public final JsonWriter jsonValue(Object obj) throws IOException {
        if (obj instanceof Map) {
            beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    throw new IllegalArgumentException(key == null ? "Map keys must be non-null" : "Map keys must be of type String: ".concat(key.getClass().getName()));
                }
                name((String) key);
                jsonValue(entry.getValue());
            }
            endObject();
            return this;
        }
        if (obj instanceof List) {
            beginArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                jsonValue(it.next());
            }
            endArray();
            return this;
        }
        if (obj instanceof String) {
            value((String) obj);
            return this;
        }
        if (obj instanceof Boolean) {
            value(((Boolean) obj).booleanValue());
            return this;
        }
        if (obj instanceof Double) {
            value(((Double) obj).doubleValue());
            return this;
        }
        if (obj instanceof Long) {
            value(((Long) obj).longValue());
            return this;
        }
        if (obj instanceof Number) {
            value((Number) obj);
            return this;
        }
        if (obj != null) {
            throw new IllegalArgumentException("Unsupported type: ".concat(obj.getClass().getName()));
        }
        nullValue();
        return this;
    }

    public abstract JsonWriter name(String str) throws IOException;

    public abstract JsonWriter nullValue() throws IOException;

    public final int peekScope() {
        int i = this.stackSize;
        if (i != 0) {
            return this.scopes[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void promoteValueToName() throws IOException {
        int iPeekScope = peekScope();
        if (iPeekScope != 5 && iPeekScope != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.promoteValueToName = true;
    }

    public final void pushScope(int i) {
        int[] iArr = this.scopes;
        int i4 = this.stackSize;
        this.stackSize = i4 + 1;
        iArr[i4] = i;
    }

    public final void replaceTop(int i) {
        this.scopes[this.stackSize - 1] = i;
    }

    public void setIndent(String str) {
        if (str.isEmpty()) {
            str = null;
        }
        this.indent = str;
    }

    public final void setLenient(boolean z4) {
        this.lenient = z4;
    }

    public final void setSerializeNulls(boolean z4) {
        this.serializeNulls = z4;
    }

    public final <T> void setTag(Class<T> cls, T t5) {
        if (!cls.isAssignableFrom(t5.getClass())) {
            throw new IllegalArgumentException("Tag value must be of type ".concat(cls.getName()));
        }
        if (this.tags == null) {
            this.tags = new LinkedHashMap();
        }
        this.tags.put(cls, t5);
    }

    public final <T> T tag(Class<T> cls) {
        Map<Class<?>, Object> map = this.tags;
        if (map == null) {
            return null;
        }
        return (T) map.get(cls);
    }

    public abstract JsonWriter value(double d10) throws IOException;

    public abstract JsonWriter value(long j) throws IOException;

    public abstract JsonWriter value(Boolean bool) throws IOException;

    public abstract JsonWriter value(Number number) throws IOException;

    public abstract JsonWriter value(String str) throws IOException;

    public final JsonWriter value(BufferedSource bufferedSource) throws IOException {
        if (this.promoteValueToName) {
            throw new IllegalStateException("BufferedSource cannot be used as a map key in JSON at path " + getPath());
        }
        BufferedSink bufferedSinkValueSink = valueSink();
        try {
            bufferedSource.readAll(bufferedSinkValueSink);
            if (bufferedSinkValueSink != null) {
                bufferedSinkValueSink.close();
            }
            return this;
        } catch (Throwable th2) {
            if (bufferedSinkValueSink != null) {
                try {
                    bufferedSinkValueSink.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public abstract JsonWriter value(boolean z4) throws IOException;

    public abstract BufferedSink valueSink() throws IOException;
}
