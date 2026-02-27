package androidx.room.util;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.RestrictTo;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class FileUtil {
    @SuppressLint({"LambdaLast"})
    public static final void copy(ReadableByteChannel input, FileChannel output) throws Throwable {
        ReadableByteChannel readableByteChannel;
        FileChannel fileChannel;
        j.g(input, "input");
        j.g(output, "output");
        try {
        } catch (Throwable th2) {
            th = th2;
            readableByteChannel = input;
            fileChannel = output;
        }
        try {
            if (Build.VERSION.SDK_INT <= 23) {
                readableByteChannel = input;
                fileChannel = output;
                InputStream inputStreamNewInputStream = Channels.newInputStream(readableByteChannel);
                OutputStream outputStreamNewOutputStream = Channels.newOutputStream(fileChannel);
                byte[] bArr = new byte[4096];
                while (true) {
                    int i = inputStreamNewInputStream.read(bArr);
                    if (i <= 0) {
                        break;
                    } else {
                        outputStreamNewOutputStream.write(bArr, 0, i);
                    }
                }
            } else {
                readableByteChannel = input;
                fileChannel = output;
                fileChannel.transferFrom(readableByteChannel, 0L, Long.MAX_VALUE);
            }
            fileChannel.force(false);
            readableByteChannel.close();
            fileChannel.close();
        } catch (Throwable th3) {
            th = th3;
            Throwable th4 = th;
            readableByteChannel.close();
            fileChannel.close();
            throw th4;
        }
    }
}
