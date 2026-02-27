package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.IntRange;
import kotlin.jvm.internal.j;
import mx_android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes.dex */
public final class PickVisualMediaRequest {
    private long accentColor;
    private boolean isCustomAccentColorApplied;
    private boolean isOrderedSelection;
    private ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
    private int maxItems = ActivityResultContracts.PickMultipleVisualMedia.Companion.getMaxItems$activity_release();
    private ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab = ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.INSTANCE;

    public static final class Builder {
        private long accentColor;
        private boolean isCustomAccentColorApplied;
        private boolean isOrderedSelection;
        private ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
        private int maxItems = ActivityResultContracts.PickMultipleVisualMedia.Companion.getMaxItems$activity_release();
        private ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab = ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.INSTANCE;

        public final PickVisualMediaRequest build() {
            PickVisualMediaRequest pickVisualMediaRequest = new PickVisualMediaRequest();
            pickVisualMediaRequest.setMediaType$activity_release(this.mediaType);
            pickVisualMediaRequest.setMaxItems$activity_release(this.maxItems);
            pickVisualMediaRequest.setOrderedSelection$activity_release(this.isOrderedSelection);
            pickVisualMediaRequest.setDefaultTab$activity_release(this.defaultTab);
            pickVisualMediaRequest.setCustomAccentColorApplied$activity_release(this.isCustomAccentColorApplied);
            pickVisualMediaRequest.setAccentColor$activity_release(this.accentColor);
            return pickVisualMediaRequest;
        }

        public final Builder setAccentColor(long j) {
            this.accentColor = j;
            this.isCustomAccentColorApplied = true;
            return this;
        }

        public final Builder setDefaultTab(ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab) {
            j.g(defaultTab, "defaultTab");
            this.defaultTab = defaultTab;
            return this;
        }

        public final Builder setMaxItems(@IntRange(from = PlaybackStateCompat.ACTION_PAUSE) int i) {
            this.maxItems = i;
            return this;
        }

        public final Builder setMediaType(ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType) {
            j.g(mediaType, "mediaType");
            this.mediaType = mediaType;
            return this;
        }

        public final Builder setOrderedSelection(boolean z4) {
            this.isOrderedSelection = z4;
            return this;
        }
    }

    public final long getAccentColor() {
        return this.accentColor;
    }

    public final ActivityResultContracts.PickVisualMedia.DefaultTab getDefaultTab() {
        return this.defaultTab;
    }

    public final int getMaxItems() {
        return this.maxItems;
    }

    public final ActivityResultContracts.PickVisualMedia.VisualMediaType getMediaType() {
        return this.mediaType;
    }

    public final boolean isCustomAccentColorApplied() {
        return this.isCustomAccentColorApplied;
    }

    public final boolean isOrderedSelection() {
        return this.isOrderedSelection;
    }

    public final void setAccentColor$activity_release(long j) {
        this.accentColor = j;
    }

    public final void setCustomAccentColorApplied$activity_release(boolean z4) {
        this.isCustomAccentColorApplied = z4;
    }

    public final void setDefaultTab$activity_release(ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab) {
        j.g(defaultTab, "<set-?>");
        this.defaultTab = defaultTab;
    }

    public final void setMaxItems$activity_release(int i) {
        this.maxItems = i;
    }

    public final void setMediaType$activity_release(ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType) {
        j.g(visualMediaType, "<set-?>");
        this.mediaType = visualMediaType;
    }

    public final void setOrderedSelection$activity_release(boolean z4) {
        this.isOrderedSelection = z4;
    }
}
