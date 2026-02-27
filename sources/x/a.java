package X;

import com.paymaya.domain.model.ConfidenceThreshold;
import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f6454b;
    public static final a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f6455d;

    static {
        a aVar = new a("QUEUED", 0);
        a aVar2 = new a("IN_PROGRESS", 1);
        f6453a = aVar2;
        a aVar3 = new a("SUCCESSFUL", 2);
        f6454b = aVar3;
        a aVar4 = new a(ConfidenceThreshold.DECISION_FAILED, 3);
        c = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        f6455d = aVarArr;
        v0.h(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f6455d.clone();
    }
}
