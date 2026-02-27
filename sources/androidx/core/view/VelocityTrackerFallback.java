package androidx.core.view;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
class VelocityTrackerFallback {
    private static final long ASSUME_POINTER_STOPPED_MS = 40;
    private static final int HISTORY_SIZE = 20;
    private static final long RANGE_MS = 100;
    private final float[] mMovements = new float[20];
    private final long[] mEventTimes = new long[20];
    private float mLastComputedVelocity = 0.0f;
    private int mDataPointsBufferSize = 0;
    private int mDataPointsBufferLastUsedIndex = 0;

    private void clear() {
        this.mDataPointsBufferSize = 0;
        this.mLastComputedVelocity = 0.0f;
    }

    private float getCurrentVelocity() {
        long[] jArr;
        long j;
        int i = this.mDataPointsBufferSize;
        if (i < 2) {
            return 0.0f;
        }
        int i4 = this.mDataPointsBufferLastUsedIndex;
        int i6 = ((i4 + 20) - (i - 1)) % 20;
        long j6 = this.mEventTimes[i4];
        while (true) {
            jArr = this.mEventTimes;
            j = jArr[i6];
            if (j6 - j <= RANGE_MS) {
                break;
            }
            this.mDataPointsBufferSize--;
            i6 = (i6 + 1) % 20;
        }
        int i10 = this.mDataPointsBufferSize;
        if (i10 < 2) {
            return 0.0f;
        }
        if (i10 == 2) {
            int i11 = (i6 + 1) % 20;
            if (j == jArr[i11]) {
                return 0.0f;
            }
            return this.mMovements[i11] / (r2 - j);
        }
        float f = 0.0f;
        int i12 = 0;
        for (int i13 = 0; i13 < this.mDataPointsBufferSize - 1; i13++) {
            int i14 = i13 + i6;
            long[] jArr2 = this.mEventTimes;
            long j7 = jArr2[i14 % 20];
            int i15 = (i14 + 1) % 20;
            if (jArr2[i15] != j7) {
                i12++;
                float fKineticEnergyToVelocity = kineticEnergyToVelocity(f);
                float f3 = this.mMovements[i15] / (this.mEventTimes[i15] - j7);
                float fAbs = (Math.abs(f3) * (f3 - fKineticEnergyToVelocity)) + f;
                if (i12 == 1) {
                    fAbs *= 0.5f;
                }
                f = fAbs;
            }
        }
        return kineticEnergyToVelocity(f);
    }

    private static float kineticEnergyToVelocity(float f) {
        return (f < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f) * 2.0f));
    }

    public void addMovement(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.mDataPointsBufferSize != 0 && eventTime - this.mEventTimes[this.mDataPointsBufferLastUsedIndex] > ASSUME_POINTER_STOPPED_MS) {
            clear();
        }
        int i = (this.mDataPointsBufferLastUsedIndex + 1) % 20;
        this.mDataPointsBufferLastUsedIndex = i;
        int i4 = this.mDataPointsBufferSize;
        if (i4 != 20) {
            this.mDataPointsBufferSize = i4 + 1;
        }
        this.mMovements[i] = motionEvent.getAxisValue(26);
        this.mEventTimes[this.mDataPointsBufferLastUsedIndex] = eventTime;
    }

    public void computeCurrentVelocity(int i) {
        computeCurrentVelocity(i, Float.MAX_VALUE);
    }

    public float getAxisVelocity(int i) {
        if (i != 26) {
            return 0.0f;
        }
        return this.mLastComputedVelocity;
    }

    public void computeCurrentVelocity(int i, float f) {
        float currentVelocity = getCurrentVelocity() * i;
        this.mLastComputedVelocity = currentVelocity;
        if (currentVelocity < (-Math.abs(f))) {
            this.mLastComputedVelocity = -Math.abs(f);
        } else if (this.mLastComputedVelocity > Math.abs(f)) {
            this.mLastComputedVelocity = Math.abs(f);
        }
    }
}
