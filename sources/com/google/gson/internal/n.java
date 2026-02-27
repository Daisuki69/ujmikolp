package com.google.gson.internal;

import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends Writer implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Writer f9998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f9999b = new m();

    public n(Writer writer) {
        this.f9998a = writer;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) throws IOException {
        this.f9998a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    @Override // java.io.Writer
    public final void write(int i) throws IOException {
        this.f9998a.append((char) i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) throws IOException {
        this.f9998a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i4) throws IOException {
        Objects.requireNonNull(str);
        this.f9998a.append((CharSequence) str, i, i4 + i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i4) throws IOException {
        this.f9998a.append(charSequence, i, i4);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i4) throws IOException {
        this.f9998a.append(charSequence, i, i4);
        return this;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i4) throws IOException {
        m mVar = this.f9999b;
        mVar.f9996a = cArr;
        mVar.f9997b = null;
        this.f9998a.append((CharSequence) mVar, i, i4 + i);
    }
}
