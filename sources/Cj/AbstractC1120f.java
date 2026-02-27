package cj;

import java.util.AbstractCollection;
import java.util.Collection;
import rj.InterfaceC2211b;

/* JADX INFO: renamed from: cj.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1120f extends AbstractCollection implements Collection, InterfaceC2211b {
    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }
}
