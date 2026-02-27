package android.support.v4.media;

import android.media.MediaDescription;
import android.net.Uri;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    @Nullable
    @DoNotInline
    public static Uri a(MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }

    @DoNotInline
    public static void b(MediaDescription.Builder builder, @Nullable Uri uri) {
        builder.setMediaUri(uri);
    }
}
