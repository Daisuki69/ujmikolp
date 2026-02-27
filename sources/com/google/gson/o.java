package com.google.gson;

import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o {
    public BigDecimal a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public double d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final l f() {
        if (this instanceof l) {
            return (l) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public final q g() {
        if (this instanceof q) {
            return (q) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public final r h() {
        if (this instanceof r) {
            return (r) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public long i() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String j() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            j3.b bVar = new j3.b(stringWriter);
            bVar.h = 1;
            com.google.gson.internal.bind.i.f9975z.write(bVar, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
