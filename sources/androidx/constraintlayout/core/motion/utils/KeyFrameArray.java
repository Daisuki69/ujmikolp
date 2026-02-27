package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import java.io.PrintStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class KeyFrameArray {

    public static class CustomArray {
        private static final int EMPTY = 999;
        int count;
        int[] keys = new int[101];
        CustomAttribute[] values = new CustomAttribute[101];

        public CustomArray() {
            clear();
        }

        public void append(int i, CustomAttribute customAttribute) {
            if (this.values[i] != null) {
                remove(i);
            }
            this.values[i] = customAttribute;
            int[] iArr = this.keys;
            int i4 = this.count;
            this.count = i4 + 1;
            iArr[i4] = i;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.keys, 999);
            Arrays.fill(this.values, (Object) null);
            this.count = 0;
        }

        public void dump() {
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.keys, this.count)));
            System.out.print("K: [");
            int i = 0;
            while (i < this.count) {
                PrintStream printStream = System.out;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i == 0 ? "" : ", ");
                sb2.append(valueAt(i));
                printStream.print(sb2.toString());
                i++;
            }
            System.out.println("]");
        }

        public int keyAt(int i) {
            return this.keys[i];
        }

        public void remove(int i) {
            this.values[i] = null;
            int i4 = 0;
            int i6 = 0;
            while (true) {
                int i10 = this.count;
                if (i4 >= i10) {
                    this.count = i10 - 1;
                    return;
                }
                int[] iArr = this.keys;
                if (i == iArr[i4]) {
                    iArr[i4] = 999;
                    i6++;
                }
                if (i4 != i6) {
                    iArr[i4] = iArr[i6];
                }
                i6++;
                i4++;
            }
        }

        public int size() {
            return this.count;
        }

        public CustomAttribute valueAt(int i) {
            return this.values[this.keys[i]];
        }
    }

    public static class CustomVar {
        private static final int EMPTY = 999;
        int count;
        int[] keys = new int[101];
        CustomVariable[] values = new CustomVariable[101];

        public CustomVar() {
            clear();
        }

        public void append(int i, CustomVariable customVariable) {
            if (this.values[i] != null) {
                remove(i);
            }
            this.values[i] = customVariable;
            int[] iArr = this.keys;
            int i4 = this.count;
            this.count = i4 + 1;
            iArr[i4] = i;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.keys, 999);
            Arrays.fill(this.values, (Object) null);
            this.count = 0;
        }

        public void dump() {
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.keys, this.count)));
            System.out.print("K: [");
            int i = 0;
            while (i < this.count) {
                PrintStream printStream = System.out;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i == 0 ? "" : ", ");
                sb2.append(valueAt(i));
                printStream.print(sb2.toString());
                i++;
            }
            System.out.println("]");
        }

        public int keyAt(int i) {
            return this.keys[i];
        }

        public void remove(int i) {
            this.values[i] = null;
            int i4 = 0;
            int i6 = 0;
            while (true) {
                int i10 = this.count;
                if (i4 >= i10) {
                    this.count = i10 - 1;
                    return;
                }
                int[] iArr = this.keys;
                if (i == iArr[i4]) {
                    iArr[i4] = 999;
                    i6++;
                }
                if (i4 != i6) {
                    iArr[i4] = iArr[i6];
                }
                i6++;
                i4++;
            }
        }

        public int size() {
            return this.count;
        }

        public CustomVariable valueAt(int i) {
            return this.values[this.keys[i]];
        }
    }

    public static class FloatArray {
        private static final int EMPTY = 999;
        int count;
        int[] keys = new int[101];
        float[][] values = new float[101][];

        public FloatArray() {
            clear();
        }

        public void append(int i, float[] fArr) {
            if (this.values[i] != null) {
                remove(i);
            }
            this.values[i] = fArr;
            int[] iArr = this.keys;
            int i4 = this.count;
            this.count = i4 + 1;
            iArr[i4] = i;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.keys, 999);
            Arrays.fill(this.values, (Object) null);
            this.count = 0;
        }

        public void dump() {
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.keys, this.count)));
            System.out.print("K: [");
            int i = 0;
            while (i < this.count) {
                PrintStream printStream = System.out;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i == 0 ? "" : ", ");
                sb2.append(Arrays.toString(valueAt(i)));
                printStream.print(sb2.toString());
                i++;
            }
            System.out.println("]");
        }

        public int keyAt(int i) {
            return this.keys[i];
        }

        public void remove(int i) {
            this.values[i] = null;
            int i4 = 0;
            int i6 = 0;
            while (true) {
                int i10 = this.count;
                if (i4 >= i10) {
                    this.count = i10 - 1;
                    return;
                }
                int[] iArr = this.keys;
                if (i == iArr[i4]) {
                    iArr[i4] = 999;
                    i6++;
                }
                if (i4 != i6) {
                    iArr[i4] = iArr[i6];
                }
                i6++;
                i4++;
            }
        }

        public int size() {
            return this.count;
        }

        public float[] valueAt(int i) {
            return this.values[this.keys[i]];
        }
    }
}
