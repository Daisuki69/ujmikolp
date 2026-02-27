package com.google.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends AbstractMap implements Serializable {
    public static final B9.a i = new B9.a(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator f9992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9993b;
    public j c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9994d;
    public int e;
    public final j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i f9995g;
    public i h;

    public k(boolean z4) {
        B9.a aVar = i;
        this.f9994d = 0;
        this.e = 0;
        this.f9992a = aVar;
        this.f9993b = z4;
        this.f = new j(z4);
    }

    public final j a(Object obj, boolean z4) {
        int iCompareTo;
        j jVar;
        j jVar2 = this.c;
        B9.a aVar = i;
        Comparator comparator = this.f9992a;
        if (jVar2 != null) {
            Comparable comparable = comparator == aVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = jVar2.f;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return jVar2;
                }
                j jVar3 = iCompareTo < 0 ? jVar2.f9989b : jVar2.c;
                if (jVar3 == null) {
                    break;
                }
                jVar2 = jVar3;
            }
        } else {
            iCompareTo = 0;
        }
        j jVar4 = jVar2;
        if (!z4) {
            return null;
        }
        j jVar5 = this.f;
        if (jVar4 != null) {
            jVar = new j(this.f9993b, jVar4, obj, jVar5, jVar5.e);
            if (iCompareTo < 0) {
                jVar4.f9989b = jVar;
            } else {
                jVar4.c = jVar;
            }
            b(jVar4, true);
        } else {
            if (comparator == aVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            jVar = new j(this.f9993b, jVar4, obj, jVar5, jVar5.e);
            this.c = jVar;
        }
        this.f9994d++;
        this.e++;
        return jVar;
    }

    public final void b(j jVar, boolean z4) {
        while (jVar != null) {
            j jVar2 = jVar.f9989b;
            j jVar3 = jVar.c;
            int i4 = jVar2 != null ? jVar2.i : 0;
            int i6 = jVar3 != null ? jVar3.i : 0;
            int i10 = i4 - i6;
            if (i10 == -2) {
                j jVar4 = jVar3.f9989b;
                j jVar5 = jVar3.c;
                int i11 = (jVar4 != null ? jVar4.i : 0) - (jVar5 != null ? jVar5.i : 0);
                if (i11 == -1 || (i11 == 0 && !z4)) {
                    e(jVar);
                } else {
                    f(jVar3);
                    e(jVar);
                }
                if (z4) {
                    return;
                }
            } else if (i10 == 2) {
                j jVar6 = jVar2.f9989b;
                j jVar7 = jVar2.c;
                int i12 = (jVar6 != null ? jVar6.i : 0) - (jVar7 != null ? jVar7.i : 0);
                if (i12 == 1 || (i12 == 0 && !z4)) {
                    f(jVar);
                } else {
                    e(jVar2);
                    f(jVar);
                }
                if (z4) {
                    return;
                }
            } else if (i10 == 0) {
                jVar.i = i4 + 1;
                if (z4) {
                    return;
                }
            } else {
                jVar.i = Math.max(i4, i6) + 1;
                if (!z4) {
                    return;
                }
            }
            jVar = jVar.f9988a;
        }
    }

    public final void c(j jVar, boolean z4) {
        j jVar2;
        j jVar3;
        int i4;
        if (z4) {
            j jVar4 = jVar.e;
            jVar4.f9990d = jVar.f9990d;
            jVar.f9990d.e = jVar4;
        }
        j jVar5 = jVar.f9989b;
        j jVar6 = jVar.c;
        j jVar7 = jVar.f9988a;
        int i6 = 0;
        if (jVar5 == null || jVar6 == null) {
            if (jVar5 != null) {
                d(jVar, jVar5);
                jVar.f9989b = null;
            } else if (jVar6 != null) {
                d(jVar, jVar6);
                jVar.c = null;
            } else {
                d(jVar, null);
            }
            b(jVar7, false);
            this.f9994d--;
            this.e++;
            return;
        }
        if (jVar5.i > jVar6.i) {
            j jVar8 = jVar5.c;
            while (true) {
                j jVar9 = jVar8;
                jVar3 = jVar5;
                jVar5 = jVar9;
                if (jVar5 == null) {
                    break;
                } else {
                    jVar8 = jVar5.c;
                }
            }
        } else {
            j jVar10 = jVar6.f9989b;
            while (true) {
                jVar2 = jVar6;
                jVar6 = jVar10;
                if (jVar6 == null) {
                    break;
                } else {
                    jVar10 = jVar6.f9989b;
                }
            }
            jVar3 = jVar2;
        }
        c(jVar3, false);
        j jVar11 = jVar.f9989b;
        if (jVar11 != null) {
            i4 = jVar11.i;
            jVar3.f9989b = jVar11;
            jVar11.f9988a = jVar3;
            jVar.f9989b = null;
        } else {
            i4 = 0;
        }
        j jVar12 = jVar.c;
        if (jVar12 != null) {
            i6 = jVar12.i;
            jVar3.c = jVar12;
            jVar12.f9988a = jVar3;
            jVar.c = null;
        }
        jVar3.i = Math.max(i4, i6) + 1;
        d(jVar, jVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.c = null;
        this.f9994d = 0;
        this.e++;
        j jVar = this.f;
        jVar.e = jVar;
        jVar.f9990d = jVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        j jVarA = null;
        if (obj != null) {
            try {
                jVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return jVarA != null;
    }

    public final void d(j jVar, j jVar2) {
        j jVar3 = jVar.f9988a;
        jVar.f9988a = null;
        if (jVar2 != null) {
            jVar2.f9988a = jVar3;
        }
        if (jVar3 == null) {
            this.c = jVar2;
        } else if (jVar3.f9989b == jVar) {
            jVar3.f9989b = jVar2;
        } else {
            jVar3.c = jVar2;
        }
    }

    public final void e(j jVar) {
        j jVar2 = jVar.f9989b;
        j jVar3 = jVar.c;
        j jVar4 = jVar3.f9989b;
        j jVar5 = jVar3.c;
        jVar.c = jVar4;
        if (jVar4 != null) {
            jVar4.f9988a = jVar;
        }
        d(jVar, jVar3);
        jVar3.f9989b = jVar;
        jVar.f9988a = jVar3;
        int iMax = Math.max(jVar2 != null ? jVar2.i : 0, jVar4 != null ? jVar4.i : 0) + 1;
        jVar.i = iMax;
        jVar3.i = Math.max(iMax, jVar5 != null ? jVar5.i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        i iVar = this.f9995g;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(this, 0);
        this.f9995g = iVar2;
        return iVar2;
    }

    public final void f(j jVar) {
        j jVar2 = jVar.f9989b;
        j jVar3 = jVar.c;
        j jVar4 = jVar2.f9989b;
        j jVar5 = jVar2.c;
        jVar.f9989b = jVar5;
        if (jVar5 != null) {
            jVar5.f9988a = jVar;
        }
        d(jVar, jVar2);
        jVar2.c = jVar;
        jVar.f9988a = jVar2;
        int iMax = Math.max(jVar3 != null ? jVar3.i : 0, jVar5 != null ? jVar5.i : 0) + 1;
        jVar.i = iMax;
        jVar2.i = Math.max(iMax, jVar4 != null ? jVar4.i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        j jVarA;
        if (obj != null) {
            try {
                jVarA = a(obj, false);
            } catch (ClassCastException unused) {
                jVarA = null;
            }
        } else {
            jVarA = null;
        }
        if (jVarA != null) {
            return jVarA.h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        i iVar = this.h;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(this, 1);
        this.h = iVar2;
        return iVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f9993b) {
            throw new NullPointerException("value == null");
        }
        j jVarA = a(obj, true);
        Object obj3 = jVarA.h;
        jVarA.h = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        j jVarA;
        if (obj != null) {
            try {
                jVarA = a(obj, false);
            } catch (ClassCastException unused) {
                jVarA = null;
            }
        } else {
            jVarA = null;
        }
        if (jVarA != null) {
            c(jVarA, true);
        }
        if (jVarA != null) {
            return jVarA.h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f9994d;
    }
}
