package E8;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1311b;

    public /* synthetic */ x(Object obj, int i) {
        this.f1310a = i;
        this.f1311b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1310a) {
            case 2:
                break;
        }
        return ((Number) ((Sb.i) this.f1311b).invoke(obj, obj2)).intValue();
    }
}
