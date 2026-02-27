package hk;

import java.io.Serializable;
import java.io.Writer;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends Writer implements Serializable, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f17060a = new StringBuilder(4);

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c) {
        this.f17060a.append(c);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    public final String toString() {
        return this.f17060a.toString();
    }

    @Override // java.io.Writer
    public final void write(String str) {
        if (str != null) {
            this.f17060a.append(str);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(char c) {
        this.f17060a.append(c);
        return this;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i4) {
        if (cArr != null) {
            this.f17060a.append(cArr, i, i4);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        this.f17060a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        this.f17060a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i4) {
        this.f17060a.append(charSequence, i, i4);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i4) {
        this.f17060a.append(charSequence, i, i4);
        return this;
    }
}
