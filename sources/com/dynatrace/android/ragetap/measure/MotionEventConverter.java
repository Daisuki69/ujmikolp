package com.dynatrace.android.ragetap.measure;

import android.view.MotionEvent;
import com.dynatrace.android.ragetap.detection.TapEventData;

/* JADX INFO: loaded from: classes2.dex */
public class MotionEventConverter {
    private final float inverseDensity;

    public MotionEventConverter(float f) {
        float f3 = 1.0f / f;
        this.inverseDensity = f3;
        if (Float.isNaN(f3) || Float.isInfinite(f3)) {
            throw new ArithmeticException("invalid value");
        }
    }

    public TapEventData convertToTapEvent(MotionEvent motionEvent, long j) {
        int actionIndex = motionEvent.getActionIndex();
        return new TapEventData(motionEvent.getX(actionIndex) * this.inverseDensity, this.inverseDensity * motionEvent.getY(actionIndex), j, motionEvent.getEventTime());
    }
}
