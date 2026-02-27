package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.DataStoreFile;
import java.io.File;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceDataStoreFile {
    public static final File preferencesDataStoreFile(Context context, String name) {
        j.g(context, "<this>");
        j.g(name, "name");
        return DataStoreFile.dataStoreFile(context, name.concat(".preferences_pb"));
    }
}
