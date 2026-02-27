package androidx.constraintlayout.core;

import We.s;
import androidx.camera.core.impl.a;
import androidx.constraintlayout.core.ArrayRow;
import com.dynatrace.android.agent.Global;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class SolverVariableValues implements ArrayRow.ArrayRowVariables {
    private static final boolean DEBUG = false;
    private static final boolean HASH = true;
    private static float epsilon = 0.001f;
    protected final Cache mCache;
    private final ArrayRow mRow;
    private final int NONE = -1;
    private int SIZE = 16;
    private int HASH_SIZE = 16;
    int[] keys = new int[16];
    int[] nextKeys = new int[16];
    int[] variables = new int[16];
    float[] values = new float[16];
    int[] previous = new int[16];
    int[] next = new int[16];
    int mCount = 0;
    int head = -1;

    public SolverVariableValues(ArrayRow arrayRow, Cache cache) {
        this.mRow = arrayRow;
        this.mCache = cache;
        clear();
    }

    private void addToHashMap(SolverVariable solverVariable, int i) {
        int[] iArr;
        int i4 = solverVariable.id % this.HASH_SIZE;
        int[] iArr2 = this.keys;
        int i6 = iArr2[i4];
        if (i6 == -1) {
            iArr2[i4] = i;
        } else {
            while (true) {
                iArr = this.nextKeys;
                int i10 = iArr[i6];
                if (i10 == -1) {
                    break;
                } else {
                    i6 = i10;
                }
            }
            iArr[i6] = i;
        }
        this.nextKeys[i] = -1;
    }

    private void addVariable(int i, SolverVariable solverVariable, float f) {
        this.variables[i] = solverVariable.id;
        this.values[i] = f;
        this.previous[i] = -1;
        this.next[i] = -1;
        solverVariable.addToRow(this.mRow);
        solverVariable.usageInRowCount++;
        this.mCount++;
    }

    private void displayHash() {
        for (int i = 0; i < this.HASH_SIZE; i++) {
            if (this.keys[i] != -1) {
                String string = hashCode() + " hash [" + i + "] => ";
                int i4 = this.keys[i];
                boolean z4 = false;
                while (!z4) {
                    StringBuilder sbV = s.v(string, Global.BLANK);
                    sbV.append(this.variables[i4]);
                    string = sbV.toString();
                    int i6 = this.nextKeys[i4];
                    if (i6 != -1) {
                        i4 = i6;
                    } else {
                        z4 = true;
                    }
                }
                System.out.println(string);
            }
        }
    }

    private int findEmptySlot() {
        for (int i = 0; i < this.SIZE; i++) {
            if (this.variables[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    private void increaseSize() {
        int i = this.SIZE * 2;
        this.variables = Arrays.copyOf(this.variables, i);
        this.values = Arrays.copyOf(this.values, i);
        this.previous = Arrays.copyOf(this.previous, i);
        this.next = Arrays.copyOf(this.next, i);
        this.nextKeys = Arrays.copyOf(this.nextKeys, i);
        for (int i4 = this.SIZE; i4 < i; i4++) {
            this.variables[i4] = -1;
            this.nextKeys[i4] = -1;
        }
        this.SIZE = i;
    }

    private void insertVariable(int i, SolverVariable solverVariable, float f) {
        int iFindEmptySlot = findEmptySlot();
        addVariable(iFindEmptySlot, solverVariable, f);
        if (i != -1) {
            this.previous[iFindEmptySlot] = i;
            int[] iArr = this.next;
            iArr[iFindEmptySlot] = iArr[i];
            iArr[i] = iFindEmptySlot;
        } else {
            this.previous[iFindEmptySlot] = -1;
            if (this.mCount > 0) {
                this.next[iFindEmptySlot] = this.head;
                this.head = iFindEmptySlot;
            } else {
                this.next[iFindEmptySlot] = -1;
            }
        }
        int i4 = this.next[iFindEmptySlot];
        if (i4 != -1) {
            this.previous[i4] = iFindEmptySlot;
        }
        addToHashMap(solverVariable, iFindEmptySlot);
    }

    private void removeFromHashMap(SolverVariable solverVariable) {
        int[] iArr;
        int i;
        int i4 = solverVariable.id;
        int i6 = i4 % this.HASH_SIZE;
        int[] iArr2 = this.keys;
        int i10 = iArr2[i6];
        if (i10 == -1) {
            return;
        }
        if (this.variables[i10] == i4) {
            int[] iArr3 = this.nextKeys;
            iArr2[i6] = iArr3[i10];
            iArr3[i10] = -1;
            return;
        }
        while (true) {
            iArr = this.nextKeys;
            i = iArr[i10];
            if (i == -1 || this.variables[i] == i4) {
                break;
            } else {
                i10 = i;
            }
        }
        if (i == -1 || this.variables[i] != i4) {
            return;
        }
        iArr[i10] = iArr[i];
        iArr[i] = -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void add(SolverVariable solverVariable, float f, boolean z4) {
        float f3 = epsilon;
        if (f <= (-f3) || f >= f3) {
            int iIndexOf = indexOf(solverVariable);
            if (iIndexOf == -1) {
                put(solverVariable, f);
                return;
            }
            float[] fArr = this.values;
            float f7 = fArr[iIndexOf] + f;
            fArr[iIndexOf] = f7;
            float f10 = epsilon;
            if (f7 <= (-f10) || f7 >= f10) {
                return;
            }
            fArr[iIndexOf] = 0.0f;
            remove(solverVariable, z4);
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void clear() {
        int i = this.mCount;
        for (int i4 = 0; i4 < i; i4++) {
            SolverVariable variable = getVariable(i4);
            if (variable != null) {
                variable.removeFromRow(this.mRow);
            }
        }
        for (int i6 = 0; i6 < this.SIZE; i6++) {
            this.variables[i6] = -1;
            this.nextKeys[i6] = -1;
        }
        for (int i10 = 0; i10 < this.HASH_SIZE; i10++) {
            this.keys[i10] = -1;
        }
        this.mCount = 0;
        this.head = -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public boolean contains(SolverVariable solverVariable) {
        return indexOf(solverVariable) != -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void display() {
        int i = this.mCount;
        System.out.print("{ ");
        for (int i4 = 0; i4 < i; i4++) {
            SolverVariable variable = getVariable(i4);
            if (variable != null) {
                System.out.print(variable + " = " + getVariableValue(i4) + Global.BLANK);
            }
        }
        System.out.println(" }");
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void divideByAmount(float f) {
        int i = this.mCount;
        int i4 = this.head;
        for (int i6 = 0; i6 < i; i6++) {
            float[] fArr = this.values;
            fArr[i4] = fArr[i4] / f;
            i4 = this.next[i4];
            if (i4 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float get(SolverVariable solverVariable) {
        int iIndexOf = indexOf(solverVariable);
        if (iIndexOf != -1) {
            return this.values[iIndexOf];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int getCurrentSize() {
        return this.mCount;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public SolverVariable getVariable(int i) {
        int i4 = this.mCount;
        if (i4 == 0) {
            return null;
        }
        int i6 = this.head;
        for (int i10 = 0; i10 < i4; i10++) {
            if (i10 == i && i6 != -1) {
                return this.mCache.mIndexedVariables[this.variables[i6]];
            }
            i6 = this.next[i6];
            if (i6 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float getVariableValue(int i) {
        int i4 = this.mCount;
        int i6 = this.head;
        for (int i10 = 0; i10 < i4; i10++) {
            if (i10 == i) {
                return this.values[i6];
            }
            i6 = this.next[i6];
            if (i6 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int indexOf(SolverVariable solverVariable) {
        if (this.mCount != 0 && solverVariable != null) {
            int i = solverVariable.id;
            int i4 = this.keys[i % this.HASH_SIZE];
            if (i4 == -1) {
                return -1;
            }
            if (this.variables[i4] == i) {
                return i4;
            }
            do {
                i4 = this.nextKeys[i4];
                if (i4 == -1) {
                    break;
                }
            } while (this.variables[i4] != i);
            if (i4 != -1 && this.variables[i4] == i) {
                return i4;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void invert() {
        int i = this.mCount;
        int i4 = this.head;
        for (int i6 = 0; i6 < i; i6++) {
            float[] fArr = this.values;
            fArr[i4] = fArr[i4] * (-1.0f);
            i4 = this.next[i4];
            if (i4 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void put(SolverVariable solverVariable, float f) {
        float f3 = epsilon;
        if (f > (-f3) && f < f3) {
            remove(solverVariable, true);
            return;
        }
        if (this.mCount == 0) {
            addVariable(0, solverVariable, f);
            addToHashMap(solverVariable, 0);
            this.head = 0;
            return;
        }
        int iIndexOf = indexOf(solverVariable);
        if (iIndexOf != -1) {
            this.values[iIndexOf] = f;
            return;
        }
        if (this.mCount + 1 >= this.SIZE) {
            increaseSize();
        }
        int i = this.mCount;
        int i4 = this.head;
        int i6 = -1;
        for (int i10 = 0; i10 < i; i10++) {
            int i11 = this.variables[i4];
            int i12 = solverVariable.id;
            if (i11 == i12) {
                this.values[i4] = f;
                return;
            }
            if (i11 < i12) {
                i6 = i4;
            }
            i4 = this.next[i4];
            if (i4 == -1) {
                break;
            }
        }
        insertVariable(i6, solverVariable, f);
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float remove(SolverVariable solverVariable, boolean z4) {
        int iIndexOf = indexOf(solverVariable);
        if (iIndexOf == -1) {
            return 0.0f;
        }
        removeFromHashMap(solverVariable);
        float f = this.values[iIndexOf];
        if (this.head == iIndexOf) {
            this.head = this.next[iIndexOf];
        }
        this.variables[iIndexOf] = -1;
        int[] iArr = this.previous;
        int i = iArr[iIndexOf];
        if (i != -1) {
            int[] iArr2 = this.next;
            iArr2[i] = iArr2[iIndexOf];
        }
        int i4 = this.next[iIndexOf];
        if (i4 != -1) {
            iArr[i4] = iArr[iIndexOf];
        }
        this.mCount--;
        solverVariable.usageInRowCount--;
        if (z4) {
            solverVariable.removeFromRow(this.mRow);
        }
        return f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int sizeInBytes() {
        return 0;
    }

    public String toString() {
        String strI;
        String strI2;
        String strI3 = hashCode() + " { ";
        int i = this.mCount;
        for (int i4 = 0; i4 < i; i4++) {
            SolverVariable variable = getVariable(i4);
            if (variable != null) {
                String str = strI3 + variable + " = " + getVariableValue(i4) + Global.BLANK;
                int iIndexOf = indexOf(variable);
                String strI4 = s.i(str, "[p: ");
                if (this.previous[iIndexOf] != -1) {
                    StringBuilder sbW = a.w(strI4);
                    sbW.append(this.mCache.mIndexedVariables[this.variables[this.previous[iIndexOf]]]);
                    strI = sbW.toString();
                } else {
                    strI = s.i(strI4, "none");
                }
                String strI5 = s.i(strI, ", n: ");
                if (this.next[iIndexOf] != -1) {
                    StringBuilder sbW2 = a.w(strI5);
                    sbW2.append(this.mCache.mIndexedVariables[this.variables[this.next[iIndexOf]]]);
                    strI2 = sbW2.toString();
                } else {
                    strI2 = s.i(strI5, "none");
                }
                strI3 = s.i(strI2, "]");
            }
        }
        return s.i(strI3, " }");
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float use(ArrayRow arrayRow, boolean z4) {
        float f = get(arrayRow.variable);
        remove(arrayRow.variable, z4);
        SolverVariableValues solverVariableValues = (SolverVariableValues) arrayRow.variables;
        int currentSize = solverVariableValues.getCurrentSize();
        int i = 0;
        int i4 = 0;
        while (i < currentSize) {
            int i6 = solverVariableValues.variables[i4];
            if (i6 != -1) {
                add(this.mCache.mIndexedVariables[i6], solverVariableValues.values[i4] * f, z4);
                i++;
            }
            i4++;
        }
        return f;
    }
}
