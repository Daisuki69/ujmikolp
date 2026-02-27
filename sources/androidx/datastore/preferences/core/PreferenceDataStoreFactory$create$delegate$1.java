package androidx.datastore.preferences.core;

import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import nj.l;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceDataStoreFactory$create$delegate$1 extends k implements Function0<File> {
    final /* synthetic */ Function0<File> $produceFile;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PreferenceDataStoreFactory$create$delegate$1(Function0<? extends File> function0) {
        super(0);
        this.$produceFile = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final File invoke() {
        File file = (File) this.$produceFile.invoke();
        if (l.g(file).equals("preferences_pb")) {
            File absoluteFile = file.getAbsoluteFile();
            j.f(absoluteFile, "file.absoluteFile");
            return absoluteFile;
        }
        throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
    }
}
