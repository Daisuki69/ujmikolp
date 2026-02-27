package androidx.datastore.core;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class UncloseableOutputStream extends OutputStream implements AutoCloseable {
    private final FileOutputStream fileOutputStream;

    public UncloseableOutputStream(FileOutputStream fileOutputStream) {
        j.g(fileOutputStream, "fileOutputStream");
        this.fileOutputStream = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.fileOutputStream.flush();
    }

    public final FileOutputStream getFileOutputStream() {
        return this.fileOutputStream;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.fileOutputStream.write(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] b8) throws IOException {
        j.g(b8, "b");
        this.fileOutputStream.write(b8);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bytes, int i, int i4) throws IOException {
        j.g(bytes, "bytes");
        this.fileOutputStream.write(bytes, i, i4);
    }
}
