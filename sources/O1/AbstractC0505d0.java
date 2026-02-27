package O1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: renamed from: O1.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0505d0 extends M implements Set {
    public static final /* synthetic */ int c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient S f4576b;

    public static int i(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            qk.i.g("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static AbstractC0505d0 j(int i, Object... objArr) {
        if (i == 0) {
            return z0.j;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new G0(obj);
        }
        int i4 = i(i);
        Object[] objArr2 = new Object[i4];
        int i6 = i4 - 1;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < i; i12++) {
            Object obj2 = objArr[i12];
            if (obj2 == null) {
                throw new NullPointerException(We.s.f(i12, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iU = AbstractC0529x.u(iHashCode);
            while (true) {
                int i13 = iU & i6;
                Object obj3 = objArr2[i13];
                if (obj3 == null) {
                    objArr[i11] = obj2;
                    objArr2[i13] = obj2;
                    i10 += iHashCode;
                    i11++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iU++;
            }
        }
        Arrays.fill(objArr, i11, i, (Object) null);
        if (i11 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new G0(obj4);
        }
        if (i(i11) < i4 / 2) {
            return j(i11, objArr);
        }
        int length = objArr.length;
        if (i11 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i11);
        }
        return new z0(objArr, i10, objArr2, i6, i11);
    }

    public static AbstractC0505d0 k(Collection collection) {
        if ((collection instanceof AbstractC0505d0) && !(collection instanceof SortedSet)) {
            AbstractC0505d0 abstractC0505d0 = (AbstractC0505d0) collection;
            if (!abstractC0505d0.g()) {
                return abstractC0505d0;
            }
        }
        Object[] array = collection.toArray();
        return j(array.length, array);
    }

    @Override // O1.M
    public S a() {
        S s9 = this.f4576b;
        if (s9 != null) {
            return s9;
        }
        S sL = l();
        this.f4576b = sL;
        return sL;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC0505d0) && (this instanceof z0)) {
            AbstractC0505d0 abstractC0505d0 = (AbstractC0505d0) obj;
            abstractC0505d0.getClass();
            if ((abstractC0505d0 instanceof z0) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return AbstractC0529x.h(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC0529x.m(this);
    }

    public S l() {
        Object[] array = toArray(M.f4551a);
        P p10 = S.f4555b;
        return S.i(array.length, array);
    }
}
