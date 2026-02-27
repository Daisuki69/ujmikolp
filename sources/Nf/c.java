package Nf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Map {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f4401a;

    public final int a(Object obj) {
        if (!isEmpty() && obj != null) {
            int i = 0;
            while (true) {
                Object[] objArr = this.f4401a;
                if (i >= objArr.length) {
                    break;
                }
                if (obj.equals(objArr[i])) {
                    return i;
                }
                i += 2;
            }
        }
        return -1;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f4401a = null;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return a(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int i = -1;
        if (!isEmpty() && obj != null) {
            int i4 = 1;
            while (true) {
                Object[] objArr = this.f4401a;
                if (i4 >= objArr.length) {
                    break;
                }
                if (obj.equals(objArr[i4])) {
                    i = i4;
                    break;
                }
                i4 += 2;
            }
        }
        return i >= 0;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (isEmpty()) {
            return Collections.EMPTY_SET;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i = 0; i < this.f4401a.length; i += 2) {
            linkedHashSet.add(new b(this, i));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iA = a(obj);
        if (iA < 0) {
            return null;
        }
        return this.f4401a[iA + 1];
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Object[] objArr = this.f4401a;
        return objArr == null || objArr.length == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (isEmpty()) {
            return Collections.EMPTY_SET;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        while (true) {
            Object[] objArr = this.f4401a;
            if (i >= objArr.length) {
                return Collections.unmodifiableSet(linkedHashSet);
            }
            linkedHashSet.add(objArr[i]);
            i += 2;
        }
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw new NullPointerException("Key or value must not be null.");
        }
        if (this.f4401a == null) {
            this.f4401a = new Object[]{obj, obj2};
            return null;
        }
        int iA = a(obj);
        if (iA >= 0) {
            Object[] objArr = this.f4401a;
            int i = iA + 1;
            Object obj3 = objArr[i];
            objArr[i] = obj2;
            return obj3;
        }
        Object[] objArr2 = this.f4401a;
        int length = objArr2.length;
        Object[] objArr3 = new Object[2 + length];
        System.arraycopy(objArr2, 0, objArr3, 0, length);
        objArr3[length] = obj;
        objArr3[length + 1] = obj2;
        this.f4401a = objArr3;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        Object[] objArr = this.f4401a;
        int i = 0;
        if (objArr == null || objArr.length == 0) {
            this.f4401a = new Object[map.size() << 1];
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    throw new NullPointerException("Key or value must not be null.");
                }
                int i4 = i + 1;
                this.f4401a[i] = entry.getKey();
                i += 2;
                this.f4401a[i4] = entry.getValue();
            }
            return;
        }
        int length = objArr.length;
        int size = (map.size() << 1) + length;
        Object[] objArr2 = new Object[size];
        System.arraycopy(this.f4401a, 0, objArr2, 0, length);
        for (Map.Entry entry2 : map.entrySet()) {
            if (entry2.getKey() == null || entry2.getValue() == null) {
                throw new NullPointerException("Key or value must not be null.");
            }
            int iA = a(entry2.getKey());
            if (iA >= 0) {
                objArr2[iA + 1] = entry2.getValue();
            } else {
                int i6 = length + 1;
                objArr2[length] = entry2.getKey();
                length += 2;
                objArr2[i6] = entry2.getValue();
            }
        }
        if (length < size) {
            Object[] objArr3 = new Object[length];
            System.arraycopy(objArr2, 0, objArr3, 0, length);
            objArr2 = objArr3;
        }
        this.f4401a = objArr2;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        int iA = a(obj);
        if (iA < 0) {
            return null;
        }
        Object[] objArr = this.f4401a;
        Object obj2 = objArr[iA + 1];
        int length = objArr.length;
        if (length == 2) {
            this.f4401a = null;
            return obj2;
        }
        Object[] objArr2 = new Object[length - 2];
        System.arraycopy(objArr, 0, objArr2, 0, iA);
        System.arraycopy(this.f4401a, iA + 2, objArr2, iA, (length - iA) - 2);
        this.f4401a = objArr2;
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        Object[] objArr = this.f4401a;
        if (objArr == null) {
            return 0;
        }
        return objArr.length >> 1;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (isEmpty()) {
            return Collections.EMPTY_SET;
        }
        int i = 1;
        ArrayList arrayList = new ArrayList(this.f4401a.length >> 1);
        while (true) {
            Object[] objArr = this.f4401a;
            if (i >= objArr.length) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add(objArr[i]);
            i += 2;
        }
    }
}
