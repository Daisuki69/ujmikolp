package com.dynatrace.android.ragetap.measure;

import We.s;
import android.view.MotionEvent;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.TimeLineProvider;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.ragetap.detection.RageTapDetector;
import com.dynatrace.android.ragetap.detection.TapData;
import com.dynatrace.android.ragetap.detection.TapEventData;
import com.dynatrace.android.window.OnTouchEventListener;

/* JADX INFO: loaded from: classes2.dex */
public class TapMonitor implements OnTouchEventListener {
    private static final String LOG_TAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "TapMonitor");
    private final MotionEventConverter converter;
    private final RageTapDetector detector;
    private State state = State.NO_TAP;
    private TapEventData tapDown;
    private final TimeLineProvider timeLineProvider;

    public enum State {
        NO_TAP,
        TAP_DOWN,
        INVALID_TAP_STATE
    }

    public TapMonitor(RageTapDetector rageTapDetector, MotionEventConverter motionEventConverter, TimeLineProvider timeLineProvider) {
        this.detector = rageTapDetector;
        this.converter = motionEventConverter;
        this.timeLineProvider = timeLineProvider;
    }

    @Override // com.dynatrace.android.window.OnTouchEventListener
    public void onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.tapDown = this.converter.convertToTapEvent(motionEvent, this.timeLineProvider.now());
            this.state = State.TAP_DOWN;
            return;
        }
        if (actionMasked == 1) {
            if (this.state == State.TAP_DOWN) {
                this.detector.onTapDetected(new TapData(this.tapDown, this.converter.convertToTapEvent(motionEvent, this.timeLineProvider.now())));
            }
            this.state = State.NO_TAP;
            this.tapDown = null;
            return;
        }
        if (actionMasked != 2) {
            if (actionMasked == 5 || actionMasked == 6) {
                if (this.state == State.TAP_DOWN) {
                    if (Global.DEBUG) {
                        Utility.zlogD(LOG_TAG, "multi-touch tap detected");
                    }
                    this.detector.evaluateAndReset();
                }
                this.state = State.INVALID_TAP_STATE;
                this.tapDown = null;
                return;
            }
            if (Global.DEBUG) {
                Utility.zlogD(LOG_TAG, "unexpected event type detected: " + motionEvent.toString());
            }
        }
    }
}
