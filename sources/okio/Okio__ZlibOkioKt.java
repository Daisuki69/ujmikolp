package okio;

import java.io.IOException;
import kotlin.jvm.internal.j;
import okio.internal.ZipFilesKt;

/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class Okio__ZlibOkioKt {
    public static final FileSystem openZip(FileSystem fileSystem, Path zipPath) throws IOException {
        j.g(fileSystem, "<this>");
        j.g(zipPath, "zipPath");
        return ZipFilesKt.openZip$default(zipPath, fileSystem, null, 4, null);
    }
}
