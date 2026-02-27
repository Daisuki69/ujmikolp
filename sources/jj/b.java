package jj;

import cj.AbstractC1117c;
import java.io.Serializable;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends AbstractC1117c implements InterfaceC1685a, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Enum[] f17822a;

    public b(Enum[] entries) {
        j.g(entries, "entries");
        this.f17822a = entries;
    }

    @Override // cj.AbstractC1115a, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum element = (Enum) obj;
        j.g(element, "element");
        int iOrdinal = element.ordinal();
        Enum[] enumArr = this.f17822a;
        j.g(enumArr, "<this>");
        return ((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == element;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC1117c.a aVar = AbstractC1117c.Companion;
        Enum[] enumArr = this.f17822a;
        int length = enumArr.length;
        aVar.getClass();
        AbstractC1117c.a.b(i, length);
        return enumArr[i];
    }

    @Override // cj.AbstractC1115a
    public final int getSize() {
        return this.f17822a.length;
    }

    @Override // cj.AbstractC1117c, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        j.g(element, "element");
        int iOrdinal = element.ordinal();
        Enum[] enumArr = this.f17822a;
        j.g(enumArr, "<this>");
        if (((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == element) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // cj.AbstractC1117c, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        j.g(element, "element");
        return indexOf(element);
    }
}
