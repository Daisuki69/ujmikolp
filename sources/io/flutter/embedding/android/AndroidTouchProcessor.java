package io.flutter.embedding.android;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.camera.video.AudioStats;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class AndroidTouchProcessor {

    @VisibleForTesting
    static final int BYTES_PER_FIELD = 8;

    @VisibleForTesting
    static final int DEFAULT_HORIZONTAL_SCROLL_FACTOR = 48;

    @VisibleForTesting
    static final int DEFAULT_VERTICAL_SCROLL_FACTOR = 48;
    private static final Matrix IDENTITY_TRANSFORM = new Matrix();
    private static final int IMPLICIT_VIEW_ID = 0;

    @VisibleForTesting
    static final int POINTER_DATA_FIELD_COUNT = 36;
    private static final int POINTER_DATA_FLAG_BATCHED = 1;
    private static final String TAG = "AndroidTouchProcessor";
    private int cachedVerticalScrollFactor;

    @NonNull
    private final FlutterRenderer renderer;
    private final boolean trackMotionEvents;
    private final Map<Integer, float[]> ongoingPans = new HashMap();

    @NonNull
    private final MotionEventTracker motionEventTracker = MotionEventTracker.getInstance();

    public @interface PointerChange {
        public static final int ADD = 1;
        public static final int CANCEL = 0;
        public static final int DOWN = 4;
        public static final int HOVER = 3;
        public static final int MOVE = 5;
        public static final int PAN_ZOOM_END = 9;
        public static final int PAN_ZOOM_START = 7;
        public static final int PAN_ZOOM_UPDATE = 8;
        public static final int REMOVE = 2;
        public static final int UP = 6;
    }

    public @interface PointerDeviceKind {
        public static final int INVERTED_STYLUS = 3;
        public static final int MOUSE = 1;
        public static final int STYLUS = 2;
        public static final int TOUCH = 0;
        public static final int TRACKPAD = 4;
        public static final int UNKNOWN = 5;
    }

    public @interface PointerSignalKind {
        public static final int NONE = 0;
        public static final int SCALE = 3;
        public static final int SCROLL = 1;
        public static final int SCROLL_INERTIA_CANCEL = 2;
        public static final int UNKNOWN = 4;
    }

    public AndroidTouchProcessor(@NonNull FlutterRenderer flutterRenderer, boolean z4) {
        this.renderer = flutterRenderer;
        this.trackMotionEvents = z4;
    }

    private void addPointerForIndex(MotionEvent motionEvent, int i, int i4, int i6, Matrix matrix, ByteBuffer byteBuffer) {
        addPointerForIndex(motionEvent, i, i4, i6, matrix, byteBuffer, null);
    }

    private float getHorizontalScrollFactor(@NonNull Context context) {
        return Build.VERSION.SDK_INT >= 26 ? ViewConfiguration.get(context).getScaledHorizontalScrollFactor() : getVerticalScrollFactorPre26(context);
    }

    @PointerChange
    private int getPointerChangeForAction(int i) {
        if (i == 0) {
            return 4;
        }
        if (i == 1) {
            return 6;
        }
        if (i == 5) {
            return 4;
        }
        if (i == 6) {
            return 6;
        }
        if (i == 2) {
            return 5;
        }
        if (i == 7) {
            return 3;
        }
        if (i == 3) {
            return 0;
        }
        return i == 8 ? 3 : -1;
    }

    @PointerChange
    private int getPointerChangeForPanZoom(int i) {
        if (i == 4) {
            return 7;
        }
        if (i == 5) {
            return 8;
        }
        return (i == 6 || i == 0) ? 9 : -1;
    }

    @PointerDeviceKind
    private int getPointerDeviceTypeForToolType(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 2;
        }
        if (i != 3) {
            return i != 4 ? 5 : 3;
        }
        return 1;
    }

    private float getVerticalScrollFactor(@NonNull Context context) {
        return Build.VERSION.SDK_INT >= 26 ? getVerticalScrollFactorAbove26(context) : getVerticalScrollFactorPre26(context);
    }

    @TargetApi(26)
    private float getVerticalScrollFactorAbove26(@NonNull Context context) {
        return ViewConfiguration.get(context).getScaledVerticalScrollFactor();
    }

    private int getVerticalScrollFactorPre26(@NonNull Context context) {
        if (this.cachedVerticalScrollFactor == 0) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                return 48;
            }
            this.cachedVerticalScrollFactor = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.cachedVerticalScrollFactor;
    }

    public boolean onGenericMotionEvent(@NonNull MotionEvent motionEvent, @NonNull Context context) {
        boolean zIsFromSource = motionEvent.isFromSource(2);
        boolean z4 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
        if (!zIsFromSource || !z4) {
            return false;
        }
        int pointerChangeForAction = getPointerChangeForAction(motionEvent.getActionMasked());
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
        byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        addPointerForIndex(motionEvent, motionEvent.getActionIndex(), pointerChangeForAction, 0, IDENTITY_TRANSFORM, byteBufferAllocateDirect, context);
        if (byteBufferAllocateDirect.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary.");
        }
        this.renderer.dispatchPointerDataPacket(byteBufferAllocateDirect, byteBufferAllocateDirect.position());
        return true;
    }

    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        return onTouchEvent(motionEvent, IDENTITY_TRANSFORM);
    }

    private void addPointerForIndex(MotionEvent motionEvent, int i, int i4, int i6, Matrix matrix, ByteBuffer byteBuffer, Context context) {
        int i10;
        int i11;
        long buttonState;
        int pointerChangeForPanZoom;
        int i12;
        double min;
        double max;
        double d10;
        double d11;
        double horizontalScrollFactor;
        double verticalScrollFactor;
        InputDevice.MotionRange motionRange;
        if (i4 == -1) {
            return;
        }
        int pointerId = motionEvent.getPointerId(i);
        int pointerDeviceTypeForToolType = getPointerDeviceTypeForToolType(motionEvent.getToolType(i));
        float[] fArr = {motionEvent.getX(i), motionEvent.getY(i)};
        matrix.mapPoints(fArr);
        if (pointerDeviceTypeForToolType == 1) {
            i11 = 0;
            i10 = 1;
            buttonState = motionEvent.getButtonState() & 31;
            if (buttonState == 0 && motionEvent.getSource() == 8194 && i4 == 4) {
                this.ongoingPans.put(Integer.valueOf(pointerId), fArr);
            }
        } else {
            i10 = 1;
            i11 = 0;
            buttonState = pointerDeviceTypeForToolType == 2 ? (motionEvent.getButtonState() >> 4) & 15 : 0L;
        }
        boolean zContainsKey = this.ongoingPans.containsKey(Integer.valueOf(pointerId));
        if (zContainsKey) {
            pointerChangeForPanZoom = getPointerChangeForPanZoom(i4);
            if (pointerChangeForPanZoom == -1) {
                return;
            }
        } else {
            pointerChangeForPanZoom = -1;
        }
        long id = this.trackMotionEvents ? this.motionEventTracker.track(motionEvent).getId() : 0L;
        int i13 = motionEvent.getActionMasked() == 8 ? i10 : i11;
        int i14 = pointerChangeForPanZoom;
        long eventTime = motionEvent.getEventTime() * 1000;
        byteBuffer.putLong(id);
        byteBuffer.putLong(eventTime);
        if (zContainsKey) {
            i12 = i14;
            byteBuffer.putLong(i12);
            byteBuffer.putLong(4L);
        } else {
            i12 = i14;
            byteBuffer.putLong(i4);
            byteBuffer.putLong(pointerDeviceTypeForToolType);
        }
        byteBuffer.putLong(i13);
        byteBuffer.putLong(pointerId);
        byteBuffer.putLong(0L);
        if (zContainsKey) {
            float[] fArr2 = this.ongoingPans.get(Integer.valueOf(pointerId));
            byteBuffer.putDouble(fArr2[i11]);
            byteBuffer.putDouble(fArr2[i10]);
        } else {
            byteBuffer.putDouble(fArr[i11]);
            byteBuffer.putDouble(fArr[i10]);
        }
        byteBuffer.putDouble(AudioStats.AUDIO_AMPLITUDE_NONE);
        byteBuffer.putDouble(AudioStats.AUDIO_AMPLITUDE_NONE);
        byteBuffer.putLong(buttonState);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble(motionEvent.getPressure(i));
        if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
            min = AudioStats.AUDIO_AMPLITUDE_NONE;
            max = 1.0d;
        } else {
            min = motionRange.getMin();
            max = motionRange.getMax();
        }
        byteBuffer.putDouble(min);
        byteBuffer.putDouble(max);
        if (pointerDeviceTypeForToolType == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(24, i));
            d10 = AudioStats.AUDIO_AMPLITUDE_NONE;
            byteBuffer.putDouble(AudioStats.AUDIO_AMPLITUDE_NONE);
        } else {
            d10 = AudioStats.AUDIO_AMPLITUDE_NONE;
            byteBuffer.putDouble(AudioStats.AUDIO_AMPLITUDE_NONE);
            byteBuffer.putDouble(AudioStats.AUDIO_AMPLITUDE_NONE);
        }
        byteBuffer.putDouble(motionEvent.getSize(i));
        byteBuffer.putDouble(motionEvent.getToolMajor(i));
        byteBuffer.putDouble(motionEvent.getToolMinor(i));
        byteBuffer.putDouble(d10);
        byteBuffer.putDouble(d10);
        byteBuffer.putDouble(motionEvent.getAxisValue(8, i));
        if (pointerDeviceTypeForToolType == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(25, i));
        } else {
            byteBuffer.putDouble(d10);
        }
        byteBuffer.putLong(i6);
        if (i13 == i10) {
            if (context != null) {
                horizontalScrollFactor = getHorizontalScrollFactor(context);
                verticalScrollFactor = getVerticalScrollFactor(context);
            } else {
                horizontalScrollFactor = 48.0d;
                verticalScrollFactor = 48.0d;
            }
            double d12 = horizontalScrollFactor * ((double) (-motionEvent.getAxisValue(10, i)));
            double d13 = verticalScrollFactor * ((double) (-motionEvent.getAxisValue(9, i)));
            byteBuffer.putDouble(d12);
            byteBuffer.putDouble(d13);
        } else {
            byteBuffer.putDouble(AudioStats.AUDIO_AMPLITUDE_NONE);
            byteBuffer.putDouble(AudioStats.AUDIO_AMPLITUDE_NONE);
        }
        if (zContainsKey) {
            float[] fArr3 = this.ongoingPans.get(Integer.valueOf(pointerId));
            byteBuffer.putDouble(fArr[i11] - fArr3[i11]);
            byteBuffer.putDouble(fArr[1] - fArr3[1]);
            d11 = AudioStats.AUDIO_AMPLITUDE_NONE;
        } else {
            d11 = AudioStats.AUDIO_AMPLITUDE_NONE;
            byteBuffer.putDouble(AudioStats.AUDIO_AMPLITUDE_NONE);
            byteBuffer.putDouble(AudioStats.AUDIO_AMPLITUDE_NONE);
        }
        byteBuffer.putDouble(d11);
        byteBuffer.putDouble(d11);
        byteBuffer.putDouble(1.0d);
        byteBuffer.putDouble(d11);
        byteBuffer.putLong(0L);
        if (zContainsKey && i12 == 9) {
            this.ongoingPans.remove(Integer.valueOf(pointerId));
        }
    }

    public boolean onTouchEvent(@NonNull MotionEvent motionEvent, @NonNull Matrix matrix) {
        int actionMasked = motionEvent.getActionMasked();
        int pointerChangeForAction = getPointerChangeForAction(motionEvent.getActionMasked());
        boolean z4 = actionMasked == 0 || actionMasked == 5;
        boolean z5 = !z4 && (actionMasked == 1 || actionMasked == 6);
        int i = (z5 && getPointerDeviceTypeForToolType(motionEvent.getToolType(motionEvent.getActionIndex())) == 0) ? 1 : 0;
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((pointerCount + i) * 288);
        byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        if (z4) {
            addPointerForIndex(motionEvent, motionEvent.getActionIndex(), pointerChangeForAction, 0, matrix, byteBufferAllocateDirect);
        } else if (z5) {
            for (int i4 = 0; i4 < pointerCount; i4++) {
                if (i4 != motionEvent.getActionIndex() && motionEvent.getToolType(i4) == 1) {
                    addPointerForIndex(motionEvent, i4, 5, 1, matrix, byteBufferAllocateDirect);
                }
            }
            addPointerForIndex(motionEvent, motionEvent.getActionIndex(), pointerChangeForAction, 0, matrix, byteBufferAllocateDirect);
            if (i != 0) {
                addPointerForIndex(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, byteBufferAllocateDirect);
            }
        } else {
            for (int i6 = 0; i6 < pointerCount; i6++) {
                addPointerForIndex(motionEvent, i6, pointerChangeForAction, 0, matrix, byteBufferAllocateDirect);
            }
        }
        if (byteBufferAllocateDirect.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary");
        }
        this.renderer.dispatchPointerDataPacket(byteBufferAllocateDirect, byteBufferAllocateDirect.position());
        return true;
    }
}
