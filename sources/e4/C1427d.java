package e4;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: e4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1427d implements Serializable, Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f16599b;

    public /* synthetic */ C1427d(float f, int i) {
        this.f16598a = i;
        this.f16599b = f;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f16598a) {
            case 0:
                C1426c c1426c = (C1426c) obj;
                C1426c c1426c2 = (C1426c) obj2;
                int iCompare = Integer.compare(c1426c2.f16597d, c1426c.f16597d);
                if (iCompare != 0) {
                    return iCompare;
                }
                float f = c1426c.c;
                float f3 = this.f16599b;
                return Float.compare(Math.abs(f - f3), Math.abs(c1426c2.c - f3));
            default:
                float f7 = ((C1426c) obj2).c;
                float f10 = this.f16599b;
                return Float.compare(Math.abs(f7 - f10), Math.abs(((C1426c) obj).c - f10));
        }
    }
}
