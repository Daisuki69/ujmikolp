package androidx.datastore;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class DataStoreFile {
    public static final File dataStoreFile(Context context, String fileName) {
        j.g(context, "<this>");
        j.g(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(fileName));
    }
}
