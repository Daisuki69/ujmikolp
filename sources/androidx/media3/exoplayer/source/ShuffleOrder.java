package androidx.media3.exoplayer.source;

import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public interface ShuffleOrder {

    public static class DefaultShuffleOrder implements ShuffleOrder {
        private final int[] indexInShuffled;
        private final Random random;
        private final int[] shuffled;

        public DefaultShuffleOrder(int i) {
            this(i, new Random());
        }

        private static int[] createShuffledList(int i, Random random) {
            int[] iArr = new int[i];
            int i4 = 0;
            while (i4 < i) {
                int i6 = i4 + 1;
                int iNextInt = random.nextInt(i6);
                iArr[i4] = iArr[iNextInt];
                iArr[iNextInt] = i4;
                i4 = i6;
            }
            return iArr;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public ShuffleOrder cloneAndClear() {
            return new DefaultShuffleOrder(0, new Random(this.random.nextLong()));
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public ShuffleOrder cloneAndInsert(int i, int i4) {
            int[] iArr = new int[i4];
            int[] iArr2 = new int[i4];
            int i6 = 0;
            int i10 = 0;
            while (i10 < i4) {
                iArr[i10] = this.random.nextInt(this.shuffled.length + 1);
                int i11 = i10 + 1;
                int iNextInt = this.random.nextInt(i11);
                iArr2[i10] = iArr2[iNextInt];
                iArr2[iNextInt] = i10 + i;
                i10 = i11;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.shuffled.length + i4];
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int[] iArr4 = this.shuffled;
                if (i6 >= iArr4.length + i4) {
                    return new DefaultShuffleOrder(iArr3, new Random(this.random.nextLong()));
                }
                if (i12 >= i4 || i13 != iArr[i12]) {
                    int i14 = i13 + 1;
                    int i15 = iArr4[i13];
                    iArr3[i6] = i15;
                    if (i15 >= i) {
                        iArr3[i6] = i15 + i4;
                    }
                    i13 = i14;
                } else {
                    iArr3[i6] = iArr2[i12];
                    i12++;
                }
                i6++;
            }
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public ShuffleOrder cloneAndRemove(int i, int i4) {
            int i6 = i4 - i;
            int[] iArr = new int[this.shuffled.length - i6];
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int[] iArr2 = this.shuffled;
                if (i10 >= iArr2.length) {
                    return new DefaultShuffleOrder(iArr, new Random(this.random.nextLong()));
                }
                int i12 = iArr2[i10];
                if (i12 < i || i12 >= i4) {
                    int i13 = i10 - i11;
                    if (i12 >= i) {
                        i12 -= i6;
                    }
                    iArr[i13] = i12;
                } else {
                    i11++;
                }
                i10++;
            }
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getFirstIndex() {
            int[] iArr = this.shuffled;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getLastIndex() {
            int[] iArr = this.shuffled;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getLength() {
            return this.shuffled.length;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getNextIndex(int i) {
            int i4 = this.indexInShuffled[i] + 1;
            int[] iArr = this.shuffled;
            if (i4 < iArr.length) {
                return iArr[i4];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getPreviousIndex(int i) {
            int i4 = this.indexInShuffled[i] - 1;
            if (i4 >= 0) {
                return this.shuffled[i4];
            }
            return -1;
        }

        public DefaultShuffleOrder(int i, long j) {
            this(i, new Random(j));
        }

        public DefaultShuffleOrder(int[] iArr, long j) {
            this(Arrays.copyOf(iArr, iArr.length), new Random(j));
        }

        private DefaultShuffleOrder(int i, Random random) {
            this(createShuffledList(i, random), random);
        }

        private DefaultShuffleOrder(int[] iArr, Random random) {
            this.shuffled = iArr;
            this.random = random;
            this.indexInShuffled = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.indexInShuffled[iArr[i]] = i;
            }
        }
    }

    public static final class UnshuffledShuffleOrder implements ShuffleOrder {
        private final int length;

        public UnshuffledShuffleOrder(int i) {
            this.length = i;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public ShuffleOrder cloneAndClear() {
            return new UnshuffledShuffleOrder(0);
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public ShuffleOrder cloneAndInsert(int i, int i4) {
            return new UnshuffledShuffleOrder(this.length + i4);
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public ShuffleOrder cloneAndRemove(int i, int i4) {
            return new UnshuffledShuffleOrder((this.length - i4) + i);
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getFirstIndex() {
            return this.length > 0 ? 0 : -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getLastIndex() {
            int i = this.length;
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getLength() {
            return this.length;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getNextIndex(int i) {
            int i4 = i + 1;
            if (i4 < this.length) {
                return i4;
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getPreviousIndex(int i) {
            int i4 = i - 1;
            if (i4 >= 0) {
                return i4;
            }
            return -1;
        }
    }

    ShuffleOrder cloneAndClear();

    ShuffleOrder cloneAndInsert(int i, int i4);

    ShuffleOrder cloneAndRemove(int i, int i4);

    int getFirstIndex();

    int getLastIndex();

    int getLength();

    int getNextIndex(int i);

    int getPreviousIndex(int i);
}
