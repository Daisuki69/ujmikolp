package Hf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f2167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f2168b;

    public a(float[] fArr, c cVar) {
        this.f2167a = (float[]) fArr.clone();
        this.f2168b = cVar;
    }

    public final String toString() {
        return "PDColor{components=" + Arrays.toString(this.f2167a) + ", patternName=null}";
    }
}
