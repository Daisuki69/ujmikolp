package nj;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import kotlin.io.FileAlreadyExistsException;
import kotlin.io.FileSystemException;
import kotlin.io.FileWalkDirection;
import kotlin.io.NoSuchFileException;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class l extends k {
    public static void e(File file, File file2) {
        if (!file.exists()) {
            throw new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null);
        }
        if (file2.exists() && !file2.delete()) {
            throw new FileAlreadyExistsException(file, file2, "Tried to overwrite the destination, but failed to delete it.");
        }
        if (file.isDirectory()) {
            if (!file2.mkdirs()) {
                throw new FileSystemException(file, file2, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                Xh.i.i(fileInputStream, fileOutputStream);
                fileOutputStream.close();
                fileInputStream.close();
            } finally {
            }
        } finally {
        }
    }

    public static boolean f(File file) {
        f fVar = new f(new h(file, FileWalkDirection.f18172b, null, null, null, 0, 32, null));
        while (true) {
            boolean z4 = true;
            while (fVar.hasNext()) {
                File file2 = (File) fVar.next();
                if (!file2.delete() && file2.exists()) {
                    z4 = false;
                } else {
                    if (z4) {
                        break;
                    }
                    z4 = false;
                }
            }
            return z4;
        }
    }

    public static String g(File file) {
        kotlin.jvm.internal.j.g(file, "<this>");
        String name = file.getName();
        kotlin.jvm.internal.j.f(name, "getName(...)");
        return C2576A.W('.', name, "");
    }
}
