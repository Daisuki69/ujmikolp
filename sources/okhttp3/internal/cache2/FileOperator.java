package okhttp3.internal.cache2;

import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.j;
import okio.Buffer;

/* JADX INFO: loaded from: classes5.dex */
public final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(FileChannel fileChannel) {
        j.g(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    public final void read(long j, Buffer sink, long j6) throws IOException {
        j.g(sink, "sink");
        if (j6 < 0) {
            throw new IndexOutOfBoundsException();
        }
        long j7 = j;
        long j9 = j6;
        while (j9 > 0) {
            long jTransferTo = this.fileChannel.transferTo(j7, j9, sink);
            j7 += jTransferTo;
            j9 -= jTransferTo;
        }
    }

    public final void write(long j, Buffer source, long j6) throws IOException {
        j.g(source, "source");
        if (j6 < 0 || j6 > source.size()) {
            throw new IndexOutOfBoundsException();
        }
        long j7 = j;
        long j9 = j6;
        while (j9 > 0) {
            long jTransferFrom = this.fileChannel.transferFrom(source, j7, j9);
            j7 += jTransferFrom;
            j9 -= jTransferFrom;
        }
    }
}
