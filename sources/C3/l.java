package C3;

/* JADX INFO: loaded from: classes3.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f728b;

    public l(float f, float f3) {
        this.f727a = f;
        this.f728b = f3;
    }

    public static float a(l lVar, l lVar2) {
        float f = lVar.f727a - lVar2.f727a;
        float f3 = lVar.f728b - lVar2.f728b;
        return (float) Math.sqrt((f3 * f3) + (f * f));
    }

    public static void b(l[] lVarArr) {
        l lVar;
        l lVar2;
        l lVar3;
        float fA = a(lVarArr[0], lVarArr[1]);
        float fA2 = a(lVarArr[1], lVarArr[2]);
        float fA3 = a(lVarArr[0], lVarArr[2]);
        if (fA2 >= fA && fA2 >= fA3) {
            lVar = lVarArr[0];
            lVar2 = lVarArr[1];
            lVar3 = lVarArr[2];
        } else if (fA3 < fA2 || fA3 < fA) {
            lVar = lVarArr[2];
            lVar2 = lVarArr[0];
            lVar3 = lVarArr[1];
        } else {
            lVar = lVarArr[1];
            lVar2 = lVarArr[0];
            lVar3 = lVarArr[2];
        }
        float f = lVar.f727a;
        float f3 = lVar3.f727a - f;
        float f7 = lVar2.f728b;
        float f10 = lVar.f728b;
        if (((f7 - f10) * f3) - ((lVar2.f727a - f) * (lVar3.f728b - f10)) < 0.0f) {
            l lVar4 = lVar3;
            lVar3 = lVar2;
            lVar2 = lVar4;
        }
        lVarArr[0] = lVar2;
        lVarArr[1] = lVar;
        lVarArr[2] = lVar3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f727a == lVar.f727a && this.f728b == lVar.f728b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f728b) + (Float.floatToIntBits(this.f727a) * 31);
    }

    public final String toString() {
        return "(" + this.f727a + ',' + this.f728b + ')';
    }
}
