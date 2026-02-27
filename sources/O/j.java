package O;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import dOYHB6.tiZVw8.numX49;
import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f4519b;
    public static final j c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ j[] f4520d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4521a;

    static {
        j jVar = new j(numX49.tnTj78("PzP"), 0, TypedValues.Custom.S_STRING);
        f4519b = jVar;
        j jVar2 = new j(numX49.tnTj78("Pz2"), 1, numX49.tnTj78("Pzb"));
        c = jVar2;
        j[] jVarArr = {jVar, jVar2, new j(numX49.tnTj78("Pzr"), 2, numX49.tnTj78("PzL")), new j(numX49.tnTj78("Pzk"), 3, numX49.tnTj78("PzZ")), new j(numX49.tnTj78("Pzu"), 4, numX49.tnTj78("PzB"))};
        f4520d = jVarArr;
        v0.h(jVarArr);
    }

    public j(String str, int i, String str2) {
        this.f4521a = str2;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f4520d.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f4521a;
    }
}
