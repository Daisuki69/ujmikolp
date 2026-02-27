package androidx.media3.common.util;

import S1.y;
import android.net.Uri;
import androidx.media3.common.MediaMetadata;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static y a(BitmapLoader bitmapLoader, MediaMetadata mediaMetadata) {
        byte[] bArr = mediaMetadata.artworkData;
        if (bArr != null) {
            return bitmapLoader.decodeBitmap(bArr);
        }
        Uri uri = mediaMetadata.artworkUri;
        if (uri != null) {
            return bitmapLoader.loadBitmap(uri);
        }
        return null;
    }
}
