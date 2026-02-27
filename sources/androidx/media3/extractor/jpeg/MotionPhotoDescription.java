package androidx.media3.extractor.jpeg;

import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class MotionPhotoDescription {
    public final List<ContainerItem> items;
    public final long photoPresentationTimestampUs;

    public static final class ContainerItem {
        public final long length;
        public final String mime;
        public final long padding;
        public final String semantic;

        public ContainerItem(String str, String str2, long j, long j6) {
            this.mime = str;
            this.semantic = str2;
            this.length = j;
            this.padding = j6;
        }
    }

    public MotionPhotoDescription(long j, List<ContainerItem> list) {
        this.photoPresentationTimestampUs = j;
        this.items = list;
    }

    @Nullable
    public MotionPhotoMetadata getMotionPhotoMetadata(long j) {
        long j6;
        if (this.items.size() < 2) {
            return null;
        }
        long j7 = j;
        long j9 = -1;
        long j10 = -1;
        long j11 = -1;
        long j12 = -1;
        boolean z4 = false;
        for (int size = this.items.size() - 1; size >= 0; size--) {
            ContainerItem containerItem = this.items.get(size);
            boolean zEquals = MimeTypes.VIDEO_MP4.equals(containerItem.mime) | z4;
            if (size == 0) {
                j7 -= containerItem.padding;
                j6 = 0;
            } else {
                j6 = j7 - containerItem.length;
            }
            long j13 = j6;
            long j14 = j7;
            j7 = j13;
            if (!zEquals || j7 == j14) {
                z4 = zEquals;
            } else {
                j12 = j14 - j7;
                j11 = j7;
                z4 = false;
            }
            if (size == 0) {
                j9 = j7;
                j10 = j14;
            }
        }
        if (j11 == -1 || j12 == -1 || j9 == -1 || j10 == -1) {
            return null;
        }
        return new MotionPhotoMetadata(j9, j10, this.photoPresentationTimestampUs, j11, j12);
    }
}
