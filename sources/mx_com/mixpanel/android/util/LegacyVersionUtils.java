package mx_com.mixpanel.android.util;

import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class LegacyVersionUtils {
    private static final String DEFAULT_DIRECTORY_PREFIX = "MixpanelAPI.Images.";
    private static final String FILE_PREFIX = "MP_IMG_";

    public static void removeLegacyResidualImageFiles(File file) {
        File[] fileArrListFiles;
        try {
            if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                for (File file2 : fileArrListFiles) {
                    removeLegacyResidualImageFiles(file2);
                }
            }
            if (file.getName().contains(DEFAULT_DIRECTORY_PREFIX) || file.getName().contains(FILE_PREFIX)) {
                file.delete();
            }
        } catch (Exception unused) {
        }
    }
}
