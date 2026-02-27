package androidx.media3.exoplayer.upstream;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.upstream.Allocator;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class DefaultAllocator implements Allocator {
    private static final int AVAILABLE_EXTRA_CAPACITY = 100;
    private int allocatedCount;
    private Allocation[] availableAllocations;
    private int availableCount;
    private final int individualAllocationSize;

    @Nullable
    private final byte[] initialAllocationBlock;
    private int targetBufferSize;
    private final boolean trimOnReset;

    public DefaultAllocator(boolean z4, int i) {
        this(z4, i, 0);
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public synchronized Allocation allocate() {
        Allocation allocation;
        try {
            this.allocatedCount++;
            int i = this.availableCount;
            if (i > 0) {
                Allocation[] allocationArr = this.availableAllocations;
                int i4 = i - 1;
                this.availableCount = i4;
                allocation = (Allocation) Assertions.checkNotNull(allocationArr[i4]);
                this.availableAllocations[this.availableCount] = null;
            } else {
                allocation = new Allocation(new byte[this.individualAllocationSize], 0);
                int i6 = this.allocatedCount;
                Allocation[] allocationArr2 = this.availableAllocations;
                if (i6 > allocationArr2.length) {
                    this.availableAllocations = (Allocation[]) Arrays.copyOf(allocationArr2, allocationArr2.length * 2);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return allocation;
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public int getIndividualAllocationLength() {
        return this.individualAllocationSize;
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public synchronized int getTotalBytesAllocated() {
        return this.allocatedCount * this.individualAllocationSize;
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public synchronized void release(Allocation allocation) {
        Allocation[] allocationArr = this.availableAllocations;
        int i = this.availableCount;
        this.availableCount = i + 1;
        allocationArr[i] = allocation;
        this.allocatedCount--;
        notifyAll();
    }

    public synchronized void reset() {
        if (this.trimOnReset) {
            setTargetBufferSize(0);
        }
    }

    public synchronized void setTargetBufferSize(int i) {
        boolean z4 = i < this.targetBufferSize;
        this.targetBufferSize = i;
        if (z4) {
            trim();
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public synchronized void trim() {
        try {
            int i = 0;
            int iMax = Math.max(0, Util.ceilDivide(this.targetBufferSize, this.individualAllocationSize) - this.allocatedCount);
            int i4 = this.availableCount;
            if (iMax >= i4) {
                return;
            }
            if (this.initialAllocationBlock != null) {
                int i6 = i4 - 1;
                while (i <= i6) {
                    Allocation allocation = (Allocation) Assertions.checkNotNull(this.availableAllocations[i]);
                    if (allocation.data == this.initialAllocationBlock) {
                        i++;
                    } else {
                        Allocation allocation2 = (Allocation) Assertions.checkNotNull(this.availableAllocations[i6]);
                        if (allocation2.data != this.initialAllocationBlock) {
                            i6--;
                        } else {
                            Allocation[] allocationArr = this.availableAllocations;
                            allocationArr[i] = allocation2;
                            allocationArr[i6] = allocation;
                            i6--;
                            i++;
                        }
                    }
                }
                iMax = Math.max(iMax, i);
                if (iMax >= this.availableCount) {
                    return;
                }
            }
            Arrays.fill(this.availableAllocations, iMax, this.availableCount, (Object) null);
            this.availableCount = iMax;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public DefaultAllocator(boolean z4, int i, int i4) {
        Assertions.checkArgument(i > 0);
        Assertions.checkArgument(i4 >= 0);
        this.trimOnReset = z4;
        this.individualAllocationSize = i;
        this.availableCount = i4;
        this.availableAllocations = new Allocation[i4 + 100];
        if (i4 <= 0) {
            this.initialAllocationBlock = null;
            return;
        }
        this.initialAllocationBlock = new byte[i4 * i];
        for (int i6 = 0; i6 < i4; i6++) {
            this.availableAllocations[i6] = new Allocation(this.initialAllocationBlock, i6 * i);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public synchronized void release(@Nullable Allocator.AllocationNode allocationNode) {
        while (allocationNode != null) {
            try {
                Allocation[] allocationArr = this.availableAllocations;
                int i = this.availableCount;
                this.availableCount = i + 1;
                allocationArr[i] = allocationNode.getAllocation();
                this.allocatedCount--;
                allocationNode = allocationNode.next();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notifyAll();
    }
}
