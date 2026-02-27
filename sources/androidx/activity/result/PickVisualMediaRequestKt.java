package androidx.activity.result;

import androidx.activity.result.PickVisualMediaRequest;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.IntRange;
import kotlin.jvm.internal.j;
import mx_android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes.dex */
public final class PickVisualMediaRequestKt {
    public static final /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType) {
        j.g(mediaType, "mediaType");
        return new PickVisualMediaRequest.Builder().setMediaType(mediaType).build();
    }

    public static /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i, Object obj) {
        if ((i & 1) != 0) {
            visualMediaType = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
        }
        return PickVisualMediaRequest(visualMediaType);
    }

    public static final /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType, @IntRange(from = PlaybackStateCompat.ACTION_PAUSE) int i) {
        j.g(mediaType, "mediaType");
        return new PickVisualMediaRequest.Builder().setMediaType(mediaType).setMaxItems(i).build();
    }

    public static /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            visualMediaType = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
        }
        if ((i4 & 2) != 0) {
            i = ActivityResultContracts.PickMultipleVisualMedia.Companion.getMaxItems$activity_release();
        }
        return PickVisualMediaRequest(visualMediaType, i);
    }

    public static final PickVisualMediaRequest PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType, @IntRange(from = PlaybackStateCompat.ACTION_PAUSE) int i, boolean z4, ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab) {
        j.g(mediaType, "mediaType");
        j.g(defaultTab, "defaultTab");
        return new PickVisualMediaRequest.Builder().setMediaType(mediaType).setMaxItems(i).setOrderedSelection(z4).setDefaultTab(defaultTab).build();
    }

    public static /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i, boolean z4, ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            visualMediaType = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
        }
        if ((i4 & 2) != 0) {
            i = ActivityResultContracts.PickMultipleVisualMedia.Companion.getMaxItems$activity_release();
        }
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        if ((i4 & 8) != 0) {
            defaultTab = ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.INSTANCE;
        }
        return PickVisualMediaRequest(visualMediaType, i, z4, defaultTab);
    }

    public static final PickVisualMediaRequest PickVisualMediaRequest(long j, ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType, @IntRange(from = PlaybackStateCompat.ACTION_PAUSE) int i, boolean z4, ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab) {
        j.g(mediaType, "mediaType");
        j.g(defaultTab, "defaultTab");
        return new PickVisualMediaRequest.Builder().setMediaType(mediaType).setMaxItems(i).setOrderedSelection(z4).setDefaultTab(defaultTab).setAccentColor(j).build();
    }

    public static /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest$default(long j, ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i, boolean z4, ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            visualMediaType = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
        }
        ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType2 = visualMediaType;
        if ((i4 & 4) != 0) {
            i = ActivityResultContracts.PickMultipleVisualMedia.Companion.getMaxItems$activity_release();
        }
        int i6 = i;
        if ((i4 & 8) != 0) {
            z4 = false;
        }
        boolean z5 = z4;
        if ((i4 & 16) != 0) {
            defaultTab = ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.INSTANCE;
        }
        return PickVisualMediaRequest(j, visualMediaType2, i6, z5, defaultTab);
    }
}
