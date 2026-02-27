package androidx.media3.datasource;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DataSourceUtil {
    private DataSourceUtil() {
    }

    public static void closeQuietly(@Nullable DataSource dataSource) {
        if (dataSource != null) {
            try {
                dataSource.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] readExactly(DataSource dataSource, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i4 = 0;
        while (i4 < i) {
            int i6 = dataSource.read(bArr, i4, i - i4);
            if (i6 == -1) {
                throw new IllegalStateException(androidx.camera.core.impl.a.c(i4, i, "Not enough data could be read: ", " < "));
            }
            i4 += i6;
        }
        return bArr;
    }

    public static byte[] readToEnd(DataSource dataSource) throws IOException {
        byte[] bArrCopyOf = new byte[1024];
        int i = 0;
        int i4 = 0;
        while (i != -1) {
            if (i4 == bArrCopyOf.length) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
            }
            i = dataSource.read(bArrCopyOf, i4, bArrCopyOf.length - i4);
            if (i != -1) {
                i4 += i;
            }
        }
        return Arrays.copyOf(bArrCopyOf, i4);
    }
}
