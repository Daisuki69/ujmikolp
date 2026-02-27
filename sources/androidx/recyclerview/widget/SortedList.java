package androidx.recyclerview.widget;

import We.s;
import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public class SortedList<T> {
    private static final int CAPACITY_GROWTH = 10;
    private static final int DELETION = 2;
    private static final int INSERTION = 1;
    public static final int INVALID_POSITION = -1;
    private static final int LOOKUP = 4;
    private static final int MIN_CAPACITY = 10;
    private BatchedCallback mBatchedCallback;
    private Callback mCallback;
    T[] mData;
    private int mNewDataStart;
    private T[] mOldData;
    private int mOldDataSize;
    private int mOldDataStart;
    private int mSize;
    private final Class<T> mTClass;

    public static class BatchedCallback<T2> extends Callback<T2> {
        private final BatchingListUpdateCallback mBatchingListUpdateCallback;
        final Callback<T2> mWrappedCallback;

        @SuppressLint({"UnknownNullness"})
        public BatchedCallback(Callback<T2> callback) {
            this.mWrappedCallback = callback;
            this.mBatchingListUpdateCallback = new BatchingListUpdateCallback(callback);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public boolean areContentsTheSame(T2 t22, T2 t23) {
            return this.mWrappedCallback.areContentsTheSame(t22, t23);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public boolean areItemsTheSame(T2 t22, T2 t23) {
            return this.mWrappedCallback.areItemsTheSame(t22, t23);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback, java.util.Comparator
        public int compare(T2 t22, T2 t23) {
            return this.mWrappedCallback.compare(t22, t23);
        }

        public void dispatchLastEvent() {
            this.mBatchingListUpdateCallback.dispatchLastEvent();
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        @Nullable
        public Object getChangePayload(T2 t22, T2 t23) {
            return this.mWrappedCallback.getChangePayload(t22, t23);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public void onChanged(int i, int i4) {
            this.mBatchingListUpdateCallback.onChanged(i, i4, null);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onInserted(int i, int i4) {
            this.mBatchingListUpdateCallback.onInserted(i, i4);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onMoved(int i, int i4) {
            this.mBatchingListUpdateCallback.onMoved(i, i4);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onRemoved(int i, int i4) {
            this.mBatchingListUpdateCallback.onRemoved(i, i4);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback, androidx.recyclerview.widget.ListUpdateCallback
        @SuppressLint({"UnknownNullness"})
        public void onChanged(int i, int i4, Object obj) {
            this.mBatchingListUpdateCallback.onChanged(i, i4, obj);
        }
    }

    public static abstract class Callback<T2> implements Comparator<T2>, ListUpdateCallback {
        public abstract boolean areContentsTheSame(T2 t22, T2 t23);

        public abstract boolean areItemsTheSame(T2 t22, T2 t23);

        @Override // java.util.Comparator
        public abstract int compare(T2 t22, T2 t23);

        @Nullable
        public Object getChangePayload(T2 t22, T2 t23) {
            return null;
        }

        public abstract void onChanged(int i, int i4);

        @SuppressLint({"UnknownNullness"})
        public void onChanged(int i, int i4, Object obj) {
            onChanged(i, i4);
        }
    }

    public SortedList(@NonNull Class<T> cls, @NonNull Callback<T> callback) {
        this(cls, callback, 10);
    }

    private void addAllInternal(T[] tArr) {
        if (tArr.length < 1) {
            return;
        }
        int iSortAndDedup = sortAndDedup(tArr);
        if (this.mSize != 0) {
            merge(tArr, iSortAndDedup);
            return;
        }
        this.mData = tArr;
        this.mSize = iSortAndDedup;
        this.mCallback.onInserted(0, iSortAndDedup);
    }

    private void addToData(int i, T t5) {
        int i4 = this.mSize;
        if (i > i4) {
            StringBuilder sbT = s.t(i, "cannot add item to ", " because size is ");
            sbT.append(this.mSize);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
        T[] tArr = this.mData;
        if (i4 == tArr.length) {
            T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.mTClass, tArr.length + 10));
            System.arraycopy(this.mData, 0, tArr2, 0, i);
            tArr2[i] = t5;
            System.arraycopy(this.mData, i, tArr2, i + 1, this.mSize - i);
            this.mData = tArr2;
        } else {
            System.arraycopy(tArr, i, tArr, i + 1, i4 - i);
            this.mData[i] = t5;
        }
        this.mSize++;
    }

    private T[] copyArray(T[] tArr) {
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.mTClass, tArr.length));
        System.arraycopy(tArr, 0, tArr2, 0, tArr.length);
        return tArr2;
    }

    private int findIndexOf(T t5, T[] tArr, int i, int i4, int i6) {
        while (i < i4) {
            int i10 = (i + i4) / 2;
            T t10 = tArr[i10];
            int iCompare = this.mCallback.compare(t10, t5);
            if (iCompare < 0) {
                i = i10 + 1;
            } else {
                if (iCompare == 0) {
                    if (!this.mCallback.areItemsTheSame(t10, t5)) {
                        int iLinearEqualitySearch = linearEqualitySearch(t5, i10, i, i4);
                        if (i6 != 1 || iLinearEqualitySearch != -1) {
                            return iLinearEqualitySearch;
                        }
                    }
                    return i10;
                }
                i4 = i10;
            }
        }
        if (i6 == 1) {
            return i;
        }
        return -1;
    }

    private int findSameItem(T t5, T[] tArr, int i, int i4) {
        while (i < i4) {
            if (this.mCallback.areItemsTheSame(tArr[i], t5)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private int linearEqualitySearch(T t5, int i, int i4, int i6) {
        T t10;
        for (int i10 = i - 1; i10 >= i4; i10--) {
            T t11 = this.mData[i10];
            if (this.mCallback.compare(t11, t5) != 0) {
                break;
            }
            if (this.mCallback.areItemsTheSame(t11, t5)) {
                return i10;
            }
        }
        do {
            i++;
            if (i >= i6) {
                return -1;
            }
            t10 = this.mData[i];
            if (this.mCallback.compare(t10, t5) != 0) {
                return -1;
            }
        } while (!this.mCallback.areItemsTheSame(t10, t5));
        return i;
    }

    private void merge(T[] tArr, int i) {
        boolean z4 = this.mCallback instanceof BatchedCallback;
        if (!z4) {
            beginBatchedUpdates();
        }
        this.mOldData = this.mData;
        int i4 = 0;
        this.mOldDataStart = 0;
        int i6 = this.mSize;
        this.mOldDataSize = i6;
        this.mData = (T[]) ((Object[]) Array.newInstance((Class<?>) this.mTClass, i6 + i + 10));
        this.mNewDataStart = 0;
        while (true) {
            int i10 = this.mOldDataStart;
            int i11 = this.mOldDataSize;
            if (i10 >= i11 && i4 >= i) {
                break;
            }
            if (i10 == i11) {
                int i12 = i - i4;
                System.arraycopy(tArr, i4, this.mData, this.mNewDataStart, i12);
                int i13 = this.mNewDataStart + i12;
                this.mNewDataStart = i13;
                this.mSize += i12;
                this.mCallback.onInserted(i13 - i12, i12);
                break;
            }
            if (i4 == i) {
                int i14 = i11 - i10;
                System.arraycopy(this.mOldData, i10, this.mData, this.mNewDataStart, i14);
                this.mNewDataStart += i14;
                break;
            }
            T t5 = this.mOldData[i10];
            T t10 = tArr[i4];
            int iCompare = this.mCallback.compare(t5, t10);
            if (iCompare > 0) {
                T[] tArr2 = this.mData;
                int i15 = this.mNewDataStart;
                this.mNewDataStart = i15 + 1;
                tArr2[i15] = t10;
                this.mSize++;
                i4++;
                this.mCallback.onInserted(i15, 1);
            } else if (iCompare == 0 && this.mCallback.areItemsTheSame(t5, t10)) {
                T[] tArr3 = this.mData;
                int i16 = this.mNewDataStart;
                this.mNewDataStart = i16 + 1;
                tArr3[i16] = t10;
                i4++;
                this.mOldDataStart++;
                if (!this.mCallback.areContentsTheSame(t5, t10)) {
                    Callback callback = this.mCallback;
                    callback.onChanged(this.mNewDataStart - 1, 1, callback.getChangePayload(t5, t10));
                }
            } else {
                T[] tArr4 = this.mData;
                int i17 = this.mNewDataStart;
                this.mNewDataStart = i17 + 1;
                tArr4[i17] = t5;
                this.mOldDataStart++;
            }
        }
        this.mOldData = null;
        if (z4) {
            return;
        }
        endBatchedUpdates();
    }

    private void removeItemAtIndex(int i, boolean z4) {
        T[] tArr = this.mData;
        System.arraycopy(tArr, i + 1, tArr, i, (this.mSize - i) - 1);
        int i4 = this.mSize - 1;
        this.mSize = i4;
        this.mData[i4] = null;
        if (z4) {
            this.mCallback.onRemoved(i, 1);
        }
    }

    private void replaceAllInsert(T t5) {
        T[] tArr = this.mData;
        int i = this.mNewDataStart;
        tArr[i] = t5;
        this.mNewDataStart = i + 1;
        this.mSize++;
        this.mCallback.onInserted(i, 1);
    }

    private void replaceAllInternal(@NonNull T[] tArr) {
        boolean z4 = this.mCallback instanceof BatchedCallback;
        if (!z4) {
            beginBatchedUpdates();
        }
        this.mOldDataStart = 0;
        this.mOldDataSize = this.mSize;
        this.mOldData = this.mData;
        this.mNewDataStart = 0;
        int iSortAndDedup = sortAndDedup(tArr);
        this.mData = (T[]) ((Object[]) Array.newInstance((Class<?>) this.mTClass, iSortAndDedup));
        while (true) {
            int i = this.mNewDataStart;
            if (i >= iSortAndDedup && this.mOldDataStart >= this.mOldDataSize) {
                break;
            }
            int i4 = this.mOldDataStart;
            int i6 = this.mOldDataSize;
            if (i4 >= i6) {
                int i10 = iSortAndDedup - i;
                System.arraycopy(tArr, i, this.mData, i, i10);
                this.mNewDataStart += i10;
                this.mSize += i10;
                this.mCallback.onInserted(i, i10);
                break;
            }
            if (i >= iSortAndDedup) {
                int i11 = i6 - i4;
                this.mSize -= i11;
                this.mCallback.onRemoved(i, i11);
                break;
            }
            T t5 = this.mOldData[i4];
            T t10 = tArr[i];
            int iCompare = this.mCallback.compare(t5, t10);
            if (iCompare < 0) {
                replaceAllRemove();
            } else if (iCompare > 0) {
                replaceAllInsert(t10);
            } else if (this.mCallback.areItemsTheSame(t5, t10)) {
                T[] tArr2 = this.mData;
                int i12 = this.mNewDataStart;
                tArr2[i12] = t10;
                this.mOldDataStart++;
                this.mNewDataStart = i12 + 1;
                if (!this.mCallback.areContentsTheSame(t5, t10)) {
                    Callback callback = this.mCallback;
                    callback.onChanged(this.mNewDataStart - 1, 1, callback.getChangePayload(t5, t10));
                }
            } else {
                replaceAllRemove();
                replaceAllInsert(t10);
            }
        }
        this.mOldData = null;
        if (z4) {
            return;
        }
        endBatchedUpdates();
    }

    private void replaceAllRemove() {
        this.mSize--;
        this.mOldDataStart++;
        this.mCallback.onRemoved(this.mNewDataStart, 1);
    }

    private int sortAndDedup(@NonNull T[] tArr) {
        if (tArr.length == 0) {
            return 0;
        }
        Arrays.sort(tArr, this.mCallback);
        int i = 0;
        int i4 = 1;
        for (int i6 = 1; i6 < tArr.length; i6++) {
            T t5 = tArr[i6];
            if (this.mCallback.compare(tArr[i], t5) == 0) {
                int iFindSameItem = findSameItem(t5, tArr, i, i4);
                if (iFindSameItem != -1) {
                    tArr[iFindSameItem] = t5;
                } else {
                    if (i4 != i6) {
                        tArr[i4] = t5;
                    }
                    i4++;
                }
            } else {
                if (i4 != i6) {
                    tArr[i4] = t5;
                }
                i = i4;
                i4++;
            }
        }
        return i4;
    }

    private void throwIfInMutationOperation() {
        if (this.mOldData != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    public int add(T t5) {
        throwIfInMutationOperation();
        return add(t5, true);
    }

    public void addAll(@NonNull T[] tArr, boolean z4) {
        throwIfInMutationOperation();
        if (tArr.length == 0) {
            return;
        }
        if (z4) {
            addAllInternal(tArr);
        } else {
            addAllInternal(copyArray(tArr));
        }
    }

    public void beginBatchedUpdates() {
        throwIfInMutationOperation();
        Callback callback = this.mCallback;
        if (callback instanceof BatchedCallback) {
            return;
        }
        if (this.mBatchedCallback == null) {
            this.mBatchedCallback = new BatchedCallback(callback);
        }
        this.mCallback = this.mBatchedCallback;
    }

    public void clear() {
        throwIfInMutationOperation();
        int i = this.mSize;
        if (i == 0) {
            return;
        }
        Arrays.fill(this.mData, 0, i, (Object) null);
        this.mSize = 0;
        this.mCallback.onRemoved(0, i);
    }

    public void endBatchedUpdates() {
        throwIfInMutationOperation();
        Callback callback = this.mCallback;
        if (callback instanceof BatchedCallback) {
            ((BatchedCallback) callback).dispatchLastEvent();
        }
        Callback callback2 = this.mCallback;
        BatchedCallback batchedCallback = this.mBatchedCallback;
        if (callback2 == batchedCallback) {
            this.mCallback = batchedCallback.mWrappedCallback;
        }
    }

    public T get(int i) throws IndexOutOfBoundsException {
        int i4;
        if (i < this.mSize && i >= 0) {
            T[] tArr = this.mOldData;
            return (tArr == null || i < (i4 = this.mNewDataStart)) ? this.mData[i] : tArr[(i - i4) + this.mOldDataStart];
        }
        StringBuilder sbT = s.t(i, "Asked to get item at ", " but size is ");
        sbT.append(this.mSize);
        throw new IndexOutOfBoundsException(sbT.toString());
    }

    public int indexOf(T t5) {
        if (this.mOldData == null) {
            return findIndexOf(t5, this.mData, 0, this.mSize, 4);
        }
        int iFindIndexOf = findIndexOf(t5, this.mData, 0, this.mNewDataStart, 4);
        if (iFindIndexOf != -1) {
            return iFindIndexOf;
        }
        int iFindIndexOf2 = findIndexOf(t5, this.mOldData, this.mOldDataStart, this.mOldDataSize, 4);
        if (iFindIndexOf2 != -1) {
            return (iFindIndexOf2 - this.mOldDataStart) + this.mNewDataStart;
        }
        return -1;
    }

    public void recalculatePositionOfItemAt(int i) {
        throwIfInMutationOperation();
        T t5 = get(i);
        removeItemAtIndex(i, false);
        int iAdd = add(t5, false);
        if (i != iAdd) {
            this.mCallback.onMoved(i, iAdd);
        }
    }

    public boolean remove(T t5) {
        throwIfInMutationOperation();
        return remove(t5, true);
    }

    public T removeItemAt(int i) {
        throwIfInMutationOperation();
        T t5 = get(i);
        removeItemAtIndex(i, true);
        return t5;
    }

    public void replaceAll(@NonNull T[] tArr, boolean z4) {
        throwIfInMutationOperation();
        if (z4) {
            replaceAllInternal(tArr);
        } else {
            replaceAllInternal(copyArray(tArr));
        }
    }

    public int size() {
        return this.mSize;
    }

    public void updateItemAt(int i, T t5) {
        throwIfInMutationOperation();
        T t10 = get(i);
        boolean z4 = t10 == t5 || !this.mCallback.areContentsTheSame(t10, t5);
        if (t10 != t5 && this.mCallback.compare(t10, t5) == 0) {
            this.mData[i] = t5;
            if (z4) {
                Callback callback = this.mCallback;
                callback.onChanged(i, 1, callback.getChangePayload(t10, t5));
                return;
            }
            return;
        }
        if (z4) {
            Callback callback2 = this.mCallback;
            callback2.onChanged(i, 1, callback2.getChangePayload(t10, t5));
        }
        removeItemAtIndex(i, false);
        int iAdd = add(t5, false);
        if (i != iAdd) {
            this.mCallback.onMoved(i, iAdd);
        }
    }

    public SortedList(@NonNull Class<T> cls, @NonNull Callback<T> callback, int i) {
        this.mTClass = cls;
        this.mData = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i));
        this.mCallback = callback;
        this.mSize = 0;
    }

    private int add(T t5, boolean z4) {
        int iFindIndexOf = findIndexOf(t5, this.mData, 0, this.mSize, 1);
        if (iFindIndexOf == -1) {
            iFindIndexOf = 0;
        } else if (iFindIndexOf < this.mSize) {
            T t10 = this.mData[iFindIndexOf];
            if (this.mCallback.areItemsTheSame(t10, t5)) {
                if (this.mCallback.areContentsTheSame(t10, t5)) {
                    this.mData[iFindIndexOf] = t5;
                    return iFindIndexOf;
                }
                this.mData[iFindIndexOf] = t5;
                Callback callback = this.mCallback;
                callback.onChanged(iFindIndexOf, 1, callback.getChangePayload(t10, t5));
                return iFindIndexOf;
            }
        }
        addToData(iFindIndexOf, t5);
        if (z4) {
            this.mCallback.onInserted(iFindIndexOf, 1);
        }
        return iFindIndexOf;
    }

    private boolean remove(T t5, boolean z4) {
        int iFindIndexOf = findIndexOf(t5, this.mData, 0, this.mSize, 2);
        if (iFindIndexOf == -1) {
            return false;
        }
        removeItemAtIndex(iFindIndexOf, z4);
        return true;
    }

    public void replaceAll(@NonNull T... tArr) {
        replaceAll(tArr, false);
    }

    public void addAll(@NonNull T... tArr) {
        addAll(tArr, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void replaceAll(@NonNull Collection<T> collection) {
        replaceAll(collection.toArray((Object[]) Array.newInstance((Class<?>) this.mTClass, collection.size())), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addAll(@NonNull Collection<T> collection) {
        addAll(collection.toArray((Object[]) Array.newInstance((Class<?>) this.mTClass, collection.size())), true);
    }
}
