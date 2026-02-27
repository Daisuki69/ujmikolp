package kotlin.io;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class FileSystemException extends IOException {
    public FileSystemException(File file, File file2, String str) {
        StringBuilder sb2 = new StringBuilder(file.toString());
        if (file2 != null) {
            sb2.append(" -> " + file2);
        }
        if (str != null) {
            sb2.append(": ".concat(str));
        }
        String string = sb2.toString();
        j.f(string, "toString(...)");
        super(string);
    }
}
