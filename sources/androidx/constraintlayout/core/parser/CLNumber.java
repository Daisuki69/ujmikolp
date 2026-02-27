package androidx.constraintlayout.core.parser;

import We.s;

/* JADX INFO: loaded from: classes.dex */
public class CLNumber extends CLElement {
    float value;

    public CLNumber(char[] cArr) {
        super(cArr);
        this.value = Float.NaN;
    }

    public static CLElement allocate(char[] cArr) {
        return new CLNumber(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public float getFloat() {
        if (Float.isNaN(this.value)) {
            this.value = Float.parseFloat(content());
        }
        return this.value;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public int getInt() {
        if (Float.isNaN(this.value)) {
            this.value = Integer.parseInt(content());
        }
        return (int) this.value;
    }

    public boolean isInt() {
        float f = getFloat();
        return ((float) ((int) f)) == f;
    }

    public void putValue(float f) {
        this.value = f;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i, int i4) {
        StringBuilder sb2 = new StringBuilder();
        addIndent(sb2, i);
        float f = getFloat();
        int i6 = (int) f;
        if (i6 == f) {
            sb2.append(i6);
        } else {
            sb2.append(f);
        }
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        float f = getFloat();
        int i = (int) f;
        if (i == f) {
            return s.f(i, "");
        }
        return "" + f;
    }

    public CLNumber(float f) {
        super(null);
        this.value = f;
    }
}
