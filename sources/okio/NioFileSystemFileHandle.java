package okio;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes5.dex */
public final class NioFileSystemFileHandle extends FileHandle {
    private final FileChannel fileChannel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NioFileSystemFileHandle(boolean z4, FileChannel fileChannel) {
        super(z4);
        j.g(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    @Override // okio.FileHandle
    public synchronized void protectedClose() {
        this.fileChannel.close();
    }

    @Override // okio.FileHandle
    public synchronized void protectedFlush() {
        this.fileChannel.force(true);
    }

    @Override // okio.FileHandle
    public synchronized int protectedRead(long j, byte[] array, int i, int i4) {
        j.g(array, "array");
        this.fileChannel.position(j);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(array, i, i4);
        int i6 = 0;
        while (true) {
            if (i6 >= i4) {
                break;
            }
            int i10 = this.fileChannel.read(byteBufferWrap);
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
                    this.fileChannel.truncate(j);
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
        return this.fileChannel.size();
    }

    @Override // okio.FileHandle
    public synchronized void protectedWrite(long j, byte[] array, int i, int i4) {
        j.g(array, "array");
        this.fileChannel.position(j);
        this.fileChannel.write(ByteBuffer.wrap(array, i, i4));
    }
}
