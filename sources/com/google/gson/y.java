package com.google.gson;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y {
    public final Object fromJson(Reader reader) throws IOException {
        return read(new j3.a(reader));
    }

    public final Object fromJsonTree(o oVar) {
        try {
            return read(new com.google.gson.internal.bind.d(oVar));
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public final y nullSafe() {
        return !(this instanceof TypeAdapter$NullSafeTypeAdapter) ? new y() { // from class: com.google.gson.TypeAdapter$NullSafeTypeAdapter
            @Override // com.google.gson.y
            public final Object read(j3.a aVar) {
                if (aVar.peek() != 9) {
                    return this.f9870a.read(aVar);
                }
                aVar.G();
                return null;
            }

            public final String toString() {
                return "NullSafeTypeAdapter[" + this.f9870a + "]";
            }

            @Override // com.google.gson.y
            public final void write(j3.b bVar, Object obj) throws IOException {
                if (obj == null) {
                    bVar.r();
                } else {
                    this.f9870a.write(bVar, obj);
                }
            }
        } : this;
    }

    public abstract Object read(j3.a aVar);

    public final void toJson(Writer writer, Object obj) throws IOException {
        write(new j3.b(writer), obj);
    }

    public final o toJsonTree(Object obj) {
        try {
            com.google.gson.internal.bind.f fVar = new com.google.gson.internal.bind.f();
            write(fVar, obj);
            return fVar.H();
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public abstract void write(j3.b bVar, Object obj);

    public final Object fromJson(String str) throws IOException {
        return fromJson(new StringReader(str));
    }

    public final String toJson(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, obj);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }
}
