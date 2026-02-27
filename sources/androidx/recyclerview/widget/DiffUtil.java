package androidx.recyclerview.widget;

import We.s;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class DiffUtil {
    private static final Comparator<Diagonal> DIAGONAL_COMPARATOR = new Comparator<Diagonal>() { // from class: androidx.recyclerview.widget.DiffUtil.1
        @Override // java.util.Comparator
        public int compare(Diagonal diagonal, Diagonal diagonal2) {
            return diagonal.f8172x - diagonal2.f8172x;
        }
    };

    public static abstract class Callback {
        public abstract boolean areContentsTheSame(int i, int i4);

        public abstract boolean areItemsTheSame(int i, int i4);

        @Nullable
        public Object getChangePayload(int i, int i4) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    public static class CenteredArray {
        private final int[] mData;
        private final int mMid;

        public CenteredArray(int i) {
            int[] iArr = new int[i];
            this.mData = iArr;
            this.mMid = iArr.length / 2;
        }

        public int[] backingData() {
            return this.mData;
        }

        public void fill(int i) {
            Arrays.fill(this.mData, i);
        }

        public int get(int i) {
            return this.mData[i + this.mMid];
        }

        public void set(int i, int i4) {
            this.mData[i + this.mMid] = i4;
        }
    }

    public static class Diagonal {
        public final int size;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final int f8172x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final int f8173y;

        public Diagonal(int i, int i4, int i6) {
            this.f8172x = i;
            this.f8173y = i4;
            this.size = i6;
        }

        public int endX() {
            return this.f8172x + this.size;
        }

        public int endY() {
            return this.f8173y + this.size;
        }
    }

    public static class DiffResult {
        private static final int FLAG_CHANGED = 2;
        private static final int FLAG_MASK = 15;
        private static final int FLAG_MOVED = 12;
        private static final int FLAG_MOVED_CHANGED = 4;
        private static final int FLAG_MOVED_NOT_CHANGED = 8;
        private static final int FLAG_NOT_CHANGED = 1;
        private static final int FLAG_OFFSET = 4;
        public static final int NO_POSITION = -1;
        private final Callback mCallback;
        private final boolean mDetectMoves;
        private final List<Diagonal> mDiagonals;
        private final int[] mNewItemStatuses;
        private final int mNewListSize;
        private final int[] mOldItemStatuses;
        private final int mOldListSize;

        public DiffResult(Callback callback, List<Diagonal> list, int[] iArr, int[] iArr2, boolean z4) {
            this.mDiagonals = list;
            this.mOldItemStatuses = iArr;
            this.mNewItemStatuses = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.mCallback = callback;
            this.mOldListSize = callback.getOldListSize();
            this.mNewListSize = callback.getNewListSize();
            this.mDetectMoves = z4;
            addEdgeDiagonals();
            findMatchingItems();
        }

        private void addEdgeDiagonals() {
            Diagonal diagonal = this.mDiagonals.isEmpty() ? null : this.mDiagonals.get(0);
            if (diagonal == null || diagonal.f8172x != 0 || diagonal.f8173y != 0) {
                this.mDiagonals.add(0, new Diagonal(0, 0, 0));
            }
            this.mDiagonals.add(new Diagonal(this.mOldListSize, this.mNewListSize, 0));
        }

        private void findMatchingAddition(int i) {
            int size = this.mDiagonals.size();
            int iEndY = 0;
            for (int i4 = 0; i4 < size; i4++) {
                Diagonal diagonal = this.mDiagonals.get(i4);
                while (iEndY < diagonal.f8173y) {
                    if (this.mNewItemStatuses[iEndY] == 0 && this.mCallback.areItemsTheSame(i, iEndY)) {
                        int i6 = this.mCallback.areContentsTheSame(i, iEndY) ? 8 : 4;
                        this.mOldItemStatuses[i] = (iEndY << 4) | i6;
                        this.mNewItemStatuses[iEndY] = (i << 4) | i6;
                        return;
                    }
                    iEndY++;
                }
                iEndY = diagonal.endY();
            }
        }

        private void findMatchingItems() {
            for (Diagonal diagonal : this.mDiagonals) {
                for (int i = 0; i < diagonal.size; i++) {
                    int i4 = diagonal.f8172x + i;
                    int i6 = diagonal.f8173y + i;
                    int i10 = this.mCallback.areContentsTheSame(i4, i6) ? 1 : 2;
                    this.mOldItemStatuses[i4] = (i6 << 4) | i10;
                    this.mNewItemStatuses[i6] = (i4 << 4) | i10;
                }
            }
            if (this.mDetectMoves) {
                findMoveMatches();
            }
        }

        private void findMoveMatches() {
            int iEndX = 0;
            for (Diagonal diagonal : this.mDiagonals) {
                while (iEndX < diagonal.f8172x) {
                    if (this.mOldItemStatuses[iEndX] == 0) {
                        findMatchingAddition(iEndX);
                    }
                    iEndX++;
                }
                iEndX = diagonal.endX();
            }
        }

        @Nullable
        private static PostponedUpdate getPostponedUpdate(Collection<PostponedUpdate> collection, int i, boolean z4) {
            PostponedUpdate next;
            Iterator<PostponedUpdate> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.posInOwnerList == i && next.removal == z4) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                PostponedUpdate next2 = it.next();
                if (z4) {
                    next2.currentPos--;
                } else {
                    next2.currentPos++;
                }
            }
            return next;
        }

        public int convertNewPositionToOld(@IntRange(from = 0) int i) {
            if (i < 0 || i >= this.mNewListSize) {
                StringBuilder sbT = s.t(i, "Index out of bounds - passed position = ", ", new list size = ");
                sbT.append(this.mNewListSize);
                throw new IndexOutOfBoundsException(sbT.toString());
            }
            int i4 = this.mNewItemStatuses[i];
            if ((i4 & 15) == 0) {
                return -1;
            }
            return i4 >> 4;
        }

        public int convertOldPositionToNew(@IntRange(from = 0) int i) {
            if (i < 0 || i >= this.mOldListSize) {
                StringBuilder sbT = s.t(i, "Index out of bounds - passed position = ", ", old list size = ");
                sbT.append(this.mOldListSize);
                throw new IndexOutOfBoundsException(sbT.toString());
            }
            int i4 = this.mOldItemStatuses[i];
            if ((i4 & 15) == 0) {
                return -1;
            }
            return i4 >> 4;
        }

        public void dispatchUpdatesTo(@NonNull RecyclerView.Adapter adapter) {
            dispatchUpdatesTo(new AdapterListUpdateCallback(adapter));
        }

        public void dispatchUpdatesTo(@NonNull ListUpdateCallback listUpdateCallback) {
            int i;
            BatchingListUpdateCallback batchingListUpdateCallback = listUpdateCallback instanceof BatchingListUpdateCallback ? (BatchingListUpdateCallback) listUpdateCallback : new BatchingListUpdateCallback(listUpdateCallback);
            int i4 = this.mOldListSize;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i6 = this.mOldListSize;
            int i10 = this.mNewListSize;
            for (int size = this.mDiagonals.size() - 1; size >= 0; size--) {
                Diagonal diagonal = this.mDiagonals.get(size);
                int iEndX = diagonal.endX();
                int iEndY = diagonal.endY();
                while (true) {
                    if (i6 <= iEndX) {
                        break;
                    }
                    i6--;
                    int i11 = this.mOldItemStatuses[i6];
                    if ((i11 & 12) != 0) {
                        int i12 = i11 >> 4;
                        PostponedUpdate postponedUpdate = getPostponedUpdate(arrayDeque, i12, false);
                        if (postponedUpdate != null) {
                            int i13 = (i4 - postponedUpdate.currentPos) - 1;
                            batchingListUpdateCallback.onMoved(i6, i13);
                            if ((i11 & 4) != 0) {
                                batchingListUpdateCallback.onChanged(i13, 1, this.mCallback.getChangePayload(i6, i12));
                            }
                        } else {
                            arrayDeque.add(new PostponedUpdate(i6, (i4 - i6) - 1, true));
                        }
                    } else {
                        batchingListUpdateCallback.onRemoved(i6, 1);
                        i4--;
                    }
                }
                while (i10 > iEndY) {
                    i10--;
                    int i14 = this.mNewItemStatuses[i10];
                    if ((i14 & 12) != 0) {
                        int i15 = i14 >> 4;
                        PostponedUpdate postponedUpdate2 = getPostponedUpdate(arrayDeque, i15, true);
                        if (postponedUpdate2 == null) {
                            arrayDeque.add(new PostponedUpdate(i10, i4 - i6, false));
                        } else {
                            batchingListUpdateCallback.onMoved((i4 - postponedUpdate2.currentPos) - 1, i6);
                            if ((i14 & 4) != 0) {
                                batchingListUpdateCallback.onChanged(i6, 1, this.mCallback.getChangePayload(i15, i10));
                            }
                        }
                    } else {
                        batchingListUpdateCallback.onInserted(i6, 1);
                        i4++;
                    }
                }
                int i16 = diagonal.f8172x;
                int i17 = diagonal.f8173y;
                for (i = 0; i < diagonal.size; i++) {
                    if ((this.mOldItemStatuses[i16] & 15) == 2) {
                        batchingListUpdateCallback.onChanged(i16, 1, this.mCallback.getChangePayload(i16, i17));
                    }
                    i16++;
                    i17++;
                }
                i6 = diagonal.f8172x;
                i10 = diagonal.f8173y;
            }
            batchingListUpdateCallback.dispatchLastEvent();
        }
    }

    public static abstract class ItemCallback<T> {
        public abstract boolean areContentsTheSame(@NonNull T t5, @NonNull T t10);

        public abstract boolean areItemsTheSame(@NonNull T t5, @NonNull T t10);

        @Nullable
        public Object getChangePayload(@NonNull T t5, @NonNull T t10) {
            return null;
        }
    }

    public static class PostponedUpdate {
        int currentPos;
        int posInOwnerList;
        boolean removal;

        public PostponedUpdate(int i, int i4, boolean z4) {
            this.posInOwnerList = i;
            this.currentPos = i4;
            this.removal = z4;
        }
    }

    public static class Range {
        int newListEnd;
        int newListStart;
        int oldListEnd;
        int oldListStart;

        public Range() {
        }

        public int newSize() {
            return this.newListEnd - this.newListStart;
        }

        public int oldSize() {
            return this.oldListEnd - this.oldListStart;
        }

        public Range(int i, int i4, int i6, int i10) {
            this.oldListStart = i;
            this.oldListEnd = i4;
            this.newListStart = i6;
            this.newListEnd = i10;
        }
    }

    public static class Snake {
        public int endX;
        public int endY;
        public boolean reverse;
        public int startX;
        public int startY;

        public int diagonalSize() {
            return Math.min(this.endX - this.startX, this.endY - this.startY);
        }

        public boolean hasAdditionOrRemoval() {
            return this.endY - this.startY != this.endX - this.startX;
        }

        public boolean isAddition() {
            return this.endY - this.startY > this.endX - this.startX;
        }

        @NonNull
        public Diagonal toDiagonal() {
            if (hasAdditionOrRemoval()) {
                return this.reverse ? new Diagonal(this.startX, this.startY, diagonalSize()) : isAddition() ? new Diagonal(this.startX, this.startY + 1, diagonalSize()) : new Diagonal(this.startX + 1, this.startY, diagonalSize());
            }
            int i = this.startX;
            return new Diagonal(i, this.startY, this.endX - i);
        }
    }

    private DiffUtil() {
    }

    @Nullable
    private static Snake backward(Range range, Callback callback, CenteredArray centeredArray, CenteredArray centeredArray2, int i) {
        int i4;
        int i6;
        int i10;
        boolean z4 = (range.oldSize() - range.newSize()) % 2 == 0;
        int iOldSize = range.oldSize() - range.newSize();
        int i11 = -i;
        for (int i12 = i11; i12 <= i; i12 += 2) {
            if (i12 == i11 || (i12 != i && centeredArray2.get(i12 + 1) < centeredArray2.get(i12 - 1))) {
                i4 = centeredArray2.get(i12 + 1);
                i6 = i4;
            } else {
                i4 = centeredArray2.get(i12 - 1);
                i6 = i4 - 1;
            }
            int i13 = range.newListEnd - ((range.oldListEnd - i6) - i12);
            int i14 = (i == 0 || i6 != i4) ? i13 : i13 + 1;
            while (i6 > range.oldListStart && i13 > range.newListStart && callback.areItemsTheSame(i6 - 1, i13 - 1)) {
                i6--;
                i13--;
            }
            centeredArray2.set(i12, i6);
            if (z4 && (i10 = iOldSize - i12) >= i11 && i10 <= i && centeredArray.get(i10) >= i6) {
                Snake snake = new Snake();
                snake.startX = i6;
                snake.startY = i13;
                snake.endX = i4;
                snake.endY = i14;
                snake.reverse = true;
                return snake;
            }
        }
        return null;
    }

    @NonNull
    public static DiffResult calculateDiff(@NonNull Callback callback) {
        return calculateDiff(callback, true);
    }

    @Nullable
    private static Snake forward(Range range, Callback callback, CenteredArray centeredArray, CenteredArray centeredArray2, int i) {
        int i4;
        int i6;
        int i10;
        boolean z4 = Math.abs(range.oldSize() - range.newSize()) % 2 == 1;
        int iOldSize = range.oldSize() - range.newSize();
        int i11 = -i;
        for (int i12 = i11; i12 <= i; i12 += 2) {
            if (i12 == i11 || (i12 != i && centeredArray.get(i12 + 1) > centeredArray.get(i12 - 1))) {
                i4 = centeredArray.get(i12 + 1);
                i6 = i4;
            } else {
                i4 = centeredArray.get(i12 - 1);
                i6 = i4 + 1;
            }
            int i13 = ((i6 - range.oldListStart) + range.newListStart) - i12;
            int i14 = (i == 0 || i6 != i4) ? i13 : i13 - 1;
            while (i6 < range.oldListEnd && i13 < range.newListEnd && callback.areItemsTheSame(i6, i13)) {
                i6++;
                i13++;
            }
            centeredArray.set(i12, i6);
            if (z4 && (i10 = iOldSize - i12) >= i11 + 1 && i10 <= i - 1 && centeredArray2.get(i10) <= i6) {
                Snake snake = new Snake();
                snake.startX = i4;
                snake.startY = i14;
                snake.endX = i6;
                snake.endY = i13;
                snake.reverse = false;
                return snake;
            }
        }
        return null;
    }

    @Nullable
    private static Snake midPoint(Range range, Callback callback, CenteredArray centeredArray, CenteredArray centeredArray2) {
        if (range.oldSize() >= 1 && range.newSize() >= 1) {
            int iOldSize = ((range.oldSize() + range.newSize()) + 1) / 2;
            centeredArray.set(1, range.oldListStart);
            centeredArray2.set(1, range.oldListEnd);
            for (int i = 0; i < iOldSize; i++) {
                Snake snakeForward = forward(range, callback, centeredArray, centeredArray2, i);
                if (snakeForward != null) {
                    return snakeForward;
                }
                Snake snakeBackward = backward(range, callback, centeredArray, centeredArray2, i);
                if (snakeBackward != null) {
                    return snakeBackward;
                }
            }
        }
        return null;
    }

    @NonNull
    public static DiffResult calculateDiff(@NonNull Callback callback, boolean z4) {
        int oldListSize = callback.getOldListSize();
        int newListSize = callback.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new Range(0, oldListSize, 0, newListSize));
        int i = ((((oldListSize + newListSize) + 1) / 2) * 2) + 1;
        CenteredArray centeredArray = new CenteredArray(i);
        CenteredArray centeredArray2 = new CenteredArray(i);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            Range range = (Range) arrayList2.remove(arrayList2.size() - 1);
            Snake snakeMidPoint = midPoint(range, callback, centeredArray, centeredArray2);
            if (snakeMidPoint != null) {
                if (snakeMidPoint.diagonalSize() > 0) {
                    arrayList.add(snakeMidPoint.toDiagonal());
                }
                Range range2 = arrayList3.isEmpty() ? new Range() : (Range) arrayList3.remove(arrayList3.size() - 1);
                range2.oldListStart = range.oldListStart;
                range2.newListStart = range.newListStart;
                range2.oldListEnd = snakeMidPoint.startX;
                range2.newListEnd = snakeMidPoint.startY;
                arrayList2.add(range2);
                range.oldListEnd = range.oldListEnd;
                range.newListEnd = range.newListEnd;
                range.oldListStart = snakeMidPoint.endX;
                range.newListStart = snakeMidPoint.endY;
                arrayList2.add(range);
            } else {
                arrayList3.add(range);
            }
        }
        Collections.sort(arrayList, DIAGONAL_COMPARATOR);
        return new DiffResult(callback, arrayList, centeredArray.backingData(), centeredArray2.backingData(), z4);
    }
}
