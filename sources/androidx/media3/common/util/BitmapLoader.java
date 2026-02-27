package androidx.media3.common.util;

import S1.y;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaMetadata;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface BitmapLoader {
    y decodeBitmap(byte[] bArr);

    y loadBitmap(Uri uri);

    @Nullable
    y loadBitmapFromMetadata(MediaMetadata mediaMetadata);

    boolean supportsMimeType(String str);
}
