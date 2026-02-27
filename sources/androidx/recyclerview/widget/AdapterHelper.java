package androidx.recyclerview.widget;

import androidx.camera.core.impl.a;
import androidx.core.util.Pools;
import androidx.recyclerview.widget.OpReorderer;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class AdapterHelper implements OpReorderer.Callback {
    private static final boolean DEBUG = false;
    static final int POSITION_TYPE_INVISIBLE = 0;
    static final int POSITION_TYPE_NEW_OR_LAID_OUT = 1;
    private static final String TAG = "AHT";
    final Callback mCallback;
    final boolean mDisableRecycler;
    private int mExistingUpdateTypes;
    Runnable mOnItemProcessedCallback;
    final OpReorderer mOpReorderer;
    final ArrayList<UpdateOp> mPendingUpdates;
    final ArrayList<UpdateOp> mPostponedList;
    private Pools.Pool<UpdateOp> mUpdateOpPool;

    public interface Callback {
        RecyclerView.ViewHolder findViewHolder(int i);

        void markViewHoldersUpdated(int i, int i4, Object obj);

        void offsetPositionsForAdd(int i, int i4);

        void offsetPositionsForMove(int i, int i4);

        void offsetPositionsForRemovingInvisible(int i, int i4);

        void offsetPositionsForRemovingLaidOutOrNewView(int i, int i4);

        void onDispatchFirstPass(UpdateOp updateOp);

        void onDispatchSecondPass(UpdateOp updateOp);
    }

    public static final class UpdateOp {
        static final int ADD = 1;
        static final int MOVE = 8;
        static final int POOL_SIZE = 30;
        static final int REMOVE = 2;
        static final int UPDATE = 4;
        int cmd;
        int itemCount;
        Object payload;
        int positionStart;

        public UpdateOp(int i, int i4, int i6, Object obj) {
            this.cmd = i;
            this.positionStart = i4;
            this.itemCount = i6;
            this.payload = obj;
        }

        public String cmdToString() {
            int i = this.cmd;
            return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateOp)) {
                return false;
            }
            UpdateOp updateOp = (UpdateOp) obj;
            int i = this.cmd;
            if (i != updateOp.cmd) {
                return false;
            }
            if (i == 8 && Math.abs(this.itemCount - this.positionStart) == 1 && this.itemCount == updateOp.positionStart && this.positionStart == updateOp.itemCount) {
                return true;
            }
            if (this.itemCount != updateOp.itemCount || this.positionStart != updateOp.positionStart) {
                return false;
            }
            Object obj2 = this.payload;
            if (obj2 != null) {
                if (!obj2.equals(updateOp.payload)) {
                    return false;
                }
            } else if (updateOp.payload != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.cmd * 31) + this.positionStart) * 31) + this.itemCount;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append("[");
            sb2.append(cmdToString());
            sb2.append(",s:");
            sb2.append(this.positionStart);
            sb2.append("c:");
            sb2.append(this.itemCount);
            sb2.append(",p:");
            return a.m(sb2, this.payload, "]");
        }
    }

    public AdapterHelper(Callback callback) {
        this(callback, false);
    }

    private void applyAdd(UpdateOp updateOp) {
        postponeAndUpdateViewHolders(updateOp);
    }

    private void applyMove(UpdateOp updateOp) {
        postponeAndUpdateViewHolders(updateOp);
    }

    private void applyRemove(UpdateOp updateOp) {
        boolean z4;
        byte b8;
        int i = updateOp.positionStart;
        int i4 = updateOp.itemCount + i;
        byte b10 = -1;
        int i6 = i;
        int i10 = 0;
        while (i6 < i4) {
            if (this.mCallback.findViewHolder(i6) != null || canFindInPreLayout(i6)) {
                if (b10 == 0) {
                    dispatchAndUpdateViewHolders(obtainUpdateOp(2, i, i10, null));
                    z4 = true;
                } else {
                    z4 = false;
                }
                b8 = 1;
            } else {
                if (b10 == 1) {
                    postponeAndUpdateViewHolders(obtainUpdateOp(2, i, i10, null));
                    z4 = true;
                } else {
                    z4 = false;
                }
                b8 = 0;
            }
            if (z4) {
                i6 -= i10;
                i4 -= i10;
                i10 = 1;
            } else {
                i10++;
            }
            i6++;
            b10 = b8;
        }
        if (i10 != updateOp.itemCount) {
            recycleUpdateOp(updateOp);
            updateOp = obtainUpdateOp(2, i, i10, null);
        }
        if (b10 == 0) {
            dispatchAndUpdateViewHolders(updateOp);
        } else {
            postponeAndUpdateViewHolders(updateOp);
        }
    }

    private void applyUpdate(UpdateOp updateOp) {
        int i = updateOp.positionStart;
        int i4 = updateOp.itemCount + i;
        int i6 = 0;
        byte b8 = -1;
        int i10 = i;
        while (i < i4) {
            if (this.mCallback.findViewHolder(i) != null || canFindInPreLayout(i)) {
                if (b8 == 0) {
                    dispatchAndUpdateViewHolders(obtainUpdateOp(4, i10, i6, updateOp.payload));
                    i10 = i;
                    i6 = 0;
                }
                b8 = 1;
            } else {
                if (b8 == 1) {
                    postponeAndUpdateViewHolders(obtainUpdateOp(4, i10, i6, updateOp.payload));
                    i10 = i;
                    i6 = 0;
                }
                b8 = 0;
            }
            i6++;
            i++;
        }
        if (i6 != updateOp.itemCount) {
            Object obj = updateOp.payload;
            recycleUpdateOp(updateOp);
            updateOp = obtainUpdateOp(4, i10, i6, obj);
        }
        if (b8 == 0) {
            dispatchAndUpdateViewHolders(updateOp);
        } else {
            postponeAndUpdateViewHolders(updateOp);
        }
    }

    private boolean canFindInPreLayout(int i) {
        int size = this.mPostponedList.size();
        for (int i4 = 0; i4 < size; i4++) {
            UpdateOp updateOp = this.mPostponedList.get(i4);
            int i6 = updateOp.cmd;
            if (i6 == 8) {
                if (findPositionOffset(updateOp.itemCount, i4 + 1) == i) {
                    return true;
                }
            } else if (i6 == 1) {
                int i10 = updateOp.positionStart;
                int i11 = updateOp.itemCount + i10;
                while (i10 < i11) {
                    if (findPositionOffset(i10, i4 + 1) == i) {
                        return true;
                    }
                    i10++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void dispatchAndUpdateViewHolders(UpdateOp updateOp) {
        int i;
        int i4 = updateOp.cmd;
        if (i4 == 1 || i4 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iUpdatePositionWithPostponed = updatePositionWithPostponed(updateOp.positionStart, i4);
        int i6 = updateOp.positionStart;
        int i10 = updateOp.cmd;
        if (i10 == 2) {
            i = 0;
        } else {
            if (i10 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + updateOp);
            }
            i = 1;
        }
        int i11 = 1;
        for (int i12 = 1; i12 < updateOp.itemCount; i12++) {
            int iUpdatePositionWithPostponed2 = updatePositionWithPostponed((i * i12) + updateOp.positionStart, updateOp.cmd);
            int i13 = updateOp.cmd;
            if (i13 == 2 ? iUpdatePositionWithPostponed2 != iUpdatePositionWithPostponed : !(i13 == 4 && iUpdatePositionWithPostponed2 == iUpdatePositionWithPostponed + 1)) {
                UpdateOp updateOpObtainUpdateOp = obtainUpdateOp(i13, iUpdatePositionWithPostponed, i11, updateOp.payload);
                dispatchFirstPassAndUpdateViewHolders(updateOpObtainUpdateOp, i6);
                recycleUpdateOp(updateOpObtainUpdateOp);
                if (updateOp.cmd == 4) {
                    i6 += i11;
                }
                i11 = 1;
                iUpdatePositionWithPostponed = iUpdatePositionWithPostponed2;
            } else {
                i11++;
            }
        }
        Object obj = updateOp.payload;
        recycleUpdateOp(updateOp);
        if (i11 > 0) {
            UpdateOp updateOpObtainUpdateOp2 = obtainUpdateOp(updateOp.cmd, iUpdatePositionWithPostponed, i11, obj);
            dispatchFirstPassAndUpdateViewHolders(updateOpObtainUpdateOp2, i6);
            recycleUpdateOp(updateOpObtainUpdateOp2);
        }
    }

    private void postponeAndUpdateViewHolders(UpdateOp updateOp) {
        this.mPostponedList.add(updateOp);
        int i = updateOp.cmd;
        if (i == 1) {
            this.mCallback.offsetPositionsForAdd(updateOp.positionStart, updateOp.itemCount);
            return;
        }
        if (i == 2) {
            this.mCallback.offsetPositionsForRemovingLaidOutOrNewView(updateOp.positionStart, updateOp.itemCount);
            return;
        }
        if (i == 4) {
            this.mCallback.markViewHoldersUpdated(updateOp.positionStart, updateOp.itemCount, updateOp.payload);
        } else if (i == 8) {
            this.mCallback.offsetPositionsForMove(updateOp.positionStart, updateOp.itemCount);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + updateOp);
        }
    }

    private int updatePositionWithPostponed(int i, int i4) {
        int i6;
        int i10;
        for (int size = this.mPostponedList.size() - 1; size >= 0; size--) {
            UpdateOp updateOp = this.mPostponedList.get(size);
            int i11 = updateOp.cmd;
            if (i11 == 8) {
                int i12 = updateOp.positionStart;
                int i13 = updateOp.itemCount;
                if (i12 < i13) {
                    i10 = i12;
                    i6 = i13;
                } else {
                    i6 = i12;
                    i10 = i13;
                }
                if (i < i10 || i > i6) {
                    if (i < i12) {
                        if (i4 == 1) {
                            updateOp.positionStart = i12 + 1;
                            updateOp.itemCount = i13 + 1;
                        } else if (i4 == 2) {
                            updateOp.positionStart = i12 - 1;
                            updateOp.itemCount = i13 - 1;
                        }
                    }
                } else if (i10 == i12) {
                    if (i4 == 1) {
                        updateOp.itemCount = i13 + 1;
                    } else if (i4 == 2) {
                        updateOp.itemCount = i13 - 1;
                    }
                    i++;
                } else {
                    if (i4 == 1) {
                        updateOp.positionStart = i12 + 1;
                    } else if (i4 == 2) {
                        updateOp.positionStart = i12 - 1;
                    }
                    i--;
                }
            } else {
                int i14 = updateOp.positionStart;
                if (i14 <= i) {
                    if (i11 == 1) {
                        i -= updateOp.itemCount;
                    } else if (i11 == 2) {
                        i += updateOp.itemCount;
                    }
                } else if (i4 == 1) {
                    updateOp.positionStart = i14 + 1;
                } else if (i4 == 2) {
                    updateOp.positionStart = i14 - 1;
                }
            }
        }
        for (int size2 = this.mPostponedList.size() - 1; size2 >= 0; size2--) {
            UpdateOp updateOp2 = this.mPostponedList.get(size2);
            if (updateOp2.cmd == 8) {
                int i15 = updateOp2.itemCount;
                if (i15 == updateOp2.positionStart || i15 < 0) {
                    this.mPostponedList.remove(size2);
                    recycleUpdateOp(updateOp2);
                }
            } else if (updateOp2.itemCount <= 0) {
                this.mPostponedList.remove(size2);
                recycleUpdateOp(updateOp2);
            }
        }
        return i;
    }

    public AdapterHelper addUpdateOp(UpdateOp... updateOpArr) {
        Collections.addAll(this.mPendingUpdates, updateOpArr);
        return this;
    }

    public int applyPendingUpdatesToPosition(int i) {
        int size = this.mPendingUpdates.size();
        for (int i4 = 0; i4 < size; i4++) {
            UpdateOp updateOp = this.mPendingUpdates.get(i4);
            int i6 = updateOp.cmd;
            if (i6 != 1) {
                if (i6 == 2) {
                    int i10 = updateOp.positionStart;
                    if (i10 <= i) {
                        int i11 = updateOp.itemCount;
                        if (i10 + i11 > i) {
                            return -1;
                        }
                        i -= i11;
                    } else {
                        continue;
                    }
                } else if (i6 == 8) {
                    int i12 = updateOp.positionStart;
                    if (i12 == i) {
                        i = updateOp.itemCount;
                    } else {
                        if (i12 < i) {
                            i--;
                        }
                        if (updateOp.itemCount <= i) {
                            i++;
                        }
                    }
                }
            } else if (updateOp.positionStart <= i) {
                i += updateOp.itemCount;
            }
        }
        return i;
    }

    public void consumePostponedUpdates() {
        int size = this.mPostponedList.size();
        for (int i = 0; i < size; i++) {
            this.mCallback.onDispatchSecondPass(this.mPostponedList.get(i));
        }
        recycleUpdateOpsAndClearList(this.mPostponedList);
        this.mExistingUpdateTypes = 0;
    }

    public void consumeUpdatesInOnePass() {
        consumePostponedUpdates();
        int size = this.mPendingUpdates.size();
        for (int i = 0; i < size; i++) {
            UpdateOp updateOp = this.mPendingUpdates.get(i);
            int i4 = updateOp.cmd;
            if (i4 == 1) {
                this.mCallback.onDispatchSecondPass(updateOp);
                this.mCallback.offsetPositionsForAdd(updateOp.positionStart, updateOp.itemCount);
            } else if (i4 == 2) {
                this.mCallback.onDispatchSecondPass(updateOp);
                this.mCallback.offsetPositionsForRemovingInvisible(updateOp.positionStart, updateOp.itemCount);
            } else if (i4 == 4) {
                this.mCallback.onDispatchSecondPass(updateOp);
                this.mCallback.markViewHoldersUpdated(updateOp.positionStart, updateOp.itemCount, updateOp.payload);
            } else if (i4 == 8) {
                this.mCallback.onDispatchSecondPass(updateOp);
                this.mCallback.offsetPositionsForMove(updateOp.positionStart, updateOp.itemCount);
            }
            Runnable runnable = this.mOnItemProcessedCallback;
            if (runnable != null) {
                runnable.run();
            }
        }
        recycleUpdateOpsAndClearList(this.mPendingUpdates);
        this.mExistingUpdateTypes = 0;
    }

    public void dispatchFirstPassAndUpdateViewHolders(UpdateOp updateOp, int i) {
        this.mCallback.onDispatchFirstPass(updateOp);
        int i4 = updateOp.cmd;
        if (i4 == 2) {
            this.mCallback.offsetPositionsForRemovingInvisible(i, updateOp.itemCount);
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.mCallback.markViewHoldersUpdated(i, updateOp.itemCount, updateOp.payload);
        }
    }

    public int findPositionOffset(int i) {
        return findPositionOffset(i, 0);
    }

    public boolean hasAnyUpdateTypes(int i) {
        return (i & this.mExistingUpdateTypes) != 0;
    }

    public boolean hasPendingUpdates() {
        return this.mPendingUpdates.size() > 0;
    }

    public boolean hasUpdates() {
        return (this.mPostponedList.isEmpty() || this.mPendingUpdates.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.OpReorderer.Callback
    public UpdateOp obtainUpdateOp(int i, int i4, int i6, Object obj) {
        UpdateOp updateOpAcquire = this.mUpdateOpPool.acquire();
        if (updateOpAcquire == null) {
            return new UpdateOp(i, i4, i6, obj);
        }
        updateOpAcquire.cmd = i;
        updateOpAcquire.positionStart = i4;
        updateOpAcquire.itemCount = i6;
        updateOpAcquire.payload = obj;
        return updateOpAcquire;
    }

    public boolean onItemRangeChanged(int i, int i4, Object obj) {
        if (i4 < 1) {
            return false;
        }
        this.mPendingUpdates.add(obtainUpdateOp(4, i, i4, obj));
        this.mExistingUpdateTypes |= 4;
        return this.mPendingUpdates.size() == 1;
    }

    public boolean onItemRangeInserted(int i, int i4) {
        if (i4 < 1) {
            return false;
        }
        this.mPendingUpdates.add(obtainUpdateOp(1, i, i4, null));
        this.mExistingUpdateTypes |= 1;
        return this.mPendingUpdates.size() == 1;
    }

    public boolean onItemRangeMoved(int i, int i4, int i6) {
        if (i == i4) {
            return false;
        }
        if (i6 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.mPendingUpdates.add(obtainUpdateOp(8, i, i4, null));
        this.mExistingUpdateTypes |= 8;
        return this.mPendingUpdates.size() == 1;
    }

    public boolean onItemRangeRemoved(int i, int i4) {
        if (i4 < 1) {
            return false;
        }
        this.mPendingUpdates.add(obtainUpdateOp(2, i, i4, null));
        this.mExistingUpdateTypes |= 2;
        return this.mPendingUpdates.size() == 1;
    }

    public void preProcess() {
        this.mOpReorderer.reorderOps(this.mPendingUpdates);
        int size = this.mPendingUpdates.size();
        for (int i = 0; i < size; i++) {
            UpdateOp updateOp = this.mPendingUpdates.get(i);
            int i4 = updateOp.cmd;
            if (i4 == 1) {
                applyAdd(updateOp);
            } else if (i4 == 2) {
                applyRemove(updateOp);
            } else if (i4 == 4) {
                applyUpdate(updateOp);
            } else if (i4 == 8) {
                applyMove(updateOp);
            }
            Runnable runnable = this.mOnItemProcessedCallback;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.mPendingUpdates.clear();
    }

    @Override // androidx.recyclerview.widget.OpReorderer.Callback
    public void recycleUpdateOp(UpdateOp updateOp) {
        if (this.mDisableRecycler) {
            return;
        }
        updateOp.payload = null;
        this.mUpdateOpPool.release(updateOp);
    }

    public void recycleUpdateOpsAndClearList(List<UpdateOp> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            recycleUpdateOp(list.get(i));
        }
        list.clear();
    }

    public void reset() {
        recycleUpdateOpsAndClearList(this.mPendingUpdates);
        recycleUpdateOpsAndClearList(this.mPostponedList);
        this.mExistingUpdateTypes = 0;
    }

    public AdapterHelper(Callback callback, boolean z4) {
        this.mUpdateOpPool = new Pools.SimplePool(30);
        this.mPendingUpdates = new ArrayList<>();
        this.mPostponedList = new ArrayList<>();
        this.mExistingUpdateTypes = 0;
        this.mCallback = callback;
        this.mDisableRecycler = z4;
        this.mOpReorderer = new OpReorderer(this);
    }

    public int findPositionOffset(int i, int i4) {
        int size = this.mPostponedList.size();
        while (i4 < size) {
            UpdateOp updateOp = this.mPostponedList.get(i4);
            int i6 = updateOp.cmd;
            if (i6 == 8) {
                int i10 = updateOp.positionStart;
                if (i10 == i) {
                    i = updateOp.itemCount;
                } else {
                    if (i10 < i) {
                        i--;
                    }
                    if (updateOp.itemCount <= i) {
                        i++;
                    }
                }
            } else {
                int i11 = updateOp.positionStart;
                if (i11 > i) {
                    continue;
                } else if (i6 == 2) {
                    int i12 = updateOp.itemCount;
                    if (i < i11 + i12) {
                        return -1;
                    }
                    i -= i12;
                } else if (i6 == 1) {
                    i += updateOp.itemCount;
                }
            }
            i4++;
        }
        return i;
    }
}
