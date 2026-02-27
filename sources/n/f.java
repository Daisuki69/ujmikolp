package N;

import com.google.android.gms.common.internal.ImagesContract;
import dOYHB6.tiZVw8.numX49;
import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final M2.b f3462b;
    public static final f c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f3463d;
    public static final f e;
    public static final /* synthetic */ f[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3464a;

    static {
        f fVar = new f(numX49.tnTj78("PJ2u"), 0, numX49.tnTj78("PJ2B"));
        c = fVar;
        f fVar2 = new f(numX49.tnTj78("PJ2V"), 1, ImagesContract.URL);
        f3463d = fVar2;
        f fVar3 = new f(numX49.tnTj78("PJ2j"), 2, numX49.tnTj78("PJ2S"));
        f fVar4 = new f(numX49.tnTj78("PJ2i"), 3, numX49.tnTj78("PJ2d"));
        f fVar5 = new f(numX49.tnTj78("PJ2F"), 4, numX49.tnTj78("PJ2E"));
        e = fVar5;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5};
        f = fVarArr;
        v0.h(fVarArr);
        f3462b = new M2.b(10);
    }

    public f(String str, int i, String str2) {
        this.f3464a = str2;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f3464a;
    }
}
