package androidx.media3.extractor;

import androidx.media3.common.DataReader;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public interface ExtractorInput extends DataReader {
    void advancePeekPosition(int i) throws IOException;

    boolean advancePeekPosition(int i, boolean z4) throws IOException;

    long getLength();

    long getPeekPosition();

    long getPosition();

    int peek(byte[] bArr, int i, int i4) throws IOException;

    void peekFully(byte[] bArr, int i, int i4) throws IOException;

    boolean peekFully(byte[] bArr, int i, int i4, boolean z4) throws IOException;

    @Override // androidx.media3.common.DataReader
    int read(byte[] bArr, int i, int i4) throws IOException;

    void readFully(byte[] bArr, int i, int i4) throws IOException;

    boolean readFully(byte[] bArr, int i, int i4, boolean z4) throws IOException;

    void resetPeekPosition();

    <E extends Throwable> void setRetryPosition(long j, E e) throws Throwable;

    int skip(int i) throws IOException;

    void skipFully(int i) throws IOException;

    boolean skipFully(int i, boolean z4) throws IOException;
}
