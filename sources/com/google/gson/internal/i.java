package com.google.gson.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f9987b;

    public /* synthetic */ i(k kVar, int i) {
        this.f9986a = i;
        this.f9987b = kVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f9986a) {
            case 0:
                this.f9987b.clear();
                break;
            default:
                this.f9987b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        j jVarA;
        switch (this.f9986a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                k kVar = this.f9987b;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                j jVar = null;
                if (key != null) {
                    try {
                        jVarA = kVar.a(key, false);
                    } catch (ClassCastException unused) {
                        jVarA = null;
                    }
                    break;
                } else {
                    jVarA = null;
                }
                if (jVarA != null && Objects.equals(jVarA.h, entry.getValue())) {
                    jVar = jVarA;
                }
                return jVar != null;
            default:
                return this.f9987b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f9986a) {
            case 0:
                return new h(this.f9987b, 0);
            default:
                return new h(this.f9987b, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        j jVarA;
        switch (this.f9986a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    k kVar = this.f9987b;
                    Object key = entry.getKey();
                    j jVar = null;
                    if (key != null) {
                        try {
                            jVarA = kVar.a(key, false);
                        } catch (ClassCastException unused) {
                            jVarA = null;
                        }
                    } else {
                        jVarA = null;
                    }
                    if (jVarA != null && Objects.equals(jVarA.h, entry.getValue())) {
                        jVar = jVarA;
                    }
                    if (jVar != null) {
                        kVar.c(jVar, true);
                        break;
                    }
                    break;
                }
                break;
            default:
                k kVar2 = this.f9987b;
                j jVarA2 = null;
                if (obj != null) {
                    try {
                        jVarA2 = kVar2.a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (jVarA2 != null) {
                    kVar2.c(jVarA2, true);
                }
                if (jVarA2 != null) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f9986a) {
        }
        return this.f9987b.f9994d;
    }
}
