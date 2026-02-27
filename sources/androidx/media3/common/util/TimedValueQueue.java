package androidx.media3.common.util;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class TimedValueQueue<V> {
    private static final int INITIAL_BUFFER_SIZE = 10;
    private int first;
    private int size;
    private long[] timestamps;
    private V[] values;

    public TimedValueQueue() {
        this(10);
    }

    private void addUnchecked(long j, V v7) {
        int i = this.first;
        int i4 = this.size;
        V[] vArr = this.values;
        int length = (i + i4) % vArr.length;
        this.timestamps[length] = j;
        vArr[length] = v7;
        this.size = i4 + 1;
    }

    private void clearBufferOnTimeDiscontinuity(long j) {
        if (this.size > 0) {
            if (j <= this.timestamps[((this.first + r0) - 1) % this.values.length]) {
                clear();
            }
        }
    }

    private void doubleCapacityIfFull() {
        int length = this.values.length;
        if (this.size < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        V[] vArr = (V[]) newArray(i);
        int i4 = this.first;
        int i6 = length - i4;
        System.arraycopy(this.timestamps, i4, jArr, 0, i6);
        System.arraycopy(this.values, this.first, vArr, 0, i6);
        int i10 = this.first;
        if (i10 > 0) {
            System.arraycopy(this.timestamps, 0, jArr, i6, i10);
            System.arraycopy(this.values, 0, vArr, i6, this.first);
        }
        this.timestamps = jArr;
        this.values = vArr;
        this.first = 0;
    }

    private static <V> V[] newArray(int i) {
        return (V[]) new Object[i];
    }

    @Nullable
    private V popFirst() {
        Assertions.checkState(this.size > 0);
        V[] vArr = this.values;
        int i = this.first;
        V v7 = vArr[i];
        vArr[i] = null;
        this.first = (i + 1) % vArr.length;
        this.size--;
        return v7;
    }

    public synchronized void add(long j, V v7) {
        clearBufferOnTimeDiscontinuity(j);
        doubleCapacityIfFull();
        addUnchecked(j, v7);
    }

    public synchronized void clear() {
        this.first = 0;
        this.size = 0;
        Arrays.fill(this.values, (Object) null);
    }

    @Nullable
    public synchronized V poll(long j) {
        return poll(j, false);
    }

    @Nullable
    public synchronized V pollFirst() {
        return this.size == 0 ? null : popFirst();
    }

    @Nullable
    public synchronized V pollFloor(long j) {
        return poll(j, true);
    }

    public synchronized int size() {
        return this.size;
    }

    public TimedValueQueue(int i) {
        this.timestamps = new long[i];
        this.values = (V[]) newArray(i);
    }

    @Nullable
    private V poll(long j, boolean z4) {
        V vPopFirst = null;
        long j6 = Long.MAX_VALUE;
        while (this.size > 0) {
            long j7 = j - this.timestamps[this.first];
            if (j7 < 0 && (z4 || (-j7) >= j6)) {
                break;
            }
            vPopFirst = popFirst();
            j6 = j7;
        }
        return vPopFirst;
    }
}
