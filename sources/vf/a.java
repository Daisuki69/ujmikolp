package Vf;

import S1.r;
import java.io.File;
import java.io.FileFilter;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        if (!file.getName().matches("(glimpse_log_\\d+)")) {
            return false;
        }
        r.f("Reading file: " + file.getName());
        return true;
    }
}
