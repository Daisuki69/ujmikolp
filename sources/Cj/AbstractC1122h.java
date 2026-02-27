package cj;

import java.util.AbstractSet;
import java.util.Set;
import rj.InterfaceC2211b;

/* JADX INFO: renamed from: cj.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1122h extends AbstractSet implements Set, InterfaceC2211b {
    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return a();
    }
}
