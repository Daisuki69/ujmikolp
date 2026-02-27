package okio;

import java.io.RandomAccessFile;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes5.dex */
public final class JvmFileHandle extends FileHandle {
    private final RandomAccessFile randomAccessFile;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmFileHandle(boolean z4, RandomAccessFile randomAccessFile) {
        super(z4);
        j.g(randomAccessFile, "randomAccessFile");
        this.randomAccessFile = randomAccessFile;
    }

    @Override // okio.FileHandle
    public synchronized void protectedClose() {
        this.randomAccessFile.close();
    }

    @Override // okio.FileHandle
    public synchronized void protectedFlush() {
        this.randomAccessFile.getFD().sync();
    }

    @Override // okio.FileHandle
    public synchronized int protectedRead(long j, byte[] array, int i, int i4) {
        j.g(array, "array");
        this.randomAccessFile.seek(j);
        int i6 = 0;
        while (true) {
            if (i6 >= i4) {
                break;
            }
            int i10 = this.randomAccessFile.read(array, i, i4 - i6);
            if (i10 != -1) {
                i6 += i10;
            } else if (i6 == 0) {
                return -1;
            }
        }
        return i6;
    }

    @Override // okio.FileHandle
    public synchronized void protectedResize(long j) throws Throwable {
        try {
            try {
                long size = size();
                long j6 = j - size;
                if (j6 > 0) {
                    int i = (int) j6;
                    protectedWrite(size, new byte[i], 0, i);
                } else {
                    this.randomAccessFile.setLength(j);
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // okio.FileHandle
    public synchronized long protectedSize() {
        return this.randomAccessFile.length();
    }

    @Override // okio.FileHandle
    public synchronized void protectedWrite(long j, byte[] array, int i, int i4) {
        j.g(array, "array");
        this.randomAccessFile.seek(j);
        this.randomAccessFile.write(array, i, i4);
    }
}
