package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.UnstableApi;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class ExtractorUtil {
    private ExtractorUtil() {
    }

    public static void checkContainerInput(boolean z4, @Nullable String str) throws ParserException {
        if (!z4) {
            throw ParserException.createForMalformedContainer(str, null);
        }
    }

    public static boolean peekFullyQuietly(ExtractorInput extractorInput, byte[] bArr, int i, int i4, boolean z4) throws IOException {
        try {
            return extractorInput.peekFully(bArr, i, i4, z4);
        } catch (EOFException e) {
            if (z4) {
                return false;
            }
            throw e;
        }
    }

    public static int peekToLength(ExtractorInput extractorInput, byte[] bArr, int i, int i4) throws IOException {
        int i6 = 0;
        while (i6 < i4) {
            int iPeek = extractorInput.peek(bArr, i + i6, i4 - i6);
            if (iPeek == -1) {
                break;
            }
            i6 += iPeek;
        }
        return i6;
    }

    public static boolean readFullyQuietly(ExtractorInput extractorInput, byte[] bArr, int i, int i4) throws IOException {
        try {
            extractorInput.readFully(bArr, i, i4);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean skipFullyQuietly(ExtractorInput extractorInput, int i) throws IOException {
        try {
            extractorInput.skipFully(i);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
