package E8;

import M8.A0;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import androidx.media3.common.MimeTypes;
import cj.C1129o;
import java.io.InputStream;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f1284a = C1129o.C(new String[]{MimeTypes.IMAGE_PNG, MimeTypes.IMAGE_JPEG, "image/jpg", MimeTypes.IMAGE_HEIC});

    public static A0 a(Context context, Uri uri, Long l6, Set supportedMimeTypes) {
        kotlin.jvm.internal.j.g(uri, "uri");
        kotlin.jvm.internal.j.g(supportedMimeTypes, "supportedMimeTypes");
        ContentResolver contentResolver = context.getContentResolver();
        long jAvailable = 0;
        long jLongValue = l6.longValue() <= 0 ? 10485760L : l6.longValue();
        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
        if (inputStreamOpenInputStream != null) {
            try {
                jAvailable = inputStreamOpenInputStream.available();
                inputStreamOpenInputStream.close();
            } finally {
            }
        }
        if (jAvailable > jLongValue) {
            return g.c;
        }
        String type = contentResolver.getType(uri);
        return (type != null && supportedMimeTypes.contains(type)) ? i.c : h.c;
    }
}
