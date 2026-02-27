package io.flutter.plugins.imagepicker;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.dynatrace.android.agent.Global;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
class FileUtils {
    private static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                outputStream.flush();
                return;
            }
            outputStream.write(bArr, 0, i);
        }
    }

    private static String getBaseName(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf < 0 ? str : str.substring(0, iLastIndexOf);
    }

    private static String getImageExtension(Context context, Uri uri) {
        try {
            String extensionFromMimeType = uri.getScheme().equals("content") ? MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri)) : MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(uri.getPath())).toString());
            if (extensionFromMimeType != null && !extensionFromMimeType.isEmpty()) {
                return "." + sanitizeFilename(extensionFromMimeType);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private static String getImageName(Context context, Uri uri) {
        Cursor cursorQueryImageName = queryImageName(context, uri);
        if (cursorQueryImageName != null) {
            try {
                if (cursorQueryImageName.moveToFirst() && cursorQueryImageName.getColumnCount() >= 1) {
                    String strSanitizeFilename = sanitizeFilename(cursorQueryImageName.getString(0));
                    cursorQueryImageName.close();
                    return strSanitizeFilename;
                }
            } catch (Throwable th2) {
                try {
                    cursorQueryImageName.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (cursorQueryImageName != null) {
            cursorQueryImageName.close();
        }
        return null;
    }

    private static Cursor queryImageName(Context context, Uri uri) {
        return context.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
    }

    @NonNull
    public static File saferOpenFile(@NonNull String str, @NonNull String str2) throws IOException, IllegalArgumentException {
        File file = new File(str);
        if (file.getCanonicalPath().startsWith(str2)) {
            return file;
        }
        throw new IllegalArgumentException("Trying to open path outside of the expected directory. File: " + file.getCanonicalPath() + " was expected to be within directory: " + str2 + ".");
    }

    @Nullable
    public static String sanitizeFilename(@Nullable String str) {
        if (str == null) {
            return null;
        }
        String[] strArr = {"..", "/"};
        String strReplace = str.split("/")[r4.length - 1];
        for (int i = 0; i < 2; i++) {
            strReplace = strReplace.replace(strArr[i], Global.UNDERSCORE);
        }
        return strReplace;
    }

    public String getPathFromUri(Context context, Uri uri) {
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                File file = new File(context.getCacheDir(), UUID.randomUUID().toString());
                file.mkdir();
                file.deleteOnExit();
                String imageName = getImageName(context, uri);
                String imageExtension = getImageExtension(context, uri);
                if (imageName == null) {
                    Log.w(com.tencent.could.component.common.ai.clipphoto.FileUtils.TAG, "Cannot get file name for " + uri);
                    if (imageExtension == null) {
                        imageExtension = ".jpg";
                    }
                    imageName = "image_picker".concat(imageExtension);
                } else if (imageExtension != null) {
                    imageName = getBaseName(imageName) + imageExtension;
                }
                File fileSaferOpenFile = saferOpenFile(new File(file, imageName).getPath(), file.getCanonicalPath());
                FileOutputStream fileOutputStream = new FileOutputStream(fileSaferOpenFile);
                try {
                    copy(inputStreamOpenInputStream, fileOutputStream);
                    String path = fileSaferOpenFile.getPath();
                    fileOutputStream.close();
                    if (inputStreamOpenInputStream != null) {
                        inputStreamOpenInputStream.close();
                    }
                    return path;
                } finally {
                }
            } catch (Throwable th2) {
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (IOException | IllegalArgumentException | SecurityException unused) {
            return null;
        }
    }
}
