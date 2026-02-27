package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1209x extends AbstractC1188b implements InterfaceC1210y, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f10134b;

    static {
        new C1209x();
    }

    public C1209x(ArrayList arrayList) {
        super(true);
        this.f10134b = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        a();
        this.f10134b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC1188b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f10134b.size(), collection);
    }

    @Override // com.google.protobuf.InterfaceC1210y
    public final void b(C1192f c1192f) {
        a();
        this.f10134b.add(c1192f);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC1188b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.f10134b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        List list = this.f10134b;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof C1192f)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, AbstractC1207v.f10124a);
            b0 b0Var = r0.f10123a;
            if (r0.f10123a.c(bArr, 0, bArr.length) == 0) {
                list.set(i, str2);
            }
            return str2;
        }
        C1192f c1192f = (C1192f) obj;
        c1192f.getClass();
        Charset charset = AbstractC1207v.f10124a;
        if (c1192f.size() == 0) {
            str = "";
        } else {
            str = new String(c1192f.f10092b, c1192f.d(), c1192f.size(), charset);
        }
        int iD = c1192f.d();
        if (r0.f10123a.c(c1192f.f10092b, iD, c1192f.size() + iD) == 0) {
            list.set(i, str);
        }
        return str;
    }

    @Override // com.google.protobuf.InterfaceC1210y
    public final Object getRaw(int i) {
        return this.f10134b.get(i);
    }

    @Override // com.google.protobuf.InterfaceC1210y
    public final List getUnderlyingElements() {
        return Collections.unmodifiableList(this.f10134b);
    }

    @Override // com.google.protobuf.InterfaceC1210y
    public final InterfaceC1210y getUnmodifiableView() {
        return this.f10078a ? new j0(this) : this;
    }

    @Override // com.google.protobuf.InterfaceC1206u
    public final InterfaceC1206u mutableCopyWithCapacity(int i) {
        List list = this.f10134b;
        if (i < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(list);
        return new C1209x(arrayList);
    }

    @Override // com.google.protobuf.AbstractC1188b, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        Object objRemove = this.f10134b.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof C1192f)) {
            return new String((byte[]) objRemove, AbstractC1207v.f10124a);
        }
        C1192f c1192f = (C1192f) objRemove;
        c1192f.getClass();
        Charset charset = AbstractC1207v.f10124a;
        if (c1192f.size() == 0) {
            return "";
        }
        return new String(c1192f.f10092b, c1192f.d(), c1192f.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        Object obj2 = this.f10134b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof C1192f)) {
            return new String((byte[]) obj2, AbstractC1207v.f10124a);
        }
        C1192f c1192f = (C1192f) obj2;
        c1192f.getClass();
        Charset charset = AbstractC1207v.f10124a;
        if (c1192f.size() == 0) {
            return "";
        }
        return new String(c1192f.f10092b, c1192f.d(), c1192f.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10134b.size();
    }

    public C1209x() {
        super(false);
        this.f10134b = Collections.EMPTY_LIST;
    }

    @Override // com.google.protobuf.AbstractC1188b, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        if (collection instanceof InterfaceC1210y) {
            collection = ((InterfaceC1210y) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.f10134b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    public C1209x(int i) {
        this(new ArrayList(i));
    }
}
