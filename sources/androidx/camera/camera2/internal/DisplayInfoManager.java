package androidx.camera.camera2.internal;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.camera.camera2.internal.compat.workaround.DisplaySizeCorrector;
import androidx.camera.camera2.internal.compat.workaround.MaxPreviewSize;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.media3.extractor.ts.PsExtractor;

/* JADX INFO: loaded from: classes.dex */
public class DisplayInfoManager {
    private static volatile DisplayInfoManager sInstance;

    @NonNull
    private final DisplayManager mDisplayManager;
    private static final Size MAX_PREVIEW_SIZE = new Size(1920, 1080);
    private static final Size ABNORMAL_DISPLAY_SIZE_THRESHOLD = new Size(320, PsExtractor.VIDEO_STREAM_MASK);
    private static final Size FALLBACK_DISPLAY_SIZE = new Size(640, 480);
    private static final Object INSTANCE_LOCK = new Object();
    private volatile Size mPreviewSize = null;
    private final MaxPreviewSize mMaxPreviewSize = new MaxPreviewSize();
    private final DisplaySizeCorrector mDisplaySizeCorrector = new DisplaySizeCorrector();

    private DisplayInfoManager(@NonNull Context context) {
        this.mDisplayManager = (DisplayManager) context.getSystemService("display");
    }

    private Size calculatePreviewSize() {
        Size correctedDisplaySize = getCorrectedDisplaySize();
        int height = correctedDisplaySize.getHeight() * correctedDisplaySize.getWidth();
        Size size = MAX_PREVIEW_SIZE;
        if (height > size.getHeight() * size.getWidth()) {
            correctedDisplaySize = size;
        }
        return this.mMaxPreviewSize.getMaxPreviewResolution(correctedDisplaySize);
    }

    @NonNull
    private Size getCorrectedDisplaySize() {
        Point point = new Point();
        getMaxSizeDisplay(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        if (SizeUtil.isSmallerByArea(size, ABNORMAL_DISPLAY_SIZE_THRESHOLD) && (size = this.mDisplaySizeCorrector.getDisplaySize()) == null) {
            size = FALLBACK_DISPLAY_SIZE;
        }
        return size.getHeight() > size.getWidth() ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    @NonNull
    public static DisplayInfoManager getInstance(@NonNull Context context) {
        if (sInstance == null) {
            synchronized (INSTANCE_LOCK) {
                try {
                    if (sInstance == null) {
                        sInstance = new DisplayInfoManager(context);
                    }
                } finally {
                }
            }
        }
        return sInstance;
    }

    @Nullable
    private Display getMaxSizeDisplayInternal(@NonNull Display[] displayArr, boolean z4) {
        Display display = null;
        int i = -1;
        for (Display display2 : displayArr) {
            if (!z4 || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i4 = point.x;
                int i6 = point.y;
                if (i4 * i6 > i) {
                    display = display2;
                    i = i4 * i6;
                }
            }
        }
        return display;
    }

    @VisibleForTesting
    public static void releaseInstance() {
        sInstance = null;
    }

    @NonNull
    public Display getMaxSizeDisplay(boolean z4) {
        Display[] displays = this.mDisplayManager.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display maxSizeDisplayInternal = getMaxSizeDisplayInternal(displays, z4);
        if (maxSizeDisplayInternal == null && z4) {
            maxSizeDisplayInternal = getMaxSizeDisplayInternal(displays, false);
        }
        if (maxSizeDisplayInternal != null) {
            return maxSizeDisplayInternal;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    @NonNull
    public Size getPreviewSize() {
        if (this.mPreviewSize != null) {
            return this.mPreviewSize;
        }
        this.mPreviewSize = calculatePreviewSize();
        return this.mPreviewSize;
    }

    public void refresh() {
        this.mPreviewSize = calculatePreviewSize();
    }
}
